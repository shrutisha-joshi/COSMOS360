package com.robovitics.cosmos360.cosmos_360;


import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toolbar;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    LinearLayout fb;
    LinearLayout instagr;
    LinearLayout cosmoweb;
    LinearLayout robovit;
    Toolbar toolbar;
    LinearLayout locate;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        android.support.v7.widget.Toolbar toolbar = view.findViewById(R.id.toolbarhome);
        toolbar.setTitle(getResources().getString(R.string.nav_home));
        fb = view.findViewById(R.id.fb);
        instagr = view.findViewById(R.id.instagrm);
        cosmoweb = view.findViewById(R.id.web);
        locate = view.findViewById(R.id.location);



        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("fb://facewebmodal/f?href=https://www.facebook.com/robovitics");
                Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

                likeIng.setPackage("com.facebook.android");

                try {
                    startActivity(likeIng);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("fb://facewebmodal/f?href=https://www.facebook.com/robovitics")));
                }
            }
        });

        instagr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://instagram.com/_u/robovitics");
                Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

                likeIng.setPackage("com.instagram.android");

                try {
                    startActivity(likeIng);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://instagram.com/xxx")));
                }
            }
        });


        cosmoweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://robovitics.com/cosmos360/index.html");
                Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

               // likeIng.setPackage("com.facebook.android");

                try {
                    startActivity(likeIng);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://robovitics.com/cosmos360/index.html")));
                }
            }
        });


        locate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode("Anna Auditorium, VIT University, Vellore, Tamil Nadu"));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
        return view;
    }

}
