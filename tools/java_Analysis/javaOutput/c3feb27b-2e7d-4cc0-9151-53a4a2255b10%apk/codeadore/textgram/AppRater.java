package codeadore.textgram;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Color;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AppRater
{
  private static final String APP_PNAME = "codeadore.textgram";
  private static final String APP_TITLE = "Textgram";
  private static final int DAYS_UNTIL_PROMPT = 0;
  private static final int LAUNCHES_UNTIL_PROMPT = 3;

  public AppRater()
  {
  }

  public static void app_launched(Context paramContext)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("apprater", 0);
    if (localSharedPreferences.getBoolean("dontshowagain", false))
      return;
    SharedPreferences.Editor localEditor = localSharedPreferences.edit();
    long l = 1L + localSharedPreferences.getLong("launch_count", 0L);
    localEditor.putLong("launch_count", l);
    Long localLong = Long.valueOf(localSharedPreferences.getLong("date_firstlaunch", 0L));
    if (localLong.longValue() == 0L)
    {
      localLong = Long.valueOf(System.currentTimeMillis());
      localEditor.putLong("date_firstlaunch", localLong.longValue());
    }
    if ((l >= 3L) && (System.currentTimeMillis() >= 0L + localLong.longValue()))
      showRateDialog(paramContext, localEditor);
    localEditor.commit();
  }

  public static void showRateDialog(Context paramContext, SharedPreferences.Editor paramEditor)
  {
    Dialog localDialog = new Dialog(paramContext);
    localDialog.setTitle("Rate Textgram");
    localDialog.setCancelable(false);
    LinearLayout localLinearLayout1 = new LinearLayout(paramContext);
    localLinearLayout1.setOrientation(1);
    localLinearLayout1.setPadding(5, 5, 5, 5);
    TextView localTextView = new TextView(paramContext);
    localTextView.setText("If you enjoy using Textgram, please take a moment to rate it. Thanks for your support!");
    localTextView.setTextSize(20.0F);
    localTextView.setPadding(4, 4, 4, 10);
    localLinearLayout1.addView(localTextView);
    LinearLayout localLinearLayout2 = new LinearLayout(paramContext);
    localLinearLayout2.setOrientation(0);
    Button localButton1 = new Button(paramContext);
    localButton1.setText("Rate");
    localButton1.setTextColor(Color.parseColor("#989A69"));
    localButton1.setOnClickListener(new AppRater.1(paramContext, localDialog));
    localLinearLayout2.addView(localButton1);
    Button localButton2 = new Button(paramContext);
    localButton2.setText("Later");
    localButton2.setOnClickListener(new AppRater.2(localDialog));
    localLinearLayout2.addView(localButton2);
    Button localButton3 = new Button(paramContext);
    localButton3.setText("No, thanks");
    localButton3.setOnClickListener(new AppRater.3(paramEditor, localDialog));
    localLinearLayout2.addView(localButton3);
    localLinearLayout1.addView(localLinearLayout2);
    localDialog.setContentView(localLinearLayout1);
    localDialog.show();
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.AppRater
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
