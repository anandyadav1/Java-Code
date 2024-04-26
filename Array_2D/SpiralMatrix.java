package Array_2D;

public class SpiralMatrix {
    public static void Call(int matrix[][]) {
        int startRow = 0;
        int startColumn = 0;
        int endRow = matrix.length-1;
        int endColumn = matrix[0].length-1;

        while (startRow <= endRow && startColumn <= endColumn) {

            // Top boundary
            for (int j = startColumn; j <= endColumn; j++) {
                System.out.print(matrix[startRow][j] + "  ");
            }
            // Right bondary
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endColumn] + "  ");
            }

            // Bottom boundary
            for (int j = endColumn - 1; j >= startColumn; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + "  ");

            }

            // Left bondary
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startColumn == endColumn) {
                    break;
                }
                System.out.print(matrix[i][startColumn] + "  ");

            }
            startRow++;
            startColumn++;
            endRow--;
            endColumn--;
        }
        System.out.println(matrix);
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 1, 1, 1, 1, 1, 1 },
                { 9, 4, 4, 4, 4, 4, 2 },
                { 9, 7, 8, 8, 8, 5, 2 },
                { 9, 6, 6, 6, 6, 5, 2 },
                { 3, 3, 3, 3, 3, 3, 2 }
        };

        Call(matrix);

    }
}
