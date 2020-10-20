package appcom.abas.abas.Activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

import appcom.abas.abas.Fragment.EmAltaFragment;
import appcom.abas.abas.Fragment.HomeFragment;
import appcom.abas.abas.Fragment.InscricoesFragment;
import appcom.abas.abas.R;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private SmartTabLayout smartTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        smartTabLayout = findViewById(R.id.smartTabLayout);

        //Configurar action bar
        getSupportActionBar().setElevation(0);
        getSupportActionBar().setTitle("Youtube");

        //Configurar abas
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(),/*gerenciador de fragmentos*/
                FragmentPagerItems.with(this)
                .add("Home",HomeFragment.class)
                .add("Inscrições",InscricoesFragment.class)
                .add("Em Alta",EmAltaFragment.class)
                .create()/*classe com a configuracao dos fragmentos*/
        );
        viewPager.setAdapter(adapter);
        smartTabLayout.setViewPager(viewPager);
    }
}
