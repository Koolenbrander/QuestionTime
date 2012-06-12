package com.ehb.questiontime;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingsStudentEdit extends Activity {

	Button okButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings_student_edit);

		okButton = (Button) findViewById(R.id.buttonDone);

	}
	
	/** return to SettingsTab view **/

	public void doneEditStudentList(View v) {
		
		Intent intent = new Intent(getParent(), SettingsTab.class);
		TabGroupActivity parentactivity = (TabGroupActivity) getParent();
		parentactivity.startChildActivity("SettingsTab", intent);

	}

}
