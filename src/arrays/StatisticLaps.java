package arrays;

import java.util.Scanner;

public class StatisticLaps {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many laps: ");
        int lapsNumbers = scanner.nextInt();

        double[] laps = new double[lapsNumbers];

        for (int i = 0; i < lapsNumbers; i++) {
            System.out.print("Time in lap no. " + (i+1) + " : ");
            laps[i] = scanner.nextDouble();
        }

        double fastestTime = laps[0];

        for(int i=1; i < lapsNumbers; i++){
            if(laps[i]<fastestTime){
                fastestTime = laps[i];
            }
        }

        System.out.println("Yor fastest time is: " + fastestTime);
    }
}