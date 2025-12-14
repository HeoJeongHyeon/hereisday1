package lv17;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class No1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            BigInteger result = rCn(M, N);
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
    }

    public static BigInteger rCn(int n, int k) {
        BigInteger top = BigInteger.ONE;
        BigInteger bottom = BigInteger.ONE;

        if (k > n - k) k = n - k;

        for (int i = 1; i <= k; i++) {
            top = top.multiply(BigInteger.valueOf(n - i + 1));
            bottom = bottom.multiply(BigInteger.valueOf(i));
        }

        return top.divide(bottom);
    }
}
