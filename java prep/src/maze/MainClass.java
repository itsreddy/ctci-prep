package maze;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Position> path = MazeSolver.runSolver();
//        System.out.println(path.size());
        if (path.size() > 0) {
            for (Position pos : path) {
                System.out.print(pos.toString() + " ");
            }
        }
        else System.out.println("No path exists");
    }
}
