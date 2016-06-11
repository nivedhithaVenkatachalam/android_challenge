package com.fandor.challenge;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
      Carousel introDescriptionCarousel=new Carousel();
    TextView TV=new TextView(mContext);

    return inflater.inflate(R.layout.fragment_main, container, false);
  }
}
