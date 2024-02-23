public class Main {

    public static void main(String[] args) {

       int [] arr = {1,2,3,4,5,6,7,8,9,10} ;
       itn target = 7;
       int result = binarySearch(arr, target, 0,arr.length - 1);

    }
    public static void countDown(int num)

        {
              // Task 01
            if (num == 0) // test

                System.out.println("Blastoff!");

            else {
                if (num % 2 == 0) {
                    //Modification of code where it only prints even numbers during countdown
                }

                System.out.println("...");

                countDown(num-1); // recursive call

            }
            //output of this code would be:
            // ...
            // ...
            // ...
            // ...
            // ...
            // Blastoff!

        }

        //Task02
        public static int gcd(int x, int y) {

            if (x == y){ //base case

                return x;
         }
              else if( x > y){
                return gcd(x - y, y);
            } else {
                 return gcd(x,y-x);
            }

            }
        // Output: GCD: 6

       //Task03
        int fib(int n)

        {

            if (n <= 0) // base case

                return 0;

            else if (n == 1) // base case

                return 1;

            else

                return fib(n–1) + fib(n–2);
            //Time complexity is O(2^n), function makes two additional recursive calls (fib(n-1)
            //and fib(n-2)) which creates a binary tree of recursive calls

        }
        //problem 1
           public static void printHello(int n) {
              if (n > 0) {
            System.out.println("Hello World");
            printHello(n-1);
        }
           }
           //problem2
           public static int sumMultiplesOf7(int n1, int n2 ) {
          if(n1 > n2) {
            return 0;
        }  else {
            int currentNumber = (n1 % 7 == 0) ? n1 : 0;
            return currentNumber + sumMultiplesOf7(n1+1, n2);
        }
           }
           //Problem 3
         public static int binarySearch(int[] arr, int target, int low , int high){
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target)
                return binarySearch(arr, target, mid + 1, high);
        }
        else {
            return binarySearch(arr, target, low, mid - 1);
        }

        return -1;
         }




        }