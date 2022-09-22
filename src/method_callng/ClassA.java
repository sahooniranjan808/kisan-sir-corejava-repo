package method_callng;

public class ClassA {
	int meth1(int a) {
		System.out.println("meth1() aclling");
		return a;
	}
	int meth2(int a) {
		System.out.println("meth2() calling");
		return a+a;
	}
	String meth3() {
		System.out.println("meth3() calling");
		return "java is awesome";
	}
	public static void main(String[] args) {
	ClassA aobj = new ClassA();
	System.out.println(aobj.meth1(1) + aobj.meth2(5));
	System.out.println(aobj.meth3());
	}
}
