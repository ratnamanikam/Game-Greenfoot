import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class buah extends Actor
{
    abstract void cetakbaru();
    abstract void maju(); 
    
    protected void dimakan(){
        Counter.add(1);
        cetakbaru();
        getWorld().removeObject(this);
        
    }
    
    public void act() 
    {
        maju();
        if(getY()>=499){
            setLocation(Greenfoot.getRandomNumber(300),0);
        }
        if (isTouching(koala.class)){
            dimakan();
            Greenfoot.playSound("eat.mp3");
        }
        if (Counter2.value==0){
            getWorld().removeObject(this);
            Greenfoot.setWorld(new EndPage());
           
        }
    }
}
