package com.spotify.mobile.android.b;

import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b
  implements c
{
  private static final List<Pattern> a;
  private static final Set<String> b = Collections.unmodifiableSet(localHashSet);

  static
  {
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(Pattern.compile("/storage/emulated/legacy.*"));
    localLinkedList.add(Pattern.compile("/storage/emulated/[0-9]+/Android/obb"));
    a = Collections.unmodifiableList(localLinkedList);
    HashSet localHashSet = new HashSet();
    localHashSet.add("tmpfs");
    localHashSet.add("proc");
    localHashSet.add("sysfs");
  }

  public b()
  {
  }

  // ERROR //
  private static Set<String> a(java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: new 45	java/util/HashSet
    //   3: dup
    //   4: invokespecial 46	java/util/HashSet:<init>	()V
    //   7: astore_1
    //   8: new 65	java/util/Scanner
    //   11: dup
    //   12: aload_0
    //   13: ldc 67
    //   15: invokespecial 70	java/util/Scanner:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   18: astore_2
    //   19: ldc 72
    //   21: invokestatic 27	java/util/regex/Pattern:compile	(Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   24: astore 4
    //   26: aload_2
    //   27: invokevirtual 76	java/util/Scanner:hasNext	()Z
    //   30: ifeq +70 -> 100
    //   33: aload 4
    //   35: aload_2
    //   36: invokevirtual 80	java/util/Scanner:nextLine	()Ljava/lang/String;
    //   39: invokevirtual 84	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   42: astore 5
    //   44: aload 5
    //   46: invokevirtual 89	java/util/regex/Matcher:matches	()Z
    //   49: ifeq -23 -> 26
    //   52: aload 5
    //   54: iconst_2
    //   55: invokevirtual 93	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   58: astore 6
    //   60: getstatic 61	com/spotify/mobile/android/b/b:b	Ljava/util/Set;
    //   63: aload 6
    //   65: invokeinterface 96 2 0
    //   70: ifne -44 -> 26
    //   73: aload_1
    //   74: aload 5
    //   76: iconst_1
    //   77: invokevirtual 93	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   80: invokeinterface 51 2 0
    //   85: pop
    //   86: goto -60 -> 26
    //   89: astore_3
    //   90: aload_2
    //   91: ifnull +7 -> 98
    //   94: aload_2
    //   95: invokevirtual 99	java/util/Scanner:close	()V
    //   98: aload_3
    //   99: athrow
    //   100: aload_2
    //   101: invokevirtual 103	java/util/Scanner:ioException	()Ljava/io/IOException;
    //   104: ifnull +8 -> 112
    //   107: aload_2
    //   108: invokevirtual 103	java/util/Scanner:ioException	()Ljava/io/IOException;
    //   111: athrow
    //   112: aload_2
    //   113: invokevirtual 99	java/util/Scanner:close	()V
    //   116: aload_1
    //   117: areturn
    //   118: astore_3
    //   119: aconst_null
    //   120: astore_2
    //   121: goto -31 -> 90
    //
    // Exception table:
    //   from	to	target	type
    //   19	26	89	finally
    //   26	86	89	finally
    //   100	112	89	finally
    //   8	19	118	finally
  }

  // ERROR //
  private static Set<String> a(String paramString)
  {
    // Byte code:
    //   0: new 45	java/util/HashSet
    //   3: dup
    //   4: invokespecial 46	java/util/HashSet:<init>	()V
    //   7: astore_1
    //   8: aconst_null
    //   9: astore_2
    //   10: new 108	java/io/FileInputStream
    //   13: dup
    //   14: aload_0
    //   15: invokespecial 111	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   18: astore_3
    //   19: aload_3
    //   20: invokestatic 113	com/spotify/mobile/android/b/b:a	(Ljava/io/InputStream;)Ljava/util/Set;
    //   23: astore 8
    //   25: aload 8
    //   27: astore 9
    //   29: aload_3
    //   30: invokevirtual 114	java/io/FileInputStream:close	()V
    //   33: aload 9
    //   35: invokestatic 116	com/spotify/mobile/android/b/b:b	(Ljava/util/Set;)Ljava/util/Set;
    //   38: astore 9
    //   40: aload 9
    //   42: invokestatic 118	com/spotify/mobile/android/b/b:a	(Ljava/util/Set;)Ljava/util/Set;
    //   45: astore 11
    //   47: aload 11
    //   49: astore 5
    //   51: aload 5
    //   53: invokestatic 124	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   56: invokevirtual 129	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   59: invokeinterface 51 2 0
    //   64: pop
    //   65: aload 5
    //   67: areturn
    //   68: astore 12
    //   70: aload_1
    //   71: astore 5
    //   73: aload_2
    //   74: ifnull +7 -> 81
    //   77: aload_2
    //   78: invokevirtual 114	java/io/FileInputStream:close	()V
    //   81: aload 5
    //   83: invokeinterface 132 1 0
    //   88: goto -37 -> 51
    //   91: astore 7
    //   93: goto -12 -> 81
    //   96: astore 4
    //   98: aload_3
    //   99: astore_2
    //   100: aload_1
    //   101: astore 5
    //   103: goto -30 -> 73
    //   106: astore 10
    //   108: aload 9
    //   110: astore 5
    //   112: aload_3
    //   113: astore_2
    //   114: goto -41 -> 73
    //
    // Exception table:
    //   from	to	target	type
    //   10	19	68	java/io/IOException
    //   77	81	91	java/io/IOException
    //   19	25	96	java/io/IOException
    //   29	47	106	java/io/IOException
  }

  private static Set<String> a(Set<String> paramSet)
  {
    HashSet localHashSet = new HashSet();
    Iterator localIterator1 = paramSet.iterator();
    label99: 
    while (true)
    {
      String str;
      if (localIterator1.hasNext())
      {
        str = (String)localIterator1.next();
        Iterator localIterator2 = a.iterator();
        do
          if (!localIterator2.hasNext())
            break;
        while (!((Pattern)localIterator2.next()).matcher(str).matches());
      }
      for (int i = 1; ; i = 0)
      {
        if (i != 0)
          break label99;
        localHashSet.add(str);
        break;
        return localHashSet;
      }
    }
  }

  private static Set<String> b(Set<String> paramSet)
  {
    HashSet localHashSet = new HashSet();
    Iterator localIterator = paramSet.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      File localFile = new File(str);
      if ((localFile.exists()) && (localFile.isDirectory()) && (localFile.canWrite()))
        localHashSet.add(str);
    }
    return localHashSet;
  }

  public final Set<String> a()
  {
    return a("/proc/mounts");
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
