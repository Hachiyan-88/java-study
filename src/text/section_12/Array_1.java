package text.section_12;

public class Array_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String[] nameArray=new String[5];
		int[] scoreArray = { 70,85,90,95,80 };
		
			nameArray[0] = "侍太郎";
	        nameArray[1] = "侍一郎";
	        nameArray[2] = "侍二郎";
	        nameArray[3] = "侍三郎";
	        nameArray[4] = "侍四郎";

	        System.out.println(nameArray[0]);
	        System.out.println(nameArray[1]);
	        System.out.println(nameArray[2]);
	        System.out.println(nameArray[3]);
	        System.out.println(nameArray[4]);
		
	        System.out.println(scoreArray[0]);
	        System.out.println(scoreArray[1]);
	        System.out.println(scoreArray[2]);
	    		System.out.println(scoreArray[3]);
	    		System.out.println(scoreArray[4]);
	    		
	    		
	    		/* 配列の要素外参照は実行時に初めてエラーが出るため注意 が必要*/

	}

}

//配列とは簡単にいえば、複数のデータをまとめたもの
//。new演算子は、配列やクラスの「実体」をつくり出すためのもの
//0から始まる点に注意 「null」 は、「データが何も入っていない状態」
