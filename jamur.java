import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class jamur extends racun
{
    void cetakbaru(){
        jamur jamur =new jamur();
        getWorld().addObject(jamur,Greenfoot.getRandomNumber(300),0);
    }
    
    void maju(){
        setLocation(getX(), getY()+2);
    }
    public void act()
    {
        super.act();
    }
}
