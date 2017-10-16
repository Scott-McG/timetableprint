package timetableprint;

import java.util.Random;
import java.util.Scanner;

public class timetablechallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		Random rnd=new Random();

		int hi;
		int low;
		int num;			

		//Ask for hi low and num
		System.out.println("I will print out any times table for you!");
		System.out.println("What is the biggest number you want?");
		hi=in.nextInt();
		System.out.println("What is the smallest number you want?");
		low=in.nextInt();

		System.out.print("\t");
		for (int x=low;x<+hi;x++) {
			System.out.print(x+"\t");

			System.out.println();
			System.out.print("\t");
			for (int y=low;y<=hi;y++) {
				System.out.println(y+"\n");
			}
		}
	}
}






