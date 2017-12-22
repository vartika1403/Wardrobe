package entertainment.wardrobe;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

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

    private CustomPagerAdapter customTopPagerAdapter;
    private CustomPagerAdapter customBottomPagerAdapter;
    int[] top_resources = {
            R.drawable.t_shirt,
            R.drawable.t_shirt,
            R.drawable.t_shirt,
            R.drawable.t_shirt,
            R.drawable.t_shirt,
            R.drawable.t_shirt
    };
    int[] bottom_resources = {
            R.drawable.t_jeans,
            R.drawable.t_jeans,
            R.drawable.t_jeans,
            R.drawable.t_jeans,
            R.drawable.t_jeans,
            R.drawable.t_jeans
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        customTopPagerAdapter = new CustomPagerAdapter(this, top_resources);
        customBottomPagerAdapter = new CustomPagerAdapter(this, bottom_resources);
        topPager.setAdapter(customTopPagerAdapter);
        bottomPager.setAdapter(customBottomPagerAdapter);
    }

    @OnClick(R.id.plus_top_image)
    public void selectTopsImage() {

    }
}
