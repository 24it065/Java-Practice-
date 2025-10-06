public class pattern {
    public static void main(String[] args) {
        int n=4;
        for(int j=1;j<=n;j++){
            for(int k=1;k<=n-j;k++){
                System.out.print("  ");
            }
            for (int k=1;k<=j;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
