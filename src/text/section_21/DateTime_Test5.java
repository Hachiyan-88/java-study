package text.section_21;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime_Test5 {
	
	  public static void main(String[] args) {
	        // 現在時刻を取得
	        Date now = new Date();

	        // 12時間制 (h)
	        SimpleDateFormat format12 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss a");
	        // 24時間制 (H)
	        SimpleDateFormat format24 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

	        // フォーマット結果を出力
	        System.out.println("12時間制表示: " + format12.format(now));
	        System.out.println("24時間制表示: " + format24.format(now));
	    }

}
