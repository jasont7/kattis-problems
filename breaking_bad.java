import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class breaking_bad {

    HashMap<String, ArrayList<String>> G;
    HashMap<String, String> colors;
    boolean isB = true;

    public breaking_bad(String[] V, String[][] E) {
        G = new HashMap<>();
        getGraph(V,E);
        colors = new HashMap<>();
        for(String v : V)
            colors.put(v,"U");
    }

    public void getGraph(String[] V, String[][] E) {
        for (String vertex : V)
            G.put(vertex, new ArrayList<String>());

        for (String[] edge : E) {
            G.get(edge[0]).add(edge[1]);
            G.get(edge[1]).add(edge[0]);
        }
    }

    private String oppositeColor(String v) {
        if (colors.get(v).equals("X"))
            return "Y";
        else
            return "X";
    }

    public void coloring() {
        for(String v : G.keySet())
            if (isB && colors.get(v).equals("U"))
                color(v,"X");
    }

    private void color(String v, String c) {
        if (!isB)
            return;
        if (colors.get(v).equals("U")) {
            colors.put(v,c);
            for(String n: G.get(v))
                color(n,oppositeColor(v));
        }
        else if (!colors.get(v).equals(c))
            isB = false;
    }


    public void printColoring() {
        if (!isB) {
            System.out.println("impossible");
        } else {
            StringBuilder X = new StringBuilder();
            StringBuilder Y = new StringBuilder();

            for (String v : G.keySet()) {
                if (colors.get(v).equals("X"))
                    X.append(v).append(" ");
                else
                    Y.append(v).append(" ");
            }

            X.deleteCharAt(X.length()-1);
            if (Y.length() != 0)
                Y.deleteCharAt(Y.length()-1);
            System.out.println(X);
            System.out.println(Y);
        }
    }

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int N = console.nextInt();
        String[] V = new String[N];
        for (int n=0; n < N; n++) {
            V[n] = console.next();
        }

        int M = console.nextInt();
        String[][] E =  new String[M][2];
        for (int m=0; m < M; m++) {
            E[m][0] = console.next();
            E[m][1] = console.next();
        }

        breaking_bad bb = new breaking_bad(V,E);
        bb.coloring();
        bb.printColoring();
    }

}