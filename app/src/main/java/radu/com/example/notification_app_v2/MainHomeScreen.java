package radu.com.example.notification_app_v2;


import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainHomeScreen extends AppCompatActivity {


    NotificationCompat.Builder notification;
    private static final int uniqueID = 4599;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home_screen);


        notification = new NotificationCompat.Builder(this);
        notification.setAutoCancel(true);

    }

    public void buckysButtonClicked(View view){
        //Build the notification
        notification.setSmallIcon(R.drawable.badger);
        notification.setTicker("This is the ticker");
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle("Here is the thitle");
        notification.setContentText("I am the body text of your notification");

        Intent intent = new Intent(this, MainHomeScreen.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pendingIntent);

        //BUilds notification and issues it
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(uniqueID, notification.build());





















    }
}
