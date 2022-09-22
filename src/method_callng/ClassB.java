package method_callng;

public class ClassB {
	void meth1() {
		System.out.println(10);
		System.out.println(64);
		System.out.println("End");
	}
	int meth2(int a,int b,int c) {
		System.out.println(a);
		ClassB bobj = new ClassB();
		String s = bobj.meth5(100,"java is awesome");
		//System.out.pritnln(s);
		return a-b;
	
	}
	String meth3(String s ,int b , int d){
		System.out.println(b+d);
		return s;
	}
    int meth4(int c , int k){
    	System.out.println(k);
    	ClassB bobj = new ClassB();
    	int result = bobj.meth2(50, 50, 50);
    	System.out.println(result);
    	return k+10;
    	
    }
    String meth5(int a , String L) {
    	System.out.println(a+a);
    	ClassB bobj = new ClassB();
    	String s = bobj.meth3("Hi",15,10);
    	System.out.println(s);
    	return L;
    	
    }
    public static void main(String [] args) {
    	System.out.println("Start");
    	ClassB bobj = new ClassB();
    	int result = bobj.meth4(20,10);
    	System.out.println(result);
    	bobj.meth1();
    }
}
