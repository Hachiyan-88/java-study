package text.section_04;

public class Data_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        System.out.println("侍テラコヤ" + 123 + 654); 
        System.out.println(123 + 654 + "侍テラコヤ"); 
        //後ろの計算を先に行いたいときは( )ではさむ
        System.out.println("侍テラコヤ" + (123 + 654) ); // (123 + 654)が先に計算される
        
//演習問題
/*テストの平均点を出力するJavaプログラムを作成してください。

5人がテストを受け、それぞれの点数は表の通りとします。

テストを受けた人	点数
Aさん	100点
Bさん	90点
Cさん	80点
Dさん	70点
Eさん	30点
TestAverageクラスを定義し、5人の点数の平均を計算しましょう。

以下のように出力してください。

実行結果：

テストの平均点: 74点*/
        
        System.out.println("テストの平均点:"+(100+90+80+70+30)/5 +"点");

	}

}
