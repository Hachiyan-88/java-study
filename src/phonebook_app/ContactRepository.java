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
	
	public void delete(int id) {
		for(int i = 0; i < contacts.size(); i++ ) {
			if(contacts.get(i).getId() ==id ) {
				contacts.remove(i);
				return;
			}
		}
	}
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
