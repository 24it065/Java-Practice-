import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        boolean p=true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if(num%i==0){
                p=false;
                break;
            }
        }
        if(p==true){
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
    }
}
