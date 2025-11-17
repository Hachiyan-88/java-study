package text.section_22;

import java.time.LocalDateTime;

public class DateTime2_Test4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		LocalDateTime datetime = LocalDateTime.parse("1999-01-10T02:30:40");
		
		System.out.println(datetime);

	}

}
//文字列型の日時は、日時を扱うクラスの型に指定することができます

//日時の型は文字列型と日時を扱うクラスの型で相互に互換できます

//LocalDateTime 変数名 = LocalDateTime.parse(日付を表す文字列T時刻を表す文字列);