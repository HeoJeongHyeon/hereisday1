package lv16;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class No18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> q = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            switch (cmd) {
                case "push":
                    q.add(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    if (q.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(q.poll() + "\n");
                    }
                    break;

                case "size":
                    bw.write(q.size() + "\n");
                    break;

                case "empty":
                    bw.write(q.isEmpty() ? "1\n" : "0\n");
                    break;

                case "front":
                    if (q.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(q.peek() + "\n");
                    }
                    break;

                case "back":
                    if (q.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(q.peekLast() + "\n");
                    }
                    break;
            }
        }

        bw.flush();
    }
}
