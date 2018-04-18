package mg.studio.myapplication.demo_27_intent_extras;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import mg.studio.myapplication.R;

/**
 * Created by echo on 2018/4/18.
 */

public class MainActivity27 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent_extra);

        Button bt27 = findViewById(R.id.bt27);
        bt27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = "Hello World! - This message was from the first activity.";
                Intent intent = new Intent(getApplicationContext(), NewActivity.class);
                intent.putExtra("keyword", value);
                startActivity(intent);
            }
        });


    }


}

