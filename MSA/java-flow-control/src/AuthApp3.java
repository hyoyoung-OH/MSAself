
public class AuthApp3 {

	public static void main(String[] args) {

//		String[] users = { "lisa", "jisoo", "mama" };
		String [] [] users = {
				{"lisa","0302"},
				{"hoyoon","0311"},
				{"mmii","0222"}
			
		};

		String inputId = args[0];
		String inputPass= args[1];
		
		boolean isLogined = false;
		for (int i = 0; i < users.length; i++) {
			String[] current = users[i];
			if (
					
					current[0].equals(inputId) &&
					current[1].equals(inputPass)) {
				isLogined = true;
				break;
			}
		}
		System.out.println("hi");
		
		if(isLogined) {
			System.out.println("master!!");
			
		} else {
			System.out.println("who Area you?");
		}
		

	}
}
