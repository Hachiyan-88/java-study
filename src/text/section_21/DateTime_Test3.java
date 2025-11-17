package text.section_21;

import java.text.SimpleDateFormat;
import java.util.Date;


//SimpleDateFormatクラスは、Dateクラスのフォーマットを指定することができます。
public class DateTime_Test3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		//①
		Date date = new Date();
		//②
		SimpleDateFormat format = new SimpleDateFormat();
		//③
		System.out.println(format.format(date));
	}

}


/*デフォルトのフォーマットを指定する場合は次の順序で行います。

①Dateクラスを使い日時を取得する。
②SimpleDateFormatクラスのコンストラクタを引数無しで実行し、SimpleDateFormatクラスのオブジェクトを生成する。
③1で取得した日時を、2で生成したSimpleDateFormatクラスのオブジェクトでフォーマットする。

*/
 
 