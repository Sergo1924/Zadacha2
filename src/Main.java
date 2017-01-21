import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int a = Integer.parseInt(reader.readLine());

        for (int i = 0; i < a; i++) {

            int k = Integer.parseInt(reader.readLine());
            if (i == 0) maximum = k;
            else if (k > maximum) maximum = k;
        }

        //напишите тут ваш код
        System.out.println(maximum);
    }
}

