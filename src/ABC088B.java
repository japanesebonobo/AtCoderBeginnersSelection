import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class ABC088B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Integer[] A = new Integer[N];

        int alice = 0;
        int bob = 0;
        int score;
        
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        Arrays.sort(A,Collections.reverseOrder());

        for (int i = 0; i < A.length; i++) {
            if(i % 2 == 0) {
                alice += A[i];
            } else {
                bob += A[i];
            }
        }

        score = alice - bob;
        System.out.println(score);
    }
}
