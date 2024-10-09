package task7;
import java.util.ArrayList;

public class Array {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Aaaa");
        list.add("Bbbb");
        list.add("Cccc");
        list.add("Ddddd");

        System.out.println("ArrayList before removal: " + list);

        list.clear();

        System.out.println("ArrayList after removal: " + list);
    }
}

