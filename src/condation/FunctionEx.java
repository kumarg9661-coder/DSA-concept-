package condation;

public class FunctionEx {

    public static int multiplay(int a,int b){
        int product = a*b;
        return product;
    }


    public static void main(String[] args) {
      int a =3;
      int b =5;
     int prod = multiplay(a,b);
        System.out.println("a*b = "+ prod);

      int prod2  =multiplay(10,5);
        System.out.println("a*b ="+ prod2);
    }
}
