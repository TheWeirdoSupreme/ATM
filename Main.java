import java.util.*;
import java.sql.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Admin ad = new Admin();
	    

	    Connection conn = null;
	    try {
	        conn =
	           DriverManager.getConnection("jdbc:mysql://localhost:3306/MySQL80", "root", "jalen0917");

	        // Do something with the Connection

	    } catch (SQLException ex) {
	        // handle any errors
	        System.out.println("SQLException: " + ex.getMessage());
	        System.out.println("SQLState: " + ex.getSQLState());
	        System.out.println("VendorError: " + ex.getErrorCode());
	    }
            
		System.out.println("Welcome to the International Banking System!");
		System.out.println("--------------------------------------------");
		System.out.println("");
		String personel = "";
		while(true){
    		System.out.println("Are you an Account (H)older or an (A)dministrator?");
    		String type = sc.nextLine();
    		if (type.equals("H") || type.equals("h")){
    		    personel = "h";
    		    break;
    		}
    		else if(type.equals("A") || type.equals("a")){
    		    personel = "a";
    		    break;
    		}
    		else{
		        System.out.println("Please select a valid option.");
		    }
		}
		if(personel.equals("h")){
		    System.out.print("Services Not Yet Available");
		}
		else{
		    while(true){
    		    System.out.print("Enter Username: ");
    		    String userName = sc.nextLine();
    		    System.out.print("Enter Password: ");
    		    String password = sc.nextLine();
    		    if(ad.logIn(userName, password)){
    		        System.out.print("Services Not Yet Available");
    		        break;
    		    }
    		    else{
    		        System.out.println("Incorrect username or password. Please try again.\n");
    		    }
		    }
		}
	}
}
