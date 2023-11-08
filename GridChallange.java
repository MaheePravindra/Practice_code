import java.util.*;
import java.lang.*;
public class GridChallange {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square grid: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        char[][] grid = new char[size][size];

        System.out.println("Enter the elements of the grid:");

        // Read the grid elements from the user
        for (int i = 0; i < size; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < size; j++) {
                grid[i][j] = line.charAt(j);
            }
        }

        String result = checkGridOrder(grid);
        System.out.println(result);

        scanner.close();
    }

    public static String checkGridOrder(char[][] grid) {
        int size = grid.length;

        // Rearrange elements of each row alphabetically
        for (int i = 0; i < size; i++) {
            Arrays.sort(grid[i]);
        }

        // Check if columns are in ascending order
        for (int col = 0; col < size; col++) {
            for (int row = 1; row < size; row++) {
                if (grid[row][col] < grid[row - 1][col]) {
                    return "No";
                }
            }
        }

        return "Yes";
    }

    
}
