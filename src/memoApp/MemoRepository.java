package memoApp;

import java.util.ArrayList;
import java.util.List;

public class MemoRepository {
	
	private List<Memo> memos = new ArrayList<>();
	
	public void add(Memo memo) {
		memos.add(memo);
	}
	
	public List<Memo> findAll() {
		return memos;
	}
	
	public void delete(int id) {
		for(int i = 0; i < memos.size(); i++) {
			if(memos.get(i).getId() == id) {
				memos.remove(i);
			}
		}
	}

}
/*MemoRepository クラスを作ってください。

フィールド
S
private List<Memo> memos = new ArrayList<>();

実装するメソッド
(1) add(Memo memo)

memos に追加する。

(2) findAll()

memos をそのまま返す。

(3) delete(int id)

ID が一致した Memo を削除する。*/