package lv17;

import java.io.*;
import java.util.StringTokenizer;

/* 이항계수 구하기 */
/* n! / r!(n-r)! */
public class No11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long n = Long.parseLong(st.nextToken());
        long k = Long.parseLong(st.nextToken());
        long result = rCn(n, k);
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

    public static long rCn(long n, long k) {

        long top = 1;
        long bottom = 1;
        long bottom2 = 1;
        for (int i = 1; i <= n; i++) {
            top = top * i;
        }

        for (int i = 1; i <= k; i++) {
            bottom = bottom * i;
        }

        for (int i = 1; i <= n - k; i++) {
            bottom2 = bottom2 * i;
        }

        return top / (bottom * bottom2);
    }
}
