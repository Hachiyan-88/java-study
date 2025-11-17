package text.section_09;

public class SwitchSyntax_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int randNum = (int)(Math.random() * 10);
		
		System.out.println(randNum);
		
		switch(randNum) {
		case 0,9 -> System.out.println("super big");
		case 1,8 -> System.out.println("big");
		default  -> System.out.println("reg");
		}

	}

}

//switch文であれば複数の条件を簡単に1つのcase句にまとめられます