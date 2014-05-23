package com.spotify.mobile.android.util;

import android.content.Context;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;

public final class ej extends eh
{
  private final ei a;

  public ej(Context paramContext, String paramString1, String paramString2, Calendar paramCalendar, ei paramei)
  {
    this(paramString1, paramString2, paramCalendar, paramei, m.a(paramContext.getString(2131690408)));
  }

  private ej(String paramString1, String paramString2, Calendar paramCalendar, ei paramei, be parambe)
  {
    super(paramString1, paramString2, paramCalendar, paramei, parambe, (byte)0);
    this.a = ((ei)cc.a(paramei));
  }

  protected final void a(ArrayList<String> paramArrayList, Map<String, String> paramMap)
  {
    this.a.a(paramArrayList, paramMap);
  }

  protected final void a(ArrayList<String> paramArrayList, boolean paramBoolean)
  {
    this.a.a(paramArrayList, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.ej
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
