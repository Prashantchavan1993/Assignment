public class Returnkeyword {

    public static void main(String[]args){

        Returnkeyword obj = new Returnkeyword();
        int addition = obj.add();
        System.out.println(addition);

    }
      public int add(){
        int a=5;
        int b=10;
        int c=a+b;
        return c;

      }
}
