package text.section_17;

public class Prctice_main {

	public static void main(String[] args) {
		
		Prctice_dog dog = new Prctice_dog("ポチ" ,3);
		Prctice_cat cat = new Prctice_cat("たま" ,2);

		
		System.out.println("---登録された動物たち---");
		
		dog.showInfo();
		dog.makeSound();
		
		cat.showInfo();
		cat.makeSound();
	}

}
