/**
 * Main class of the application
 */
public class Main
{
	// TODO(done) main can not throw exceptions (nothing else can catch them)
	/**
	 * application launcher main method of the Main class
	 * @param args command-line arguments (unused)
	 * @throws UnexpectedNumberOfPlayerException when the number of player is different from 2,3,4 or 6 
	 */
	public static void main(String[] args)
	{
		try 
		{
			new ChineseCheckerGame(2).play();
			// ... game is over
		}
		catch (UnexpectedNumberOfPlayerException e) 
		{
			System.err.println("Unexpected number of player");
			e.printStackTrace();
		}
	}

}
