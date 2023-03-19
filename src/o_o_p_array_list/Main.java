package o_o_p_array_list;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//---comparison array and ArrayList---

        String[] stringArray = new String[5];               //--> stringArray [null, null, null, null, null]
        stringArray[0] = "cat";                             //--> stringArray ["cat", null, null, null, null]
        stringArray[1] = "dog";                             //--> stringArray ["cat"", "dog", null, null, null]
        stringArray[2] = "horse";                           //--> stringArray ["cat"", "dog", "horse", null, null]
        stringArray[1] = null;                              //--> stringArray ["cat"", null, "horse", null, null]


        ArrayList<String> stringArrayList = new ArrayList<String>();    //--> stringArrayList [];
        stringArrayList.add("cat");                                     //--> stringArrayList ["cat"];
        stringArrayList.add("dog");                                     //--> stringArrayList ["cat", "dog"];
        stringArrayList.add("horse");                                   //--> stringArrayList ["cat", "dog", "horse"];
        stringArrayList.remove(1);                                  //--> stringArrayList ["cat", "horse"];
        stringArrayList.add("dog");                                   //--> stringArrayList ["cat", "horse", "dog"];
        stringArrayList.remove("horse");                           //--> stringArrayList ["cat", "dog"];

        int dogNumber = stringArrayList.indexOf("dog");                //--> 1
        boolean isCat = stringArrayList.contains("cat");                //--> true
        boolean isFish = stringArrayList.contains("fish");              //--> false

        String getDog = stringArrayList.get(1);
        String getFirst = stringArrayList.get(0);

        stringArrayList.set(0, "owl");                                  //--> stringArrayList ["owl", "dog"];
        String getFirst2 = stringArrayList.get(0);

        int sizeBefore = stringArrayList.size();

        stringArrayList.clear();                                        //--> stringArrayList [];

        int sizeAfter = stringArrayList.size();

        System.out.println(dogNumber + " " + isCat + " " + isFish + " "
                            + getDog + " " + getFirst + " " + getFirst2 + " "
                            + sizeBefore + " " + sizeAfter);

    }


}