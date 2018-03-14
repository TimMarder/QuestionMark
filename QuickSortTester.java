public class QuickSortTester{

    
    public static void main(String[] args){


	//testing mechanism: uses right index as the pvtPos on unsorted array

	int sizeURS = 1; //U = unsorted, RS = rightside pvt
	while(sizeURS<=100){
	    long time = 0;
	    int counter = 0;
	    long total = 0;

	    int[] tester =  QuickSort.buildArray(sizeURS,sizeURS*10);

	    while(counter<1000){
		long startTime = System.nanoTime();		
		QuickSort.qsort(tester);
		long endTime = System.nanoTime() - startTime;
		total += endTime;
		counter++;	      
	    }
	    System.out.println( sizeURS + " ," + (total/1000));
	    
	    sizeURS++;

	}
		//System.out.println("==========BREAK===========");
	//////////////////////////////////////////////////////////////////////

	//testing mechanism: uses right index as the pvtPos on sorted ascending array

	int sizeARS = 1; //A = sorted ascending, RS = rightside pvt
	while(sizeARS<=100){
	    long time = 0;
	    int counter = 0;
	    long total = 0;

	    int[] tester =  QuickSort.buildSortedAscArr(sizeARS);

	    while(counter<1000){
		long startTime = System.nanoTime();		
		QuickSort.qsort(tester);
		long endTime = System.nanoTime() - startTime;
		total += endTime;
		counter++;	      
	    }
	    System.out.println( sizeARS + " ," + (total/1000));
	    
	    sizeARS++;


	}


	
	System.out.println("==========BREAK===========");
	///////////////////////////////////////////////////////////////////////


	//testing mechanism: uses right index as the pvtPos on sorted descending array

	int sizeDRS = 1; //D = sorted descending, RS = rightside pvt
	while(sizeDRS<=100){
	    long time = 0;
	    int counter = 0;
	    long total = 0;

	    int[] tester =  QuickSort.buildSortedDescArr(sizeDRS);

	    while(counter<1000){
		long startTime = System.nanoTime();		
		QuickSort.qsort(tester);
		long endTime = System.nanoTime() - startTime;
		total += endTime;
		counter++;	      
	    }
	    System.out.println( sizeDRS + " ," + (total/1000));
	    
	    sizeDRS++;


	}



	System.out.println("==========BREAK===========");
	///////////////////////////////////////////////////////////////////////


	//testing mechanism: uses random index as the pvtPos on unsorted array
	int sizeUR = 1; //U = unsorted,  R = random Pvt
	while(sizeUR<=100){
	    long time = 0;
	    int counter = 0;
	    long total = 0;

	    int[] tester =  QuickSort.buildArray(sizeUR,sizeUR*10);

	    while(counter<1000){
		long startTime = System.nanoTime();

		
		QuickSort.qsortR(tester);

		long endTime = System.nanoTime() - startTime;

		total += endTime;
		counter++;
	      
	    }

	    System.out.println( sizeUR + " ," + (total/1000));
	    
	    sizeUR++;


	}

	System.out.println("==========BREAK===========");

	///////////////////////////////////////////////////////////////////////


	//testing mechanism: uses random index as the pvtPos on sorted ascending arr
	int sizeAR = 1;// A = ascending, R = random Pvt
	while(sizeAR<=100){
	    long time = 0;
	    int counter = 0;
	    long total = 0;

	    int[] tester =  QuickSort.buildSortedAscArr(sizeAR);

	    while(counter<1000){
		long startTime = System.nanoTime();		
		QuickSort.qsortR(tester);
		long endTime = System.nanoTime() - startTime;
		total += endTime;
		counter++;	      
	    }

	    System.out.println( sizeAR + " ," + (total/1000));
	    
	    sizeAR++;


	}
	



	System.out.println("==========BREAK===========");
	///////////////////////////////////////////////////////////////////////

	
	//testing mechanism: uses random index as the pvtPos on sorted descending arr
	int sizeDR = 1;// D = descending, R = random Pvt
	while(sizeDR<=100){
	    long time = 0;
	    int counter = 0;
	    long total = 0;

	    int[] tester =  QuickSort.buildSortedDescArr(sizeDR);

	    while(counter<1000){
		long startTime = System.nanoTime();		
		QuickSort.qsortR(tester);
		long endTime = System.nanoTime() - startTime;
		total += endTime;
		counter++;	      
	    }

	    System.out.println( sizeDR + " ," + (total/1000));
	    
	    sizeDR++;


	}

	System.out.println("==========BREAK===========");
	///////////////////////////////////////////////////////////////////////


	
    }//END MAIN METHOD


}
