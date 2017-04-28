package vn.edu.topica.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

import vn.edu.topica.karaoke.R;
import vn.edu.topica.model.Music;

/**
 * Created by KIM_MANH_HUNG on 28-Apr-17.
 */
public class MusicAdapter extends ArrayAdapter<Music>
{
    Activity context;
    int resource;
    List<Music> objects;
    public MusicAdapter(Activity context, int resource, List<Music> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects= objects;
}

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        View row = inflater.inflate(this.resource,null);
        TextView txtMa = (TextView) row.findViewById(R.id.txtMa);
        TextView txtTen = (TextView) row.findViewById(R.id.txtTen);
        TextView txtCasi = (TextView) row.findViewById(R.id.txtCaSi);
        ImageButton btnLike = (ImageButton) row.findViewById(R.id.btnLike);
        ImageButton btnDisLike = (ImageButton) row.findViewById(R.id.btnDisLike);
        Music music = this.objects.get(position);
        txtMa.setText(music.getMa());
        txtTen.setText(music.getTen());
        txtCasi.setText(music.getCasi());

        return row;
    }
}

