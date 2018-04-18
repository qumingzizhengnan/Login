package mg.studio.myapplication.demo_07_edittext;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import mg.studio.myapplication.R;

/**
 * Created by echo on 2018/4/18.
 */

public class MainActivity07  extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edittext_main);

        // Connect the buttons and the edit text with this java file
        Button btnClear = (Button) findViewById(R.id.btnClear);
        Button btnToast = (Button) findViewById(R.id.btnGet);
        final EditText myEdittext = (EditText) findViewById(R.id.eTdemo);

        // Set the on click listeners

        btnClear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Clear the content of the EditText
                myEdittext.setText(null);

            }
        });

        btnToast.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Retrieve the string from the edit text
                String userInput = myEdittext.getText().toString();

                // display the string as a toast
                Toast.makeText(getBaseContext(), userInput, Toast.LENGTH_LONG).show();

            }
        });
    }
}
