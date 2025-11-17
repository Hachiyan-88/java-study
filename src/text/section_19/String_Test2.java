package text.section_19;

/*
 compareTo()メソッドは、文字列が等しいか、大きいか、小さいか比較した結果を返します。
 
 判定結果	戻り値
文字列が等しい	0
比較元の文字列が比較先の文字列より大きい値	正の値
比較元の文字列が比較先の文字列より小さい値	負の値

 */

public class String_Test2 {
		
		public static void main(String[] args) {
		    String moji1 = "かきく";
		    String moji2 = "かきく";
		    String moji3 = "あいう";
		    String moji4 = "さしす";

		    Integer val1 = 5;
			Integer val2 = 5;
			Integer val3 = 1;
			Integer val4 = 7;

			String moji5 = "ああああ";
			String moji6 = "あああ";
			String moji7 = "いいい";
			String moji8 = "いいいい";

		      //文字列を比較する場合
			System.out.println("文字列を比較する場合");
			System.out.println(moji1.compareTo(moji2));
			System.out.println(moji1.compareTo(moji3));
			System.out.println(moji1.compareTo(moji4));
			   
			//数値を比較する場合
			System.out.println("数値を比較する場合");
			System.out.println(val1.compareTo(val2));
			System.out.println(val1.compareTo(val3));
			System.out.println(val1.compareTo(val4));

		      //文字数が異なる場合
			System.out.println("文字数が異なる場合");
			System.out.println(moji5.compareTo(moji6));
			System.out.println(moji7.compareTo(moji8));


	}

}


