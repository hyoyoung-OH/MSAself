class Cal {
	public int sum(int v1, int v2) {
		return v1 + v2;
	}
	
	// overloading
	public int sum(int v1, int v2, int v3) {
		return this.sum(v1, v2) +v3;

	}

}

class Cal3 extends Cal {
	public int minus(int v1, int v2) {
		return v1 - v2;
	}

	// Overriding µ¤¾î¾²±â
	public int sum(int v1, int v2) {
		System.out.println("wowowowowowwow");
		return super.sum(v1, v2);

	}

	// overloading
	public int sum(int v1, int v2, int v3) {
		return v1 + v2 + v3;

	}

}

public class InheritanceApp {
	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println(c.sum(2, 1));
		System.out.println(c.sum(2, 1, 3));

		Cal3 c3 = new Cal3();
		System.out.println(c3.sum(3, 7));
		System.out.println(c3.minus(3, 7));
	}

}
