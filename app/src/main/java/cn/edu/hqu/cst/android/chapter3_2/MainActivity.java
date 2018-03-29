package cn.edu.hqu.cst.android.chapter3_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_starnard;
    Button btn_singleTop;
    Button btn_singleTask;
    Button btn_singleInstance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_starnard=findViewById(R.id.btn_standard);
        btn_singleTop=findViewById(R.id.btn_singleTop);
        btn_singleTask=findViewById(R.id.btn_singleTask);
        btn_singleInstance=findViewById(R.id.btn_singleInstance);
        btn_starnard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,StandardLaunchModeActivity.class);
                startActivity(intent);
            }
        });
        btn_singleTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,SingleTopLaunchModeActivity.class);
                startActivity(intent);
            }
        });
        btn_singleTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,SingleTaskLaunchModeActivity.class);
                startActivity(intent);
            }
        });
        btn_singleInstance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,SingleInstanceLaunchModeActivity.class);
                startActivity(intent);
            }
        });
    }
}
