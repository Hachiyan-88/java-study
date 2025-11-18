package memoApp;

public class Memo {
	private int id;
	private String title;
	private String content;
	
	//コントラクタ
	public Memo(int id, String title, String content) {
		
		this.id = id;
		this.title = title;
		this.content = content; 
	}
	
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}

}

/*Memo クラスのフィールドを以下のように定義してください：

private int id;

private String title;

private String content;

そして、下の3つを作ってください：

(1) 3つのフィールドを初期化するコンストラクタ

public Memo(int id, String title, String content)

(2) id を返す getter

public int getId()

(3) title を返す getter

public String getTitle()

(4) content を返す getter

public String getContent()*/
