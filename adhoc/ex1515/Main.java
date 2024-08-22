package adhoc.ex1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        /**
         * BEE 1515 - Hello Galaxy
         */
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        while (true) {
            int n = Integer.parseInt(in.readLine().trim());
            if (n == 0)
                break;

            String nameFirstCivilization = "";
            int aux = 2114;
            for (int i = 0; i < n; i++) {
                String[] line = in.readLine().trim().split(" ");
                int yearReceived = Integer.parseInt(line[1]);
                int yearsAgo = Integer.parseInt(line[2]);
                if ((yearReceived - yearsAgo) < aux) {
                    aux = yearReceived - yearsAgo;
                    nameFirstCivilization = line[0];
                }
            }
            System.out.println(nameFirstCivilization);
        }

    }
}
