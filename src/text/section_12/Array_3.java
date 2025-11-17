package text.section_12;

public class Array_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		int[] scoreArray = { 70,80,85,90,95 };
		
		
		for( int score : scoreArray ) {
			System.out.println(score);
		}

	}

}

//拡張for文は、配列などの各要素を順番に参照するために、for文をより単純化した構文

/*拡張for文のメリットは、主に以下の2つです。

要素外参照を防げる
無限ループを防げる

必ず存在する要素の範囲内で繰り返しが行われます
拡張for文は必ず要素数だけ繰り返されるため、無限ループの心配もありません。

*/