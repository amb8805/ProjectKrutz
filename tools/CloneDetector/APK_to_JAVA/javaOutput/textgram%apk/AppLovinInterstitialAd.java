// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.adview;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.applovin.impl.adview.InterstitialAdDialogCreatorImpl;
import com.applovin.sdk.AppLovinSdk;

// Referenced classes of package com.applovin.adview:
//            InterstitialAdDialogCreator, d, AppLovinInterstitialAdDialog

public class AppLovinInterstitialAd extends View
{

    public AppLovinInterstitialAd(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iconst_0        
    //    4    4:invokespecial   #11  <Method void AppLovinInterstitialAd(Context, AttributeSet, int)>
    //    5    7:return          
    }

    public AppLovinInterstitialAd(Context context, AttributeSet attributeset, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iload_3         
    //    4    4:invokespecial   #12  <Method void View(Context, AttributeSet, int)>
    //    5    7:aload_0         
    //    6    8:aconst_null     
    //    7    9:putfield        #14  <Field AppLovinInterstitialAdDialog a>
    //    8   12:aload_1         
    //    9   13:instanceof      #16  <Class Activity>
    //   10   16:ifeq            67
    //   11   19:aload_1         
    //   12   20:invokestatic    #22  <Method AppLovinSdk AppLovinSdk.getInstance(Context)>
    //   13   23:astore          5
    //   14   25:aload           5
    //   15   27:ifnull          60
    //   16   30:aload           5
    //   17   32:invokevirtual   #26  <Method boolean AppLovinSdk.hasCriticalErrors()>
    //   18   35:ifne            60
    //   19   38:aload_0         
    //   20   39:new             #28  <Class InterstitialAdDialogCreatorImpl>
    //   21   42:dup             
    //   22   43:invokespecial   #31  <Method void InterstitialAdDialogCreatorImpl()>
    //   23   46:aload           5
    //   24   48:aload_1         
    //   25   49:checkcast       #16  <Class Activity>
    //   26   52:invokeinterface #37  <Method AppLovinInterstitialAdDialog InterstitialAdDialogCreator.createInterstitialAdDialog(AppLovinSdk, Activity)>
    //   27   57:putfield        #14  <Field AppLovinInterstitialAdDialog a>
    //   28   60:aload_0         
    //   29   61:bipush          8
    //   30   63:invokevirtual   #41  <Method void setVisibility(int)>
    //   31   66:return          
    //   32   67:ldc1            #43  <String "AppLovinSdk">
    //   33   69:ldc1            #45  <String "Unable to create AppLovin interstitial dialog. The view was not created from an activity.">
    //   34   71:invokestatic    #51  <Method int Log.e(String, String)>
    //   35   74:pop             
    //   36   75:goto            60
    }

    public static AppLovinInterstitialAdDialog create(AppLovinSdk applovinsdk, Activity activity)
    {
    //    0    0:aload_0         
    //    1    1:ifnonnull       14
    //    2    4:new             #54  <Class IllegalArgumentException>
    //    3    7:dup             
    //    4    8:ldc1            #56  <String "No sdk specified">
    //    5   10:invokespecial   #59  <Method void IllegalArgumentException(String)>
    //    6   13:athrow          
    //    7   14:aload_1         
    //    8   15:ifnonnull       28
    //    9   18:new             #54  <Class IllegalArgumentException>
    //   10   21:dup             
    //   11   22:ldc1            #61  <String "No activity specified">
    //   12   24:invokespecial   #59  <Method void IllegalArgumentException(String)>
    //   13   27:athrow          
    //   14   28:new             #28  <Class InterstitialAdDialogCreatorImpl>
    //   15   31:dup             
    //   16   32:invokespecial   #31  <Method void InterstitialAdDialogCreatorImpl()>
    //   17   35:aload_0         
    //   18   36:aload_1         
    //   19   37:invokeinterface #37  <Method AppLovinInterstitialAdDialog InterstitialAdDialogCreator.createInterstitialAdDialog(AppLovinSdk, Activity)>
    //   20   42:areturn         
    }

    public static void show(Activity activity)
    {
    //    0    0:aload_0         
    //    1    1:ifnonnull       14
    //    2    4:new             #54  <Class IllegalArgumentException>
    //    3    7:dup             
    //    4    8:ldc1            #61  <String "No activity specified">
    //    5   10:invokespecial   #59  <Method void IllegalArgumentException(String)>
    //    6   13:athrow          
    //    7   14:aload_0         
    //    8   15:invokestatic    #22  <Method AppLovinSdk AppLovinSdk.getInstance(Context)>
    //    9   18:astore_1        
    //   10   19:aload_1         
    //   11   20:ifnull          35
    //   12   23:aload_1         
    //   13   24:invokevirtual   #26  <Method boolean AppLovinSdk.hasCriticalErrors()>
    //   14   27:ifne            35
    //   15   30:aload_1         
    //   16   31:aload_0         
    //   17   32:invokestatic    #66  <Method void show(AppLovinSdk, Activity)>
    //   18   35:return          
    }

    public static void show(AppLovinSdk applovinsdk, Activity activity)
    {
    //    0    0:aload_0         
    //    1    1:ifnonnull       14
    //    2    4:new             #54  <Class IllegalArgumentException>
    //    3    7:dup             
    //    4    8:ldc1            #56  <String "No sdk specified">
    //    5   10:invokespecial   #59  <Method void IllegalArgumentException(String)>
    //    6   13:athrow          
    //    7   14:aload_1         
    //    8   15:ifnonnull       28
    //    9   18:new             #54  <Class IllegalArgumentException>
    //   10   21:dup             
    //   11   22:ldc1            #61  <String "No activity specified">
    //   12   24:invokespecial   #59  <Method void IllegalArgumentException(String)>
    //   13   27:athrow          
    //   14   28:aload_1         
    //   15   29:new             #68  <Class d>
    //   16   32:dup             
    //   17   33:aload_0         
    //   18   34:aload_1         
    //   19   35:invokespecial   #70  <Method void d(AppLovinSdk, Activity)>
    //   20   38:invokevirtual   #74  <Method void Activity.runOnUiThread(Runnable)>
    //   21   41:return          
    }

    public void onAttachedToWindow()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #77  <Method void View.onAttachedToWindow()>
    //    2    4:aload_0         
    //    3    5:getfield        #14  <Field AppLovinInterstitialAdDialog a>
    //    4    8:ifnull          20
    //    5   11:aload_0         
    //    6   12:getfield        #14  <Field AppLovinInterstitialAdDialog a>
    //    7   15:invokeinterface #81  <Method void AppLovinInterstitialAdDialog.show()>
    //    8   20:return          
    }

    private AppLovinInterstitialAdDialog a;
}
