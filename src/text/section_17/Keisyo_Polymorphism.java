package text.section_17;

public class Keisyo_Polymorphism {
	
	public static void main(String[] args) {
		
		Keisyo_Human7 kato = new Keisyo_Kato7();
		
		Keisyo_Human7 tanaka = new Keisyo_Tanaka7();
		
		kato.output();
		
		tanaka.output();
	}
}