import java.util.Random;
import java.util.ArrayList;

public class SortEncoder{

    private int sortSignal = 0;
    private Random rand = new Random();
    private ArrayList<Integer> encodedInput;

    public SortEncoder(){
        this.sortSignal = rand.nextInt(10);
    }

    public void encode(ArrayList<Integer> input){

        ArrayList<Integer> encodedInput = input;
        this.encodedInput.add(this.sortSignal);

        System.out.println(input.toString());
        System.out.println(encodedInput.toString());



    }
}