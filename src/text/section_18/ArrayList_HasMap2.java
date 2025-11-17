package text.section_18;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayList_HasMap2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 例）HashMapの宣言
		HashMap<String, ArrayList<String>> departments = new HashMap<String, ArrayList<String>>();
		
		// 開発部の登録
		ArrayList<String> devList = new ArrayList<String>();
		devList.add("田中");
		devList.add("佐藤");
		departments.put("開発部", devList);
		
		ArrayList<String> salesList = new ArrayList<String>();
		salesList.add("鈴木");
		salesList.add("高橋");
		departments.put("営業部", salesList);
		
		for (String key : departments.keySet()) {
		    System.out.println( key + "：" + departments.get(key) );
		}

	}

}
