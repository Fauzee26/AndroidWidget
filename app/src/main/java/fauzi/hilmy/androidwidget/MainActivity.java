package fauzi.hilmy.androidwidget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);

        //menambahkan aksi ketika btn1 diklik
        //alert dialog

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);
                alertDialog.setTitle("Ini adalah alert dialog");
                alertDialog.setMessage("Apakah anda akan keluar dari aplikasi ini?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //kondisi ketika kita pencet yes
                                MainActivity.this.finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                });

                AlertDialog alert = alertDialog.create();
                alert.show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //menambah intent agar bisa pindah k activity lain
                Intent a1 = new Intent(getApplicationContext(), ActivityDialogPrompt.class);
                //agar bisa pindah activity maka kita harus nambahin startActivity
                startActivity(a1);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //menambah intent agar bisa pindah k activity lain
                Intent a2 = new Intent(getApplicationContext(), activityCustomAlertDialog.class);
                //agar bisa pindah activity maka kita harus nambahin startActivity
                startActivity(a2);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //menambah intent agar bisa pindah k activity lain
                Intent a3 = new Intent(getApplicationContext(), ActivityListView.class);
                //agar bisa pindah activity maka kita harus nambahin startActivity
                startActivity(a3);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //menambah intent agar bisa pindah k activity lain
                Intent a4 = new Intent(getApplicationContext(), ActivityGridView.class);
                //agar bisa pindah activity maka kita harus nambahin startActivity
                startActivity(a4);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //menambah intent agar bisa pindah k activity lain
                Intent a5 = new Intent(getApplicationContext(), ActivitySpinner.class);
                //agar bisa pindah activity maka kita harus nambahin startActivity
                startActivity(a5);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //menambah intent agar bisa pindah k activity lain
                Intent a6 = new Intent(getApplicationContext(), ActivityDatePicker.class);
                //agar bisa pindah activity maka kita harus nambahin startActivity
                startActivity(a6);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //menambah intent agar bisa pindah k activity lain
                Intent a7 = new Intent(getApplicationContext(), ActivityTimePicker.class);
                //agar bisa pindah activity maka kita harus nambahin startActivity
                startActivity(a7);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //menambah intent agar bisa pindah k activity lain
                Intent a8 = new Intent(getApplicationContext(), ActivityAnalogDigital.class);
                //agar bisa pindah activity maka kita harus nambahin startActivity
                startActivity(a8);
            }
        });
    }
}
