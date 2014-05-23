package com.spotify.mobile.android.spotlets.search.d;

import android.content.Context;
import com.spotify.mobile.android.spotlets.search.loader.SearchLoader.SearchType;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.ResultType;
import com.spotify.mobile.android.util.Assertion;

public final class e
{
  public static int a(SearchResults.ResultType paramResultType)
  {
    switch (e.1.b[paramResultType.ordinal()])
    {
    default:
      Assertion.a("Unrecognized type: " + paramResultType);
      return -2147483648;
    case 1:
      return 1;
    case 2:
      return 2;
    case 3:
      return 3;
    case 4:
      return 4;
    case 5:
    }
    return 5;
  }

  public static String a(Context paramContext, SearchLoader.SearchType paramSearchType, String paramString)
  {
    int i;
    Object[] arrayOfObject;
    switch (e.1.a[paramSearchType.ordinal()])
    {
    default:
      i = 0;
      if (i == 0)
        break label119;
      arrayOfObject = new Object[1];
      if (paramString == null);
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    }
    while (true)
    {
      arrayOfObject[0] = paramString;
      return paramContext.getString(i, arrayOfObject);
      i = 2131690194;
      break;
      i = 2131689821;
      break;
      i = 2131689819;
      break;
      i = 2131689827;
      break;
      i = 2131689823;
      break;
      i = 2131689825;
      break;
      paramString = "";
    }
    label119: Assertion.a("Could not find title resource");
    return "";
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.d.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
