// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.util.DisplayMetrics;

public final class e
{

    private static int a(Context context, float f, int i)
    {
    //    0    0:sipush          8192
    //    1    3:aload_0         
    //    2    4:invokevirtual   #15  <Method ApplicationInfo Context.getApplicationInfo()>
    //    3    7:getfield        #21  <Field int ApplicationInfo.flags>
    //    4   10:iand            
    //    5   11:ifeq            20
    //    6   14:iload_2         
    //    7   15:i2f             
    //    8   16:fload_1         
    //    9   17:fdiv            
    //   10   18:f2i             
    //   11   19:istore_2        
    //   12   20:iload_2         
    //   13   21:ireturn         
    }

    public static int a(Context context, DisplayMetrics displaymetrics)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:getfield        #28  <Field float DisplayMetrics.density>
    //    3    5:aload_1         
    //    4    6:getfield        #31  <Field int DisplayMetrics.heightPixels>
    //    5    9:invokestatic    #33  <Method int a(Context, float, int)>
    //    6   12:ireturn         
    }

    public static void a(Intent intent, String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #40  <Method Intent Intent.setPackage(String)>
    //    3    5:pop             
    //    4    6:return          
    }

    public static int b(Context context, DisplayMetrics displaymetrics)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:getfield        #28  <Field float DisplayMetrics.density>
    //    3    5:aload_1         
    //    4    6:getfield        #44  <Field int DisplayMetrics.widthPixels>
    //    5    9:invokestatic    #33  <Method int a(Context, float, int)>
    //    6   12:ireturn         
    }
}
