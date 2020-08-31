// static Variables and Methods within the Class
public class Main1 {

   static int age;
   static void display() {
       System.out.println("Static Method");
   }
   public static void main(String[] args) {
       age = 30;
       System.out.println("Age is " + age);

       display();
   }
}