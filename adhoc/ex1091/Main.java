package adhoc.ex1091;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        var result = new ArrayList<String>();

        var k = Integer.parseInt(in.readLine().trim());

        while (k != 0) {

            String[] nm = in.readLine().split(" ");

            var n = Long.parseLong(nm[0]);
            var m = Long.parseLong(nm[1]);

            for (var i = 0; i < k; i++) {
                String[] xy = in.readLine().split(" ");

                var x = Long.parseLong(xy[0]);
                var y = Long.parseLong(xy[1]);

                if (x == n || y == m) {
                    result.add("divisa");
                } else if (x > n) {
                    if (y > m)
                        result.add("NE");
                    else
                        result.add("SE");
                } else {
                    if (y > m)
                        result.add("NO");
                    else
                        result.add("SO");
                }

            }
            k = Integer.parseInt(in.readLine());
        }

        result.stream().forEach(System.out::println);

        in.close();

    }

}