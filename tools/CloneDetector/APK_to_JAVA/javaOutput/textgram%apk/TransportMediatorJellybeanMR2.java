// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.media;

import android.app.PendingIntent;
import android.content.*;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.util.Log;
import android.view.*;

// Referenced classes of package android.support.v4.media:
//            TransportMediatorCallback

class TransportMediatorJellybeanMR2
    implements android.media.RemoteControlClient.OnGetPlaybackPositionListener, android.media.RemoteControlClient.OnPlaybackPositionUpdateListener
{

    public TransportMediatorJellybeanMR2(Context context, AudioManager audiomanager, View view, TransportMediatorCallback transportmediatorcallback)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #44  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:new             #46  <Class TransportMediatorJellybeanMR2$1>
    //    4    8:dup             
    //    5    9:aload_0         
    //    6   10:invokespecial   #49  <Method void TransportMediatorJellybeanMR2$1(TransportMediatorJellybeanMR2)>
    //    7   13:putfield        #51  <Field android.view.ViewTreeObserver$OnWindowAttachListener mWindowAttachListener>
    //    8   16:aload_0         
    //    9   17:new             #53  <Class TransportMediatorJellybeanMR2$2>
    //   10   20:dup             
    //   11   21:aload_0         
    //   12   22:invokespecial   #54  <Method void TransportMediatorJellybeanMR2$2(TransportMediatorJellybeanMR2)>
    //   13   25:putfield        #56  <Field android.view.ViewTreeObserver$OnWindowFocusChangeListener mWindowFocusListener>
    //   14   28:aload_0         
    //   15   29:new             #58  <Class TransportMediatorJellybeanMR2$3>
    //   16   32:dup             
    //   17   33:aload_0         
    //   18   34:invokespecial   #59  <Method void TransportMediatorJellybeanMR2$3(TransportMediatorJellybeanMR2)>
    //   19   37:putfield        #61  <Field BroadcastReceiver mMediaButtonReceiver>
    //   20   40:aload_0         
    //   21   41:new             #63  <Class TransportMediatorJellybeanMR2$4>
    //   22   44:dup             
    //   23   45:aload_0         
    //   24   46:invokespecial   #64  <Method void TransportMediatorJellybeanMR2$4(TransportMediatorJellybeanMR2)>
    //   25   49:putfield        #66  <Field android.media.AudioManager$OnAudioFocusChangeListener mAudioFocusChangeListener>
    //   26   52:aload_0         
    //   27   53:iconst_0        
    //   28   54:putfield        #68  <Field int mPlayState>
    //   29   57:aload_0         
    //   30   58:aload_1         
    //   31   59:putfield        #70  <Field Context mContext>
    //   32   62:aload_0         
    //   33   63:aload_2         
    //   34   64:putfield        #72  <Field AudioManager mAudioManager>
    //   35   67:aload_0         
    //   36   68:aload_3         
    //   37   69:putfield        #74  <Field View mTargetView>
    //   38   72:aload_0         
    //   39   73:aload           4
    //   40   75:putfield        #76  <Field TransportMediatorCallback mTransportCallback>
    //   41   78:aload_0         
    //   42   79:new             #78  <Class StringBuilder>
    //   43   82:dup             
    //   44   83:invokespecial   #79  <Method void StringBuilder()>
    //   45   86:aload_1         
    //   46   87:invokevirtual   #85  <Method String Context.getPackageName()>
    //   47   90:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //   48   93:ldc1            #91  <String ":transport:">
    //   49   95:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
    //   50   98:aload_0         
    //   51   99:invokestatic    #97  <Method int System.identityHashCode(Object)>
    //   52  102:invokevirtual   #100 <Method StringBuilder StringBuilder.append(int)>
    //   53  105:invokevirtual   #103 <Method String StringBuilder.toString()>
    //   54  108:putfield        #105 <Field String mReceiverAction>
    //   55  111:aload_0         
    //   56  112:new             #107 <Class Intent>
    //   57  115:dup             
    //   58  116:aload_0         
    //   59  117:getfield        #105 <Field String mReceiverAction>
    //   60  120:invokespecial   #110 <Method void Intent(String)>
    //   61  123:putfield        #112 <Field Intent mIntent>
    //   62  126:aload_0         
    //   63  127:getfield        #112 <Field Intent mIntent>
    //   64  130:aload_1         
    //   65  131:invokevirtual   #85  <Method String Context.getPackageName()>
    //   66  134:invokevirtual   #116 <Method Intent Intent.setPackage(String)>
    //   67  137:pop             
    //   68  138:aload_0         
    //   69  139:new             #118 <Class IntentFilter>
    //   70  142:dup             
    //   71  143:invokespecial   #119 <Method void IntentFilter()>
    //   72  146:putfield        #121 <Field IntentFilter mReceiverFilter>
    //   73  149:aload_0         
    //   74  150:getfield        #121 <Field IntentFilter mReceiverFilter>
    //   75  153:aload_0         
    //   76  154:getfield        #105 <Field String mReceiverAction>
    //   77  157:invokevirtual   #124 <Method void IntentFilter.addAction(String)>
    //   78  160:aload_0         
    //   79  161:getfield        #74  <Field View mTargetView>
    //   80  164:invokevirtual   #130 <Method ViewTreeObserver View.getViewTreeObserver()>
    //   81  167:aload_0         
    //   82  168:getfield        #51  <Field android.view.ViewTreeObserver$OnWindowAttachListener mWindowAttachListener>
    //   83  171:invokevirtual   #136 <Method void ViewTreeObserver.addOnWindowAttachListener(android.view.ViewTreeObserver$OnWindowAttachListener)>
    //   84  174:aload_0         
    //   85  175:getfield        #74  <Field View mTargetView>
    //   86  178:invokevirtual   #130 <Method ViewTreeObserver View.getViewTreeObserver()>
    //   87  181:aload_0         
    //   88  182:getfield        #56  <Field android.view.ViewTreeObserver$OnWindowFocusChangeListener mWindowFocusListener>
    //   89  185:invokevirtual   #140 <Method void ViewTreeObserver.addOnWindowFocusChangeListener(android.view.ViewTreeObserver$OnWindowFocusChangeListener)>
    //   90  188:return          
    }

    public void destroy()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #144 <Method void windowDetached()>
    //    2    4:aload_0         
    //    3    5:getfield        #74  <Field View mTargetView>
    //    4    8:invokevirtual   #130 <Method ViewTreeObserver View.getViewTreeObserver()>
    //    5   11:aload_0         
    //    6   12:getfield        #51  <Field android.view.ViewTreeObserver$OnWindowAttachListener mWindowAttachListener>
    //    7   15:invokevirtual   #147 <Method void ViewTreeObserver.removeOnWindowAttachListener(android.view.ViewTreeObserver$OnWindowAttachListener)>
    //    8   18:aload_0         
    //    9   19:getfield        #74  <Field View mTargetView>
    //   10   22:invokevirtual   #130 <Method ViewTreeObserver View.getViewTreeObserver()>
    //   11   25:aload_0         
    //   12   26:getfield        #56  <Field android.view.ViewTreeObserver$OnWindowFocusChangeListener mWindowFocusListener>
    //   13   29:invokevirtual   #150 <Method void ViewTreeObserver.removeOnWindowFocusChangeListener(android.view.ViewTreeObserver$OnWindowFocusChangeListener)>
    //   14   32:return          
    }

    void dropAudioFocus()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #153 <Field boolean mAudioFocused>
    //    2    4:ifeq            24
    //    3    7:aload_0         
    //    4    8:iconst_0        
    //    5    9:putfield        #153 <Field boolean mAudioFocused>
    //    6   12:aload_0         
    //    7   13:getfield        #72  <Field AudioManager mAudioManager>
    //    8   16:aload_0         
    //    9   17:getfield        #66  <Field android.media.AudioManager$OnAudioFocusChangeListener mAudioFocusChangeListener>
    //   10   20:invokevirtual   #159 <Method int AudioManager.abandonAudioFocus(android.media.AudioManager$OnAudioFocusChangeListener)>
    //   11   23:pop             
    //   12   24:return          
    }

    void gainFocus()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #162 <Field boolean mFocused>
    //    2    4:ifne            46
    //    3    7:aload_0         
    //    4    8:iconst_1        
    //    5    9:putfield        #162 <Field boolean mFocused>
    //    6   12:aload_0         
    //    7   13:getfield        #72  <Field AudioManager mAudioManager>
    //    8   16:aload_0         
    //    9   17:getfield        #164 <Field PendingIntent mPendingIntent>
    //   10   20:invokevirtual   #168 <Method void AudioManager.registerMediaButtonEventReceiver(PendingIntent)>
    //   11   23:aload_0         
    //   12   24:getfield        #72  <Field AudioManager mAudioManager>
    //   13   27:aload_0         
    //   14   28:getfield        #170 <Field RemoteControlClient mRemoteControl>
    //   15   31:invokevirtual   #174 <Method void AudioManager.registerRemoteControlClient(RemoteControlClient)>
    //   16   34:aload_0         
    //   17   35:getfield        #68  <Field int mPlayState>
    //   18   38:iconst_3        
    //   19   39:icmpne          46
    //   20   42:aload_0         
    //   21   43:invokevirtual   #177 <Method void takeAudioFocus()>
    //   22   46:return          
    }

    public Object getRemoteControlClient()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #170 <Field RemoteControlClient mRemoteControl>
    //    2    4:areturn         
    }

    void loseFocus()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #182 <Method void dropAudioFocus()>
    //    2    4:aload_0         
    //    3    5:getfield        #162 <Field boolean mFocused>
    //    4    8:ifeq            38
    //    5   11:aload_0         
    //    6   12:iconst_0        
    //    7   13:putfield        #162 <Field boolean mFocused>
    //    8   16:aload_0         
    //    9   17:getfield        #72  <Field AudioManager mAudioManager>
    //   10   20:aload_0         
    //   11   21:getfield        #170 <Field RemoteControlClient mRemoteControl>
    //   12   24:invokevirtual   #185 <Method void AudioManager.unregisterRemoteControlClient(RemoteControlClient)>
    //   13   27:aload_0         
    //   14   28:getfield        #72  <Field AudioManager mAudioManager>
    //   15   31:aload_0         
    //   16   32:getfield        #164 <Field PendingIntent mPendingIntent>
    //   17   35:invokevirtual   #188 <Method void AudioManager.unregisterMediaButtonEventReceiver(PendingIntent)>
    //   18   38:return          
    }

    public long onGetPlaybackPosition()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #76  <Field TransportMediatorCallback mTransportCallback>
    //    2    4:invokeinterface #195 <Method long TransportMediatorCallback.getPlaybackPosition()>
    //    3    9:lreturn         
    }

    public void onPlaybackPositionUpdate(long l)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #76  <Field TransportMediatorCallback mTransportCallback>
    //    2    4:lload_1         
    //    3    5:invokeinterface #200 <Method void TransportMediatorCallback.playbackPositionUpdate(long)>
    //    4   10:return          
    }

    public void pausePlaying()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #68  <Field int mPlayState>
    //    2    4:iconst_3        
    //    3    5:icmpne          21
    //    4    8:aload_0         
    //    5    9:iconst_2        
    //    6   10:putfield        #68  <Field int mPlayState>
    //    7   13:aload_0         
    //    8   14:getfield        #170 <Field RemoteControlClient mRemoteControl>
    //    9   17:iconst_2        
    //   10   18:invokevirtual   #207 <Method void RemoteControlClient.setPlaybackState(int)>
    //   11   21:aload_0         
    //   12   22:invokevirtual   #182 <Method void dropAudioFocus()>
    //   13   25:return          
    }

    public void refreshState(boolean flag, long l, int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #170 <Field RemoteControlClient mRemoteControl>
    //    2    4:ifnull          46
    //    3    7:aload_0         
    //    4    8:getfield        #170 <Field RemoteControlClient mRemoteControl>
    //    5   11:astore          5
    //    6   13:iload_1         
    //    7   14:ifeq            47
    //    8   17:iconst_3        
    //    9   18:istore          6
    //   10   20:iload_1         
    //   11   21:ifeq            53
    //   12   24:fconst_1        
    //   13   25:fstore          7
    //   14   27:aload           5
    //   15   29:iload           6
    //   16   31:lload_2         
    //   17   32:fload           7
    //   18   34:invokevirtual   #212 <Method void RemoteControlClient.setPlaybackState(int, long, float)>
    //   19   37:aload_0         
    //   20   38:getfield        #170 <Field RemoteControlClient mRemoteControl>
    //   21   41:iload           4
    //   22   43:invokevirtual   #215 <Method void RemoteControlClient.setTransportControlFlags(int)>
    //   23   46:return          
    //   24   47:iconst_1        
    //   25   48:istore          6
    //   26   50:goto            20
    //   27   53:fconst_0        
    //   28   54:fstore          7
    //   29   56:goto            27
    }

    public void startPlaying()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #68  <Field int mPlayState>
    //    2    4:iconst_3        
    //    3    5:icmpeq          21
    //    4    8:aload_0         
    //    5    9:iconst_3        
    //    6   10:putfield        #68  <Field int mPlayState>
    //    7   13:aload_0         
    //    8   14:getfield        #170 <Field RemoteControlClient mRemoteControl>
    //    9   17:iconst_3        
    //   10   18:invokevirtual   #207 <Method void RemoteControlClient.setPlaybackState(int)>
    //   11   21:aload_0         
    //   12   22:getfield        #162 <Field boolean mFocused>
    //   13   25:ifeq            32
    //   14   28:aload_0         
    //   15   29:invokevirtual   #177 <Method void takeAudioFocus()>
    //   16   32:return          
    }

    public void stopPlaying()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #68  <Field int mPlayState>
    //    2    4:iconst_1        
    //    3    5:icmpeq          21
    //    4    8:aload_0         
    //    5    9:iconst_1        
    //    6   10:putfield        #68  <Field int mPlayState>
    //    7   13:aload_0         
    //    8   14:getfield        #170 <Field RemoteControlClient mRemoteControl>
    //    9   17:iconst_1        
    //   10   18:invokevirtual   #207 <Method void RemoteControlClient.setPlaybackState(int)>
    //   11   21:aload_0         
    //   12   22:invokevirtual   #182 <Method void dropAudioFocus()>
    //   13   25:return          
    }

    void takeAudioFocus()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #153 <Field boolean mAudioFocused>
    //    2    4:ifne            26
    //    3    7:aload_0         
    //    4    8:iconst_1        
    //    5    9:putfield        #153 <Field boolean mAudioFocused>
    //    6   12:aload_0         
    //    7   13:getfield        #72  <Field AudioManager mAudioManager>
    //    8   16:aload_0         
    //    9   17:getfield        #66  <Field android.media.AudioManager$OnAudioFocusChangeListener mAudioFocusChangeListener>
    //   10   20:iconst_3        
    //   11   21:iconst_1        
    //   12   22:invokevirtual   #221 <Method int AudioManager.requestAudioFocus(android.media.AudioManager$OnAudioFocusChangeListener, int, int)>
    //   13   25:pop             
    //   14   26:return          
    }

    void windowAttached()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #70  <Field Context mContext>
    //    2    4:aload_0         
    //    3    5:getfield        #61  <Field BroadcastReceiver mMediaButtonReceiver>
    //    4    8:aload_0         
    //    5    9:getfield        #121 <Field IntentFilter mReceiverFilter>
    //    6   12:invokevirtual   #226 <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
    //    7   15:pop             
    //    8   16:aload_0         
    //    9   17:aload_0         
    //   10   18:getfield        #70  <Field Context mContext>
    //   11   21:iconst_0        
    //   12   22:aload_0         
    //   13   23:getfield        #112 <Field Intent mIntent>
    //   14   26:ldc1            #227 <Int 0x10000000>
    //   15   28:invokestatic    #233 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
    //   16   31:putfield        #164 <Field PendingIntent mPendingIntent>
    //   17   34:aload_0         
    //   18   35:new             #203 <Class RemoteControlClient>
    //   19   38:dup             
    //   20   39:aload_0         
    //   21   40:getfield        #164 <Field PendingIntent mPendingIntent>
    //   22   43:invokespecial   #235 <Method void RemoteControlClient(PendingIntent)>
    //   23   46:putfield        #170 <Field RemoteControlClient mRemoteControl>
    //   24   49:aload_0         
    //   25   50:getfield        #170 <Field RemoteControlClient mRemoteControl>
    //   26   53:aload_0         
    //   27   54:invokevirtual   #239 <Method void RemoteControlClient.setOnGetPlaybackPositionListener(android.media.RemoteControlClient$OnGetPlaybackPositionListener)>
    //   28   57:aload_0         
    //   29   58:getfield        #170 <Field RemoteControlClient mRemoteControl>
    //   30   61:aload_0         
    //   31   62:invokevirtual   #243 <Method void RemoteControlClient.setPlaybackPositionUpdateListener(android.media.RemoteControlClient$OnPlaybackPositionUpdateListener)>
    //   32   65:return          
    }

    void windowDetached()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #245 <Method void loseFocus()>
    //    2    4:aload_0         
    //    3    5:getfield        #164 <Field PendingIntent mPendingIntent>
    //    4    8:ifnull          39
    //    5   11:aload_0         
    //    6   12:getfield        #70  <Field Context mContext>
    //    7   15:aload_0         
    //    8   16:getfield        #61  <Field BroadcastReceiver mMediaButtonReceiver>
    //    9   19:invokevirtual   #249 <Method void Context.unregisterReceiver(BroadcastReceiver)>
    //   10   22:aload_0         
    //   11   23:getfield        #164 <Field PendingIntent mPendingIntent>
    //   12   26:invokevirtual   #252 <Method void PendingIntent.cancel()>
    //   13   29:aload_0         
    //   14   30:aconst_null     
    //   15   31:putfield        #164 <Field PendingIntent mPendingIntent>
    //   16   34:aload_0         
    //   17   35:aconst_null     
    //   18   36:putfield        #170 <Field RemoteControlClient mRemoteControl>
    //   19   39:return          
    }

    android.media.AudioManager.OnAudioFocusChangeListener mAudioFocusChangeListener;
    boolean mAudioFocused;
    final AudioManager mAudioManager;
    final Context mContext;
    boolean mFocused;
    final Intent mIntent;
    final BroadcastReceiver mMediaButtonReceiver;
    PendingIntent mPendingIntent;
    int mPlayState;
    final String mReceiverAction;
    final IntentFilter mReceiverFilter;
    RemoteControlClient mRemoteControl;
    final View mTargetView;
    final TransportMediatorCallback mTransportCallback;
    final android.view.ViewTreeObserver.OnWindowAttachListener mWindowAttachListener;
    final android.view.ViewTreeObserver.OnWindowFocusChangeListener mWindowFocusListener;

    // Unreferenced inner class android/support/v4/media/TransportMediatorJellybeanMR2$1

