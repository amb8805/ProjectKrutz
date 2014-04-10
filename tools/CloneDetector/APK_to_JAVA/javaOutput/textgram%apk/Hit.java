// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.android.apps.analytics;


public class Hit
{

    Hit(String s, long l)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #13  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:putfield        #15  <Field String hitString>
    //    5    9:aload_0         
    //    6   10:lload_2         
    //    7   11:putfield        #17  <Field long hitId>
    //    8   14:return          
    }

    final long hitId;
    final String hitString;
}
