import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        String B = br.readLine();
        char[] arr = B.toCharArray();
        StringBuilder S = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            int n = arr[i] - '0';

            if (n == 1) {
                if (i == 0) S.append("1");
                else S.append("100");
            } else if (n == 2) {
                if (i == 0) S.append("01");
                else S.append("010");
            } else if (n == 3) {
                if (i == 0) S.append("11");
                else S.append("110");
            } else if (n == 4) {
                S.append("001");
            } else if (n == 5) {
                S.append("101");
            } else if (n == 6) {
                S.append("011");
            } else if (n == 7) {
                S.append("111");
            } else if (n == 0) {
                if (i == 0) {

                }
                else {
                    S.append("000");
                }
            }
        }

        if(S.length()==0){
            System.out.println("0");
        }else {
            System.out.println(S.reverse());
        }
    }
}
