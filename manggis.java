import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class manggis here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class manggis extends buah
{
    /**
     * Act - do whatever the manggis wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        manggis manggis =new manggis();
        getWorld().addObject(manggis,Greenfoot.getRandomNumber(300),0);
    }
    
    void maju(){
        setLocation(getX(), getY()+2);
    }
    public void act()
    {
        super.act();
    }
}
