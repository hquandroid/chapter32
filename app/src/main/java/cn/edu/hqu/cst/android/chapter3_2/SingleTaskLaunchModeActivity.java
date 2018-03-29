package cn.edu.hqu.cst.android.chapter3_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SingleTaskLaunchModeActivity extends AppCompatActivity {
    private TextView txt;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task_launch_mode);
        txt=(TextView)findViewById(R.id.TxtDesc);
        btn=findViewById(R.id.btnCreateActivity);
        txt.setText("当前Activity为:"+this.toString()+"所在TaskID为："+this.getTaskId());
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SingleTaskLaunchModeActivity.this,SingleTaskLaunchModeActivity.class);
                startActivity(intent);
            }
        });
    }
}
