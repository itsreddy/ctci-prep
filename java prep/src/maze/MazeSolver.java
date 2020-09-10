package maze;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MazeSolver {

    private static boolean found = false;
    private static ArrayList<ArrayList<Integer>> path = new ArrayList<ArrayList<Integer>>();

    private static ArrayList<ArrayList<Integer>> loadMaze(String filePath) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(filePath));
        ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();

        while(scan.hasNext()){
            String line = scan.nextLine();
            String[] lineSplit = line.split(" ");
            ArrayList<Integer> currentLine = new ArrayList<Integer>();
            for (int i = 0; i < lineSplit.length; i++) {
                currentLine.add(Integer.parseInt(lineSplit[i]));
            }
            array.add(currentLine);
        }

        return array;
    }

    public static ArrayList<ArrayList<Integer>> runSolver() throws FileNotFoundException {
        ArrayList<ArrayList<Integer>> matrix = loadMaze("MazeInputs/maze.txt");
//        ArrayList<ArrayList<Integer>> path = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < matrix.get(0).size(); i++) {
            if(matrix.get(0).get(i) == 1){
                solve(matrix, 0, i);
                solve(matrix, matrix.size()-1, i);
            }
        }
        for (int i = 0; i < matrix.size(); i++) {
            if(matrix.get(0).get(i) == 1){
                solve(matrix, i, 0);
                solve(matrix, i, matrix.get(0).size()-1);
            }
        }

        return path;
    }

    private static void solve(ArrayList<ArrayList<Integer>> matrix, int row, int col){
//        System.out.println(row + " " + col);
        if(found || row < 0 || row >= matrix.size() || col < 0 || col >= matrix.get(0).size()) return;

        if(matrix.get(row).get(col) == 0) return;

        ArrayList<Integer> currentPosition = new ArrayList<Integer>(Arrays.asList(row,col));
        path.add(currentPosition);

        if(matrix.get(row).get(col) == 2){
            found = true;
            return;
        }

        matrix.get(row).set(col, 0);

        int[][] movts = {{-1,0}, {1,0}, {0,-1}, {0,1}};

        for(int[] mov: movts){
            solve(matrix, row+mov[0], col+mov[1]);
        }

        if(!found) path.remove(path.size()-1);

        matrix.get(row).set(col, 1);
    }
}
