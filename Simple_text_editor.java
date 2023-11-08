import java.lang.*;
import java.util.*;

public class Simple_text_editor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        StringBuilder prev = new StringBuilder();

        int Q = scanner.nextInt(); // Number of operations
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < Q; i++) {
            String[] query = scanner.nextLine().split(" ");
            int type = Integer.parseInt(query[0]);

            switch (type) {
                case 1:
                    append(query[1], sb, prev);
                    break;
                case 2:
                    int k = Integer.parseInt(query[1]);
                    delete(k, sb, prev);
                    break;
                case 3:
                    int n = Integer.parseInt(query[1]);
                    print(n, sb);
                    break;
                case 4:
                    undo(sb, prev);
                    break;
            }
        }

        scanner.close();
    }

    private static void append(String W, StringBuilder sb, StringBuilder prev) {
        prev.setLength(0);
        prev.append(sb);
        sb.append(W);
    }

    private static void delete(int k, StringBuilder sb, StringBuilder prev) {
        prev.setLength(0);
        prev.append(sb);
        int newLength = Math.max(sb.length() - k, 0);
        sb.setLength(newLength);
    }

    private static void print(int n, StringBuilder sb) {
        if (n > 0 && n <= sb.length()) {
            System.out.println(sb.charAt(n - 1));
        }
    }

    private static void undo(StringBuilder sb, StringBuilder prev) {
        sb.setLength(0);
        sb.append(prev);
    }

    
}
