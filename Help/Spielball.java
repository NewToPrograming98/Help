import greenfoot.*;

public class Spielball extends Actor
{
   int punktefeld;
   int x;
   int y;
   public void act()
   {
       setLocation(575,650);
       punktefeld = 0;
       punktefeld = punktefeld + Greenfoot.getRandomNumber(10);
       if(Greenfoot.isKeyDown("1"))
       {
           if(punktefeld == 1)
            {
                setLocation(455,280);
                x = getX();
                y = getY();
            }
            else if(punktefeld == 2)
            {
                setLocation(515,280);
                x = getX();
                y = getY();
            }
            else if(punktefeld == 3)
            {
                setLocation(575,280);
                x = getX();
                y = getY();
            }
            else if(punktefeld == 4)
            {
                setLocation(635,280);
                x = getX();
                y = getY();
            }
            else if(punktefeld == 5)
            {
                setLocation(695,280);
                x = getX();
                y = getY();
            }
            else if(punktefeld == 6)
            {
                setLocation(515,360);
                x = getX();
                y = getY();
            }
            else if(punktefeld == 7)
            {
                setLocation(575,360);
                x = getX();
                y = getY();
            }
            else if(punktefeld == 8)
            {
                setLocation(635,360);
                x = getX();
                y = getY();
            }
            else if(punktefeld == 9)
            {
                setLocation(575,440);
                x = getX();
                y = getY();
            }
            else
            {
                setLocation(575,650);
                x = getX();
                y = getY();
            }
       }
       else if(Greenfoot.isKeyDown("2"))
       {
           if(punktefeld == 1)
            {
                setLocation(455,280);
                x = getX();
                y = getY();
            }
            else if(punktefeld == 2)
            {
                setLocation(515,280);
                x = getX();
                y = getY();
            }
            else if(punktefeld == 3)
            {
                setLocation(575,280);
                x = getX();
                y = getY();
            }
            else if(punktefeld == 4)
            {
                setLocation(635,280);
                x = getX();
                y = getY();
            }
            else if(punktefeld == 5)
            {
                setLocation(695,280);
                x = getX();
                y = getY();
            }
            else if(punktefeld == 6)
            {
                setLocation(515,360);
                x = getX();
                y = getY();
            }
            else if(punktefeld == 7)
            {
                setLocation(575,360);
                x = getX();
                y = getY();
            }
            else if(punktefeld == 8)
            {
                setLocation(635,360);
                x = getX();
                y = getY();
            }
            else if(punktefeld == 9)
            {
                setLocation(575,440);
                x = getX();
                y = getY();
            }
            else
            {
                setLocation(575,650);
                x = getX();
                y = getY();
            }
       }
   }
   
   public int getPunktefeld()
   {
       return punktefeld;
   }
}