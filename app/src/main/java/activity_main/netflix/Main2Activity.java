package activity_main.netflix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {
    public void mainClick(View view) {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }
    public void main1Click(View view) {
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }
    public void main2Click(View view) {
        Intent intent = new Intent(this, Main5Activity.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}
