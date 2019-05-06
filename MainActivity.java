package com.example.medicines;


import android.app.ActivityOptions;
import android.app.AlertDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.ShareCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ShareActionProvider;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private   TabLayout tabLayout;
    private ViewPager viewPager;
    private PageAdapter pageAdapter;
    Button b1,b2;
DrawerLayout drawerLayout;
    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else {
            View v= LayoutInflater.from(getApplicationContext()).inflate(R.layout.alertbox,null);
            final AlertDialog alertDialog=new AlertDialog.Builder(this).create();
            b1=v.findViewById(R.id.alert_bt1);
            b2=v.findViewById(R.id.alert_bt2);
            alertDialog.setView(v);
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finishAffinity();
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    alertDialog.dismiss();
                }
            });
            alertDialog.show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Toolbar toolbar=findViewById(R.id.toolbar);
        drawerLayout=findViewById(R.id.drawer);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open_nav_drawer,R.string.close_nav_drawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView=findViewById(R.id.nv);
        navigationView.setNavigationItemSelectedListener(this);
        tabLayout=findViewById(R.id.tablayout);
        viewPager=findViewById(R.id.viewpager);
        pageAdapter=new PageAdapter(getSupportFragmentManager());
        pageAdapter.addFragment(new Tab1(),"Home");
        pageAdapter.addFragment(new Tab2(),"Medications");
        Intent i=getIntent();
        String s=i.getStringExtra("user");
        Bundle bundle=new Bundle();
        bundle.putString("user1",s);
        pageAdapter.addFragment(new Tab3(),"Account");
        Tab3 fragment=new Tab3();
        fragment.setArguments(bundle);
        viewPager.setAdapter(pageAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId())
        {
            case R.id.item1:
                Intent i=new Intent(this,MainActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.stay_from_bottom, R.anim.stay);
                break;
            case R.id.item2:
                Intent i1=new Intent(this,MainActivity.class);
                startActivity(i1);
                overridePendingTransition(R.anim.stay_from_bottom, R.anim.stay);
                break;
            case R.id.item3:
                Intent i2=new Intent(this,MainActivity.class);
                startActivity(i2);
                overridePendingTransition(R.anim.stay_from_bottom, R.anim.stay);
                break;
        }
        return true;
    }
}
