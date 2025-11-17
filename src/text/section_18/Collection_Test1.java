package text.section_18;

//addメソッド
//addメソッドに渡す要素は宣言時に定めたリストの型と同じ型で指定

//addメソッドに渡す要素は宣言時に定めたリストの型と同じ型で指定

import java.util.ArrayList;

public class Collection_Test1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
	
		ArrayList<String> humanList = new ArrayList<String>();
		humanList.add( "Kato" );
		humanList.add("Tanaka");
		humanList.add("Yamada");
		
		
		for( int i = 0; i < humanList.size(); i++) {
			System.out.println(humanList.get(i));
		}
	}

}
