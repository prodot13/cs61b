import java.util.*;

public class Graph {
    private int V; // # of vertices
    private int E; // # of edges
    private int[][] matrix; // adjacency matrix

    public Graph(int size) {
        V = size;
        E = 0;
        matrix = new int[size][size];
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    public void addEdge(int v, int w) {
        matrix[v][w] = 1;
        matrix[w][v] = 1;
        E++;
    }

    /** Returns an array of vertices adjacent to the given vertex */
    public Iterable<Integer> adj(int v) {
        List<Integer> adjacents = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            if (matrix[v][i] == 1) {
                adjacents.add(i);
            }
        }
        return adjacents;
    }

    public void printDFS(int v) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> seen = new HashSet<>();
        stack.push(v);
    }

    public static void main(String[] args) {
        Graph G = new Graph(5);
        G.addEdge(0, 1);
        G.addEdge(0, 2);
        G.addEdge(0, 3);
        G.addEdge(0, 4);
        G.addEdge(1, 4);
        G.addEdge(1, 2);
        System.out.println(G.adj(0));
        System.out.println(G.adj(1));
        System.out.println(G.adj(2));
    }
}