/* anonymous class */
    class _cls1
        implements android.view.ViewTreeObserver.OnWindowAttachListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field TransportMediatorJellybeanMR2 this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public void onWindowAttached()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field TransportMediatorJellybeanMR2 this$0>
        //    2    4:invokevirtual   #21  <Method void TransportMediatorJellybeanMR2.windowAttached()>
        //    3    7:return          
        }

        public void onWindowDetached()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field TransportMediatorJellybeanMR2 this$0>
        //    2    4:invokevirtual   #25  <Method void TransportMediatorJellybeanMR2.windowDetached()>
        //    3    7:return          
        }

        final TransportMediatorJellybeanMR2 this$0;
    }


    // Unreferenced inner class android/support/v4/media/TransportMediatorJellybeanMR2$2

/* anonymous class */
    class _cls2
        implements android.view.ViewTreeObserver.OnWindowFocusChangeListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field TransportMediatorJellybeanMR2 this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public void onWindowFocusChanged(boolean flag)
        {
        //    0    0:iload_1         
        //    1    1:ifeq            12
        //    2    4:aload_0         
        //    3    5:getfield        #14  <Field TransportMediatorJellybeanMR2 this$0>
        //    4    8:invokevirtual   #22  <Method void TransportMediatorJellybeanMR2.gainFocus()>
        //    5   11:return          
        //    6   12:aload_0         
        //    7   13:getfield        #14  <Field TransportMediatorJellybeanMR2 this$0>
        //    8   16:invokevirtual   #25  <Method void TransportMediatorJellybeanMR2.loseFocus()>
        //    9   19:return          
        }

        final TransportMediatorJellybeanMR2 this$0;
    }


    // Unreferenced inner class android/support/v4/media/TransportMediatorJellybeanMR2$3

