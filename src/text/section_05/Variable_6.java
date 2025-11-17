package text.section_05;

public class Variable_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		final double PI = 3.14159; //円周率
		double circleArea = 0, circumference = 0; //円の面積・円周
		int radius = 5;	//円の半径
		
		//データ型の同じ変数は「,」を用いてまとめて宣言・初期化が可能
		
		//円の面積を求める
		circleArea = PI * radius * radius;
		System.out.println(circleArea);
		
		//円周を求める
		circumference = PI * (radius * 2);
		System.out.println(circumference);
		

	}

}

/*使える文字・使えない文字を把握しましょう。
 Javaの変数名に使える文字は、以下の3種類です。これらを組み合わせることもできます。

半角英字（a～z、A～Z）
半角数字（0～9）
アンダースコア（_）*/

/*以下の文字は変数名には使えず、エラーとなります。

変数名の先頭に数字（例：3testなど）
アンダースコア以外の記号（例：test@や&testなど）
予約語と同名（例：boolean、finalなど）*/
