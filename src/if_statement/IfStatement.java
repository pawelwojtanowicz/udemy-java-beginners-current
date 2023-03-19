package if_statement;

public class IfStatement {
    public static void main(String[] args) {
        System.out.println(1);

        if(false) {                  // condition false makes the whole if-statement false and doesn't execute code inside
            System.out.println(2);
        }

        if(true) {                  // condition true makes the whole if-statement true and execute code inside
            System.out.println("2'");
        }

        System.out.println(3);

        int a = -1; //it's good practise to put default value with "-" --> then we know that something is default when we expect plus value

        if (true) {
            //int a = 67; --> this variable is available only in this "if" scope - it could be better to declare it outside
            System.out.println(a);
        }
        else
            System.out.println("something");

    }
}