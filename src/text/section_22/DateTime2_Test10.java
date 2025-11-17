package text.section_22;

import java.time.Duration;
import java.time.LocalDateTime;

public class DateTime2_Test10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		LocalDateTime dateTime3 = LocalDateTime.of(1999, 01, 10, 01, 10, 10);
		LocalDateTime dateTime4 = LocalDateTime.of(1999, 01, 10, 02, 20, 10);
		
		Duration duration = Duration.between(dateTime3, dateTime4);
		
		System.out.println( "時間の差分は：" + duration.toHours() + "時間");
		System.out.println( "分の差分は：" + duration.toMinutes() + "分");
		System.out.println( "秒の差分は：" + duration.toSeconds() + "秒");
		
	}	

}
//時刻の差分を求める場合
//Duration.between(取得した日時, 取得した日時);

//Durationクラスのbetweenメソッドは引数に渡した2つの日時の差分を求めます。
/*toHours	時間の差分を求める
toMinutes	分の差分を求める
toSeconds	秒の差分を求める*/