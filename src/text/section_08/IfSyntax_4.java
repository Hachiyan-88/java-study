package text.section_08;

public class IfSyntax_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int randNum = (int)(Math.random() * 4);
		
		System.out.println(randNum);
		
		//randNumが1より大きいかつ3より小さい
		if((1 < randNum) && (randNum <3)) {
			System.out.println("randNumは1より大きい、かつ3より小さい");
		} else {
			System.out.println("and条件が成り立たない");
		}
		
		//randNumが1に等しいもしくは3に等しい
		if((randNum == 1) || (randNum == 3)) {
			System.out.println("randNumは１、または３");
		} else {
			System.out.println("or条件が成り立たない");
		}
	}

}
/*論理演算子	処理の内容
&&	条件式2つがともに成り立てばtrueを返す（AかつB）。
||	条件式2つの片方でも成り立てばtrueを返す（AまたはB）。*/

