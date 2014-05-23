package codeadore.textgram.store;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import codeadore.textgram.Settings;
import codeadore.textgram.el7rFragmentActivity;
import codeadore.textgram.lazylist.ImageLoader;
import java.util.ArrayList;
import org.json.JSONObject;

public class StoreFeaturedFragment extends Fragment
{
  String TAG = "StoreFeaturedFragment";
  Boolean areWeOk = Boolean.valueOf(false);
  ImageLoader imageLoader;
  el7rFragmentActivity mainActivity;
  View view;

  public StoreFeaturedFragment()
  {
  }

  public void loadData(String paramString, View paramView)
  {
    LinearLayout localLinearLayout = (LinearLayout)paramView.findViewById(2131099802);
    localLinearLayout.setVisibility(8);
    ((LinearLayout)paramView.findViewById(2131099804)).setVisibility(0);
    new Thread(new StoreFeaturedFragment.4(this, paramString, localLinearLayout, paramView)).start();
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
    new Thread(new StoreFeaturedFragment.5(this, paramString, k, paramArrayList, paramArrayList2, paramArrayList1, paramView, paramButton, paramProgressBar)).start();
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    this.mainActivity = ((el7rFragmentActivity)getActivity());
    this.imageLoader = new ImageLoader(this.mainActivity.getApplicationContext());
    new Thread(new StoreFeaturedFragment.1(this)).start();
    new Thread(new StoreFeaturedFragment.3(this, new Thread(new StoreFeaturedFragment.2(this)))).start();
    loadData("all", this.view);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903085, paramViewGroup, false);
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
 * Qualified Name:     codeadore.textgram.store.StoreFeaturedFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
