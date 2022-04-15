public class SimpleProgram {
    public static void main(String[] args) {
        int variable1 = 10 , variable2 =0 , variableList[] = { 0 , 1 , 2 ,3};

        for (int i = 0; i < 15; i++) {
            variable2 = variable1;
            variable1++;
        }

        if(variable1==variable2){
            variable1++;
        }
        else{
            variable2++;
        }

    }
}
