// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.sdk;


public class AppLovinSdkSettings
{

    public AppLovinSdkSettings()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #14  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:ldc2w           #15  <Long -1L>
    //    4    8:putfield        #18  <Field long b>
    //    5   11:return          
    }

    public String getAutoPreloadSizes()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #22  <Field String c>
    //    2    4:areturn         
    }

    public long getBannerAdRefreshSeconds()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #18  <Field long b>
    //    2    4:lreturn         
    }

    public boolean isVerboseLoggingEnabled()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #28  <Field boolean a>
    //    2    4:ireturn         
    }

    public void setAutoPreloadSizes(String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #22  <Field String c>
    //    3    5:return          
    }

    public void setBannerAdRefreshSeconds(long l)
    {
    //    0    0:aload_0         
    //    1    1:lload_1         
    //    2    2:putfield        #18  <Field long b>
    //    3    5:return          
    }

    public void setVerboseLogging(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #28  <Field boolean a>
    //    3    5:return          
    }

    private boolean a;
    private long b;
    private String c;
}
