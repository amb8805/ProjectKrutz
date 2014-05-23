package codeadore.textgram;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import codeadore.textgram.custom_widgets.EmojisTabPageIndicator;

public class EditTextActivity extends FragmentActivity
{
  public static EditText et;
  String TAG = "EditTextActivity";
  Handler UIHandler;
  ImageButton smileysBtn;
  LinearLayout smileysLL;

  public EditTextActivity()
  {
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(2130903078);
    this.UIHandler = new Handler();
    et = (EditText)findViewById(2131099776);
    try
    {
      et.setText(StylingActivity.superSurface.getCurrentTextItem().getText());
      et.setGravity(StylingActivity.superSurface.getCurrentTextItem().getTextGravity());
      et.setTypeface(Utilities.getTypefaceFromPath(getApplicationContext(), StylingActivity.superSurface.getCurrentTextItem().typeFacePath));
      ((ImageButton)findViewById(2131099779)).setOnClickListener(new EditTextActivity.1(this));
      ((Button)findViewById(2131099780)).setOnClickListener(new EditTextActivity.2(this));
      this.smileysBtn = ((ImageButton)findViewById(2131099778));
      this.smileysLL = ((LinearLayout)findViewById(2131099781));
      this.smileysBtn.setOnClickListener(new EditTextActivity.3(this));
      return;
    }
    catch (Exception localException)
    {
      while (true)
        Log.e(this.TAG, "in setting et's text");
    }
  }

  public void setupSmileys()
  {
    Settings.currentEmojisActivity = "EditTextActivity";
    ViewPager localViewPager = (ViewPager)findViewById(2131099784);
    localViewPager.setAdapter(new EmojisPagerAdapter(getSupportFragmentManager()));
    ((EmojisTabPageIndicator)findViewById(2131099782)).setViewPager(localViewPager);
    ((ImageButton)findViewById(2131099783)).setOnClickListener(new EditTextActivity.4(this));
  }

  protected void toggleEmojis(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.smileysLL.setVisibility(0);
      Animation localAnimation2 = AnimationUtils.loadAnimation(this, 2130968588);
      this.smileysLL.startAnimation(localAnimation2);
      ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(et.getWindowToken(), 0);
      return;
    }
    Animation localAnimation1 = AnimationUtils.loadAnimation(this, 2130968583);
    this.smileysLL.startAnimation(localAnimation1);
    this.smileysLL.setVisibility(8);
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.EditTextActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
