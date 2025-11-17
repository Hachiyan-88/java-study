package text.section_24;

public class Exception_Test1 {

	

	public static void main(String[] args) {
		//配列の宣言
		int[] number = new int[1];

		try {
			number[0] = 1;
			number[1] = 2;
		} catch (ArrayIndexOutOfBoundsException e) {
			
			//配列のインデックスが範囲外の場合に行う処理
			System.out.println("配列のインデックスが範囲外です");
		}

		System.out.println("処理終了です");
	}
}

/*
  
 try{
    例外が起きているか確認する処理
 }  catch(例外クラス 変数名){
    例外が起きた場合に行う処理
 }
 
try文の中で例外が発生すると、try文の処理は中断します。
そして、catch文に処理が移り例外が起きた場合に行う処理が行われます。
*/