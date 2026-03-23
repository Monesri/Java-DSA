public class ArmstrongNumber {
    public static void main(String[] args){
        int n = 153, temp = n, sum = 0;
        while(n>0){
            int d = n % 10;
            sum += d*d*d;
            n /= 10;
        }
        if(sum == temp){
            System.out.println("Armstrong ");
        }
    }
    
}
