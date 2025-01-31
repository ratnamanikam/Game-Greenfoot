import greenfoot.*;

public abstract class racun extends Actor
{
    abstract void cetakbaru();
    abstract void maju();
    
    void dimakan(){
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
            Counter2.add(-1);
            dimakan();
        }
        if (Counter2.value==0){
            getWorld().removeObject(this);
        }
    }
}
