package o_o_p_rectangle;

public class Main {
    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle();
        rec1.setHeight(3);
        rec1.setWidth(2);                       //this is right to refers to method in other class


        Rectangle rec2 = new Rectangle();
        rec1.setHeight(3);
        rec2.setWidth(4);

        System.out.println("the number is: " + rec1.getNumber());

        rec1.setNumber(1234);
        System.out.println("the number is now: " + rec1.getNumber());



    }


}