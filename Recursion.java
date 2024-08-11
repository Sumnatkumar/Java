// import java.util.*;

// public class Recursion
// {
//     public static void printNumb(int n)
//     {
//         if (n == 6)
//         {
//             return;
//         }
//         System.out.println(n);
//         printNumb(n+1);
//     }

//     public static void main (String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Value of N: ");
//         int n = sc.nextInt();
//         printNumb(n);
//     }
// }

// import java.util.*;
// public class Recursion {
//     public static void printSum (int i, int n, int sum) {
//     if (i == n) {
//         sum += i;
//         System.out.println(sum);
//         return;
//     }

//     sum += i;
//     printSum(i+1 , n, sum);
//     System.out.println(i);
//     }
//     public static void main (String[] args) {
//         printSum(1, 5, 0);
//     }
// }


// import java.util.*;
// public class Recursion {
//     public static void printSum(int i, int n, int sum) {
//         if (i > n) { 
//             System.out.println(sum);
//             return;
//         }
//         sum += i;
//         if (i == n) { 
//             System.out.println(sum);
//             return;
//         }
//         printSum(i + 1, n, sum);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = sc.nextInt();
//         printSum(1, n, sum);  
//     }
// }


// import java.util.*;

// public class Recursion {
//     public static int factorial(int n) {
//         int result = 1;
//         for (int i = 1; i <= n; i++) {
//             result *= i;
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         int fact = factorial(n);
//         System.out.println("Factorial of " + n + " is: " + fact);
//     }
// }


// import java.util.*;

// public class Recursion {
//     public static int factorial(int n) {
//         if (n == 0) {
//             return 1;
//         } else {
//             return n * factorial(n - 1);
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         int fact = factorial(n);
//         System.out.println("Factorial of " + n + " is: " + fact);
//     }
// }


// import java.util.*;

// public class Recursion
// {
//     public static int calcfactorial (int n)
//     {
//         if (n == 1 || n == 0) {
//             return 1;
//         }
//         int fact_nm1 = calcfactorial(n - 1);
//         int fact_n = n * fact_nm1;
//         return fact_n;
//     }

//     public static void main (String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Value: ");
//         int n = sc.nextInt();
//         int ans = calcfactorial(n);
//         System.out.println(ans);
//     }
// }

// import java.util.*;
// public class Recursion
// {
//     public static void printFib(int a, int b, int n)
//     {
//         if(n == 0)
//         {
//             return;
//         }
//         int c = a + b;
//         System.out.println(c);
//         printFib(b, c, n-1);
//     }

//     public static void main (String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int a = 0, b = 1;
//         System.out.println(a);
//         System.out.println(b);
//         int n = 7;
//         printFib(a, b, n-2);
//     }
// }


// import java.util.*;

// public class Recursion {
//     public static void printFibonacci(int n) {
//         int a = 0, b = 1;
//         System.out.print("Fibonacci Series: " + a + " " + b);

//         for (int i = 2; i < n; i++) {
//             int c = a + b;
//             System.out.print(" " + c);
//             a = b;
//             b = c;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of terms: ");
//         int n = sc.nextInt();
//         printFibonacci(n);
//     }
// }

// import java.util.*;
// public class Recursion {
//     public static int power(int x, int n) {
//         int result = 1;
//         for (int i = 0; i < n; i++) {
//             result *= x;
//         }
//         return result;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter base (x): ");
//         int x = sc.nextInt();
//         System.out.print("Enter exponent (n): ");
//         int n = sc.nextInt();

//         int result = power(x, n);
//         System.out.println(x + "^" + n + " = " + result);
//     }
// }


// import java.util.*;
// public class Recursion
// {
//     public static int calcPower(int x, int n)
//     {
//         if(n == 0){
//             return 1;
//         }
//         if(x == 0){
//             return 0;
//         }
//         // int xPownm1 = calcPower(x, n-1);
//         // int xPown = x * xPownm1;
//         // return xPown;
//         //if n is even
//         if(n % 2 == 0) {
//             return calcPower(x, n/2) * calcPower(x, n/2);
//         }
//         else { // n is odd
//             return calcPower(x, n/2) * calcPower(x, n/2) * x;
//         }
//     }
//     public static void main (String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int n = sc.nextInt();
//         int ans = calcPower(x, n);
//         System.out.println(ans);
//     }
// }

// import java.util.*;
// public class Recursion
// {
//     public static void towerOfHanoi(int n, String src, String helper, String dest)
//     {
//         if(n == 1)
//         {
//             System.out.println("transfer disk "+ n + " from "+src+ " to "+dest);
//             return;
//         }
//         towerOfHanoi(n-1, src, dest, helper);
//         System.out.println("transfer disk "+ n + " from "+src+ " to "+dest);
//         towerOfHanoi(n-1, helper, src, dest);
//     }

