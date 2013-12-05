package edu.gatech.techbook;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.support.v4.app.NavUtils;

public class CourseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_course);
		// Show the Up button in the action bar.
		setupActionBar();
		setTitle((String)getIntent().getExtras().get("course"));
		Button addCourse = (Button) findViewById(R.id.addCourseBtn);
		Button goToForum = (Button) findViewById(R.id.goToForum);
		addCourse.setOnClickListener(new AddCourseBtnClickListener());
		goToForum.setOnClickListener(new GoToForumBtnClickListener());
		
	}

	/**
	 * Set up the {@link android.app.ActionBar}.
	 */
	private void setupActionBar() {

		getActionBar().setDisplayHomeAsUpEnabled(true);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.course, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	private class AddCourseBtnClickListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			
			
		}
	}
	
	private class GoToForumBtnClickListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO -- start the forum activity with the course name as intent
			
		}
		
	}

}
