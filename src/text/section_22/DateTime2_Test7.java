package text.section_22;

import java.time.LocalDate;

public class DateTime2_Test7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		LocalDate date1 = LocalDate.of(1999, 1, 2);
		
		
		System.out.println(date1);
		
		System.out.println("1年後は" + date1.plusYears(1));
		
		System.out.println("1月後は" + date1.plusMonths(1));
		
		System.out.println("5日後は" + date1.plusDays(5));
		
	}	

}
//取得した日付の年を加算する場合
//取得した日付.plusYears(加算する年数)

//取得した日付の月を加算する場合
//取得した日付.plusMonths(加算する月数)

//取得した日付の日を加算する場合
//取得した日付.plusDays(加算する日数)