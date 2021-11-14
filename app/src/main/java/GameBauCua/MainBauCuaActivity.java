package GameBauCua;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.intentcontrol.R;

import java.util.Random;

public class MainBauCuaActivity extends AppCompatActivity {

    Button nutBam, nutThoat, Test;
    ImageView anh1, anh2, anh3, anh4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bau_cua);

        nutBam = findViewById(R.id.btn);
        nutThoat = findViewById(R.id.btnThoat);
        anh1 = findViewById(R.id.anh1);
        anh2 = findViewById(R.id.anh2);
        anh3 = findViewById(R.id.anh3);
        anh4 = findViewById(R.id.anh4);

        nutBam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random num = new Random();
                int so1 = num.nextInt(6);
                int so2 = num.nextInt(6);
                int so3 = num.nextInt(6);
                int so4 = num.nextInt(6);



                String o1 = uploadImage(so1, anh1);
                String o2 = uploadImage(so2, anh2);
                String o3 = uploadImage(so3, anh3);//hiện 3 hình
                String o4 = uploadImage(so4, anh4);// Hiện 4 hình

                Toast.makeText(MainBauCuaActivity.this, "KẾT QUẢ LẦN RANDOM: " + o1 + ","  + o2 + "," + o3+ "," + o4 , Toast.LENGTH_LONG).show();
            }
        });

        nutThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainBauCuaActivity.this);
                dlg.setTitle("Thông báo");
                dlg.setMessage("Bạn có chắc muốn thoát");

                //Nút đồng ý
                dlg.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });

                //nút hủy
                dlg.setNegativeButton("Hủy", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                dlg.create().show();
            }

        });
    }

    public  String uploadImage(int rd, ImageView v) {
        String kq = "";
        if (rd == 0) {
            v.setImageResource(R.drawable.bau);
            kq = "BẦU";
        } else if (rd == 1) {
            v.setImageResource(R.drawable.cua);
            kq = "CUA";
        } else if (rd == 2) {
            v.setImageResource(R.drawable.ca);
            kq = "CÁ";
        } else if (rd == 3) {
            v.setImageResource(R.drawable.ga);
            kq = "GÀ";
        } else if (rd == 4) {
            v.setImageResource(R.drawable.nai);
            kq = "NAI";
        } else {
            v.setImageResource(R.drawable.tom);
            kq = "TÔM";
        }
        return kq;
    }
}