package text.section_09;

public class SwitchSyntax_5 {

	public static void main(String[] args) {
	    int ageGroup = 30;
		int price;
		
		price = switch (ageGroup) {
		case 10 -> 1000;
		case 20 -> 2000;
		case 30,40 -> 3000;
		case 50 -> 4000;
		default -> 500;
		};
		
		System.out.println(ageGroup + "代の料金は" + price + "円");
		}
	}

//演習