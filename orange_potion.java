import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class orange_potion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class orange_potion extends obat
{
    /**
     * Act - do whatever the orange_potion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        orange_potion orange_potion =new orange_potion();
        getWorld().addObject(orange_potion,Greenfoot.getRandomNumber(300),0);
    }
    
    void maju(){
        setLocation(getX(), getY()+5);
    }
    public void act()
    {
        super.act();
    }
}
