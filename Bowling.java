package com.assignment;

public class Bowling {
	public static void main(String[] args) {
		int numberOfPins = 10;
		int frames = 10;
		int throwsPerFrame = 2;
		
		Bowling ad = new Bowling();
		ad.playTenFrames();
	}
	
	public  void startFrame(){
		
		int numberOfPins = 10;
		int remainPins = (int) (numberOfPins - (Math.random() * 10 )+1 );
		//System.out.println("First hit down "+ (int)(Math.random() * 10 ));
		
		System.out.println("You have " + remainPins + " pin/s remaining after first try");
		
		remainPins = (int) (remainPins - (Math.random() * remainPins ) );
		//System.out.println("Second hit DOwn"+ (int)(Math.random() * remainPins ));
		 System.out.println("You have " + remainPins + " pin/s remaining after 2nd try\n");
		 
		int score = Math.abs(remainPins - numberOfPins);
		
		System.out.println("Your score is " + score +"\n");
		 
	}
	
	public void playTenFrames()
	{
		for (int i = 1; i < 11; i++) {
			startFrame();
			//String[] gameScore = new String[];
			System.out.println("you finished round "+ i + "\n" );
		}
	}
}
