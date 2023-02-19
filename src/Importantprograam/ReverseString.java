package Importantprograam;

public class ReverseString {


    public static void main(String[] args) {

        String colour = "Red";
        char [] chararray = colour.toCharArray();
        String reverse = "";


        for(int i = chararray.length-1; i>=0; i-- ){



            reverse=reverse + chararray[i];

        }

             System.out.println(reverse);



    }




}
