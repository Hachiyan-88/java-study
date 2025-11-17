package todo_app;
/*■ 必須仕様（もう一度）

private フィールド

int id

String title

public コンストラクタ

Todo(int id, String title)

public getter

int getId()

String getTitle()

-------------------------------------------------------
上記仕様に基づいて
Todo.java 全体のコードを書いてください。

ファイル名コメントは不要

class Todo のみ書けば OK

改行やインデントは自由
-------------------------------------------------------
 */


public class Todo {
	
	private int id;
	private String title;
	
	public Todo(int id, String title) {
		
		//コンストラクタ
		this.id = id;
		this.title = title;
	}
	
	//idのゲッター
	public int getId() {
		return id;
	}
	
	//titleのゲッター
	public String getTitle() {
		return title;
	}
	
	

}
