package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.mixpanel.android.surveys.SurveyActivity;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

public class SurveyState
  implements Parcelable
{
  public static final Parcelable.Creator<SurveyState> CREATOR;
  private static final Object h;
  private static long i;
  private static SurveyState j;
  private static int k;
  private static long l;
  private static int m;
  private final Survey b;
  private final String c;
  private final String d;
  private final SurveyState.AnswerMap e;
  private final Bitmap f;
  private final int g;

  static
  {
    if (!SurveyState.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      a = bool;
      CREATOR = new SurveyState.1();
      h = new Object();
      i = -1L;
      j = null;
      k = 0;
      l = -1L;
      m = -1;
      return;
    }
  }

  private SurveyState(Bundle paramBundle)
  {
    this.c = paramBundle.getString("com.mixpanel.android.mpmetrics.SurveyState.DISTINCT_ID_BUNDLE_KEY");
    this.d = paramBundle.getString("com.mixpanel.android.mpmetrics.SurveyState.TOKEN_BUNDLE_KEY");
    this.g = paramBundle.getInt("com.mixpanel.android.mpmetrics.SurveyState.HIGHLIGHT_COLOR_BUNDLE_KEY");
    this.e = ((SurveyState.AnswerMap)paramBundle.getParcelable("com.mixpanel.android.mpmetrics.SurveyState.ANSWERS_BUNDLE_KEY"));
    byte[] arrayOfByte = paramBundle.getByteArray("com.mixpanel.android.mpmetrics.SurveyState.BACKGROUND_COMPRESSED_BUNDLE_KEY");
    if (arrayOfByte != null)
    {
      this.f = BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length);
      while (true)
      {
        String str = paramBundle.getString("com.mixpanel.android.mpmetrics.SurveyState.SURVEY_BUNDLE_KEY");
        try
        {
          this.b = new Survey(new JSONObject(str));
          return;
          this.f = null;
        }
        catch (JSONException localJSONException)
        {
          throw new RuntimeException("Survey serialization resulted in a corrupted parcel");
        }
        catch (Survey.BadSurveyException localBadSurveyException)
        {
        }
      }
    }
    throw new RuntimeException("Survey serialization resulted in a corrupted parcel");
  }

  private SurveyState(Survey paramSurvey, String paramString1, String paramString2, Bitmap paramBitmap, int paramInt)
  {
    this.b = paramSurvey;
    this.c = paramString1;
    this.d = paramString2;
    this.e = new SurveyState.AnswerMap();
    this.f = paramBitmap;
    this.g = paramInt;
  }

  public static SurveyState a(SurveyState paramSurveyState, int paramInt)
  {
    if ((!a) && (paramSurveyState != null))
      throw new AssertionError();
    long l1 = System.currentTimeMillis() - l;
    synchronized (h)
    {
      if ((m > 0) && (l1 > 43200000L))
      {
        Log.i("MixpanelAPI SurveyState", "Survey activity claimed but never released lock, possible force quit.");
        m = -1;
      }
      if ((m > 0) && (m != paramInt))
        return null;
      if (paramSurveyState != null)
      {
        m = paramInt;
        j = paramSurveyState;
        return paramSurveyState;
      }
    }
    if (j == null)
      return null;
    m = paramInt;
    SurveyState localSurveyState = j;
    return localSurveyState;
  }

  public static void a(int paramInt)
  {
    synchronized (h)
    {
      if (paramInt == m)
      {
        m = -1;
        j = null;
      }
      return;
    }
  }

  public static void a(Survey paramSurvey, Activity paramActivity, String paramString1, String paramString2, Bitmap paramBitmap, int paramInt)
  {
    if (!i.a(paramActivity.getApplicationContext()))
      return;
    long l1 = System.currentTimeMillis() - i;
    synchronized (h)
    {
      if ((m > 0) && (l1 > 43200000L))
      {
        Log.i("MixpanelAPI SurveyState", "SurveyState set long, long ago, without showing.");
        j = null;
      }
      if (j == null)
      {
        j = new SurveyState(paramSurvey, paramString1, paramString2, paramBitmap, paramInt);
        Intent localIntent = new Intent(paramActivity.getApplicationContext(), SurveyActivity.class);
        localIntent.addFlags(268435456);
        localIntent.addFlags(131072);
        k = 1 + k;
        localIntent.putExtra("intentID", k);
        paramActivity.startActivity(localIntent);
      }
      return;
    }
  }

  public final Survey a()
  {
    return this.b;
  }

  public final String b()
  {
    return this.c;
  }

  public final String c()
  {
    return this.d;
  }

  public final Bitmap d()
  {
    return this.f;
  }

  public int describeContents()
  {
    return 0;
  }

  public final SurveyState.AnswerMap e()
  {
    return this.e;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("com.mixpanel.android.mpmetrics.SurveyState.DISTINCT_ID_BUNDLE_KEY", this.c);
    localBundle.putString("com.mixpanel.android.mpmetrics.SurveyState.TOKEN_BUNDLE_KEY", this.d);
    localBundle.putInt("com.mixpanel.android.mpmetrics.SurveyState.HIGHLIGHT_COLOR_BUNDLE_KEY", this.g);
    localBundle.putParcelable("com.mixpanel.android.mpmetrics.SurveyState.ANSWERS_BUNDLE_KEY", this.e);
    Bitmap localBitmap = this.f;
    byte[] arrayOfByte = null;
    if (localBitmap != null)
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      this.f.compress(Bitmap.CompressFormat.PNG, 20, localByteArrayOutputStream);
      arrayOfByte = localByteArrayOutputStream.toByteArray();
    }
    localBundle.putByteArray("com.mixpanel.android.mpmetrics.SurveyState.BACKGROUND_COMPRESSED_BUNDLE_KEY", arrayOfByte);
    localBundle.putString("com.mixpanel.android.mpmetrics.SurveyState.SURVEY_BUNDLE_KEY", this.b.a());
    paramParcel.writeBundle(localBundle);
  }
}

/* Location:
 * Qualified Name:     com.mixpanel.android.mpmetrics.SurveyState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
