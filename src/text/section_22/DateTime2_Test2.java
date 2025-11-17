package text.section_22;

import java.time.LocalTime;

public class DateTime2_Test2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		LocalTime time1 = LocalTime.now();
		
		System.out.println(time1);
		
		
		LocalTime time2 = LocalTime.of(5, 10, 20);
		
		System.out.println(time2);

	}

}

//LocalTimeクラスを活用して、時刻が取得できます

//LocalTime.now() 今

//LocalTime.of(指定する時, 指定する分, 指定する秒)

//結果の小数点以下はナノ秒と呼びます。ナノ秒は10億分の1秒を表す時間の単位