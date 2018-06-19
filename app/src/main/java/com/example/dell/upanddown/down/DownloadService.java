package com.example.dell.upanddown.down;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

public class DownloadService extends Service{
    private  DownloadTask downloadTask;
    private String downloadUrl ;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

}
