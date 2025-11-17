package calculator;

import java.util.Scanner;

public class CalculatorApp3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1つ目の整数を入力してください。:" );
		int a = scanner.nextInt();
		
		System.out.println("2つ目の整数を入力してください。:" );
		int b = scanner.nextInt();
		
		System.out.println("入力された値:" + a + "と" + b);
		
		System.out.println("/n計算方法を選んでください:");
		System.out.println("1:足し算");
		System.out.println("2:引き算");
		System.out.println("3:掛け算");
		System.out.println("4:割り算");
		System.out.println("→");
		int choice = scanner.nextInt();
		
		if(choice == 1) {
			System.out.println("結果:" + (a+b));
		} else if(choice == 2) {
			System.out.println("結果" + (a-b));
		} else if(choice == 3) {
			System.out.println("結果" + (a*b));
		} else if(choice == 4) {
			if(b == 0) {
				System.out.println("エラー:0で割ることはできません");
			}
			System.out.println("結果" + (a/b));
			
		} else {
			System.out.println("無効な選択です");
		}
		
		scanner.close();
		
	}

}
