//divide and conquer
//merge sort

public class Main
{
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void mergeSort(int arr[], int si, int ei){
       // above function will sort the array elements
        //base case
        if(si>=ei){
            return;
        }
        
        //work
        //1. find mid, to know about left and right part of Array 
        //2. left part will start from si and end on mid
        //3. right part will start from mid+1 and end on ei ending index
        //4.  
       int mid= si+(ei-si)/2; //(si+ei)/2
       mergeSort(arr, si, mid);// left part
       mergeSort(arr, mid+1, ei);// right part
       merge(arr, si, mid, ei);
        
    }
    
    public static void merge(int arr[], int si, int mid, int ei){
     // left 0-3 right 4-6
     // starting index 0 and ending 4-6
     // if we do 6-0 size will be 6 but intotal left+right array 
     // elements total is 7
     //so ei-si+1 for temp array length
       int temp[] = new int[ei-si+1]; 
       int i = si;// iterator for left part
       int j = mid+1; // iterator for right part
       int k = 0; //iterator for temp arr
       
       while(i <= mid && j <= ei){
           if(arr[i] < arr[j]){
               temp[k] = arr[i];
               i++;
               k++;
           }else{
               temp[k] = arr[j]; 
               j++;
               k++;
           }
       }
       
       //left
       while(i<=mid){
           temp[k++] = arr[i++];
       }
       //right
        while(j<=ei){
           temp[k++] = arr[j++];
       }
       
       // copy temp to original array
       
       for(k=0,i=si;k<temp.length;k++,i++){
           arr[i]=temp[k];
       }
    }
    
	public static void main(String[] args) {
	    int arr[]={6,3,9,5,2,8};
		mergeSort(arr, 0,arr.length-1);
		printArr(arr);
	}
}
