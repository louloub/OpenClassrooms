package com.openclassrooms.entrevoisins.ui.neighbour_list;

import android.nfc.Tag;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;
import android.widget.Toast;

public class ListNeighbourPagerAdapter extends FragmentPagerAdapter {
    int mNumOfTabs;
    String tabItemName;

    public ListNeighbourPagerAdapter(FragmentManager fm, String tabItemName) {
        super(fm);
        this.tabItemName = tabItemName;
    }

    public ListNeighbourPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public ListNeighbourPagerAdapter(FragmentManager fm, int mNumOfTabs) {
        super(fm);
        this.mNumOfTabs = mNumOfTabs;
    }

    /**
     * getItem is called to instantiate the fragment for the given page.
     * @param position
     * @return
     */
    @Override
    public Fragment getItem(int position) {

        /*if (tabItemName.equals("MY NEIGHBOUR")){
            return NeighbourFragment.newInstance();
        } else if  (tabItemName.equals("FAVORITES")){
            return FavoritesNeighbourFragment.newInstance();
        }*/

        return NeighbourFragment.newInstance();
    }

    /**
     * get the number of pages
     * @return
     */
    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}