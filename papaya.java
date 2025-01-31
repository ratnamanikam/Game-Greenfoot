import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class papaya here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class papaya extends buah
{
    /**
     * Act - do whatever the papaya wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        papaya papaya =new papaya();
        getWorld().addObject(papaya,Greenfoot.getRandomNumber(300),0);
    }
    
    void maju(){
        setLocation(getX(), getY()+2);
    }
    public void act()
    {
        super.act();
    }
}
