
public class LoopArray {

	public static void main(String[] args) {
		
		String[] users = new String[3];
		users[0] = "lisa";
		users[1] = "alice";
		users[2] = "jim";
		
		for(int i = 0; i < users.length; i++) {
		System.out.println("<li>"+users[i]+"</li>");
	}

}
}
