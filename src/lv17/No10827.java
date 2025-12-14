package lv17;

import java.io.*;
/*0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

 */
public class No10827 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        long sum = 0;
        long temp = 1;
        for (int i = 1; i <= N; i++) {
            temp = (temp * i);
            sum = temp;
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();

    }

}
