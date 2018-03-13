public class QuickSortTester{

    
    public static void main(String[] args){

	//testing mechanism: uses right index as the pvtPos

	int size = 1;
	while(size<=100){
	    long time = 0;
	    int counter = 0;
	    long total = 0;

	    int[] tester =  QuickSort.buildArray(size,size*10);

	    while(counter<10){
		long startTime = System.nanoTime();

		
		QuickSort.qsort(tester);

		long endTime = System.nanoTime() - startTime;

		total += endTime;
		counter++;
	      
	    }

	    System.out.println( size + " ," + (total/10));
	    
	    size++;


	}


	//testing mechanism: uses right index as the pvtPos

	int sizeR = 1;
	while(sizeR<=100){
	    long time = 0;
	    int counter = 0;
	    long total = 0;

	    int[] tester =  QuickSort.buildArray(size,size*10);

	    while(counter<1000){
		long startTime = System.nanoTime();

		
		QuickSort.qsortR(tester);

		long endTime = System.nanoTime() - startTime;

		total += endTime;
		counter++;
	      
	    }

	    System.out.println( sizeR + " ," + (total/1000));
	    
	    sizeR++;


	}
    }


}
