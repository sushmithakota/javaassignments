import java.util.*;
public class quicksort 
{     
    private int array[];
    private int length;
    public void sort(int[] inputArr) 
    {
         
        if (inputArr == null || inputArr.length == 0) 
	{
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    } 
    private void quickSort(int lowerIndex, int higherIndex) {    
    int i = lowerIndex;
    int j = higherIndex; 
    int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];    
    while (i <= j) 
    {                        
	while (array[i] < pivot) 
               i++;
        while (array[j] > pivot) 
                j--;
        if (i <= j) 
	{
               exchangeNumbers(i, j);
                i++;
                 j--;
         }
    }
    if (lowerIndex < j)
           quickSort(lowerIndex, j);
    if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
     
    public static void main(String a[])
    {
    	long startTime = System.currentTimeMillis();
	//Stopwatch timer = new Stopwatch().start();    
	Scanner s=new Scanner(System.in);
	//System.out.println("enter the number of elements");
	//int n=s.nextInt();
	 int[] input = new int[5000];
	Random r=new Random();
	for(int i=0;i<5000;i++) 
		input[i]=r.nextInt(1000);
        quicksort sorter = new quicksort();
        sorter.sort(input);
       /* for(int i:input){
            System.out.print(i);
            System.out.print(" ");
	
        }*/
	long stopTime = System.currentTimeMillis();
      	double elapsedTime = (stopTime - startTime);
	System.out.println();
      	System.out.println(elapsedTime/10000);
	
    }
}
