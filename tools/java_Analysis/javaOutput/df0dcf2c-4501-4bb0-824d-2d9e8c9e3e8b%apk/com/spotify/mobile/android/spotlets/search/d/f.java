package com.spotify.mobile.android.spotlets.search.d;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.google.common.base.i;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class f
{
  private final Map<String, SpannableString> a = new HashMap();
  private final StyleSpan b;
  private final Locale c;
  private a d;
  private String e;
  private boolean f;

  public f(StyleSpan paramStyleSpan)
  {
    this.b = ((StyleSpan)i.a(paramStyleSpan));
    this.c = Locale.getDefault();
    this.d = new a(this.c);
  }

  public final void a(String paramString)
  {
    String str;
    if (TextUtils.isEmpty(paramString))
    {
      str = "";
      if (!TextUtils.equals(this.e, str))
      {
        this.a.clear();
        this.e = str;
        this.d.a(this.e);
        if (this.e.isEmpty())
          break label82;
      }
    }
    label82: for (boolean bool = true; ; bool = false)
    {
      this.f = bool;
      return;
      str = Normalizer.normalize(paramString, Normalizer.Form.NFC).toLowerCase(this.c);
      break;
    }
  }

  public final CharSequence b(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return paramString;
    Object localObject = (SpannableString)this.a.get(paramString);
    if (localObject == null)
    {
      SpannableString localSpannableString = new SpannableString(Normalizer.normalize(paramString, Normalizer.Form.NFC));
      if (this.f)
      {
        Iterator localIterator = this.d.b(localSpannableString.toString()).iterator();
        while (localIterator.hasNext())
        {
          int[] arrayOfInt = (int[])localIterator.next();
          localSpannableString.setSpan(StyleSpan.wrap(this.b), arrayOfInt[0], arrayOfInt[1], 33);
        }
      }
      this.a.put(paramString, localSpannableString);
      localObject = localSpannableString;
    }
    return localObject;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.d.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
