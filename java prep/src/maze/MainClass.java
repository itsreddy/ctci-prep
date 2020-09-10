package maze;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<ArrayList<Integer>> path = MazeSolver.runSolver();
//        System.out.println(path.size());
        for (ArrayList<Integer> pos : path) {
            System.out.print(Arrays.toString(pos.toArray()));
        }
    }
}
