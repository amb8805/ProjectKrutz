// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.adview;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.*;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.impl.adview.AdViewControllerImpl;
import com.applovin.sdk.*;

// Referenced classes of package com.applovin.adview:
//            AdViewController

public class AppLovinAdView extends RelativeLayout
{

    public AppLovinAdView(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iconst_0        
    //    4    4:invokespecial   #15  <Method void AppLovinAdView(Context, AttributeSet, int)>
    //    5    7:return          
    }

    public AppLovinAdView(Context context, AttributeSet attributeset, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iload_3         
    //    4    4:invokespecial   #16  <Method void RelativeLayout(Context, AttributeSet, int)>
    //    5    7:aload_0         
    //    6    8:aconst_null     
    //    7    9:aconst_null     
    //    8   10:aload_1         
    //    9   11:aload_2         
    //   10   12:invokespecial   #20  <Method void a(AppLovinAdSize, AppLovinSdk, Context, AttributeSet)>
    //   11   15:return          
    }

    public AppLovinAdView(AppLovinAdSize applovinadsize, Activity activity)
    {
    //    0    0:aload_0         
    //    1    1:aload_2         
    //    2    2:invokespecial   #24  <Method void RelativeLayout(Context)>
    //    3    5:ldc1            #26  <String "AppLovinSdk">
    //    4    7:ldc1            #28  <String "Created new AdView">
    //    5    9:invokestatic    #34  <Method int Log.d(String, String)>
    //    6   12:pop             
    //    7   13:aload_0         
    //    8   14:aload_1         
    //    9   15:aconst_null     
    //   10   16:aload_2         
    //   11   17:aconst_null     
    //   12   18:invokespecial   #20  <Method void a(AppLovinAdSize, AppLovinSdk, Context, AttributeSet)>
    //   13   21:return          
    }

    public AppLovinAdView(AppLovinSdk applovinsdk, AppLovinAdSize applovinadsize, Activity activity)
    {
    //    0    0:aload_0         
    //    1    1:aload_3         
    //    2    2:invokespecial   #24  <Method void RelativeLayout(Context)>
    //    3    5:aload_0         
    //    4    6:aload_2         
    //    5    7:aload_1         
    //    6    8:aload_3         
    //    7    9:aconst_null     
    //    8   10:invokespecial   #20  <Method void a(AppLovinAdSize, AppLovinSdk, Context, AttributeSet)>
    //    9   13:return          
    }

    private void a(AttributeSet attributeset, Context context)
    {
    //    0    0:aload_2         
    //    1    1:invokevirtual   #42  <Method Resources Context.getResources()>
    //    2    4:invokevirtual   #48  <Method DisplayMetrics Resources.getDisplayMetrics()>
    //    3    7:astore_3        
    //    4    8:aload_3         
    //    5    9:getfield        #54  <Field int DisplayMetrics.widthPixels>
    //    6   12:istore          4
    //    7   14:iconst_1        
    //    8   15:ldc1            #55  <Float 50F>
    //    9   17:aload_3         
    //   10   18:invokestatic    #61  <Method float TypedValue.applyDimension(int, float, DisplayMetrics)>
    //   11   21:f2i             
    //   12   22:istore          5
    //   13   24:new             #63  <Class TextView>
    //   14   27:dup             
    //   15   28:aload_2         
    //   16   29:invokespecial   #64  <Method void TextView(Context)>
    //   17   32:astore          6
    //   18   34:aload           6
    //   19   36:sipush          220
    //   20   39:sipush          220
    //   21   42:sipush          220
    //   22   45:invokestatic    #70  <Method int Color.rgb(int, int, int)>
    //   23   48:invokevirtual   #74  <Method void TextView.setBackgroundColor(int)>
    //   24   51:aload           6
    //   25   53:ldc1            #75  <Int 0xff000000>
    //   26   55:invokevirtual   #78  <Method void TextView.setTextColor(int)>
    //   27   58:aload           6
    //   28   60:ldc1            #80  <String "AppLovin Ad">
    //   29   62:invokevirtual   #84  <Method void TextView.setText(CharSequence)>
    //   30   65:aload           6
    //   31   67:bipush          17
    //   32   69:invokevirtual   #87  <Method void TextView.setGravity(int)>
    //   33   72:aload_0         
    //   34   73:aload           6
    //   35   75:iload           4
    //   36   77:iload           5
    //   37   79:invokevirtual   #91  <Method void addView(View, int, int)>
    //   38   82:return          
    }

    private void a(AppLovinAdSize applovinadsize, AppLovinSdk applovinsdk, Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #95  <Method boolean isInEditMode()>
    //    2    4:ifne            36
    //    3    7:new             #97  <Class AdViewControllerImpl>
    //    4   10:dup             
    //    5   11:invokespecial   #100 <Method void AdViewControllerImpl()>
    //    6   14:astore          5
    //    7   16:aload           5
    //    8   18:aload_0         
    //    9   19:aload_3         
    //   10   20:aload_1         
    //   11   21:aload_2         
    //   12   22:aload           4
    //   13   24:invokeinterface #106 <Method void AdViewController.initializeAdView(android.view.ViewGroup, Context, AppLovinAdSize, AppLovinSdk, AttributeSet)>
    //   14   29:aload_0         
    //   15   30:aload           5
    //   16   32:putfield        #108 <Field AdViewController controller>
    //   17   35:return          
    //   18   36:aload_0         
    //   19   37:aload           4
    //   20   39:aload_3         
    //   21   40:invokespecial   #110 <Method void a(AttributeSet, Context)>
    //   22   43:return          
    }

