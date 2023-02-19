package factorialno;


public class fact {
    public void number(int Noforfactorial){


        int fact =1;

        for(int i=1; i<=Noforfactorial; i++)
            fact = fact * i;
        System.out.println(fact);
        }

        public static void main(String [] args) {

        fact ob = new fact();

        ob.number(3);
        }


}
