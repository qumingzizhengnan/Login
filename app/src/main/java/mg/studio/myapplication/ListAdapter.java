package mg.studio.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


/**
 * Created by echo on 2018/4/15.
 */

public class ListAdapter extends BaseAdapter {

    private String[] mListData;
    private Context mContext;

    public ListAdapter(String[] mData, Context context){
        this.mContext = context;
        this.mListData = mData;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView tv;
        if (view == null){
            view = LayoutInflater.from(mContext).inflate(R.layout.listview_item,viewGroup,false);
        }
        tv = (TextView)view.findViewById(R.id.tv_demo);
        tv.setText(mListData[i]);
        return view;
    }

    @Override
    public int getCount() {
        return 31;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


}
