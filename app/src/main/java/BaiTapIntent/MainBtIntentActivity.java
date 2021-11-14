package BaiTapIntent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.intentcontrol.R;

public class MainBtIntentActivity extends AppCompatActivity {
    Button btnGoogle, nutHenTai, nutCall;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bt_intent);

        btnGoogle = findViewById(R.id.nutGoogleSearch);

        nutHenTai = findViewById(R.id.nutTimHentai);

        nutCall = findViewById(R.id.btnCall);

        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                startActivity(mh);

            }
        });

        nutHenTai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh = new Intent(Intent.ACTION_VIEW, Uri.parse("https://hentaiz.cc"));
                startActivity(mh);
            }
        });

        nutCall.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
             /*  Intent mh = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: (+84)978974412"));
                startActivity(mh);*/

             /*   Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("content://contacts/people/"));
                startActivity(intent);*/

              /*Intent  intent = new Intent( Intent.ACTION_SENDTO, Uri.parse("sms:(+84)989333999"));

                intent.putExtra("sms_body", "Thu bay nay di choi khong?");

                startActivity(intent);*/

               /* Intent myIntent = new Intent(); myIntent.setType("image/pictures/*"); myIntent.setAction(Intent.ACTION_GET_CONTENT); startActivity(myIntent);*/

                /*Intent myActivity2 = new Intent("android.intent.action.MUSIC_PLAYER");

                startActivity(myActivity2);*/

                String url = "https://goo.gl/maps/uFyzc2qigiM2";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url)); startActivity(intent);





            }
        });
    }
}