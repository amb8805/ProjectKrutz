package android.support.v7.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v4.widget.l;
import android.support.v7.a.c;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

final class e extends l
  implements View.OnClickListener
{
  private SearchView j;
  private SearchableInfo k;
  private Context l;
  private WeakHashMap<String, Drawable.ConstantState> m;
  private boolean n;
  private int o;
  private ColorStateList p;
  private int q;
  private int r;
  private int s;
  private int t;
  private int u;
  private int v;

  private Drawable a(ComponentName paramComponentName)
  {
    PackageManager localPackageManager = this.d.getPackageManager();
    ActivityInfo localActivityInfo;
    try
    {
      localActivityInfo = localPackageManager.getActivityInfo(paramComponentName, 128);
      i = localActivityInfo.getIconResource();
      if (i == 0)
        return null;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Log.w("SuggestionsAdapter", localNameNotFoundException.toString());
      return null;
    }
    int i;
    Drawable localDrawable = localPackageManager.getDrawable(paramComponentName.getPackageName(), i, localActivityInfo.applicationInfo);
    if (localDrawable == null)
    {
      Log.w("SuggestionsAdapter", "Invalid icon resource " + i + " for " + paramComponentName.flattenToShortString());
      return null;
    }
    return localDrawable;
  }

  // ERROR //
  private Drawable a(Uri paramUri)
  {
    // Byte code:
    //   0: ldc 107
    //   2: aload_1
    //   3: invokevirtual 112	android/net/Uri:getScheme	()Ljava/lang/String;
    //   6: invokevirtual 118	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   9: istore 4
    //   11: iload 4
    //   13: ifeq +76 -> 89
    //   16: aload_0
    //   17: aload_1
    //   18: invokespecial 121	android/support/v7/widget/e:b	(Landroid/net/Uri;)Landroid/graphics/drawable/Drawable;
    //   21: astore 13
    //   23: aload 13
    //   25: areturn
    //   26: astore 12
    //   28: new 101	java/io/FileNotFoundException
    //   31: dup
    //   32: new 79	java/lang/StringBuilder
    //   35: dup
    //   36: ldc 123
    //   38: invokespecial 85	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   41: aload_1
    //   42: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   45: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   48: invokespecial 127	java/io/FileNotFoundException:<init>	(Ljava/lang/String;)V
    //   51: athrow
    //   52: astore_2
    //   53: ldc 54
    //   55: new 79	java/lang/StringBuilder
    //   58: dup
    //   59: ldc 129
    //   61: invokespecial 85	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   64: aload_1
    //   65: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   68: ldc 131
    //   70: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: aload_2
    //   74: invokevirtual 134	java/io/FileNotFoundException:getMessage	()Ljava/lang/String;
    //   77: invokevirtual 94	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   83: invokestatic 64	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   86: pop
    //   87: aconst_null
    //   88: areturn
    //   89: aload_0
    //   90: getfield 136	android/support/v7/widget/e:l	Landroid/content/Context;
    //   93: invokevirtual 140	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   96: aload_1
    //   97: invokevirtual 146	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   100: astore 5
    //   102: aload 5
    //   104: ifnonnull +27 -> 131
    //   107: new 101	java/io/FileNotFoundException
    //   110: dup
    //   111: new 79	java/lang/StringBuilder
    //   114: dup
    //   115: ldc 148
    //   117: invokespecial 85	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   120: aload_1
    //   121: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   124: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   127: invokespecial 127	java/io/FileNotFoundException:<init>	(Ljava/lang/String;)V
    //   130: athrow
    //   131: aload 5
    //   133: aconst_null
    //   134: invokestatic 154	android/graphics/drawable/Drawable:createFromStream	(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    //   137: astore 9
    //   139: aload 5
    //   141: invokevirtual 160	java/io/InputStream:close	()V
    //   144: aload 9
    //   146: areturn
    //   147: astore 10
    //   149: ldc 54
    //   151: new 79	java/lang/StringBuilder
    //   154: dup
    //   155: ldc 162
    //   157: invokespecial 85	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   160: aload_1
    //   161: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   164: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   167: aload 10
    //   169: invokestatic 166	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   172: pop
    //   173: aload 9
    //   175: areturn
    //   176: astore 6
    //   178: aload 5
    //   180: invokevirtual 160	java/io/InputStream:close	()V
    //   183: aload 6
    //   185: athrow
    //   186: astore 7
    //   188: ldc 54
    //   190: new 79	java/lang/StringBuilder
    //   193: dup
    //   194: ldc 162
    //   196: invokespecial 85	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   199: aload_1
    //   200: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   203: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   206: aload 7
    //   208: invokestatic 166	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   211: pop
    //   212: goto -29 -> 183
    //
    // Exception table:
    //   from	to	target	type
    //   16	23	26	android/content/res/Resources$NotFoundException
    //   0	11	52	java/io/FileNotFoundException
    //   16	23	52	java/io/FileNotFoundException
    //   28	52	52	java/io/FileNotFoundException
    //   89	102	52	java/io/FileNotFoundException
    //   107	131	52	java/io/FileNotFoundException
    //   139	144	52	java/io/FileNotFoundException
    //   149	173	52	java/io/FileNotFoundException
    //   178	183	52	java/io/FileNotFoundException
    //   183	186	52	java/io/FileNotFoundException
    //   188	212	52	java/io/FileNotFoundException
    //   139	144	147	java/io/IOException
    //   131	139	176	finally
    //   178	183	186	java/io/IOException
  }

  private Drawable a(String paramString)
  {
    Drawable localDrawable1;
    if ((paramString == null) || (paramString.length() == 0) || ("0".equals(paramString)))
      localDrawable1 = null;
    while (true)
    {
      return localDrawable1;
      try
      {
        int i = Integer.parseInt(paramString);
        String str = "android.resource://" + this.l.getPackageName() + "/" + i;
        localDrawable1 = b(str);
        if (localDrawable1 == null)
        {
          Drawable localDrawable3 = this.l.getResources().getDrawable(i);
          a(str, localDrawable3);
          return localDrawable3;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        localDrawable1 = b(paramString);
        if (localDrawable1 == null)
        {
          Drawable localDrawable2 = a(Uri.parse(paramString));
          a(paramString, localDrawable2);
          return localDrawable2;
        }
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        Log.w("SuggestionsAdapter", "Icon resource not found: " + paramString);
      }
    }
    return null;
  }

  private static String a(Cursor paramCursor, int paramInt)
  {
    if (paramInt == -1)
      return null;
    try
    {
      String str = paramCursor.getString(paramInt);
      return str;
    }
    catch (Exception localException)
    {
      Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", localException);
    }
    return null;
  }

  public static String a(Cursor paramCursor, String paramString)
  {
    return a(paramCursor, paramCursor.getColumnIndex(paramString));
  }

  private static void a(ImageView paramImageView, Drawable paramDrawable, int paramInt)
  {
    paramImageView.setImageDrawable(paramDrawable);
    if (paramDrawable == null)
    {
      paramImageView.setVisibility(paramInt);
      return;
    }
    paramImageView.setVisibility(0);
    paramDrawable.setVisible(false, false);
    paramDrawable.setVisible(true, false);
  }

  private static void a(TextView paramTextView, CharSequence paramCharSequence)
  {
    paramTextView.setText(paramCharSequence);
    if (TextUtils.isEmpty(paramCharSequence))
    {
      paramTextView.setVisibility(8);
      return;
    }
    paramTextView.setVisibility(0);
  }

  private void a(String paramString, Drawable paramDrawable)
  {
    if (paramDrawable != null)
      this.m.put(paramString, paramDrawable.getConstantState());
  }

  private Drawable b(Uri paramUri)
  {
    String str = paramUri.getAuthority();
    if (TextUtils.isEmpty(str))
      throw new FileNotFoundException("No authority: " + paramUri);
    Resources localResources;
    try
    {
      localResources = this.d.getPackageManager().getResourcesForApplication(str);
      localList = paramUri.getPathSegments();
      if (localList == null)
        throw new FileNotFoundException("No path: " + paramUri);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new FileNotFoundException("No package found for authority: " + paramUri);
    }
    List localList;
    int i = localList.size();
    int i1;
    if (i == 1)
    {
      try
      {
        int i2 = Integer.parseInt((String)localList.get(0));
        i1 = i2;
        if (i1 != 0)
          break label268;
        throw new FileNotFoundException("No resource found for: " + paramUri);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw new FileNotFoundException("Single path segment is not a resource ID: " + paramUri);
      }
    }
    else
    {
      while (i == 2)
        i1 = localResources.getIdentifier((String)localList.get(1), (String)localList.get(0), str);
      throw new FileNotFoundException("More than two path segments: " + paramUri);
    }
    label268: return localResources.getDrawable(i1);
  }

  private Drawable b(String paramString)
  {
    Drawable.ConstantState localConstantState = (Drawable.ConstantState)this.m.get(paramString);
    if (localConstantState == null)
      return null;
    return localConstantState.newDrawable();
  }

  private static void d(Cursor paramCursor)
  {
    if (paramCursor != null);
    for (Bundle localBundle = paramCursor.getExtras(); ; localBundle = null)
    {
      if ((localBundle != null) && (localBundle.getBoolean("in_progress")));
      return;
    }
  }

  public final Cursor a(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null);
    for (String str1 = ""; (this.j.getVisibility() != 0) || (this.j.getWindowVisibility() != 0); str1 = paramCharSequence.toString())
      return null;
    SearchableInfo localSearchableInfo;
    try
    {
      localSearchableInfo = this.k;
      if (localSearchableInfo == null)
      {
        localCursor = null;
        if (localCursor != null)
        {
          localCursor.getCount();
          return localCursor;
        }
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", localRuntimeException);
    }
    Cursor localCursor;
    String str2;
    while (true)
    {
      return null;
      str2 = localSearchableInfo.getSuggestAuthority();
      if (str2 != null)
        break;
      localCursor = null;
    }
    Uri.Builder localBuilder = new Uri.Builder().scheme("content").authority(str2).query("").fragment("");
    String str3 = localSearchableInfo.getSuggestPath();
    if (str3 != null)
      localBuilder.appendEncodedPath(str3);
    localBuilder.appendPath("search_suggest_query");
    String str4 = localSearchableInfo.getSuggestSelection();
    if (str4 != null);
    for (String[] arrayOfString = { str1 }; ; arrayOfString = null)
    {
      localBuilder.appendQueryParameter("limit", "50");
      Uri localUri = localBuilder.build();
      localCursor = this.d.getContentResolver().query(localUri, null, str4, arrayOfString, null);
      break;
      localBuilder.appendPath(str1);
    }
  }

  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    View localView = super.a(paramContext, paramCursor, paramViewGroup);
    localView.setTag(new f(localView));
    return localView;
  }

  public final void a(Cursor paramCursor)
  {
    if (this.n)
    {
      Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
      if (paramCursor != null)
        paramCursor.close();
    }
    while (true)
    {
      return;
      try
      {
        super.a(paramCursor);
        if (paramCursor != null)
        {
          this.q = paramCursor.getColumnIndex("suggest_text_1");
          this.r = paramCursor.getColumnIndex("suggest_text_2");
          this.s = paramCursor.getColumnIndex("suggest_text_2_url");
          this.t = paramCursor.getColumnIndex("suggest_icon_1");
          this.u = paramCursor.getColumnIndex("suggest_icon_2");
          this.v = paramCursor.getColumnIndex("suggest_flags");
          return;
        }
      }
      catch (Exception localException)
      {
        Log.e("SuggestionsAdapter", "error changing cursor and caching columns", localException);
      }
    }
  }

  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    f localf = (f)paramView.getTag();
    if (this.v != -1);
    for (int i = paramCursor.getInt(this.v); ; i = 0)
    {
      if (localf.a != null)
      {
        String str3 = a(paramCursor, this.q);
        a(localf.a, str3);
      }
      Object localObject3;
      label211: Object localObject1;
      label247: ImageView localImageView1;
      if (localf.b != null)
      {
        String str2 = a(paramCursor, this.s);
        if (str2 != null)
        {
          if (this.p == null)
          {
            TypedValue localTypedValue = new TypedValue();
            this.d.getTheme().resolveAttribute(c.m, localTypedValue, true);
            this.p = this.d.getResources().getColorStateList(localTypedValue.resourceId);
          }
          SpannableString localSpannableString = new SpannableString(str2);
          localSpannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.p, null), 0, str2.length(), 33);
          localObject3 = localSpannableString;
          if (!TextUtils.isEmpty((CharSequence)localObject3))
            break label361;
          if (localf.a != null)
          {
            localf.a.setSingleLine(false);
            localf.a.setMaxLines(2);
          }
          a(localf.b, (CharSequence)localObject3);
        }
      }
      else
      {
        if (localf.c != null)
        {
          ImageView localImageView2 = localf.c;
          if (this.t != -1)
            break label390;
          localObject1 = null;
          a(localImageView2, (Drawable)localObject1, 4);
        }
        if (localf.d != null)
        {
          localImageView1 = localf.d;
          if (this.u != -1)
            break label543;
        }
      }
      label390: label531: label543: for (Drawable localDrawable1 = null; ; localDrawable1 = a(paramCursor.getString(this.u)))
      {
        a(localImageView1, localDrawable1, 8);
        if ((this.o != 2) && ((this.o != 1) || ((i & 0x1) == 0)))
          break label562;
        localf.e.setVisibility(0);
        localf.e.setTag(localf.a.getText());
        localf.e.setOnClickListener(this);
        return;
        localObject3 = a(paramCursor, this.r);
        break;
        label361: if (localf.a == null)
          break label211;
        localf.a.setSingleLine(true);
        localf.a.setMaxLines(1);
        break label211;
        localObject1 = a(paramCursor.getString(this.t));
        if (localObject1 != null)
          break label247;
        ComponentName localComponentName = this.k.getSearchActivity();
        String str1 = localComponentName.flattenToShortString();
        if (this.m.containsKey(str1))
        {
          Drawable.ConstantState localConstantState = (Drawable.ConstantState)this.m.get(str1);
          if (localConstantState == null);
          for (localObject1 = null; ; localObject1 = localConstantState.newDrawable(this.l.getResources()))
          {
            label461: if (localObject1 != null)
              break label531;
            localObject1 = this.d.getPackageManager().getDefaultActivityIcon();
            break;
          }
        }
        Drawable localDrawable2 = a(localComponentName);
        if (localDrawable2 == null);
        for (Object localObject2 = null; ; localObject2 = localDrawable2.getConstantState())
        {
          this.m.put(str1, localObject2);
          localObject1 = localDrawable2;
          break label461;
          break;
        }
      }
      label562: localf.e.setVisibility(8);
      return;
    }
  }

  public final CharSequence c(Cursor paramCursor)
  {
    if (paramCursor == null);
    String str2;
    do
    {
      do
      {
        return null;
        String str1 = a(paramCursor, "suggest_intent_query");
        if (str1 != null)
          return str1;
        if (this.k.shouldRewriteQueryFromData())
        {
          String str3 = a(paramCursor, "suggest_intent_data");
          if (str3 != null)
            return str3;
        }
      }
      while (!this.k.shouldRewriteQueryFromText());
      str2 = a(paramCursor, "suggest_text_1");
    }
    while (str2 == null);
    return str2;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    try
    {
      View localView2 = super.getView(paramInt, paramView, paramViewGroup);
      return localView2;
    }
    catch (RuntimeException localRuntimeException)
    {
      Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", localRuntimeException);
      View localView1 = a(this.d, this.c, paramViewGroup);
      if (localView1 != null)
        ((f)localView1.getTag()).a.setText(localRuntimeException.toString());
      return localView1;
    }
  }

  public final boolean hasStableIds()
  {
    return false;
  }

  public final void notifyDataSetChanged()
  {
    super.notifyDataSetChanged();
    d(a());
  }

  public final void notifyDataSetInvalidated()
  {
    super.notifyDataSetInvalidated();
    d(a());
  }

  public final void onClick(View paramView)
  {
    Object localObject = paramView.getTag();
    if ((localObject instanceof CharSequence))
      this.j.a((CharSequence)localObject);
  }
}

/* Location:
 * Qualified Name:     android.support.v7.widget.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
