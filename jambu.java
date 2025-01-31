import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jambu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jambu extends buah
{
    /**
     * Act - do whatever the jambu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        jambu jambu =new jambu();
        getWorld().addObject(jambu,Greenfoot.getRandomNumber(300),0);
    }
    
    void maju(){
        setLocation(getX(), getY()+2);
    }
    public void act()
    {
        super.act();
    }
}
