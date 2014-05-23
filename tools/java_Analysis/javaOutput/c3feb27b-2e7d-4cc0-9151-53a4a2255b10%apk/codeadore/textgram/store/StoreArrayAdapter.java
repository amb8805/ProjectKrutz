package codeadore.textgram.store;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import codeadore.textgram.StoreActivity;
import codeadore.textgram.lazylist.ImageLoader;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public class StoreArrayAdapter extends ArrayAdapter<String>
{
  ArrayList<JSONObject> JSONObjects;
  ArrayList<String> iconsList;
  ImageLoader imageLoader;
  ArrayList<String> titlesList;
  ArrayList<String> uniqueIDSList;

  public StoreArrayAdapter(Context paramContext, int paramInt, ArrayList<JSONObject> paramArrayList, ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2)
  {
    super(paramContext, paramInt, paramArrayList2);
    this.titlesList = paramArrayList2;
    this.JSONObjects = paramArrayList;
    this.iconsList = paramArrayList1;
    this.imageLoader = new ImageLoader(paramContext.getApplicationContext());
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    localView = paramView;
    if (localView == null)
    {
      str1 = null;
      str2 = null;
      str3 = null;
      try
      {
        str2 = ((JSONObject)this.JSONObjects.get(paramInt)).getString("author_name");
        str3 = ((JSONObject)this.JSONObjects.get(paramInt)).getString("title");
        str1 = ((JSONObject)this.JSONObjects.get(paramInt)).getString("unique_id");
        ((JSONObject)this.JSONObjects.get(paramInt)).getString("purchased");
        localView = ((LayoutInflater)StoreActivity.c.getSystemService("layout_inflater")).inflate(2130903088, null);
        ((TextView)localView.findViewById(2131099819)).setText(str3);
        ((TextView)localView.findViewById(2131099820)).setText(str2);
        ImageView localImageView = (ImageView)localView.findViewById(2131099818);
        this.imageLoader.DisplayImage((String)this.iconsList.get(paramInt), localImageView);
        localButton = (Button)localView.findViewById(2131099821);
        if (StorePackages.isInstalled(str1))
        {
          localButton.setText("INSTALLED");
          localButton.setCompoundDrawablesWithIntrinsicBounds(getContext().getResources().getDrawable(2130837684), null, null, null);
          String str4 = str1;
          StoreArrayAdapter.1 local1 = new StoreArrayAdapter.1(this, str4);
          localButton.setOnClickListener(local1);
          LinearLayout localLinearLayout = (LinearLayout)localView.findViewById(2131099817);
          StoreArrayAdapter.2 local2 = new StoreArrayAdapter.2(this, str4);
          localLinearLayout.setOnClickListener(local2);
          StoreArrayAdapter.3 local3 = new StoreArrayAdapter.3(this);
          localLinearLayout.setOnTouchListener(local3);
          return localView;
        }
      }
      catch (JSONException localJSONException)
      {
        while (true)
        {
          Button localButton;
          localJSONException.printStackTrace();
          continue;
          localButton.setText("FREE");
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.store.StoreArrayAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
