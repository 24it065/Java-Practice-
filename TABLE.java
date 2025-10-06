import java.util.*;
public class TABLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        for(int j=1;j<=10;j++){
            System.out.println(n+"x" +j+"="+(n*j));
        }
    }
}
