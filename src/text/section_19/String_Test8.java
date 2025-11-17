package text.section_19;

public class String_Test8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String moji1 = "     あい　うえお";
		String moji2 = "\n\tかき\tくけこ\n";
		
		System.out.println(moji1.trim());
		
		System.out.println(moji2.trim());

	}

}

//trim()メソッドは文字列の先頭と末尾の空白を削除して返します
//文字列の先頭と末尾にある水平タブや改行のように不要なものも削除します。

//trim()メソッドの呼び出しでは、実行結果の通り文字列に囲われた空白は削除されません

//「\n」「\t」などのエスケープシーケンスを使用しています。
//エスケープシーケンスとは改行や水平タブを表す文字列のことです