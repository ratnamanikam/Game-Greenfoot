import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class blue_potion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class blue_potion extends obat
{
    /**
     * Act - do whatever the blue_potion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        blue_potion blue_potion =new blue_potion();
        getWorld().addObject(blue_potion,Greenfoot.getRandomNumber(300),0);
    }
    
    void maju(){
        setLocation(getX(), getY()+1);
    }
    public void act()
    {
        super.act();
    }
}
