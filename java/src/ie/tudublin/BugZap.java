package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet {

    float playerX, bugX, bulletX;
    float playerY, bugY, bulletY;
    float playerWidth;
    float shoot;

    public void settings()
	{
		size(500, 500);
	}

    public void setup()
	{
		colorMode(HSB);
		background(255);
        
        playerX = width / 2;
        playerY = height / 2;
        bugX = width / 2;
        bugY = 50;
        playerWidth = 30;
	}

    public void draw()
	{
        background(255);
        
		drawPlayer(playerX, playerY, playerWidth);
        
        if ((frameCount % 5) == 0)
        {
            bulletY -= 10;
        }


        if ((frameCount % 60) == 0)
        {
        bugX = bugX + random(-100,100);
        bugY = bugY + random(-100,100);
        if(bugX > 500)
        {
            bugX = 500;
        }
        if(bugX < 0)
        {
            bugX = 0;
        }
        if(bugY > 500)
        {
            bugY = 500;
        }
        if(bugY < 0)
        {
            bugY = 0;
        }
            
    }
    drawBug(bugX, bugY);
    fire(bulletY);

    shoot = 0;
	}

    public void drawBug(float x, float y)
    {
        noStroke();
        fill(0);
        rectMode(CENTER);
        rect(x, y, 20, 20);
    }


    public void drawPlayer(float x, float y, float w)
    {
        noStroke();
        fill(0);
        rectMode(CENTER);
        rect(x, y, w, w);
    }

    public void fire(float y)
    {
        bulletY = y;
        fill(0);
        stroke(5);
        rectMode(CENTER);
        rect(bulletX, bulletY, 10, 15);
        
    }

    public void keyPressed()
	{
		if (keyCode == LEFT)
		{
			playerX -= 10;
		}
		if (keyCode == RIGHT)
		{
			playerX += 10;
		}
        if (keyCode == UP)
		{
			playerY -= 10;
		}
		if (keyCode == DOWN)
		{
			playerY += 10;
		}
        
		if (key == ' ')
		{
			shoot = 1;
            bulletY = playerY;
            bulletX = playerX;
		}
	}
    
}
