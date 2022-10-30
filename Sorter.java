import java.util.ArrayList;

public class Sorter {

    private int[] toSort;
    private int sortSelect = -1;

    public Sorter(){

    }

    public void loadSorter(ArrayList<Integer> input){

        this.sortSelect = input.get(input.size()-1);
        input.remove(input.size()-1);
        this.toSort = new int[input.size()];

        System.out.println(sortSelect);

        for(int i = 0; i < toSort.length; i++){
            this.toSort[i] = input.get(i);
        }
    }

    public int[] runSorter(){
        if(sortSelect == 0) return selectionSort();
        else if(sortSelect == 1) return bubbleSort();
        else if(sortSelect == 2) return insertionSort();
        else if(sortSelect == 3) return gnomeSort();
        else return toSort;
    }

    public int[] selectionSort(){

        int[] selSort = toSort;
        int n = selSort.length;

        for (int i = 0; i < n-1; i++){
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (selSort[j] < selSort[min_idx])
                    min_idx = j;
                    int temp = selSort[min_idx];
            selSort[min_idx] = selSort[i];
            selSort[i] = temp;
        }
        
        return selSort;
    }
    
    public int[] bubbleSort(){

         int[] bubSort = toSort;
         int n = bubSort.length;
        
         for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (bubSort[j] > bubSort[j + 1]) {
                    int temp = bubSort[j];
                    bubSort[j] = bubSort[j + 1];
                    bubSort[j + 1] = temp;
    }
    return bubSort;
    
}
    public int[] insertionSort(){
        int[] insSort = toSort;
        int n = insSort.length;

        for (int i = 1; i < n; ++i) {
            int key = insSort[i];
            int j = i - 1;

            while (j >= 0 && insSort[j] > key) {
                insSort[j + 1] = insSort[j];
                j = j - 1;
            }
            insSort[j + 1] = key;
        }

        return insSort;

    }
    
    public int[] gnomeSort()
    {
        int[] gnSort = toSort;
        int n = gnSort.length;
        int index = 0;
  
        while (index < n) {
            if (index == 0)
                index++;
            if (gnSort[index] >= gnSort[index - 1])
                index++;
            else {
                int temp = 0;
                temp = gnSort[index];
                gnSort[index] = gnSort[index - 1];
                gnSort[index - 1] = temp;
                index--;
            }
        }
        return gnSort;
    }

}
