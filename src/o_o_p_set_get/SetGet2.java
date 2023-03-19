package o_o_p_set_get;

public class SetGet2 {

    private int numberSet;


    public void setNumber(int n) {
        numberSet = n;
    }

    public int getCalc() {
        return numberSet * 3;
    }

    public void printNumber() {
        System.out.println(numberSet);
    }

}