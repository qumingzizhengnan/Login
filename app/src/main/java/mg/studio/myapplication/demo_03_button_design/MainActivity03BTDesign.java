package mg.studio.myapplication.demo_03_button_design;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import mg.studio.myapplication.R;

/**
 * Created by echo on 2018/4/18.
 */

public class MainActivity03BTDesign extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_design_main);

        //Button Five
        findViewById(R.id.btn_five).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), ((Button)findViewById(R.id.btn_five)).getText(),Toast.LENGTH_LONG).show();
            }
        });

        //Button Six
        onClick((Button) findViewById(R.id.btn_six));

    }

    //Button Four
    public void bntXml(View view) {
        Toast.makeText(this, ((Button)findViewById(R.id.btn_four)).getText(),Toast.LENGTH_LONG).show();
    }


    //Handling the clicks, given a Button
    private void onClick(final Button mBtn){
        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), mBtn.getText(),Toast.LENGTH_LONG).show();
            }
        });
    }
}

