package adhoc.ex1129;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        /**
         * BEE 1129 - Leitura Ótica
         */

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int n = Integer.parseInt(in.readLine());
        var result = new ArrayList<>();
        List<Integer> options;

        while (n != 0) {
            for (var i = 0; i < n; i++) {
                int count = 0;
                Integer position = null;

                options = Arrays.asList(in.readLine().split(" ")).stream().map(Integer::parseInt)
                        .collect(Collectors.toList());

                if (options.size() > 5)
                    break;
                for (var j = 0; j < 5; j++) {
                    if (options.get(j) <= 127) {
                        count++;
                        position = j;
                    }
                }

                if (position != null && count == 1) {
                    result.add((char) (65 + position));
                    continue;
                } else
                    result.add("*");

            }

            n = Integer.parseInt(in.readLine());

        }

        result.stream().forEach(System.out::println);

        in.close();

    }
}
