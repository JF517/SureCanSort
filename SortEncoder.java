import java.util.Random;
import java.util.ArrayList;

public class SortEncoder{

    private Random rand = new Random();

    public SortEncoder(){
        
    }

    public ArrayList<Integer> encode(ArrayList<Integer> input){

        int sortSignal = rand.nextInt(3);
        ArrayList<Integer> encodedInput = input;
        encodedInput.add(sortSignal);
        System.out.println(encodedInput.toString());

        return encodedInput;

    }
}