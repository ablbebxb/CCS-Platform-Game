/*
 * This is the player class.  I didn't do architecture for this class yet.
 * 
 * The player class contains information about the position, movement, and appearance of a player in-game.
 */

import java.awt.Image;

public class Player {
	private int x;//player's x position on the screen
	private int y;//player's y position on the screen
	
	private int velocityY;//The change in Y to be excecuted every movement.
	
	private Image img;//The image used to represent the player
	
	/**
	 * Sets the players vertical velocity
	 * @param i the player's new vertical velocity
	 */
	public void SetVelocityY(int i)
	{
		
	}
	
	/**
	 * Modifies the player's current x position by the given amount
	 * @param i The amount of pixels to modify the player's x position by
	 */
	public void MoveX(int i)
	{
		
	}
	
	/**
	 * Updates the player's current position based on its velocity
	 */
	public void update()
	{
		
	}
	
	/**
	 * Loads the image to use as the player's image
	 * @param url The url of the image to load
	 */
	public void LoadImage(String url)
	{
		
	}
}
