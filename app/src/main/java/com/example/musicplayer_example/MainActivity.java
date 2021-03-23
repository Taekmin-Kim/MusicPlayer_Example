package com.example.musicplayer_example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private FrameLayout frameLayout;
    private RecyclerView recyclerView;
    private RecyclerView recyclerLike;

    //현재 액티비티에 있는 프레임레이아웃에 프래그먼트 지정
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find id activity_main
        findViewByIdFunc();
        rePlaceFrag();
    }

    //현재 액티비티에 있는 프레임 레이아웃에 프래그먼트를 지정한다.
    private void rePlaceFrag()
    {
        //프래그먼트 생성
        Player player = new Player();
        FragmentTransaction ft =getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frameLayout,player);
        ft.commit();
    }

    private void findViewByIdFunc()
    {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        frameLayout = (FrameLayout) findViewById(R.id.frameLayout); //프래그먼트를 넣어야 한다.
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerLike = (RecyclerView) findViewById(R.id.recyclerLike);
    }





}