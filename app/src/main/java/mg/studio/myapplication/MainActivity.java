package mg.studio.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import mg.studio.myapplication.demo_00_lifecycle.MainActivity00;
import mg.studio.myapplication.demo_01_username.MainActicity01;
import mg.studio.myapplication.demo_01_username_final.MainActivity01final;
import mg.studio.myapplication.demo_02_layout.MainActivity02;
import mg.studio.myapplication.demo_02_layout_final.MainActivity02final;
import mg.studio.myapplication.demo_03_button_design.MainActivity03BTDesign;
import mg.studio.myapplication.demo_03_button_toast.MainActivity03BTToast;
import mg.studio.myapplication.demo_04_button_intent.MainActivity04;
import mg.studio.myapplication.demo_05_button_startactivity.MainActivity05;
import mg.studio.myapplication.demo_05_button_startactivity_extra.MainActivity05Extra;
import mg.studio.myapplication.demo_06_imagebutton.MainActivity06;
import mg.studio.myapplication.demo_07_edittext.MainActivity07;
import mg.studio.myapplication.demo_08_radiobt_listener.MainActivity08Listener;
import mg.studio.myapplication.demo_08_radiobt_onclick.MainActivity08OnClick;
import mg.studio.myapplication.demo_09_listview.MainActivity09;
import mg.studio.myapplication.demo_10_getcolor.MainActivity10;
import mg.studio.myapplication.demo_11_gradient_background.MainActivity11;
import mg.studio.myapplication.demo_12_implicit_intent.MainActivity12;
import mg.studio.myapplication.demo_13_weather.MainActivity13;
import mg.studio.myapplication.demo_15_listview.MainActivity15;
import mg.studio.myapplication.demo_16_listview_customer_adapter.MainActivity16;
import mg.studio.myapplication.demo_17_audio_recorder.MainActivity17;
import mg.studio.myapplication.demo_19_database.MainActivity19;
import mg.studio.myapplication.demo_20_fragment.MainActivity20;
import mg.studio.myapplication.demo_21_webview.MainActivity21;
import mg.studio.myapplication.demo_22_servicedemo.MainActivity22;
import mg.studio.myapplication.demo_23_service.MainActivity23;
import mg.studio.myapplication.demo_24_fingerprint.MainActivity24;
import mg.studio.myapplication.demo_25_app_private_directory.MainActivity25;
import mg.studio.myapplication.demo_26_assets.MainActivity26;
import mg.studio.myapplication.demo_27_intent_extras.MainActivity27;

public class MainActivity extends AppCompatActivity {
    private TextView tvName;
    private ListView mListView;
    private SessionManager session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName = findViewById(R.id.user_name);


        /**
         * Only logged in users should access this activity
         */
        session = new SessionManager(getApplicationContext());
        if (!session.isLoggedIn()) {
            logout();
        }

