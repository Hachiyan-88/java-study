package text.section_12;

public class Array_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		// 配列を作成
				boolean[] primeNumber = new boolean[101];

				// 配列の初期化
				for (int i = 0; i < primeNumber.length; i++) {
					primeNumber[i] = true;
				}

				// 素数判定
				int divide = 2;
				while (divide < primeNumber.length) {
					for (int i = divide + 1; i < primeNumber.length; i++) {
						if (i % divide == 0) {
							primeNumber[i] = false;
						}
					}
					divide++;
				}

				// 素数の出力
				for (int i = 2; i < primeNumber.length; i++) {
					if (primeNumber[i]) {
						System.out.println(i);
					}
				}
		
		

	}

}
//演習答え
