package com.example.priapojoseba;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pConfig;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    /*PendingIntent pendingIntent,pendingIntent2;
    private static Context appContext,appContextB,appContextC;
    public WifiManager wifiManager,wifiManager2,wifiManager3;
    WifiInfo wifiInfo,wifiInfo2;
    WifiConfiguration wifiConfiguracion, wifiConfiguracion2;*/

    public String ms = "??";


    private class Asinc extends AsyncTask<Void, Integer, Boolean> {
        @Override
        protected Boolean doInBackground(Void... params) {
            Log.i("--uva", "Estoy en otro hilo");
            return true;
        }
        @Override
        protected void onProgressUpdate(Integer... values) {
        }
        @Override
        protected void onPreExecute() {
        }
        @Override
        protected void onPostExecute(Boolean result) {

            Toast.makeText(MainActivity.this, "Tarea finalizada!",
                    Toast.LENGTH_SHORT).show();
        }
        @Override
        protected void onCancelled() {

        }
    }

        @RequiresApi(api = Build.VERSION_CODES.M)
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        //Get request;
            new Asinc().execute();
            URL url = null;
            try {
                url = new URL("http://www.android.com/");
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            HttpURLConnection urlConnection = null;
            try {
                urlConnection = (HttpURLConnection) url.openConnection();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                InputStream in = new BufferedInputStream(urlConnection.getInputStream());
                // readStream(in);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                urlConnection.disconnect();
            }
            Log.i("--intent","act1");
            Intent i = new Intent(this, Main2Activity.class);
            startActivity(i);

        //Abajo todo OK
        /*appContext = getApplicationContext();
        boolean settingsCanWrite = Settings.System.canWrite(appContext);
        if(!settingsCanWrite) {
            // If do not have write settings permission then open the Can modify system settings panel.
            Intent intent = new Intent(Settings.ACTION_MANAGE_WRITE_SETTINGS);
            startActivity(intent);
        }else {
            // If has permission then show an alert dialog with message.
            AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
            alertDialog.setMessage("You have system write settings permission now.");
            alertDialog.show();


            wifiManager2 = (WifiManager) appContext.getSystemService(Context.WIFI_SERVICE);
            wifiManager2.setWifiEnabled(false);
            Method method = null;
            try {
                Log.e("UVAS", "okis?");
                method = wifiManager2.getClass().getMethod("setWifiApEnabled", WifiConfiguration.class, boolean.class);
                method.invoke(wifiManager2, wifiConfiguracion, true);
                Log.i("UVAS", "okis?");
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        Intent intent2 = new Intent(MainActivity.this, AlarmReceiver.class);
        pendingIntent = PendingIntent.getBroadcast(MainActivity.this, 0, intent2, 0);

        AlarmManager manager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        int interval = 8000;
        manager.setInexactRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis(), interval, pendingIntent);

        appContextB = getApplication();

        IntentFilter ifilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        Intent batteryStatus = appContext.registerReceiver(null, ifilter);

        // Are we charging / charged?
        int status = batteryStatus.getIntExtra(BatteryManager.EXTRA_STATUS, -1);
        boolean isCharging = status == BatteryManager.BATTERY_STATUS_CHARGING ||
                status == BatteryManager.BATTERY_STATUS_FULL;

        // How are we charging?
        int chargePlug = batteryStatus.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1);
        boolean usbCharge = chargePlug == BatteryManager.BATTERY_PLUGGED_USB;
        boolean acCharge = chargePlug == BatteryManager.BATTERY_PLUGGED_AC;

        int level = batteryStatus.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
        int scale = batteryStatus.getIntExtra(BatteryManager.EXTRA_SCALE, -1);

        float batteryPct = level / (float)scale;
        batteryPct = batteryPct * 100;
        int bateria = Math.round(batteryPct);
        Toast toast1 =
                Toast.makeText(getApplicationContext(),
                        "Nivel de bateria "+String.valueOf(bateria) + "%", Toast.LENGTH_SHORT);
        toast1.show();
        */
    }
}
