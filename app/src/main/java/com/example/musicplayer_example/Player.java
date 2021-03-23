package com.example.musicplayer_example;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Player extends Fragment implements View.OnClickListener
{
    private ImageView ivAlbum;
    private TextView tvPlayCount, tvArtist, tvTitle, tvCurrentTime, tvDuration;
    private SeekBar seekBar;
    private ImageButton ibPlay, ibPrevious, ibNext, ibLike;

    //프래그먼트에서 장착된 액티비티를 가져올수 있다. (getActivity()로 가져온다 )
    //노래를 등록하기 위해서 선언된 객체변수
    private MainActivity mainActivity;
    private MediaPlayer mediaPlayer = new MediaPlayer();

    //음악들의 순서를 지정한다
    private int index;
    private MusicData musicData = new MusicData();

    //왜 ArrayList를 이용해서 좋아요 리스트만 가져왔을까
    private ArrayList<MusicData> likeArrayList = new ArrayList<>();
    //private MusicAdapter musicAdapter;

    //프래그먼트는 context(화면 + 컨트롤러 클래스 정보를 가지고 있다.)를 보유하고 있지 않다.
    @Override //onAttach를 통하여 개체를 가자고 올수 있다.
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.mainActivity = (MainActivity) context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        this.mainActivity = null;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.player, container, false);
        findViewByIdFunc(view);

        return view;
    }

    private void findViewByIdFunc(View view)
    {
        ivAlbum = view.findViewById(R.id.ivAlbum);
        tvPlayCount = view.findViewById(R.id.tvPlayCount);
        tvArtist = view.findViewById(R.id.tvArtist);
        tvTitle = view.findViewById(R.id.tvTitle);
        tvCurrentTime = view.findViewById(R.id.tvCurrentTime);
        tvDuration = view.findViewById(R.id.tvDuration);
        seekBar = view.findViewById(R.id.seekBar);
        ibPlay = view.findViewById(R.id.ibPlay);
        ibPrevious = view.findViewById(R.id.ibPrevious);
        ibNext = view.findViewById(R.id.ibNext);
        ibLike = view.findViewById(R.id.ibLike);

        ibPlay.setOnClickListener(this);
        ibPrevious.setOnClickListener(this);
        ibNext.setOnClickListener(this);
        ibLike.setOnClickListener(this);
    }

    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.ibPlay : break;
            case R.id.ibPrevious :break;
            case R.id.ibNext : break;
            case R.id.ibLike : break;
        }
    }


}