/**
 * 
 */
package method_calling_withreturn_type;

public class ClassA {
   void meth1() {
	   System.out.println("meth1() called");
	   System.out.println(10);
	   return;
   }
   int meth2(int a , int b) {
	   System.out.println("meth2() called");
	   System.out.println("value of a :"+ a);
	   System.out.println("value of a :"+ b);
	   return a+b;
	  // System.out.println("hello world"); //1>CE : unreachable code .
	                                        //2> controll will not execute the code after return statement.
	   
	                                        // return statement will return the value to the calling method of same type
	                                        // or compatable type.
   }
   
  
	public static void main(String[] args) {
		System.out.println("Start");
		 ClassA aobj =new ClassA();
		        aobj.meth1();
	    System.out.println("==============");
	     int result = aobj.meth2(9,10);
	     System.out.println("meth2() value returning "+ result);
	     System.out.println("End");
	}

}
/*
 * Keypoints:
   =>Any method which is declared as void does not need return statement, if we write return statement if should not
     pass the value .
   =>Except void methods all other methods return type we will use 100% return statement.
   =>return type of a method and value returning from the method should be compatible .
   =>return statement need not be the last satement inside a method,but it should be the last execuatbale statement in a method
   =>void method does not need return statement,if we write a return staement we can do that without returning anything.
   =>we can use void + all 8 primitive data types +classes+ interfaces as method return type.  
 * 
 * 
 * */
