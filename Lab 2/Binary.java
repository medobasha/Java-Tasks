import java.util.Random;

class Search{
static void selectionSort(int array[])
    	{
	        int size = array.length;
        	for (int i = 0; i < size-1; i++)
        	{
            		int min = i;
            		for (int j = i+1; j < size; j++){
                		if (array[j] < array[min]){
                    			min = j;
				}
			}
        		int temp = array[min];
            		array[min] = array[i];
            		array[i] = temp;
    	  	  }
	  
   	 }
	
		
	public static void main(String args[]){
		int array[] = new int[1000];
		Random random = new Random();
		for(int i = 0; i < 1000; i++){
			array[i] = random.nextInt(1000);
		}
		int min = array[0], max = array[0];
		long nano_startTime = System.nanoTime();
      		long millis_startTime = System.currentTimeMillis();
		selectionSort(array);
		System.out.println("Max = "+array[999]);
		System.out.println("Min = "+array[0]);
		long nano_endTime = System.nanoTime();
        	long millis_endTime = System.currentTimeMillis();
		System.out.println("Time taken in nano seconds: "
                           + (nano_endTime - nano_startTime));
		System.out.println("Time taken in milli seconds: "
                           + (millis_endTime - millis_startTime));
	}
}