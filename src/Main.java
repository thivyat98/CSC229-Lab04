public class Main {

    public static void main(String[] args) {
        countdown(5);

    }
    public static void countDown(int num)

        {

            if (num == 0) // test

                System.out.println("Blastoff!");

            else {
                if (num % 2 == 0) {

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
}