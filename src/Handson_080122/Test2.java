package Handson_080122;

public class Test2 {
	String name;
	int id;

	Test2(String name, int id) {
		System.out.println("here in parameterized");
		this.name = name;
		this.id = id;
	}

	Test2() {

	}

	public static void main(String[] args) {
		Test2 obj = new Test2("Abc", 1);

		System.out.println(obj.name);
		System.out.println(obj.id);
	}
}

//// classA is ur abstract class
//Class B is child
//ClassB extends ClassA{
//	//methods
//	ClassA a=new ClassA();
//}
//
////We can create the object of the Child class which is inheriting the abstract class(Our parent) and have a reference variable of the parent type.
////Just like in inheritance.