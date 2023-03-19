package references;

public class References {
    public static void main(String[] args) {
        //in primitive types variable is stored directly
        int a = 10;
        a = 3;
        int b = a;

        //in references types variable contains address to eg. array
        int[] x = {1, 2};
        int[] y = x;
        // code above means that we copied address from x to y, in y we have now the same address to some array (here: {1, 2}
        y[0]=20; //that changes value in array in reference y and x - because the array is only one

        int[] d = someArray(x);

    }

    public static int[] someArray(int[] c) {
        c[0] = 1;
        return c;
    }
}