package text.section_22;

import java.time.LocalDate;

public class DateTime2_Test1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		LocalDate date1 = LocalDate.now();
		
		System.out.println(date1);
		
		
		LocalDate date2 = LocalDate.of(1990, 1, 2);
		
		System.out.println(date2);

	}

}
//LocalDateクラスを活用すると、日付が取得できます

//LocalDate.of(指定する年, 指定する月, 指定する日)

//LocalDate.now() 今日