package adhoc.ex1001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        /**
         * BEE 1001 - Extremamente Bãsico
         */

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        System.out.println("X = " + (Integer.parseInt(in.readLine()) + Integer.parseInt(in.readLine())));
    }

}
