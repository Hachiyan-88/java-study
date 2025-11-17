package text.section_19;

/*equals()メソッドは、文字列が等しいか判定した結果を返します。
文字列が等しい場合はtrueを戻り値として返し、等しくない場合はfalseを戻り値として返します。
*/

public class String_Test1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String moji1 = "テスト";
		String moji2 = "テスト";
		String moji3 = "サンプル";
		
		System.out.println(moji1.equals(moji2));
		
		System.out.println(moji1.equals(moji3));

	}

}

/*等価演算子は2つのインスタンスが同じかどうかを比較するので、文字列を比較するわけではありません。


equals()メソッド	2つのインスタンスの内容が同じかを比較する
等価演算子(==)	2つのインスタンスが同じかを比較する

*/
