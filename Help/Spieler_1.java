import greenfoot.*;

public class Spieler_1 extends Actor
{
    int Punkte = 0;
    int punktefeld;
    public void act() 
    {
        Spielball spielball = ((Kamele)getWorld()).getSpielball();
        punktefeld = spielball.getPunktefeld();
        if(Greenfoot.isKeyDown("1"))
        {
            if(punktefeld == 1)
            {
                move(1);
            }
            else if(punktefeld == 2)
            {
                move(2);
            }
            else if(punktefeld == 3)
            {
                move(3);
            }
            else if(punktefeld == 4)
            {
                move(2);
            }
            else if(punktefeld == 5)
            {
                move(1);
            }
            else if(punktefeld == 6)
            {
                move(1);
            }
            else if(punktefeld == 7)
            {
                move(2);
            }
            else if(punktefeld == 8)
            {
                move(1);
            }
            else if(punktefeld == 9)
            {
                move(1);
            }
            else
            {
                move(0);
            }
        }
        else if(Greenfoot.isKeyDown("2"))
        {
            move(0);
        }
    }    
}
