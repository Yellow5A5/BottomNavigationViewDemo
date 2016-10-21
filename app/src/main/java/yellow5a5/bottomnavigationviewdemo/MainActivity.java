package yellow5a5.bottomnavigationviewdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import java.util.ArrayList;

import yellow5a5.bottomnavigationviewdemo.Pager.FirstFragment;
import yellow5a5.bottomnavigationviewdemo.Pager.SecondFragment;
import yellow5a5.bottomnavigationviewdemo.Pager.ThirdFragment;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView mNavigationMenuView;
    private ViewPager mViewPage;

    private ArrayList<Fragment> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mViewPage = (ViewPager) findViewById(R.id.view_page);
        this.mNavigationMenuView = (BottomNavigationView) findViewById(R.id.demo_navigation);

        data.add(new FirstFragment());
        data.add(new SecondFragment());
        data.add(new ThirdFragment());

        mViewPage.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return data.get(position);
            }

            @Override
            public int getCount() {
                return data.size();
            }
        });

        mViewPage.addOnPageChangeListener(new OnPageChangeAdapter(0) {

            @Override
            public void onPageSelected(int lastposition, int position) {
                mNavigationMenuView.getMenu().getItem(position).setChecked(true);
                mNavigationMenuView.getMenu().getItem(lastposition).setChecked(false);
            }
        });

        mNavigationMenuView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_recent:
                        mViewPage.setCurrentItem(0);
                        break;
                    case R.id.action_favorite:
                        mViewPage.setCurrentItem(1);
                        break;
                    case R.id.action_nearby:
                        mViewPage.setCurrentItem(2);
                        break;
                }
                return true;
            }
        });
    }
}
