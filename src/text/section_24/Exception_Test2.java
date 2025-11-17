package text.section_24;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Test2 {

	public static void main(String[] args) {
		System.out.println("整数を入力しましょう");

		//Scannerクラスのオブジェクトを生成する
		Scanner scanner = new Scanner(System.in);

		try {
			//入力した内容を取得する
			int input = scanner.nextInt();
			System.out.println(input);
		} catch (InputMismatchException e) {
			//整数の入力ではない場合に行う処理
			System.out.println("整数の入力ではありません");
		} finally {
			//Scannerクラスのオブジェクトをクローズする
			System.out.println("Scannerクラスのオブジェクトをクローズします");
			scanner.close();
		}

		System.out.println("処理終了です");
	}

}

/*
  
finally文は、例外の有無に関わらず実行されます。
このため、例外処理の後に必ず行う処理がある場合は、finally文を使います

 finally{
   例外が起きても、起きなくても行う処理
 }
例外が起きても、起きなくても実行する処理をfinally文
*/