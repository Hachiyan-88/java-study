package text.section_06;

public class TypeConv_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//自動型変換は、コンパイラがソースコードを変換するときに行われます。
		//「より広範囲なデータ型への変換」のみに限られます
		//、自動型変換はデータ型が変わっても状態を保てる場合に行われます
		
		//[範囲の狭いデータ型]→[広範囲なデータ型]の自動型変換
		long valLong = 123; //int型の値をlong型に変換して代入
		float valFloat = 123; //int型をfloat型に変換し代入
		double valDouble = 123.4F; //int型をfloat型に変換して代入
		
		System.out.println(valLong);
		System.out.println(valFloat);
		System.out.println(valDouble);

	}

}
