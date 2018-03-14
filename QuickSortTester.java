import java.io.*;

public class QuickSortTester{

    
    public static void main(String[] args){
	/***
   long timeEnd;
    long timeStart;
    int ARRAY_SIZE = 1000;
    int target;
    int[][] array;
    System.out.println("Working...");
    String loadingBar;

    try(FileWriter fw = new FileWriter(filename, true);
          BufferedWriter bw = new BufferedWriter(fw);
          PrintWriter out = new PrintWriter(bw)) {
        out.println( "TRIAL,ARRAY_SIZE,TIME");
      } catch (IOException e) {
        e.printStackTrace();
      }
    for(int trial = 0; trial < 100; trial++) {
      // RUN TESTS 
      ARRAY_SIZE += 10;
      array = populate(ARRAY_SIZE);
      //start timer
      timeStart = System.currentTimeMillis();
      //start testing
      for(int i = 0; i < 100000; i++) {
        target = (int) (Math.random() * 5000.0);
        MatrixFinder.locateCoord(array, target);
      }
      timeEnd = System.currentTimeMillis();

      // LOG TIME TO CSV
      try(FileWriter fw = new FileWriter(filename, true);
          BufferedWriter bw = new BufferedWriter(fw);
          PrintWriter out = new PrintWriter(bw)) {
        out.println(trial + "," + ARRAY_SIZE + "," + (timeEnd - timeStart));
      } catch (IOException e) {
        e.printStackTrace();
      }
***/


	
	//testing mechanism: uses right index as the pvtPos on unsorted array
	try(FileWriter fw = new FileWriter("UnsortedRightPVT.csv", true);
	    BufferedWriter bw = new BufferedWriter(fw);
	    PrintWriter out = new PrintWriter(bw)) {
	    out.println( "TRIAL,ARRAY_SIZE,TIME");
	} catch (IOException e) {
	    e.printStackTrace();
	}
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

	    try(FileWriter fw = new FileWriter("UnsortedRightPVT.csv", true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter out = new PrintWriter(bw)) {
		out.println(sizeURS + "," + total);
	    } catch (IOException e) {
		e.printStackTrace();
	    }
	     
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
