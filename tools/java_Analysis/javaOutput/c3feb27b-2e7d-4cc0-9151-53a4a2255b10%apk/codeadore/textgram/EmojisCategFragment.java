package codeadore.textgram;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ProgressBar;
import codeadore.textgram.adapters.EmojisGridAdapter;

public class EmojisCategFragment extends Fragment
{
  Handler UIHandler = new Handler();
  EmojisGridAdapter emojisAdapter;
  boolean smileysLoaded = false;
  View view;

  public EmojisCategFragment()
  {
  }

  public static Fragment newInstance(String paramString)
  {
    EmojisCategFragment localEmojisCategFragment = new EmojisCategFragment();
    Bundle localBundle = new Bundle();
    localBundle.putString("category", paramString);
    localEmojisCategFragment.setArguments(localBundle);
    return localEmojisCategFragment;
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    String str = getArguments().getString("category");
    ProgressBar localProgressBar = (ProgressBar)this.view.findViewById(2131099793);
    GridView localGridView = (GridView)this.view.findViewById(2131099794);
    FragmentActivity localFragmentActivity = getActivity();
    if (localProgressBar.getVisibility() == 0)
    {
      this.smileysLoaded = true;
      EmojisCategFragment.1 local1 = new EmojisCategFragment.1(this, localFragmentActivity, str, localGridView, localProgressBar);
      localGridView.setOnItemClickListener(new EmojisCategFragment.2(this, localFragmentActivity, str));
      this.UIHandler.postDelayed(new EmojisCategFragment.3(this, local1), 500L);
    }
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.view = paramLayoutInflater.inflate(2130903081, paramViewGroup, false);
    return this.view;
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    setUserVisibleHint(true);
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.EmojisCategFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
