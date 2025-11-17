package text.section_23;

import java.util.Scanner;

public class Scanner_Test2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		System.out.println(input);
		
		scanner.close();

	}

}


/*
入力した内容は改行を区切りとして取得することができます
改行を区切りとして入力を受け取る場合
Scannerクラスのオブジェクト.nextLine();

*/