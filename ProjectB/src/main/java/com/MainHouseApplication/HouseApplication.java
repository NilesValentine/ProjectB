package com.MainHouseApplication;
import java.util.Scanner;




public class HouseApplication {
		public static void main(String[] args) {
			
			House obj2 = new House ("Customer","House0");
			obj2.ShowMenu();
		}
		

	}

	class House
	{
		int numberofRooms;
		String previousRoom;
		String CustomerName;
		String CustomerID;
		
		House (String cname, String cid)
		{
		CustomerName =cname;
		CustomerID= cid;
		}


		void ShowMenu()
		{
			char option='\0';
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Welcome "+CustomerName);
			System.out.println("You have bought "+CustomerID);
			System.out.println("\n");
			System.out.println("Would you like a tour of the house?");
			System.out.println("Y. Yes.");
			System.out.println("N. No.");
			
			do
			{
				option= scanner.next().charAt(0);
				
				switch(option)
				{
				case 'Y':
					System.out.println("This is the foyer");
					System.out.println("Which part of the house should I show you?");
					option= scanner.next().charAt(0);
					System.out.println("1. Main floor.");
					System.out.println("2. Upstairs.");
					
				
					
					do
					{
						option = scanner.next().charAt(0);
						
						
						switch(option)
						{ case '1':
							
							System.out.println("This is the main den");
							System.out.println("Which room do you want to go to?");
							System.out.println("M. Master Bedroom");
							System.out.println("K. Kitchen");
							System.out.println("B. Bedroom 1");
							System.out.println("b. Bedroom 2");
							System.out.println("T. Bathroom 1"); // T represents 'toilet' and is used to set bathroom
							System.out.println("t. Bathroom 2"); // T represents 'toilet' and is used to set bathroom
							
							do
							{
								option = scanner.next().charAt(0);
								
								
								switch(option)
								{ 
								case 'M':
									System.out.println("This is the Master Bedroom");
									break;
									
									
								case 'K':
									System.out.println("This is the kitchen.");
									break;
									
								case 'B':
									
									System.out.println("This is the first bedroom");
									break;
									
								case 'b':
									System.out.println("This is the second bedroom");
									break;
									
								case 'T':
									System.out.println("This is the first bathroom");
									break;
									
								case 't':
									System.out.println("this is the second bathroom");
									break;
									
								default:
									System.out.println("Invalid Option! Please enter again");
									break;
								
								}
							} while (option != '1');
						
							
						case '2':
							System.out.println("Welcome to the upstairs game room");
							System.out.println("Which console would you like to see?");
							System.out.println("P. Playstation 5");
							System.out.println("X. XboxOne");
							System.out.println("S. Switch");
							
							do
							{
								option = scanner.next().charAt(0);
								
								
								switch(option)
								{ 
								case 'X':
									System.out.println("The Xbox is fully stocked with the lastest games");
									break;
									
								case 'P':
									System.out.println("The Playstation is fully stocked with the latest games");
									break;
									
								case 'S':
									System.out.println("The Nintendo Switch is fully stocked with the latest games.");
									break;
									
								default:
									System.out.println("Invalid Option! Please enter again");
									break;
								}
								
								} while (option != '2');
							
						}
						
					} while (option != 'Y');
					
				 
				
					
					
					
				case 'N':
					
					System.out.println("Okay then");
					break;
				
				default:
					System.out.println("Invalid Option! Please enter again");
					break;
					
				}
					
			}while (option != 'N');
			System.out.println("Thank You for purchasing the house and have a blessed day.");
			
				

		}

		}



