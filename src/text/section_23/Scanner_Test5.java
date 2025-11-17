package text.section_23;

import java.util.Scanner;

public class Scanner_Test5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		
		boolean input = scanner.nextBoolean();
		
		System.out.println("入力したのは" + input);
		
		scanner.close();

	}

}


/*
真偽値の入力を受け取る場合
Scannerクラスのオブジェクト.nextBoolean();

なお、真偽値以外の値が入力された際は例外が発生します
*/