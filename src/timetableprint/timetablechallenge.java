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

		//loop and ask questions
		while (score<10) {
			int num1=rnd.nextInt(hi-low+1)+low;
			int num2=rnd.nextInt(hi-low+1)+low;
			
			System.out.println("Question "+ques+") "+num1+" x "+num2+" = ?");
			int ans=in.nextInt();
			if (ans==num1*num2) {
				score=score+1;
				System.out.println("Right");
			}else {
				score=0;
				System.out.println("Wrong! The answer is "+(num1*num2));

			}
			ques++;
		}
	
	}
}