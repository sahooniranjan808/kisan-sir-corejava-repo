package jvm_architecture_object_method;
class ClassC {

	void meth1() {
		System.out.println("classA method");
	}

}
 
public class ClassA extends ClassC { // here we are calling the parent class from child class
	                                 // ClassA is child class ,ClassC is parent class
	public static void main(String [] args) {
		ClassC aobj1 = new ClassC(); // we can create object of another class in a class.
		       aobj1.meth1();
		ClassA aobj2 = new ClassA(); // we can call the the parent class method from child class object reference
		                             //by using extends keyword in method.
		       aobj2.meth1();
		
	}
}
