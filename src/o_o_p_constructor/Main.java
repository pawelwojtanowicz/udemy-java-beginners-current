package o_o_p_constructor;

public class Main {
    public static void main(String[] args) {

        ConstructorSample sample1 = new ConstructorSample(2, 4);

        ConstructorSample sample2 = new ConstructorSample(9, 3);

        System.out.println("height 1 is: " + sample1.getHeight() + " and width 1 is: " + sample1.getWidth());
        System.out.println("height 2 is: " + sample2.getHeight() + " and width 2 is: " + sample2.getWidth());


    }


}