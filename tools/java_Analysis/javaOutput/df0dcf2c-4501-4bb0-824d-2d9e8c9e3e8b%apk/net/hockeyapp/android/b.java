package net.hockeyapp.android;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.hockeyapp.android.d.e;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

public final class b
{
  private static String a = null;
  private static String b = null;

  public static void a(Context paramContext, String paramString, c paramc)
  {
    if (paramContext != null)
    {
      b = "https://sdk.hockeyapp.net/";
      a = paramString;
      a.a(paramContext);
      if (a == null)
        a = a.d;
    }
    if ((paramc != null) && (paramc.b()));
    Boolean localBoolean1;
    WeakReference localWeakReference;
    int i;
    for (boolean bool1 = true; ; bool1 = false)
    {
      localBoolean1 = Boolean.valueOf(bool1);
      localWeakReference = new WeakReference(paramContext);
      i = b(localWeakReference);
      if (i != 1)
        break label239;
      Boolean localBoolean2 = Boolean.valueOf(false);
      if (paramc != null)
        localBoolean2 = Boolean.valueOf(false | Boolean.valueOf(localBoolean2.booleanValue() | paramc.e()).booleanValue());
      if (localBoolean2.booleanValue())
        break;
      boolean bool2 = localBoolean1.booleanValue();
      Context localContext = (Context)localWeakReference.get();
      if (localContext != null)
      {
        AlertDialog.Builder localBuilder = new AlertDialog.Builder(localContext);
        localBuilder.setTitle(f.a(paramc, 0));
        localBuilder.setMessage(f.a(paramc, 1));
        localBuilder.setNegativeButton(f.a(paramc, 2), new b.1(paramc, localWeakReference, bool2));
        localBuilder.setPositiveButton(f.a(paramc, 3), new b.2(localWeakReference, paramc, bool2));
        localBuilder.create().show();
      }
      return;
    }
    b(localWeakReference, paramc, localBoolean1.booleanValue());
    return;
    label239: if (i == 2)
    {
      b(localWeakReference, paramc, localBoolean1.booleanValue());
      return;
    }
    b(paramc, localBoolean1.booleanValue());
  }

  public static void a(WeakReference<Context> paramWeakReference)
  {
    String[] arrayOfString = a();
    int i;
    if ((arrayOfString != null) && (arrayOfString.length > 0))
    {
      Log.d("HockeyApp", "Found " + arrayOfString.length + " stacktrace(s).");
      i = 0;
      while (true)
        if (i < arrayOfString.length)
          if (paramWeakReference != null)
            try
            {
              Log.d("HockeyApp", "Delete stacktrace " + arrayOfString[i] + ".");
              a(paramWeakReference, arrayOfString[i]);
              Context localContext = (Context)paramWeakReference.get();
              if (localContext != null)
                localContext.deleteFile(arrayOfString[i]);
              i++;
            }
            catch (Exception localException)
            {
              while (true)
                localException.printStackTrace();
            }
    }
  }

  private static void a(WeakReference<Context> paramWeakReference, String paramString)
  {
    if (paramWeakReference != null)
    {
      Context localContext = (Context)paramWeakReference.get();
      if (localContext != null)
      {
        localContext.deleteFile(paramString);
        localContext.deleteFile(paramString.replace(".stacktrace", ".user"));
        localContext.deleteFile(paramString.replace(".stacktrace", ".contact"));
        localContext.deleteFile(paramString.replace(".stacktrace", ".description"));
      }
    }
  }

