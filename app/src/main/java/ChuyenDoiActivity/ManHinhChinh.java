package ChuyenDoiActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.intentcontrol.R;

import java.util.Random;

public class ManHinhChinh extends AppCompatActivity {
    Button tinhTong, dsMonHoc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_chuyen_doi_activity);
        tinhTong = findViewById(R.id.nutTinhTong);

        dsMonHoc = findViewById(R.id.dsMonHoc);

        tinhTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent manHinh1 = new Intent(ManHinhChinh.this, ManHinhTinhTong.class);
                Random r1 = new Random();
                int a , b;
                a = r1.nextInt(10000);
                b = r1.nextInt(10000);
                manHinh1.putExtra("Blowjob", a);
                manHinh1.putExtra("Boobjob", b);
                startActivity(manHinh1);
            }
        });

        dsMonHoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent manHinh2 = new Intent(ManHinhChinh.this, ManHinhDanhSachMonHoc.class);


                startActivity(manHinh2);
            }
        });



    }
}