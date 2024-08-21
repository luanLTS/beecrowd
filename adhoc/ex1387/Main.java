package adhoc.ex1387;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        while (true) {
            List<Integer> nchildren = readLineValuesAsInt(in);

            int total = nchildren.stream().reduce((t, u) -> t + u).get();

            if (total == 0)
                break;
            System.out.println(total);

        }

    }

    public static List<Integer> readLineValuesAsInt(BufferedReader in) throws IOException {
        return Arrays.asList(in.readLine().trim().split(" ")).stream().map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
