package todo_app;

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