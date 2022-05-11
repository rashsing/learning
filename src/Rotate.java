import java.util.ArrayList;
import java.util.Arrays;
public class Rotate {
    static void rotateMatrix(ArrayList<ArrayList<Integer>> a) {
        int n= a.size();
        int i,j,temp,val;
        for(i=0;i<n/2;i++)
        {
            for(j=i;j<n-i-1;j++)
            {
                temp = a.get(i).get(j);
                a.get(i).set(j,a.get(n-j-1).get(i));
                a.get(n-j-1).set(i, a.get(n-i-1).get(n-j-1));
                a.get(n-i-1).set(n-j-1, a.get(j).get(n-i-1));
                a.get(j).set(n-i-1, temp);
            }
        }
    }
    static void displayMatrix(Integer n, ArrayList<ArrayList<Integer>> a){
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a.get(i).get(j));
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int n= 4;
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> row1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> row2 = new ArrayList<>(Arrays.asList(5, 6, 7, 8));
        ArrayList<Integer> row3 = new ArrayList<>(Arrays.asList(9, 10, 11, 12));
        ArrayList<Integer> row4 = new ArrayList<>(Arrays.asList(13, 14, 15, 16));
        matrix.add(row1);
        matrix.add(row2);
        matrix.add(row3);
        matrix.add(row4);
        //displayMatrix(n,matrix);
        rotateMatrix(matrix);
        displayMatrix(n,matrix);
    }
}
