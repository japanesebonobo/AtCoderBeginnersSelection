import java.util.Scanner;
import java.util.Arrays;

public class ABC085B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] d = new int[N];

        int currentDiameter=0;
        int ans = 0;
        
        for (int i = 0; i < N; i++) {
            d[i] = scanner.nextInt();
        }

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            if(currentDiameter < d[i]) {
                currentDiameter = d[i];
                ans++;
            }
        }

        System.out.println(ans);
    }
}
