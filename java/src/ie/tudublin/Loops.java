package ie.tudublin;

import java.util.Scanner;

import processing.core.PApplet;

public class Loops extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);
		
		
	}

	
	public void draw()
	{	
		noStroke();
		Scanner init = new Scanner(System.in);
		int mode = init.nextInt();
		
		if(mode == 0)
		{	
			int pos = 0;
			float hue = 0.0f;
		
			for(;pos<10;pos++)
			{
			hue = pos * (17.0f);
			fill(hue,255,255);
			rect((width/10)*pos,0,((width/10)*pos)+(width/10),height);
			}
		}
		if(mode == 1)
		{
			int posx = 0;
			
			float hue = 0.0f;
		
			for(;posx<10;posx++)
			{
			hue = posx * (17.0f);
			fill(hue,255,255);
			rect((width/10)*posx,(height/10)*posx,((width/10)*posx)+(width/10),((height/10)*posx)+(height/10));
			}
		}
	}
}
