package text.section_14;

public class MethodPlus_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		test(123);
		test(1.23F);
		test(123,1.23F);
		test(1.23F,123);

	}
	public static void test( int i) {
		System.out.println("(1)int型:"  + i);
	}
	
	public static void test( float f) {
		System.out.println("(2)float:" + f);
	}
	
	public static void test(int i, float f) {
		System.out.println("(3)int:" +i + "/(4)float:" + f );
	}
	
	public static void test(float f, int i) {
		System.out.println("(4)float:" +f + "/(3)int:" + i);
	}

}

/*
 Javaでは、同じメソッド名でも引数が異なるなら別物として扱われます。
 この性質を利用して、引数が異なる複数の同名メソッドを定義するのがオーバーロードです
 
 printlnメソッドは、1行単位でデータを表示できるメソッド
 
 オーバーロードすると、メソッドを使う人が引数に渡すデータ型を意識せずに済むメリットがあります
 
 
 */