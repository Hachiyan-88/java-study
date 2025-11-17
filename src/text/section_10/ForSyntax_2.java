package text.section_10;

public class ForSyntax_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		for(int i = 1; i <11; i++ ) {
			System.out.println(i);
			
			if( i == 5 ) {
				System.out.println("stop");
				break;
			}
		}

	}

}

//繰り返し処理には、「無限ループ」　の危険性があります
/*無限ループは、この条件式が常にtrueとなってしまう（falseにならない）ことで発生します。
  
--想定のタイミングで条件式がfalseになるかシミュレーションする
--反復処理の中でループカウンタを書き換えない

break文は、for文やswitch文といった構文を強制終了させる命令

 */
