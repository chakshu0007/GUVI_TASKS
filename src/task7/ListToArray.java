package task7;
import java.util.ArrayList;
import java.util.List;


public class ListToArray {

	    public static void main(String[] args) {
	     
	    	List<String> list = new ArrayList<>();
	        list.add("Aaaa");
	        list.add("Bbbb");
	        list.add("Cccc");
	        list.add("Dddd");

	        String[] array = new String[list.size()];
	        array = list.toArray(array);

	        System.out.println("Array elements:");
	        for (String alphabet : array) {
	            System.out.println(alphabet);
	        }
	    }
	}
