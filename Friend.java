public class Friend {
	static int numOfFriends;
	String name;

	public Friend(String name) {
		this.name = name;
		numOfFriends++;
	}

	static void showFriends() {
		System.out.println("You have " + numOfFriends + " total friends");
	}
}
// Friend class created for static keyword in java
