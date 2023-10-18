import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Props here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Props extends Actor
{
    /**
     * Act - do whatever the Props wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (isTouching(Player.class)){
            setLocation(Greenfoot.getRandomNumber(550) + 20, Greenfoot.getRandomNumber(550) + 20);
        }
    }
}