  public static void a(WeakReference<Context> paramWeakReference, c paramc)
  {
    String[] arrayOfString = a();
    Boolean localBoolean1 = Boolean.valueOf(false);
    Object localObject1;
    int i;
    if ((arrayOfString != null) && (arrayOfString.length > 0))
    {
      Log.d("HockeyApp", "Found " + arrayOfString.length + " stacktrace(s).");
      localObject1 = localBoolean1;
      i = 0;
      while (true)
        if (i < arrayOfString.length)
          try
          {
            String str1 = arrayOfString[i];
            String str2 = b(paramWeakReference, str1);
            if (str2.length() > 0)
            {
              Log.d("HockeyApp", "Transmitting crash data: \n" + str2);
              DefaultHttpClient localDefaultHttpClient = (DefaultHttpClient)net.hockeyapp.android.d.a.a().b();
              HttpPost localHttpPost = new HttpPost(b + "api/2/apps/" + a + "/crashes/");
              ArrayList localArrayList = new ArrayList();
              localArrayList.add(new BasicNameValuePair("raw", str2));
              localArrayList.add(new BasicNameValuePair("userID", b(paramWeakReference, str1.replace(".stacktrace", ".user"))));
              localArrayList.add(new BasicNameValuePair("contact", b(paramWeakReference, str1.replace(".stacktrace", ".contact"))));
              localArrayList.add(new BasicNameValuePair("description", b(paramWeakReference, str1.replace(".stacktrace", ".description"))));
              localArrayList.add(new BasicNameValuePair("sdk", "HockeySDK"));
              localArrayList.add(new BasicNameValuePair("sdk_version", "3.0.1"));
              localHttpPost.setEntity(new UrlEncodedFormEntity(localArrayList, "UTF-8"));
              localDefaultHttpClient.execute(localHttpPost);
              Boolean localBoolean2 = Boolean.valueOf(true);
              localObject1 = localBoolean2;
            }
            if (((Boolean)localObject1).booleanValue())
            {
              a(paramWeakReference, arrayOfString[i]);
              if (paramc == null);
            }
            while (true)
            {
              i++;
              break;
              if (paramc == null);
            }
          }
          catch (Exception localException)
          {
            while (true)
            {
              localException.printStackTrace();
              if (((Boolean)localObject1).booleanValue())
              {
                a(paramWeakReference, arrayOfString[i]);
                if (paramc == null);
              }
              else if (paramc == null);
            }
          }
          finally
          {
            if (((Boolean)localObject1).booleanValue())
              a(paramWeakReference, arrayOfString[i]);
          }
    }
  }

  private static String[] a()
  {
    if (a.a != null)
    {
      Log.d("HockeyApp", "Looking for exceptions in: " + a.a);
      File localFile = new File(a.a + "/");
      if ((!localFile.mkdir()) && (!localFile.exists()))
        return new String[0];
      return localFile.list(new b.4());
    }
    Log.d("HockeyApp", "Can't search for exception as file path is null.");
    return null;
  }

  private static int b(WeakReference<Context> paramWeakReference)
  {
    int i = 0;
    String[] arrayOfString = a();
    if ((arrayOfString != null) && (arrayOfString.length > 0))
      try
      {
        Context localContext = (Context)paramWeakReference.get();
        if (localContext != null)
        {
          List localList2 = Arrays.asList(localContext.getSharedPreferences("HockeySDK", 0).getString("ConfirmedFilenames", "").split("\\|"));
          localList3 = localList2;
          localList1 = localList3;
          if (localList1 != null)
          {
            j = 2;
            int k = arrayOfString.length;
            while (true)
            {
              if (i >= k)
                break label107;
              if (!localList1.contains(arrayOfString[i]))
                break;
              i++;
            }
          }
          int j = 1;
          return j;
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          List localList1 = null;
          continue;
          List localList3 = null;
        }
      }
    label107: return 0;
  }

