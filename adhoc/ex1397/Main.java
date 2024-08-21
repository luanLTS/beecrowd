package adhoc.ex1397;

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

        while (true) {
            int aWins = 0, bWins = 0;
            int rounds = Integer.parseInt(in.readLine().trim());
            if (rounds == 0)
                break;

            for (int round = 0; round < rounds; round++) {
                List<Integer> nums = readLineValuesAsInt(in);
                if (nums.get(0) == nums.get(1))
                    continue;
                if (nums.get(0) > nums.get(1))
                    aWins++;
                else
                    bWins++;
            }
            System.out.println(aWins + " " + bWins);

        }

    }

    public static List<Integer> readLineValuesAsInt(BufferedReader in) throws IOException {
        return Arrays.asList(in.readLine().trim().split(" ")).stream().map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
