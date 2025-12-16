package lv18;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class No26069 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int peopleNum = Integer.parseInt(br.readLine());
        int count = 0;

        Set<String> dcps = new HashSet<>();
        dcps.add("ChongChong");
        for (int i = 0; i < peopleNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String ps1 = st.nextToken();
            String ps2 = st.nextToken();

            if (dcps.contains(ps1)||dcps.contains(ps2)) {
                dcps.add(ps1);
                dcps.add(ps2);
            }
        }
        count = dcps.size();
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();

    }
}
