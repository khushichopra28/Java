// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter your age: ");
//         int age = scanner.nextInt();
//         System.out.println("Hello, your age is " + age + "!");
        
//         boolean hasDl = true; // Declared to fix the missing variable error

//         if (age >= 18) {
//             System.out.println("You are an adult.");
//             if (hasDl) {
//                 System.out.println("You can drive.");
//             }
//         } else {
//             System.out.println("You are a minor.");
//         }
//         scanner.close();
//     }
// }

// import java.util.Scanner;

// public class Numbers{
//     public static void main(String[]args){
//     int n = 123;
//     int rev = 0 ;
//     while(n>0){
//         int digit=n%10;
//         rev=rev*10+digit;
//         n=n/10;
//     }
//         System.out.println(rev);
    
// }
// }

// public class Main {
//   public static void main (String[]args){
//     int a = 1 ;
//     int b = 2 ;
//     System.out.println(a);
//     System.out.println(b);
//     int t;
//     t=a;
//     a=b;
//     b=t;
//     System.out.println(" after swapping " );
//     System.out.println( a);
//     System.out.println( b);
//   }
// }

// public class Main{
//   public static void main (String[]args){
//     int a = 20;
//     int b = 100;
//     int product = a * b ; 
//     System.out.println(product);
//   }
// }

// the type 1 method class 
// public class method{
//     public static int addition(int a, int b){
//         return a+b;
//     }
//     public static void main(String[]args){
//         addition(10,20);
//         System.out.println(addition(10,20));
//     }
// }

// public class method{
//     public static String main()
// {
//     return "hello";
// }public static void main(String[]args){
//     System.out.println(main());
// }
// }
public class method{
    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;

    }
    public static int mult(int a, int b){
        return a*b;
    }
    public static int div(int a, int b){
        return a/b;
    }
    public static void main(String[]args){
        System.out.println(add(10,20));
        System.out.println(sub(10,20));
        System.out.println(mult(10,20));    
        System.out.println(div(10,20));
    }
}


