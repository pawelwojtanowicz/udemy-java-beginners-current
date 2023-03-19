package o_o_p_the_basics;

public class Main {
    public static void main(String[] args) {

        Thing thing = new Thing();
        thing.num = 5;
        thing.word = "hello";

        Thing thing2 = new Thing();
        thing2.num = 21;
        thing2.word = "whatever";

        System.out.println(thing.num + thing2.num);

        thing.doSomething();
        thing2.doSomething();



    }
}