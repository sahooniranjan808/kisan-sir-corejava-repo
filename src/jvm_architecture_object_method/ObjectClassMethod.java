package jvm_architecture_object_method;
// we will able to know the implementation of hasCode(),.equal(),getClass(),toString(); 
       
public class ObjectClassMethod {

	void meth1() {
		System.out.println("method 1 called");
	}
	
	public static void main(String[] args) {
      ObjectClassMethod aobj1  = new ObjectClassMethod(); // we have created two objects of same class
      ObjectClassMethod aobj2  = new ObjectClassMethod();
      
                  //calling hasCode method from object class 
     int aobj1hasCode =  aobj1.hashCode(); // hasCode will return int type value and it is used to find unique
                                           //identification for object.
     int aobj2hasCode = aobj2.hashCode();
     
                        System.out.println("aobj1 hascode is " +aobj1hasCode);
                        System.out.println("aobj2 hascode is " +aobj2hasCode);
     
                       System.out.println("-------------------------");
     
             //calling equal method from object class,object class is by deafult parent class for all classes.
             // so will not use extend keyword in method.
     
                          boolean value1 =  aobj1.equals(aobj2); //false// .equal method is used for comapring the address location 
                                                                        //  of two objects, if both the
                          boolean value2 =  aobj1.equals(aobj1); //true
                          boolean value3 =  aobj1.equals(aobj2); //false // data type is booleanfor .equal method
                          boolean value4 =  aobj2.equals(aobj2); //true
                          

                          System.out.println(value1);
                          System.out.println(value2);  
                          System.out.println(value3);  
                          System.out.println(value4);
                          System.out.println(aobj1.equals(new ObjectClassMethod()));//again creating another object
                          
                          System.out.println("-------------------------");
                          
                            //calling getClass method
                          System.out.println("getClass()is = "+ aobj1.getClass()); // get class method is used check the qualified class name
                          System.out.println("getClass()is = "+ aobj2.getClass());
                          
                          System.out.println("-------------------------");
                            // calling toString mrthod
                          System.out.println("toString() is =" + aobj1.toString() ); //toString() is used to convert an object into string represent format. 
                          System.out.println("toString() is =" + aobj2.toString() );
                          
                /*
                 1. hasCode():
                    ->hasCode method will not provide address location of an object .
                    ->It provides an unique identification number for your object which is used distinguish two object separately.
                   
                    
                 2. equal():
                   ->.equal() method is a boolean method.
                   ->.equal() will comapre the address location of the objects and give true or false result.
                   ->if both the objects are present in the same address location then . equal() will return true.
                   ->if both the objects are present in the different address location then . equal() will return false.
                   
                 3. getClass():
                   ->it will return fully qualified class name.
                   
                 4. toString():
                   ->it is used to convert an object into string represent format.     
                  
                  
                  
                  */          
                          
                          
                          
                          
     
     
     
     
     
     
     
     
          
      
       
	}

}
