#Application.java file
#HDFC Application 
public class SimpleMethodExample {

    // Method that takes two integers and returns their sum
    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        // Calling the method and storing the result
        int result = addNumbers(5, 7);

        // Printing the result
        System.out.println("The sum is: " + result);
    }
	#feature202 changes by Ethan for  Reports Module
	public class DemoClass{
 
  public static void sampleMethod(int a,int b) throws ArithmeticException{
      System.out.println("Hello, this is sample method");
      int c = a/b;
      System.out.println("c:"+c);
 }
  
 public static void main (String[] args){
    DemoClass.sampleMethod(4,2);     
 }
 
}
}
