//how to increment counter using static variable java

//static variable belongs to the class, not to individual objects
//this makes it perfect for counters that should be shared across all the instances
 
 class Counter{
	 static int count = 0;
	 Counter(){
		 count++;//increment static counter
	 }
	 
 }
 
 public class Main{
	 public static void main(String[] args){
		 Counter c1 = new Counter();
		 Counter c2 = new Counter();
		 Counter c3 = new Counter();
		 
		 System.out.println("Count: " +Counter.count);
	 }
 }
 
 //Count: 3


static counter with method


class Counter{
	static int count = 0;
	
	static void increment(){
		count++;
	}
}
public class Main {
    public static void main(String[] args) {
        Counter.increment();
        Counter.increment();
        Counter.increment();

        System.out.println("Count: " + Counter.count);
    }
}


class Employee {
    static int counter = 0;
    int id;

    Employee() {
        counter++;
        id = counter;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        System.out.println(e1.id); // 1
        System.out.println(e2.id); // 2
    }
}
