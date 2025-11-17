/*【問題】
目的

HashMap<String, ArrayList<String>> を使い、
部署ごとの社員を

追加するメソッド

削除するメソッド

一覧を表示するメソッド
を作る練習です。
*/

package text.section_18;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayList_HasMap3 {
		
		// 部署と社員リストを管理するコレクション
		private static HashMap<String, ArrayList<String>> departments = new HashMap<String, ArrayList<String>>();

		public static void addEmployee(String department, String name) {
		    
		    // 部署が存在しなければ新しく作成
		    if (!departments.containsKey(department)) {
		        departments.put(department, new ArrayList<String>());
		    }

		    // リストに社員名を追加
		    departments.get(department).add(name);
		}
		
		public static void removeEmployee(String department, String name) {

		    // 部署が存在しなければ何もせず return
		    if (!departments.containsKey(department)) {
		        return;
		    }

		    // 指定された社員を削除
		    departments.get(department).remove(name);

		    // リストが空になったら部署ごと削除してもOK
		    if (departments.get(department).isEmpty()) {
		        departments.remove(department);
		    }
		}
		
		public static void printAll() {
		    for (String department : departments.keySet()) {
		        System.out.println( department + "：" + (departments.get(department)) );
		    }
		}
		
		public static void main(String[] args) {

		    // ① 社員の追加
		    addEmployee( "開発部" , "田中" ); // 田中
		    addEmployee( "開発部" , "佐藤" ); // 佐藤
		    addEmployee( "営業部" , "鈴木" ); // 鈴木
		    addEmployee( "営業部" , "高橋" ); // 高橋

		    // ② 削除
		    removeEmployee( "営業部" , "鈴木" ); // 営業部の鈴木を削除

		    // ③ 一覧表示
		    printAll();
		}



}
