package com.fandor.challenge;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

  public MainActivityFragment() {
  }
  private Context mContext;
  @Override
  public void onAttach(final Activity activity) {
    super.onAttach(activity);
    mContext = activity;
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {


    View rootView = inflater.inflate(R.layout.fragment_main, container, false);
    //TextView t= (TextView) rootView.findViewById(R.id.etv);
    //t.setText("Testing e");
      Carousel introDescriptionCarousel=new Carousel();
    TextView tv=new TextView(mContext);

    RelativeLayout lo=(RelativeLayout) rootView.findViewById(R.id.lo);
    tv.setText("Testing");
    tv.setPadding(20, 150, 0, 0);
    lo.addView(tv);
    introDescriptionCarousel.setTv(tv);

    introDescriptionCarousel.addIntroDescription("Fandor is a pretty cool service!");
    introDescriptionCarousel.addIntroDescription("There are so many movies to watch!");

    introDescriptionCarousel.updateDescContinuously();
    
    return rootView;
  }
}
