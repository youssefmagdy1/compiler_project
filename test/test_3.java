package test;

public class test_3 {
    public static void main(String[] args) {
        int i = 5;
        int x = 3;
        while (x==3 || i < 5 ){
            System.out.println(i++);
            x++;
        }


        while (i < 7) {
            System.out.println(i);
            i++;
        }

        do
            System.out.println(i++);
        while (i < 5);

        do {
            System.out.println(i);
            i++;
        } while (i<7);
    }
}
