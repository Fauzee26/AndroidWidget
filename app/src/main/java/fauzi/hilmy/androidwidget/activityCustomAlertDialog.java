package fauzi.hilmy.androidwidget;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activityCustomAlertDialog extends AppCompatActivity {

    Button btnShow;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_custom_alertdialog);

        btnShow = (Button)findViewById(R.id.btnShow);
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //custom alert dialog

                final Dialog dialog = new Dialog(context);
                //memanggil layout custom
                dialog.setContentView(R.layout.layout_custom);
                //mengatur title
                dialog.setTitle("Warning!");

                //memanggil button OK
                //dialog.findviewbyid ini adalah maksudnya adalah memanggil id yang ada di custom layout
                Button btnOK = (Button)dialog.findViewById(R.id.button);
                btnOK.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //ketika dipencet ok maka alert dialog nya hilang
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });
    }


}
