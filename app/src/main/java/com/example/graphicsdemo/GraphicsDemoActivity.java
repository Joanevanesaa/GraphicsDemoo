package com.example.graphicsdemo;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

public class GraphicsDemoActivity extends Activity {

        ImageView ourView;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            draw();

            setContentView(ourView);
        }
        public void draw() {
            //declare an object of type bitmap
            Bitmap blankBitmap;
            //make it 1080 * 1080 pixels in size and an appropriate format
            blankBitmap = Bitmap.createBitmap(1080,1080,Bitmap.Config.ARGB_8888);
            //declare an object of type canvas
            Canvas canvas;
            //initialise it by making its surface to our previously created blank bitmap
            canvas = new Canvas(blankBitmap);

            //initialise our previously declared member object of type imageview
            ourView = new ImageView(this);
            //put our blank bitmap on ourview
            ourView.setImageBitmap(blankBitmap);

            //declare an object of type paint
            Paint paint;
            //initialize it ready for our painting canvas
            paint = new Paint();

            //make the canvas white
            canvas.drawColor(Color.argb(255,137,207,204));
            //make the brush blue
            paint.setColor(Color.argb(255,14,78,108));

            //declare an object of type bitmap
            Bitmap bitmapDuck;
            //initialise it using bob.png file
            bitmapDuck = BitmapFactory.decodeResource(this.getResources(), R.drawable.duck);
            //now draw bob to our canvas
            canvas.drawBitmap(bitmapDuck, 500,50,paint);

            //draw a line
            canvas.drawLine(50,50,175,250,paint);

            //draw pixel
            canvas.drawPoint(40,50,paint);

            //draw a circle
            canvas.drawCircle(350,250,50, paint);



        }
}