        /**
         * If the user just registered an account from Register.class,
         * the parcelable should be retrieved
         */
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            // Retrieve the parcelable
            Feedback feedback = bundle.getParcelable("feedback");
            // Get the from the object
            String userName = feedback.getName();
            tvName.setText(userName);
        }

        loadData();
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent;
                switch (i){
                    //lifecycle
                    case 0:
                        intent = new Intent(MainActivity.this, MainActivity00.class);
                        startActivity(intent);
                        break;
                    //username
                    case 1:
                        intent = new Intent(MainActivity.this, MainActicity01.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(MainActivity.this, MainActivity01final.class);
                        startActivity(intent);
                        break;
                    //layout
                    case 3:
                        intent = new Intent(MainActivity.this, MainActivity02.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(MainActivity.this, MainActivity02final.class);
                        startActivity(intent);
                        break;
                    //button design
                    case 5:
                        intent = new Intent(MainActivity.this, MainActivity03BTDesign.class);
                        startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(MainActivity.this, MainActivity03BTToast.class);
                        startActivity(intent);
                        break;
                    //button intent
                    case 7:
                        intent = new Intent(MainActivity.this, MainActivity04.class);
                        startActivity(intent);
                        break;
                    //button start activity
                    case 8:
                        intent = new Intent(MainActivity.this, MainActivity05.class);
                        startActivity(intent);
                        break;
                    case 9:
                        intent = new Intent(MainActivity.this, MainActivity05Extra.class);
                        startActivity(intent);
                        break;
                    //image button
                    case 10:
                        intent = new Intent(MainActivity.this, MainActivity06.class);
                        startActivity(intent);
                        break;
                    //edit text
                    case 11:
                        intent = new Intent(MainActivity.this, MainActivity07.class);
                        startActivity(intent);
                        break;
                    //radio button
                    case 12:
                        intent = new Intent(MainActivity.this, MainActivity08Listener.class);
                        startActivity(intent);
                        break;
                    case 13:
                        intent = new Intent(MainActivity.this, MainActivity08OnClick.class);
                        startActivity(intent);
                        break;
                    //list view
                    case 14:
                        intent = new Intent(MainActivity.this, MainActivity09.class);
                        startActivity(intent);
                        break;
                    //get color
                    case 15:
                        intent = new Intent(MainActivity.this, MainActivity10.class);
                        startActivity(intent);
                        break;
                    //gradient background
                    case 16:
                        intent = new Intent(MainActivity.this, MainActivity11.class);
                        startActivity(intent);
                        break;
                    //implicit intent
                    case 17:
                        intent = new Intent(MainActivity.this, MainActivity12.class);
                        startActivity(intent);
                        break;
                    //weather app design
                    case 18:
                        intent = new Intent(MainActivity.this, MainActivity13.class);
                        startActivity(intent);
                        break;
                    //list view
                    case 19:
                        intent = new Intent(MainActivity.this, MainActivity15.class);
                        startActivity(intent);
                        break;
                    case 20:
                        intent = new Intent(MainActivity.this, MainActivity16.class);
                        startActivity(intent);
                        break;
                    //audio recorder
                    case 21:
                        intent = new Intent(MainActivity.this, MainActivity17.class);
                        startActivity(intent);
                        break;
                    //database
                    case 22:
                        intent = new Intent(MainActivity.this, MainActivity19.class);
                        startActivity(intent);
                        break;
                    //fragment
                    case 23:
                        intent = new Intent(MainActivity.this, MainActivity20.class);
                        startActivity(intent);
                        break;
                    //web view
                    case 24:
                        intent = new Intent(MainActivity.this, MainActivity21.class);
                        startActivity(intent);
                        break;
                    //service demo
                    case 25:
                        intent = new Intent(MainActivity.this, MainActivity22.class);
                        startActivity(intent);
                        break;
                    //service
                    case 26:
                        intent = new Intent(MainActivity.this, MainActivity23.class);
                        startActivity(intent);
                        break;
                    //fingerprint
                    case 27:
                        intent = new Intent(MainActivity.this, MainActivity24.class);
                        startActivity(intent);
                        break;
                    //app private director
                    case 28:
                        intent = new Intent(MainActivity.this, MainActivity25.class);
                        startActivity(intent);
                        break;
                    //assets folder
                    case 29:
                        intent = new Intent(MainActivity.this, MainActivity26.class);
                        startActivity(intent);
                        break;
                    //intent extras
                    case 30:
                        intent = new Intent(MainActivity.this, MainActivity27.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }

    private void loadData(){
        mListView = (ListView) findViewById(R.id.listView);
        ListAdapter listAdapter = new ListAdapter(ListData.listData,getBaseContext());
        mListView.setAdapter(listAdapter);
    }

    /**
     * Logging out the user:
     * - Will set isLoggedIn flag to false in SharedPreferences
     * - Clears the user data from SqLite users table
     */

    public void btnLogout(View view) {
        logout();
    }

    public void logout() {
        // Updating the session
        session.setLogin(false);
        // Redirect the user to the login activity
        startActivity(new Intent(this, Login.class));
        finish();
    }
}