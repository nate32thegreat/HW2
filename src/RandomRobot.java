import java.util.Random;

public class RandomRobot extends Robot
{

    public RandomRobot(Maze maze)
    {
        super(maze);

    }

    @Override
    public int chooseMoveDirection()
    {
        Boolean done = true;
        int result = 0;
        int [] number = new int[4];
        int counter = 0;


        if (super.getM().getCell(super.getCurrentRow() + 1, super.getCurrentCol()) == ' ' || super.getM().getCell(super.getCurrentRow() + 1, super.getCurrentCol()) == 'X')
        {
            number [counter] = 0;
            counter++;
        }
        if (super.getM().getCell(super.getCurrentRow(), super.getCurrentCol() - 1) == ' ')
        {
            number [counter] = 1;
            counter++;
        }

        try
        {
            if (super.getM().getCell(super.getCurrentRow() - 1, super.getCurrentCol()) == ' ')
            {
                number[counter] = 2;
                counter++;
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            done = false;
        }

        if (super.getM().getCell(super.getCurrentRow(), super.getCurrentCol() + 1) == ' ')
        {
            number [counter] = 3;
            counter++;
        }

        Random r = new Random();

        int rand = r.nextInt(counter);

        return number[rand];
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
