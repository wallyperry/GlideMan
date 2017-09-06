package ren.perry.glideman;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import ren.perry.library.GlideMan;

public class MainActivity extends AppCompatActivity {
    public static final String URL = "https://inthecheesefactory.com/uploads/source/glidepicasso/cover.jpg";

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
    }

    public void load_default(View view) {
        new GlideMan.Builder(this)
                .load(URL)
                .into(imageView);
    }

    public void load_circle(View view) {
        new GlideMan.Builder(this)
                .load(URL)
                .circle()
                .dotAnimation()
                .loadingRes(R.drawable.image_loading)
                .loadFailRes(R.drawable.image_load_fail)
                .into(imageView);
    }

    public void load_round(View view) {
        new GlideMan.Builder(this)
                .load(URL)
                .round(10)
                .dotAnimation()
                .loadingRes(R.drawable.image_loading)
                .loadFailRes(R.drawable.image_load_fail)
                .into(imageView);
    }
}
