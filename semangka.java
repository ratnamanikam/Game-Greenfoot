import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class semangka here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class semangka extends buah
{
    /**
     * Act - do whatever the semangka wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        semangka semangka =new semangka();
        getWorld().addObject(semangka,Greenfoot.getRandomNumber(300),0);
    }
    
    void maju(){
        setLocation(getX(), getY()+2);
    }
    public void act()
    {
        super.act();
    }
}
