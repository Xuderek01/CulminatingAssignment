/*
Culminating Assignment : Grade 11 Energy Physics Calculator
Purpose:  to create a calculator that assists in learning and solving physics equations related to the Energy unit
Teacher: Mr. Ho
Created by: Kevin Chen
Group Members: Derek, Gordon, Vicky
Date: June 4th


*/


import java.lang.*;
import java.util.*;
import java.io.*;

class Calculations {
	public static double acceleration(double v1,double v2,double t){ //Acceleration Calculator
		double result = 0;	
		try {
			result = (v2-v1)/t;
		}
		catch (ArithmeticException e) {
				System.out.println(e);
		}
		return result;
	}

	public static double displacement(double v1a,double t1, double a){ //Displacement Calculator
		double result1 = 0;
		int exponent = (int) Math.pow(t1, 2);
		try {
			result1 = (v1a*t1 + 0.5*a*(exponent));
		}
		catch (ArithmeticException e) {
				System.out.println(e);
		}
		return result1;
	}

	public static double force(double m, double a1){ //Force Calculator
		double result2 = 0;	
		try {
			result2 = m*a1;
		}
		catch (ArithmeticException e) {
				System.out.println(e);
		}
		return result2;
	}

	public static double freefall(double g, double t2 ){ //Free Fall Calculator
		double result3 = 0;
		int exponent2 = (int) Math.pow(t2, 2);
		try{
			result3 = 0.5*g * (exponent2);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		return result3;
	}

	public static double velocity(double dis, double t3 ){ //Velocity Calculator
		double result4 = 0;
		try{
			result4 = dis/t3;
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		return result4;
	}
	
	public static double work(double f, double dis1 ){ //Work Calculator
		double result5 = 0;
		try{
			result5 = f * dis1;
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		return result5;
	}
	
	public static double power(double work, double t4 ){ //Power Calculator
		double result6 = 0;
		try{
			result6 = work/t4;
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		return result6;
	}

	public static double elastic(double k, double dis2 ){ //Elastic Calculator
		double result7 = 0;
		int exponent3 = (int) Math.pow(dis2, 2);
		try{
			result7 = 0.5*k * (exponent3);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		return result7;
	}
	
	public static double kinetic(double mass, double tv ){ //Kinetic Calculator
		double result8 = 0;
		int exponent4 = (int) Math.pow(tv, 2);
		try{
			result8 = 0.5*mass * (exponent4);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		return result8;
	}

	public static double gravity(double mass1, double g1, double h ){ //Gravity Calculator
		double result9 = 0;

		try{
			result9 = mass1*g1*h;
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		return result9;
	}

	public static void OptionMenu(){ //Option Menu for user to select which formula they wish to use
		System.out.println("GRADE 11 PHYSICS ENERGY CALCULATOR\n~~~~~~~~~~\nPlease Choose a Formula\n"
		.concat("1. Acceleration \n")
		.concat("2. Displacement \n")
		.concat("3. Force  \n")
		.concat("4. Free Fall \n")
		.concat("5. Velocity  \n")
		.concat("6. Work \n")
		.concat("7. Power\n")
		.concat("8. Potential Elastic Energy\n")
		.concat("9. Potential Kinetic Energy\n")
		.concat("10. Potential Gravitational Energy\n")
		.concat("11. Quit \n")
		.concat("Enter menu option (1-9)\n~~~~~~~~~~"));
		
	}

	public static void main(String [] args)throws ArithmeticException{
		Scanner sc = new Scanner(System.in);

		// Initializes all the options as strings
		String UserInput;
		String Acceleration = "1";
		String Displacement = "2";
		String Force = "3";
		String FreeFall = "4";
		String Velocity = "5";
		String Work = "6";
		String Power = "7";
		String Elastic = "8";
		String Kinetic = "9";
		String Gravity = "10";
		String ExitProgram = "11";

		// Initializes variables for every equation
		//Acceleration
		double v1 = 0;
		double v2 = 0;
		double t = 0;
		//Displacement
		double v1a = 0;
		double t1 = 0;
		double a;
		//Force
		double m = 0;
		double a1 = 0;
		//Free Fall
		double g = 0;
		double t2 = 0;
		//Velocity
		double dis = 0;
		double t3 = 0;
		//Work
		double f = 0;
		double dis1 = 0;
		//Power
		double work = 0;
		double t4 = 0;
		//Elastic 
		double k = 0;
		double dis2 = 0;
		//Kinetic
		double mass = 0;
		double tv = 0;
		//Gravity
		double mass1 = 0;
		double g1 = 0;
		double h = 0;


		do {
			OptionMenu(); // prints the menu after every successful equation solving
			UserInput = sc.nextLine();

			if (UserInput.equals(Acceleration)){ // prompts user input(repeats for every option)
				//Acceleration  
			System.out.println("Please enter the intial velocity");
			v1 = sc.nextDouble();

			System.out.println("Please enter the final velocity");
			v2 = sc.nextDouble();

			System.out.println("Please enter the time");
			t = sc.nextDouble();
			while (t == 0){
				System.out.println("Invalid, please try again");
				t = sc.nextDouble();
			}	
			double accel = acceleration(v1, v2, t);
			System.out.println(accel);

			sc.nextLine();

			}
			else if(UserInput.equals(Displacement)){ 
				// Displacement 
				System.out.println("Please enter the intial velocity");
				v1a = sc.nextDouble();

				System.out.println("Please enter the time");
				t1 = sc.nextDouble();

				System.out.println("Please enter the acceleration");
				a = sc.nextDouble();

				double displ = displacement(v1a, t1, a);
				System.out.println("~~~~~~~~~~");
				System.out.println("Your Answer is " + displ);
				System.out.println();

				sc.nextLine();
			} 
			else if(UserInput.equals(Force)){ 
				// Force 
				System.out.println("Please enter the mass");
				m = sc.nextDouble();

				System.out.println("Please enter the acceleration");
				a1 = sc.nextDouble();


				double forc = force(m, a1);
				System.out.println("~~~~~~~~~~");
				System.out.println("Your Answer is " + forc);
				System.out.println();

				sc.nextLine();
			}
			else if(UserInput.equals(FreeFall)){ 
				// freefall 
				System.out.println("Please enter the gravity");
				g = sc.nextDouble();

				System.out.println("Please enter the time");
				t2 = sc.nextDouble();


				double free = freefall(g, t2);
				System.out.println("~~~~~~~~~~");
				System.out.println("Your Answer is " + free);
				System.out.println();

				sc.nextLine();
			}
			else if(UserInput.equals(Velocity)){ 
				// velocity
				System.out.println("Please enter the displacement");
				dis = sc.nextDouble();

				System.out.println("Please enter the time");
				t3 = sc.nextDouble();


				double velo = velocity(dis, t3);
				System.out.println("~~~~~~~~~~");
				System.out.println("Your Answer is " + velo);
				System.out.println();

				sc.nextLine();
			}
			else if(UserInput.equals(Work)){ 
				// work
				System.out.println("Please enter the force");
				f = sc.nextDouble();

				System.out.println("Please enter the displacement");
				dis1 = sc.nextDouble();


				double werk = work(f, dis1);
				System.out.println("~~~~~~~~~~");
				System.out.println("Your Answer is " + werk);
				System.out.println();

				sc.nextLine();
			}
			else if(UserInput.equals(Power)){ 
				// power
				System.out.println("Please enter the work");
				work = sc.nextDouble();

				System.out.println("Please enter the time");
				t4 = sc.nextDouble();


				double pow = power(work, t4);
				System.out.println("~~~~~~~~~~");
				System.out.println("Your Answer is " + pow);
				System.out.println();

				sc.nextLine();
			}
			else if(UserInput.equals(Elastic)){ 
				// elastic
				System.out.println("Please enter the spring constant");
				k = sc.nextDouble();

				System.out.println("Please enter the displacement");
				dis2 = sc.nextDouble();


				double elas = elastic(k, dis2);
				System.out.println("~~~~~~~~~~");
				System.out.println("Your Answer is " + elas);
				System.out.println();

				sc.nextLine();
			}
			else if(UserInput.equals(Kinetic)){ 
				// kinetic
				System.out.println("Please enter the mass");
				mass = sc.nextDouble();

				System.out.println("Please enter the total velocity");
				tv = sc.nextDouble();


				double kine = kinetic(mass, tv);
				System.out.println("~~~~~~~~~~");
				System.out.println("Your Answer is " + kine);
				System.out.println();

				sc.nextLine();
			}
			else if(UserInput.equals(Gravity)){ 
				// gravity
				System.out.println("Please enter the mass");
				mass1 = sc.nextDouble();

				System.out.println("Please enter the gravity");
				g1 = sc.nextDouble();

				System.out.println("Please enter the height");
				h = sc.nextDouble();


				double grav = gravity(mass1, g1, h);
				System.out.println("~~~~~~~~~~");
				System.out.println("Your Answer is " + grav);
				System.out.println();

				sc.nextLine();
			}
		} while(!UserInput.equals(ExitProgram)); // Closes the program 
		

	}
}