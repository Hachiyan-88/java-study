package calculator;

import java.util.Scanner;

public class CalculatorApp2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1つ目の整数を入力してください。:" );
		int a = scanner.nextInt();
		
		System.out.println("2つ目の整数を入力してください。:" );
		int b = scanner.nextInt();
		
		System.out.println("入力された値:" + a + "と" + b);
		
		scanner.close();
		
	}

}
