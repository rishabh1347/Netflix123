package activity_main.netflix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {
    public void mainClick(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
    public void main3Click(View view) {
        Intent intent = new Intent(this, Main6Activity.class);
        startActivity(intent);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
}
