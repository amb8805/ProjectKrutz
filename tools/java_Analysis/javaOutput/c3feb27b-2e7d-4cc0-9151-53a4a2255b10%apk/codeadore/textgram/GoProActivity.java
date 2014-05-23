package codeadore.textgram;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.apps.analytics.GoogleAnalyticsTracker;

public class GoProActivity extends el7rActivity
{
  String TAG = "GoProActivity";
  Button fullversionBtn;
  Button goProBtn;
  Handler handler = new Handler();
  Button removeadsBtn;
  Button removewatermarkBtn;
  SharedPreferences settings;

  public GoProActivity()
  {
  }

  public void applyUpgrade(String paramString1, String paramString2, String paramString3)
  {
    SharedPreferences.Editor localEditor = this.settings.edit();
    label59: label84: label101: String str;
    if (paramString1 != null)
    {
      if (paramString1.contains("true"))
        localEditor.putBoolean("removeAds", true);
    }
    else
    {
      if (paramString2 != null)
      {
        if (!paramString2.contains("true"))
          break label185;
        localEditor.putBoolean("removeWatermark", true);
      }
      localEditor.commit();
      if (!paramString1.contains("true"))
        break label208;
      this.removeadsBtn.setEnabled(false);
      if (!paramString2.contains("true"))
        break label219;
      this.removewatermarkBtn.setEnabled(false);
      if ((paramString1.contains("true")) && (paramString2.contains("true")))
      {
        this.removeadsBtn.setEnabled(false);
        this.removewatermarkBtn.setEnabled(false);
      }
      str = "";
      if (paramString3 != "promotion_code")
        break label230;
      str = getString(2131427416);
    }
    while (true)
    {
      el7rUtilities.messageBox(str, "done", this);
      return;
      if (!paramString1.contains("false"))
        break;
      localEditor.putBoolean("removeAds", false);
      break;
      label185: if (!paramString2.contains("false"))
        break label59;
      localEditor.putBoolean("removeWatermark", false);
      break label59;
      label208: this.removeadsBtn.setEnabled(true);
      break label84;
      label219: this.removewatermarkBtn.setEnabled(true);
      break label101;
      label230: if (paramString3 == "purchase")
        str = getString(2131427417);
    }
  }

  public void onBackPressed()
  {
    super.onBackPressed();
    overridePendingTransition(2130968589, 2130968583);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    overridePendingTransition(2130968588, 2130968582);
    setContentView(2130903068);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    this.settings = getSharedPreferences("TextgramSettings", 0);
    setTitle(getString(2131427412));
    getWindow().setSoftInputMode(3);
    AdUtilities.installAd(this, findViewById(2131099722));
    this.tracker.trackPageView("/GoProActivity");
    this.fullversionBtn = ((Button)findViewById(2131099724));
    this.removeadsBtn = ((Button)findViewById(2131099725));
    this.removewatermarkBtn = ((Button)findViewById(2131099726));
    this.goProBtn = ((Button)findViewById(2131099727));
    this.goProBtn.setOnClickListener(new GoProActivity.1(this));
    if (this.settings.getBoolean("fullVersion", false))
      this.fullversionBtn.setEnabled(false);
    if (this.settings.getBoolean("removeAds", false))
      this.removeadsBtn.setEnabled(false);
    if (this.settings.getBoolean("removeWatermark", false))
      this.removewatermarkBtn.setEnabled(false);
    if ((this.settings.getBoolean("removeAds", false)) && (this.settings.getBoolean("removeWatermark", false)))
    {
      this.fullversionBtn.setEnabled(false);
      this.removeadsBtn.setEnabled(false);
      this.removewatermarkBtn.setEnabled(false);
    }
    EditText localEditText = (EditText)findViewById(2131099728);
    ((Button)findViewById(2131099729)).setOnClickListener(new GoProActivity.2(this, localEditText));
  }

  public void onDestroy()
  {
    super.onDestroy();
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.GoProActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
