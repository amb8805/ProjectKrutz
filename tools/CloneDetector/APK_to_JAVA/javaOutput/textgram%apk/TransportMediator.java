// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.media;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.support.v4.view.KeyEventCompat;
import android.view.*;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.media:
//            TransportController, TransportMediatorJellybeanMR2, TransportStateListener, TransportPerformer, 
//            TransportMediatorCallback

public class TransportMediator extends TransportController
{

    public TransportMediator(Activity activity, TransportPerformer transportperformer)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aconst_null     
    //    3    3:aload_2         
    //    4    4:invokespecial   #51  <Method void TransportMediator(Activity, View, TransportPerformer)>
    //    5    7:return          
    }

    private TransportMediator(Activity activity, View view, TransportPerformer transportperformer)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #54  <Method void TransportController()>
    //    2    4:aload_0         
    //    3    5:new             #56  <Class ArrayList>
    //    4    8:dup             
    //    5    9:invokespecial   #57  <Method void ArrayList()>
    //    6   12:putfield        #59  <Field ArrayList mListeners>
    //    7   15:aload_0         
    //    8   16:new             #61  <Class TransportMediator$1>
    //    9   19:dup             
    //   10   20:aload_0         
    //   11   21:invokespecial   #64  <Method void TransportMediator$1(TransportMediator)>
    //   12   24:putfield        #66  <Field TransportMediatorCallback mTransportKeyCallback>
    //   13   27:aload_0         
    //   14   28:new             #68  <Class TransportMediator$2>
    //   15   31:dup             
    //   16   32:aload_0         
    //   17   33:invokespecial   #69  <Method void TransportMediator$2(TransportMediator)>
    //   18   36:putfield        #71  <Field android.view.KeyEvent$Callback mKeyEventCallback>
    //   19   39:aload_1         
    //   20   40:ifnull          137
    //   21   43:aload_1         
    //   22   44:astore          4
    //   23   46:aload_0         
    //   24   47:aload           4
    //   25   49:putfield        #73  <Field Context mContext>
    //   26   52:aload_0         
    //   27   53:aload_3         
    //   28   54:putfield        #75  <Field TransportPerformer mCallbacks>
    //   29   57:aload_0         
    //   30   58:aload_0         
    //   31   59:getfield        #73  <Field Context mContext>
    //   32   62:ldc1            #77  <String "audio">
    //   33   64:invokevirtual   #83  <Method Object Context.getSystemService(String)>
    //   34   67:checkcast       #85  <Class AudioManager>
    //   35   70:putfield        #87  <Field AudioManager mAudioManager>
    //   36   73:aload_1         
    //   37   74:ifnull          85
    //   38   77:aload_1         
    //   39   78:invokevirtual   #93  <Method Window Activity.getWindow()>
    //   40   81:invokevirtual   #99  <Method View Window.getDecorView()>
    //   41   84:astore_2        
    //   42   85:aload_0         
    //   43   86:aload_2         
    //   44   87:putfield        #101 <Field View mView>
    //   45   90:aload_0         
    //   46   91:aload_0         
    //   47   92:getfield        #101 <Field View mView>
    //   48   95:invokestatic    #107 <Method Object KeyEventCompat.getKeyDispatcherState(View)>
    //   49   98:putfield        #109 <Field Object mDispatcherState>
    //   50  101:getstatic       #114 <Field int android.os.Build$VERSION.SDK_INT>
    //   51  104:bipush          18
    //   52  106:icmplt          146
    //   53  109:aload_0         
    //   54  110:new             #116 <Class TransportMediatorJellybeanMR2>
    //   55  113:dup             
    //   56  114:aload_0         
    //   57  115:getfield        #73  <Field Context mContext>
    //   58  118:aload_0         
    //   59  119:getfield        #87  <Field AudioManager mAudioManager>
    //   60  122:aload_0         
    //   61  123:getfield        #101 <Field View mView>
    //   62  126:aload_0         
    //   63  127:getfield        #66  <Field TransportMediatorCallback mTransportKeyCallback>
    //   64  130:invokespecial   #119 <Method void TransportMediatorJellybeanMR2(Context, AudioManager, View, TransportMediatorCallback)>
    //   65  133:putfield        #121 <Field TransportMediatorJellybeanMR2 mController>
    //   66  136:return          
    //   67  137:aload_2         
    //   68  138:invokevirtual   #127 <Method Context View.getContext()>
    //   69  141:astore          4
    //   70  143:goto            46
    //   71  146:aload_0         
    //   72  147:aconst_null     
    //   73  148:putfield        #121 <Field TransportMediatorJellybeanMR2 mController>
    //   74  151:return          
    }

    public TransportMediator(View view, TransportPerformer transportperformer)
    {
    //    0    0:aload_0         
    //    1    1:aconst_null     
    //    2    2:aload_1         
    //    3    3:aload_2         
    //    4    4:invokespecial   #51  <Method void TransportMediator(Activity, View, TransportPerformer)>
    //    5    7:return          
    }

    private TransportStateListener[] getListeners()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #59  <Field ArrayList mListeners>
    //    2    4:invokevirtual   #134 <Method int ArrayList.size()>
    //    3    7:ifgt            12
    //    4   10:aconst_null     
    //    5   11:areturn         
    //    6   12:aload_0         
    //    7   13:getfield        #59  <Field ArrayList mListeners>
    //    8   16:invokevirtual   #134 <Method int ArrayList.size()>
    //    9   19:anewarray       TransportStateListener[]
    //   10   22:astore_1        
    //   11   23:aload_0         
    //   12   24:getfield        #59  <Field ArrayList mListeners>
    //   13   27:aload_1         
    //   14   28:invokevirtual   #140 <Method Object[] ArrayList.toArray(Object[])>
    //   15   31:pop             
    //   16   32:aload_1         
    //   17   33:areturn         
    }

    static boolean isMediaKey(int i)
    {
    //    0    0:iload_0         
    //    1    1:lookupswitch    11: default 100
    //                   79: 102
    //                   85: 102
    //                   86: 102
    //                   87: 102
    //                   88: 102
    //                   89: 102
    //                   90: 102
    //                   91: 102
    //                   126: 102
    //                   127: 102
    //                   130: 102
    //    2  100:iconst_0        
    //    3  101:ireturn         
    //    4  102:iconst_1        
    //    5  103:ireturn         
    }

    private void pushControllerState()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #121 <Field TransportMediatorJellybeanMR2 mController>
    //    2    4:ifnull          35
    //    3    7:aload_0         
    //    4    8:getfield        #121 <Field TransportMediatorJellybeanMR2 mController>
    //    5   11:aload_0         
    //    6   12:getfield        #75  <Field TransportPerformer mCallbacks>
    //    7   15:invokevirtual   #149 <Method boolean TransportPerformer.onIsPlaying()>
    //    8   18:aload_0         
    //    9   19:getfield        #75  <Field TransportPerformer mCallbacks>
    //   10   22:invokevirtual   #153 <Method long TransportPerformer.onGetCurrentPosition()>
    //   11   25:aload_0         
    //   12   26:getfield        #75  <Field TransportPerformer mCallbacks>
    //   13   29:invokevirtual   #156 <Method int TransportPerformer.onGetTransportControlFlags()>
    //   14   32:invokevirtual   #160 <Method void TransportMediatorJellybeanMR2.refreshState(boolean, long, int)>
    //   15   35:return          
    }

    private void reportPlayingChanged()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #163 <Method TransportStateListener[] getListeners()>
    //    2    4:astore_1        
    //    3    5:aload_1         
    //    4    6:ifnull          32
    //    5    9:aload_1         
    //    6   10:arraylength     
    //    7   11:istore_2        
    //    8   12:iconst_0        
    //    9   13:istore_3        
    //   10   14:iload_3         
    //   11   15:iload_2         
    //   12   16:icmpge          32
    //   13   19:aload_1         
    //   14   20:iload_3         
    //   15   21:aaload          
    //   16   22:aload_0         
    //   17   23:invokevirtual   #167 <Method void TransportStateListener.onPlayingChanged(TransportController)>
    //   18   26:iinc            3  1
    //   19   29:goto            14
    //   20   32:return          
    }

    private void reportTransportControlsChanged()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #163 <Method TransportStateListener[] getListeners()>
    //    2    4:astore_1        
    //    3    5:aload_1         
    //    4    6:ifnull          32
    //    5    9:aload_1         
    //    6   10:arraylength     
    //    7   11:istore_2        
    //    8   12:iconst_0        
    //    9   13:istore_3        
    //   10   14:iload_3         
    //   11   15:iload_2         
    //   12   16:icmpge          32
    //   13   19:aload_1         
    //   14   20:iload_3         
    //   15   21:aaload          
    //   16   22:aload_0         
    //   17   23:invokevirtual   #171 <Method void TransportStateListener.onTransportControlsChanged(TransportController)>
    //   18   26:iinc            3  1
    //   19   29:goto            14
    //   20   32:return          
    }

    public void destroy()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #121 <Field TransportMediatorJellybeanMR2 mController>
    //    2    4:invokevirtual   #174 <Method void TransportMediatorJellybeanMR2.destroy()>
    //    3    7:return          
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
    //    0    0:aload_1         
    //    1    1:aload_0         
    //    2    2:getfield        #71  <Field android.view.KeyEvent$Callback mKeyEventCallback>
    //    3    5:aload_0         
    //    4    6:getfield        #109 <Field Object mDispatcherState>
    //    5    9:aload_0         
    //    6   10:invokestatic    #180 <Method boolean KeyEventCompat.dispatch(KeyEvent, android.view.KeyEvent$Callback, Object, Object)>
    //    7   13:ireturn         
    }

    public int getBufferPercentage()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #75  <Field TransportPerformer mCallbacks>
    //    2    4:invokevirtual   #184 <Method int TransportPerformer.onGetBufferPercentage()>
    //    3    7:ireturn         
    }

    public long getCurrentPosition()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #75  <Field TransportPerformer mCallbacks>
    //    2    4:invokevirtual   #153 <Method long TransportPerformer.onGetCurrentPosition()>
    //    3    7:lreturn         
    }

    public long getDuration()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #75  <Field TransportPerformer mCallbacks>
    //    2    4:invokevirtual   #189 <Method long TransportPerformer.onGetDuration()>
    //    3    7:lreturn         
    }

    public Object getRemoteControlClient()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #121 <Field TransportMediatorJellybeanMR2 mController>
    //    2    4:ifnull          15
    //    3    7:aload_0         
    //    4    8:getfield        #121 <Field TransportMediatorJellybeanMR2 mController>
    //    5   11:invokevirtual   #193 <Method Object TransportMediatorJellybeanMR2.getRemoteControlClient()>
    //    6   14:areturn         
    //    7   15:aconst_null     
    //    8   16:areturn         
    }

    public int getTransportControlFlags()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #75  <Field TransportPerformer mCallbacks>
    //    2    4:invokevirtual   #156 <Method int TransportPerformer.onGetTransportControlFlags()>
    //    3    7:ireturn         
    }

    public boolean isPlaying()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #75  <Field TransportPerformer mCallbacks>
    //    2    4:invokevirtual   #149 <Method boolean TransportPerformer.onIsPlaying()>
    //    3    7:ireturn         
    }

    public void pausePlaying()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #121 <Field TransportMediatorJellybeanMR2 mController>
    //    2    4:ifnull          14
    //    3    7:aload_0         
    //    4    8:getfield        #121 <Field TransportMediatorJellybeanMR2 mController>
    //    5   11:invokevirtual   #198 <Method void TransportMediatorJellybeanMR2.pausePlaying()>
    //    6   14:aload_0         
    //    7   15:getfield        #75  <Field TransportPerformer mCallbacks>
    //    8   18:invokevirtual   #201 <Method void TransportPerformer.onPause()>
    //    9   21:aload_0         
    //   10   22:invokespecial   #203 <Method void pushControllerState()>
    //   11   25:aload_0         
    //   12   26:invokespecial   #205 <Method void reportPlayingChanged()>
    //   13   29:return          
    }

    public void refreshState()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #203 <Method void pushControllerState()>
    //    2    4:aload_0         
    //    3    5:invokespecial   #205 <Method void reportPlayingChanged()>
    //    4    8:aload_0         
    //    5    9:invokespecial   #207 <Method void reportTransportControlsChanged()>
    //    6   12:return          
    }

    public void registerStateListener(TransportStateListener transportstatelistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #59  <Field ArrayList mListeners>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #213 <Method boolean ArrayList.add(Object)>
    //    4    8:pop             
    //    5    9:return          
    }

    public void seekTo(long l)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #75  <Field TransportPerformer mCallbacks>
    //    2    4:lload_1         
    //    3    5:invokevirtual   #218 <Method void TransportPerformer.onSeekTo(long)>
    //    4    8:return          
    }

    public void startPlaying()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #121 <Field TransportMediatorJellybeanMR2 mController>
    //    2    4:ifnull          14
    //    3    7:aload_0         
    //    4    8:getfield        #121 <Field TransportMediatorJellybeanMR2 mController>
    //    5   11:invokevirtual   #221 <Method void TransportMediatorJellybeanMR2.startPlaying()>
    //    6   14:aload_0         
    //    7   15:getfield        #75  <Field TransportPerformer mCallbacks>
    //    8   18:invokevirtual   #224 <Method void TransportPerformer.onStart()>
    //    9   21:aload_0         
    //   10   22:invokespecial   #203 <Method void pushControllerState()>
    //   11   25:aload_0         
    //   12   26:invokespecial   #205 <Method void reportPlayingChanged()>
    //   13   29:return          
    }

    public void stopPlaying()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #121 <Field TransportMediatorJellybeanMR2 mController>
    //    2    4:ifnull          14
    //    3    7:aload_0         
    //    4    8:getfield        #121 <Field TransportMediatorJellybeanMR2 mController>
    //    5   11:invokevirtual   #227 <Method void TransportMediatorJellybeanMR2.stopPlaying()>
    //    6   14:aload_0         
    //    7   15:getfield        #75  <Field TransportPerformer mCallbacks>
    //    8   18:invokevirtual   #230 <Method void TransportPerformer.onStop()>
    //    9   21:aload_0         
    //   10   22:invokespecial   #203 <Method void pushControllerState()>
    //   11   25:aload_0         
    //   12   26:invokespecial   #205 <Method void reportPlayingChanged()>
    //   13   29:return          
    }

    public void unregisterStateListener(TransportStateListener transportstatelistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #59  <Field ArrayList mListeners>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #234 <Method boolean ArrayList.remove(Object)>
    //    4    8:pop             
    //    5    9:return          
    }

    public static final int FLAG_KEY_MEDIA_FAST_FORWARD = 64;
    public static final int FLAG_KEY_MEDIA_NEXT = 128;
    public static final int FLAG_KEY_MEDIA_PAUSE = 16;
    public static final int FLAG_KEY_MEDIA_PLAY = 4;
    public static final int FLAG_KEY_MEDIA_PLAY_PAUSE = 8;
    public static final int FLAG_KEY_MEDIA_PREVIOUS = 1;
    public static final int FLAG_KEY_MEDIA_REWIND = 2;
    public static final int FLAG_KEY_MEDIA_STOP = 32;
    public static final int KEYCODE_MEDIA_PAUSE = 127;
    public static final int KEYCODE_MEDIA_PLAY = 126;
    public static final int KEYCODE_MEDIA_RECORD = 130;
    final AudioManager mAudioManager;
    final TransportPerformer mCallbacks;
    final Context mContext;
    final TransportMediatorJellybeanMR2 mController;
    final Object mDispatcherState;
    final android.view.KeyEvent.Callback mKeyEventCallback;
    final ArrayList mListeners;
    final TransportMediatorCallback mTransportKeyCallback;
    final View mView;

    // Unreferenced inner class android/support/v4/media/TransportMediator$1

