import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        
        addObject(new Plane(), 300, 500);
        
        for(int i = 0; i < 5; i++){
            addObject(new Coin(), Greenfoot.getRandomNumber(550) + 20, Greenfoot.getRandomNumber(550) + 20);
        }
        
        addObject(new Star(), 400, 400);
        
        addObject(new Bullet(), 200, 100);
        addObject(new Bullet(), 300, 100);
        addObject(new Bullet(), 400, 100);
        
        addObject(new Missile(), 300, 200);
        
    }
}
