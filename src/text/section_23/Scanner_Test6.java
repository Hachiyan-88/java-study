package text.section_23;

import java.util.Scanner;

public class Scanner_Test6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		
		scanner.useDelimiter(",");
		
		String input = scanner.next();
		
		System.out.println(input);
		
		scanner.close();

	}

}


/*
Scannerクラスのデフォルトの区切り文字は空白文字
「,(カンマ)」を区切り文字として指定します。「,(カンマ)」を区切り文字として指定する場合
Scannerクラスのオブジェクト.useDelimiter(",");
*/