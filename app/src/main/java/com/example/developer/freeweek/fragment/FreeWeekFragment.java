package com.example.developer.freeweek.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.developer.freeweek.R;
import com.example.developer.freeweek.adapter.FreeWeekPagerAdapter;
import com.example.developer.freeweek.entity.Champion;
import com.example.developer.freeweek.view.SlidingTabLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Developer on 2/18/2015.
 */
public class FreeWeekFragment extends Fragment {
    private SlidingTabLayout mSlidingTabLayout;
    private ViewPager mViewPager;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.fragment_free_week,container,false);
        return contentView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        // Get the ViewPager and set it's PagerAdapter so that it can display items
        mViewPager = (ViewPager) view.findViewById(R.id.viewpager);
        List<Champion> list = new ArrayList<Champion>();
        for (int intLoop =0;intLoop <5;intLoop++){
            Champion chp = new Champion();
            if(intLoop==0){
               chp.setLane("BOT");
               chp.setName("Jinx");
               chp.setLinkImage("http://ddragon.leagueoflegends.com/cdn/img/champion/splash/Jinx_0.jpg");
           }
            if(intLoop==1){
                chp.setLane("MID");
                chp.setName("Syndra");
                chp.setLinkImage("http://ddragon.leagueoflegends.com/cdn/img/champion/splash/Syndra_0.jpg");
            }
            if(intLoop==2){
                chp.setLane("TOP");
                chp.setName("Warwick");
                chp.setLinkImage("http://ddragon.leagueoflegends.com/cdn/img/champion/splash/Warwick_0.jpg");
            }
            if(intLoop==3){
                chp.setLane("JUNGLE");
                chp.setName("Amumu");
                chp.setLinkImage("http://ddragon.leagueoflegends.com/cdn/img/champion/splash/Amumu_0.jpg");
            }
            if(intLoop==4){
                chp.setLane("SUPP");
                chp.setName("Leona");
                chp.setLinkImage("http://ddragon.leagueoflegends.com/cdn/img/champion/splash/Leona_0.jpg");
            }
            list.add(chp);
        }

        mViewPager.setAdapter(new FreeWeekPagerAdapter(list,getActivity()));

        // Give the SlidingTabLayout the ViewPager, this must be done AFTER the ViewPager has had
        // it's PagerAdapter set.
        mSlidingTabLayout = (SlidingTabLayout) view.findViewById(R.id.sliding_tabs);
        mSlidingTabLayout.setViewPager(mViewPager);
    }
}
