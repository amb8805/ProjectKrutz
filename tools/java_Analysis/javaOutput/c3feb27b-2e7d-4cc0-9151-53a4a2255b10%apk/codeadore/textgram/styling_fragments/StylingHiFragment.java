package codeadore.textgram.styling_fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class StylingHiFragment extends Fragment
{
  boolean isBold = false;
  boolean isStrike = false;
  boolean isUnderline = false;
  View view;

  public StylingHiFragment()
  {
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    FragmentActivity localFragmentActivity = getActivity();
    ((Button)this.view.findViewById(2131099849)).setOnClickListener(new StylingHiFragment.1(this));
    ((Button)this.view.findViewById(2131099847)).setOnClickListener(new StylingHiFragment.2(this, localFragmentActivity));
    this.view.findViewById(2131099846).setOnClickListener(new StylingHiFragment.3(this, localFragmentActivity));
    Button localButton1 = (Button)this.view.findViewById(2131099848);
    localButton1.setOnClickListener(new StylingHiFragment.4(this, localButton1));
    ImageButton localImageButton1 = (ImageButton)this.view.findViewById(2131099840);
    ImageButton localImageButton2 = (ImageButton)this.view.findViewById(2131099842);
    ImageButton localImageButton3 = (ImageButton)this.view.findViewById(2131099841);
    localImageButton1.setBackgroundResource(2130837624);
    localImageButton1.setOnClickListener(new StylingHiFragment.5(this, localImageButton1, localImageButton2, localImageButton3));
    localImageButton3.setOnClickListener(new StylingHiFragment.6(this, localImageButton1, localImageButton2, localImageButton3));
    localImageButton2.setOnClickListener(new StylingHiFragment.7(this, localImageButton1, localImageButton2, localImageButton3));
    ImageButton localImageButton4 = (ImageButton)this.view.findViewById(2131099843);
    localImageButton4.setOnClickListener(new StylingHiFragment.8(this, localImageButton4));
    ImageButton localImageButton5 = (ImageButton)this.view.findViewById(2131099844);
    localImageButton5.setOnClickListener(new StylingHiFragment.9(this, localImageButton5));
    ImageButton localImageButton6 = (ImageButton)this.view.findViewById(2131099845);
    localImageButton6.setOnClickListener(new StylingHiFragment.10(this, localImageButton6));
    Button localButton2 = (Button)this.view.findViewById(2131099850);
    if (localButton2 != null)
      localButton2.setOnClickListener(new StylingHiFragment.11(this));
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903094, paramViewGroup, false);
    this.view = localView;
    return localView;
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    setUserVisibleHint(true);
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.styling_fragments.StylingHiFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
