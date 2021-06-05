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

	// Initializes variables for every equation
		//Acceleration
		public static double v1 = 0;
		public static double v2 = 0;
		public static double t = 0;
		public static double a;
		public static double m = 0;
		public static double g = 0;
		public static double dis = 0;
		public static double f = 0;
		public static double work = 0;
		public static double k = 0;
		public static double mass = 0;
		public static double tv = 0;
		public static double h = 0;
		public static double result;
		public static int exponent;

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

	public static double displacement(double v1,double t, double a){ //Displacement Calculator
		double result = 0;
		int exponent = (int) Math.pow(t, 2);
		try {
			result = (v1*t + 0.5*a*(exponent));
		}
		catch (ArithmeticException e) {
				System.out.println(e);
		}
		return result;
	}

	public static double force(double m, double a){ //Force Calculator
		double result = 0;	
		try {
			result = m*a;
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
