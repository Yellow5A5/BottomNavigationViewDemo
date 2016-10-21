package yellow5a5.bottomnavigationviewdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private android.widget.Button demobotton;
    private android.support.design.widget.BottomNavigationView demonavigation;
    private android.widget.RelativeLayout activitymain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.activitymain = (RelativeLayout) findViewById(R.id.activity_main);
        this.demonavigation = (BottomNavigationView) findViewById(R.id.demo_navigation);
        this.demobotton = (Button) findViewById(R.id.demo_botton);

        demonavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_recent:
                        break;
                    case R.id.action_favorite:
                        break;
                    case R.id.action_nearby:
                        break;
                }
                return true;
            }
        });
    }
}
