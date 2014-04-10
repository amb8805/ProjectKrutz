// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.impl.adview;

import android.app.Activity;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.adview.InterstitialAdDialogCreator;
import com.applovin.sdk.AppLovinLogger;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;

// Referenced classes of package com.applovin.impl.adview:
//            aj

public class InterstitialAdDialogCreatorImpl
    implements InterstitialAdDialogCreator
{

    static 
    {
    //    0    0:new             #4   <Class Object>
    //    1    3:dup             
    //    2    4:invokespecial   #16  <Method void Object()>
    //    3    7:putstatic       #18  <Field Object a>
    //    4   10:new             #20  <Class WeakReference>
    //    5   13:dup             
    //    6   14:aconst_null     
    //    7   15:invokespecial   #23  <Method void WeakReference(Object)>
    //    8   18:putstatic       #25  <Field WeakReference b>
    //    9   21:new             #20  <Class WeakReference>
    //   10   24:dup             
    //   11   25:aconst_null     
    //   12   26:invokespecial   #23  <Method void WeakReference(Object)>
    //   13   29:putstatic       #27  <Field WeakReference c>
    //   14   32:return          
    }

    public InterstitialAdDialogCreatorImpl()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #16  <Method void Object()>
    //    2    4:return          
    }

    public AppLovinInterstitialAdDialog createInterstitialAdDialog(AppLovinSdk applovinsdk, Activity activity)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       9
    //    2    4:aload_2         
    //    3    5:invokestatic    #35  <Method AppLovinSdk AppLovinSdk.getInstance(android.content.Context)>
    //    4    8:astore_1        
    //    5    9:getstatic       #18  <Field Object a>
    //    6   12:astore_3        
    //    7   13:aload_3         
    //    8   14:monitorenter    
    // try 15 26 handler(s) 104
    //    9   15:getstatic       #25  <Field WeakReference b>
    //   10   18:invokevirtual   #39  <Method Object WeakReference.get()>
    //   11   21:checkcast       #41  <Class aj>
    //   12   24:astore          5
    //   13   26:aload           5
    //   14   28:ifnull          49
    // try 31 49 handler(s) 104
    //   15   31:aload           5
    //   16   33:invokevirtual   #45  <Method boolean aj.isShowing()>
    //   17   36:ifeq            49
    //   18   39:getstatic       #27  <Field WeakReference c>
    //   19   42:invokevirtual   #39  <Method Object WeakReference.get()>
    //   20   45:aload_2         
    //   21   46:if_acmpeq       88
    // try 49 83 handler(s) 104
    //   22   49:new             #41  <Class aj>
    //   23   52:dup             
    //   24   53:aload_1         
    //   25   54:aload_2         
    //   26   55:invokespecial   #48  <Method void aj(AppLovinSdk, Activity)>
    //   27   58:astore          5
    //   28   60:new             #20  <Class WeakReference>
    //   29   63:dup             
    //   30   64:aload           5
    //   31   66:invokespecial   #23  <Method void WeakReference(Object)>
    //   32   69:putstatic       #25  <Field WeakReference b>
    //   33   72:new             #20  <Class WeakReference>
    //   34   75:dup             
    //   35   76:aload_2         
    //   36   77:invokespecial   #23  <Method void WeakReference(Object)>
    //   37   80:putstatic       #27  <Field WeakReference c>
    // try 83 85 handler(s) 104
    //   38   83:aload_3         
    //   39   84:monitorexit     
    //   40   85:aload           5
    //   41   87:areturn         
    // try 88 101 handler(s) 104
    //   42   88:aload_1         
    //   43   89:invokevirtual   #52  <Method AppLovinLogger AppLovinSdk.getLogger()>
    //   44   92:ldc1            #54  <String "InterstitialAdDialogCreator">
    //   45   94:ldc1            #56  <String "An interstitial dialog is already showing, returning it">
    //   46   96:invokeinterface #62  <Method void AppLovinLogger.w(String, String)>
    //   47  101:goto            83
    // finally
    //   48  104:astore          4
    // try 106 108 handler(s) 104
    //   49  106:aload_3         
    //   50  107:monitorexit     
    //   51  108:aload           4
    //   52  110:athrow          
    }

    private static final Object a;
    private static WeakReference b;
    private static WeakReference c;
}
