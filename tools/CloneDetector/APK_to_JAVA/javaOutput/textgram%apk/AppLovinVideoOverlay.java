// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.impl.adview;

import android.widget.RelativeLayout;

// Referenced classes of package com.applovin.impl.adview:
//            AppLovinVideoPlaybackState

public interface AppLovinVideoOverlay
{

    public abstract int getDuration();

    public abstract int getPercentViewed();

    public abstract AppLovinVideoPlaybackState getPlaybackState();

    public abstract int getPlaybackTime();

    public abstract RelativeLayout getVideoLayout();

    public abstract void requestPause();

    public abstract void requestPlay();

    public abstract void setPercentViewed(int i);

    public abstract void setPlaybackTime(int i);

    public abstract void stopUnderlyingMediaPlayer();
}
