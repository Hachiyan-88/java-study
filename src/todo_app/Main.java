/*■ 1. メニュー表示

起動すると以下のメニューを表示する：

=== ToDo App ===
1. Add Todo
2. List Todos
3. Delete Todo
4. Exit
> 

■ 2. 入力処理

Scanner scanner = new Scanner(System.in); を使う

数字を読み取って switch で分岐

■ 3. 動作仕様
(1) Add Todo

id は単純に 連番（1, 2, 3, ...） で OK

入力したタイトルを Todo にして repository.add() へ渡す

id の管理は Main 側の int counter を使ってよい

例：

int nextId = 1;
...
Todo todo = new Todo(nextId++, title);

(2) List Todos

repository.findAll() の結果をループして表示

表示形式は自由
例：

[1] 買い物
[2] 掃除

(3) Delete Todo

削除したい id をユーザーに聞く

repository.delete(id) を呼ぶだけ

(4) Exit

ループを抜けてアプリ終了*/
package todo_app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		TodoRepository repository = new TodoRepository();
		
		int nextId = 1;
		
		while (true) {
			System.out.println("=== Todo App ===");
			System.out.println("1. Add Todo");
			System.out.println("2. List Todos");
			System.out.println("3. Delete Todo");
			System.out.println("> ");
			
			
			int command = scanner.nextInt();
			scanner.nextLine();
			
			
			switch (command) {
			
			case 1:
				System.out.println("Title: ");
				String title = scanner.nextLine();
				
				Todo todo = new Todo(nextId++, title);
				repository.add(todo);
				
				System.out.println("Added");
				break;
				
			case 2:
				System.out.println("=== Todo List ===");
				for (Todo t :repository.findAll()) {
					
					System.out.println("[" + t.getId() + "]" + t.getTitle());
				}
				break;
				
			case 3:
				System.out.println("Delete ID: ");
				int id = scanner.nextInt();
				
				scanner.nextLine();
				
				repository.delete(id);
				System.out.println("Deleted");
				
				break;
				
			case 4:
				System.out.println("Bye");
				scanner.close();
				return;
				
				
			default:
				System.out.println("Invalid command");
			
			}
			
		System.out.println();
			
		}

	}

}











