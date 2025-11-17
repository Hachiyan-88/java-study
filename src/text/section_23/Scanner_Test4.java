package text.section_23;

import java.util.Scanner;

public class Scanner_Test4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		
		double input = scanner.nextDouble();
		
		System.out.println("入力したのは" + input);
		
		scanner.close();

	}

}


/*
double型の数値の入力を受け取る場合
Scannerクラスのオブジェクト.nextDouble();
なお、小数または整数以外の値が入力された際は例外が発生します
*/