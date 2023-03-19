package arrays;

public class Arrays {
    public static void main(String[] args) {

        int[] numbers = {751, 29, 350, 7, 4192};

//        System.out.println(numbers[2]);


        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("---------------------");

        for (int index : numbers)
            System.out.println(index);

        System.out.println("---------------------");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        System.out.println("---------------------");

        int count = 0;
        double sumNums = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 100) {
                System.out.println(numbers[i]);
                count++;
            }
            sumNums = sumNums + numbers[i];
        }
        System.out.println("number of numbers greater than 100: " + count);

        double mean = sumNums / numbers.length;
        System.out.println("The mean is: " + mean);

        double[] bar = new double[3]; // default double array has values 0.0
        System.out.println(bar[0] + " " + bar[1] + " " + bar[2]);
        bar[0] = 1.2;
        bar[1] = 2.4;
        bar[2] = 100.34;
        System.out.println(bar[0] + " " + bar[1] + " " + bar[2]);

        boolean[] foo = {true, false, false};

    }
}