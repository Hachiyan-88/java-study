package text.section_11;

public class WhileSyntax_2 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int dice = 1;
		int cnt = 0;
		
		//6出るまで振る
		while( dice != 6 ) {
			
			
			//5回以上繰り返したら終了
			if( 5 <= cnt) {
				System.out.println("5回に到達のため終了");
				break;
			}
			
			//さいころ振る
			dice = (int)( Math.ceil( Math.random() *6));
			System.out.println("さいころの出目は" + dice);
			
			//1回さいころ振ったので、繰り返し回数を1増加
			cnt++;
		}

	}

}

/*Math.ceil() は小数点以下を切り上げるメソド
  
  for文と同様に、while文での繰り返し処理にも無限ループの危険性があります
  while文は、意図しない無限ループも発生しやすいため注意が必要です。
  
--条件式がfalseになるかシミュレーションする
--万が一のときに備えて「抜け道」を検討する

  条件式で参照する変数を基本的に{ }内で書き換えなければなりません。
  break文によって繰り返し処理を強制終了できます

 */