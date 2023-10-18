import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int scr = 0;
    public void act()
    {
        move();
        getpoin();
        dead();
        end();
    }
    
    public void move(){
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY() - 7);
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX() + 7, getY());
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY() + 7);
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX() - 7, getY());
        }
    }
    public void getpoin(){
        if(isTouching(Coin.class)){
            score(1);
            Greenfoot.playSound("coin.mp3");
        }
        if(isTouching(Star.class)){
            score(5);
            Greenfoot.playSound("star.mp3");
        }
    }
    public void score(int n){
        scr += n;
        getWorld().showText("Score: " + scr, 50, 30);
    }
    public void dead(){
        if(isTouching(Enemy.class)){
            getWorld().showText("GAME OVER!!!", 300, 300);
            getWorld().addObject(new Crash(), getX(), getY());
            getWorld().removeObject(this);
            Greenfoot.playSound("game-over.mp3");
            Greenfoot.stop();
        }
    }
    public void end(){
        if(scr >= 50){
            getWorld().showText("YOU WINN!!!", 300, 300);
            Greenfoot.stop();
        }
    }
}
