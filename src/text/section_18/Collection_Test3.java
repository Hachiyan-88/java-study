package text.section_18;

//HashMap
//HashMapの要素を追加するメソッドはputメソッド
//putメソッドの引数は宣言時に定めたキー及び値と同じ型で指定

//HashMapの要素を取得するメソッドはgetメソッド
//getメソッドの引数に取得する要素のキーを指定

import java.util.HashMap;

public class Collection_Test3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		HashMap<Integer,String> humanMap = new HashMap<Integer,String>();
		
		humanMap.put(1, "Kato");
		humanMap.put(2, "Tanaka");
		humanMap.put(3, "Yamada");
		
		System.out.println("キーが1の人の値は" + humanMap.get(1));
		System.out.println("キーが2の人の値は" + humanMap.get(2));
		System.out.println("キーが3の人の値は" + humanMap.get(3));
		
	}

}
