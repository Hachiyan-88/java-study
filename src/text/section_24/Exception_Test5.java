package text.section_24;

public class Exception_Test5 {

	public static void main(String[] args) {
		//体重を表す変数
		double weight = -10.0;
		if (weight < 0) {
			throw new IllegalArgumentException(
					"体重は入力された" + weight + "のようにマイナスの値になりません");
		}
	}

}
/*

throw new 意図的に発生させる例外クラス

throwは、任意の場所で例外処理をしたい場合などに使います。

IllegalArgumentExceptionは本来、メソッドの引数に不正な引数が渡された場合に発生する例外です。
ここでは、体重を表す変数にマイナスの値が代入された場合に、意図的にIllegalArgumentExceptionを発生させました。
*/