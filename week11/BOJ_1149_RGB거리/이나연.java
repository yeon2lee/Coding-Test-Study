import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] D = new int[N + 1][3];
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            int G = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            D[i][0] = Math.min(R + D[i - 1][1], R + D[i - 1][2]);
            D[i][1] = Math.min(G + D[i - 1][0], G + D[i - 1][2]);
            D[i][2] = Math.min(B + D[i - 1][0], B + D[i - 1][1]);
        }

        int min = Math.min(D[N][0], Math.min(D[N][1], D[N][2]));
        System.out.println(min);
    }
}
