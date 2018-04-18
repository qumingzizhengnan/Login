package mg.studio.myapplication.demo_00_lifecycle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import mg.studio.myapplication.R;

/**
 * Created by echo on 2018/4/18.
 */

public class Dialog extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lifecycle_dialog);
    }
}
