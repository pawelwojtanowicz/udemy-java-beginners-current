package prime_numbers;

public class PrimeNumbers {
    public static void main(String[] args) {

        int num = 12;
        int upToNumber = 1000;
        int div;


        for (num = 2; num < upToNumber; num++) {
            boolean isPrime = true;


            for (div = 2; div <= Math.sqrt(num); div++)
                if (num % div == 0) {
                    isPrime = false;
                    break;
                }

            if (isPrime)
                System.out.println(num);


        }
    }


}