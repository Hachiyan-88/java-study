package text.section_19;

public class String_Test6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String moji2 = "なにぬ,まみむ,やゆよ,わをん";
		
		String[] array2 = moji2.split(",",3);
		
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}

	}

}

//分割する数を3と指定して実行しています。このため、実行結果は3回分のみ分割されました。


//split()メソッドは指定した文字列で分割し、分割後の文字列を返します
/*用法	実行結果
split(分割する文字列)	分割する文字列で分割した結果が配列で返される
split(分割する文字列,分割する数)	指定した分割する数に、分割する文字列を分割した結果が配列で返される*/