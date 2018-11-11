package unicorp.com.mynewapp.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;

import unicorp.com.mynewapp.R;

public class HomePage extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

        ImageView btn = findViewById(R.id.btnz);
        ImageView cart = findViewById(R.id.btncart);
        ImageView search = findViewById(R.id.search_bar_icon);
        final DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        /*mDrawerLayout.openDrawer(Gravity.START);
        mDrawerLayout.closeDrawer(Gravity.START);*/

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawerLayout.openDrawer(Gravity.START);
            }
        });

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawerLayout.closeDrawer(Gravity.START);
                Intent i = new Intent(HomePage.this,OrdersActivity.class);
                startActivity(i);
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawerLayout.closeDrawer(Gravity.START);
                Intent i = new Intent(HomePage.this,SearchActivity.class);
                startActivity(i);
            }
        });




        /*ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();*/

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Intent i;

        if (id == R.id.nav_order) {
            // Handle the camera action
            i = new Intent(HomePage.this,OrdersActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_offers) {
            i = new Intent(HomePage.this,OffersActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_fav) {
            i = new Intent(HomePage.this,OrdersActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_manage) {
            i = new Intent(HomePage.this,OrdersActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_chat) {
            i = new Intent(HomePage.this,OrdersActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_about) {
            i = new Intent(HomePage.this,OrdersActivity.class);
            startActivity(i);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
