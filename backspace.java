import java.util.Scanner;

public class backspace {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        
        String s = console.next();
        StringBuilder str = new StringBuilder("");
        
        for (int i=0; i < s.length(); i++) {
            if (s.charAt(i) == '<') {
                str.deleteCharAt(str.length()-1);
            } else {
                str.append(s.charAt(i));
            }
        }
        
        System.out.println(str);
    }

}