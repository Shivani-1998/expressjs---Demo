//Protected Access Modifier.
class A 
{ 
   protected void display() 
    { 
        System.out.println("Protected Access Modifier"); 
    } 
} 
 
class B extends A {}  
class C extends B {}
 
class Main4{
     public static void main(String[] args) 
   {   
       B obj = new B();        
       obj.display();      
       C cObj = new C();   
       cObj.display ();    
   }   
}