public class RightHandRobot extends Robot
{
    private int direction;

    public RightHandRobot(Maze maze, int direction)
    {
        super(maze);
        direction = 0;
    }

    public RightHandRobot(Maze maze)
    {
        super(maze);
    }

    @Override
    public int chooseMoveDirection()
    {
        int result = 0;

        switch (direction)
        {
            case 0:
                if (super.getM().getCell(super.getCurrentRow(), super.getCurrentCol() - 1) == ' ' )
                {
                    result = 1;
                }
                else if (super.getM().getCell(super.getCurrentRow() + 1, super.getCurrentCol()) == ' ')//||super.getM().getCell(super.getCurrentRow() + 1, super.getCurrentCol()) == 'X')
                {
                    result = 0;
                }
                else if (super.getM().getCell(super.getCurrentRow(), super.getCurrentCol() + 1) == ' ')
                {
                    result = 3;
                }
                else if (super.getM().getCell(super.getCurrentRow() - 1, super.getCurrentCol() ) == ' ')
                {
                    result = 2;
                }
                break;

            case 1:
                if (super.getM().getCell(super.getCurrentRow() - 1, super.getCurrentCol() ) == ' ')
                {
                    result = 2;
                }
                else if (super.getM().getCell(super.getCurrentRow(), super.getCurrentCol() - 1) == ' ' )
                {
                    result = 1;
                }
                else if (super.getM().getCell(super.getCurrentRow() + 1, super.getCurrentCol()) == ' '|| super.getM().getCell(super.getCurrentRow() + 1, super.getCurrentCol()) == 'X')
                {
                    result = 0;
                }
                else if (super.getM().getCell(super.getCurrentRow(), super.getCurrentCol() + 1) == ' ')
                {
                    result = 3;
                }
                break;

            case 2:
                if (super.getM().getCell(super.getCurrentRow(), super.getCurrentCol() + 1) == ' ')
                {
                    result = 3;
                }
                else if (super.getM().getCell(super.getCurrentRow() - 1, super.getCurrentCol() ) == ' ')
                {
                    result = 2;
                }
                else if (super.getM().getCell(super.getCurrentRow(), super.getCurrentCol() - 1) == ' ' )
                {
                    result = 1;
                }
                else if (super.getM().getCell(super.getCurrentRow() + 1, super.getCurrentCol()) == ' '|| super.getM().getCell(super.getCurrentRow() + 1, super.getCurrentCol()) == 'X')
                {
                    result = 0;
                }
                break;

            case 3:
                if (super.getM().getCell(super.getCurrentRow() + 1, super.getCurrentCol()) == ' '|| super.getM().getCell(super.getCurrentRow() + 1, super.getCurrentCol()) == 'X')
                {
                    result = 0;
                }
                else if (super.getM().getCell(super.getCurrentRow(), super.getCurrentCol() + 1) == ' ')
                {
                    result = 3;
                }
                else if (super.getM().getCell(super.getCurrentRow() - 1, super.getCurrentCol() ) == ' ')
                {
                    result = 2;
                }
                else if (super.getM().getCell(super.getCurrentRow(), super.getCurrentCol() - 1) == ' ' )
                {
                    result = 1;
                }
                break;
        }
        direction = result;
        
        return result;
    }

    @Override
    public boolean move(int direction)
    {
        Boolean done = false;

        super.getM().setCell((super.getCurrentRow()), super.getCurrentCol(), ' ');

        switch (direction)
        {
            case 0:
                if (super.getM().getCell(super.getCurrentRow()+ 1, super.getCurrentCol() ) == ' '|| super.getM().getCell(super.getCurrentRow()+ 1, super.getCurrentCol() ) == 'X')
                {
                    super.setCurrentRow(super.getCurrentRow()+1);
                    super.getM().setCell((super.getCurrentRow()), super.getCurrentCol(), 'r');
                    done = true;
                }
                break;

            case 1:
                if (super.getM().getCell(super.getCurrentRow(), super.getCurrentCol() - 1 ) == ' ')
                {
                    super.setCurrentCol(super.getCurrentCol()-1);
                    super.getM().setCell((super.getCurrentRow()), super.getCurrentCol(), 'r');
                    done = true;
                }
                break;

            case 2:
                if (super.getM().getCell(super.getCurrentRow() - 1, super.getCurrentCol()) == ' ')
                {
                    super.setCurrentRow(super.getCurrentRow()-1);
                    super.getM().setCell((super.getCurrentRow()), super.getCurrentCol(), 'r');
                    done = true;
                }
                break;

            case 3:
                if (super.getM().getCell(super.getCurrentRow(), super.getCurrentCol() + 1 ) == ' ')
                {
                    super.setCurrentCol(super.getCurrentCol()+1);
                    super.getM().setCell((super.getCurrentRow()), super.getCurrentCol(), 'r');
                    done = true;
                }
                break;

            default:
                return false;

        }
        return done;
    }

}
