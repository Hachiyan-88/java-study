package text.section_08;

public class IfSyntax_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//0-9のいずれかをランダムに生成（乱数を10にして小数部分を切り捨て）
		 int randNum = (int)(Math.random() * 10);
		
		// 乱数randNumの値を出力
		System.out.println(randNum);
		
		//当たりはずれの判定
		if( randNum == 9) {
			System.out.println("大当たりです");
		}

	}

}


/*比較演算子	処理の内容
==	2つの値が等しい場合はtrueを返す（等価演算子）。
!=	2つの値が等しくない場合はtrueを返す。
>	左辺の値が右辺の値よりも大きい場合はtrueを返す。
>=	左辺の値が右辺の値以上の場合はtrueを返す。
<	左辺の値が右辺の値よりも小さい場合はtrueを返す。
<=	左辺の値が右辺の値以下の場合はtrueを返す。*/

//浮動小数点型のデータをそのまま比較するのはNG
