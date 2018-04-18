package mg.studio.myapplication.demo_05_button_startactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import mg.studio.myapplication.R;

/**
 * Created by echo on 2018/4/18.
 */

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Connect this java file with the xml layout
        setContentView(R.layout.startactivity_second);

        // Connect the Button and set the onClick listener
        (findViewById(R.id.btn)).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), SecondActivity.class);
                startActivity(intent);
            }
        });
    }

}
