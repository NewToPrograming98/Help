import greenfoot.*;

public class Kamele extends World
{
    Spielball spielball = new Spielball();
    
    public Kamele()
    {    
        super(1200, 700, 1);
        prepare();
    }
    
    private void prepare()
    {
        Spieler_1 spieler_1 = new Spieler_1();
        addObject(spieler_1,50,80);
        Spieler_2 spieler_2 = new Spieler_2();
        addObject(spieler_2,50,180);
        Punkte_3 punkte_3 = new Punkte_3();
        addObject(punkte_3,575,280);
        Punkte_2 punkte_2 = new Punkte_2();
        addObject(punkte_2,515,280);
        Punkte_2 punkte_22 = new Punkte_2();
        addObject(punkte_22,635,280);
        Punkte_1 punkte_1 = new Punkte_1();
        addObject(punkte_1,455,280);
        Punkte_1 punkte_12 = new Punkte_1();
        addObject(punkte_12,695,280);
        Punkte_1 punkte_13 = new Punkte_1();
        addObject(punkte_13,575,440);
        Punkte_1 punkte_14 = new Punkte_1();
        addObject(punkte_14,635,360);
        Punkte_2 punkte_23 = new Punkte_2();
        addObject(punkte_23,575,360);
        Punkte_1 punkte_15 = new Punkte_1();
        addObject(punkte_15,515,360);
        addObject(spielball,575,650);
    }
    
    
    public Spielball getSpielball()
    {
        return spielball;
    }
}
