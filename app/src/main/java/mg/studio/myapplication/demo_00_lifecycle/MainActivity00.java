package mg.studio.myapplication.demo_00_lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import mg.studio.myapplication.R;

/**
 * Created by echo on 2018/4/18.
 */

public class MainActivity00 extends AppCompatActivity {

    private final String TAG = getClass().getSimpleName();
    private String previousContent;
    private String currentState = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lifecycle_main);

        Log.d(TAG, "onCreate:" + TAG);
        currentState = "onCreate";
        setText();


        findViewById(R.id.btn_start_activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(getBaseContext(), Activity.class);
                startActivity(mIntent);

            }
        });

        findViewById(R.id.btn_start_dialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), Dialog.class));
            }
        });


    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: " + TAG);
        currentState = "onResume";
        setText();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: " + TAG);
        currentState = "onRestart";
        setText();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: " + TAG);
        currentState = "onPause";
        setText();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: " + TAG);
        currentState = "onStop";
        setText();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: " + TAG);
        currentState = "onDestroy";
        setText();
    }

    private void setText() {
        previousContent = ((TextView) findViewById(R.id.display)).getText().toString();

        ((TextView) findViewById(R.id.display)).setText(previousContent + "\n" + currentState);
    }

}

