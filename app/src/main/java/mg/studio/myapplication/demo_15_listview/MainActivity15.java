package mg.studio.myapplication.demo_15_listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import mg.studio.myapplication.R;

/**
 * Created by echo on 2018/4/18.
 */

public class MainActivity15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_15);

        final String[] arrayDemo = {"20012001梁国辉Jack", "20012003吴尚泽Roland", "20012004程淼Elic", "20012005吴歌扬Remus", "20012006缪鹏飞mahon", "20012007刘峥Jerry", "20012009赵文杰Sam", "20012010桑明月bruce sand", "20012013秦帆Sail Chin", "20012014方岩simple", "20012016刘雨果Hugo", "20012017杨孝辉Paul", "20012018李宁Lee", "20012019杨译绗Yori", "20012020万芳维Arno", "20012021黄春霖Pinky", "20012022王丹zoy", "20012023王瀚哲orange", "20012025向微Jhon", "20012026邓炯尧dengjiongyao", "20012027裴凯强Joshua", "20012028刘毅frank", "20012029文愉舒Joshua", "20012030夏月Summon", "20012031WuTianyuRyan", "20012032薛景智Shawn", "20012033何宇River", "20012034彭小双Daniel", "20012035陶友玮Ronon", "20012038秦郡鸿Join", "20012039程金Alan", "20012041苏婷Rose", "20012042李昕Cyn", "20012043陈静Lottie", "20012044张健华Lancer", "20012046向鹏Alan", "20012047徐佩荃Jake", "20012048马浚豪Gattuso", "20012049周渝jerry", "20012050段张奇Monster", "20012052郭华钰Ben", "20012053邓慧迪Amber", "20012008John", "20012036ELI"};

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.listview_15_item, R.id.item_text, arrayDemo);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);

        /*
         *  Update the title on the action to show the total number of student list
         */
        setTitle("The number of students: " + arrayDemo.length);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d(getLocalClassName().toString(), arrayDemo[i]);
            }
        });

    }


}

