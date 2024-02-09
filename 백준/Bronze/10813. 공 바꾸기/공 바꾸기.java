import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 바구니 개수
        int m = sc.nextInt(); //공 교환 횟수

        int arr[] = new int[n + 1]; //바구니

        for (int i = 1; i <= n; i++) {
            arr[i] = i; //바구니 공 초기화
        }
        for (int k = 0; k < m; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int tem = arr[i];
            arr[i] = arr[j];
            arr[j] = tem;
        }

        for (int i = 1; i <=n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}