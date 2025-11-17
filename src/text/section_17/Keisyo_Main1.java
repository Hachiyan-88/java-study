package text.section_17;

public class Keisyo_Main1 {
	
	public static void main(String[] args) {
		
		Keisyo_Kato1 kato = new Keisyo_Kato1();
		
		kato.weight = 70.0;
		
		kato.height = 1.6;
		
		double bmi = kato.calcBmi();
		
		System.out.println("bmiは" + bmi);
	}

}
