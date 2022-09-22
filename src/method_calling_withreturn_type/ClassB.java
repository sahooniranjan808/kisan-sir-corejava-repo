/**
 * 
 */
package method_calling_withreturn_type;

public class ClassB {
	    int meth1(){
	    	System.out.println("meth1() called");
	    	System.out.println("int and char both are char both are compatible type");
	    	return 'A'-'C';
		
	}
	    int meth2(int a) {
	    	System.out.println("meth2() called");
	    	System.out.println("a asci value is :"+a);
	    	return 'A'+a;
	    	
	    }
	    boolean meth3(int i) {
	    	System.out.println("meth3() called");
	    	if(i<=10){
	    		System.out.println("if block executed");
	    		return true;	
	    	}
	    	else{
	    		System.out.println("else block executed"); 
	    		return false;
	    	}
	    	
	    }
	    void meth4() {
	    	System.out.println("meth4() called");
	    	return;
	    }
     
	public static void main(String[] args) {
		     System.out.println("Start");
	          ClassB aobj = new ClassB();
			  int result1 = aobj.meth1();
			  System.out.println("meth1() returning value :"+result1);
			  System.out.println("==========");
			  int result2 =aobj.meth2(5);
			  System.out.println("meth2() returning value :"+result2);
			  System.out.println("==========");
			  boolean result3 = aobj.meth3(result2);
			  boolean result4 = aobj.meth3(result1);
			  System.out.println("meth3() if else condtion returning value :"+ result3);
			  System.out.println("meth3() if else condtion returning value :"+ result4);
			  System.out.println("==========");
			        aobj.meth4();
			  System.out.println("End");
	}

}
