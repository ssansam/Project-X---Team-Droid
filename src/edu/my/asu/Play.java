package edu.my.asu;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Play extends TheTrivia2 implements OnClickListener {
	private RadioGroup group1;
	private RadioButton rb1;
	private RadioButton rb2;
	private RadioButton rb3;
	private RadioButton rb4;
	private Button b1;
	private TextView t1;
	private TextView t2;
	private final Random generator = new Random();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.play);
		group1 = (RadioGroup) findViewById(R.id.group1);
		rb1 = (RadioButton) findViewById(R.id.a);
		rb2 = (RadioButton) findViewById(R.id.b);
		rb3 = (RadioButton) findViewById(R.id.c);
		rb4 = (RadioButton) findViewById(R.id.d);
		b1 = (Button) findViewById(R.id.Next);
		b1.setOnClickListener(this);
		t1 = (TextView) findViewById(R.id.TextView01);
		t2 = (TextView) findViewById(R.id.Title);
		String[] multAnswers = new String[4];
		multAnswers[0] = "String 1";
		multAnswers[1] = "String 2";
		multAnswers[2] = "String 3";
		multAnswers[3] = "String 4";
		int randomIndex = generator.nextInt(4);
		t2.setText(multAnswers[randomIndex]);
	}

	@Override
	public void onClick(View v) {
		if (v == b1) {
			if (rb1.isChecked() == true)
				t1.setText("You Selected : " + rb1.getText());
			if (rb2.isChecked() == true)
				t1.setText("You Selected : " + rb2.getText());
			if (rb3.isChecked() == true)
				t1.setText("You Selected : " + rb3.getText());
			if (rb4.isChecked() == true)
				t1.setText("You Selected : " + rb4.getText());
		}
	}
	public boolean onCreateOptionsMenu(Menu menu) {
	      super.onCreateOptionsMenu(menu);
	      MenuInflater inflater = getMenuInflater();
	      inflater.inflate(R.layout.menu, menu);
	      return true;
	   }
	   public boolean onOptionsItemSelected(MenuItem item) {
		      switch (item.getItemId()) {
		      case R.id.settings:
		         finish();
		         }
		      return false;
		   }


}