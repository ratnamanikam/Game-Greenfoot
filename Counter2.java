import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Counter2 extends Actor
{
    private static final Color transparent = new Color(0, 0, 0, 0);
    private GreenfootImage background;
    public static int value;
    private static int target;
    private String prefix;
    
    public Counter2()
    {
        this(new String());
    }

    /**
     * Create a new counter, initialised to 0.
     */
    public Counter2(String prefix)
    {
        background = getImage();  // get image from class
        value = 5;
        target = 5;
        this.prefix = prefix;
         updateImage();
        setLocation(210, 300);
    }
    
    public void act() 
    {
        if (value < target) {
            value++;
            updateImage();
        }
        else if (value > target) {
            value--;
            updateImage();
        }
    }

    public static void add(int score)
    {
        target += score;
        if (target > 5) {
        target = 5;
        }
    }

    public int getValue()
    {
        return target;
    }

    public void setValue(int newValue)
    {
        target = newValue;
        value = newValue;
        updateImage();
    }

    public void setPrefix(String prefix)
    {
        this.prefix = prefix;
        updateImage();
    }

    private void updateImage()
    {
        GreenfootImage image = new GreenfootImage(background);
        GreenfootImage text = new GreenfootImage(prefix + value, 22, Color.BLACK, transparent);
        
        image.setColor(new Color(0, 0, 0, 0));
        image.fill();
        
        if (text.getWidth() > image.getWidth() - 20)
        {
            image.scale(text.getWidth() + 20, image.getHeight());
        }
        
        image.drawImage(text, (image.getWidth()-text.getWidth())/2, 
                        (image.getHeight()-text.getHeight())/2);
        setImage(image);
    }
    
    public void gameOver(){
        if (target == 0){
            ((MyWorld) getWorld()).stopMusic();
            Greenfoot.stop();
            Greenfoot.playSound("gameover.mp3");
        }
        
    }
}
