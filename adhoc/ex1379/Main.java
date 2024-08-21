package adhoc.ex1379;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        /**
         * BEE 1379 - Problema com Mediana e Média
         */

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        List<Integer> bc = readLineValuesAsInt(in);

        while (bc.stream().reduce((t, u) -> t + u).get() != 0) {
            bc.sort((n1, n2) -> n1 - n2);

            int b = bc.get(0), c = bc.get(1);

            System.out.println(3 * b - b - c);
            bc = readLineValuesAsInt(in);
        }

    }

    public static List<Integer> readLineValuesAsInt(BufferedReader in) throws IOException {
        return Arrays.asList(in.readLine().trim().split(" ")).stream().map(Integer::parseInt)
                .collect(Collectors.toList());
    }

}
