package memoApp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scanner = new Scanner(System.in);
		
		MemoRepository repo = new MemoRepository();
		
		int nextId = 1;
		
		
		while (true) {
			
		System.out.println("=== Memo App ===");
		System.out.println("1.Add Memo");
		System.out.println("2.List Memos");
		System.out.println("3.Delete Memo");
		System.out.println("4.Exit");
		
		int command = scanner.nextInt();
		scanner.nextLine();
		
		switch(command) {
			
			case 1:
				System.out.println("title");
				String title = scanner.nextLine();
				
				System.out.println("content");
				String content = scanner.nextLine();
				
				
				Memo memo = new Memo(nextId++, title, content);
				repo.add(memo);
				
				System.out.println("追加できた！");
				
				break;
				
			case 2:
				System.out.println("list memos");
				
				for(Memo m :repo.findAll()) {
					System.out.println("[" + m.getId() + "] " + m.getTitle() +" - "+ m.getContent());
				}
				
				break;
				
			case 3:
				System.out.println("削除したいIDを入力");
				int id = scanner.nextInt();
				repo.delete(id);
				
				System.out.println("削除した！");
				break;
				
			case 4:
				System.out.println("Bye");
				scanner.close();
				return;
				
			default:
				System.out.println("コマンド入力");
			}
		
			System.out.println();
		
		}

	}
	
	

}
