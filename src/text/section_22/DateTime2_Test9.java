package text.section_22;

import java.time.LocalDateTime;
import java.time.Period;

public class DateTime2_Test9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		LocalDateTime dateTime1 = LocalDateTime.of(1990, 01, 10, 02, 30, 40);
		LocalDateTime dateTime2 = LocalDateTime.of(2000, 03, 20, 03, 40, 50);
		
		Period period = Period.between(dateTime1.toLocalDate(), dateTime2.toLocalDate());
		
	    System.out.println( "年の差分は" + period.getYears() + "年");
	    System.out.println( "月の差分は" + period.getMonths() + "月");
	    System.out.println( "日の差分は" + period.getDays() + "日");
	}	

}
//日付の差分を求める場合
//Period.between(取得した日時.toLocalDate(), 差分を求める日時.toLocalDate());

//Periodクラスのbetweenメソッドは引数に渡した2つの日付の差分
//toLocalDate()により、日時から日付に当たる部分を抽出しています。

//取得した日付の日を減算する場合
//取得した日付.minusDays(減算する日数)