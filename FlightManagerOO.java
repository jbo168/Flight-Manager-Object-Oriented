import java.io.*;
import java.util.*;
import javax.swing.*;

public class FlightManagerOO
{
	public static ArrayList<ArrayList<Airports>> airports;
    public static ArrayList<ArrayList<Flights>> flights;

	public static void main(String[] args) throws IOException
	{
		int     choice;
    	String  menuOption = "";  
	    while ((menuOption != null) && (!(menuOption.equals("0"))))
	    {  
	      menuOption = getMenuOption();
	      if (menuOption != null)
	      {
		    choice = Integer.parseInt(menuOption);  
			    if (choice != 0)
		      	{
			      switch(choice)
			      {
			        case 1: ();   break;
		          	case 2: ();   break;
		          	case 3: ();   break;
		          	case 4: ();   break;
		          	case 5: ();   break;
			        case 6: ();   break;
		          	case 7: ();   break;
		          }
		       }
	      }
	    }  
	}

	public static String getMenuOption()
	{
		String menuOptions = "1. Add a new airport to Aiports.txt" +	  
     					 	 "\n2. Edit the name of an airport in Aiports.txt"    +
     					 	 "\n3. Delete an airport from Airports.txt and it's associated flight in Flights.txt" +
     					 	 "\n4. Edit travel days and travel dates of a flight" +
      				 	 	 "\n5. Delete a flight" +
     					 	 "\n6. Search for flights by entering a source airport and a destination airport" +
     					 	 "\n7. Search for flights by entering a source airport, a destination airport and a departure date" +
               				 "\n0. Exit.";
   
	    String menuMessage =  	 "Choose number of option you wish to have executed";
	    String errorMessage =	 "Invalid menu selection.\n\nValid options are 0 to 7 inclusive.";
	       	   errorMessage +=	 "\nSelect OK to retry.";
	    String errorHeader = 	 "Error in user input";
	    boolean validInput = false;
	    String selection = "", menuChoicePattern = "[0-7]{1}";
	    while (!(validInput))
	    {
	      selection = JOptionPane.showInputDialog(null, menuOptions, menuMessage, 3);
	      if (selection == null || selection.matches(menuChoicePattern))
	       validInput = true;
	      else
	       JOptionPane.showMessageDialog(null, errorMessage, errorHeader, 2);
	    }				   
	    return selection;
	}
}