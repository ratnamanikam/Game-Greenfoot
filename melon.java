import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class melon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class melon extends buah
{
    /**
     * Act - do whatever the melon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        melon melon =new melon();
        getWorld().addObject(melon,Greenfoot.getRandomNumber(300),0);
    }
    
    void maju(){
        setLocation(getX(), getY()+2);
    }
    public void act()
    {
        super.act();
    }
}
