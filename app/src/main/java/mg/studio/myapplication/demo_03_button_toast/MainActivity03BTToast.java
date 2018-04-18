package mg.studio.myapplication.demo_03_button_toast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import mg.studio.myapplication.R;

/**
 * Created by echo on 2018/4/18.
 */

public class MainActivity03BTToast  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_toast_main);
    }

    public void mBtn(View view) {
        Toast.makeText(this, " You clicked the button", Toast.LENGTH_LONG).show();
    }
}
