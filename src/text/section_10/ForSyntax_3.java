package text.section_10;

public class ForSyntax_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		for( int i = 1; i < 11; i++ ) {
			
			if(i == 3) {
			System.out.println("nest fase");
			continue;
			}
			
			System.out.println(i);
		}

	}

}
/*continue文は、繰り返し処理の途中で中断し、次のループに進む命令
continue文もbreak文と同様に、以下の1行を書くだけで使えます


 */