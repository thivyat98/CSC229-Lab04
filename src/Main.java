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

            if (x % y == 0) //base case

                return y;

            else

                return gcd(y, x % y);

        }
        // Output: GCD: 6 


}