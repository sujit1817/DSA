ArrayList:

//inbuilt data structure which provides inbuilt operations
//linear data struture, dynamic size, implments list interface and provides a resizable array(used dynamic array).
//package java.util.ArrayList, part of java collection framework
//Allows Duplicates: It can contain duplicate elements
//fast retrieval based on index(array - random access interface)
//ordered collection - maintains the insertion order of elements
//The ArrayList uses an internal array to store its elements. When the array is full, the ArrayList automatically increases its capacity by about 50% (usually by a factor of 1.5). 
//This means that ArrayList can be more memory-efficient than manually managing an array.

//To iterate using for each
for(String item : list) {
    System.out.println(item);
}

//ArrayList operations demo
public class ArrayLL {

	public static void main(String[] args) {
		
		    ArrayList<Integer> list= new ArrayList<>();
		    //add Operation - O(1)
		    list.add(1);
		    list.add(2);
		    list.add(3);
		    list.add(4);
		    
		    System.out.println(list);
		    
		    //get Operation - O(1)
		    int element = list.get(2);
		    System.out.println(element);
		    
		    //Delete  - O(n)
		    list.remove(2);
		    System.out.println(list);
		    
		    //set - O(n)
		    list.set(2, 10);
		    System.out.println(list);
		    
		    //contains
		    System.out.println(list.contains(1));//true
		    System.out.println(list.contains(11));//false
			}
		// 1, 2, 3, 4]
		// 3
		// [1, 2, 4]
		// [1, 2, 10]
		// true
		// false
}

//Qn. program to max element in a list
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) {
	    ArrayList<Integer> list = new ArrayList<>();
        //add all the elements to list using add method()
        //add - O(1)
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);
        
		System.out.println("original list : "+list);
		
		int max = Integer.MIN_VALUE;// negative Infinity
		
		for(int i = 0; i<list.size(); i++){
		  //  if(list.get(i)>max){
		  //      max=list.get(i);
		  //  }
		  max = Math.max(max,list.get(i));
		}
		System.out.println("Max element in above ArrayList is : "+max);
	}
}


//container with most water (brute force)
import java.util.*;

public class Main
{
    public static int storeWater(ArrayList<Integer> height){
        int maxWater=0;
        
        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
            int ht=Math.min(height.get(i),height.get(j));
            int width=j-1;
            //area
            int currWater=ht*width;
            maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }
    
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		//1,8,6,2,5,4,8,3,7
		list.add(1);
		list.add(8);
		list.add(6);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(8);
		list.add(3);
		list.add(7);
		
		System.out.println("Max water is : "+storeWater(list));
	}
}
