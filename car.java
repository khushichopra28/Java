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
// 
// public class flipcart{
//     public void order(int number,int cvv, int balance){
//         System.out.println("amount paid by debit card");
//     }
//     public void order(int number,int expdate){
//         System.out.println("amount paid by upi");
//     }
//     public static void main(String[]args){
//         flipcart f=new flipcart();
//         f.order(100,234,54);
//         f.order(34,566);
//     }
// }
// public class array{
//     public static void main(String[]args){
//         int arr[]={1,2,3,4,5};
    
//         int smallest=arr[0];
//         int largest=arr[0];

//         for (int i=0;i<arr.length;i++){
//             if (arr[i]<smallest){
//                 smallest=arr[i];
//             }
//             if (arr[i]>largest){
//                 largest=arr[i];
//             }
// }
//         System.out.println(smallest);
//          System.out.println(largest);
//     }
// }

// public class car{
//     public static void main(String[]args){
//         String arr[]={"honda","toyota","ford"};
//         boolean found=false;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i].equals ("honda")){
//                 if(found = true){
//                     break;
//                 }}}
//                 if (found==true){
//                 System.out.println("Found");
//             }
            
//             else{
//                 System.out.println("Not Found");
//             }
//         }
//     }

public class number{
    public static void main(String[]args){
        int size=20;
        int arr[]=new int[size];
        boolean found = false;
        for (int i=0; i < arr.length;i++)   {
            arr[i]=20+i;
            System.out.println(arr[i]);
        
        if ( arr[i]==37){
           if (found = true){
                break;
            }}}
            if(found==true){
                
                System.out.println("Found");
            }
            else{
                System.out.println("Not Found");
            }
        
        }
}