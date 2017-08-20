package iotapps.androidservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by prashantkaushik on 17/03/17.
 */

public class serviceone extends Service {


    // Now we will override basic functions


    int mMode;


    // If some App binds to this service then these are bind interfaces
    IBinder mBinder;

    boolean mAllowRebind;

   // usual on create method
    @Override
    public void onCreate() {


        Thread one =  new Thread(){
            @Override
            public void run()
            {
                try{
                    while (true)
                    {
                        sleep(1000);
                        Log.d("Service printing-->"," something ");
                    }
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }


            }

        };
        one.start();


    }

    // when service starts
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return mMode;
    }


    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }


    @Override
    public boolean onUnbind(Intent intent) {
        return mAllowRebind;
    }

    @Override
    public void onRebind(Intent intent) {

    }


    @Override
    public void onDestroy() {
   Log.d("","Service terminated");
    }
}
