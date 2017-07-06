package com.example.grahambruce.marvelcharacters;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class HeroListActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hero_list);

        HeroRoster heroRoster = new HeroRoster();
        ArrayList<Hero> roster = heroRoster.getRoster();

        HeroRosterAdapter heroAdapter = new HeroRosterAdapter(this, roster);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(heroAdapter);
    }

    public void getHero(View listItem) {
        Hero hero = (Hero) listItem.getTag();
        StringBuilder sb = new StringBuilder();
        sb.append("You clicked: ");
        sb.append(hero.getName());

        Snackbar snackbar = Snackbar.make(listItem, sb.toString(), Snackbar.LENGTH_LONG);
        snackbar.show();
    }


    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Superheroes", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_activity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_about) {
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
