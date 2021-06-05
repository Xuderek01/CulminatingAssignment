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

	// Initializes global variables for equations to become accessible to other group members
		//
		public static double v1 = 0; // initial velocity
		public static double v2 = 0; // final velocity
		public static double t = 0; // time
		public static double a; // acceleration
		public static double g = 0; // gravity
		public static double dis = 0; // displacement
		public static double f = 0; // force
		public static double work = 0; // work
		public static double k = 0; // spring constant
		public static double mass = 0; // mass
		public static double tv = 0; // total velocity
		public static double h = 0; // height
		public static double result; //solution of the equation
		public static int exponent; // exponent

	public static double acceleration(double v1,double v2,double t){ //Acceleration Calculator
		double result = 0;	
		try { // attempts to solve equation
			result = (v2-v1)/t; // result is answer of equation
		}
		catch (ArithmeticException e) { // catches exception
				System.out.println(e); 
		}
		return result; // prints the answer
	}

	public static double displacement(double v1,double t, double a){ //Displacement Calculator
		double result = 0;
		int exponent = (int) Math.pow(t, 2); // initializes exponent 
		try {
			result = (v1*t + 0.5*a*(exponent)); // includes exponent within equation
		}
		catch (ArithmeticException e) {
				System.out.println(e);
		}
		return result; 
	}
	// process repeats with other methods

	public static double force(double mass, double a){ //Force Calculator
		double result = 0;	
		try {
			result = mass*a;
		}
		catch (ArithmeticException e) {
				System.out.println(e);
		}
		return result;
	}

	public static double freefall(double g, double t ){ //Free Fall Calculator
		double result = 0;
		int exponent = (int) Math.pow(t, 2);
		try{
			result = 0.5*g * (exponent);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		return result;
	}

	public static double velocity(double dis, double t ){ //Velocity Calculator
		double result = 0;
		try{
			result = dis/t;
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		return result;
	}
	
	public static double work(double f, double dis ){ //Work Calculator
		double result = 0;
		try{
			result = f * dis;
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		return result;
	}
	
	public static double power(double work, double t ){ //Power Calculator
		double result = 0;
		try{
			result = work/t;
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		return result;
	}

	public static double elastic(double k, double dis ){ //Elastic Calculator
		double result = 0;
		int exponent = (int) Math.pow(dis2, 2);
		try{
			result = 0.5*k * (exponent);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		return result;
	}
	
	public static double kinetic(double mass, double tv ){ //Kinetic Calculator
		double result = 0;
		int exponent = (int) Math.pow(tv, 2);
		try{
			result = 0.5*mass * (exponent);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		return result;
	}

	public static double gravity(double mass, double g, double h ){ //Gravity Calculator
		double result = 0;

		try{
			result = mass*g*h;
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		return result;
	}
}
