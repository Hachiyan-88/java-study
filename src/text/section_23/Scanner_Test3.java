package text.section_23;

import java.util.Scanner;

public class Scanner_Test3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		System.out.println("入力したのは" + input);
		
		scanner.close();

	}

}


/*
入力した内容を取得する場合に、文字列だけでなく数値を取得することができます
整数の入力を受け取る場合
Scannerクラスのオブジェクト.nextInt();
*/