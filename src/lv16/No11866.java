package lv16;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class No11866 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }

        bw.write("<");

        int count = 1;
        while (deque.size() > 1) {
            if (count == K) {
                int removed = deque.removeFirst();
                bw.write(removed + ", ");
                count = 1;
            } else {
                deque.addLast(deque.removeFirst());
                count++;
            }
        }

        // 마지막 남은 사람 출력
        bw.write(deque.removeFirst() + ">");

        bw.flush();
        bw.close();
    }
}
