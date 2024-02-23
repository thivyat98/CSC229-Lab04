public class Main {

    public static void main(String[] args) {
       int result = gcd(48,18);
       System.out.println("GCD: " + result);

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





        }