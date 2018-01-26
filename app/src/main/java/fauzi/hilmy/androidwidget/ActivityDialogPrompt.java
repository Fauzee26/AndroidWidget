package fauzi.hilmy.androidwidget;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityDialogPrompt extends AppCompatActivity {

    //memanggil aktiviti ini
    Context context = this;
    TextView lblResult;
    Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_prompt);

        lblResult = (TextView)findViewById(R.id.txtResult);
        btnShow = (Button)findViewById(R.id.btnShowPromptDialog);

        //aksi ketika button show nya dipencet
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //memanggil layout prompts
                LayoutInflater layInf = LayoutInflater.from(context);
                View promptsView = layInf.inflate(R.layout.prompts, null);

                AlertDialog.Builder alertBuilder = new AlertDialog.Builder(context);
                //memanggil viewnya promptView
                alertBuilder.setView(promptsView);

                final EditText userInput = (EditText)promptsView.findViewById(R.id.etInputUsername);
                alertBuilder.setCancelable(false)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                //mengambil nilai dari etInputUsername dan menampilkan ke txtResult
                                lblResult.setText(userInput.getText());
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertBuilder.create();
                //menampilkan alert dialog
                alertDialog.show();
            }
        });
    }
}
