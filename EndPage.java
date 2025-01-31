import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class EndPage extends World 
{
    GreenfootSound backgroundMusic = new GreenfootSound("gameover.mp3");
    
    public EndPage()
    {    
        super(300, 500, 1); 
        prepare();
        backgroundMusic.play();
    }

    private void prepare()
    {
        exit exit = new exit();
        addObject(exit,155,261);
        replay replay = new replay();
        addObject(replay,155,232);
    } 
}
