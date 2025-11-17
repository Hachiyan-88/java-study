package text.section_22;

import java.time.LocalDate;

public class DateTime2_Test8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		LocalDate date1 = LocalDate.of(1999, 1, 2);
		
		
		System.out.println(date1);
		
		System.out.println("1年前は" + date1.minusYears(1));
		
		System.out.println("1月前は" + date1.minusMonths(1));
		
		System.out.println("5日前は" + date1.minusDays(5));
		
	}	

}
//取得した日付の年を減算する場合
//取得した日付.minusYears(減算する年数)

//取得した日付の月を減算する場合
//取得した日付.minusMonths(減算する月数)

//取得した日付の日を減算する場合
//取得した日付.minusDays(減算する日数)