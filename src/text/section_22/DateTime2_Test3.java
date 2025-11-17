package text.section_22;

import java.time.LocalDateTime;

public class DateTime2_Test3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		LocalDateTime datetime1 = LocalDateTime.now();
		
		System.out.println(datetime1);
		
		
		LocalDateTime datetime2 = LocalDateTime.of(1999,1,2,3,10,20);
		
		System.out.println(datetime2);
	}

}

//LocalDateTimeクラスを活用して、日時が取得できます

//LocalDateTime.now() 今

//LocalDateTime.of(指定する年, 指定する月, 指定する日, 指定する時, 指定する分, 指定する秒)

//「T」より前が日付を表し、「T」より後が時刻

/*クラス	特徴
LocalDate	日付のみ扱うことができる
LocalTime	時刻のみ扱うことができる
LocalDateTime	日付と時刻を扱うことができる*/