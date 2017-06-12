package com.android.douglas.alarme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

/**
 * Created by logonrm on 12/06/2017.
 */

public class AlarmeReceiver extends BroadcastReceiver {
    private MediaPlayer mp;
    public AlarmeReceiver(){
        mp = null;
    }
    @Override
    public void onReceive(Context context, Intent intent) {
        mp=MediaPlayer.create(context, R.raw.acabou);
        mp.start();
        Toast.makeText(context, "Alarm....", Toast.LENGTH_LONG).show();
    }


}
