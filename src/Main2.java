/**
 * Created by sergo on 21.01.17.
 *  * вывести на экран
 * It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
 It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"
 экранирование перед слешом и кавычками
 */
public class Main2 {
    public static void main(String[] args) {
        String a = "It's Windows path: \"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"";
        String b = " It's Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"\n";
        System.out.println(a);
        System.out.println(b);

        String c = "скотина";
        String d = c.substring(0,4);
        System.out.println(d);
    }
}
