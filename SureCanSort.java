import java.util.ArrayList;
import java.util.Random;

public class SureCanSort {

    boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }


    public static void main(String[] args){
        Random rand = new Random();
        Sorter sorter = new Sorter();
        SortEncoder encoder = new SortEncoder();
        ArrayList<Integer> inp1 = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            int n = rand.nextInt(10);
            inp1.add(n);
        }
        ArrayList<Integer> encoded = encoder.encode(inp1);
        sorter.loadSorter(encoded);
        int[]


        
    }
    
}
