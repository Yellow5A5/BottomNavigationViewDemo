package yellow5a5.bottomnavigationviewdemo;

import android.support.v4.view.ViewPager;

/**
 * Created by Yellow5A5 on 16/10/21.
 */

public abstract class OnPageChangeAdapter implements ViewPager.OnPageChangeListener {

    private int mFirstPosition = 0;

    public OnPageChangeAdapter(int firstPosition){
        mFirstPosition = firstPosition;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        onPageSelected(mFirstPosition, position);
        mFirstPosition = position;
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    public abstract void onPageSelected(int lastposition, int position);
}
