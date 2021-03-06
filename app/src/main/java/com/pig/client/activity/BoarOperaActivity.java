package com.pig.client.activity;

import android.content.Intent;
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
import com.pig.client.pojo.BreedingPig;
import com.pig.client.view.BreedingFrag;
import com.pig.client.view.EliminateFrag;
import com.pig.client.view.PigstyChangeFrag;
import com.pig.client.view.SaleFrag;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

public class BoarOperaActivity extends AppCompatActivity {
    private static final String TAG = "BoarOperaActivity";
private BottomNavigationView boar_opera_bottom;

private BreedingFrag breedingFrag;
 private EliminateFrag eliminateFrag;
private PigstyChangeFrag pigstyChangeFrag;
private List<Fragment>fragmentList = new ArrayList<>();
private  ViewPager boarOperaVP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boar_opera);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
//        BreedingPig breedingPig = (BreedingPig) bundle.get("BreedingPig");





    boarOperaVP  = findViewById(R.id.boarOperaVP);

    breedingFrag = new BreedingFrag();
    breedingFrag.setArguments(bundle);

    eliminateFrag = new EliminateFrag();
    eliminateFrag.setArguments(bundle);

    pigstyChangeFrag = new PigstyChangeFrag();
    pigstyChangeFrag.setArguments(bundle);

    fragmentList.add(breedingFrag);
    fragmentList.add(eliminateFrag);
    fragmentList.add(pigstyChangeFrag);
    VpAdapter adapter = new VpAdapter(getSupportFragmentManager(),fragmentList);
    boarOperaVP.setAdapter(adapter);
    boarOperaVP.setOffscreenPageLimit(2); //预加载剩下两页
    boarOperaVP.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
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




        boar_opera_bottom = findViewById(R.id.boar_opera_bottom);
        boar_opera_bottom.setOnNavigationItemSelectedListener(new BoarOperaBottomListenser());// 选择监听
        boar_opera_bottom.setSelectedItemId(R.id.boara);//  设置默认选择




    }

    /**
     *
     *
     */
    class  BoarOperaBottomListenser  implements BottomNavigationView.OnNavigationItemSelectedListener{

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Log.d(TAG, "onNavigationItemSelected: ");
            switch (item.getItemId()){
                case R.id.boara:
                    boarOperaVP.setCurrentItem(0); //绑定viewpager

                    break;
                case R.id.boarb:
                    boarOperaVP.setCurrentItem(1);

                    break;
                case R.id.board:
                    boarOperaVP.setCurrentItem(2);

                    break;
//                case R.id.boare:
//                    break;
                default:break;
            }
            return true;// return false  事务拦截没有动画效果
        }
    }


//    private void initEvent() {
//
//        bottom_frgament.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId()) {
//                    case R.id.action_favorites4:
//                        // 点击的时候切换的 就是我们的FrameLayout
//                        getSupportFragmentManager().beginTransaction().replace(R.id.fl_main_contain, own1Fragment).commit();
//                        return true;
//                    // break;
//                    case R.id.action_launcher4:
//                        getSupportFragmentManager().beginTransaction().replace(R.id.fl_main_contain, own1Fragment).commit();
//                        return true;
//                    // break;
//                    case R.id.action_music4:
//                        getSupportFragmentManager().beginTransaction().replace(R.id.fl_main_contain, own1Fragment).commit();
//                        return true;
//                    // break;
//                    case R.id.action_sport4:
//                        getSupportFragmentManager().beginTransaction().replace(R.id.fl_main_contain, own1Fragment).commit();
//                        return true;
//                    //  break;
//                }
//                return false;
//            }
//        });
//    }

}
