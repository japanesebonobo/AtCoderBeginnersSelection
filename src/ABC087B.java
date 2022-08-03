import java.util.Scanner;

public class ABC087B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int X = scanner.nextInt();

        int ans = 0;

        for (int i = 0; i <= A; i++) {
            for (int j = 0; j <= B; j++) {
                for (int k = 0; k <= C; k++) {
                    if(X == (500*i + 100*j + 50*k)) {
                        ans++;
                    }
                }
            }
            
        }

        System.out.println(ans);
    }
}
