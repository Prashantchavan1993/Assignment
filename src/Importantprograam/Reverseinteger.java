package Importantprograam;

public class Reverseinteger {

    public static void main(String[] args) {
        int no = 1234;
       int  reverseno= 0;
       while(no!=0){

           int remainder =no % 10;
           reverseno=reverseno*10+remainder;
           no = no/10;

       }

        System.out.println(reverseno);
    }

}
