package com.afap.lib_player;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import player.IJKVideoPlayActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.play).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String testurl = "http://jzvd.nathen.cn/c6e3dc12a1154626b3476d9bf3bd7266/6b56c5f0dc31428083757a45764763b0-5287d2089db37e62345123a1be272f8b.mp4";

//                Intent intent = new Intent(MainActivity.this, VideoPlayActivity.class);
//                intent.putExtra("url", testurl);
//                startActivity(intent);


//                Uri uri = Uri.parse(testurl);
//                // 让系统选择播放器来播放流媒体视频
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setDataAndType(uri, "video/*");
//                startActivity(intent);

                IJKVideoPlayActivity.intentTo(MainActivity.this, testurl, "测试视频");
            }
        });


    }
}
