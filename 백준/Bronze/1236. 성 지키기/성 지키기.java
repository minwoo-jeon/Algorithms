
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N= sc.nextInt();
        int M= sc.nextInt();
        char[][] map = new char[N][M];
        for (int i = 0; i < N; i++)
            map[i]  = sc.next().toCharArray();

            
            int existRowCount = 0;
            for (int r = 0; r < N; r++) {
                boolean exist = false;
                for (int c = 0; c < M; c++)
                    if(map[r][c] == 'X'){
                        exist = true;
                        break;
                }
                if(exist) existRowCount++;
            }

            int existColCount = 0;
            for (int c = 0; c < M; c++) {
            boolean exist = false;
            for (int r = 0; r < N; r++)
                if (map[r][c] == 'X') {
                    exist = true;
                    break;
                }
                if(exist) existColCount++;
            }


  
            int needRowCount = N - existRowCount;
            int needColCount = M-  existColCount;


           
            System.out.println(Math.max(needRowCount,needColCount));
        }
    }