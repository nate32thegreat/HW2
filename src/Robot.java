public class Robot
{
    private int currentRow;
    private int currentCol;
    private String robotName;
    private Maze m;


    public Robot (Maze maze)
    {
        m = maze;
        m.setCell(maze.getStartRows(), maze.getStartCols(), 'r');
        robotName = "r";
        currentRow = maze.getStartRows();
        currentCol = maze.getStartCols();

    }

    public Robot() {
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public int getCurrentCol() {
        return currentCol;
    }

    public void setCurrentCol(int currentCol) {
        this.currentCol = currentCol;
    }

    public String getRobotName() {
        return robotName;
    }

    public void setRobotName(String robotName) {
        this.robotName = robotName;
    }

    public Maze getM() {
        return m;
    }

    public void setM(Maze m) {
        this.m = m;
    }

    public int chooseMoveDirection()
    {
        int result = 0;

        if (m.getCell(currentRow + 1, currentCol ) == ' ' || m.getCell(currentRow + 1, currentCol ) == 'X')
        {
            result = 0;
        }
        else if (m.getCell(currentRow, currentCol-1 ) == ' ')
        {
            result = 1;
        }
        else if (m.getCell(currentRow - 1 , currentCol) == ' ')
        {
            result = 2;
        }
        else if (m.getCell(currentRow, currentCol + 1 ) == ' ')
        {
            result = 3;
        }

        return result;
    }

    public boolean move (int direction)
    {
        Boolean done = false;

        switch (direction)
        {
            case 1:
                if (m.getCell(currentRow + 1, currentCol ) == ' '|| m.getCell(currentRow + 1, currentCol ) == 'X')
                {
                    currentRow ++;
                    done = true;
                }
                break;

            case 2:
                if (m.getCell(currentRow, currentCol - 1 ) == ' ')
                {
                    currentCol --;
                    done = true;
                }
                break;

            case 3:
                if (m.getCell(currentRow - 1 , currentCol ) == ' ')
                {
                    currentRow--;
                    done = true;
                }
                break;

            case 4:
                if (m.getCell(currentRow, currentCol + 1 ) == ' ')
                {
                    currentCol++;
                    done = true;
                }
                break;

            default:
                return false;

        }
        return done;
    }

    public boolean solved ()
    {
        Boolean result = false;

        if (m.getCell(currentRow +1,currentCol) == 'X')
        {
            result = true;
        }

        return result;

    }



}
