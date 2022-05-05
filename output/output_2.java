package output;

 
 import java.util.HashSet; // Import the HashSet class 
 public class output_2 {
static HashSet<Integer> __for = new HashSet<Integer>(); 
static HashSet<Integer> __if = new HashSet<Integer>(); 
static HashSet<Integer> __while = new HashSet<Integer>(); 
static HashSet<Integer> __do = new HashSet<Integer>(); 
static HashSet<Integer> __try = new HashSet<Integer>(); 
static HashSet<Integer> __switch = new HashSet<Integer>(); 
static HashSet<Integer> __else = new HashSet<Integer>(); 
static HashSet<Integer> __finally = new HashSet<Integer>(); 
static HashSet<Integer> __catch = new HashSet<Integer>(); 
static HashSet<Integer> __method = new HashSet<Integer>(); 
static HashSet<Integer> __case = new HashSet<Integer>(); 
static HashSet<Integer> __preExpression = new HashSet<Integer>(); 
static HashSet<Integer> __GpreExpression = new HashSet<Integer>(); 

    public static void main(String[] args) {
if(! __method.contains(0)){System.out.println("method_0");__method.add(0);}

        //Initialize array
        int [] arr = new int [] {25, 11, 7, 75, 56};
        //Initialize max with first element of array.
        int max = arr[0];
        //Loop through the array
        
if(! __GpreExpression.contains(0)){System.out.println("GpreExpression_0");__GpreExpression.add(0);}for (int k : arr) {
if(! __for.contains(0)){System.out.println("for_0");__for.add(0);}
            //Compare elements of array with max
            
if(! __GpreExpression.contains(1)){System.out.println("GpreExpression_1");__GpreExpression.add(1);}if (k == 1 )
                {max = k;
if(! __if.contains(0)){System.out.println("if_0");__if.add(0);}}

        }

        
if(! __GpreExpression.contains(2)){System.out.println("GpreExpression_2");__GpreExpression.add(2);}for (int j : arr) {max = j;
if(! __for.contains(1)){System.out.println("for_1");__for.add(1);}}


        System.out.println("Largest element present in given array: " + max);
    }
}