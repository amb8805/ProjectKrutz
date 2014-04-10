// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.android.apps.analytics;


class Referrer
{

    Referrer(String s, long l, int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #16  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:putfield        #18  <Field String referrer>
    //    5    9:aload_0         
    //    6   10:lload_2         
    //    7   11:putfield        #20  <Field long timeStamp>
    //    8   14:aload_0         
    //    9   15:iload           4
    //   10   17:putfield        #22  <Field int visit>
    //   11   20:aload_0         
    //   12   21:iload           5
    //   13   23:putfield        #24  <Field int index>
    //   14   26:return          
    }

    int getIndex()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #24  <Field int index>
    //    2    4:ireturn         
    }

    String getReferrerString()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #18  <Field String referrer>
    //    2    4:areturn         
    }

    long getTimeStamp()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #20  <Field long timeStamp>
    //    2    4:lreturn         
    }

    int getVisit()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #22  <Field int visit>
    //    2    4:ireturn         
    }

    private final int index;
    private final String referrer;
    private final long timeStamp;
    private final int visit;
}
