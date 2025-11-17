package text.section_06;

public class TypeConv_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int distance = 120; //距離
		int time = 25; //時間
		
		//距離と所要時間から速度を計算
		float speed = (float)distance / (float)time;
		System.out.println("速度"+ speed + "m/秒");
		
		/*変数distanceと変数timeを浮動小数点型のfloat型にキャストしています。
		 * こうすることで計算結果もfloat型として扱われ、小数部分がカットされないのです。*/
		

	}

}
