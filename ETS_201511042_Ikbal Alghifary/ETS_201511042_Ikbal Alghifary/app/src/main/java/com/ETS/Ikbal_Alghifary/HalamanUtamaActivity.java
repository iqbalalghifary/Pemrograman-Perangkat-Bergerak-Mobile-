package com.ETS.Ikbal_Alghifary;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ETS.Ikbal_Alghifary.model.DataKlub;
import com.ETS.Ikbal_Alghifary.model.Klub;

import java.util.ArrayList;
import java.util.List;

public class HalamanUtamaActivity extends AppCompatActivity implements DataKlub.KlubClickListener {
    public static final String Key_HalamanUtamaActivity="Key_HalamanUtamaActivity";

    public RecyclerView rv;
    public DataKlub dataKlub;
    public RecyclerView.LayoutManager layoutManager;
    public List<Klub> listKlub = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_utama);
        rv = findViewById(R.id.rvKlub);
        listKlub.add(new Klub("Bali United",
                "Peringkat 1                 Poin 69",
                "https://1.bp.blogspot.com/-hy4GUKCzrMQ/YF176wFCPWI/AAAAAAAACKI/Qo3ep_ztW_MRwLPy-g3z10bZqp6QCYwvgCNcBGAsYHQ/s2048/Bali%2BUnited.png",
                "Total main                                              31 \n" +
                      "Menang                                                  20 \n" +
                      "Seri                                                            6 \n" +
                      "Kalah                                                         5 \n" +
                      "Goal Masuk                                            46 \n" +
                      "Goal Kemasukan                                   20 \n" +
                      "Selisih Goal                                            26"));
        listKlub.add(new Klub("Persib Bandung",
                "Peringkat 2                 Poin 66",
                "https://upload.wikimedia.org/wikipedia/id/1/12/Logo_Persib.png",
                "Total main                                              31 \n" +
                        "Menang                                                  19 \n" +
                        "Seri                                                            7 \n" +
                        "Kalah                                                         6 \n" +
                        "Goal Masuk                                            48 \n" +
                        "Goal Kemasukan                                   23 \n" +
                        "Selisih Goal                                            27"));
        listKlub.add(new Klub("Persebaya",
                "Peringkat 3                 Poin 59",
                "https://1.bp.blogspot.com/-Yijf7q1bbFc/XkaJ9IyRaNI/AAAAAAAABmw/GpcUqu8e5T817jdO7J7uGP0Nle0CPCbQACLcBGAsYHQ/s1600/Logo%2BPersebaya%2BSurabaya%2BHD.png",
                "Total main                                              31 \n" +
                        "Menang                                                  17 \n" +
                        "Seri                                                            8 \n" +
                        "Kalah                                                         8 \n" +
                        "Goal Masuk                                            50 \n" +
                        "Goal Kemasukan                                   20 \n" +
                        "Selisih Goal                                            26"));
        listKlub.add(new Klub("Bhayangkara FC",
                "Peringkat 4                 Poin 59",
                "https://2.bp.blogspot.com/-Uz9mZ-4gt4E/WgkYrVWFBiI/AAAAAAAAEwE/bpneTFArQ_wIIAWN86wT4WocXZn_CwrPACLcBGAs/s1600/bhayangkara%2BFC.png",
                "Total main                                              31 \n" +
                        "Menang                                                  15 \n" +
                        "Seri                                                            9 \n" +
                        "Kalah                                                         9 \n" +
                        "Goal Masuk                                            52 \n" +
                        "Goal Kemasukan                                   20 \n" +
                        "Selisih Goal                                            26"));
        listKlub.add(new Klub("Arema",
                "Peringkat 5                 Poin 58",
                "https://upload.wikimedia.org/wikipedia/id/thumb/4/40/Logo_Arema_FC_2017_logo.svg/1200px-Logo_Arema_FC_2017_logo.svg.png",
                "Total main                                              31 \n" +
                        "Menang                                                  14 \n" +
                        "Seri                                                            10 \n" +
                        "Kalah                                                         9 \n" +
                        "Goal Masuk                                            55 \n" +
                        "Goal Kemasukan                                   20 \n" +
                        "Selisih Goal                                            26"));
        listKlub.add(new Klub("Borneo FC",
                "Peringkat 6                 Poin 55",
                "https://1.bp.blogspot.com/-2TZgu3sUq1g/YKzSV2ZKfGI/AAAAAAAAFEI/9Edz4VvHsSg8QVF6vV1nQs_VkqZKhY4ZACLcBGAsYHQ/s1600/Logo%2BBorneo%2BFC.png    ",
                "Total main                                              31 \n" +
                        "Menang                                                  12 \n" +
                        "Seri                                                            10 \n" +
                        "Kalah                                                         10 \n" +
                        "Goal Masuk                                            57 \n" +
                        "Goal Kemasukan                                   20 \n" +
                        "Selisih Goal                                            26"));
        listKlub.add(new Klub("PSIS Semarang",
                "Peringkat 7                 Poin 53",
                "https://1.bp.blogspot.com/--EQTOGBRlxI/YF2EleOliII/AAAAAAAACK4/1AiHqSI91y0CKvNgMV1OgjBP2d9r6SvAQCNcBGAsYHQ/s2048/PSIS%2BSemarang.png",
                "Total main                                              31 \n" +
                        "Menang                                                  12 \n" +
                        "Seri                                                            11 \n" +
                        "Kalah                                                         13 \n" +
                        "Goal Masuk                                            59 \n" +
                        "Goal Kemasukan                                   20 \n" +
                        "Selisih Goal                                            26"));

        dataKlub = new DataKlub(listKlub);
        dataKlub.setListener(this);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setAdapter(dataKlub);
        rv.setLayoutManager(layoutManager);

    }

    @Override
    public void onClick(View view, int position) {
        Klub klub = listKlub.get(position);
        Intent apkklub = new Intent(HalamanUtamaActivity.this,HalamanDetailActivity.class);
        apkklub.putExtra(Key_HalamanUtamaActivity,klub);
        startActivity(apkklub);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu, menu);
        return true;//super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.halamanutama:
                Toast.makeText(HalamanUtamaActivity.this, item.getTitle().toString(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.halamandetail:
                Toast.makeText(HalamanUtamaActivity.this, item.getTitle().toString(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.halamantentang:
                Toast.makeText(HalamanUtamaActivity.this, item.getTitle().toString(), Toast.LENGTH_SHORT).show();
                break;
        }
        return true;//super.onOptionsItemSelected(item);

    }
}
