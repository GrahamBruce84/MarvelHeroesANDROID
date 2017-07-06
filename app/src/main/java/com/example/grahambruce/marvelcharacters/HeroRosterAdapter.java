package com.example.grahambruce.marvelcharacters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by grahambruce on 05/07/2017.
 */

public class HeroRosterAdapter extends ArrayAdapter<Hero> {

    public HeroRosterAdapter(Context context, ArrayList<Hero> heroes) {
        super(context, 0, heroes);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.hero_character, parent, false);
        }

        Hero currentHero = getItem(position);
        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentHero.getName());

        TextView team = (TextView) listItemView.findViewById(R.id.team);
        team.setText(currentHero.getTeam());

        TextView powers = (TextView) listItemView.findViewById(R.id.powers);
        powers.setText(currentHero.getPowers());

        TextView publisher = (TextView) listItemView.findViewById(R.id.publisher);
        publisher.setText(currentHero.getPublisher());

        listItemView.setTag(currentHero);

        return listItemView;
    }
}
