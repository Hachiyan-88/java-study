package text.section_15;

public class ClassStudy {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Product shampoo = new Product( "シャンプー", 800, 10 );
		Product coffee = new Product( "コーヒー", 500, 5 );
		
		shampoo.takeOrder(7);
		
		coffee.takeOrder(3);
		
		shampoo.takeOrder(5);

	}

}
