package codeadore.textgram.store;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import codeadore.textgram.Settings;
import java.util.ArrayList;
import org.json.JSONObject;

public class StoreListFragment extends Fragment
{
  String TAG = "StoreListFragment";
  View theView;

  public StoreListFragment()
  {
  }

  public static StoreListFragment newInstance(String paramString1, String paramString2)
  {
    StoreListFragment localStoreListFragment = new StoreListFragment();
    Bundle localBundle = new Bundle();
    localBundle.putString("type", paramString1);
    localBundle.putString("title", paramString2);
    localStoreListFragment.setArguments(localBundle);
    return localStoreListFragment;
  }

  public void loadData(String paramString, View paramView)
  {
    LinearLayout localLinearLayout = (LinearLayout)paramView.findViewById(2131099822);
    localLinearLayout.setVisibility(8);
    ((LinearLayout)paramView.findViewById(2131099824)).setVisibility(0);
    new Thread(new StoreListFragment.2(this, paramString, localLinearLayout, paramView)).start();
  }

  public void loadMoreItems(ArrayAdapter<String> paramArrayAdapter, String paramString, View paramView, ArrayList<JSONObject> paramArrayList, ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2, Button paramButton, ProgressBar paramProgressBar)
  {
    int i = paramArrayAdapter.getCount();
    int j = Settings.store_items_per_page;
    int k = 1 + i / j;
    if (i < j)
    {
      paramButton.setVisibility(0);
      paramProgressBar.setVisibility(8);
      paramButton.setEnabled(false);
      paramButton.setText("No more items to load");
      return;
    }
    new Thread(new StoreListFragment.3(this, paramString, k, paramArrayList, paramArrayList2, paramArrayList1, paramView, paramButton, paramProgressBar)).start();
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    try
    {
      loadData(getArguments().getString("type"), this.theView);
      new Thread(new StoreListFragment.1(this)).start();
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        Log.e("IM", "SAD");
        localException.printStackTrace();
      }
    }
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903089, paramViewGroup, false);
    this.theView = localView;
    return localView;
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.store.StoreListFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
