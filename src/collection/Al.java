package collection;
import java.util.ArrayList;
public class Al {

    public static void main(String[] args) {
        ArrayList <String> sports= new ArrayList();
        sports.add("cricket");
        sports.add("hockey");
        sports.add("baseball");
        sports.add("football");

        //System.out.println("get 2nd index value:" + sports.get(2));


       for(int i=0; i<sports.size(); i++) {

           System.out.println(sports.get(i));
       }
    }
}
