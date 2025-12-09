package lv16;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class No2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Deque<Integer> q = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            q.addLast(i);  // 1이 위, N이 아래
        }

        while (q.size() > 1) {
            q.pollFirst();           // 맨 위 카드 버림
            q.addLast(q.pollFirst()); // 그 다음 카드를 아래로 이동
        }

        bw.write(String.valueOf(q.peek())); // 마지막 남은 카드 출력
        bw.flush();
        bw.close();
    }
}
