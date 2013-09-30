package soy.pirata.escenademo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends Activity implements View.OnClickListener{
	
	EscenaTaberna taberna;
	View globo_que_tal;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        taberna = new EscenaTaberna(this);
        setContentView(taberna);
        globo_que_tal = findViewById(R.id.globo);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onClick(View v) {
		if(globo_que_tal.getVisibility() == View.VISIBLE){
			Animation out = AnimationUtils.makeOutAnimation(this, true);
			globo_que_tal.startAnimation(out);
			globo_que_tal.setVisibility(View.INVISIBLE);
		}else{
			Animation in = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
			globo_que_tal.startAnimation(in);
			globo_que_tal.setVisibility(View.VISIBLE);
		}
		
	}

    
}
