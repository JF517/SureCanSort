import java.util.ArrayList;

public class TestingGround {

public static void main(String[] args) {
    
SortEncoder tester = new SortEncoder();
Sorter sorter = new Sorter();

ArrayList<Integer> inp1 = new ArrayList<Integer>(3);
inp1.add(1);
inp1.add(2);
inp1.add(32);

ArrayList<Integer> encoded = tester.encode(inp1);
sorter.loadSorter(encoded);
int[] sorted = sorter.runSorter();
for (int i : sorted){
    System.out.print(i + " ");
}

}
}