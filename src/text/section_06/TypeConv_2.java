package text.section_06;

public class TypeConv_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		//キャスト演算子
		//データ型を括弧ではさみ、型変換したい変数や値の頭につけるのが基本
		//「より範囲が狭いデータ型への変換」 で必要
		
		//キャスト演算子による型変換が必要かどうかは、プログラマーが判断
		//思わぬ形にデータが変わり誤動作を招くリスクがあります。範囲の狭いデータ型への変換が必要だからと、安易に使うべきではありません。
		
		//short型の値をbyte型にキャスト
		short valShort = 32767;
		byte valByte = (byte)valShort;	//byte型に収まりきらず不正値になる
		System.out.println(valByte);
		
		//double型の値をint型にキャスト
		double valDouble = 123.456;
		int valInt = (int)valDouble;	//小数部分はカットされる
		System.out.println(valInt);
		

	}

}