  // ERROR //
  private static String b(WeakReference<Context> paramWeakReference, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +157 -> 158
    //   4: aload_0
    //   5: invokevirtual 54	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   8: checkcast 56	android/content/Context
    //   11: astore_2
    //   12: aload_2
    //   13: ifnull +145 -> 158
    //   16: new 113	java/lang/StringBuilder
    //   19: dup
    //   20: invokespecial 188	java/lang/StringBuilder:<init>	()V
    //   23: astore_3
    //   24: new 296	java/io/BufferedReader
    //   27: dup
    //   28: new 298	java/io/InputStreamReader
    //   31: dup
    //   32: aload_2
    //   33: aload_1
    //   34: invokevirtual 302	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   37: invokespecial 305	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   40: invokespecial 308	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   43: astore 4
    //   45: aload 4
    //   47: invokevirtual 311	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   50: astore 12
    //   52: aload 12
    //   54: ifnull +45 -> 99
    //   57: aload_3
    //   58: aload 12
    //   60: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: pop
    //   64: aload_3
    //   65: ldc_w 313
    //   68: invokestatic 319	java/lang/System:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   71: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: pop
    //   75: goto -30 -> 45
    //   78: astore 9
    //   80: aload 4
    //   82: astore 10
    //   84: aload 10
    //   86: ifnull +8 -> 94
    //   89: aload 10
    //   91: invokevirtual 322	java/io/BufferedReader:close	()V
    //   94: aload_3
    //   95: invokevirtual 131	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   98: areturn
    //   99: aload 4
    //   101: invokevirtual 322	java/io/BufferedReader:close	()V
    //   104: goto -10 -> 94
    //   107: astore 15
    //   109: goto -15 -> 94
    //   112: astore 5
    //   114: aconst_null
    //   115: astore 4
    //   117: aload 5
    //   119: invokevirtual 323	java/io/IOException:printStackTrace	()V
    //   122: aload 4
    //   124: ifnull -30 -> 94
    //   127: aload 4
    //   129: invokevirtual 322	java/io/BufferedReader:close	()V
    //   132: goto -38 -> 94
    //   135: astore 8
    //   137: goto -43 -> 94
    //   140: astore 6
    //   142: aconst_null
    //   143: astore 4
    //   145: aload 4
    //   147: ifnull +8 -> 155
    //   150: aload 4
    //   152: invokevirtual 322	java/io/BufferedReader:close	()V
    //   155: aload 6
    //   157: athrow
    //   158: aconst_null
    //   159: areturn
    //   160: astore 11
    //   162: goto -68 -> 94
    //   165: astore 7
    //   167: goto -12 -> 155
    //   170: astore 6
    //   172: goto -27 -> 145
    //   175: astore 5
    //   177: goto -60 -> 117
    //   180: astore 16
    //   182: aconst_null
    //   183: astore 10
    //   185: goto -101 -> 84
    //
    // Exception table:
    //   from	to	target	type
    //   45	52	78	java/io/FileNotFoundException
    //   57	75	78	java/io/FileNotFoundException
    //   99	104	107	java/io/IOException
    //   24	45	112	java/io/IOException
    //   127	132	135	java/io/IOException
    //   24	45	140	finally
    //   89	94	160	java/io/IOException
    //   150	155	165	java/io/IOException
    //   45	52	170	finally
    //   57	75	170	finally
    //   117	122	170	finally
    //   45	52	175	java/io/IOException
    //   57	75	175	java/io/IOException
    //   24	45	180	java/io/FileNotFoundException
  }

  private static void b(WeakReference<Context> paramWeakReference, c paramc, boolean paramBoolean)
  {
    if (paramWeakReference != null)
    {
      Context localContext = (Context)paramWeakReference.get();
      if (localContext != null)
        try
        {
          String[] arrayOfString = a();
          SharedPreferences.Editor localEditor = localContext.getSharedPreferences("HockeySDK", 0).edit();
          StringBuffer localStringBuffer = new StringBuffer();
          i = 0;
          if (i < arrayOfString.length)
          {
            localStringBuffer.append(arrayOfString[i]);
            if (i < -1 + arrayOfString.length)
              localStringBuffer.append("|");
          }
          else
          {
            localEditor.putString("ConfirmedFilenames", localStringBuffer.toString());
            e.a(localEditor);
            new b.3(paramWeakReference, paramc, paramBoolean).start();
            return;
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            int i;
            continue;
            i++;
          }
        }
    }
  }

  private static void b(c paramc, boolean paramBoolean)
  {
    if ((a.b != null) && (a.d != null))
    {
      Thread.UncaughtExceptionHandler localUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
      if (localUncaughtExceptionHandler != null)
        Log.d("HockeyApp", "Current handler class = " + localUncaughtExceptionHandler.getClass().getName());
      if ((localUncaughtExceptionHandler instanceof d))
      {
        ((d)localUncaughtExceptionHandler).a(paramc);
        return;
      }
      Thread.setDefaultUncaughtExceptionHandler(new d(localUncaughtExceptionHandler, paramc, paramBoolean));
      return;
    }
    Log.d("HockeyApp", "Exception handler not set because version or package is null.");
  }
}

/* Location:
 * Qualified Name:     net.hockeyapp.android.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
