package id.go.kemenkeu.djproject;

    import androidx.appcompat.app.AppCompatActivity;
    import android.content.Intent;
    import android.os.Handler;
    import android.os.Bundle;

    public class SplashScreen extends AppCompatActivity {
        private int waktu_loading=3000;

        //4000=4 detik

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);


            setContentView(R.layout.activity_splash_screen);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    //setelah loading maka akan langsung berpindah ke home activity
                    Intent home=new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(home);
                    finish();

                }
            },waktu_loading);
        }
    }

