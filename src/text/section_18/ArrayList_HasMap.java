/*【問題】

HashMap と ArrayList を使って、
「部署ごとに所属している社員名」を管理し、
全社員を部署ごとに出力するプログラムを作ってください。

【条件】

各部署（部署名）は String 型

社員名は ArrayList<String> 型

データは以下のように登録する

開発部：田中、佐藤  
営業部：鈴木、高橋  


出力形式は次のようにする

開発部：田中、佐藤
営業部：鈴木、高橋

【ヒント】

HashMap<String, ArrayList<String>> を使う

put() で登録

for (String key : map.keySet()) でループ*/

package text.section_18;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayList_HasMap {

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
