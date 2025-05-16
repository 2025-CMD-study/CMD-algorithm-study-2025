import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();

        List<Integer> arr = new ArrayList<>();
        arr.add(0);
        for (int i = 1; i <= N; i++) {
            arr.add(i);
        }
        for (int i = 0; i < M; i++) {
            List<Integer> reverse = new ArrayList<>();
            int a = s.nextInt();
            int b = s.nextInt();

            for (int j = b; j >= a; j--) {
                reverse.add(arr.get(j));
            }
            for (int k = 0; k < reverse.size(); k++) {
                arr.set(a, reverse.get(k));
                a++;
            }
        }

        for (int i = 1; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
