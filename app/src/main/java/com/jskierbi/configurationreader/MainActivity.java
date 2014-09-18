package com.jskierbi.configurationreader;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by jakub on 09/18/2014.
 */
public class MainActivity extends Activity {

	@InjectView(R.id.label_language) TextView mLabelLang;

	@Override protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		ButterKnife.inject(this);

		updateUi();
	}

	private void updateUi() {
		mLabelLang.setText(getString(R.string.label_lang, getResources().getConfiguration().locale.getLanguage()));
	}
}
