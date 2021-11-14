package ChuyenDoiActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.intentcontrol.R;

public class ManHinhTinhTong extends AppCompatActivity {

    Button nutTong, nutThoat;

    EditText nhapA, nhapB, oKetqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_tinh_tong);

        nutTong = findViewById(R.id.tinhTong);
        nhapA = findViewById(R.id.nhapSoA);
        nhapB = findViewById(R.id.nhapSoB);
        oKetqua = findViewById(R.id.oHienKetQua);

        Bundle bd = getIntent().getExtras();
        if (bd != null){
            int A = bd.getInt("Blowjob");
            int B = bd.getInt("Boobjob");

            nhapA.setText(String.valueOf(A));
            nhapB.setText(String.valueOf(B));
        }

        nutTong.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Double a = Double.parseDouble(nhapA.getText().toString());
                Double b = Double.parseDouble(nhapB.getText().toString());
                Double Tong = tinhTong(a, b);
                oKetqua.setText(String.valueOf(Tong));
            }
        });


    }


    public Double tinhTong(Double a, Double b){
        return a + b;
    }
}