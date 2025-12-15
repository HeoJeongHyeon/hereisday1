package lv18;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class No25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            if (str.equals("ENTER")) {
                set.clear();
            } else {
                if (set.add(str)) { // 처음 등장한 경우만
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
