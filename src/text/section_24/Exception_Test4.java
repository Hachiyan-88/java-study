package text.section_24;

import java.util.Scanner;

public class Exception_Test4 {

	public static void main(String[] args) {
		System.out.println("入力しましょう");

		String input = null;

		//Scannerクラスのオブジェクトを生成する
		try (Scanner scanner = new Scanner(System.in)) {
			//入力した内容を取得する
			input = scanner.next();
		};

		//入力した内容を出力する
		System.out.println("入力した内容は" + input);

	}

}
/*

try(リソースとなるオブジェクトの生成){
   リソースとなるオブジェクトによる処理
}

try-with-resource文は、例外の有無に関わらずリソースを自動的にクローズする場合に使用します

*/