import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine(); 
        StringTokenizer t = new StringTokenizer(s," ");
        int a = Integer.parseInt(t.nextToken());
        int b = Integer.parseInt(t.nextToken());
        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        }else {
            System.out.println("==");
        }
    }
}
