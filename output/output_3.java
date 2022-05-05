package output;

 
 import java.util.HashSet; // Import the HashSet class 
 public class output_3 {
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
        int i = 5;

        
if(! __GpreExpression.contains(0)){System.out.println("GpreExpression_0");__GpreExpression.add(0);}while (i < 5)
            {System.out.println(i++);
if(! __for.contains(0)){System.out.println("for_0");__for.add(0);}}


        
if(! __GpreExpression.contains(1)){System.out.println("GpreExpression_1");__GpreExpression.add(1);}while (i < 7) {
if(! __while.contains(1)){System.out.println("while_1");__while.add(1);}
            System.out.println(i);
            i++;
        }

        do{
            System.out.println(i++);
if(! __do.contains(0)){System.out.println("do_0");__do.add(0);}}

        while (i < 5);

        do {
if(! __do.contains(1)){System.out.println("do_1");__do.add(1);}
            System.out.println(i);
            i++;
        } while (i<7);
    }
}
