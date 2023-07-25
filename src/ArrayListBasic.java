import java.util.ArrayList;

public class ArrayListBasic {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();

        myList.add("first");
        myList.add("second");
        myList.add("third");

    for(int a = 0; a < myList.size(); a++){
        System.out.println(myList.get(a));
    }

    myList.set(1, "new one");

    for(int a = 0; a < myList.size(); a++){
        System.out.println(myList.get(a));
    }

    }
}
