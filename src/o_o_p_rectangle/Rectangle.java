package o_o_p_rectangle;

public class Rectangle {

    public void setHeight(int h) {      //if public --> access in others classes
        if (h > 0)                      //this is good to prevent to not use -(minus)number
            height = h;
    }

    //encapsulation --> closing the part of code in the class --> private
    //practice : variables --> private, methods --> public
    private int height = 1;
    private int width = 1;              //if private --> no access in others classes

    private int number = 111;



    public void setWidth(int w) {       //if public --> access in others classes
        if (w > 0)                      //this is good to prevent to not use -(minus)number
            width = w;
    }


    public void setNumber(int n) {
            number = n;
    }
    public int getNumber() {
        return number;
    }

}