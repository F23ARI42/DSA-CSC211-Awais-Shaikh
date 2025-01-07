package lab_11.part_2;
public class Grapmatrix {
    public static void main(String[] args) {
        int vertices = 4;
        int[][] adjacencyMatrix = new int[vertices][vertices];
        int[][] edges = {
                {1, 2},
                {2, 3},
                {3, 4},
                {4, 1}
        };
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjacencyMatrix[u - 1][v - 1] = 1;
        }
        displayAdjacencyMatrix(adjacencyMatrix, vertices);
    }
    public static void displayAdjacencyMatrix(int[][] matrix, int vertices) {
        System.out.println("Adjacency Matrix:");
        System.out.print("   ");
        for (int i = 1; i <= vertices; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < vertices; i++) {
            System.out.print((i + 1) + ": ");
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

