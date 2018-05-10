package exceptionhandling;

public class Ex2 {

	public static void main(String[] args) {

      int a=10;
      int b=2;
      try
      {
      System.out.println(a/b);
      System.out.println("Hai "+args[0]);
      int x=Integer.parseInt("abc");
      }catch(Exception e)
      {
    	  //e.printStackTrace();
    	  System.out.println("Devide By Zero Error"+ e.getMessage());
      }
     /* catch (ArrayIndexOutOfBoundsException e) {

//e.printStackTrace();
    	  
    	  System.out.println("Array Index Problem");
	}
      catch (NumberFormatException e) {

//e.printStackTrace();
    	  System.out.println("Convertion problem");
	}*/
		

	}

}
