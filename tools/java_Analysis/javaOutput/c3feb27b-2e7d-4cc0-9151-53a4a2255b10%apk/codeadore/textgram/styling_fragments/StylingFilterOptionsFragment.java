package codeadore.textgram.styling_fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import codeadore.textgram.StylingActivity;
import codeadore.textgram.SuperSurface;

public class StylingFilterOptionsFragment extends Fragment
{
  View view;

  public StylingFilterOptionsFragment()
  {
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    SeekBar localSeekBar = (SeekBar)this.view.findViewById(2131099862);
    TextView localTextView1 = (TextView)this.view.findViewById(2131099861);
    TextView localTextView2 = (TextView)this.view.findViewById(2131099860);
    if (localTextView2 != null)
      localTextView2.setText(getActivity().getString(2131427376));
    localSeekBar.setMax(100);
    localSeekBar.setProgress(StylingActivity.superSurface.getFilterOpacity());
    localTextView1.setText(String.valueOf(StylingActivity.superSurface.getFilterOpacity()));
    localSeekBar.setOnSeekBarChangeListener(new StylingFilterOptionsFragment.1(this, localTextView1));
    ((Button)this.view.findViewById(2131099863)).setOnClickListener(new StylingFilterOptionsFragment.2(this));
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903097, paramViewGroup, false);
    this.view = localView;
    return localView;
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.styling_fragments.StylingFilterOptionsFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */