package text.section_20;

public class Math_Test12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		for(int i = 0; i < 5 ; i++) {
			

		  //乱数の範囲で指定した5までの数値を四捨五入して出力する
			
			System.out.println(Math.round(Math.random() *5));
		}



	}

}

/*
 random()メソッドの実行結果をそのまま出力するのではなく、整数の形で出力することもできます
 roundメソッドとrandom()メソッドを組み合わせると整数で出力
 */