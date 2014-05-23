package codeadore.textgram.styling_fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class StylingTextFragment extends Fragment
{
  View view;

  public StylingTextFragment()
  {
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    Button localButton1 = (Button)this.view.findViewById(2131099864);
    Button localButton2 = (Button)this.view.findViewById(2131099865);
    Button localButton3 = (Button)this.view.findViewById(2131099867);
    Button localButton4 = (Button)this.view.findViewById(2131099868);
    Button localButton5 = (Button)this.view.findViewById(2131099869);
    Button localButton6 = (Button)this.view.findViewById(2131099866);
    Button localButton7 = (Button)this.view.findViewById(2131099870);
    localButton1.setOnClickListener(new StylingTextFragment.1(this));
    localButton2.setOnClickListener(new StylingTextFragment.2(this));
    localButton3.setOnClickListener(new StylingTextFragment.3(this));
    localButton7.setOnClickListener(new StylingTextFragment.4(this));
    localButton6.setOnClickListener(new StylingTextFragment.5(this));
    localButton4.setOnClickListener(new StylingTextFragment.6(this));
    localButton5.setOnClickListener(new StylingTextFragment.7(this));
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903098, paramViewGroup, false);
    this.view = localView;
    return localView;
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.styling_fragments.StylingTextFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
