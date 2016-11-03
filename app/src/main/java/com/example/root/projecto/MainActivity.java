package com.example.root.projecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewInfo;
    GifView gifView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gifView = (GifView) findViewById(R.id.gef_view);
        textViewInfo = (TextView) findViewById(R.id.textinfo);

        String stringInfo = "";
        stringInfo += "Duracion: " + gifView.getMovieDuration() + "\n";
        stringInfo += "W x H: "  + gifView.getMovieWidht() + " x " + gifView.getMovieHeight() + "\n";

        textViewInfo.setText(stringInfo);
    }

}
