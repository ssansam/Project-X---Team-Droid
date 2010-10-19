package edu.my.asu;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public class TheTrivia2 extends Activity implements OnClickListener {
	private static final String TAG = "Trivia";

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		View newButton = findViewById(R.id.new_button);
		newButton.setOnClickListener(this);
		View aboutButton = findViewById(R.id.about_button);
		aboutButton.setOnClickListener(this);
		View exitButton = findViewById(R.id.exit_button);
		exitButton.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.about_button:
			Intent a = new Intent(this, About.class);
			startActivity(a);
			break;
		case R.id.exit_button:
			finish();
			break;
		case R.id.new_button:
			openNewGameDialog();
			break;
		}
	}

	private void openNewGameDialog() {
		new AlertDialog.Builder(this)
				.setTitle(R.string.new_game_title)
				.setItems(R.array.difficulty,
						new DialogInterface.OnClickListener() {
							public void onClick(
									DialogInterface dialoginterface, int i) {
								startGame(i);
							}
						}).show();
	}

	private void startGame(int i) {
		Log.d(TAG, "clicked on " + i);
		Intent n = new Intent(this, Play.class);
		startActivity(n);
	}

}