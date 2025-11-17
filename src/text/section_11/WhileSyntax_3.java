package text.section_11;

public class WhileSyntax_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int dice = 1;
		int sum = 0;
		
		while( sum < 10) {
			
			dice = (int)(Math.ceil(Math.random()*6 ));
			System.out.println("dice number"+ dice);
			
			
			if( dice == 4) {
				System.out.println("4 not +");
				continue;
			}
			
			sum += dice;
			System.out.println(dice + "を加算：現在の合計は" + sum);
		}
		
		System.out.println("最終合計は" + sum);
		

	}

}
