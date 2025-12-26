Recursion :
Function Calling itself

Important steps:=>
1. base case
2. work
3. inner function call

f(n) = n * f(n-1)

//Qn. Print Desc  
public class Recursion1 {

    public static void printDesc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDesc(n-1);     
    }

    public static void main(String[] args) {
        int num = 10;
        printDesc(num);
    }
}


//Qn printAsc
public class Recursion2 {
    public static void printAsc(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        printAsc(n-1);
        System.out.print(" "+n);
    }
    public static void main(String[] args) {
        int num = 10;
        printAsc(num);
    }
}

