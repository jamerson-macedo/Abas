package abas.jmdevelopers.com.abas;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

import abas.jmdevelopers.com.abas.fragments.EmaltaFragment;
import abas.jmdevelopers.com.abas.fragments.HomeFragment;
import abas.jmdevelopers.com.abas.fragments.InscricoesFragmen;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private SmartTabLayout smartTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.viewpager);
        smartTabLayout=findViewById(R.id.viewpagertab);
        // configurar action bar
        getSupportActionBar().setElevation(0);
        getSupportActionBar().setTitle("YouTube");

        getSupportActionBar().setSubtitle("the best");

        // configurando abas, primeiro configura um adapter
        FragmentPagerItemAdapter adapter=new FragmentPagerItemAdapter(getSupportFragmentManager(),
                FragmentPagerItems.with(this).
                        add("Home", HomeFragment.class).add("Inscrições", InscricoesFragmen.class).add("Em alta", EmaltaFragment.class).create());
        viewPager.setAdapter(adapter);
        smartTabLayout.setViewPager(viewPager);



    }
}
