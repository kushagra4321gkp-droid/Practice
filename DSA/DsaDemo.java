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
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
//         int max = Math.max(a, Math.max(b, c));
//         System.out.println(max); 
//     }
// }

//10 -> GCD of Two Numbers
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt(), b = sc.nextInt();
//         while(b != 0){
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         System.out.println(a);
//     }
// }

//11 -> LCM of Two Numbers
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt(), b = sc.nextInt();
//         int x = a, y = b;
//         while(b != 0){
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         b = (x * y)/a;
//         System.out.println("Lcm : " + b); 
//     }
// }

//12 -> Check Leap year
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int year = sc.nextInt();
//         if((year%4 == 0 && year%100 != 0) || (year%400 == 0))
//             System.out.println("leap year");
//         else
//             System.out.println("Not a leap year");    
//     }
// }

//13 -> Count Vowels and Consonants
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         int vowel = 0, consonant = 0;
//         for(char ch : str.toCharArray()){
//             if(Character.isLetter(ch)){
//                 if("aeiou".indexOf(ch) != -1)
//                     vowel++;
//                 else
//                     consonant++;    
//             }
//         }
//         System.out.println("Vowel " + vowel);
//         System.out.println("Consonent " + consonant);
//     }
// }

//14 -> Reverse a String
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String rev = "";
//         for(int i = str.length()-1; i>=0; i--)
//             rev += str.charAt(i);
//         System.out.println(rev);    
//     }
// }

//15 -> Check Anagram
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s1 = sc.nextLine();
//         String s2 = sc.nextLine();

//         char[] a = s1.toLowerCase().toCharArray();
//         char[] b = s2.toLowerCase().toCharArray();

//         Arrays.sort(a);
//         Arrays.sort(b);

//         System.out.println(Arrays.equals(a, b)? "Anagram" : "Not Anagram");
//     }
// }

//16 -> Remove Duplicates from String
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String result = "";
//         for(char ch : str.toCharArray()){
//             if(result.indexOf(ch) == -1)
//                 result += ch;
//         }
//         System.out.println(result);
//     }
// }

//17 -> Find Second Largest in Array
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter size of array : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0; i<n; i++)
//             arr[i] = sc.nextInt();
//         int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;    
//         for(int num : arr){
//             if(num > first){
//                 second = first;
//                 first = num;
//             }
//             else if(num > second && num != first)
//                 second = num;
//         }  
//         System.out.println("Second largest : " + second);  
//     }
// }

//18 -> Linear Search
//19 -> Binary Search (Sorted Array)

