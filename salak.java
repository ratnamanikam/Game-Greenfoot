import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class salak here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class salak extends buah
{
    /**
     * Act - do whatever the salak wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        salak salak =new salak();
        getWorld().addObject(salak,Greenfoot.getRandomNumber(300),0);
    }
    
    void maju(){
        setLocation(getX(), getY()+2);
    }
    public void act()
    {
        super.act();
    }
}
