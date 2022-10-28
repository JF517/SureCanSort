import java.util.ArrayList;

public class TestingGround {

public static void main(String[] args) {
    
SortEncoder tester = new SortEncoder();

ArrayList<Integer> inp1 = new ArrayList<Integer>(3);
inp1.add(1);
inp1.add(2);
inp1.add(32);

tester.encode(inp1);

}
}