package adhoc.ex1428;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int n = Integer.parseInt(in.readLine().trim());

        for (int i = 0; i < n; i++) {
            List<Integer> nm = readLineValuesAsInt(in);
            System.out.println((nm.get(0) / 3) * (nm.get(1) / 3));
        }

    }

    public static List<Integer> readLineValuesAsInt(BufferedReader in) throws IOException {
        return Arrays.asList(in.readLine().trim().split(" ")).stream().map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
