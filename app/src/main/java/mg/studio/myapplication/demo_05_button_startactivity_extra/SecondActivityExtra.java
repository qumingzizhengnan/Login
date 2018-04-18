package mg.studio.myapplication.demo_05_button_startactivity_extra;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import mg.studio.myapplication.R;

/**
 * Created by echo on 2018/4/18.
 */

public class SecondActivityExtra extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startactivity_second_extra);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String retrievedInformation = extras.getString("shared_data");
            TextView display = findViewById(R.id.txtLayout);
            display.setText(retrievedInformation);
        }

    }

}
