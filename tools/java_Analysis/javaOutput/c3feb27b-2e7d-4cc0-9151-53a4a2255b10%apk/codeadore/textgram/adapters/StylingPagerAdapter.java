package codeadore.textgram.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import codeadore.textgram.StylingPagerFragment;
import codeadore.textgram.styling_fragments.StylingHiFragment;
import codeadore.textgram.styling_fragments.StylingImagesFragment;
import codeadore.textgram.styling_fragments.StylingTextFragment;

public class StylingPagerAdapter extends FragmentPagerAdapter
{
  public static String[] titles_ids = { "hi", "templates", "stickers", "fonts", "text", "highlight", "backgrounds", "filters", "frames" };
  public static String[] titles_strings = { "hi", "templates", "stickers", "fonts", "text", "highlight", "backgrounds", "filters", "frames" };

  public StylingPagerAdapter(FragmentManager paramFragmentManager)
  {
    super(paramFragmentManager);
  }

  public int getCount()
  {
    return titles_ids.length;
  }

  public Fragment getItem(int paramInt)
  {
    if (titles_ids[paramInt] == "hi")
      return new StylingHiFragment();
    if (titles_ids[paramInt] == "fonts")
      return StylingImagesFragment.newInstance("fonts");
    if (titles_ids[paramInt] == "backgrounds")
      return StylingImagesFragment.newInstance("backgrounds");
    if (titles_ids[paramInt] == "frames")
      return StylingImagesFragment.newInstance("frames");
    if (titles_ids[paramInt] == "filters")
      return StylingImagesFragment.newInstance("filters");
    if (titles_ids[paramInt] == "templates")
      return StylingImagesFragment.newInstance("templates");
    if (titles_ids[paramInt] == "stickers")
      return StylingImagesFragment.newInstance("stickers");
    if (titles_ids[paramInt] == "text")
      return new StylingTextFragment();
    if (titles_ids[paramInt] == "highlight")
      return StylingImagesFragment.newInstance("highlight");
    return new StylingPagerFragment();
  }

  public CharSequence getPageTitle(int paramInt)
  {
    return titles_strings[paramInt];
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.adapters.StylingPagerAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
