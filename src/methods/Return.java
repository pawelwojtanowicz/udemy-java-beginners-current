package methods;

public class Return {
    public static void main(String[] args) {
        int a = 11;

        exampleReturn(a);
        int valFromMethod = returnValue();
        System.out.println("val from method is: " + valFromMethod);
        //another way:
        System.out.println(returnValue());
        System.out.println(add(1, 2) + add(3, 4));
        System.out.println(add(add(1, 2), add(3, 4)));

    }

    public static void exampleReturn(int x) {

        if (x < 10) {
            return;
        } else
            System.out.println("this is a variable x: " + x);

    }

    public static int returnValue() {
        System.out.println("cos");
        return 34;
    }

    public static int add(int a, int b) {
        return a + b;
    }


}