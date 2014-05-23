package com.spotify.mobile.android.util;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public abstract class eh
{
  private bh a;
  private be b;

  private eh(String paramString1, String paramString2, Calendar paramCalendar, ek paramek, be parambe)
  {
    this.b = parambe;
    HashMap localHashMap = new HashMap();
    localHashMap.put("email", paramString1);
    localHashMap.put("suggest", "1");
    localHashMap.put("validate", "1");
    if (paramString2 != null)
      localHashMap.put("username", paramString2);
    if (paramCalendar != null)
      localHashMap.put("birthday", ao.a(paramCalendar));
    this.a = new el(this, paramek);
    this.b.b("", localHashMap, this.a);
  }

  protected abstract void a(ArrayList<String> paramArrayList, Map<String, String> paramMap);

  protected abstract void a(ArrayList<String> paramArrayList, boolean paramBoolean);
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.eh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
