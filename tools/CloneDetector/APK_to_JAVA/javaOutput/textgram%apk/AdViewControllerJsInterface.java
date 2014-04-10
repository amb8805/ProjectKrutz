// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.impl.adview;

import android.app.Activity;
import android.graphics.Point;
import android.net.Uri;
import android.view.ViewGroup;
import com.applovin.impl.sdk.*;
import com.applovin.sdk.*;
import java.lang.reflect.Method;
import java.util.Map;

// Referenced classes of package com.applovin.impl.adview:
//            r, p, AppLovinVideoOverlay, AppLovinVideoPlaybackState, 
//            n, v, o, AppLovinVideoOverlayImpl

public class AdViewControllerJsInterface
{

    static 
    {
    //    0    0:ldc1            #36  <String "AdViewControllerJsInterface">
    //    1    2:putstatic       #38  <Field String TAG>
    //    2    5:return          
    }

    public AdViewControllerJsInterface(AppLovinSdk applovinsdk, v v1, Activity activity, ViewGroup viewgroup, AppLovinAd applovinad, AppLovinAdVideoPlaybackListener applovinadvideoplaybacklistener)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #42  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:new             #4   <Class Object>
    //    4    8:dup             
    //    5    9:invokespecial   #42  <Method void Object()>
    //    6   12:putfield        #44  <Field Object videoOverlayLock>
    //    7   15:aload_0         
    //    8   16:iconst_0        
    //    9   17:putfield        #46  <Field boolean interruptNotify>
    //   10   20:aload_0         
    //   11   21:iconst_0        
    //   12   22:putfield        #48  <Field boolean currentlyWaiting>
    //   13   25:aload_0         
    //   14   26:aload_1         
    //   15   27:checkcast       #50  <Class AppLovinSdkImpl>
    //   16   30:putfield        #52  <Field AppLovinSdkImpl sdk>
    //   17   33:aload_0         
    //   18   34:aload_1         
    //   19   35:invokevirtual   #58  <Method AppLovinLogger AppLovinSdk.getLogger()>
    //   20   38:putfield        #60  <Field AppLovinLogger logger>
    //   21   41:aload_0         
    //   22   42:aload_3         
    //   23   43:putfield        #62  <Field Activity parentActivity>
    //   24   46:aload_0         
    //   25   47:aload_2         
    //   26   48:putfield        #64  <Field v adWebView>
    //   27   51:aload_0         
    //   28   52:aload           4
    //   29   54:putfield        #66  <Field ViewGroup parentView>
    //   30   57:aload_0         
    //   31   58:aconst_null     
    //   32   59:putfield        #68  <Field String videoFilename>
    //   33   62:aload_0         
    //   34   63:aload           6
    //   35   65:putfield        #70  <Field AppLovinAdVideoPlaybackListener adVideoPlaybackListener>
    //   36   68:aload_0         
    //   37   69:aload           5
    //   38   71:putfield        #72  <Field AppLovinAd currentAd>
    //   39   74:aload_0         
    //   40   75:getfield        #60  <Field AppLovinLogger logger>
    //   41   78:getstatic       #38  <Field String TAG>
    //   42   81:ldc1            #74  <String "New instance created.">
    //   43   83:invokeinterface #80  <Method void AppLovinLogger.d(String, String)>
    //   44   88:return          
    }

    static ViewGroup access$000(AdViewControllerJsInterface adviewcontrollerjsinterface)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #66  <Field ViewGroup parentView>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #66  <Field ViewGroup parentView>
    //    5    4:areturn         
    }

    static AppLovinAdVideoPlaybackListener access$100(AdViewControllerJsInterface adviewcontrollerjsinterface)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #70  <Field AppLovinAdVideoPlaybackListener adVideoPlaybackListener>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #70  <Field AppLovinAdVideoPlaybackListener adVideoPlaybackListener>
    //    5    4:areturn         
    }

    static AppLovinAd access$200(AdViewControllerJsInterface adviewcontrollerjsinterface)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #72  <Field AppLovinAd currentAd>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #72  <Field AppLovinAd currentAd>
    //    5    4:areturn         
    }

    static AppLovinVideoOverlay access$300(AdViewControllerJsInterface adviewcontrollerjsinterface)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #90  <Field AppLovinVideoOverlay videoOverlay>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #90  <Field AppLovinVideoOverlay videoOverlay>
    //    5    4:areturn         
    }

    static String access$400()
    {
    //    0    0:getstatic       #38  <Field String TAG>
    //    1    3:areturn         
// Previous instruction length mismatch
    //    2    0:getstatic       #38  <Field String TAG>
    //    3    3:areturn         
    }

    static boolean access$500(AdViewControllerJsInterface adviewcontrollerjsinterface)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #48  <Field boolean currentlyWaiting>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #48  <Field boolean currentlyWaiting>
    //    5    4:ireturn         
    }

    static boolean access$502(AdViewControllerJsInterface adviewcontrollerjsinterface, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #48  <Field boolean currentlyWaiting>
    //    3    5:iload_1         
    //    4    6:ireturn         
// Previous instruction length mismatch
    //    5    0:aload_0         
    //    6    1:iload_1         
    //    7    2:putfield        #48  <Field boolean currentlyWaiting>
    //    8    5:iload_1         
    //    9    6:ireturn         
    }

    static boolean access$600(AdViewControllerJsInterface adviewcontrollerjsinterface)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #46  <Field boolean interruptNotify>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #46  <Field boolean interruptNotify>
    //    5    4:ireturn         
    }

    static boolean access$602(AdViewControllerJsInterface adviewcontrollerjsinterface, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #46  <Field boolean interruptNotify>
    //    3    5:iload_1         
    //    4    6:ireturn         
// Previous instruction length mismatch
    //    5    0:aload_0         
    //    6    1:iload_1         
    //    7    2:putfield        #46  <Field boolean interruptNotify>
    //    8    5:iload_1         
    //    9    6:ireturn         
    }

    static Activity access$700(AdViewControllerJsInterface adviewcontrollerjsinterface)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #62  <Field Activity parentActivity>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #62  <Field Activity parentActivity>
    //    5    4:areturn         
    }

    private int calculateDimension(String s, r r1)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #62  <Field Activity parentActivity>
    //    2    4:invokestatic    #108 <Method Point j.a(Activity)>
    //    3    7:astore_3        
    //    4    8:aload_2         
    //    5    9:getstatic       #113 <Field r r.a>
    //    6   12:if_acmpne       30
    //    7   15:aload_0         
    //    8   16:aload_1         
    //    9   17:invokespecial   #117 <Method float parsePercent(String)>
    //   10   20:aload_3         
    //   11   21:getfield        #122 <Field int Point.x>
    //   12   24:i2f             
    //   13   25:fmul            
    //   14   26:invokestatic    #128 <Method int Math.round(float)>
    //   15   29:ireturn         
    //   16   30:aload_2         
    //   17   31:getstatic       #131 <Field r r.b>
    //   18   34:if_acmpne       52
    //   19   37:aload_0         
    //   20   38:aload_1         
    //   21   39:invokespecial   #117 <Method float parsePercent(String)>
    //   22   42:aload_3         
    //   23   43:getfield        #134 <Field int Point.y>
    //   24   46:i2f             
    //   25   47:fmul            
    //   26   48:invokestatic    #128 <Method int Math.round(float)>
    //   27   51:ireturn         
    //   28   52:iconst_m1       
    //   29   53:ireturn         
    }

    private void notifyOfNewTime()
    {
    //    0    0:new             #137 <Class Thread>
    //    1    3:dup             
    //    2    4:new             #139 <Class p>
    //    3    7:dup             
    //    4    8:aload_0         
    //    5    9:invokespecial   #142 <Method void p(AdViewControllerJsInterface)>
    //    6   12:ldc1            #144 <String "JSNotificationThread">
    //    7   14:invokespecial   #147 <Method void Thread(Runnable, String)>
    //    8   17:invokevirtual   #150 <Method void Thread.start()>
    //    9   20:return          
    }

    private float parsePercent(String s)
    {
    //    0    0:aload_1         
    //    1    1:invokestatic    #155 <Method float Float.parseFloat(String)>
    //    2    4:ldc1            #156 <Float 100F>
    //    3    6:fdiv            
    //    4    7:freturn         
    }

    public void debugMessage(Map map)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #60  <Field AppLovinLogger logger>
    //    2    4:getstatic       #38  <Field String TAG>
    //    3    7:new             #160 <Class StringBuilder>
    //    4   10:dup             
    //    5   11:invokespecial   #161 <Method void StringBuilder()>
    //    6   14:ldc1            #163 <String "Received JS debug message: ">
    //    7   16:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
    //    8   19:aload_1         
    //    9   20:ldc1            #169 <String "text">
    //   10   22:invokeinterface #175 <Method Object Map.get(Object)>
    //   11   27:checkcast       #177 <Class String>
    //   12   30:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
    //   13   33:invokevirtual   #180 <Method String StringBuilder.toString()>
    //   14   36:invokeinterface #80  <Method void AppLovinLogger.d(String, String)>
    //   15   41:return          
    }

    public void destroyVideoOverlay()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #60  <Field AppLovinLogger logger>
    //    2    4:getstatic       #38  <Field String TAG>
    //    3    7:ldc1            #183 <String "Asked to stop video if playing.">
    //    4    9:invokeinterface #80  <Method void AppLovinLogger.d(String, String)>
    //    5   14:aload_0         
    //    6   15:iconst_1        
    //    7   16:putfield        #46  <Field boolean interruptNotify>
    //    8   19:aload_0         
    //    9   20:getfield        #44  <Field Object videoOverlayLock>
    //   10   23:astore_1        
    //   11   24:aload_1         
    //   12   25:monitorenter    
    // try 26 57 handler(s) 114
    //   13   26:aload_0         
    //   14   27:getfield        #90  <Field AppLovinVideoOverlay videoOverlay>
    //   15   30:ifnull          109
    //   16   33:aload_0         
    //   17   34:getfield        #90  <Field AppLovinVideoOverlay videoOverlay>
    //   18   37:invokeinterface #189 <Method AppLovinVideoPlaybackState AppLovinVideoOverlay.getPlaybackState()>
    //   19   42:getstatic       #195 <Field AppLovinVideoPlaybackState AppLovinVideoPlaybackState.PLAYING>
    //   20   45:if_acmpne       57
    //   21   48:aload_0         
    //   22   49:getfield        #90  <Field AppLovinVideoOverlay videoOverlay>
    //   23   52:invokeinterface #198 <Method void AppLovinVideoOverlay.requestPause()>
    // try 57 81 handler(s) 114
    //   24   57:aload_0         
    //   25   58:getfield        #90  <Field AppLovinVideoOverlay videoOverlay>
    //   26   61:invokeinterface #202 <Method android.widget.RelativeLayout AppLovinVideoOverlay.getVideoLayout()>
    //   27   66:astore_3        
    //   28   67:aload_0         
    //   29   68:getfield        #90  <Field AppLovinVideoOverlay videoOverlay>
    //   30   71:invokeinterface #205 <Method void AppLovinVideoOverlay.stopUnderlyingMediaPlayer()>
    //   31   76:aload_0         
    //   32   77:aconst_null     
    //   33   78:putfield        #90  <Field AppLovinVideoOverlay videoOverlay>
    // try 81 83 handler(s) 114
    //   34   81:aload_1         
    //   35   82:monitorexit     
    //   36   83:aload_0         
    //   37   84:aconst_null     
    //   38   85:putfield        #72  <Field AppLovinAd currentAd>
    //   39   88:aload_3         
    //   40   89:ifnull          108
    //   41   92:aload_0         
    //   42   93:getfield        #62  <Field Activity parentActivity>
    //   43   96:new             #207 <Class n>
    //   44   99:dup             
    //   45  100:aload_0         
    //   46  101:aload_3         
    //   47  102:invokespecial   #210 <Method void n(AdViewControllerJsInterface, android.view.View)>
    //   48  105:invokevirtual   #216 <Method void Activity.runOnUiThread(Runnable)>
    //   49  108:return          
    //   50  109:aconst_null     
    //   51  110:astore_3        
    //   52  111:goto            81
    // finally
    //   53  114:astore_2        
    // try 115 117 handler(s) 114
    //   54  115:aload_1         
    //   55  116:monitorexit     
    //   56  117:aload_2         
    //   57  118:athrow          
    }

    public void executeJS(String s)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #64  <Field v adWebView>
    //    2    4:new             #160 <Class StringBuilder>
    //    3    7:dup             
    //    4    8:invokespecial   #161 <Method void StringBuilder()>
    //    5   11:ldc1            #220 <String "javascript:">
    //    6   13:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
    //    7   16:aload_1         
    //    8   17:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
    //    9   20:invokevirtual   #180 <Method String StringBuilder.toString()>
    //   10   23:invokevirtual   #225 <Method void v.loadUrl(String)>
    //   11   26:aload_0         
    //   12   27:getfield        #60  <Field AppLovinLogger logger>
    //   13   30:getstatic       #38  <Field String TAG>
    //   14   33:new             #160 <Class StringBuilder>
    //   15   36:dup             
    //   16   37:invokespecial   #161 <Method void StringBuilder()>
    //   17   40:ldc1            #227 <String "Invoking JS on WebView: ">
    //   18   42:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
    //   19   45:aload_1         
    //   20   46:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
    //   21   49:invokevirtual   #180 <Method String StringBuilder.toString()>
    //   22   52:invokeinterface #80  <Method void AppLovinLogger.d(String, String)>
    //   23   57:return          
    }

    public int getPercentViewed()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #90  <Field AppLovinVideoOverlay videoOverlay>
    //    2    4:ifnonnull       9
    //    3    7:iconst_0        
    //    4    8:ireturn         
    //    5    9:aload_0         
    //    6   10:getfield        #90  <Field AppLovinVideoOverlay videoOverlay>
    //    7   13:invokeinterface #231 <Method int AppLovinVideoOverlay.getPercentViewed()>
    //    8   18:ireturn         
    }

    public int getPlaybackDuration()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #90  <Field AppLovinVideoOverlay videoOverlay>
    //    2    4:ifnull          17
    //    3    7:aload_0         
    //    4    8:getfield        #90  <Field AppLovinVideoOverlay videoOverlay>
    //    5   11:invokeinterface #235 <Method int AppLovinVideoOverlay.getDuration()>
    //    6   16:ireturn         
    //    7   17:aload_0         
    //    8   18:getfield        #237 <Field int lastKnownDuration>
    //    9   21:ireturn         
    }

    public int getPlaybackTime()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #90  <Field AppLovinVideoOverlay videoOverlay>
    //    2    4:ifnonnull       9
    //    3    7:iconst_0        
    //    4    8:ireturn         
    //    5    9:aload_0         
    //    6   10:getfield        #90  <Field AppLovinVideoOverlay videoOverlay>
    //    7   13:invokeinterface #240 <Method int AppLovinVideoOverlay.getPlaybackTime()>
    //    8   18:ireturn         
    }

    public void handleCommandInvocation(String s, Map map)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #60  <Field AppLovinLogger logger>
    //    2    4:getstatic       #38  <Field String TAG>
    //    3    7:new             #160 <Class StringBuilder>
    //    4   10:dup             
    //    5   11:invokespecial   #161 <Method void StringBuilder()>
    //    6   14:ldc1            #246 <String "Asked to invoke ">
    //    7   16:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
    //    8   19:aload_1         
    //    9   20:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
    //   10   23:ldc1            #248 <String " with parameters: ">
    //   11   25:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
    //   12   28:aload_2         
    //   13   29:invokevirtual   #249 <Method String Object.toString()>
    //   14   32:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
    //   15   35:invokevirtual   #180 <Method String StringBuilder.toString()>
    //   16   38:invokeinterface #80  <Method void AppLovinLogger.d(String, String)>
    // try 43 73 handler(s) 74
    //   17   43:aload_0         
    //   18   44:invokevirtual   #253 <Method Class Object.getClass()>
    //   19   47:aload_1         
    //   20   48:iconst_1        
    //   21   49:anewarray       Class[]
    //   22   52:dup             
    //   23   53:iconst_0        
    //   24   54:ldc1            #171 <Class Map>
    //   25   56:aastore         
    //   26   57:invokevirtual   #259 <Method Method Class.getDeclaredMethod(String, Class[])>
    //   27   60:aload_0         
    //   28   61:iconst_1        
    //   29   62:anewarray       Object[]
    //   30   65:dup             
    //   31   66:iconst_0        
    //   32   67:aload_2         
    //   33   68:aastore         
    //   34   69:invokevirtual   #265 <Method Object Method.invoke(Object, Object[])>
    //   35   72:pop             
    //   36   73:return          
    // catch Exception
    //   37   74:astore_3        
    //   38   75:aload_0         
    //   39   76:getfield        #60  <Field AppLovinLogger logger>
    //   40   79:getstatic       #38  <Field String TAG>
    //   41   82:new             #160 <Class StringBuilder>
    //   42   85:dup             
    //   43   86:invokespecial   #161 <Method void StringBuilder()>
    //   44   89:ldc2            #267 <String "Unable to invoke method: ">
    //   45   92:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
    //   46   95:aload_1         
    //   47   96:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
    //   48   99:invokevirtual   #180 <Method String StringBuilder.toString()>
    //   49  102:aload_3         
    //   50  103:invokeinterface #271 <Method void AppLovinLogger.e(String, String, Throwable)>
    //   51  108:return          
    }

    public void notifyJavaScriptOfNewState(AppLovinVideoPlaybackState applovinvideoplaybackstate)
    {
    //    0    0:ldc2            #275 <String "">
    //    1    3:astore_2        
    //    2    4:aload_1         
    //    3    5:getstatic       #195 <Field AppLovinVideoPlaybackState AppLovinVideoPlaybackState.PLAYING>
    //    4    8:if_acmpne       15
    //    5   11:ldc2            #277 <String "play">
    //    6   14:astore_2        
    //    7   15:aload_1         
    //    8   16:getstatic       #280 <Field AppLovinVideoPlaybackState AppLovinVideoPlaybackState.PAUSED>
    //    9   19:if_acmpne       26
    //   10   22:ldc2            #282 <String "pause">
    //   11   25:astore_2        
    //   12   26:aload_1         
    //   13   27:getstatic       #285 <Field AppLovinVideoPlaybackState AppLovinVideoPlaybackState.STOPPED>
    //   14   30:if_acmpne       37
    //   15   33:ldc2            #287 <String "stop">
    //   16   36:astore_2        
    //   17   37:aload_1         
    //   18   38:getstatic       #290 <Field AppLovinVideoPlaybackState AppLovinVideoPlaybackState.FAILED>
    //   19   41:if_acmpne       48
    //   20   44:ldc2            #292 <String "fail">
    //   21   47:astore_2        
    //   22   48:aload_0         
    //   23   49:getfield        #90  <Field AppLovinVideoOverlay videoOverlay>
    //   24   52:ifnull          126
    //   25   55:aload_0         
    //   26   56:getfield        #90  <Field AppLovinVideoOverlay videoOverlay>
    //   27   59:invokeinterface #231 <Method int AppLovinVideoOverlay.getPercentViewed()>
    //   28   64:i2f             
    //   29   65:invokestatic    #128 <Method int Math.round(float)>
    //   30   68:istore_3        
    //   31   69:aload_1         
    //   32   70:getstatic       #285 <Field AppLovinVideoPlaybackState AppLovinVideoPlaybackState.STOPPED>
    //   33   73:if_acmpne       85
    //   34   76:iload_3         
    //   35   77:bipush          98
    //   36   79:icmpge          85
    //   37   82:bipush          100
    //   38   84:istore_3        
    //   39   85:aload_0         
    //   40   86:new             #160 <Class StringBuilder>
    //   41   89:dup             
    //   42   90:invokespecial   #161 <Method void StringBuilder()>
    //   43   93:ldc2            #294 <String "onPlaybackChanged('">
    //   44   96:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
    //   45   99:aload_2         
    //   46  100:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
    //   47  103:ldc2            #296 <String "','">
    //   48  106:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
    //   49  109:iload_3         
    //   50  110:invokevirtual   #299 <Method StringBuilder StringBuilder.append(int)>
    //   51  113:ldc2            #301 <String "')">
    //   52  116:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
    //   53  119:invokevirtual   #180 <Method String StringBuilder.toString()>
    //   54  122:invokevirtual   #303 <Method void executeJS(String)>
    //   55  125:return          
    //   56  126:iconst_0        
    //   57  127:istore_3        
    //   58  128:goto            69
    }

    public void pauseVideo(Map map)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #44  <Field Object videoOverlayLock>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:monitorenter    
    // try 7 23 handler(s) 44
    //    5    7:aload_0         
    //    6    8:getfield        #90  <Field AppLovinVideoOverlay videoOverlay>
    //    7   11:ifnull          26
    //    8   14:aload_0         
    //    9   15:getfield        #90  <Field AppLovinVideoOverlay videoOverlay>
    //   10   18:invokeinterface #198 <Method void AppLovinVideoOverlay.requestPause()>
    // try 23 25 handler(s) 44
    //   11   23:aload_2         
    //   12   24:monitorexit     
    //   13   25:return          
    // try 26 41 handler(s) 44
    //   14   26:aload_0         
    //   15   27:getfield        #60  <Field AppLovinLogger logger>
    //   16   30:getstatic       #38  <Field String TAG>
    //   17   33:ldc2            #306 <String "Template issue: pauseVideo called before renderVideo.">
    //   18   36:invokeinterface #308 <Method void AppLovinLogger.e(String, String)>
    //   19   41:goto            23
    // finally
    //   20   44:astore_3        
    // try 45 47 handler(s) 44
    //   21   45:aload_2         
    //   22   46:monitorexit     
    //   23   47:aload_3         
    //   24   48:athrow          
    }

    public void ping(Map map)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #60  <Field AppLovinLogger logger>
    //    2    4:getstatic       #38  <Field String TAG>
    //    3    7:ldc2            #311 <String "Received ping request, invoking JS function ping(...)">
    //    4   10:invokeinterface #80  <Method void AppLovinLogger.d(String, String)>
    //    5   15:aload_0         
    //    6   16:ldc2            #313 <String "ping('Android SDK '5.2.2)">
    //    7   19:invokevirtual   #303 <Method void executeJS(String)>
    //    8   22:return          
    }

    public void playVideo(Map map)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #44  <Field Object videoOverlayLock>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:monitorenter    
    // try 7 23 handler(s) 60
    //    5    7:aload_0         
    //    6    8:getfield        #90  <Field AppLovinVideoOverlay videoOverlay>
    //    7   11:ifnull          26
    //    8   14:aload_0         
    //    9   15:getfield        #90  <Field AppLovinVideoOverlay videoOverlay>
    //   10   18:invokeinterface #317 <Method void AppLovinVideoOverlay.requestPlay()>
    // try 23 25 handler(s) 60
    //   11   23:aload_2         
    //   12   24:monitorexit     
    //   13   25:return          
    // try 26 57 handler(s) 60
    //   14   26:aload_0         
    //   15   27:getfield        #319 <Field Map lastParameters>
    //   16   30:ifnull          65
    //   17   33:aload_0         
    //   18   34:getfield        #319 <Field Map lastParameters>
    //   19   37:ldc2            #321 <String "autoplay">
    //   20   40:ldc2            #323 <String "true">
    //   21   43:invokeinterface #327 <Method Object Map.put(Object, Object)>
    //   22   48:pop             
    //   23   49:aload_0         
    //   24   50:aload_0         
    //   25   51:getfield        #319 <Field Map lastParameters>
    //   26   54:invokevirtual   #330 <Method void renderVideo(Map)>
    //   27   57:goto            23
    // finally
    //   28   60:astore_3        
    // try 61 63 handler(s) 60
    //   29   61:aload_2         
    //   30   62:monitorexit     
    //   31   63:aload_3         
    //   32   64:athrow          
    // try 65 80 handler(s) 60
    //   33   65:aload_0         
    //   34   66:getfield        #60  <Field AppLovinLogger logger>
    //   35   69:getstatic       #38  <Field String TAG>
    //   36   72:ldc2            #332 <String "Template issue: playVideo called before renderVideo.">
    //   37   75:invokeinterface #308 <Method void AppLovinLogger.e(String, String)>
    //   38   80:goto            23
    }

    public void renderVideo(Map map)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #319 <Field Map lastParameters>
    //    2    4:ifnonnull       12
    //    3    7:aload_0         
    //    4    8:aload_1         
    //    5    9:putfield        #319 <Field Map lastParameters>
    //    6   12:aload_0         
    //    7   13:iconst_0        
    //    8   14:putfield        #46  <Field boolean interruptNotify>
    //    9   17:aload_0         
    //   10   18:aload_1         
    //   11   19:ldc2            #334 <String "widthp">
    //   12   22:invokeinterface #175 <Method Object Map.get(Object)>
    //   13   27:checkcast       #177 <Class String>
    //   14   30:getstatic       #113 <Field r r.a>
    //   15   33:invokespecial   #336 <Method int calculateDimension(String, r)>
    //   16   36:istore_2        
    //   17   37:aload_0         
    //   18   38:aload_1         
    //   19   39:ldc2            #338 <String "heightp">
    //   20   42:invokeinterface #175 <Method Object Map.get(Object)>
    //   21   47:checkcast       #177 <Class String>
    //   22   50:getstatic       #131 <Field r r.b>
    //   23   53:invokespecial   #336 <Method int calculateDimension(String, r)>
    //   24   56:istore_3        
    //   25   57:aload_1         
    //   26   58:ldc2            #321 <String "autoplay">
    //   27   61:invokeinterface #175 <Method Object Map.get(Object)>
    //   28   66:checkcast       #177 <Class String>
    //   29   69:invokestatic    #344 <Method Boolean Boolean.valueOf(String)>
    //   30   72:astore          4
    //   31   74:aload_1         
    //   32   75:ldc2            #345 <String "x">
    //   33   78:invokeinterface #175 <Method Object Map.get(Object)>
    //   34   83:checkcast       #177 <Class String>
    //   35   86:invokestatic    #351 <Method int Integer.parseInt(String)>
    //   36   89:istore          5
    //   37   91:aload_1         
    //   38   92:ldc2            #352 <String "y">
    //   39   95:invokeinterface #175 <Method Object Map.get(Object)>
    //   40  100:checkcast       #177 <Class String>
    //   41  103:invokestatic    #351 <Method int Integer.parseInt(String)>
    //   42  106:istore          6
    //   43  108:aload_0         
    //   44  109:getfield        #68  <Field String videoFilename>
    //   45  112:ifnull          331
    //   46  115:aload_0         
    //   47  116:getfield        #44  <Field Object videoOverlayLock>
    //   48  119:astore          7
    //   49  121:aload           7
    //   50  123:monitorenter    
    // try 124 293 handler(s) 323
    //   51  124:aload_0         
    //   52  125:getfield        #90  <Field AppLovinVideoOverlay videoOverlay>
    //   53  128:ifnonnull       293
    //   54  131:aload_0         
    //   55  132:getfield        #68  <Field String videoFilename>
    //   56  135:aload_0         
    //   57  136:getfield        #62  <Field Activity parentActivity>
    //   58  139:invokestatic    #357 <Method java.io.File bg.a(String, android.content.Context)>
    //   59  142:astore          9
    //   60  144:aload_0         
    //   61  145:getfield        #60  <Field AppLovinLogger logger>
    //   62  148:getstatic       #38  <Field String TAG>
    //   63  151:new             #160 <Class StringBuilder>
    //   64  154:dup             
    //   65  155:invokespecial   #161 <Method void StringBuilder()>
    //   66  158:ldc2            #359 <String "Rending video from ">
    //   67  161:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
    //   68  164:aload           9
    //   69  166:invokevirtual   #362 <Method StringBuilder StringBuilder.append(Object)>
    //   70  169:ldc2            #364 <String " at (">
    //   71  172:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
    //   72  175:iload           5
    //   73  177:invokevirtual   #299 <Method StringBuilder StringBuilder.append(int)>
    //   74  180:ldc2            #366 <String ",">
    //   75  183:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
    //   76  186:iload           6
    //   77  188:invokevirtual   #299 <Method StringBuilder StringBuilder.append(int)>
    //   78  191:ldc2            #368 <String "), ">
    //   79  194:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
    //   80  197:iload_2         
    //   81  198:invokevirtual   #299 <Method StringBuilder StringBuilder.append(int)>
    //   82  201:ldc2            #345 <String "x">
    //   83  204:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
    //   84  207:iload_3         
    //   85  208:invokevirtual   #299 <Method StringBuilder StringBuilder.append(int)>
    //   86  211:ldc2            #370 <String " autoplay is ">
    //   87  214:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
    //   88  217:aload           4
    //   89  219:invokevirtual   #362 <Method StringBuilder StringBuilder.append(Object)>
    //   90  222:invokevirtual   #180 <Method String StringBuilder.toString()>
    //   91  225:invokeinterface #80  <Method void AppLovinLogger.d(String, String)>
    //   92  230:aload           9
    //   93  232:invokestatic    #376 <Method Uri Uri.fromFile(java.io.File)>
    //   94  235:astore          10
    //   95  237:new             #378 <Class o>
    //   96  240:dup             
    //   97  241:aload_0         
    //   98  242:invokespecial   #379 <Method void o(AdViewControllerJsInterface)>
    //   99  245:astore          11
    //  100  247:aload_0         
    //  101  248:new             #381 <Class AppLovinVideoOverlayImpl>
    //  102  251:dup             
    //  103  252:iload           5
    //  104  254:iload           6
    //  105  256:iload_2         
    //  106  257:iload_3         
    //  107  258:aload_0         
    //  108  259:getfield        #62  <Field Activity parentActivity>
    //  109  262:aload           10
    //  110  264:aload_0         
    //  111  265:getfield        #60  <Field AppLovinLogger logger>
    //  112  268:aload           11
    //  113  270:invokespecial   #384 <Method void AppLovinVideoOverlayImpl(int, int, int, int, Activity, Uri, AppLovinLogger, AppLovinVideoCallback)>
    //  114  273:putfield        #90  <Field AppLovinVideoOverlay videoOverlay>
    //  115  276:aload_0         
    //  116  277:getfield        #66  <Field ViewGroup parentView>
    //  117  280:aload_0         
    //  118  281:getfield        #90  <Field AppLovinVideoOverlay videoOverlay>
    //  119  284:invokeinterface #202 <Method android.widget.RelativeLayout AppLovinVideoOverlay.getVideoLayout()>
    //  120  289:iconst_0        
    //  121  290:invokevirtual   #390 <Method void ViewGroup.addView(android.view.View, int)>
    // try 293 309 handler(s) 323
    //  122  293:aload_0         
    //  123  294:aload_0         
    //  124  295:getfield        #90  <Field AppLovinVideoOverlay videoOverlay>
    //  125  298:invokeinterface #235 <Method int AppLovinVideoOverlay.getDuration()>
    //  126  303:putfield        #237 <Field int lastKnownDuration>
    //  127  306:aload           7
    //  128  308:monitorexit     
    //  129  309:aload           4
    //  130  311:invokevirtual   #394 <Method boolean Boolean.booleanValue()>
    //  131  314:ifeq            322
    //  132  317:aload_0         
    //  133  318:aconst_null     
    //  134  319:invokevirtual   #396 <Method void playVideo(Map)>
    //  135  322:return          
    // finally
    //  136  323:astore          8
    // try 325 328 handler(s) 323
    //  137  325:aload           7
    //  138  327:monitorexit     
    //  139  328:aload           8
    //  140  330:athrow          
    //  141  331:aload_0         
    //  142  332:getfield        #60  <Field AppLovinLogger logger>
    //  143  335:getstatic       #38  <Field String TAG>
    //  144  338:ldc2            #398 <String "renderVideo called before video filename was set">
    //  145  341:invokeinterface #308 <Method void AppLovinLogger.e(String, String)>
    //  146  346:return          
    }

    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener applovinadvideoplaybacklistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #70  <Field AppLovinAdVideoPlaybackListener adVideoPlaybackListener>
    //    3    5:return          
    }

    public void setCloseButtonHidden(Map map)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #60  <Field AppLovinLogger logger>
    //    2    4:getstatic       #38  <Field String TAG>
    //    3    7:ldc2            #403 <String "Ignoring a call to setCloseButtonHidden.">
    //    4   10:invokeinterface #80  <Method void AppLovinLogger.d(String, String)>
    //    5   15:return          
    }

    public void setPercentViewed(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #90  <Field AppLovinVideoOverlay videoOverlay>
    //    2    4:ifnonnull       15
    //    3    7:aload_0         
    //    4    8:aload_0         
    //    5    9:getfield        #319 <Field Map lastParameters>
    //    6   12:invokevirtual   #330 <Method void renderVideo(Map)>
    //    7   15:aload_0         
    //    8   16:getfield        #90  <Field AppLovinVideoOverlay videoOverlay>
    //    9   19:iload_1         
    //   10   20:invokeinterface #407 <Method void AppLovinVideoOverlay.setPercentViewed(int)>
    //   11   25:aload_0         
    //   12   26:invokespecial   #409 <Method void notifyOfNewTime()>
    //   13   29:return          
    }

    public void setPlaybackPercent(Map map)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:ldc2            #412 <String "percent">
    //    3    5:invokeinterface #175 <Method Object Map.get(Object)>
    //    4   10:checkcast       #177 <Class String>
    //    5   13:invokestatic    #351 <Method int Integer.parseInt(String)>
    //    6   16:invokevirtual   #413 <Method void setPercentViewed(int)>
    //    7   19:return          
    }

    public void setPlaybackTime(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #90  <Field AppLovinVideoOverlay videoOverlay>
    //    2    4:ifnonnull       15
    //    3    7:aload_0         
    //    4    8:aload_0         
    //    5    9:getfield        #319 <Field Map lastParameters>
    //    6   12:invokevirtual   #330 <Method void renderVideo(Map)>
    //    7   15:aload_0         
    //    8   16:getfield        #90  <Field AppLovinVideoOverlay videoOverlay>
    //    9   19:iload_1         
    //   10   20:invokeinterface #416 <Method void AppLovinVideoOverlay.setPlaybackTime(int)>
    //   11   25:aload_0         
    //   12   26:invokespecial   #409 <Method void notifyOfNewTime()>
    //   13   29:return          
    }

    public void setPlaybackTime(Map map)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:ldc2            #418 <String "seconds">
    //    3    5:invokeinterface #175 <Method Object Map.get(Object)>
    //    4   10:checkcast       #177 <Class String>
    //    5   13:invokestatic    #351 <Method int Integer.parseInt(String)>
    //    6   16:invokevirtual   #419 <Method void setPlaybackTime(int)>
    //    7   19:return          
    }

    public void setVideoFilename(String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #68  <Field String videoFilename>
    //    3    5:return          
    }

    public void stopVideo(Map map)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #423 <Method void pauseVideo(Map)>
    //    3    5:return          
    }

    private static String TAG;
    private AppLovinAdVideoPlaybackListener adVideoPlaybackListener;
    private v adWebView;
    private AppLovinAd currentAd;
    private volatile boolean currentlyWaiting;
    private volatile boolean interruptNotify;
    private int lastKnownDuration;
    private Map lastParameters;
    private AppLovinLogger logger;
    private Activity parentActivity;
    private ViewGroup parentView;
    private AppLovinSdkImpl sdk;
    private String videoFilename;
    private AppLovinVideoOverlay videoOverlay;
    private final Object videoOverlayLock;

    static ViewGroup access$000(AdViewControllerJsInterface adviewcontrollerjsinterface)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #66  <Field ViewGroup parentView>
    //    2    4:areturn         
    }

    static AppLovinAdVideoPlaybackListener access$100(AdViewControllerJsInterface adviewcontrollerjsinterface)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #70  <Field AppLovinAdVideoPlaybackListener adVideoPlaybackListener>
    //    2    4:areturn         
    }

    static AppLovinAd access$200(AdViewControllerJsInterface adviewcontrollerjsinterface)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #72  <Field AppLovinAd currentAd>
    //    2    4:areturn         
    }

    static AppLovinVideoOverlay access$300(AdViewControllerJsInterface adviewcontrollerjsinterface)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #90  <Field AppLovinVideoOverlay videoOverlay>
    //    2    4:areturn         
    }

    static String access$400()
    {
    //    0    0:getstatic       #38  <Field String TAG>
    //    1    3:areturn         
    }

    static boolean access$500(AdViewControllerJsInterface adviewcontrollerjsinterface)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #48  <Field boolean currentlyWaiting>
    //    2    4:ireturn         
    }

    static boolean access$502(AdViewControllerJsInterface adviewcontrollerjsinterface, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #48  <Field boolean currentlyWaiting>
    //    3    5:iload_1         
    //    4    6:ireturn         
    }

    static boolean access$600(AdViewControllerJsInterface adviewcontrollerjsinterface)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #46  <Field boolean interruptNotify>
    //    2    4:ireturn         
    }

    static boolean access$602(AdViewControllerJsInterface adviewcontrollerjsinterface, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #46  <Field boolean interruptNotify>
    //    3    5:iload_1         
    //    4    6:ireturn         
    }

    static Activity access$700(AdViewControllerJsInterface adviewcontrollerjsinterface)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #62  <Field Activity parentActivity>
    //    2    4:areturn         
    }
}
