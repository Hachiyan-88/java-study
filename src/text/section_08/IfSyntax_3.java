package text.section_08;

public class IfSyntax_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int randNum = (int)(Math.random()* 10);
		
		System.out.println(randNum);
		
		if( randNum == 9) {
			System.out.println("big");
		} else if( randNum == 8) {
			System.out.println("super big");
		} else {
			System.out.println("reg");
		}

	}

}


/*if( 条件式A ) {
    条件式Aがtrue（真）のときの処理
} else if( 条件式B ) {
    条件式Aはfalse（偽）だが、条件式Bはtrue（真）のときの処理
} else {
    条件式Aも条件式Bもfalse（偽）のときの処理
}*/