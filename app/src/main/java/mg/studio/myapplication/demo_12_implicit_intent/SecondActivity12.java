package mg.studio.myapplication.demo_12_implicit_intent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import mg.studio.myapplication.R;

/**
 * Created by echo on 2018/4/18.
 */

public class SecondActivity12 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.implicit_intent_main_2);
        ((TextView)findViewById(R.id.display)).setText(getClass().getSimpleName());

    }
}
