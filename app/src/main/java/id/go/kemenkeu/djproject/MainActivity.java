package id.go.kemenkeu.djproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView playerImg,playerImg2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerImg = findViewById(R.id.player1);
        playerImg2 = findViewById(R.id.player2);

        playerImg.setOnClickListener(new MyClick());
        playerImg2.setOnClickListener(new MyClick());
    }
    class MyClick implements View.OnClickListener {

        @Override
            public void onClick(View v) {
            Intent Int = new Intent(getApplicationContext(),ready.class);
                startActivity(Int);
                }
    };

}




