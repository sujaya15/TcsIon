package pkg1;
public class ArrayIndex {
	 public static void main(String args[])
	  {
	    int marks[] = { 40, 50, 60 };
	    System.out.println("Hello");
	 
	    try
	    {
	      int m1 = marks[3];                          
	      System.out.println("Marks are " + m1);
	    }
	    catch(ArrayIndexOutOfBoundsException e)
	    {
	      System.out.println("Do not cross size of array sir."  + e );
	    }
	    System.out.println("Hava a");
	    System.out.println("Good day");
	  }

}
