package lv16;

import java.io.*;
import java.util.*;

public class No12789 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> temp = new Stack<>();
        Queue<Integer> arr = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        int count = 1;

        while (!arr.isEmpty() || !temp.isEmpty()) {

            if (!temp.isEmpty() && temp.peek() == count) {
                temp.pop();
                count++;
            } else if (!arr.isEmpty() && arr.peek() == count) {
                arr.poll();
                count++;
            } else if (!arr.isEmpty()) {
                temp.push(arr.poll());
            } else {
                break;
            }
        }

        if (count == N + 1) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}