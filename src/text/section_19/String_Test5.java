package text.section_19;

public class String_Test5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String moji1 = "あいう,かきく,さしす,たちつ";
		
		String[] array1 = moji1.split(",");
		
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}

	}

}
//split()メソッドは指定した文字列で分割し、分割後の文字列を返します
/*用法	実行結果
split(分割する文字列)	分割する文字列で分割した結果が配列で返される
split(分割する文字列,分割する数)	指定した分割する数に、分割する文字列を分割した結果が配列で返される*/