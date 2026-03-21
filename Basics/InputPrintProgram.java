import java.util.Scanner;

public class InputPrintProgram {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println("You entered: "+ n);
        }
    }
}
