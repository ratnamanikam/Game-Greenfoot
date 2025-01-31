import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class koala extends Actor
{
    int count = 0;
    void dimakan(){
        Counter.add(1);
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("right")){
            setLocation(getX()+2, getY());
        }
        else if (Greenfoot.isKeyDown("left")){
            setLocation(getX()-2, getY());
        }
        if (isTouching(racun.class)){
            Counter2.add(-1);
            dimakan();
            getImage().scale((int)Math.round(getImage().getWidth()*1.5),
            (int)Math.round(getImage().getHeight()*1.5));
        }
        if (Counter2.value==0){
           Greenfoot.delay(1);
           Greenfoot.setWorld(new EndPage());
           getWorld().removeObject(this);
        }
         
        
    }
}
