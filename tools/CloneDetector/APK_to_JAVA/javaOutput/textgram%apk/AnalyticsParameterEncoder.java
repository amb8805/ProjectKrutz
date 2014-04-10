// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.android.apps.analytics;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class AnalyticsParameterEncoder
{

    private AnalyticsParameterEncoder()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static String encode(String s)
    {
    //    0    0:aload_0         
    //    1    1:ldc1            #12  <String "UTF-8">
    //    2    3:invokestatic    #15  <Method String encode(String, String)>
    //    3    6:areturn         
    }

    static String encode(String s, String s1)
    {
    // try 0 13 handler(s) 15
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokestatic    #20  <Method String URLEncoder.encode(String, String)>
    //    3    5:ldc1            #22  <String "+">
    //    4    7:ldc1            #24  <String "%20">
    //    5    9:invokevirtual   #30  <Method String String.replace(CharSequence, CharSequence)>
    //    6   12:astore_3        
    //    7   13:aload_3         
    //    8   14:areturn         
    // catch UnsupportedEncodingException
    //    9   15:astore_2        
    //   10   16:new             #32  <Class AssertionError>
    //   11   19:dup             
    //   12   20:new             #34  <Class StringBuilder>
    //   13   23:dup             
    //   14   24:invokespecial   #35  <Method void StringBuilder()>
    //   15   27:ldc1            #37  <String "URL encoding failed for: ">
    //   16   29:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
    //   17   32:aload_0         
    //   18   33:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
    //   19   36:invokevirtual   #45  <Method String StringBuilder.toString()>
    //   20   39:invokespecial   #48  <Method void AssertionError(Object)>
    //   21   42:athrow          
    }
}
