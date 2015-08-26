package se.harrison.myportfolioapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
    Toast portfolioToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchApp(View view) {
        if (portfolioToast != null) portfolioToast.cancel();

        String app_name;

        switch (view.getId()) {
            case R.id.spotify_button:
                app_name = "spotify app";
                break;
            case R.id.scores_button:
                app_name = "scores app";
                break;
            case R.id.library_button:
                app_name = "library app";
                break;
            case R.id.bigger_button:
                app_name = "build it bigger";
                break;
            case R.id.zyx_button:
                app_name = "zyx reader";
                break;
            case R.id.myownapp_button:
                app_name = "own app";
                break;
            default:
                app_name = "unknown app";
                break;
        }

        portfolioToast =
                Toast.makeText(this,
                String.format(getResources().getString(R.string.toast_message), app_name),
                Toast.LENGTH_SHORT);

        portfolioToast.show();
    }
}
