package text.section_12;

public class Array_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int[] scores = { 72, 88, 91, 65, 79 };

		int sum = 0;
		for (int score : scores) {
		    sum += score;
		}

		double avg = (double) sum / scores.length;
		System.out.println("平均点: " + avg);

		

	}

}
//演習答え
