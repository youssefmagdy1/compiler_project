package output;

 
 import java.util.HashSet; //  HashSet class 
 public class output_4 {
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
        int i = 15;

        switch (i){
            case 5:
if(! __case.contains(0)){System.out.println("case_0");__case.add(0);}
                System.out.println(i+10);
                break;
            case 10:
if(! __case.contains(1)){System.out.println("case_1");__case.add(1);}
                System.out.println(i+5);
                break;
            case 15:
if(! __case.contains(2)){System.out.println("case_2");__case.add(2);}
                ;
            default:
if(! __case.contains(3)){System.out.println("case_3");__case.add(3);}
                ;
        }


    }
}
