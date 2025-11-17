package text.section_19;

public class String_Test4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
	      String moji1 = "あいうえおかきくけこ";

	      //開始位置のみ指定する
	      System.out.println(moji1.substring(3));
	      //開始位置と終了位置を指定する
	      System.out.println(moji1.substring(3,5));

	}

}
//substring()メソッドは、指定した位置の文字列を切り出して返します
/*用法	実行結果
substring(開始位置)	開始位置以降の文字列が切り出される
substring(開始位置,終了位置)	開始位置から終了位置までの文字列が切り出される*/