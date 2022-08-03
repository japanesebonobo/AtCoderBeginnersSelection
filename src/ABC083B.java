import java.util.Scanner;

public class ABC083B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int ans = 0;

        for (int i = 1; i <= N; i++) {
            int sum = 0;
            Integer num = Integer.valueOf(i);
            String numText = num.toString();

            char numChar[] = numText.toCharArray();
            for (int j = 0; j < numChar.length; j++) {
                sum += Character.getNumericValue(numChar[j]);
            }
            if(sum >= A && sum <= B) {
                ans += i;
            }
        }

        System.out.println(ans);
    }
}