/* anonymous class */
    class _cls1
        implements TransportMediatorCallback
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field TransportMediator this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public long getPlaybackPosition()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field TransportMediator this$0>
        //    2    4:getfield        #23  <Field TransportPerformer TransportMediator.mCallbacks>
        //    3    7:invokevirtual   #28  <Method long TransportPerformer.onGetCurrentPosition()>
        //    4   10:lreturn         
        }

        public void handleAudioFocusChange(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field TransportMediator this$0>
        //    2    4:getfield        #23  <Field TransportPerformer TransportMediator.mCallbacks>
        //    3    7:iload_1         
        //    4    8:invokevirtual   #33  <Method void TransportPerformer.onAudioFocusChange(int)>
        //    5   11:return          
        }

        public void handleKey(KeyEvent keyevent)
        {
        //    0    0:aload_1         
        //    1    1:aload_0         
        //    2    2:getfield        #14  <Field TransportMediator this$0>
        //    3    5:getfield        #39  <Field android.view.KeyEvent$Callback TransportMediator.mKeyEventCallback>
        //    4    8:invokevirtual   #45  <Method boolean KeyEvent.dispatch(android.view.KeyEvent$Callback)>
        //    5   11:pop             
        //    6   12:return          
        }

        public void playbackPositionUpdate(long l)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field TransportMediator this$0>
        //    2    4:getfield        #23  <Field TransportPerformer TransportMediator.mCallbacks>
        //    3    7:lload_1         
        //    4    8:invokevirtual   #50  <Method void TransportPerformer.onSeekTo(long)>
        //    5   11:return          
        }

        final TransportMediator this$0;
    }


    // Unreferenced inner class android/support/v4/media/TransportMediator$2

