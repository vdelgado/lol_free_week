package com.example.developer.freeweek.adapter;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.developer.freeweek.R;
import com.example.developer.freeweek.entity.Champion;
import com.squareup.picasso.Picasso;

import java.util.List;

public class FreeWeekPagerAdapter extends PagerAdapter {

    private List<Champion> mList;
    private FragmentActivity mFragmentActivity;

    public FreeWeekPagerAdapter(List<Champion> list, FragmentActivity fragmentActivity) {
        mList = list;
        mFragmentActivity = fragmentActivity;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return object == view;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mList.get(position).getName();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        // Inflate a new layout from our resources
        View view = mFragmentActivity.getLayoutInflater().inflate(R.layout.pager_item,
                container, false);
        // Add the newly created View to the ViewPager
        container.addView(view);

        // Retrieve a TextView from the inflated View, and update it's text
        ImageView imgChampion = (ImageView) view.findViewById(R.id.image_view_champion);
        Picasso.with(mFragmentActivity.getApplicationContext()).load(mList.get(position).getLinkImage()).into(imgChampion);
        // Return the View
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}