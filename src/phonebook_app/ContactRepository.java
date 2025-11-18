package phonebook_app;

import java.util.ArrayList;
import java.util.List;

public class ContactRepository {
	
	private List<Contact> contacts = new ArrayList<>(); 

	public void add(Contact contact) {
		contacts.add(contact);
	}
	
	public List<Contact> findAll() {
		return contacts;
	}
	
	public boolean delete(int id) {
		for(Contact c : contacts) {
			if (c.getId() == id) {
				contacts.remove(c);
				return true;
			}
		}
		return false;
	}
	
	//searchNameの追加
	public List<Contact> searchByName(String keyword) {
	     List<Contact> result = new ArrayList<>();

	     for (Contact c : contacts) {
	         if (c.getName().contains(keyword)) {
	             result.add(c);
	         }
	     }

	return result;
	}
}
