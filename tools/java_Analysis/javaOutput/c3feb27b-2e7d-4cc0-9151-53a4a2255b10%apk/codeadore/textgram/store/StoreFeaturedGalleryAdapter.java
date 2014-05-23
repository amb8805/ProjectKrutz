package codeadore.textgram.store;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import codeadore.textgram.lazylist.ImageLoader;
import java.util.ArrayList;

public class StoreFeaturedGalleryAdapter extends PagerAdapter
{
  private final Context context;
  ArrayList<String> iconsList;
  ImageLoader imageLoader;
  ArrayList<String> uniqueIDSList;

  public StoreFeaturedGalleryAdapter(Context paramContext, ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2)
  {
    this.context = paramContext;
    this.iconsList = paramArrayList1;
    this.uniqueIDSList = paramArrayList2;
    this.imageLoader = new ImageLoader(paramContext.getApplicationContext());
  }

  public void destroyItem(View paramView, int paramInt, Object paramObject)
  {
    ((ViewPager)paramView).removeView((ImageView)paramObject);
  }

  public void finishUpdate(View paramView)
  {
  }

  public int getCount()
  {
    return this.iconsList.size();
  }

  public Object instantiateItem(View paramView, int paramInt)
  {
    ImageView localImageView = new ImageView(this.context);
    this.imageLoader.DisplayImage((String)this.iconsList.get(paramInt), localImageView);
    localImageView.setOnTouchListener(new StoreFeaturedGalleryAdapter.1(this));
    localImageView.setOnClickListener(new StoreFeaturedGalleryAdapter.2(this, paramInt));
    ((ViewPager)paramView).addView(localImageView, 0);
    return localImageView;
  }

  public boolean isViewFromObject(View paramView, Object paramObject)
  {
    return paramView.equals(paramObject);
  }

  public void restoreState(Parcelable paramParcelable, ClassLoader paramClassLoader)
  {
  }

  public Parcelable saveState()
  {
    return null;
  }

  public void startUpdate(View paramView)
  {
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.store.StoreFeaturedGalleryAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
