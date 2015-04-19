package com.locafy.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class addPlaylist extends ActionBarActivity {
    public final static String PLAYLIST = "com.locafy.app.PLAYLIST";

    // save to hash map here, current location and playlist, then go back to activatePlaylist
    public void save_Playlist_and_Loc(View view) {
        Intent intent = new Intent(this, activePlaylist.class);
        EditText playlist = (EditText) findViewById(R.id.playlist);
        String message = playlist.getText().toString();
        intent.putExtra(PLAYLIST, message);
        startActivity(intent);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_playlist);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_playlist, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
