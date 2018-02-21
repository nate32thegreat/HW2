import java.io.File;
import java.util.Scanner;

public class Maze
{
    private int rows;
    private int cols;
    private int startRows;
    private int startCols;
    private int exitRow;
    private int exitCols;
    private char cell;
    private char [][] board;

    public Maze (File filename) throws Exception
    {
        Scanner s = new Scanner(filename);
        rows = s.nextInt();
        cols = s.nextInt();
        startRows = s.nextInt();
        startCols = s.nextInt();
        exitRow = s.nextInt();
        exitCols = s.nextInt();
        s.nextLine();
        board = new char [rows][cols];
        int i = 0;
        String line = "";

        while (s.hasNext())
        {
            line = s.nextLine();
            for (int j = 0; j < cols; j++)
            {

            }
            board[i] = line.toCharArray();
            i++;
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public int getStartRows() {
        return startRows;
    }

    public void setStartRows(int startRows) {
        this.startRows = startRows;
    }

    public int getStartCols() {
        return startCols;
    }

    public void setStartCols(int startCols) {
        this.startCols = startCols;
    }

    public int getExitRow() {
        return exitRow;
    }

    public void setExitRow(int exitRow) {
        this.exitRow = exitRow;
    }

    public int getExitCols() {
        return exitCols;
    }

    public void setExitCols(int exitCols) {
        this.exitCols = exitCols;
    }

    public void setCell(int row, int col, char newCh)
    {
       board[row][col] = newCh;
    }

    public char getCell(int row, int col)
    {
        return board [row][col];
    }

    public boolean openCell (int row, int col)
    {
        if (board[row][col] == ' ' )
        {
            return true;
        }
        return false;
    }

    public String toString()
    {
        String display = "";

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                display += board [i][j];
            }
            display += "\n";
        }
        return display;
    }
}
