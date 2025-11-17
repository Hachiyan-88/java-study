package text.section_08;

public class IfSyntax_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		 // 0～9のいずれかをランダムに生成
		int randNum = (int)(Math.random() * 10);
		
		//randNumの値を出力
		System.out.println(randNum);
		
		//当たりはずれの判定
		if(randNum == 9) {
			System.out.println("大当たり");
		} else {
			System.out.println("はずれ");
		}

	}

}