//20 -> Bubble Sort
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter elements of array");
//         for(int i=0; i<n; i++)
//             arr[i] = sc.nextInt();
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n-i-1; j++){
//                 if(arr[j] > arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//         for(int num : arr)
//             System.out.print(num + " ");    
//     }
// }

//21 -> Selection Sort
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of the array : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter array elements : ");
//         for(int i=0; i<n; i++) arr[i] = sc.nextInt();

//         for(int i=0; i<n-1; i++){
//             int midIndex = i;
//             for(int j=i+1; j<n; j++){
//                 if(arr[j] < arr[midIndex])
//                     midIndex = j;
//             }
//             int temp = arr[i];
//             arr[i] = arr[midIndex];
//             arr[midIndex] = temp;
//         }

//         for(int num : arr)
//             System.out.print(num + " ");
//     }
// }

//22 -> Insertion Sort

//23 -> Matrix Addition
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter row");
//         int row = sc.nextInt();
//         System.out.println("Enter column");
//         int col = sc.nextInt();

//         int[][] a = new int[row][col];
//         int[][] b = new int[row][col];
//         int[][] sum = new int[row][col];

//         System.out.println("enter first matrix elements");
//         for(int i=0; i<row; i++){
//             for(int j=0; j<col; j++){
//                 a[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("enter second matrix elements");
//         for(int i=0; i<row; i++){
//             for(int j=0; j<col; j++){
//                 b[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("Matrix Sum");
//         for(int i=0; i<row; i++){
//             for(int j=0; j<col; j++){
//                 sum[i][j] = a[i][j] + b[i][j];
//                 System.out.print(sum[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//24 -> Transpose of Matrix
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter row and column");
//         int r = sc.nextInt(), c = sc.nextInt();

//         int[][] a = new int[r][c];
//         System.out.println("Enter array elements");
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 a[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("Transpose");
//         for(int j=0; j<c; j++){
//             for(int i=0; i<r; i++){
//                 System.out.print(a[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//25 -> Count Frequency of Element in Array
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter array size");
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         System.out.println("enter array elements");
//         for(int i=0; i<n; i++) arr[i] = sc.nextInt();

//         System.out.println("enter key");
//         int key = sc.nextInt(); 
//         int count = 0;

//         for(int num : arr)
//             if(num == key) count++;
        
//         System.out.println("Frequency of " + key + " = " + count);
//     }
// }

//26 -> Check if Array is Sorted
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter size of an array");
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         System.out.println("enter array elements");
//         for(int i=0; i<n; i++) arr[i] = sc.nextInt();

//         boolean sorted = true;
//         for(int i=0; i<n-1; i++){
//             if(arr[i] > arr[i+1]){
//                 sorted = false;
//                 break;
//             }
//         }
//         System.out.println(sorted? "Sorted" : "Unsorted");
//     }
// }

//27 -> Merge Two Arrays
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter size of first array");
//         int n1 = sc.nextInt();
//         System.out.println("enter size of second array");
//         int n2 = sc.nextInt();

//         int[] arr1 = new int[n1];
//         int[] arr2 = new int[n2];

//         System.out.println("enter elements of first array");
//         for(int i=0; i<n1; i++) arr1[i] = sc.nextInt();
//         System.out.println("enter elements of second array");
//         for(int i=0; i<n2; i++) arr2[i] = sc.nextInt();

//         int[] merged = new int[n1+n2];

//         for(int i=0; i<n1; i++) merged[i] = arr1[i];
//         for(int i=0; i<n2; i++) merged[n1 + i] = arr2[i];

//         System.out.println("merged array");
//         for(int num : merged) System.out.print(num + " ");
//     }
// }

//28 -> Find Missing Number (1 to N)

//29 -> Count Words in a String
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine().trim();

//         if(str.isEmpty()) System.out.println(0);
//         else{
//             String[] word = str.split("\\s+");
//             System.out.println(word.length);
//         }
//     }
// }

//30 -> Remove All Spaces from String
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         str = str.replaceAll(" ", "");
//         System.out.println(str);
//     }
// }

//31 -> Find Duplicate Elements in Array
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter size of an array : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n]; 
//         System.out.println("enter array elements : ");
//         for(int i=0; i<n; i++) arr[i] = sc.nextInt();

//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){
//                 if(arr[i] == arr[j]){
//                     System.out.println("Duplicate : ");
//                     System.out.println(arr[i] + " ");
//                     break;
//                 }
//             }
//         }
//     }
// }

//32 -> Move All Zeros to End
// class DsaDemo{
//     public static void main(String[] args) {
//         //4 0 5 0 0 6 7
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter size of an array : ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         System.out.println("enter array elements : ");
//         for(int i=0; i<n; i++) arr[i] = sc.nextInt();

//         int index = 0;

//         for(int i=0; i<n; i++){
//             if(arr[i] != 0)
//                 arr[index++] = arr[i];
//         }
//         while(index < n) arr[index++] = 0;
//         System.out.println("Final array : ");
//         for(int num : arr) System.out.print(num + " ");
//     }
// }

//33 -> Rotate Array Right by 1 Position
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter size of an array : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("enter elements of array :");
//         for(int i=0; i<n; i++) arr[i] = sc.nextInt();

//         int last = arr[n-1];

//         for(int i=n-1; i>0; i--)
//             arr[i] = arr[i-1];
        
//         arr[0] = last;

//         System.out.println("Rotated array :");
//         for(int num : arr) System.out.print(num + " ");

//     }
// }

//34 -> Check Palindrome String
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String rev = "";
//         for(int i=str.length()-1; i>=0; i--)
//             rev += str.charAt(i);
//         System.out.println(str.equals(rev)? "Palindrome" : "Not Palindrome");    
//     }
// }

//35 -> Count Number of Digits
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int count = 0;
//         while(n != 0){
//             n /= 10;
//             count++;
//         }
//         System.out.println("Digits = " + count);
//     }
// }

//36 -> Sum of Elements in Array
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter size of an array : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("enter array elements : ");
//         for(int i=0; i<n; i++) arr[i] = sc.nextInt();
//         int sum = 0;
//         for(int i=0; i<n; i++){
//             sum += arr[i];
//         }
//         System.out.println("Sum is : " + sum);
//     }
// }

//37 -> Find Minimum Element in Array
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter size of an array : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("enter array elements : ");
//         for(int i=0; i<n; i++) arr[i] = sc.nextInt();
//         int min = Integer.MAX_VALUE;
//         for(int i=0; i<n; i++){
//             if(arr[i] < min)
//                 min = arr[i];
//         }
//         System.out.println("Minimum element : " + min);
//     }
// }

//38 -> Pattern Printing (Right Triangle)
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         char ch = '*';
//         for(int i=0; i<n; i++){
//             for(int j=0; j<=i; j++){
//                 System.out.print(ch);
//             }
//             System.out.println();
//         }
//     }
// }

//39 -> Power of a Number
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter base value : ");
//         int base = sc.nextInt();
//         System.out.print("enter exponent value : ");
//         int exp = sc.nextInt();
//         int result = 1;
//         for(int i=1; i<=exp; i++)
//             result *= base;
//         System.out.println(result);    
//     }
// }

//40 -> Decimal to Binary

//4 -> Fibonacci
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter no of terms : ");
//         int n = sc.nextInt();
//         int a = 0, b = 1;
//         for(int i=0; i<n; i++){
//             System.out.print(a + " ");
//             int c = a + b;
//             a = b;
//             b = c;
//         }
//     }
// }

//5 -> Reverse a number
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
//         while(n!=0){
//             rev = rev * 10 + n % 10;
//             n /= 10;
//         }
//         System.out.println(temp == rev? "Palindrome" : "Not Palindrome");
//     }
// }

// //7 -> Armstrong Number
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int temp = n;
//         int sum = 0;
//         while(n!=0){
//             int digit = n % 10;
//             sum += digit * digit * digit;
//             n /= 10;
//         }
//         System.out.println(sum == temp? "Armstrong" : "not Armstrong");
//     }
// }

//8 -> Sum of Digits
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         while(n!=0){
//             int rem = n % 10;
//             sum += rem;
//             n /= 10;
//         }
//         System.out.println("Sum of Digits : " + sum);
//     }
// }

//9 -> Largest of Three Numbers
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
//         int largest = Math.max(a, Math.max(b, c));
//         System.out.println("largest : " + largest);
//     }
// }

//10 -> GCD of Two Numbers
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         while(b!=0){
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         System.out.println("GCD : " + a);
//     }
// }

//11 -> LCM of Two Numbers
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt(), b = sc.nextInt();
//         int x = a, y = b;
//         while(b!=0){
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         int LCM = (x * y)/a;
//         System.out.println("LCM : " + LCM);
//     }
// }

//12 -> Check Leap Year
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int year = sc.nextInt();
//         if((year%4 == 0 && year%100 != 0) || (year%400 == 0))
//             System.out.println("leap year");
//         else
//             System.out.println("not leap year");    
//     }
// }

//13 -> Count Vowels and Consonants
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         char[] arr = str.toLowerCase().toCharArray();
//         int vowel = 0, consonant = 0;
//         for(char ch : arr){
//             if(Character.isLetter(ch)){
//                 if("aeiou".indexOf(ch) != -1){
//                     vowel++;
//                 }
//                 else
//                     consonant++;
//             }
//         }
//         System.out.println("Vowel : " + vowel + ", Consonent : " + consonant);
//     }
// }

//14 -> Reverse a String
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter string : ");
//         String str = sc.nextLine();
//         String rev = "";
//         for(int i=str.length()-1; i>=0; i--)
//             rev += str.charAt(i);
//         System.out.println(rev);
//     }
// }

//15 -> Check Anagram
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String a = sc.nextLine().toLowerCase().trim(), b = sc.nextLine().toLowerCase().trim();
//         char[] arr1 = a.toCharArray();
//         char[] arr2 = b.toCharArray();
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);
//         System.out.println(Arrays.equals(arr1, arr2)? "Anagram" : "not Anagram");
//     }
// }

//16 -> Remove Duplicates from String
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the string : ");
//         String str = sc.nextLine();
//         String result = "";
//         for(char ch : str.toCharArray()){
//             if(result.indexOf(ch) == -1)
//                 result += ch;
//         }
//         System.out.println(result);
//     }
// }

//17 -> Find Second Largest in Array
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter size of an array : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("enter array elements : ");
//         for(int i=0; i<n; i++) arr[i] = sc.nextInt();
//         int n1 = Integer.MIN_VALUE, n2 = Integer.MIN_VALUE;
//         for(int i=0; i<n; i++){
//             if(arr[i] > n1){
//                 // n1 = arr[i]; //caution
//                 // n2 = n1;
//                 n2 = n1;
//                 n1 = arr[i];
//             }
//             else if(arr[i] > n2 && arr[i] != n1){
//                 n2 = arr[i];
//             }
//         }
//         System.out.println("second largest : ");
//         System.out.println(n2);
//     }
// }

//18 -> Linear Search
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter siz of an array : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("enter array elements : ");
//         for(int i=0; i<n; i++) arr[i] = sc.nextInt();
//         System.out.print("enter key : ");
//         int key = sc.nextInt();
//         for(int i=0; i<n; i++){
//             if(arr[i] == key){
//                 System.out.println("found at index : i"); break;
//             }
//             else{
//                 System.out.println("not found"); break; 
//             }  
//         }
//     }
// }

//18 -> Linear Search
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the size of an array : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("enter array elements : ");
//         for(int i=0; i<n; i++) arr[i] = sc.nextInt();
//         System.out.print("enter key : ");
//         int key = sc.nextInt();
//         boolean found = false;
//         for(int num : arr){
//             if(key == num){
//                 found = true;
//                 break;
//             }
//         }
//         System.out.println(found? "found" : "not found");
//     }
// }

//19 -> Binary Search (Sorted Array)
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter size of an array : ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("enter array elements : ");
//         for(int i=0; i<n; i++) arr[i] = sc.nextInt();
//         System.out.print("enter key : ");
//         int key = sc.nextInt();
//         int start = 0 , end = n-1;
//         boolean found = false;
//         while(start <= end){
//             int mid = (start + end)/2;
//             if(arr[mid] == key){
//                 found = true;
//                 break;
//             }
//             else if(arr[mid] < key)
//                 start = mid + 1;
//             else
//                 end = mid - 1;    
//         }
//         System.out.println(found? "found" : "not found");
//     }
// }

//20 -> Bubble Sort
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter size of an array : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("enter array elements : ");
//         for(int i=0; i<n; i++) arr[i] = sc.nextInt();
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n-i-1; j++){
//                 if(arr[j] > arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//         for(int num : arr)
//             System.out.print(num + " ");
//     }
// }

//21 -> Selection Sort
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter array size : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("enter array elements : ");
//         for(int i=0; i<n; i++) arr[i] = sc.nextInt();
//         for(int i=0; i<n-1; i++){
//             int midIndex = i;
//             for(int j=i+1; j<n; j++){
//                 if(arr[j] < arr[midIndex])
//                     midIndex = j;
//             }
//             int temp = arr[i];
//             arr[i] = arr[midIndex];
//             arr[midIndex] = temp;
//         }
//         for(int num : arr) System.out.print(num + " ");
//     }
// }

//22 -> Insertion sort
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter array size : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("enter array elements : ");
//         for(int i=0; i<n; i++) arr[i] = sc.nextInt();
//         for(int i=1; i<n; i++){
//             int temp = arr[i];
//             int j = i-1;
//             while(j>=0 && arr[j] > temp){
//                 arr[j+1] = arr[j];
//                 j--;
//             }
//             // System.out.println(j); 
//             arr[j+1] = temp;
//         }
//         for(int num : arr) System.out.print(num + " ");
//     }
// }

//23 -> Matrix Addition
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter row and column : ");
//         int r = sc.nextInt();
//         int c = sc.nextInt();

//         int[][] arr1 = new int[r][c];
//         int[][] arr2 = new int[r][c];

//         System.out.println("enter first array element");
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 arr1[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("enter second array element");
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 arr2[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("Sum : ");
//         int[][] sum = new int[r][c];
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 sum[i][j] = arr1[i][j] + arr2[i][j];
//                 System.out.print(sum[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//24 -> Transpose of Matrix
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter row and column : ");
//         int r = sc.nextInt();
//         int c = sc.nextInt();
//         int[][] arr = new int[r][c];
//         System.out.println("enter array elements : ");
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("transpose");
//         for(int j=0; j<c; j++){
//             for(int i=0; i<r; i++){
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//25 -> Count Frequency of Element in Array
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter size of array : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("enter array elements : ");
//         for(int i=0; i<n; i++) arr[i] = sc.nextInt();
//         int key = sc.nextInt();
//         int count = 0;
//         for(int i=0; i<n; i++){
//             if(arr[i] == key)
//                 count++;
//         }
//         System.out.println("frequency of " + key + " is " + count);
//     }
// }

//26 -> Check if Array is Sorted
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0; i<n; i++) arr[i] = sc.nextInt();
//         boolean sorted = true;
//         for(int i=0; i<n-1; i++){
//             if(arr[i] > arr[i+1])
//                 sorted = false;
//                 break;
//         }
//         System.out.println(sorted? "sorted" : "not sorted");
//     }
// }

//27 -> Merge Two Arrays
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter size of both arrays : ");
//         int n1 = sc.nextInt();
//         int n2 = sc.nextInt();

//         int[] arr1 = new int[n1];
//         int[] arr2 = new int[n2];

//         System.out.println("enter 1st array elements : ");
//         for(int i=0; i<n1; i++) arr1[i] = sc.nextInt();
//         System.out.println("enter 2nd array elements : ");
//         for(int i=0; i<n2; i++) arr2[i] = sc.nextInt();

//         int[] merge = new int[n1+n2];
//         for(int i=0; i<n1; i++) merge[i] = arr1[i];
//         for(int i=0; i<n2; i++) merge[i+n1] = arr2[i];
//         System.out.println("merged array : ");
//         for(int num : merge) System.out.print(num + " ");
//     }
// }

//28 -> Find Missing Number (1 to N)

//29 -> Count Words in a String
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the String : ");
//         String str = sc.nextLine().trim();
//         if(str.isEmpty()){
//             System.out.println(0);
//         }else{
//             String[] words = str.split("\\s+");
//             System.out.println(words.length);
//         }
//         }
// }

//30 -> Remove All Spaces from String
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine().trim();
//         str = str.replaceAll(" ", "");
//         System.out.println(str);
//     }
// }

//31 -> Find Duplicate Elements in Array
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter array size : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("enter array elements : ");
//         for(int i=0; i<n; i++) arr[i] = sc.nextInt();
//         for(int i=0; i<n-1; i++){
//             for(int j=i+1; j<n; j++){
//                 if((arr[i] == arr[j]) && (j!=i)){
//                     System.out.print(arr[j] + " ");
//                 }
//             }
//         }
//     }
// }

//32 -> Move All Zeros to End
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0; i<n; i++) arr[i] = sc.nextInt();
//         int index = 0;
//         for(int i=0; i<n; i++){
//             if(arr[i] != 0)
//                 arr[index++] = arr[i];
//         }
//         while(index<n){
//             arr[index++] = 0;
//         }
//         System.out.println("final array : ");
//         for(int num : arr){
//             System.out.print(num + " ");
//         }
//     }
// }

//33 -> Rotate Array Right by 1 Position
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0; i<n; i++) arr[i] = sc.nextInt();
//         int last = arr[n-1];
//         for(int i=n-1; i>0; i--){
//             arr[i] = arr[i-1];
//         }
//         arr[0] = last;
//         for(int num : arr) System.out.print(num + " ");
//     }
// }

//34 -> Check Palindrome String
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         char[] arr = str.toCharArray();
//         String rev = "";
//         for(int i=str.length()-1; i>=0; i--){
//             rev += str.charAt(i);
//         }
//         System.out.print(str.equals(rev)? "palindrome" : "not palindrome");
//     }
// }

//35 -> Count Number of Digits
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int count = 0;
//         while(n!=0){
//             n /= 10;
//             count++;
//         }
//         System.out.print("count : " + count);
//     }
// }

//36 -> Sum of Elements in Array
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//     System.out.print("enter array size : ");
//     int n = sc.nextInt();
//     int[] arr = new int[n];
//     System.out.println("enter array elements : ");
//     for(int i=0; i<n; i++) arr[i] = sc.nextInt();
//     int sum = 0;
//     for(int num : arr){
//         sum += num;
//     }
//     System.out.print("sum : " + sum);
//     }
// }

//37 -> Find Minimum Element in Array
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter array size : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("enter array elements : ");
//         for(int i=0; i<n; i++) arr[i] = sc.nextInt();
//         int min = Integer.MAX_VALUE;
//         for(int i=0; i<n; i++){
//             if(arr[i] < min)
//                 min = arr[i];
//         }
//         System.out.print("minimum : " + min);
//     }
// }

//38 -> Pattern Printing (Right Triangle)
// class DsaDemo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter no of lines : ");
//         int n = sc.nextInt();
//         for(int i=0; i<n; i++){
//             for(int j=0; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//39 -> Power of a Number
class DsaDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base and exponent : ");
        int base = sc.nextInt();
        int exp = sc.nextInt();
        double result = 1;
        for(int i=0; i<exp; i++){
            result *= base;
        }
        System.out.print("result : " + result);
    }
}

//40 -> Decimal to Binary
