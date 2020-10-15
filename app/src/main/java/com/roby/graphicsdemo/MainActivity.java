package com.roby.graphicsdemo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{

    ImageView ourView;

    //This is the entry point to our game

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        //Do all our drawing in a separate method
        draw();

        //Make ourView ImageView object the view for the Activity
        setContentView(ourView);
    }

    public void draw()
    {
        //Declare an object of type Bitmap
        Bitmap blankBitmap;

        //Make it 600x600 pixels in size and an appropriate format
        blankBitmap = Bitmap.createBitmap(600, 600, Bitmap.Config.ARGB_8888);

        //Declare an Object of type canvas
        Canvas canvas;

        //Initialize it by making its surface our previously created blank bitmap
        canvas = new Canvas(blankBitmap);

        //Initialize our previously declared number object of type ImageView
        ourView = new ImageView(this);

        //Put our blank bitmap on ourView
        ourView.setImageBitmap(blankBitmap);

        //We now have a surface ready to draw on
        //But we need something to draw with

        //Declare an object of type Paint
        Paint paint;

        //Initialize it ready for painting our canvas
        paint = new Paint();

        //Make the canvas white
        canvas.drawColor(Color.argb(255, 255, 255, 255));

        //Declare an object of type Bitmap
        Bitmap bitmapBob;

        //Initialize it using the logo3.png file
        bitmapBob = BitmapFactory.decodeResource(this.getResources(), R.drawable.logo3);

        //Now draw bob to our canvas
        canvas.drawBitmap(bitmapBob, 500, 25, paint);

        //Make the brush black
        paint.setColor(Color.argb(255, 0, 0, 0));
        //We can change this around as well

        //Draw a Rectangle
        canvas.drawRect(100, 400, 500, 500, paint);

        //Draw some text
        canvas.drawText("Tugas Draw Robby", 50, 50, paint);

        //Draw a circle
        canvas.drawCircle(400, 250, 75, paint);
        canvas.drawCircle(200, 250, 75, paint);

        //Make the brush white
        paint.setColor(Color.argb(255, 255, 255, 255));

        //Draw a circle
        canvas.drawCircle(400, 250, 70, paint);
        canvas.drawCircle(200, 250, 70, paint);

        //Draw a Rectangle
        canvas.drawRect(110, 410, 490, 490, paint);

        //Make the brush black
        paint.setColor(Color.argb(255, 0, 0, 0));

        //Draw a circle
        canvas.drawCircle(400, 250, 30, paint);
        canvas.drawCircle(200, 250, 30, paint);

    }
}