package text.section_22;

import java.time.LocalDateTime;

public class DateTime2_Test6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		LocalDateTime dateTime1 = LocalDateTime.of(1999, 01, 10, 02, 30, 40);
		LocalDateTime dateTime2 = LocalDateTime.of(2000, 02, 20, 03, 40, 50);
		LocalDateTime dateTime3 = LocalDateTime.of(1999, 01, 10, 02, 30, 40);
		
		if (dateTime1.isAfter(dateTime2)) {
			System.out.println("火付けが比較対象より後の日付です");
		}
		
		if (dateTime1.isBefore(dateTime2)) {
			System.out.println("日付が比較対象より前の日付です");
		}
		
		if (dateTime1.isEqual(dateTime3)) {
			System.out.println("日付が比較対象の日付です");
		}
	}

}
/*日時は、次のメソッドを使用して比較することができます。

メソッド	機能
isAfter	日付が比較対象の日付より後の日付か判定する
isBefore	日付が比較対象の日付より前の日付か判定する
isEqual	日付が比較対象の日付と等しいか判定する

dateTime1の日付は、dateTime2の日付より前の日付です。
このため、「日付が比較対象の日付より後の日付です」の出力はされません。
「日付が比較対象の日付より前の日付です」の出力がされました。

また、dateTime1の日付は、dateTime3の日付と同じ日付です。
このため、「日付が比較対象の日付と同じ日付です」の出力がされました。

*/