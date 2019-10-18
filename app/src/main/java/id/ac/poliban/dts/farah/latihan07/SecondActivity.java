package id.ac.poliban.dts.farah.latihan07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if(getSupportActionBar()!= null)
            getSupportActionBar().setTitle("Second Activity");
    }
}
