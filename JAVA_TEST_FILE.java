public class MyFirstJavaProgram {

    /* This is my first java program.
     * This will print 'Hello World' as the output
     */
 
    public static void main(String []args) {
       System.out.println("Hello World"); // prints Hello World
    }
 }

 public class Test {
    public void pupAge() {
       int age;
       age = age + 7;
       System.out.println("Puppy age is : " + age);
    }
 
    public static void main(String args[]) {
       Test test = new Test();
       test.pupAge();
    }
 }

public class Test {
   public static void main(String args[]) {
      int a, b;
      a = 10;
      b = (a == 1) ? 20: 30;
      System.out.println( "Value of b is : " +  b );

      b = (a == 10) ? 20: 30;
      System.out.println( "Value of b is : " + b );
   }
}

public class Test {

    public static void main(String args[]) {
       int [] numbers = {10, 20, 30, 40, 50};
 
       for(int x : numbers ) {
          System.out.print( x );
          System.out.print(",");
       }
       System.out.print("\n");
       String [] names = {"James", "Larry", "Tom", "Lacy"};
 
       for( String name : names ) {
          System.out.print( name );
          System.out.print(",");
       }
    }
 }

 public class TestArray {

    public static void main(String[] args) {
       double[] myList = {1.9, 2.9, 3.4, 3.5};
 
       // Print all the array elements
       for (int i = 0; i < myList.length; i++) {
          System.out.println(myList[i] + " ");
       }
      
       // Summing all elements
       double total = 0;
       for (int i = 0; i < myList.length; i++) {
          total += myList[i];
       }
       System.out.println("Total is " + total);
       
       // Finding the largest element
       double max = myList[0];
       for (int i = 1; i < myList.length; i++) {
          if (myList[i] > max) max = myList[i];
       }
       System.out.println("Max is " + max);  
    }
 }

public class TestArray {

   public static void main(String[] args) {
      double[] myList = {1.9, 2.9, 3.4, 3.5};

      // Print all the array elements
      for (double element: myList) {
         System.out.println(element);
      }
   }
}

public class MyClass {
    public static void main(String[] args) {
      int day = 4;
      switch (day) {
        case 1:
          System.out.println("Monday");
          break;
        case 2:
          System.out.println("Tuesday");
          break;
        case 3:
          System.out.println("Wednesday");
          break;
        case 4:
          System.out.println("Thursday");
          break;
        case 5:
          System.out.println("Friday");
          break;
        case 6:
          System.out.println("Saturday");
          break;
        case 7:
          System.out.println("Sunday");
          break;
      }
    }
  }
  
// A sample Java program to demonstrate working of 
// Arrays.sort(). 
// It by default sorts in ascending order. 
//import java.util.Arrays; 
  
public class GFG { 
    public static void main(String[] args) 
    { 
        int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 }; 
  
        Arrays.sort(arr); 
  
        System.out.printf("Modified arr[] : %s", 
                          Arrays.toString(arr)); 
    } 
} 

// Java program to demonstrate working of Collections.sort() 
//import java.util.*; 
  
public class GFG { 
    public static void main(String[] args) 
    { 
        // Create a list of strings 
        ArrayList<String> al = new ArrayList<String>(); 
        al.add("Geeks For Geeks"); 
        al.add("Friends"); 
        al.add("Dear"); 
        al.add("Is"); 
        al.add("Superb"); 
  
        /* Collections.sort method is sorting the 
        elements of ArrayList in ascending order. */
        Collections.sort(al); 
  
        // Let us print the sorted list 
        System.out.println("List after the use of"
                           + " Collection.sort() :\n" + al); 
    } 
} 