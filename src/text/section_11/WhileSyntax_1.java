package text.section_11;

public class WhileSyntax_1 {

	public static void main(String[] args) {
		int dice =1;
		
//さいころが6を出すまで降り続ける
		while( dice != 6) {
			dice = (int)(Math.ceil( Math.random() *6)); //randomでさいころの出目を生成
			System.out.println("dice number " + dice );
		}
		

	}

}
/*決まった回数だけ繰り返すならfor文
  繰り返す回数が決まっていないケースではwhile文
  
  while文は、ある条件を満たす限り、同様の処理を繰り返し行う構文
  条件式がtrue（成り立つ）である限り{ }内の反復処理を繰り返し、false（成り立たない）になった時点で終了
  
  繰り返し回数が決まっておらず、状況により変わる場合はwhile文が便利
  ループカウンタで決まった回数だけ繰り返すなら、for文
*/
