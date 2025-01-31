import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kelapa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kelapa extends buah
{
    /**
     * Act - do whatever the kelapa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        kelapa kelapa =new kelapa();
        getWorld().addObject(kelapa,Greenfoot.getRandomNumber(300),0);
    }
    
    void maju(){
        setLocation(getX(), getY()+2);
    }
    public void act()
    {
        super.act();
    }
}
