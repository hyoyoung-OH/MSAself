
public class ArrayApp {

	public static void main(String[] args) {
		
		String[] users = new String[3];
		users[0] = "lisa";
		users[1] = "alice";
		users[2] = "jim";
		
		System.out.println(users[1]);
		System.out.println(users.length);
		
		int[] scores = {10, 20, 50};
		System.out.println(scores[2]);
		System.out.println(scores.length);
	}

}
