package soy.pirata.escenademo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;

public class EscenaTaberna extends View{
	
	Bitmap taberna, prota, globo_hola;

	public EscenaTaberna(Context context) {
		super(context);
		
		taberna = BitmapFactory.decodeResource(getResources(), R.drawable.taberna2);
		prota = BitmapFactory.decodeResource(getResources(), R.drawable.prota2);
		globo_hola = BitmapFactory.decodeResource(getResources(), R.drawable.globo_hola2);
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		
		/* ****************** dibujamos el lienzo ************ */
		
		canvas.drawBitmap(taberna, 0, 0, null);
		
		/* ****************** dibujamos al prota ************ */
		
		canvas.drawBitmap(prota, 400, 195, null);
		
		/* ****************** dibujamos el texto "hola" ************ */
		canvas.drawBitmap(globo_hola, 370, 150, null);
		
		
	}

}
