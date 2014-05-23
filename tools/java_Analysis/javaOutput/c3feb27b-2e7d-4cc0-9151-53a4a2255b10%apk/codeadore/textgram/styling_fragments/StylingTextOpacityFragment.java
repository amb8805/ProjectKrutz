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

public class StylingTextOpacityFragment extends Fragment
{
  View view;

  public StylingTextOpacityFragment()
  {
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    SeekBar localSeekBar = (SeekBar)this.view.findViewById(2131099862);
    TextView localTextView = (TextView)this.view.findViewById(2131099861);
    ((TextView)this.view.findViewById(2131099860)).setText(getActivity().getString(2131427372));
    localSeekBar.setMax(100);
    if (StylingActivity.superSurface.getCurrentTextItem() != null)
    {
      localSeekBar.setProgress(StylingActivity.superSurface.getCurrentTextItem().opacity);
      localTextView.setText(String.valueOf(StylingActivity.superSurface.getCurrentTextItem().opacity));
    }
    localSeekBar.setOnSeekBarChangeListener(new StylingTextOpacityFragment.1(this, localTextView));
    ((Button)this.view.findViewById(2131099863)).setOnClickListener(new StylingTextOpacityFragment.2(this));
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903097, paramViewGroup, false);
    this.view = localView;
    return localView;
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.styling_fragments.StylingTextOpacityFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
