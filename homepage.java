import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class homepage extends World 
{    
    public homepage()
    {
        super(300, 500, 1); 
        prepare();
    }

    private void prepare()
    {

        play play = new play();
        addObject(play,149,270);
    }
    
}