/* anonymous class */
    class _cls2
        implements android.view.KeyEvent.Callback
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field TransportMediator this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public boolean onKeyDown(int i, KeyEvent keyevent)
        {
        //    0    0:iload_1         
        //    1    1:invokestatic    #23  <Method boolean TransportMediator.isMediaKey(int)>
        //    2    4:ifeq            20
        //    3    7:aload_0         
        //    4    8:getfield        #14  <Field TransportMediator this$0>
        //    5   11:getfield        #27  <Field TransportPerformer TransportMediator.mCallbacks>
        //    6   14:iload_1         
        //    7   15:aload_2         
        //    8   16:invokevirtual   #32  <Method boolean TransportPerformer.onMediaButtonDown(int, KeyEvent)>
        //    9   19:ireturn         
        //   10   20:iconst_0        
        //   11   21:ireturn         
        }

        public boolean onKeyLongPress(int i, KeyEvent keyevent)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public boolean onKeyMultiple(int i, int j, KeyEvent keyevent)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public boolean onKeyUp(int i, KeyEvent keyevent)
        {
        //    0    0:iload_1         
        //    1    1:invokestatic    #23  <Method boolean TransportMediator.isMediaKey(int)>
        //    2    4:ifeq            20
        //    3    7:aload_0         
        //    4    8:getfield        #14  <Field TransportMediator this$0>
        //    5   11:getfield        #27  <Field TransportPerformer TransportMediator.mCallbacks>
        //    6   14:iload_1         
        //    7   15:aload_2         
        //    8   16:invokevirtual   #39  <Method boolean TransportPerformer.onMediaButtonUp(int, KeyEvent)>
        //    9   19:ireturn         
        //   10   20:iconst_0        
        //   11   21:ireturn         
        }

        final TransportMediator this$0;
    }

}
