package javademo;

import java.util.Scanner;

class Main {
	  public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);
	    String userName;
	    String city;
	    
	    // Enter username and press Enter
	    System.out.println("Enter username"); 
	    userName = myObj.nextLine();   
	       
	    System.out.println("Enter cityName"); 
	    city = myObj.nextLine();   
	    
	    System.out.println("Username is: " + userName); 
	    System.out.println("Cityname is:" + city);
	  }
	}