    public void destroy()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #108 <Field AdViewController controller>
    //    2    4:ifnull          16
    //    3    7:aload_0         
    //    4    8:getfield        #108 <Field AdViewController controller>
    //    5   11:invokeinterface #113 <Method void AdViewController.destroy()>
    //    6   16:return          
    }

    public AppLovinAdSize getSize()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #108 <Field AdViewController controller>
    //    2    4:ifnull          17
    //    3    7:aload_0         
    //    4    8:getfield        #108 <Field AdViewController controller>
    //    5   11:invokeinterface #117 <Method AppLovinAdSize AdViewController.getSize()>
    //    6   16:areturn         
    //    7   17:aconst_null     
    //    8   18:areturn         
    }

    public void loadNextAd()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #108 <Field AdViewController controller>
    //    2    4:ifnull          17
    //    3    7:aload_0         
    //    4    8:getfield        #108 <Field AdViewController controller>
    //    5   11:invokeinterface #120 <Method void AdViewController.loadNextAd()>
    //    6   16:return          
    //    7   17:ldc1            #26  <String "AppLovinSdk">
    //    8   19:ldc1            #122 <String "Unable to load next ad: AppLovinAdView is not initialized.">
    //    9   21:invokestatic    #125 <Method int Log.i(String, String)>
    //   10   24:pop             
    //   11   25:return          
    }

    protected void onDetachedFromWindow()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #108 <Field AdViewController controller>
    //    2    4:ifnull          16
    //    3    7:aload_0         
    //    4    8:getfield        #108 <Field AdViewController controller>
    //    5   11:invokeinterface #128 <Method void AdViewController.onDetachedFromWindow()>
    //    6   16:aload_0         
    //    7   17:invokespecial   #129 <Method void RelativeLayout.onDetachedFromWindow()>
    //    8   20:return          
    }

    protected void onVisibilityChanged(View view, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iload_2         
    //    3    3:invokespecial   #133 <Method void RelativeLayout.onVisibilityChanged(View, int)>
    //    4    6:aload_0         
    //    5    7:getfield        #108 <Field AdViewController controller>
    //    6   10:ifnull          23
    //    7   13:aload_0         
    //    8   14:getfield        #108 <Field AdViewController controller>
    //    9   17:iload_2         
    //   10   18:invokeinterface #135 <Method void AdViewController.onVisibilityChanged(int)>
    //   11   23:return          
    }

    public void pause()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #108 <Field AdViewController controller>
    //    2    4:ifnull          16
    //    3    7:aload_0         
    //    4    8:getfield        #108 <Field AdViewController controller>
    //    5   11:invokeinterface #138 <Method void AdViewController.pause()>
    //    6   16:return          
    }

    public void renderAd(AppLovinAd applovinad)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #108 <Field AdViewController controller>
    //    2    4:ifnull          17
    //    3    7:aload_0         
    //    4    8:getfield        #108 <Field AdViewController controller>
    //    5   11:aload_1         
    //    6   12:invokeinterface #142 <Method void AdViewController.renderAd(AppLovinAd)>
    //    7   17:return          
    }

    public void resume()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #108 <Field AdViewController controller>
    //    2    4:ifnull          16
    //    3    7:aload_0         
    //    4    8:getfield        #108 <Field AdViewController controller>
    //    5   11:invokeinterface #145 <Method void AdViewController.resume()>
    //    6   16:return          
    }

    public void setAdClickListener(AppLovinAdClickListener applovinadclicklistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #108 <Field AdViewController controller>
    //    2    4:ifnull          17
    //    3    7:aload_0         
    //    4    8:getfield        #108 <Field AdViewController controller>
    //    5   11:aload_1         
    //    6   12:invokeinterface #149 <Method void AdViewController.setAdClickListener(AppLovinAdClickListener)>
    //    7   17:return          
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener applovinaddisplaylistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #108 <Field AdViewController controller>
    //    2    4:ifnull          17
    //    3    7:aload_0         
    //    4    8:getfield        #108 <Field AdViewController controller>
    //    5   11:aload_1         
    //    6   12:invokeinterface #153 <Method void AdViewController.setAdDisplayListener(AppLovinAdDisplayListener)>
    //    7   17:return          
    }

    public void setAdLoadListener(AppLovinAdLoadListener applovinadloadlistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #108 <Field AdViewController controller>
    //    2    4:ifnull          17
    //    3    7:aload_0         
    //    4    8:getfield        #108 <Field AdViewController controller>
    //    5   11:aload_1         
    //    6   12:invokeinterface #157 <Method void AdViewController.setAdLoadListener(AppLovinAdLoadListener)>
    //    7   17:return          
    }

    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener applovinadvideoplaybacklistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #108 <Field AdViewController controller>
    //    2    4:ifnull          17
    //    3    7:aload_0         
    //    4    8:getfield        #108 <Field AdViewController controller>
    //    5   11:aload_1         
    //    6   12:invokeinterface #161 <Method void AdViewController.setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener)>
    //    7   17:return          
    }

    public void setAutoDestroy(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #108 <Field AdViewController controller>
    //    2    4:ifnull          17
    //    3    7:aload_0         
    //    4    8:getfield        #108 <Field AdViewController controller>
    //    5   11:iload_1         
    //    6   12:invokeinterface #165 <Method void AdViewController.setAutoDestroy(boolean)>
    //    7   17:return          
    }

    public static final String NAMESPACE = "http://schemas.applovin.com/android/1.0";
    protected AdViewController controller;
}
