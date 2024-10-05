Arrays are the fundamental strutures in java that allow us to store multiple values of the same type in a single variable.
The elements in an array are stored in a contiguous memory location.
//1. linear data structure.
//2. homogeneous(multiple values of the same type in a single variable).
//3. stored in a contiguous memory location.

int numbers[] ={1,2,3,4,5};

*Array Declaration:-

#To declare an array in Java, use the following syntax:
int numbers[];
or int[] numbers;

#To create an array, you need to allocate memory for it using the new keyword
numbers = new int[5]; // array of size 5

index starts from zero.

#to access an element we need to use the index.
#to find the length we can use the length property
int size=numbers.length; //

///1. Program to find min and max in an array
public class Main{
/*
//max 
   public static void maxArray(int arr[]){
       int max=arr[0];
       for(int i=1;i<arr.length;i++){
              if(arr[i]>max){
                  max = arr[i];
                }
       }
       System.out.println("max :"+max);
   }
    
    //min
    public static void minArray(int arr[]){
       int min=arr[0];
       for(int i=1;i<arr.length;i++){
              if(arr[i]<min){
                  min = arr[i];
                }
       }
       System.out.println("min :"+min);
   }
*/	
    public static int largestInArray(int arr[]){
	    int Max = arr[0];
	      for(int i=0; i<arr.length;i++){
 	        if(Max < arr[i]){
 	           Max = arr[i];
	        }
	    }
	    return Max;
	}
	
	public static int smallestInArray(int arr[]){
	    int Min = arr[0];
	      for(int i=0; i<arr.length;i++){
 	        if(Min > arr[i]){
 	           Min = arr[i];
	        }
	    }
	    return Min;
	}
    
	public static void main(String[] args) {
	   // int key=10;
	    int arr[] = {4,5,15,8,2,12,14};
	    
	    int largest = largestInArray(arr);
	    System.out.println("largest value is "+largest);
	    
	    int smallest = smallestInArray(arr);
	    System.out.println("largest value is "+smallest);
// 	    int index = linearSearch(arr, key);
// 		System.out.println(index);
	}

//2. Program to print pairs in an array
public class Main
{
    public static void printPairs(int numbers[]){
        for(int i=0; i<numbers.length;i++){
            int curr= numbers[i];
            for(int j=i+1; j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+") ");
            }
            System.out.println();
        }
    }
    
	public static void main(String[] args) {
	 int numbers[]={2, 4, 6, 8, 10};
	 printPairs(numbers);
	}
	
}
//
(2,4) (2,6) (2,8) (2,10) 
(4,6) (4,8) (4,10) 
(6,8) (6,10) 
(8,10)
pairs array

//3. print subArrays
//continuous part of Array
//for array of size n there are n(n+1)/2 subArrays
public class Main
{
    public static void subArrays(int numbers[]){
        
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length ;j++){
                int end=j;
                for(int k=start;k<=end;k++){// print start to end   
                    System.out.print(numbers[k]+" ");
                }
                 System.out.println();
            }
            System.out.println();
        }       
    }
	public static void main(String[] args) {
	    int numbers[]={2,4,6,8,10};
	    subArrays(numbers);
	}
}
/*
2 
2 4 
2 4 6 
2 4 6 8 
2 4 6 8 10 

4 
4 6 
4 6 8 
4 6 8 10 

6 
6 8 
6 8 10 

8 
8 10 

10
*/

//sum of subarrays
public class Main
{
    public static void printSubArraysSum(int numbers[]){
        int currSum=0;
        for(int i=0; i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currSum=0;//so that next sum do not include the older sum
                for(int k= start; k<=end;k++){
                    currSum+=numbers[k];
                }
                System.out.println(currSum);
             }
            }
        }
        
    }
    
	public static void main(String[] args) {
		int numbers[] = {2,4,6,8,10};
		printSubArraysSum(numbers);
	}
}
/*	
2
6
12
20
30
4
10
18
28
6
14
24
8
18
10
*/

//max sum of subarrays
public class Main
{
    public static void printMaxSubArraysSum(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currSum=0;
                for(int k= start; k<=end;k++){
                    //subArray sum
                    currSum+=numbers[k];
                }
             //   System.out.println(currSum);
                 if(maxSum<currSum){
                     maxSum=currSum;
                 }
            }
        }
        System.out.println("max sum = "+maxSum);
    }
    
	public static void main(String[] args) {
		int numbers[] = {2,4,6,8,10};
		printMaxSubArraysSum(numbers);
	}
}
/*
max sum = 30
*/

//Qn. print odd numbers 
public class Main
{
    public static int[] removeEven(int[] arr){
     int odd=0;
     for(int i=0;i<arr.length;i++){
         if(arr[i]%2!=0){
             odd++;
            }
       }
    int result[]=new int[odd];
    int idx=0;
    for(int i=0;i<arr.length;i++){
         if(arr[i]%2!=0){
             result[idx]=arr[i];
            idx++;
         }
    }
    return result;
   // printArray(result); 
    }
    
    public static void printArray(int result[]){
        for(int oddEle : result){
            System.out.print(oddEle+" ");
        }
    } 
    
	public static void main(String[] args) {
	int[] arr={5,4,3,8,9};
	int result[]=removeEven(arr);
	printArray(result);
	}
}

//Qn. reverse an array
public class Main
{
  public static void reverseArray(int arr[],int start,int end){
      
      while(start<end){
      int temp=arr[start];
      arr[start]=arr[end];
      arr[end]=temp;
      start++;
      end--;
      }
      printArray(arr);
  }
  
  public static void printArray(int arr[]){
      for(int rev : arr){
          System.out.print(rev+" ");
      }
  }
    
	public static void main(String[] args) {
	int[] arr={5,4,3,8,9};
	reverseArray(arr,0, arr.length-1);
	}
}

//Qn. move zeros to the end of an array
public class Main
{
    public static void printArray(int arr[]){
      for(int moveZero : arr){
          System.out.print(moveZero+" ");
      }
    }
    
   public static void moveZerosToEnd(int arr[]){
     for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
           if(arr[i]==0){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           }   
        }
     }
     printArray(arr);
    }
	/*
	 public static void moveZerosToEnd(int arr[]){
       int j=0;
     for(int i=0;i<arr.length;i++){
           if(arr[i]!=0 && arr[j]==0){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           } if(arr[j]!=0){
               j++;
           }
     }
     printArray(arr);
    }
	*/
    
	public static void main(String[] args) {
	int[] arr={5,4,0,3,0,8,9};
	moveZerosToEnd(arr);
	}
}
