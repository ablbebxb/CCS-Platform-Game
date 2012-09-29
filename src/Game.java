/*
 * This is the Game class.  This class runs games.
 * 
 */
import javax.swing.JFrame;
import java.awt.event.KeyEvent;

public class Game extends JFrame{
	
	//dunno what this is, but JFrame classes complain when they dont have one =/
	static final long serialVersionUID = 0;
	
	//static because it is a constant number, also indicated by the final keyword
	/**
	 * The x displacement of the terrain relative to the lefthand side of the screen.
	 */
	static final private int pos = 10;
	
	/**
	 * The player in the game
	 */
	public Player player;
	
	/**
	 * The terrain in the game
	 */
	public Terrain terrain;
	
	/**
	 * Displays the terrain and the player in their proper positions
	 */
	public void display()
	{
		
	}
	
	/**
	 * Overrides a superclass implementation of this method, called every time
	 * a user presses a key
	 */
	//the "@Override thing below is called an annotation, these can give the compiler directives so that the compiled program
	//runs as you want it to, in certain cases, or simply runs faster in other cases
	@Override
	protected void processKeyEvent(KeyEvent e)
	{
		
	}
	
	/**
	 * Scrolls the screen to the side the given amount and generates the given amout of terrain
	 * @param i how far to scroll the screen in pixels
	 */
	public void scrollScreen(int i)
	{
		
	}
	
	/**
	 * The game loop (runs one frame)
	 */
	public void gameLoop()
	{
		
	}
}
