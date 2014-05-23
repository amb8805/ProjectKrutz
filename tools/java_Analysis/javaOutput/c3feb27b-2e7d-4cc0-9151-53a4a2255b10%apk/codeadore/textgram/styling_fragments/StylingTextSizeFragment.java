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
import codeadore.textgram.SuperSurfaceItem;

public class StylingTextSizeFragment extends Fragment
{
  View view;

  public StylingTextSizeFragment()
  {
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    SeekBar localSeekBar = (SeekBar)this.view.findViewById(2131099862);
    TextView localTextView1 = (TextView)this.view.findViewById(2131099861);
    TextView localTextView2 = (TextView)this.view.findViewById(2131099860);
    if (localTextView2 != null)
      localTextView2.setText(getActivity().getString(2131427374));
    localSeekBar.setMax(200);
    if (StylingActivity.superSurface.getCurrentTextItem() != null)
    {
      localSeekBar.setProgress((int)StylingActivity.superSurface.getCurrentTextItem().textSize);
      localTextView1.setText(String.valueOf(StylingActivity.superSurface.getCurrentTextItem().textSize));
    }
    localSeekBar.setOnSeekBarChangeListener(new StylingTextSizeFragment.1(this, localTextView1));
    ((Button)this.view.findViewById(2131099863)).setOnClickListener(new StylingTextSizeFragment.2(this));
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903097, paramViewGroup, false);
    this.view = localView;
    return localView;
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.styling_fragments.StylingTextSizeFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
