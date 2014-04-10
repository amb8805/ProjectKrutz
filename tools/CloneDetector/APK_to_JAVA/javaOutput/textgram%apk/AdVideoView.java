// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads.internal;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.*;
import com.google.ads.m;
import com.google.ads.util.b;
import com.google.ads.util.f;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.ads.internal:
//            a, AdWebView

public class AdVideoView extends FrameLayout
    implements android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnPreparedListener
{
    private static class a
        implements Runnable
    {

        public a(AdVideoView advideoview)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #14  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:new             #16  <Class WeakReference>
        //    4    8:dup             
        //    5    9:aload_1         
        //    6   10:invokespecial   #19  <Method void WeakReference(Object)>
        //    7   13:putfield        #21  <Field WeakReference a>
        //    8   16:return          
        }

        public void a()
        {
        //    0    0:invokestatic    #26  <Method m m.a()>
        //    1    3:getfield        #30  <Field com.google.ads.util.i$b m.c>
        //    2    6:invokevirtual   #35  <Method Object com.google.ads.util.i$b.a()>
        //    3    9:checkcast       #37  <Class Handler>
        //    4   12:aload_0         
        //    5   13:ldc2w           #38  <Long 250L>
        //    6   16:invokevirtual   #43  <Method boolean Handler.postDelayed(Runnable, long)>
        //    7   19:pop             
        //    8   20:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field WeakReference a>
        //    2    4:invokevirtual   #47  <Method Object WeakReference.get()>
        //    3    7:checkcast       #49  <Class AdVideoView>
        //    4   10:astore_1        
        //    5   11:aload_1         
        //    6   12:ifnonnull       21
        //    7   15:ldc1            #51  <String "The video must be gone, so cancelling the timeupdate task.">
        //    8   17:invokestatic    #57  <Method void b.d(String)>
        //    9   20:return          
        //   10   21:aload_1         
        //   11   22:invokevirtual   #60  <Method void com.google.ads.internal.AdVideoView.f()>
        //   12   25:invokestatic    #26  <Method m m.a()>
        //   13   28:getfield        #30  <Field com.google.ads.util.i$b m.c>
        //   14   31:invokevirtual   #35  <Method Object com.google.ads.util.i$b.a()>
        //   15   34:checkcast       #37  <Class Handler>
        //   16   37:aload_0         
        //   17   38:ldc2w           #38  <Long 250L>
        //   18   41:invokevirtual   #43  <Method boolean Handler.postDelayed(Runnable, long)>
        //   19   44:pop             
        //   20   45:return          
        }

        private final WeakReference a;
    }


    static 
    {
    //    0    0:getstatic       #32  <Field f a.a>
    //    1    3:invokeinterface #37  <Method Object f.b()>
    //    2    8:checkcast       #29  <Class a>
    //    3   11:putstatic       #39  <Field a b>
    //    4   14:return          
    }

    public AdVideoView(Activity activity, AdWebView adwebview)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #44  <Method void FrameLayout(android.content.Context)>
    //    3    5:aload_0         
    //    4    6:new             #46  <Class WeakReference>
    //    5    9:dup             
    //    6   10:aload_1         
    //    7   11:invokespecial   #49  <Method void WeakReference(Object)>
    //    8   14:putfield        #51  <Field WeakReference c>
    //    9   17:aload_0         
    //   10   18:aload_2         
    //   11   19:putfield        #53  <Field AdWebView d>
    //   12   22:aload_0         
    //   13   23:new             #55  <Class VideoView>
    //   14   26:dup             
    //   15   27:aload_1         
    //   16   28:invokespecial   #56  <Method void VideoView(android.content.Context)>
    //   17   31:putfield        #58  <Field VideoView f>
    //   18   34:new             #60  <Class android.widget.FrameLayout$LayoutParams>
    //   19   37:dup             
    //   20   38:iconst_m1       
    //   21   39:iconst_m1       
    //   22   40:bipush          17
    //   23   42:invokespecial   #63  <Method void android.widget.FrameLayout$LayoutParams(int, int, int)>
    //   24   45:astore_3        
    //   25   46:aload_0         
    //   26   47:aload_0         
    //   27   48:getfield        #58  <Field VideoView f>
    //   28   51:aload_3         
    //   29   52:invokevirtual   #67  <Method void addView(android.view.View, android.view.ViewGroup$LayoutParams)>
    //   30   55:aload_0         
    //   31   56:aconst_null     
    //   32   57:putfield        #69  <Field MediaController a>
    //   33   60:aload_0         
    //   34   61:aconst_null     
    //   35   62:putfield        #71  <Field String g>
    //   36   65:aload_0         
    //   37   66:lconst_0        
    //   38   67:putfield        #73  <Field long e>
    //   39   70:aload_0         
    //   40   71:invokevirtual   #75  <Method void a()>
    //   41   74:aload_0         
    //   42   75:getfield        #58  <Field VideoView f>
    //   43   78:aload_0         
    //   44   79:invokevirtual   #79  <Method void VideoView.setOnCompletionListener(android.media.MediaPlayer$OnCompletionListener)>
    //   45   82:aload_0         
    //   46   83:getfield        #58  <Field VideoView f>
    //   47   86:aload_0         
    //   48   87:invokevirtual   #83  <Method void VideoView.setOnPreparedListener(android.media.MediaPlayer$OnPreparedListener)>
    //   49   90:aload_0         
    //   50   91:getfield        #58  <Field VideoView f>
    //   51   94:aload_0         
    //   52   95:invokevirtual   #87  <Method void VideoView.setOnErrorListener(android.media.MediaPlayer$OnErrorListener)>
    //   53   98:return          
    }

    protected void a()
    {
    //    0    0:new             #89  <Class AdVideoView$a>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #92  <Method void AdVideoView$a(AdVideoView)>
    //    4    8:invokevirtual   #93  <Method void AdVideoView$a.a()>
    //    5   11:return          
    }

    public void a(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #58  <Field VideoView f>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #97  <Method void VideoView.seekTo(int)>
    //    4    8:return          
    }

    public void a(MotionEvent motionevent)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #58  <Field VideoView f>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #102 <Method boolean VideoView.onTouchEvent(MotionEvent)>
    //    4    8:pop             
    //    5    9:return          
    }

    public void b()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #71  <Field String g>
    //    2    4:invokestatic    #108 <Method boolean TextUtils.isEmpty(CharSequence)>
    //    3    7:ifne            22
    //    4   10:aload_0         
    //    5   11:getfield        #58  <Field VideoView f>
    //    6   14:aload_0         
    //    7   15:getfield        #71  <Field String g>
    //    8   18:invokevirtual   #112 <Method void VideoView.setVideoPath(String)>
    //    9   21:return          
    //   10   22:getstatic       #39  <Field a b>
    //   11   25:aload_0         
    //   12   26:getfield        #53  <Field AdWebView d>
    //   13   29:ldc1            #114 <String "onVideoEvent">
    //   14   31:ldc1            #116 <String "{'event': 'error', 'what': 'no_src'}">
    //   15   33:invokevirtual   #119 <Method void a.a(android.webkit.WebView, String, String)>
    //   16   36:return          
    }

    public void c()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #58  <Field VideoView f>
    //    2    4:invokevirtual   #122 <Method void VideoView.pause()>
    //    3    7:return          
    }

    public void d()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #58  <Field VideoView f>
    //    2    4:invokevirtual   #125 <Method void VideoView.start()>
    //    3    7:return          
    }

    public void e()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #58  <Field VideoView f>
    //    2    4:invokevirtual   #128 <Method void VideoView.stopPlayback()>
    //    3    7:return          
    }

    void f()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #58  <Field VideoView f>
    //    2    4:invokevirtual   #132 <Method int VideoView.getCurrentPosition()>
    //    3    7:i2l             
    //    4    8:lstore_1        
    //    5    9:aload_0         
    //    6   10:getfield        #73  <Field long e>
    //    7   13:lload_1         
    //    8   14:lcmp            
    //    9   15:ifeq            65
    //   10   18:lload_1         
    //   11   19:l2f             
    //   12   20:ldc1            #133 <Float 1000F>
    //   13   22:fdiv            
    //   14   23:fstore_3        
    //   15   24:getstatic       #39  <Field a b>
    //   16   27:aload_0         
    //   17   28:getfield        #53  <Field AdWebView d>
    //   18   31:ldc1            #114 <String "onVideoEvent">
    //   19   33:new             #135 <Class StringBuilder>
    //   20   36:dup             
    //   21   37:invokespecial   #137 <Method void StringBuilder()>
    //   22   40:ldc1            #139 <String "{'event': 'timeupdate', 'time': ">
    //   23   42:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
    //   24   45:fload_3         
    //   25   46:invokevirtual   #146 <Method StringBuilder StringBuilder.append(float)>
    //   26   49:ldc1            #148 <String "}">
    //   27   51:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
    //   28   54:invokevirtual   #152 <Method String StringBuilder.toString()>
    //   29   57:invokevirtual   #119 <Method void a.a(android.webkit.WebView, String, String)>
    //   30   60:aload_0         
    //   31   61:lload_1         
    //   32   62:putfield        #73  <Field long e>
    //   33   65:return          
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
    //    0    0:getstatic       #39  <Field a b>
    //    1    3:aload_0         
    //    2    4:getfield        #53  <Field AdWebView d>
    //    3    7:ldc1            #114 <String "onVideoEvent">
    //    4    9:ldc1            #156 <String "{'event': 'ended'}">
    //    5   11:invokevirtual   #119 <Method void a.a(android.webkit.WebView, String, String)>
    //    6   14:return          
    }

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
    //    0    0:new             #135 <Class StringBuilder>
    //    1    3:dup             
    //    2    4:invokespecial   #137 <Method void StringBuilder()>
    //    3    7:ldc1            #160 <String "Video threw error! <what:">
    //    4    9:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
    //    5   12:iload_2         
    //    6   13:invokevirtual   #163 <Method StringBuilder StringBuilder.append(int)>
    //    7   16:ldc1            #165 <String ", extra:">
    //    8   18:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
    //    9   21:iload_3         
    //   10   22:invokevirtual   #163 <Method StringBuilder StringBuilder.append(int)>
    //   11   25:ldc1            #167 <String ">">
    //   12   27:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
    //   13   30:invokevirtual   #152 <Method String StringBuilder.toString()>
    //   14   33:invokestatic    #171 <Method void b.e(String)>
    //   15   36:getstatic       #39  <Field a b>
    //   16   39:aload_0         
    //   17   40:getfield        #53  <Field AdWebView d>
    //   18   43:ldc1            #114 <String "onVideoEvent">
    //   19   45:new             #135 <Class StringBuilder>
    //   20   48:dup             
    //   21   49:invokespecial   #137 <Method void StringBuilder()>
    //   22   52:ldc1            #173 <String "{'event': 'error', 'what': '">
    //   23   54:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
    //   24   57:iload_2         
    //   25   58:invokevirtual   #163 <Method StringBuilder StringBuilder.append(int)>
    //   26   61:ldc1            #175 <String "', 'extra': '">
    //   27   63:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
    //   28   66:iload_3         
    //   29   67:invokevirtual   #163 <Method StringBuilder StringBuilder.append(int)>
    //   30   70:ldc1            #177 <String "'}">
    //   31   72:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
    //   32   75:invokevirtual   #152 <Method String StringBuilder.toString()>
    //   33   78:invokevirtual   #119 <Method void a.a(android.webkit.WebView, String, String)>
    //   34   81:iconst_1        
    //   35   82:ireturn         
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #58  <Field VideoView f>
    //    2    4:invokevirtual   #181 <Method int VideoView.getDuration()>
    //    3    7:i2f             
    //    4    8:ldc1            #133 <Float 1000F>
    //    5   10:fdiv            
    //    6   11:fstore_2        
    //    7   12:getstatic       #39  <Field a b>
    //    8   15:aload_0         
    //    9   16:getfield        #53  <Field AdWebView d>
    //   10   19:ldc1            #114 <String "onVideoEvent">
    //   11   21:new             #135 <Class StringBuilder>
    //   12   24:dup             
    //   13   25:invokespecial   #137 <Method void StringBuilder()>
    //   14   28:ldc1            #183 <String "{'event': 'canplaythrough', 'duration': '">
    //   15   30:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
    //   16   33:fload_2         
    //   17   34:invokevirtual   #146 <Method StringBuilder StringBuilder.append(float)>
    //   18   37:ldc1            #177 <String "'}">
    //   19   39:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
    //   20   42:invokevirtual   #152 <Method String StringBuilder.toString()>
    //   21   45:invokevirtual   #119 <Method void a.a(android.webkit.WebView, String, String)>
    //   22   48:return          
    }

    public void setMediaControllerEnabled(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #51  <Field WeakReference c>
    //    2    4:invokevirtual   #188 <Method Object WeakReference.get()>
    //    3    7:checkcast       #190 <Class Activity>
    //    4   10:astore_2        
    //    5   11:aload_2         
    //    6   12:ifnonnull       21
    //    7   15:ldc1            #192 <String "adActivity was null while trying to enable controls on a video.">
    //    8   17:invokestatic    #171 <Method void b.e(String)>
    //    9   20:return          
    //   10   21:iload_1         
    //   11   22:ifeq            56
    //   12   25:aload_0         
    //   13   26:getfield        #69  <Field MediaController a>
    //   14   29:ifnonnull       44
    //   15   32:aload_0         
    //   16   33:new             #194 <Class MediaController>
    //   17   36:dup             
    //   18   37:aload_2         
    //   19   38:invokespecial   #195 <Method void MediaController(android.content.Context)>
    //   20   41:putfield        #69  <Field MediaController a>
    //   21   44:aload_0         
    //   22   45:getfield        #58  <Field VideoView f>
    //   23   48:aload_0         
    //   24   49:getfield        #69  <Field MediaController a>
    //   25   52:invokevirtual   #199 <Method void VideoView.setMediaController(MediaController)>
    //   26   55:return          
    //   27   56:aload_0         
    //   28   57:getfield        #69  <Field MediaController a>
    //   29   60:ifnull          70
    //   30   63:aload_0         
    //   31   64:getfield        #69  <Field MediaController a>
    //   32   67:invokevirtual   #202 <Method void MediaController.hide()>
    //   33   70:aload_0         
    //   34   71:getfield        #58  <Field VideoView f>
    //   35   74:aconst_null     
    //   36   75:invokevirtual   #199 <Method void VideoView.setMediaController(MediaController)>
    //   37   78:return          
    }

    public void setSrc(String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #71  <Field String g>
    //    3    5:return          
    }

    private static final com.google.ads.internal.a b;
    public MediaController a;
    private final WeakReference c;
    private final AdWebView d;
    private long e;
    private final VideoView f;
    private String g;
}
