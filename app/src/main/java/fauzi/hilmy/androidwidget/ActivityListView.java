package fauzi.hilmy.androidwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ActivityListView extends AppCompatActivity {

    ListView lsData;
    String[] dataArray = new String[]{
            "Android", "iPhone", "iPad", "WindowsMobile", "Blackberry", "WebOS", "Ubuntu", "Windows 7", "Mac OS X", "Linux"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        //memasukkan data array ke dalam array adapter agar muncul di lostView
        lsData = (ListView)findViewById(R.id.listData);
        ArrayAdapter<String> adapterListData = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataArray);
        //mengatur adapterListData ke dalam widget lsData
        lsData.setAdapter(adapterListData);
    }
}
