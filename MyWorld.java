import greenfoot.*;

public class MyWorld extends World
{
    GreenfootSound backgroundMusic = new GreenfootSound("backsound2.mp3");
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 500, 1); 
        prepare();
        backgroundMusic.play();
    }
    
    private void prepare()
    {
        koala koala = new koala();
        addObject(koala,143,458);
        papaya papaya = new papaya();
        addObject(papaya,38,111);
        semangka semangka = new semangka();
        addObject(semangka,183,92);
        salak salak = new salak();
        addObject(salak,112,38);
        semangka.setLocation(179,90);
        semangka.setLocation(179,90);
        Counter counter = new Counter("");
        addObject(counter,47,484);
        Counter2 counter2 = new Counter2("HP: ");
        addObject(counter2,248,485);
        koala.setLocation(146,449);
        koala.setLocation(151,425);
        koala.setLocation(148,429);
        jamur jamur = new jamur();
        addObject(jamur,108,99);
        jamur jamur2 = new jamur();
        addObject(jamur2,243,11);
        nanas nanas = new nanas();
        addObject(nanas,219,170);
        melon melon = new melon();
        addObject(melon,267,94);
        manggis manggis = new manggis();
        addObject(manggis,36,218);
        kelapa kelapa = new kelapa();
        addObject(kelapa,96,164);
        jambu jambu = new jambu();
        addObject(jambu,86,7);
        ceri ceri = new ceri();
        addObject(ceri,185,13);
        jamur.setLocation(139,226);
    }


    public void stopMusic() {
        backgroundMusic.stop();
    }
    
}
