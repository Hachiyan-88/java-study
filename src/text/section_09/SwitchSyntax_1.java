package text.section_09;

public class SwitchSyntax_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int randNum = (int)(Math.random() * 10);
		
		System.out.println(randNum);
		
		switch(randNum) {
		case 9 -> System.out.println("super big");
		case 8 -> System.out.println("big");
		default -> System.out.println("reg");
		}

	}

}

//switch文は、1つの変数をもとに条件分岐させる構文
//break文と呼ばれるもので、1つのcaseの処理が終わったときにswitch文を終わらせるために必要

