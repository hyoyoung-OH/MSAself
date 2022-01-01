class Foo {
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";

	public static void classMethod() {
		System.out.println(classVar); // ok
//		System.out.println(instanceVar); //error

	}

	public void instanceMethod() {
		System.out.println(classVar); // ok
		System.out.println(instanceVar); // ok

	}
}

public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar); //ok
//		System.out.println(Foo.instanceVar); //error
		Foo.classMethod();
//		Foo.instanceMethod();
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar); //I class var
		System.out.println(f1.instanceVar); //I instance var
		System.out.println();

	}

}
