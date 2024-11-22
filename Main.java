import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] grid  = {{12, 3, 4, 13,5},{11,21,2,14,16},
                {7,8,9,15,0},{10,17,20,19,1},{18,22,30,25,6}};
        int[][] grid1  = {{12, 30, 40, 25,5},{11,3,22,15,43},
                {7,2,9,4,0},{8,33,18,6,1}};
        GridPath gridPath1 = new GridPath(grid1);
        GridPath gridPath = new GridPath(grid);
        Location location1 = gridPath.getNextLoc(0, 0);
        Location location2 = gridPath.getNextLoc(1, 3);
        Location location3 = gridPath.getNextLoc(2, 4);
        Location location4 = gridPath.getNextLoc(4, 3);
        System.out.printf("%s\n", Arrays.stream(new Location[]{location1, location2, location3, location4}).map(Main::LocToString).toList());
        System.out.println(gridPath1.sumPath(1,1));
    }
    public static String LocToString(Location location){
        return "("+location.getRow()+","+location.getCol()+")";
    }
}