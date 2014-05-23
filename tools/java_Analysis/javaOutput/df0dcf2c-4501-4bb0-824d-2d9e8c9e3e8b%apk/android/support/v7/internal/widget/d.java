package android.support.v7.internal.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public class d extends DataSetObservable
{
  private static final String a = d.class.getSimpleName();
  private static final Object b = new Object();
  private static final Map<String, d> c = new HashMap();
  private final Object d;
  private final List<e> e;
  private final List<g> f;
  private final Context g;
  private final String h;
  private Intent i;
  private f j;
  private int k;
  private boolean l;
  private boolean m;
  private boolean n;
  private boolean o;
  private h p;

  private boolean a(g paramg)
  {
    boolean bool = this.f.add(paramg);
    if (bool)
    {
      this.n = true;
      g();
      if (!this.m)
        throw new IllegalStateException("No preceding call to #readHistoricalData");
      if (this.n)
      {
        this.n = false;
        if (!TextUtils.isEmpty(this.h))
        {
          if (Build.VERSION.SDK_INT < 11)
            break label137;
          i locali1 = new i(this, (byte)0);
          Executor localExecutor = AsyncTask.SERIAL_EXECUTOR;
          Object[] arrayOfObject1 = new Object[2];
          arrayOfObject1[0] = new ArrayList(this.f);
          arrayOfObject1[1] = this.h;
          locali1.executeOnExecutor(localExecutor, arrayOfObject1);
        }
      }
    }
    while (true)
    {
      f();
      notifyChanged();
      return bool;
      label137: i locali2 = new i(this, (byte)0);
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = new ArrayList(this.f);
      arrayOfObject2[1] = this.h;
      locali2.execute(arrayOfObject2);
    }
  }

  private void e()
  {
    boolean bool = true;
    int i1;
    if ((this.o) && (this.i != null))
    {
      this.o = false;
      this.e.clear();
      List localList = this.g.getPackageManager().queryIntentActivities(this.i, 0);
      int i3 = localList.size();
      for (int i4 = 0; i4 < i3; i4++)
      {
        ResolveInfo localResolveInfo = (ResolveInfo)localList.get(i4);
        this.e.add(new e(this, localResolveInfo));
      }
      i1 = bool;
      if ((!this.l) || (!this.n) || (TextUtils.isEmpty(this.h)))
        break label173;
      this.l = false;
      this.m = bool;
      h();
    }
    while (true)
    {
      int i2 = i1 | bool;
      g();
      if (i2 != 0)
      {
        f();
        notifyChanged();
      }
      return;
      i1 = 0;
      break;
      label173: bool = false;
    }
  }

  private boolean f()
  {
    if ((this.j != null) && (this.i != null) && (!this.e.isEmpty()) && (!this.f.isEmpty()))
    {
      Collections.unmodifiableList(this.f);
      return true;
    }
    return false;
  }

  private void g()
  {
    int i1 = this.f.size() - this.k;
    if (i1 <= 0);
    while (true)
    {
      return;
      this.n = true;
      for (int i2 = 0; i2 < i1; i2++)
        this.f.remove(0);
    }
  }

  // ERROR //
  private void h()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 58	android/support/v7/internal/widget/d:g	Landroid/content/Context;
    //   4: aload_0
    //   5: getfield 82	android/support/v7/internal/widget/d:h	Ljava/lang/String;
    //   8: invokevirtual 190	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   11: astore_2
    //   12: invokestatic 196	android/util/Xml:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
    //   15: astore 11
    //   17: aload 11
    //   19: aload_2
    //   20: aconst_null
    //   21: invokeinterface 202 3 0
    //   26: iconst_0
    //   27: istore 12
    //   29: iload 12
    //   31: iconst_1
    //   32: if_icmpeq +21 -> 53
    //   35: iload 12
    //   37: iconst_2
    //   38: if_icmpeq +15 -> 53
    //   41: aload 11
    //   43: invokeinterface 205 1 0
    //   48: istore 12
    //   50: goto -21 -> 29
    //   53: ldc 207
    //   55: aload 11
    //   57: invokeinterface 210 1 0
    //   62: invokevirtual 215	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   65: ifne +52 -> 117
    //   68: new 184	org/xmlpull/v1/XmlPullParserException
    //   71: dup
    //   72: ldc 217
    //   74: invokespecial 218	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   77: athrow
    //   78: astore 8
    //   80: getstatic 43	android/support/v7/internal/widget/d:a	Ljava/lang/String;
    //   83: new 220	java/lang/StringBuilder
    //   86: dup
    //   87: ldc 222
    //   89: invokespecial 223	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   92: aload_0
    //   93: getfield 82	android/support/v7/internal/widget/d:h	Ljava/lang/String;
    //   96: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: invokevirtual 230	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   102: aload 8
    //   104: invokestatic 235	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   107: pop
    //   108: aload_2
    //   109: ifnull +7 -> 116
    //   112: aload_2
    //   113: invokevirtual 240	java/io/FileInputStream:close	()V
    //   116: return
    //   117: aload_0
    //   118: getfield 61	android/support/v7/internal/widget/d:f	Ljava/util/List;
    //   121: astore 13
    //   123: aload 13
    //   125: invokeinterface 136 1 0
    //   130: aload 11
    //   132: invokeinterface 205 1 0
    //   137: istore 14
    //   139: iload 14
    //   141: iconst_1
    //   142: if_icmpeq +148 -> 290
    //   145: iload 14
    //   147: iconst_3
    //   148: if_icmpeq -18 -> 130
    //   151: iload 14
    //   153: iconst_4
    //   154: if_icmpeq -24 -> 130
    //   157: ldc 242
    //   159: aload 11
    //   161: invokeinterface 210 1 0
    //   166: invokevirtual 215	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   169: ifne +55 -> 224
    //   172: new 184	org/xmlpull/v1/XmlPullParserException
    //   175: dup
    //   176: ldc 244
    //   178: invokespecial 218	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   181: athrow
    //   182: astore 5
    //   184: getstatic 43	android/support/v7/internal/widget/d:a	Ljava/lang/String;
    //   187: new 220	java/lang/StringBuilder
    //   190: dup
    //   191: ldc 222
    //   193: invokespecial 223	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   196: aload_0
    //   197: getfield 82	android/support/v7/internal/widget/d:h	Ljava/lang/String;
    //   200: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   203: invokevirtual 230	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   206: aload 5
    //   208: invokestatic 235	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   211: pop
    //   212: aload_2
    //   213: ifnull -97 -> 116
    //   216: aload_2
    //   217: invokevirtual 240	java/io/FileInputStream:close	()V
    //   220: return
    //   221: astore 7
    //   223: return
    //   224: aload 13
    //   226: new 246	android/support/v7/internal/widget/g
    //   229: dup
    //   230: aload 11
    //   232: aconst_null
    //   233: ldc 248
    //   235: invokeinterface 252 3 0
    //   240: aload 11
    //   242: aconst_null
    //   243: ldc 254
    //   245: invokeinterface 252 3 0
    //   250: invokestatic 260	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   253: aload 11
    //   255: aconst_null
    //   256: ldc_w 262
    //   259: invokeinterface 252 3 0
    //   264: invokestatic 268	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   267: invokespecial 271	android/support/v7/internal/widget/g:<init>	(Ljava/lang/String;JF)V
    //   270: invokeinterface 67 2 0
    //   275: pop
    //   276: goto -146 -> 130
    //   279: astore_3
    //   280: aload_2
    //   281: ifnull +7 -> 288
    //   284: aload_2
    //   285: invokevirtual 240	java/io/FileInputStream:close	()V
    //   288: aload_3
    //   289: athrow
    //   290: aload_2
    //   291: ifnull -175 -> 116
    //   294: aload_2
    //   295: invokevirtual 240	java/io/FileInputStream:close	()V
    //   298: return
    //   299: astore 15
    //   301: return
    //   302: astore 10
    //   304: return
    //   305: astore 4
    //   307: goto -19 -> 288
    //   310: astore_1
    //   311: return
    //
    // Exception table:
    //   from	to	target	type
    //   12	26	78	org/xmlpull/v1/XmlPullParserException
    //   41	50	78	org/xmlpull/v1/XmlPullParserException
    //   53	78	78	org/xmlpull/v1/XmlPullParserException
    //   117	130	78	org/xmlpull/v1/XmlPullParserException
    //   130	139	78	org/xmlpull/v1/XmlPullParserException
    //   157	182	78	org/xmlpull/v1/XmlPullParserException
    //   224	276	78	org/xmlpull/v1/XmlPullParserException
    //   12	26	182	java/io/IOException
    //   41	50	182	java/io/IOException
    //   53	78	182	java/io/IOException
    //   117	130	182	java/io/IOException
    //   130	139	182	java/io/IOException
    //   157	182	182	java/io/IOException
    //   224	276	182	java/io/IOException
    //   216	220	221	java/io/IOException
    //   12	26	279	finally
    //   41	50	279	finally
    //   53	78	279	finally
    //   80	108	279	finally
    //   117	130	279	finally
    //   130	139	279	finally
    //   157	182	279	finally
    //   184	212	279	finally
    //   224	276	279	finally
    //   294	298	299	java/io/IOException
    //   112	116	302	java/io/IOException
    //   284	288	305	java/io/IOException
    //   0	12	310	java/io/FileNotFoundException
  }

  public final int a()
  {
    synchronized (this.d)
    {
      e();
      int i1 = this.e.size();
      return i1;
    }
  }

  public final int a(ResolveInfo paramResolveInfo)
  {
    synchronized (this.d)
    {
      e();
      List localList = this.e;
      int i1 = localList.size();
      for (int i2 = 0; i2 < i1; i2++)
        if (((e)localList.get(i2)).a == paramResolveInfo)
          return i2;
      return -1;
    }
  }

  public final ResolveInfo a(int paramInt)
  {
    synchronized (this.d)
    {
      e();
      ResolveInfo localResolveInfo = ((e)this.e.get(paramInt)).a;
      return localResolveInfo;
    }
  }

  public final Intent b(int paramInt)
  {
    synchronized (this.d)
    {
      if (this.i == null)
        return null;
      e();
      e locale = (e)this.e.get(paramInt);
      ComponentName localComponentName = new ComponentName(locale.a.activityInfo.packageName, locale.a.activityInfo.name);
      Intent localIntent = new Intent(this.i);
      localIntent.setComponent(localComponentName);
      if (this.p != null)
      {
        new Intent(localIntent);
        if (this.p.a())
          return null;
      }
      a(new g(localComponentName, System.currentTimeMillis(), 1.0F));
      return localIntent;
    }
  }

  public final ResolveInfo b()
  {
    synchronized (this.d)
    {
      e();
      if (!this.e.isEmpty())
      {
        ResolveInfo localResolveInfo = ((e)this.e.get(0)).a;
        return localResolveInfo;
      }
      return null;
    }
  }

  public final int c()
  {
    synchronized (this.d)
    {
      e();
      int i1 = this.f.size();
      return i1;
    }
  }

  public final void c(int paramInt)
  {
    synchronized (this.d)
    {
      e();
      e locale1 = (e)this.e.get(paramInt);
      e locale2 = (e)this.e.get(0);
      if (locale2 != null)
      {
        f1 = 5.0F + (locale2.b - locale1.b);
        a(new g(new ComponentName(locale1.a.activityInfo.packageName, locale1.a.activityInfo.name), System.currentTimeMillis(), f1));
        return;
      }
      float f1 = 1.0F;
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