//     public static void main (String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value: ");
//         int n = sc.nextInt();
//         towerOfHanoi(n, "S", "H", "D");
//     }
// }
// import java.util.*;
// public class Recursion
// {
//     public static void printRev(String str, int idx)
//     {
//         if(idx == 0)
//         {
//             System.out.print(str.charAt(idx));
//             return;
//         }
//         System.out.print(str.charAt(idx));
//         printRev(str, idx-1);
//     }
//     public static void main (String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the String: ");
//         String str = sc.next();
//         printRev(str, str.length() - 1);
//     }
// }

// import java.util.*;
// public class Recursion
// {
//     public static int first = -1;
//     public static int last = -1;

//     public static void findOccurence(String str, int idx, char element) {
//         if(idx == str.length()) {
//             System.out.println(first);
//             System.out.println(last);
//             return;
//         }

//         char currChar = str.charAt(idx);
//         if(currChar == element) {
//             if(first == -1) {
//                 first = idx;
//             } else {
//                 last = idx;
//             }
//         }
//     findOccurence(str, idx+1, element);
//     }
//     public static void main (String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the String: ");
//         String str = sc.next();
//         findOccurence(str, 0, 'a');
//     }
// }

// import java.util.*;
// public class Recursion
// {
//     public static boolean isSorted(int arr[], int idx)
//     {
//         if(idx == arr.length - 1) {
//             return true;
//         }

//         if(arr[idx] >= arr[idx+1]) {
//             return false;
//         } 
//         return isSorted(arr, idx+1);
//     }

//     public static void main (String[] args) 
//     {
//         int arr[] = {1, 3, 3};
//         System.out.println(isSorted(arr, 0));
//     }
// }

// import java.util.*;

// public class Recursion
// {
//     public static void moveAllX(String str, int idx, int count, String newString) {
//         if(idx == str.length()) {
//             for(int i=0; i<count; i++) {
//                 newString += 'x';
//             }
//             System.out.println(newString);
//             return;
//         }

//         char currChar = str.charAt(idx);
//         if(currChar == 'x') {
//             count++;
//             moveAllX(str, idx+1, count, newString);
//         } else {
//             newString += currChar;
//             moveAllX(str, idx+1, count,newString);
//         }
//     }
//     public static void main (String[] args) {
//         String str = "axbcxxd";
//         moveAllX(str, 0, 0, "");
//     }
// }

// import java.util.*;

// public class Recursion
// {
//     public static boolean[] map = new boolean[26];
//     public static void removeDuplicates(String str, int idx, String newString)
//     {
//         if(idx == str.length()) {
//             System.out.println(newString);
//             return;
//         }
//         char currChar = str.charAt(idx);
//         if(map[currChar - 'a']) {
//             removeDuplicates(str, idx+1, newString);
//         } else {
//             newString += currChar;
//             map[currChar - 'a'] = true;
//             removeDuplicates(str, idx+1, newString);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "abbccda";
//         removeDuplicates(str, 0, "");
//     }
// }


// class Recursion {
//     public int removeDuplicates(int[] nums) {
//         if (nums.length == 0) {
//             return 0;
//         }
//         return removeDuplicatesHelper(nums, 1, 1);
//     }
//     private int removeDuplicatesHelper(int[] nums, int index, int uniqueIndex) {
//         if (index == nums.length) {
//             return uniqueIndex;
//         }
//         if (nums[index] != nums[index - 1]) {
//             nums[uniqueIndex] = nums[index];
//             uniqueIndex++;
//         }
//         return removeDuplicatesHelper(nums, index + 1, uniqueIndex);
//     }
//     public static void main(String[] args) {
//         Recursion solution = new Recursion();
//         int[] nums = {1, 1, 2, 3, 3, 4, 4, 5};
//         int length = solution.removeDuplicates(nums);
//         System.out.println("The array after removing duplicates:");
//         for (int i = 0; i < length; i++) {
//             System.out.print(nums[i] + " ");
//         }
//         System.out.println("\nNew length of the array: " + length);
//     }
// }

// import java.util.*;
// public class Recursion
// {
//     public static void subsequences(String str, int idx, String newString, HashSet<String> set)
//     {
//         if(idx == str.length()) {
//             if(set.contains(newString)) {
//                 return;
//             } else {
//                 System.out.println(newString);
//                 set.add(newString);
//                 return;
//             }
//         }
//         char currChar = str.charAt(idx);

//         subsequences(str, idx+1, newString + currChar, set);

//         subsequences(str, idx+1, newString, set);
//     }

//     public static void main(String[] args) {
//         String str = "aaa";
//         HashSet<String> set = new HashSet<>();
//         subsequences(str, 0, "", set);
//     }
// }


// import java.util.ArrayList;
// import java.util.List;

// public class Recursion {

//     // Method to generate all subsequences of a string
//     public List<String> generateSubsequences(String str) {
//         List<String> subsequences = new ArrayList<>();
//         generateSubsequencesHelper(str, "", 0, subsequences);
//         return subsequences;
//     }

//     // Recursive helper method
//     private void generateSubsequencesHelper(String str, String current, int index, List<String> subsequences) {
//         // Base case: If we've gone through all the characters in the string
//         if (index == str.length()) {
//             subsequences.add(current);
//             return;
//         }