/* anonymous class */
    class _cls3 extends BroadcastReceiver
    {

        _cls3()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #12  <Field TransportMediatorJellybeanMR2 this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #15  <Method void BroadcastReceiver()>
        //    5    9:return          
        }

        public void onReceive(Context context, Intent intent)
        {
        // try 0 25 handler(s) 26
        //    0    0:aload_2         
        //    1    1:ldc1            #21  <String "android.intent.extra.KEY_EVENT">
        //    2    3:invokevirtual   #27  <Method android.os.Parcelable Intent.getParcelableExtra(String)>
        //    3    6:checkcast       #29  <Class KeyEvent>
        //    4    9:astore          5
        //    5   11:aload_0         
        //    6   12:getfield        #12  <Field TransportMediatorJellybeanMR2 this$0>
        //    7   15:getfield        #33  <Field TransportMediatorCallback TransportMediatorJellybeanMR2.mTransportCallback>
        //    8   18:aload           5
        //    9   20:invokeinterface #39  <Method void TransportMediatorCallback.handleKey(KeyEvent)>
        //   10   25:return          
        // catch ClassCastException
        //   11   26:astore_3        
        //   12   27:ldc1            #41  <String "TransportController">
        //   13   29:aload_3         
        //   14   30:invokestatic    #47  <Method int Log.w(String, Throwable)>
        //   15   33:pop             
        //   16   34:return          
        }

        final TransportMediatorJellybeanMR2 this$0;
    }


    // Unreferenced inner class android/support/v4/media/TransportMediatorJellybeanMR2$4

/* anonymous class */
    class _cls4
        implements android.media.AudioManager.OnAudioFocusChangeListener
    {

        _cls4()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #14  <Field TransportMediatorJellybeanMR2 this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #17  <Method void Object()>
        //    5    9:return          
        }

        public void onAudioFocusChange(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #14  <Field TransportMediatorJellybeanMR2 this$0>
        //    2    4:getfield        #23  <Field TransportMediatorCallback TransportMediatorJellybeanMR2.mTransportCallback>
        //    3    7:iload_1         
        //    4    8:invokeinterface #28  <Method void TransportMediatorCallback.handleAudioFocusChange(int)>
        //    5   13:return          
        }

        final TransportMediatorJellybeanMR2 this$0;
    }

}
