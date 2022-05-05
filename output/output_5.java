package output;


 
 import java.util.HashSet; // Import the HashSet class 
 public class output_5 {
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
        int i = 90;
        int j = 1;
        try{
if(! __try.contains(0)){System.out.println("try_0");__try.add(0);}
            System.out.println(i/j);
        }catch (Exception e){
if(! __catch.contains(0)){System.out.println("catch_0");__catch.add(0);}
            System.out.println(e);
        }finally {
if(! __finally.contains(0)){System.out.println("finally_0");__finally.add(0);}
            System.out.println("the finally block");
        }
    }
}
