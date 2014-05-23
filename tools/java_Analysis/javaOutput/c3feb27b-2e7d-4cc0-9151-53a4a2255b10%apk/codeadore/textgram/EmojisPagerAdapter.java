package codeadore.textgram;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;

public class EmojisPagerAdapter extends FragmentPagerAdapter
{
  String[] categories = { "bell", "car", "face", "flower", "symbols" };

  public EmojisPagerAdapter(FragmentManager paramFragmentManager)
  {
    super(paramFragmentManager);
  }

  public void destroyItem(View paramView, int paramInt, Object paramObject)
  {
  }

  public int getCount()
  {
    return this.categories.length;
  }

  public Fragment getItem(int paramInt)
  {
    return EmojisCategFragment.newInstance(this.categories[paramInt]);
  }

  public CharSequence getPageTitle(int paramInt)
  {
    return this.categories[paramInt];
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.EmojisPagerAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
