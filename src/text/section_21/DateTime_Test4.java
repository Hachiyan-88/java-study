package text.section_21;

import java.text.SimpleDateFormat;
import java.util.Date;


//SimpleDateFormatクラスは、Dateクラスのフォーマットを指定することができます。
public class DateTime_Test4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		//①
		Date date = new Date();
		//②
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		//③
		System.out.println(format.format(date));
	}

}


/*特定のフォーマットを指定する場合は次の順序で行います。

①Dateクラスを使い日時を取得する。
②SimpleDateFormatクラスのコンストラクタの引数に、特定のフォーマットを渡して実行する。その結果、SimpleDateFormatクラスのオブジェクトを生成する。
③1で取得した日時を、2で生成したSimpleDateFormatクラスのオブジェクトでフォーマットする。

*/
 
 