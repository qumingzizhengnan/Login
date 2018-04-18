package mg.studio.myapplication.demo_05_button_startactivity_extra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import mg.studio.myapplication.R;

/**
 * Created by echo on 2018/4/18.
 */

public class MainActivity05Extra extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startactivity_main_extra);


        final EditText userInput =findViewById(R.id.et_input);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String information = userInput.getText().toString();
                //Todo: handle the case where information is empty
                Intent intent = new Intent(getApplicationContext(),
                        SecondActivityExtra.class);
                intent.putExtra("shared_data", information);
                startActivity(intent);
            }
        });
    }

}
