package codeadore.textgram;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FriendsListFragment extends Fragment
{
  View view;

  public FriendsListFragment()
  {
  }

  public static Fragment newInstance()
  {
    return new FriendsListFragment();
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903082, paramViewGroup, false);
    this.view = localView;
    return localView;
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.FriendsListFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
