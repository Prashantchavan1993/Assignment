public class Palindrome {


    public static void main(String[] args) {

        int no = 1231;
        int num =no;
        int  rev = 0;
         while(no!=0){



             rev=rev*10+no/10;
             no=no/10;
         }

        System.out.println(rev);

         if(num==rev){

             System.out.println("no is pal");}
         else{

             System.out.println("no is not pal");
         }

    }
}
