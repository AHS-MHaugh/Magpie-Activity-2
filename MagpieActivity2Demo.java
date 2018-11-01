/*
 *Michael Haugh
 *Magpie Activity 2
 *AP CS
 *10-31-18
 */

package magpieactivity2;

import java.util.Scanner;

public class MagpieActivity2Demo {

    public static void main(String[] args) {
       		MagpieActivity2 maggie = new MagpieActivity2();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
    }

}


