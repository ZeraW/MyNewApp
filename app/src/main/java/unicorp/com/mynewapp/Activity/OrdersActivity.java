package unicorp.com.mynewapp.Activity;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import unicorp.com.mynewapp.Fragments.Orders.PendingOrdersFragment;
import unicorp.com.mynewapp.Fragments.Orders.PreviousOrdersFragment;
import unicorp.com.mynewapp.Fragments.Orders.TrackOrdersFragment;
import unicorp.com.mynewapp.R;

public class OrdersActivity extends AppCompatActivity {


    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
        //tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        setupTabIcons();

        //mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        //tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

    }

    private void setupTabIcons() {
        TextView t1 = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        t1.setText("Pending");
        t1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_stat_name, 0, 0, 0);
        t1.setCompoundDrawablePadding(25);

        TextView t2 = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        t2.setText("Tracking");
        t2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_stat_going, 0, 0, 0);
        t2.setCompoundDrawablePadding(25);

        TextView t3 = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        t3.setText("Previous");
        t3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.prev, 0, 0, 0);
        t3.setCompoundDrawablePadding(25);
        tabLayout.getTabAt(0).setCustomView(t1);
        tabLayout.getTabAt(1).setCustomView(t2);
        tabLayout.getTabAt(2).setCustomView(t3);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new PendingOrdersFragment(), "ONE");
        adapter.addFragment(new TrackOrdersFragment(), "TWO");
        adapter.addFragment(new PreviousOrdersFragment(), "THREE");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}
