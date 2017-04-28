package vn.edu.topica.karaoke;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import vn.edu.topica.model.Music;
import vn.edu.topica.adapter.MusicAdapter;

public class MainActivity extends AppCompatActivity {


    ListView lvBaiHatGoc;
    ArrayList<Music>dsBaiHatGoc;
    MusicAdapter  adapterBaiHatGoc;

    ListView lvSongFavorite;
    ArrayList<Music> dsSongFavorite;
    MusicAdapter adapterSongFavorite;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
    }

    private void addControls() {
        lvBaiHatGoc = (ListView) findViewById(R.id.lvBaiHatGoc);
        dsBaiHatGoc = new ArrayList<>();
        adapterBaiHatGoc = new MusicAdapter(MainActivity.this,R.layout.item,dsBaiHatGoc);
        lvBaiHatGoc.setAdapter(adapterBaiHatGoc);

        lvSongFavorite = (ListView) findViewById(R.id.lvSongFavorite);
        adapterSongFavorite = new MusicAdapter(MainActivity.this,R.layout.item, dsSongFavorite);
        lvSongFavorite.setAdapter(adapterSongFavorite);

        giaLapBaiHat();

    }

    private void giaLapBaiHat() {
        dsBaiHatGoc.add(new Music("bh1","Con đường xưa em đi","Hương Lan",true));
        dsBaiHatGoc.add(new Music("bh2","Cánh thiệp đầu xuân","Hương Lan",true));
        dsBaiHatGoc.add(new Music("bh3","Thư tình","Hương Lan",true));
        dsBaiHatGoc.add(new Music("bh4","Thư tay","Hương Lan",true));
        adapterBaiHatGoc.notifyDataSetChanged();



    }

}
