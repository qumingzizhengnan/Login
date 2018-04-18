package mg.studio.myapplication.demo_12_implicit_intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import mg.studio.myapplication.R;

/**
 * Created by echo on 2018/4/18.
 */

public class MainActivity12  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.implicit_intent_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**
                 * If no activity is found by the OS to handle the intent, and exception will araise:
                 * No Activity found to handle Intent { act=mg.studio.intentreceiver.ACTION }
                 */
                Intent mIntent  = new Intent("mg.studio.intentreceiver.ACTION");
                startActivity(mIntent);
            }
        });

    }
}

