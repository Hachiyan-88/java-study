package bookLibrary_app;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
	
	private List<Book> books = new ArrayList<>();
	
	public void add(Book book) {
		books.add(book);
	}
	
	public List<Book> findAll() {
		return books;
	}
	
	public boolean delete(int id) {
		for(Book b: books) {
			if(b.getId() == id) {
				books.remove(b);
				return true;
			}
		}
		return false;
	}
	
	public List<Book> searchByTitle(String keyword) {
		List<Book> result = new ArrayList<>();
		
		for(Book b: books) {
			if(b.getTitle().contains(keyword)) {
				result.add(b);
			}
		}
		
		return result;
	}

}
