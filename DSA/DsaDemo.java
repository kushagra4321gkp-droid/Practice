import java.util.*;

//Check Even or Odd
// class DsaDemo{
//     public static void main(String[] args){

//         System.out.print("enter a number : ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if(n%2 == 0)
//             System.out.println("even");
//         else
//             System.out.println("odd");
//     }
// }

//Check Prime Number
// class DsaDemo{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if(n<=1)
//             System.out.println("not Prime");
//         for(int i = 2; i<=Math.sqrt(n); i++){
//             if(n%i == 0){
//                 System.out.println("not prime");
//             }else
//                 System.out.println("prime");
//         }
//     }
// }

//Factorial
// class DsaDemo{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int fact = 1;
//         for(int i=1; i<=n; i++)
//             fact *= i;
//         System.out.println(n + "! = " + fact);    
//     }
// }

//Fibonacci Series
// class DsaDemo{
//     public static void main(String[] args){
//         System.out.print("Enter no of Terms : ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a = 0, b = 1;
//         System.out.print(a + " " + b + " " + b);
//         for(int i=1; i<=n-3; i++){
//             a = b;
//             b = i;
//             int c = a+b;
//             System.out.print(" " + c);
//         }

//     }
// }

//5 -> Reverse a Number
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int rev = 0;
//         while(n != 0){
//             rev = rev * 10 + n % 10;
//             n /= 10;
//         }
//         System.out.println(rev);
//     }
// }

//6 -> Check Palindrome Number
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int temp = n;
//         int rev = 0;
//         while(n != 0){
//             rev = rev * 10 + n % 10;
//             n /= 10;
//         }
//         System.out.println(temp == rev? "Palindrome" : "Not Palindrome");
//     }
// }

//7 -> Armstrong Number (narcissistic number)
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int temp = n, sum = 0;
//         while(n != 0){
//             int digit = n % 10;
//             sum += digit * digit * digit;
//             n /= 10;
//         }
//         System.out.println(temp == sum? "Armstrong" : "Not Armstrong");
//     }
// }

//8 -> Sum of digits
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         while(n != 0){
//             sum += n % 10;
//             n /= 10;
//         }
//         System.out.println(sum);
//     }
// }

//9 -> Largest of Three Numbers
