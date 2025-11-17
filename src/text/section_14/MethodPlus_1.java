package text.section_14;

public class MethodPlus_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//1000円を送料込みの料金にして表示
		addPostage(1000);
		
		//1200円を送料込みにして表示
		addPostage(1200);
		

	}
	
	//送料を追加した料金を表示するメソッド
	public static void addPostage( final int price ) {
		int total = price + 500; //送料を加算
		System.out.println("送料込みの料金は" + total + "円です");
	}

}
/*メソッドとは、一連の処理をひとまとめにして、何度でも再利用できるようにする仕組みのことでした。
 
 引数（ひきすう） とは、メソッドに与えるデータのことです。
 引数という形でメソッドに与えたデータは、メソッド内の処理で利用できます。
 
 値が変わるデータを処理に使いたい場合には、引数が必要
 
 変更しないならfinalを付けましょう
 
 
 */