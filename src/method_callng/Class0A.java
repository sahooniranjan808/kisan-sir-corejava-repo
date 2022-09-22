package method_callng;

public class Class0A {
	public String testMethod() {
	System.out.println(35);
	return new Class0A().testMethod3(new Class0A().testMethod2()) + new Class0A().testMethod4("here");
	
	}
    public int testMethod2() {
    	System.out.println(25);
    	return 25+5;
	}
    public String testMethod3(int a) {
    	 System.out.println(15);
    	 return "is";	 
    }
    public String testMethod4(String s) {
    	System.out.println(45);
    	return " awesome";
    }
    public static void main(String[] args) {
		Class0A t = new Class0A();
		System.out.println("Java " + t.testMethod());
	}
    
}
