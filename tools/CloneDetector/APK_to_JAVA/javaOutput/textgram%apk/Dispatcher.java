// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.android.apps.analytics;


// Referenced classes of package com.google.android.apps.analytics:
//            Hit

interface Dispatcher
{
    public static interface Callbacks
    {

        public abstract void dispatchFinished();

        public abstract void hitDispatched(long l);
    }


    public abstract void dispatchHits(Hit ahit[]);

    public abstract void init(Callbacks callbacks);

    public abstract boolean isDryRun();

    public abstract void setDryRun(boolean flag);

    public abstract void stop();
}
