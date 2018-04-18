package mg.studio.myapplication.demo_04_button_intent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import mg.studio.myapplication.R;

/**
 * Created by echo on 2018/4/18.
 */

public class MainActivity04 extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_intent_main);
    }

    public void btn(View view) {

        Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://cqu.edu.cn"));
        startActivity(mIntent);
    }
}
