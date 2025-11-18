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
