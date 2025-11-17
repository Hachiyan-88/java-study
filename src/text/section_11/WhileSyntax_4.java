package text.section_11;

public class WhileSyntax_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int dice = 1;
		
		while( dice != 1) {
			
			dice = (int)(Math.ceil( Math.random() *6));
			System.out.println("[while]さいころの出目は" + dice);
		}
		
		do {
			
			dice = (int)(Math.ceil( Math.random() *6));
			System.out.println("[do-while]さいころの出目は" + dice);
		} while( dice != 1 );

	}

}

/*do-while文とは、「最初の1回だけは必ず」反復処理を実行するwhile文
 最後にセミコロン（;）が必要な点に注意
 
 件式がfalseでも最低1回は反復処理を実行します
 */
