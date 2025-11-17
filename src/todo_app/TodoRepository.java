package todo_app;

import java.util.ArrayList;
import java.util.List;

public class TodoRepository {
	
	private List<Todo> todos = new ArrayList<>();
	
	
	public void add(Todo todo) {
		todos.add(todo);
	}
	
	//今回のfindAllの引数なし
	public List<Todo> findAll() {
		return todos;
		
	}
	
	public void delete(int id) {
		for(int i = 0; i < todos.size(); i++) {
			if(todos.get(i).getId() == id) {
				todos.remove(i);
				return;
			}
		}
	}

}

/*miss

	List<Todo> todos = new ArrayList<>();
	
	public void add(Todo todo) {
		return;
	}
	
	List<Todo> findAll() {
		return todos;
	}
	
	void deleteId(List<Todo> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				list.remove(i);
				return;
			}
		}
	
 */