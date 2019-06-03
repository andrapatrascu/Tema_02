public class Main {

    public static void main(String[] args)
    {
        int x = adunare(9, 12);
        int y = scadere (10, 5);
        System.out.println("Rezultatul adunarii este:" + x);
        System.out.println("Rezultatul scaderii este:" + y);
        System.out.println("Rezultatul inmultirii este:" + inmultire(7, 10));
        System.out.println("Rezultatul impartirii este:" + impartire(30, 10));
        printJava();
        System.out.println("Rezultatul mediei numerelor este:" + medie(7, 10, 20));
        System.out.println("Restul impartirii numerelor este:" + rest(19, 5));
        System.out.println("Rezultatul conversiei este:" + FarenheitToCelsius(45.3));
        System.out.println("Rezultatul conversiei este:" + InchToMeters(5239.7));
        viteza(10000,3,30,5);
    }

    public static int adunare(int a, int b)
    {
        return a + b;
    }
     public static int scadere( int a, int b)
    {
        return a - b;
    }
    public static int inmultire ( int a, int b)
    {
       return a * b;
    }
    public static int impartire ( int a , int b)
    {
      return a / b;
    }


    public static void printJava()
    {
        System.out.println("    J    a    v     v   a");
        System.out.println("    J   a a    v   v   a a ");
        System.out.println(" J  J  aaaaa    v v   aaaaa  ");
        System.out.println("  JJ   a    a    v   a     a  ");

    }
     public static float medie ( float a, float b , float c)
     {
     return (a + b + c)/ 3;
     }

     public static int rest ( int a, int b)
     {
     return a % b;
     }

     public static double FarenheitToCelsius (double a)
     {
     return 5.0/9 * (a -32);
     }

     public static double InchToMeters ( double a)
     {
     return a * 0.0254;
     }

    public static void viteza ( double distanta, double ore, double minute, double secunde)
    {
    double timp = ore * 3600 + minute * 60 + secunde; // in secunde
    double Vms = distanta/timp;
    double Vkmh = Vms*3.6;
    double Vmh = Vkmh/1.609;
    System.out.println( "Viteza ( m/s):" + Vms);
    System.out.println( "Viteza ( km/h):" + Vkmh);
    System.out.println( "Viteza ( mi/h):" + Vmh);
    }

}



