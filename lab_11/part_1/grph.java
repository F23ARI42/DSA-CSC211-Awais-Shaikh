package lab_11.part_1;

public class grph {
    public static void main(String[] args) {
        // TODO code application logic here
        int vertices = 4;

        // Initialize the adjacency matrix
        int[][] adjacencyMatrix = new int[vertices][vertices];

        // Hardcoded edges
        int[][] edges = {{1, 2},{2, 3},{3, 4},{4, 1}};

        // Populate the adjacency matrix
        for (int[] edge : edges) {
            int u = edge[0]; // Starting vertex
            int v = edge[1]; // Ending vertex
            adjacencyMatrix[u - 1][v - 1] = 1; // Subtract 1 to make it 0-indexed
        }

        // Print the adjacency matrix
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
