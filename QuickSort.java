//Bo Hui Lu
//APCS2 pd2
//HW18 -- QuickSort
//2018-03-13t
  
/*****************************************************
 * class QuickSort
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 * QSort(arr): 
1)If there is still a valid range to partition, use partition with
"right" argument as a pvtPos to make sure that we're partitioning just that side.
We should now have a pvtPos integer defined, as well as that pvtValue being
in the correct sorted position.

2)Repeat above step using recursion with smaller partitioned areas to left/right of pvtPos.
 *
 * 2a. Worst pivot choice and associated runtime: 
O(nlogn) : Everytime the pvtPos is chosen, it is one of/the next smallest integers in the
array. 

Assuming we use the rightside index as pvtPos. 
ex: {6,5,4,3} -> {3,6,5,4} -> {3,4,6,5} -> {3,4,5,6}
 *
 * 2b. Best pivot choice and associated runtime:
O(n) : Pivot is a number that is relatively close to the median of all the numbers in
array.

*Runs this many times, because it qsorts each paritioned area to the left/right of pvtPos
ex: {1,7,8,2,5} -> {1,2,5,7,8} -> {1,2,5,7,8} -> {1,2,5,7,8}  
 *
 * 3. Approach to handling duplicate values in array:
I don't think anything needs to be done to our working qsort for it to work with duplicates. Even if we don't have anything that directly accounts for duplicates, partition() 
would make sure it is in the right final position anyways, hence our code works fine 
without anything new added.
 *
 *****************************************************/
import java.util.Random;
public class QuickSort
{
    //--------------v  HELPER METHODS  v--------------
    //swap values at indices x, y in array o
    public static void swap( int x, int y, int[] o ) {
	int tmp = o[x];
	o[x] = o[y];
	o[y] = tmp;
    }

    //print input array 
    public static void printArr( int[] a ) {
	for ( int o : a )
	    System.out.print( o + " " );
	System.out.println("\n");
    }

    //shuffle elements of input array
    public static void shuffle( int[] d ) {
	int tmp;
	int swapPos;
	for( int i = 0; i < d.length; i++ ) {
	    tmp = d[i];
	    swapPos = i + (int)( (d.length - i) * Math.random() );
	    swap( i, swapPos, d );
	}
    }

    //return int array of size s, with each element fr range [0,maxVal)
    public static int[] buildArray( int s, int maxVal ) {
	int[] retArr = new int[s];
	for( int i = 0; i < retArr.length; i++ )
	    retArr[i] = (int)( maxVal * Math.random() );
	return retArr;
    }

    //returns array sorted in ascending order
    public static int[] buildSortedAscArr(int size){
	int[] rtrArr = new int[size];
	for(int i =0; i<size; i++){
	    rtrArr[i] = i;
	}
	return rtrArr;
    }

    //returns array sorted in descending order
    public static int[] buildSortedDescArr(int size){
	int[] rtrArr = new int[size];
	for(int i =0; i<size; i++){
	    rtrArr[i] = size-i;
	}
	return rtrArr;
    }

    


    
    //--------------^  HELPER METHODS  ^--------------



    /*****************************************************
     * void qsort(int[])
     * @param d -- array of ints to be sorted in place
     *****************************************************/
    public static void qsort( int[] d ){ 
	qsortH(d,0,d.length-1);
    }

    //quick sort helper method to allow for more vars
    public static void qsortH(int[] arr, int left, int right){
	
	if (left<right){
	    int pvtPos = partition(left,right,right,arr);
	    //printArr(arr);
	    qsortH(arr,left,pvtPos-1);
	    qsortH(arr,pvtPos+1,right);

	}

    }
  public static int partition(int left,int right,int pvtPos,int[] arr){
	int v = arr[pvtPos];
	swap(pvtPos,right,arr);
	int s = left;
	for (int i = left; i < right; i++){// [a ... b-1]
	    
	    if(arr[i] < v){
		swap(s,i,arr);
		s += 1;	        
	    }
	}
	    swap(right,s,arr);
	    //System.out.println("left: " + left);
	    //System.out.println("right: " + right);
	    //System.out.println("pvtPos: " + pvtPos+"\n");
	    return s;	

    }
    //you may need a helper method...


    public static int partitionR( int a, int b, int[] arr ) {
	  
	Random r = new Random();
	int pvtPoint = r.nextInt((b - a) + a + 1);
	int pvtElm = arr[pvtPoint];
	  
	swap( pvtPoint , b , arr );
	  
	int pos = a;
	for (int i = a ; i < b ; i++) {
	    if (arr[i] <= pvtElm) {
		swap( i , pos , arr );
		pos++;
	    }
	}
	  
	swap( pos , b , arr );
	return pos;
	  
    }
  
    public static void qsortRH( int left, int right, int[] arr ) {
	  
	if (left < right) {
	    int pvtPoint = partitionR( left , right , arr );
	    qsortRH( left , pvtPoint - 1 , arr );
	    qsortRH( pvtPoint + 1 , right , arr );
	}
		  
    }
    //--------------^  HELPER METHODS  ^--------------



  /*****************************************************
   * void qsort(int[])
   * @param d -- array of ints to be sorted in place
   *****************************************************/
  public static void qsortR( int[] d ) {
	  
	  qsortRH( 0 , d.length - 1 , d );
	  
  }


    //main method for testing
    public static void main( String[] args )
    {
	//get-it-up-and-running, static test case:
	int [] arr1 = {7,1,5,12,3};
	System.out.println("\narr1 init'd to: " );
	printArr(arr1);

	qsort( arr1 );	
	System.out.println("arr1 after qsort: " );
	printArr(arr1);

	// randomly-generated arrays of n distinct vals
	int[] arrN = new int[10];
	for( int i = 0; i < arrN.length; i++ )
	arrN[i] = i;
       
	System.out.println("\narrN init'd to: " );
	printArr(arrN);

	shuffle(arrN);
	System.out.println("arrN post-shuffle: " );
	printArr(arrN);

	qsort( arrN );
	System.out.println("arrN after sort: " );
	printArr(arrN);
	



	//get-it-up-and-running, static test case w/ dupes:
	int [] arr2 = {7,1,5,12,3,7};
	System.out.println("\narr2 init'd to: " );
	printArr(arr2);

	qsort( arr2 );	
	System.out.println("arr2 after qsort: " );
	printArr(arr2);


	// arrays of randomly generated ints
	int[] arrMatey = new int[20];
	for( int i = 0; i < arrMatey.length; i++ )
	arrMatey[i] = (int)( 48 * Math.random() );
       
	System.out.println("\narrMatey init'd to: " );
	printArr(arrMatey);

	shuffle(arrMatey);
	System.out.println("arrMatey post-shuffle: " );
	printArr(arrMatey);

	qsort( arrMatey );
	System.out.println("arrMatey after sort: " );
	printArr(arrMatey);


	int [] arr7 = {1,7,8,2,5};
	System.out.println("\narr7 init'd to: " );
	printArr(arr7);
	qsort( arr7 );
	System.out.println("arr7 after sort: " );
	printArr(arr7);
    }//end main

}//end class QuickSort
