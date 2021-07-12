package com.belajar.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button submit;
    EditText first_name,last_name,email,phone;
    Spinner age;

    RadioGroup sex;

    TextView output;
    SeekBar seekBar1,seekBar2,seekBar3,seekBar4;
    Button progres_ui;
    Button sharepref;
    Button alertdiag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first_name=findViewById(R.id.first_name);
        last_name=findViewById(R.id.last_name);
        email=findViewById(R.id.email);
        phone=findViewById(R.id.phone);
        age=findViewById(R.id.age);

        output=findViewById(R.id.output);


        sex=findViewById(R.id.sex);
        seekBar1=findViewById(R.id.seekbar);
        seekBar2=findViewById(R.id.seekbar1);
        seekBar3=findViewById(R.id.seekbar2);
        seekBar4=findViewById(R.id.seekbar3);
//        progres_ui=findViewById(R.id.progress_ui);

        submit=findViewById(R.id.submit);
//        sharepref=findViewById(R.id.sharepref);
//        alertdiag=findViewById(R.id.alertdiag);

        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar1, int progress, boolean fromUser) {
                Toast.makeText(MainActivity.this, "Seekbar Value : "+progress, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar1) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar1) {

            }
        });
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar2, int progress, boolean fromUser) {
                Toast.makeText(MainActivity.this, "Seekbar Value : "+progress, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar2) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar2) {

            }
        });
        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar3, int progress, boolean fromUser) {
                Toast.makeText(MainActivity.this, "Seekbar Value : "+progress, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar3) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar3) {

            }
        });
        seekBar4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar4, int progress, boolean fromUser) {
                Toast.makeText(MainActivity.this, "Seekbar Value : "+progress, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar4) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar4) {

            }
        });


        String[] age_list={"10","11","12","13","14","15","16","17","18","19","20","21","22","23"};
        ArrayAdapter adapter=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,age_list);
        age.setAdapter(adapter);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder output=new StringBuilder();
                output.append("Nama Depan  \t\t\t: "+first_name.getText().toString()+"\n");
                output.append("Nama Belakang \t: "+last_name.getText().toString()+"\n");
                output.append("Email \t\t\t\t\t\t\t: "+email.getText().toString()+"\n");
                output.append("NIM \t\t\t\t\t\t\t\t: "+phone.getText().toString()+"\n");
                int sex_id=sex.getCheckedRadioButtonId();
                if(sex_id==R.id.male){
                    output.append("Jenis Kelamin \t\t: Male \n");
                }
                else{
                    output.append("Jenis Kelamin \t\t: Female \n");

                }
                output.append("Umur \t\t\t\t\t\t\t:"+age.getSelectedItem()+" \n");
                output.append("\n");
                output.append("Skills \n");

                output.append("\t");
                output.append("PHP \t\t\t\t: "+seekBar1.getProgress()+"% \n");
                output.append("\t");
                output.append("Java \t\t\t: "+seekBar2.getProgress()+"% \n");
                output.append("\t");
                output.append("Javascript\t: "+seekBar3.getProgress()+"% \n");
                output.append("\t");
                output.append("C++ \t\t\t\t: "+seekBar4.getProgress()+"%");





                Intent intent=new Intent(MainActivity.this,OutPutActivity.class);
                // Now let's Pass data using Bundle
                Bundle bundle=new Bundle();
                bundle.putString("output_data",output.toString());
                intent.putExtras(bundle);
                //intent.putExtra("output_data",output.toString());
                startActivity(intent);

            }
        });


    }
}