package methods;

public class Methods {
    public static void main(String[] args) {

        somethingAls();

    }

    public static void somethingAls() {
        int y = 5;

        System.out.println("pawel");
        somethingMore(y, "hahahaha"); //y and 10 are arguments
        System.out.println("aga");
        somethingMore(12, "something");


    }

    public static void somethingMore(int x, String b) { //x and b are parameters

        System.out.println("Print x which is y in somethingAls method: " + x);
        System.out.println("Print b: " + b);
    }
}