package bookLibrary_app;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scanner = new Scanner(System.in);
		
		BookRepository repo = new BookRepository();
		
		int nextId = 1;
		
		while (true) {
			
			System.out.println("===Book Library===");
			System.out.println("1. Add Book ");
			System.out.println("2. List Books ");
			System.out.println("3. Delete Book ");
			System.out.println("4. Search Book ");
			System.out.println("5. Exit ");
			System.out.println(">");
			
			int command = scanner.nextInt();
			scanner.nextLine();
			
			switch(command) {
			
			case 1:
				System.out.println("タイトル入力してね");
				String title = scanner.nextLine();
				
				System.out.println("著者を入力してね");
				String author = scanner.nextLine();
				
				Book book = new Book(nextId++, title, author);
				repo.add(book);
				
				
				System.out.println("追加したよ！");
				break;
				
			case 2:
				System.out.println("リスト");
				for (Book b: repo.findAll()) {
					System.out.println("[" + b.getId() + "]" + b.getTitle() + " - " + b.getAuthor());
				}
				System.out.println();
				break;
				
			case 3:
				System.out.println("削除したいIDを入力してね");
				int id = scanner.nextInt();
				scanner.nextLine();
				
				boolean deleted = repo.delete(id);
				if(deleted) {
					System.out.println("削除したよ");
				} else {
					System.out.println("削除失敗");
				}break;
				
			case 4:
				System.out.println("検索キーワードを入力して");
				String keyword = scanner.nextLine();
				
				List<Book> result = repo.searchByTitle(keyword);
				
				System.out.println("検索結果");
				if(result.isEmpty()) {
					System.out.println("該当する本はなかった");
				} else {
					for(Book b: repo.findAll()) {
						System.out.println("[" + b.getId() + "]" + b.getTitle() + " - " + b.getAuthor());
					}
					System.out.println();
				}
				break;
				
			case 5:
				System.out.println("終了する");
				return;
				
			default:
				System.out.println("不明な入力です");
			
			}
			
		}

	}

}
