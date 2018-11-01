/*
 *Michael Haugh
 *Magpie Activity 2
 *AP CS
 *10-31-18
 */

package magpieactivity2;

public class MagpieActivity2 {
    /**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
                
                if (statement == null || (statement.trim()).length() == 0)
                {
                        response = "Say something, please.";
                }
                
                else if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
                
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
                
                else if (statement.indexOf("cat") >= 0 
                                || statement.indexOf("dog") >= 0
                        )                       
                {
                        response = "Tell me more about your pets.";
                }
                
                else if (statement.indexOf("Mr. Mulroy") >= 0)                       
                {
                        response = "He sounds like a good teacher.";
                }
                
                else if (statement.indexOf("school") >= 0
                                || statement.indexOf("classroom") >= 0
				|| statement.indexOf("teacher") >= 0)                       
                {
                        response = "Tell me more about your school.";
                }
                
                else if (statement.indexOf("driving") >= 0
                                || statement.indexOf("car") >= 0)                      
                {
                        response = "I'd like to learn more about your vehicle.";
                }
                
                else if (statement.indexOf("money") >= 0)                    
                {
                        response = "We could all use a little more money.";
                }

		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
                else if (whichResponse == 4)
		{
			response = "Well how about that.";
		}
                else if (whichResponse == 5)
		{
			response = "That is very interesting to me.";
		}

		return response;
	}
}
