package com.sun_asterisk.soundcloud_71.screen.main;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.sun_asterisk.soundcloud_71.R;
import com.sun_asterisk.soundcloud_71.screen.main.adapter.MainAdapter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView mImageViewLibrary, mImageViewSearch;
    private TextView mTextViewMusic;
    private TabLayout mTabLayoutMusic;
    private ViewPager mViewPagerMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initListener();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageViewLibrary:
                break;
            case R.id.textViewMusic:
                break;
            case R.id.imageViewSearch:
                break;
        }
    }

    private void initView(){
        mImageViewLibrary = findViewById(R.id.imageViewLibrary);
        mImageViewSearch = findViewById(R.id.imageViewSearch);
        mTextViewMusic = findViewById(R.id.textViewMusic);
        mTabLayoutMusic = findViewById(R.id.tabLayoutMusic);
        mViewPagerMusic = findViewById(R.id.viewPagerMusic);

        MainAdapter mainAdapter = new MainAdapter(getSupportFragmentManager());
        mViewPagerMusic.setAdapter(mainAdapter);
        mTabLayoutMusic.setupWithViewPager(mViewPagerMusic);
    }

    private void initListener(){
        mImageViewLibrary.setOnClickListener(this);
        mTextViewMusic.setOnClickListener(this);
        mImageViewSearch.setOnClickListener(this);
    }
}
