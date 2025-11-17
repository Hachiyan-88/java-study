package text.section_23;

import java.util.Scanner;

public class Scanner_Test1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.next();
		
		System.out.println(input);
		
		scanner.close();

	}

}


/*メソッド		用途
next      		区切り文字までの入力を取得する(デフォルトの区切り文字は空白)
nextLine			改行までの入力を取得する
nextInt			整数の入力を取得する
nextDouble		小数点を含む数値の入力を取得する
nextBoolean		真偽値の入力を取得する
useDelimiter		区切り文字を指定する
hasNext			入力の読み込みが続くか判定する

入力した内容は空白文字を区切り文字として取得する
Scanner Scannerクラスのオブジェクト = new Scanner(System.in)

空白文字を区切り文字として入力を取得する場合
Scannerクラスのオブジェクト.next();

入力を受ける処理が終わったら、以下の書式でScannerクラスのオブジェクトをクローズします
Scannerクラスのオブジェクト.close();

*/