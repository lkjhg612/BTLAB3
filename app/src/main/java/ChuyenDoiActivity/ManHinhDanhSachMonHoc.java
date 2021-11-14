package ChuyenDoiActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.intentcontrol.R;

public class ManHinhDanhSachMonHoc extends AppCompatActivity {
    ListView lvMonHoc;
    String[] dsmon = new String[]{"Công nghê phần mềm", "Web", "DiĐộng","Giao diện", "Mạng máy tính", "Hệ điều hành"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_danh_sach_mon_hoc);

        //Xử lý thêm dữ liệu
        lvMonHoc = (ListView) findViewById(R.id.list);

        ArrayAdapter adap = new ArrayAdapter(
                ManHinhDanhSachMonHoc.this, // MÀN HÌNH HIỂN THỊ
                android.R.layout.simple_list_item_1,  // KIỂU SHOW RA MÀN HÌNH
                dsmon
        );//đưa dữ liệu

        lvMonHoc.setAdapter(adap);

        //thêm sự kiện click lên item của list item

        lvMonHoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i /* CHỈ SỐ CỦA ITEM ĐANG CLICK*/ , long l) {
                String kq = "Position: " + i + ", value = " + dsmon[i];
                Toast.makeText(ManHinhDanhSachMonHoc.this, kq, Toast.LENGTH_LONG).show();
            }
        });


    }
}