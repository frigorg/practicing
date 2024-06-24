import java.util.Scanner;

public class App {

    public static long recursiveFac(long value) throws ArithmeticException{
        if (value < 0)
            throw new ArithmeticException("Factorial of negative numbers is not defined.");
        if (value == 0)
            return 1;
        return value * recursiveFac(value-1);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int loop = 1;
        while(loop == 1){
            System.out.println("Digite um número");
        
            long x = sc.nextLong();

            try{
                System.out.println("Fatorial de "+x+" é "+recursiveFac(x));
                loop=0;
            }
            catch(ArithmeticException e){
                System.out.println(e.getMessage());
            }
        }

        sc.close();
    
    }
}
