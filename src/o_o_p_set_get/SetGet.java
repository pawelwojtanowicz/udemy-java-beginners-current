package o_o_p_set_get;

public class SetGet {
    public static void main(String[] args) {

        SetGet2 setGet2 = new SetGet2();

        setGet2.setNumber(4);

        int calcHere = setGet2.getCalc();
        System.out.println(calcHere);
        setGet2.printNumber();


    }
}