import java.io.*;

public class QuickSortTester{

    
    public static void main(String[] args){

	
	//testing mechanism: uses right index as the pvtPos on unsorted array
	try(FileWriter fw = new FileWriter("UnsortedRightPVT.csv", true);
	    BufferedWriter bw = new BufferedWriter(fw);
	    PrintWriter out = new PrintWriter(bw)) {
	    out.println( "SIZE,TIME");
	} catch (IOException e) {
	    e.printStackTrace();
	}
	int sizeURS = 1; //U = unsorted, RS = rightside pvt
	while(sizeURS<=1000){
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
	    //System.out.println( sizeURS + " ," + (total/1000));

	    try(FileWriter fw = new FileWriter("UnsortedRightPVT.csv", true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter out = new PrintWriter(bw)) {
		out.println(sizeURS + "," + (total/1000));
	    } catch (IOException e) {
		e.printStackTrace();
	    }
	     
	    sizeURS += 10;

	}
	////System.out.println("==========BREAK===========");
	//////////////////////////////////////////////////////////////////////

	//testing mechanism: uses right index as the pvtPos on sorted ascending array
	try(FileWriter fw = new FileWriter("AscendingRightPVT.csv", true);
	    BufferedWriter bw = new BufferedWriter(fw);
	    PrintWriter out = new PrintWriter(bw)) {
	    out.println( "SIZE,TIME");
	} catch (IOException e) {
	    e.printStackTrace();
	}
	int sizeARS = 1; //A = sorted ascending, RS = rightside pvt
	while(sizeARS<=1000){
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
	    //System.out.println( sizeARS + " ," + (total/1000));

	    try(FileWriter fw = new FileWriter("AscendingRightPVT.csv", true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter out = new PrintWriter(bw)) {
		out.println(sizeARS + "," + (total/1000));
	    } catch (IOException e) {
		e.printStackTrace();
	    }
	     
	    sizeARS += 10;


	}


	
	//System.out.println("==========BREAK===========");
	///////////////////////////////////////////////////////////////////////


	//testing mechanism: uses right index as the pvtPos on sorted descending array
	try(FileWriter fw = new FileWriter("DescendingRightPVT.csv", true);
	    BufferedWriter bw = new BufferedWriter(fw);
	    PrintWriter out = new PrintWriter(bw)) {
	    out.println( "SIZE,TIME");
	} catch (IOException e) {
	    e.printStackTrace();
	}
	int sizeDRS = 1; //D = sorted descending, RS = rightside pvt
	while(sizeDRS<=1000){
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
	    //System.out.println( sizeDRS + " ," + (total/1000));

	    try(FileWriter fw = new FileWriter("DescendingRightPVT.csv", true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter out = new PrintWriter(bw)) {
		out.println(sizeDRS + "," + (total/1000));
	    } catch (IOException e) {
		e.printStackTrace();
	    }

	    sizeDRS += 10;


	}



	//System.out.println("==========BREAK===========");
	///////////////////////////////////////////////////////////////////////


	//testing mechanism: uses random index as the pvtPos on unsorted array\
	try(FileWriter fw = new FileWriter("UnsortedRandomPVT.csv", true);
	    BufferedWriter bw = new BufferedWriter(fw);
	    PrintWriter out = new PrintWriter(bw)) {
	    out.println( "SIZE,TIME");
	} catch (IOException e) {
	    e.printStackTrace();
	}
	int sizeUR = 1; //U = unsorted,  R = random Pvt
	while(sizeUR<=1000){
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

	    //System.out.println( sizeUR + " ," + (total/1000));

	    try(FileWriter fw = new FileWriter("UnsortedRandomPVT.csv", true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter out = new PrintWriter(bw)) {
		out.println(sizeUR + "," + (total/1000));
	    } catch (IOException e) {
		e.printStackTrace();
	    }

	    
	    sizeUR += 10;


	}

	//System.out.println("==========BREAK===========");

	///////////////////////////////////////////////////////////////////////


	//testing mechanism: uses random index as the pvtPos on sorted ascending arr
	try(FileWriter fw = new FileWriter("AscendingRandomPVT.csv", true);
	    BufferedWriter bw = new BufferedWriter(fw);
	    PrintWriter out = new PrintWriter(bw)) {
	    out.println( "SIZE,TIME");
	} catch (IOException e) {
	    e.printStackTrace();
	}
	int sizeAR = 1;// A = ascending, R = random Pvt
	while(sizeAR<=1000){
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

	    //System.out.println( sizeAR + " ," + (total/1000));

	    try(FileWriter fw = new FileWriter("AscendingRandomPVT.csv", true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter out = new PrintWriter(bw)) {
		out.println(sizeAR + "," + (total/1000));
	    } catch (IOException e) {
		e.printStackTrace();
	    }

	    
	    sizeAR += 10;


	}
	



	//System.out.println("==========BREAK===========");
	///////////////////////////////////////////////////////////////////////

	
	//testing mechanism: uses random index as the pvtPos on sorted descending arr
	try(FileWriter fw = new FileWriter("DescendingRandomPVT.csv", true);
	    BufferedWriter bw = new BufferedWriter(fw);
	    PrintWriter out = new PrintWriter(bw)) {
	    out.println( "SIZE,TIME");
	} catch (IOException e) {
	    e.printStackTrace();
	}
	int sizeDR = 1;// D = descending, R = random Pvt
	while(sizeDR<=1000){
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

	    //System.out.println( sizeDR + " ," + (total/1000));

	    try(FileWriter fw = new FileWriter("DescendingRandomPVT.csv", true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter out = new PrintWriter(bw)) {
		out.println(sizeDR + "," + (total/1000));
	    } catch (IOException e) {
		e.printStackTrace();
	    }

	    
	    sizeDR += 10;


	}

	//System.out.println("==========BREAK===========");
	///////////////////////////////////////////////////////////////////////


	
    }//END MAIN METHOD


}
