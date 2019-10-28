import java.util.HashMap;

 public class EmailInfoDriver {

 	public static void main(String[] args) {
 		// TODO Auto-generated method stub
 		EmailInfo address = new EmailInfo();

 		address.addFriend("Mary", "test@mailinator.com");
 		address.addFriend("Bob", "bobloblaw@boblaw.com");
 		address.addFriend("Hal", "halpal@helpahal.com");

 		address.listAll();

 		address.removeFriend("Mary");

 		address.listAll();

 		address.getAddress("Hal");

 		address.addFriend("barb", "bobloblaw@boblaw.com");
 		address.findFriends("bobloblaw@boblaw.com");
 	}

 }

class EmailInfo {
	private HashMap<String, String> addressBook;

	public EmailInfo() {
		addressBook = new HashMap<String, String>();
	}
	private String formatName(String name) {
	       String first = "";
	       String rest = "";
	       if(name != null && name.length() > 0) {
	           first = name.substring(0,1).toUpperCase(); // get first letter
	           if(name.length() > 1) {
	                rest = name.substring(1).toLowerCase(); // get the rest
	           }
	       }
	       return first + rest;
	}
public void addFriend(String name, String email) {
		if (name != null && email != null) {
			addressBook.put(formatName(name), email);
		}
	}
	public void removeFriend(String name) {
		if (name != null) {
			String removeName = formatName(name);
			addressBook.remove(removeName);
		}
	}
	public String getAddress(String name) {
		String getName = formatName(name);
		System.out.println("The email you were looking for:" + addressBook.get(getName));
		return addressBook.get(getName);
	}
	public void findFriends(String email) {
		if (email != null) {
			System.out.println("Friend(s) with this email address:");
			for (String key : addressBook.keySet()) {
				if (addressBook.get(key).equals(email)) {
					System.out.println(key);
				}
			}
		}
	}

	public void listAll() {
		System.out.println("Friends in Address Book:");
        for(String name : addressBook.keySet()){
            String thisOne = addressBook.get(name);
            System.out.println(thisOne);
        }
	}
}
