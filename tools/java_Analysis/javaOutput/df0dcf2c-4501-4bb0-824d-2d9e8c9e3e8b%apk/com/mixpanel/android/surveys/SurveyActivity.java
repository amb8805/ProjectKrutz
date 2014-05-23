package com.mixpanel.android.surveys;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.mixpanel.android.b;
import com.mixpanel.android.c;
import com.mixpanel.android.mpmetrics.Survey;
import com.mixpanel.android.mpmetrics.Survey.QuestionType;
import com.mixpanel.android.mpmetrics.SurveyState;
import com.mixpanel.android.mpmetrics.SurveyState.AnswerMap;
import com.mixpanel.android.mpmetrics.l;
import com.mixpanel.android.mpmetrics.o;
import com.mixpanel.android.mpmetrics.w;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

public class SurveyActivity extends Activity
{
  private static final int i = Color.argb(255, 90, 90, 90);
  private l a;
  private View b;
  private View c;
  private TextView d;
  private CardCarouselLayout e;
  private SurveyState f;
  private int g = 0;
  private int h = -1;

  public SurveyActivity()
  {
  }

  private void a(int paramInt)
  {
    List localList = this.f.a().d();
    label52: int j;
    w localw;
    String str;
    if ((paramInt == 0) || (localList.size() == 0))
    {
      this.b.setEnabled(false);
      if (paramInt < -1 + localList.size())
        break label172;
      this.c.setEnabled(false);
      j = this.g;
      this.g = paramInt;
      localw = (w)localList.get(paramInt);
      str = this.f.e().a(Integer.valueOf(localw.a()));
      if (j >= paramInt)
        break label183;
    }
    while (true)
    {
      try
      {
        this.e.a(localw, str, CardCarouselLayout.Direction.a);
        if (localList.size() <= 1)
          break label226;
        this.d.setText(paramInt + 1 + " of " + localList.size());
        return;
        this.b.setEnabled(true);
        break;
        this.c.setEnabled(true);
        break label52;
        if (j > paramInt)
        {
          this.e.a(localw, str, CardCarouselLayout.Direction.b);
          continue;
        }
      }
      catch (CardCarouselLayout.UnrecognizedAnswerTypeException localUnrecognizedAnswerTypeException)
      {
        goToNextQuestion();
        return;
      }
      label172: label183: this.e.a(localw, str);
    }
    label226: this.d.setText("");
  }

  private void completeSurvey()
  {
    finish();
  }

  private void goToNextQuestion()
  {
    int j = this.f.a().d().size();
    if (this.g < j - 1)
    {
      a(1 + this.g);
      return;
    }
    completeSurvey();
  }

  private void goToPreviousQuestion()
  {
    if (this.g > 0)
    {
      a(-1 + this.g);
      return;
    }
    completeSurvey();
  }

  public void completeSurvey(View paramView)
  {
    completeSurvey();
  }

  public void goToNextQuestion(View paramView)
  {
    goToNextQuestion();
  }

  public void goToPreviousQuestion(View paramView)
  {
    goToPreviousQuestion();
  }

  public void onBackPressed()
  {
    if (this.g > 0)
    {
      goToPreviousQuestion();
      return;
    }
    super.onBackPressed();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    SurveyState localSurveyState = null;
    if (paramBundle != null)
      localSurveyState = (SurveyState)paramBundle.getParcelable("com.mixpanel.android.surveys.SurveyActivity.SURVEY_STATE_BUNDLE_KEY");
    this.h = getIntent().getIntExtra("intentID", 2147483647);
    this.f = SurveyState.a(localSurveyState, this.h);
    if (this.f == null)
    {
      Log.e("MixpanelAPI", "Survey intent received, but no survey was found.");
      finish();
      return;
    }
    if (paramBundle != null)
      this.g = paramBundle.getInt("com.mixpanel.android.surveys.SurveyActivity.CURRENT_QUESTION_BUNDLE_KEY", 0);
    setContentView(c.a);
    Bitmap localBitmap = this.f.d();
    if (localBitmap == null)
      findViewById(b.a).setBackgroundColor(i);
    Survey localSurvey;
    String str;
    while (true)
    {
      this.b = findViewById(b.c);
      this.c = findViewById(b.b);
      this.d = ((TextView)findViewById(b.e));
      this.e = ((CardCarouselLayout)findViewById(b.f));
      this.e.a(new SurveyActivity.1(this));
      localSurvey = this.f.a();
      str = this.f.b();
      if (str != null)
        break;
      Log.i("MixpanelAPI", "Can't show a survey to a user with no distinct id set");
      finish();
      return;
      getWindow().setBackgroundDrawable(new BitmapDrawable(getResources(), localBitmap));
    }
    this.a = l.a(this, this.f.c());
    o localo = this.a.b().b(str);
    localo.a("$surveys", Integer.valueOf(localSurvey.b()));
    localo.a("$collections", Integer.valueOf(localSurvey.c()));
    this.a.a();
    a(this.g);
  }

  @SuppressLint({"SimpleDateFormat"})
  protected void onDestroy()
  {
    if (this.a != null)
    {
      if (this.f != null)
      {
        Survey localSurvey = this.f.a();
        List localList = localSurvey.d();
        String str1 = this.f.b();
        o localo = this.a.b().b(str1);
        localo.a("$responses", Integer.valueOf(localSurvey.c()));
        SurveyState.AnswerMap localAnswerMap = this.f.e();
        Iterator localIterator = localList.iterator();
        while (localIterator.hasNext())
        {
          w localw = (w)localIterator.next();
          String str2 = localAnswerMap.a(Integer.valueOf(localw.a()));
          if (str2 != null)
            try
            {
              JSONObject localJSONObject = new JSONObject();
              localJSONObject.put("$survey_id", localSurvey.b());
              localJSONObject.put("$collection_id", localSurvey.c());
              localJSONObject.put("$question_id", localw.a());
              localJSONObject.put("$question_type", localw.d().toString());
              SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
              localSimpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
              localJSONObject.put("$time", localSimpleDateFormat.format(new Date()));
              localJSONObject.put("$value", str2);
              localo.a("$answers", localJSONObject);
            }
            catch (JSONException localJSONException)
            {
              Log.e("MixpanelAPI", "Couldn't record user's answer.", localJSONException);
            }
        }
      }
      this.a.a();
    }
    SurveyState.a(this.h);
    super.onDestroy();
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putInt("com.mixpanel.android.surveys.SurveyActivity.CURRENT_QUESTION_BUNDLE_KEY", this.g);
    paramBundle.putParcelable("com.mixpanel.android.surveys.SurveyActivity.SURVEY_STATE_BUNDLE_KEY", this.f);
  }
}

/* Location:
 * Qualified Name:     com.mixpanel.android.surveys.SurveyActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
