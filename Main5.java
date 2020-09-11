///publlic Access Modifier.
class A 
{ 
   public void display() 
      { 
          System.out.println("Public Access Modifier"); 
      } 
} 
class Main5
{ 
    public static void main(String args[]) 
      { 
          A obj = new A (); 
          obj.display(); 
      } 
}