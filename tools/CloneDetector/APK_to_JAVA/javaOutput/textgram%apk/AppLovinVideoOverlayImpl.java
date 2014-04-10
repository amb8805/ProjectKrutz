// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.impl.adview;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinLogger;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.applovin.impl.adview:
//            AppLovinVideoOverlay, AppLovinVideoView, z, aa, 
//            AppLovinVideoPlaybackState, AppLovinVideoCallback

public class AppLovinVideoOverlayImpl
    implements AppLovinVideoOverlay
{

    static 
    {
    //    0    0:ldc1            #25  <String "AppLovinVideoOverlayImpl">
    //    1    2:putstatic       #27  <Field String a>
    //    2    5:return          
    }

    public AppLovinVideoOverlayImpl(int i, int j, int k, int l, Activity activity, Uri uri, AppLovinLogger applovinlogger, 
            AppLovinVideoCallback applovinvideocallback)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #31  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:new             #33  <Class AtomicReference>
    //    4    8:dup             
    //    5    9:invokespecial   #34  <Method void AtomicReference()>
    //    6   12:putfield        #36  <Field AtomicReference g>
    //    7   15:aload_0         
    //    8   16:new             #33  <Class AtomicReference>
    //    9   19:dup             
    //   10   20:invokespecial   #34  <Method void AtomicReference()>
    //   11   23:putfield        #38  <Field AtomicReference h>
    //   12   26:aload_0         
    //   13   27:aload           7
    //   14   29:putfield        #40  <Field AppLovinLogger b>
    //   15   32:aload_0         
    //   16   33:aload           8
    //   17   35:putfield        #42  <Field AppLovinVideoCallback c>
    //   18   38:aload_0         
    //   19   39:getfield        #36  <Field AtomicReference g>
    //   20   42:iconst_0        
    //   21   43:invokestatic    #48  <Method Boolean Boolean.valueOf(boolean)>
    //   22   46:invokevirtual   #52  <Method void AtomicReference.set(Object)>
    //   23   49:aload_0         
    //   24   50:getfield        #38  <Field AtomicReference h>
    //   25   53:iconst_0        
    //   26   54:invokestatic    #48  <Method Boolean Boolean.valueOf(boolean)>
    //   27   57:invokevirtual   #52  <Method void AtomicReference.set(Object)>
    //   28   60:new             #54  <Class android.widget.RelativeLayout$LayoutParams>
    //   29   63:dup             
    //   30   64:iload_3         
    //   31   65:iload           4
    //   32   67:invokespecial   #57  <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
    //   33   70:astore          9
    //   34   72:aload           9
    //   35   74:iload_1         
    //   36   75:putfield        #61  <Field int android.widget.RelativeLayout$LayoutParams.leftMargin>
    //   37   78:aload           9
    //   38   80:iload_2         
    //   39   81:putfield        #64  <Field int android.widget.RelativeLayout$LayoutParams.topMargin>
    //   40   84:aload_0         
    //   41   85:new             #66  <Class RelativeLayout>
    //   42   88:dup             
    //   43   89:aload           5
    //   44   91:invokespecial   #69  <Method void RelativeLayout(android.content.Context)>
    //   45   94:putfield        #71  <Field RelativeLayout e>
    //   46   97:aload_0         
    //   47   98:getfield        #71  <Field RelativeLayout e>
    //   48  101:aload           9
    //   49  103:invokevirtual   #75  <Method void RelativeLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
    //   50  106:aload_0         
    //   51  107:getfield        #71  <Field RelativeLayout e>
    //   52  110:ldc1            #76  <Int 0xff000000>
    //   53  112:invokevirtual   #80  <Method void RelativeLayout.setBackgroundColor(int)>
    //   54  115:aload_0         
    //   55  116:getfield        #71  <Field RelativeLayout e>
    //   56  119:bipush          17
    //   57  121:invokevirtual   #83  <Method void RelativeLayout.setGravity(int)>
    //   58  124:aload_0         
    //   59  125:new             #85  <Class AppLovinVideoView>
    //   60  128:dup             
    //   61  129:aload           5
    //   62  131:invokespecial   #86  <Method void AppLovinVideoView(android.content.Context)>
    //   63  134:putfield        #88  <Field AppLovinVideoView d>
    //   64  137:aload_0         
    //   65  138:getfield        #88  <Field AppLovinVideoView d>
    //   66  141:aload           6
    //   67  143:invokevirtual   #92  <Method void AppLovinVideoView.setVideoURI(Uri)>
    //   68  146:aload_0         
    //   69  147:getfield        #88  <Field AppLovinVideoView d>
    //   70  150:new             #54  <Class android.widget.RelativeLayout$LayoutParams>
    //   71  153:dup             
    //   72  154:iconst_m1       
    //   73  155:iconst_m1       
    //   74  156:invokespecial   #57  <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
    //   75  159:invokevirtual   #93  <Method void AppLovinVideoView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
    //   76  162:aload_0         
    //   77  163:getfield        #88  <Field AppLovinVideoView d>
    //   78  166:new             #95  <Class z>
    //   79  169:dup             
    //   80  170:aload_0         
    //   81  171:aload           7
    //   82  173:aload           8
    //   83  175:invokespecial   #98  <Method void z(AppLovinVideoOverlayImpl, AppLovinLogger, AppLovinVideoCallback)>
    //   84  178:invokevirtual   #102 <Method void AppLovinVideoView.setOnErrorListener(android.media.MediaPlayer$OnErrorListener)>
    //   85  181:aload_0         
    //   86  182:getfield        #88  <Field AppLovinVideoView d>
    //   87  185:new             #104 <Class aa>
    //   88  188:dup             
    //   89  189:aload_0         
    //   90  190:aload           8
    //   91  192:invokespecial   #107 <Method void aa(AppLovinVideoOverlayImpl, AppLovinVideoCallback)>
    //   92  195:invokevirtual   #111 <Method void AppLovinVideoView.setOnPreparedListener(android.media.MediaPlayer$OnPreparedListener)>
    //   93  198:aload_0         
    //   94  199:getfield        #71  <Field RelativeLayout e>
    //   95  202:aload_0         
    //   96  203:getfield        #88  <Field AppLovinVideoView d>
    //   97  206:invokevirtual   #115 <Method void RelativeLayout.addView(android.view.View)>
    //   98  209:return          
    }

    private int a(int i)
    {
    //    0    0:iload_1         
    //    1    1:sipush          1000
    //    2    4:idiv            
    //    3    5:ireturn         
    }

    static MediaPlayer a(AppLovinVideoOverlayImpl applovinvideooverlayimpl, MediaPlayer mediaplayer)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #119 <Field MediaPlayer f>
    //    3    5:aload_1         
    //    4    6:areturn         
    }

    static AppLovinVideoView a(AppLovinVideoOverlayImpl applovinvideooverlayimpl)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #88  <Field AppLovinVideoView d>
    //    2    4:areturn         
    }

    static String a()
    {
    //    0    0:getstatic       #27  <Field String a>
    //    1    3:areturn         
    }

    private int b(int i)
    {
    //    0    0:iload_1         
    //    1    1:sipush          1000
    //    2    4:imul            
    //    3    5:ireturn         
    }

    static AtomicReference b(AppLovinVideoOverlayImpl applovinvideooverlayimpl)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #36  <Field AtomicReference g>
    //    2    4:areturn         
    }

    static AtomicReference c(AppLovinVideoOverlayImpl applovinvideooverlayimpl)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #38  <Field AtomicReference h>
    //    2    4:areturn         
    }

    public int getDuration()
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #88  <Field AppLovinVideoView d>
    //    3    5:invokevirtual   #126 <Method int AppLovinVideoView.getDuration()>
    //    4    8:invokespecial   #128 <Method int a(int)>
    //    5   11:ireturn         
    }

    public int getPercentViewed()
    {
    //    0    0:ldc2w           #130 <Double 100D>
    //    1    3:aload_0         
    //    2    4:getfield        #88  <Field AppLovinVideoView d>
    //    3    7:invokevirtual   #134 <Method int AppLovinVideoView.getCurrentPosition()>
    //    4   10:i2d             
    //    5   11:aload_0         
    //    6   12:getfield        #88  <Field AppLovinVideoView d>
    //    7   15:invokevirtual   #126 <Method int AppLovinVideoView.getDuration()>
    //    8   18:i2d             
    //    9   19:ddiv            
    //   10   20:dmul            
    //   11   21:invokestatic    #140 <Method double Math.ceil(double)>
    //   12   24:d2i             
    //   13   25:istore_1        
    //   14   26:iload_1         
    //   15   27:bipush          100
    //   16   29:icmple          35
    //   17   32:bipush          100
    //   18   34:ireturn         
    //   19   35:iload_1         
    //   20   36:ireturn         
    }

    public AppLovinVideoPlaybackState getPlaybackState()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #88  <Field AppLovinVideoView d>
    //    2    4:invokevirtual   #146 <Method boolean AppLovinVideoView.isPlaying()>
    //    3    7:ifeq            14
    //    4   10:getstatic       #152 <Field AppLovinVideoPlaybackState AppLovinVideoPlaybackState.PLAYING>
    //    5   13:areturn         
    //    6   14:aload_0         
    //    7   15:invokevirtual   #154 <Method int getPercentViewed()>
    //    8   18:bipush          98
    //    9   20:icmple          27
    //   10   23:getstatic       #157 <Field AppLovinVideoPlaybackState AppLovinVideoPlaybackState.STOPPED>
    //   11   26:areturn         
    //   12   27:getstatic       #160 <Field AppLovinVideoPlaybackState AppLovinVideoPlaybackState.PAUSED>
    //   13   30:areturn         
    }

    public int getPlaybackTime()
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #88  <Field AppLovinVideoView d>
    //    3    5:invokevirtual   #134 <Method int AppLovinVideoView.getCurrentPosition()>
    //    4    8:invokespecial   #128 <Method int a(int)>
    //    5   11:ireturn         
    }

    public RelativeLayout getVideoLayout()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #71  <Field RelativeLayout e>
    //    2    4:areturn         
    }

    public void requestPause()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #88  <Field AppLovinVideoView d>
    //    2    4:invokevirtual   #167 <Method boolean AppLovinVideoView.canPause()>
    //    3    7:ifeq            29
    //    4   10:aload_0         
    //    5   11:getfield        #88  <Field AppLovinVideoView d>
    //    6   14:invokevirtual   #170 <Method void AppLovinVideoView.pause()>
    //    7   17:aload_0         
    //    8   18:getfield        #42  <Field AppLovinVideoCallback c>
    //    9   21:getstatic       #160 <Field AppLovinVideoPlaybackState AppLovinVideoPlaybackState.PAUSED>
    //   10   24:invokeinterface #176 <Method void AppLovinVideoCallback.onPlaybackStateChanged(AppLovinVideoPlaybackState)>
    //   11   29:return          
    }

    public void requestPlay()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #36  <Field AtomicReference g>
    //    2    4:invokevirtual   #181 <Method Object AtomicReference.get()>
    //    3    7:checkcast       #44  <Class Boolean>
    //    4   10:invokevirtual   #184 <Method boolean Boolean.booleanValue()>
    //    5   13:ifeq            46
    //    6   16:aload_0         
    //    7   17:getfield        #88  <Field AppLovinVideoView d>
    //    8   20:invokevirtual   #146 <Method boolean AppLovinVideoView.isPlaying()>
    //    9   23:ifne            45
    //   10   26:aload_0         
    //   11   27:getfield        #88  <Field AppLovinVideoView d>
    //   12   30:invokevirtual   #187 <Method void AppLovinVideoView.start()>
    //   13   33:aload_0         
    //   14   34:getfield        #42  <Field AppLovinVideoCallback c>
    //   15   37:getstatic       #152 <Field AppLovinVideoPlaybackState AppLovinVideoPlaybackState.PLAYING>
    //   16   40:invokeinterface #176 <Method void AppLovinVideoCallback.onPlaybackStateChanged(AppLovinVideoPlaybackState)>
    //   17   45:return          
    //   18   46:aload_0         
    //   19   47:getfield        #38  <Field AtomicReference h>
    //   20   50:iconst_1        
    //   21   51:invokestatic    #48  <Method Boolean Boolean.valueOf(boolean)>
    //   22   54:invokevirtual   #52  <Method void AtomicReference.set(Object)>
    //   23   57:return          
    }

    public void setPercentViewed(int i)
    {
    //    0    0:iload_1         
    //    1    1:bipush          100
    //    2    3:idiv            
    //    3    4:aload_0         
    //    4    5:getfield        #88  <Field AppLovinVideoView d>
    //    5    8:invokevirtual   #126 <Method int AppLovinVideoView.getDuration()>
    //    6   11:imul            
    //    7   12:istore_2        
    //    8   13:aload_0         
    //    9   14:getfield        #88  <Field AppLovinVideoView d>
    //   10   17:iload_2         
    //   11   18:invokevirtual   #191 <Method void AppLovinVideoView.seekTo(int)>
    //   12   21:return          
    }

    public void setPlaybackTime(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #88  <Field AppLovinVideoView d>
    //    2    4:aload_0         
    //    3    5:iload_1         
    //    4    6:invokespecial   #194 <Method int b(int)>
    //    5    9:invokevirtual   #191 <Method void AppLovinVideoView.seekTo(int)>
    //    6   12:return          
    }

    public void stopUnderlyingMediaPlayer()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #119 <Field MediaPlayer f>
    //    2    4:ifnull          14
    //    3    7:aload_0         
    //    4    8:getfield        #119 <Field MediaPlayer f>
    //    5   11:invokevirtual   #200 <Method void MediaPlayer.stop()>
    //    6   14:return          
    }

    private static String a;
    private final AppLovinLogger b;
    private final AppLovinVideoCallback c;
    private AppLovinVideoView d;
    private RelativeLayout e;
    private MediaPlayer f;
    private AtomicReference g;
    private AtomicReference h;
}
