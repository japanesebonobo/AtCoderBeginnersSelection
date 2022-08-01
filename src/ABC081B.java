import java.util.Scanner;

public class ABC081B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ans = -1;

        int N = scanner.nextInt();
        int[] A = new int[N];

        Boolean flag = true;

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        while (flag) {
            for (int i = 0; i < N; i++) {
                if (A[i] % 2 != 0) {
                    flag = false;
                    break;
                }
                A[i] /= 2;
            }
                ans++;
        }

        System.out.println(ans);
        scanner.close();
    }
}
