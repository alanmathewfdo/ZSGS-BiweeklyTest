import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {


    public static String dayOfProgrammer(int year) {
        int feb;
        if (year == 1918) {
            feb = 15;

        } else if (year <= 1917) {
            feb = (year % 4 == 0) ? 29 : 28;

        } else {
            feb = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? 29 : 28;
        }
        int[] months = { 31, feb, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int remaining = 256;

        for (int i = 0; i < months.length; i++) {
            if (remaining <= months[i]) {
                return String.format("%02d.%02d.%d", remaining, i + 1, year);
            }
            remaining -= months[i];
        }
        return "";
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
