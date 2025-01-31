import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nanas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nanas extends buah
{
    /**
     * Act - do whatever the nanas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        nanas nanas =new nanas();
        getWorld().addObject(nanas,Greenfoot.getRandomNumber(300),0);
    }
    
    void maju(){
        setLocation(getX(), getY()+2);
    }
    public void act()
    {
        super.act();
    }
}
