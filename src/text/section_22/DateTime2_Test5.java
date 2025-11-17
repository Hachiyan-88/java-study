package text.section_22;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime2_Test5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		LocalDateTime datetime = LocalDateTime.of(1999, 1,2,5,10,20);
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		
		String afterFormat = datetime.format(formatter);
		
		System.out.println(afterFormat);
	}

}
/*DateTimeFormatter()クラスは次の手順で活用できます。

LocalDateTimeクラスを使い日時を取得する
指定するフォーマットでDateTimeFormatterクラスのオブジェクトを生成する
1で取得した日時を、2で生成したDateTimeFormatterクラスのオブジェクトでフォーマットする*/


//DateTimeFormatter DateTimeFormatterクラスのオブジェクト = DateTimeFormatter.ofPattern(指定するフォーマット);

//取得した日時.format(生成したDateTimeFormatterクラスのオブジェクト)