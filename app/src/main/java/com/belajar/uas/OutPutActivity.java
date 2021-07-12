package com.belajar.uas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class OutPutActivity extends AppCompatActivity  {
    TextView pass_data_receive;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_out_put);
        TextView output=findViewById(R.id.output);
        pass_data_receive=findViewById(R.id.pass_data_receive);
        Bundle bundle=getIntent().getExtras();
        String data_output=bundle.getString("output_data");
        //String data_output=getIntent().getStringExtra("output_data");
        output.setText(data_output);

//        DemoFragment demoFragment=new DemoFragment(OutPutActivity.this);
//        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
//        Bundle bundle1=new Bundle();
//        bundle1.putString("output_data_fragment",data_output);
//        demoFragment.setArguments(bundle1);
//        fragmentTransaction.add(R.id.container_fragment,demoFragment);
//        fragmentTransaction.commit();

        //now let's pass data to fragment

    }


}
