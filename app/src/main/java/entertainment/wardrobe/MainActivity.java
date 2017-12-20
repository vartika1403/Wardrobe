package entertainment.wardrobe;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @BindView(R.id.plus_top_image)
    ImageView plusTopImage;
    @BindView(R.id.plus_bottom_image)
    ImageView plusBottomImage;
    @BindView(R.id.heart_image)
    ImageView heartImage;
    @BindView(R.id.shuffle_image)
    ImageView shuffleImage;
    @BindView(R.id.top_pager)
    ViewPager topPager;
    @BindView(R.id.bottom_pager)
    ViewPager bottomPager;

    private CustomPagerAdapter customPagerAdapter;
    int[] resources = {
            R.drawable.addition_sign,
            R.drawable.addition_sign,
            R.drawable.addition_sign,
            R.drawable.addition_sign,
            R.drawable.addition_sign,
            R.drawable.addition_sign
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        customPagerAdapter = new CustomPagerAdapter(this, resources);
        topPager.setAdapter(customPagerAdapter);
        bottomPager.setAdapter(customPagerAdapter);
    }
}
