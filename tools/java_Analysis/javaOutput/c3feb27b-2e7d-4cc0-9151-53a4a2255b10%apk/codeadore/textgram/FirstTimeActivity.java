package codeadore.textgram;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class FirstTimeActivity extends Activity
{
  String TAG = "FirstTimeActivity";
  boolean fbClicked = false;
  boolean igClicked = false;
  TextView tvTitle;
  boolean twClicked = false;

  public FirstTimeActivity()
  {
  }

  public void checkIfDone()
  {
    if ((this.fbClicked) && (this.twClicked) && (this.igClicked));
    try
    {
      finish();
      return;
    }
    catch (Exception localException)
    {
      Log.e(this.TAG, "in checkIfDone(): " + localException.toString());
    }
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    Rect localRect = new Rect();
    getWindow().getDecorView().getHitRect(localRect);
    if (!localRect.contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
      return false;
    return super.dispatchTouchEvent(paramMotionEvent);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(2130903080);
    Button localButton1 = (Button)findViewById(2131099788);
    Button localButton2 = (Button)findViewById(2131099789);
    Button localButton3 = (Button)findViewById(2131099790);
    localButton1.setOnClickListener(new FirstTimeActivity.1(this));
    localButton2.setOnClickListener(new FirstTimeActivity.2(this));
    localButton3.setOnClickListener(new FirstTimeActivity.3(this));
    ((Button)findViewById(2131099791)).setOnClickListener(new FirstTimeActivity.4(this));
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.FirstTimeActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
