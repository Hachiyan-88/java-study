package text.section_18;

//removeメソッド
//ArrayListの要素を削除するメソッド
//removeメソッドの引数で何番目の要素を削除するか指定

import java.util.ArrayList;

public class Collection_Test2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
	
		ArrayList<String> humanList = new ArrayList<String>();
		humanList.add( "Kato" );
		humanList.add("Tanaka");
		humanList.add("Yamada");
		
		humanList.remove(0);
		
		
		for( int i = 0; i < humanList.size(); i++) {
			System.out.println(humanList.get(i));
		}
	}

}
