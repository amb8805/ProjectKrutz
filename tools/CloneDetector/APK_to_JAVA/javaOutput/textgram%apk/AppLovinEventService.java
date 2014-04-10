// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.sdk;


public interface AppLovinEventService
{

    public abstract void trackRevenueEvent(String s, double d, String s1);

    public abstract void trackSessionEnd();

    public abstract void trackSessionPause();

    public abstract void trackSessionStart();

    public abstract void uploadEvents();
}
