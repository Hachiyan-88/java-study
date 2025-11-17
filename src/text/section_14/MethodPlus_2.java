package text.section_14;

public class MethodPlus_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		final int postage1 = 500;
		final int postage2 = 800;
		
		//1000円に送料１を加算して表示
		addPostage( 1000 , postage1);
		
		//1000円に送料２を加算して表示
		addPostage( 1000 , postage2);

	}
	
	public static void addPostage( final int price , final int postage ) {
		int total = price + postage;
		System.out.println("送料込みの料金は" + total + "円です");
	}

}

/*引数が複数ある場合は、カンマ（,）で区切って宣言
  
  
 */