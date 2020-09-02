//Default Access Modifier.
class Default 
{ 
    void display()     
       { 
           System.out.println("Default Access Modifier"); 
       } 
} 

class Main3
{ 
    public static void main(String args[]) 
       {   
         
          Default obj = new Default(); 
  
          obj.display();   
       } 
}