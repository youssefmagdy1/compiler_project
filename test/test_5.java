package test;


public class test_5 {
    public static void main(String[] args) {
        int i = 90;
        int j = 1;
        try{
            System.out.println(i/j);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("the finally block");
        }
    }
}
