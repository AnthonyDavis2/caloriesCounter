package tyonHw2;

import java.util.Scanner;

public class calories {
	static Scanner in = new Scanner(System.in);
	static String who;
	static int age; 
	static double height; 
	static int height1;
	static int height2; 
	static double weight; 
	static double bmr;
	static int amount=0; 
	
	public static void main(String[] args) { 
		getGender(); 
		getAge(); 
		getWeight(); 
		getHeight();
		getFood(); 
		getBmr();
		printSch(); 
	}
	
	private static void getFood() {
		// TODO Auto-generated method stub
		System.out.println("How many meals have you had today?");
		int num = in.nextInt(); 
		for(int i = 0; i<num; i++) { 
			System.out.println("Meal #"+(i+1)+" calories: ");
			int huh = in.nextInt(); 
			amount = amount + huh; 
		}
	}

	private static void printSch() {
		// TODO Auto-generated method stub
		System.out.println("You don't exercise: " + Math.round(((bmr * 1.2)-amount)));
		System.out.println("You engage in light exercise one to three days a week: " + Math.round(((bmr * 1.375)-amount)));
		System.out.println("You exerise moderately three to five times a week: " + Math.round(((bmr * 1.55)-amount)));
		System.out.println("You exercise intensely six to seven days a week: " + Math.round(((bmr * 1.725)-amount)));
		System.out.println("You exercise intensely six to seven days a week and have a physically active job: " + Math.round(((bmr * 1.9)-amount)));

		
	}

	private static double getBmr() {
		// TODO Auto-generated method stub
		double temp; 
		if(who.equals("female")) { 
			temp = 655 + (4.35 * weight) + (4.7 * height) - (4.7 * age);
			bmr = temp;
		}else if(who.equals("male")) {
			temp = 665 + (6.23 * weight) + (12.7 * height) - (6.8 * age);
			bmr = temp; 
		}
		return bmr;
	}

	private static double getHeight() {
		// TODO Auto-generated method stub
		System.out.println("Enter height ");
		System.out.println("Feet: ");
		int temp = in.nextInt(); 
		if(temp <= 7 && temp >=0) {
			height1 = temp; 
		}else { 
			getHeight(); 
		}
		System.out.println("Inches: ");
		int temp2 = in.nextInt(); 
		if(temp2 <= 11 && temp2 >=0) {
			height2 = temp2; 
		}else { 
			getHeight();
		}
		height = (height1 *12)+height2; 
		return height; 
	}

	private static double getWeight() {
		// TODO Auto-generated method stub
		double temp; 
		System.out.println("Enter weight (in lbs): ");
		temp = in.nextDouble();  
		weight = temp; 
		return weight; 
	}

	private static int getAge() {
		// TODO Auto-generated method stub 
		System.out.println("Enter Age: "); 
		int temp = in.nextInt(); 
		if(temp <= 100 && temp > 0) { 
			age = temp; 
		}
		else { 
			getAge(); 
		}
		return age; 
	}

	private static String getGender() {
		// TODO Auto-generated method stub
		System.out.println("what is your gender?");
		String temp = in.nextLine();
		if(temp.equals("male")) { 
			who = "male"; 
		}else if(temp.equals("female")) { 
			who = "female"; 
		}else {
			getGender(); 
	}
		return who; 
	}
	}
