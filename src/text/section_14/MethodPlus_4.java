package text.section_14;

public class MethodPlus_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int[] scoreArray = {70,85,80,90,96,120};
		
		for ( int score : scoreArray ) {
			System.out.println( score + "点だと成績は" + getGrade(score ) );
		}

	}
	
	public static char getGrade( final int score ) {
		char grade = 'C';
		
		if( ( score < 0) || ( 100 < score ) ) {
			return '-' ;
		}
		
		if( 90 <= score ) {
			grade = 'A';
		} else if ( 80 <= score ) {
			grade = 'B';
		}
		
		return grade;
	}

}
/*戻り値とは、メソッドの実行結果をデータで返す仕組みのことです。
 メソッドの実行結果を後の処理に活用したいときには、戻り値
 
 メソッドに戻り値を返すためには、以下2つの手続きが必要となります。

メソッドの「戻り値の型」を、返したいデータの型にする
メソッド内でreturn文により戻り値を返す

メソッド内の処理結果を戻り値として返すときに使うのが、return文
戻り値を返したい場合、基本的にメソッドの最後にはreturn文が欠かせません。

Javaでは、メソッドの戻り値を参照するかどうかは任意
 
*/