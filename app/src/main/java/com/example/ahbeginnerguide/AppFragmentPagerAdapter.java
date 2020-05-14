package com.example.ahbeginnerguide;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class AppFragmentPagerAdapter extends FragmentPagerAdapter {
    public AppFragmentPagerAdapter(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int position){
        if(position == 0){
            return new HomeFragment();
        }
        else if(position == 1){
            return new EventFragment();
        }
        else if(position == 2){
            return new FaqFragment();
        }
        else if(position == 3){
            return new ResourcesFragment();
        }
        else if(position == 4){
            return new MttFragment();
        }
        else if(position == 5){
            return new MapFragment();
        }
        else{
            return new GalleryFragment();
        }
    }
    @Override
    public int getCount(){
        return 7;
    }
    @Override
    public CharSequence getPageTitle(int position){
        if(position == 0){
            return "Home";
        }
        else if(position == 1){
            return "Events";
        }
        else if(position == 2){
            return "FAQs";
        }
        else if(position == 3){
            return "Resources";
        }
        else if(position == 4){
            return "Teacher About Me";
        }
        else if(position == 5){
            return "Map";
        }
        else{
            return "Gallery";
        }


    }

}
