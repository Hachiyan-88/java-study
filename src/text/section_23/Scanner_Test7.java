package text.section_23;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner_Test7 {

	//mainの部分の変更を忘れない
	public static void main(String[] args) throws FileNotFoundException {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scanner = new Scanner(new File("src/text/section_23/file.txt"));
		
		while(scanner.hasNext()) {
			
			String input = scanner.nextLine();
			System.out.println(input);
		}
		
		scanner.close();
	}

}


/*

ファイルから入力を受け取る場合、Scannerクラスのオブジェクトを生成する時にFileオブジェクトを渡しましょう
Scanner Scannerクラスのオブジェクト = new Scanner(new File(ファイルパス))

new File(ファイルパス)と書くことで、Fileオブジェクトが生成されます。

ファイルの内容が複数行に渡る場合、ScannerクラスのhasNextメソッドを使ってまだ読み込みが続くか判定しましょう
Scannerクラスのオブジェクト.hasNext()


*/