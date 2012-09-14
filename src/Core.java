/*
 * NOTE: Do not be discouraged if any of this goes over your head or if you are overwhelmed.  I cannot claim to be
 * 		the best teacher around and I have been told that I can put things in an overcomplicated manner at times.
 * 		if any of this confuses you, do not be afraid to just ask me via email, call, or just walking up to me in the hall.
 * 		I can't emphasize enough that even if this looks complex at all, its really fairly simple in its concept once you've
 * 		had it explained to you properly.  With that in mind, I have commented (a comment is created with a // or a /*...*/ 
 /*		and does not affect the code) the code exesively to explain the different parts of the architechture.
 * 
 * NOTENOTE: This is just the architectual set up, none of the methods (or the things that actually do things)
 * 		are implimented, so don't worry, I didn't make the program without you.  I even left part of the
 * 		architechture incomplete for you guys to help me finish.  The only reason I went ahead and did a bit of the 
 * 		architecture was for educational purposes and being able to show our members who have less experience with code
 * 		and architechture how to work with object oriented programming.
 * 
 * 
 * This is the core class, this class takes care of starting up our game and creating new games and ending games that are finished.
 * 
 * 
 */

//This class contains the "main" method that is run when a user launches the program
/*
 * But wait, what is a class? A class is a type of object.  Whats an object? An apple is an object, so is a stapler, so is a
 * person.  What does this have to do with programming?  In object oriented programming, which is what java is, data is stored
 * in classes that have methods and fields.  Think of it like this, a person has methods.  He can walk, run, jump, or swim.
 * A programatic version of a person would simply be a class with those methods.  A person also has fields.  He has hair color,
 * age, height, etc.  A programatic version of a person would have these fields.  A class of Person, can then be instantiated to
 * create an object i.e. the class of person could be used to instantiate a person named bob.  I will show you how to instantiate
 * objects later, but for now, these files are all simply architechture of classes, so no objects are being instantiated yet.
 */
public class Core {

	//This is a field. An instantiated object of Core will have a field describing the game associated with it.
	//Note that this field is marked "private" this means that no object can access this information except the instanciated
	//object of core itself.  For a person, think of a private field as being like thoughts, noone else can access your thoughts,
	//unless you tell them your thoughts of course, but these thoughts are only directly accesible by you.
	private Game game;
	
	//This is the "main" method that is run when the program launches, each part of this line is essential.
	//The word "public" just means that other parts of the program can see and use this method
	//The word "static" means that this method belongs to the entire class encompasing it, not just a single object. 
		//i.e. The person class might have a static field keeping track of the amount of people in existence this field belongs 
		//to the entire person class, not just an individual.
	//The word "void" means that this method returns "void" aka nothing
	//As for main(String args[]), that is just the name of the method, for the main method, it must be as written here,
	//	otherwise the program will not be able to find the main method, and will not run.
	public static void main(String args[])
	{
		
	}
	
	//This is called documentation, its really just a different type of comment, but compilers make it blue, so it looks
	//prettier.  Javadocs also uses it, but don't worry about what that is, its not particuarly useful for team projects.
	//Ask me about it if you really want to know.
	/**
	 * This method creates a new game
	 */
	/*
	 * This is another public method, but notice that it does not have the "static" modifier, this means that the method belongs
	 * to an object, so if you instantiate it, an object will be able to call this method
	 */
	public void newGame()
	{
		
	}
	
	/**
	 * This method ends a given game
	 *
	 *@param game the game to be ended
	 */
	//another non-static method
	//This method has a paramater, I sortof brushed over paramaters in the main method because the main method parameter is
	//not used a whole lot unless the program is a command line application.  A paramater passes information to a method.
	//Here the method recieves a game, the method will operate on this game and shut it down, according to its specification,
	//at least.  An example of this for a person would be if a person were to throw a ball.  He would have a method something
	//like throw(ball), the person would then thrown the ball given to him.  Note that this parameter may be useless in this case.
	//But i think we all learned something from it, so thats all right.
	public void endGame(Game game)
	{
		
	}
}
