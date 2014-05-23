package codeadore.textgram.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;
import codeadore.textgram.store.StoreFeaturedFragment;
import codeadore.textgram.store.StoreListFragment;

public class StorePagerAdapter extends FragmentPagerAdapter
{
  public static Boolean destoryOn = Boolean.valueOf(false);
  public static String[] titles_ids = { "home", "template", "sticker", "font", "background", "filter", "frame" };
  public static String[] titles_strings = { "home", "templates", "stickers", "fonts", "backgrounds", "filters", "frames" };

  public StorePagerAdapter(FragmentManager paramFragmentManager)
  {
    super(paramFragmentManager);
  }

  public void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    if (destoryOn.booleanValue())
      super.destroyItem(paramViewGroup, paramInt, paramObject);
  }

  public int getCount()
  {
    return titles_ids.length;
  }

  public Fragment getItem(int paramInt)
  {
    if (titles_ids[paramInt] == "home")
      return new StoreFeaturedFragment();
    return StoreListFragment.newInstance(titles_ids[paramInt], titles_ids[paramInt]);
  }

  public CharSequence getPageTitle(int paramInt)
  {
    return titles_strings[paramInt];
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.adapters.StorePagerAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
