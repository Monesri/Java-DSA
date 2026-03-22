import java.util.Scanner;

public class Largest{
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter three numbers: ");
            int a =sc.nextInt();
            int b =sc.nextInt();
            int c =sc.nextInt();

            if(a>=b && a>=c){
                System.out.println("Largest"+ a);
            }else if(b>=a && b>=c){
                System.out.println("Largest: "+b);
            }else{
                System.out.println("Largest: "+c);
            }
        }
    }
}