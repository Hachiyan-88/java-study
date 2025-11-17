package text.section_06;

public class TypeConv_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		//小数点以下を切り捨てたい
		int price = 298;
		double tax = 0.1;	//消費税
		
		//税込み価格を計算
		int charge = (int)(price+(price * tax));
		System.out.println("料金"+charge+"円");

	}

}


//キャストは「数値同士」の変換にだけ使える
