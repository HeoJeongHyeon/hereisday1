package lv18;

import java.io.*;
import java.util.StringTokenizer;

/* 약수 구하기 */
public class No1037 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }

        }

        int A = max * min;
        bw.write(String.valueOf(A));
        bw.flush();
        bw.close();

    }
}