//         // Exclude the current character and move to the next
//         generateSubsequencesHelper(str, current, index + 1, subsequences);

//         // Include the current character and move to the next
//         generateSubsequencesHelper(str, current + str.charAt(index), index + 1, subsequences);
//     }

//     public static void main(String[] args) {
//         Recursion solution = new Recursion();
//         String input = "abc";

//         List<String> subsequences = solution.generateSubsequences(input);

//         System.out.println("The subsequences of the string \"" + input + "\" are:");
//         for (String subsequence : subsequences) {
//             System.out.println(subsequence);
//         }
//     }
// }

// import java.util.ArrayList;
// import java.util.List;

// public class Recursion {

//     public static List<String> generateSubsequences(String str) {
//         List<String> subsequences = new ArrayList<>();
//         int n = str.length();

//         // Iterate over all possible combinations (2^n)
//         for (int i = 0; i < (1 << n); i++) {
//             StringBuilder subsequence = new StringBuilder();
            
//             // Check each bit of i
//             for (int j = 0; j < n; j++) {
//                 // If the jth bit of i is set, include str[j]
//                 if ((i & (1 << j)) != 0) {
//                     subsequence.append(str.charAt(j));
//                 }
//             }
//             subsequences.add(subsequence.toString());
//         }
        
//         return subsequences;
//     }

//     public static void main(String[] args) {
//         String str = "abc";
//         List<String> subsequences = generateSubsequences(str);

//         System.out.println("All subsequences of the string \"" + str + "\":");
//         for (String subsequence : subsequences) {
//             System.out.println(subsequence);
//         }
//     }
// }

// import java.util.*;

// public class Recursion {
//     public static String[] keypad = {".", "abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

//     public static void printComb(String str, int idx, String combination) {
//         if(idx == str.length()) {
//             System.out.println(combination);
//             return;
//         }

//         char currChar = str.charAt(idx);
//         String mapping = keypad[currChar - '0'];

//         for(int i=0; i<mapping.length(); i++) {
//             printComb(str, idx+1, combination+mapping.charAt(i));
//         }
//     }

//     public static void main(String[] args) {
//         String str = "4";
//         printComb(str, 0, "");
//     }
// }
// import java.util.*;
// public class Recursion
// {
//     public static void printPerm(String str, String permutation) {
//         if(str.length() == 0) {
//             System.out.println(permutation);
//             return;
//         }
//         for(int i = 0; i < str.length(); i++) {
//             char currChar = str.charAt(i);
//             String newStr = str.substring(0, i) + str.substring(i+1);
//             printPerm(newStr, permutation + currChar);
//         }
//     }

//     public static void main(String[] args) {
//         String str = "abc";
//         printPerm(str, "");
//     }
// }

// import java.util.*;
// public class Recursion
// {
//     public static int countPaths(int i, int j, int n, int m) {
//         if(i==n || j==m) {
//             return 0;
//         }
//         if(i== n - 1 && j == m - 1) {
//             return 1;
//         }
//         int downPaths = countPaths(i + 1, j , n , m);
//         int rightPaths = countPaths(i , j + 1 , n , m);
//         return downPaths + rightPaths;
//     }

//     public static void main (String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         int totalPaths = countPaths(0, 0, n, m);
//         System.out.println(totalPaths);
//     }
// }

// import java.util.*;
// public class Recursion {
//     public static int placeTiles(int n, int m) {
//         if(n == m) {
//             return 2;
//         }
//         if (n < m) {
//             return 1;
//         }

//         int vertPlacements = placeTiles(n-m, m);
//         int horPlacements = placeTiles(n - 1, m);

//         return vertPlacements + horPlacements;
//     }

//     public static void main (String[] args) {
//         int n = 4, m = 2;
//         System.out.println(placeTiles(n, m));
//     }
// }

// import java.util.*;
// public class Recursion {
//     public static int callGuests(int n) {
//         if(n <= 1) {
//             return 1;
//         }
//         //Single
//         int ways1 = callGuests(n - 1);
//         //pair
//         int ways2 = (n - 1) * callGuests(n - 2);
//         return ways1 + ways2;  
//     }
//     public static void main (String[] args) {
//         int n = 4;
//         System.out.println(callGuests(n));
//     }
// }

// import java.util.*;
// public class Recursion {
//     public static void printSubset(ArrayList<Integer> subset) {
//         for(int i = 0; i<subset.size(); i++) {
//             System.out.print(subset.get(i)+" ");
//         }
//         System.out.println();
//     }
//     public static void findSubsets(int n, ArrayList<Integer> subset) {
//         if(n == 0) {
//             printSubset(subset);
//             return;
//         }

//         //add hoga
//         subset.add(n);
//         findSubsets(n-1, subset);

//         //add nahi hoga
//         subset.remove(subset.size() - 1);
//         findSubsets(n - 1, subset);  
//     }

//     public static void main(String[] args) {
//         int n = 3;
//         ArrayList<Integer> subset = new ArrayList<>();
//         findSubsets(n, subset);
//     }
// }


