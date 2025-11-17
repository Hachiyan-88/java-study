package text.section_09;

public class SwitchSyntax_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int randNum = (int)(Math.random() * 10);
		
		System.out.println(randNum);
		
		switch(randNum) {
		case 0,9 -> {
			System.out.println("superbig");
			System.out.println("super like");
		}
		case 1,8 -> System.out.println("big");
		default  -> System.out.println("reg");
		}

	}

}

//switch文の条件分岐により導き出された値を、計算式のように返せる構文