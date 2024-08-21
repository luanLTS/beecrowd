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

        
        List<Integer> ab = readLineValuesAsInt(in);

        while(ab.stream().reduce((t, u) -> t + u).get() != 0 ) {
            ab.sort((n1, n2) -> n1 - n2);
            
            int a = ab.get(0);
            int b = ab.get(1);
            int c = ab.get(0) - 1;
            
            while( !((a+b+c) /3 == a && (a+b+c) % 3 == 0)) {
                c-=1;
            }
            
            System.out.println(c);
            ab = readLineValuesAsInt(in);
        }

        
        
       
    }
    public static List<Integer> readLineValuesAsInt(BufferedReader in) throws IOException {
        return Arrays.asList(in.readLine().trim().split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());
    }

}
