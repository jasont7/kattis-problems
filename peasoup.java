import java.util.Scanner;

public class peasoup {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        
        int r = console.nextInt();
        int isSet = 0;
        
        while (r-- > 0) {
            int items = console.nextInt();
            console.nextLine();
            String name = console.nextLine();
            String item;
            int hasPea = 0;
            int hasPan = 0;
            
            for (int i=0; i < items; i++) {
                item = console.nextLine();
                if (item.equals("pea soup"))
                    hasPea = 1;
                else if (item.equals("pancakes"))
                    hasPan = 1;
            }
            if (hasPea == 1 && hasPan == 1) {
                System.out.println(name);
                isSet = 1;
                break;
            }
        }
        if (isSet == 0) System.out.println("Anywhere is fine I guess");
        
    }

}