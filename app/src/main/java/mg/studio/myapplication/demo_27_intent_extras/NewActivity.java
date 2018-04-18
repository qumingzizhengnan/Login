package mg.studio.myapplication.demo_27_intent_extras;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import mg.studio.myapplication.R;

/**
 * Created by echo on 2018/4/18.
 */

public class NewActivity extends AppCompatActivity {
    private String value;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            value = bundle.getString("keyword");
        }

        ((TextView) findViewById(R.id.display)).setText(value);
    }
}
