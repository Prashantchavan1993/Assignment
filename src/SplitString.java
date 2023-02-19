import java.security.spec.RSAOtherPrimeInfo;

public class SplitString {


    public static void main(String[] args) {

        String s = "Prashant Chavan";

        //System.out.println(s.substring(0,8));
        //System.out.println(s.substring(8,14));

            String parts[] = s.split(" ");

            for (int i = 0; i<s.length(); i++){

                System.out.println(parts[i]);
            }



    }
}
