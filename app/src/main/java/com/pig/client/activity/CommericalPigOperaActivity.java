package com.pig.client.activity;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.pig.client.R;
import com.pig.client.adapter.VpAdapter;
import com.pig.client.view.BreedingFrag;
import com.pig.client.view.EliminateFrag;
import com.pig.client.view.PigstyChangeFrag;
import com.pig.client.view.SaleFrag;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

public class CommericalPigOperaActivity extends AppCompatActivity {
    private static final String TAG = "BoarOperaActivity";
    private BottomNavigationView boar_opera_bottom;

    private EliminateFrag eliminateFrag;
    private PigstyChangeFrag pigstyChangeFrag;
    private SaleFrag saleFrag;
    private List<Fragment>fragmentList = new ArrayList<>();
    private  ViewPager commercialOperaVP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commerical_pig_opera);

        commercialOperaVP  = findViewById(R.id.commercialOperaVP);

        eliminateFrag = new EliminateFrag(CommericalPigOperaActivity.this);
        pigstyChangeFrag = new PigstyChangeFrag(CommericalPigOperaActivity.this);
        saleFrag = new SaleFrag(CommericalPigOperaActivity.this);
        fragmentList.add(eliminateFrag);
        fragmentList.add(pigstyChangeFrag);
        fragmentList.add(saleFrag);
        VpAdapter adapter = new VpAdapter(getSupportFragmentManager(),fragmentList);
        commercialOperaVP.setAdapter(adapter);
        commercialOperaVP.setOffscreenPageLimit(2); //预加载剩下两页
        commercialOperaVP.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                boar_opera_bottom.getMenu().getItem(i).setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });//绑定导航栏


        boar_opera_bottom = findViewById(R.id.commercial_opera_bottom);
        boar_opera_bottom.setOnNavigationItemSelectedListener(new BoarOperaBottomListenser());// 选择监听
        boar_opera_bottom.setSelectedItemId(R.id.commerciala);//  设置默认选择
    }

    /**
     *
     *
     * //  底部  选择栏  监听器   切换中部视图
     */
    class  BoarOperaBottomListenser  implements BottomNavigationView.OnNavigationItemSelectedListener{

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Log.d(TAG, "onNavigationItemSelected: ");
            switch (item.getItemId()){
                case R.id.commerciala:
                    commercialOperaVP.setCurrentItem(0); //绑定viewpage
                    break;
                case R.id.commercialb:
                    commercialOperaVP.setCurrentItem(1);
                    break;
                case R.id.commercialc:
                    commercialOperaVP.setCurrentItem(2);
                    break;

                default:break;
            }
            return true;// return false  事务拦截没有动画效果
        }
    }



}
