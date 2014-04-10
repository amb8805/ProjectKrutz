// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.media;

import android.os.SystemClock;
import android.view.KeyEvent;

public abstract class TransportPerformer
{

    public TransportPerformer()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #21  <Method void Object()>
    //    2    4:return          
    }

    public void onAudioFocusChange(int i)
    {
    //    0    0:iconst_0        
    //    1    1:istore_2        
    //    2    2:iload_1         
    //    3    3:tableswitch     -1 -1: default 20
    //                   -1 65
    //    4   20:iload_2         
    //    5   21:ifeq            64
    //    6   24:invokestatic    #29  <Method long SystemClock.uptimeMillis()>
    //    7   27:lstore_3        
    //    8   28:aload_0         
    //    9   29:iload_2         
    //   10   30:new             #31  <Class KeyEvent>
    //   11   33:dup             
    //   12   34:lload_3         
    //   13   35:lload_3         
    //   14   36:iconst_0        
    //   15   37:iload_2         
    //   16   38:iconst_0        
    //   17   39:invokespecial   #34  <Method void KeyEvent(long, long, int, int, int)>
    //   18   42:invokevirtual   #38  <Method boolean onMediaButtonDown(int, KeyEvent)>
    //   19   45:pop             
    //   20   46:aload_0         
    //   21   47:iload_2         
    //   22   48:new             #31  <Class KeyEvent>
    //   23   51:dup             
    //   24   52:lload_3         
    //   25   53:lload_3         
    //   26   54:iconst_1        
    //   27   55:iload_2         
    //   28   56:iconst_0        
    //   29   57:invokespecial   #34  <Method void KeyEvent(long, long, int, int, int)>
    //   30   60:invokevirtual   #41  <Method boolean onMediaButtonUp(int, KeyEvent)>
    //   31   63:pop             
    //   32   64:return          
    //   33   65:bipush          127
    //   34   67:istore_2        
    //   35   68:goto            20
    }

    public int onGetBufferPercentage()
    {
    //    0    0:bipush          100
    //    1    2:ireturn         
    }

    public abstract long onGetCurrentPosition();

    public abstract long onGetDuration();

    public int onGetTransportControlFlags()
    {
    //    0    0:bipush          60
    //    1    2:ireturn         
    }

    public abstract boolean onIsPlaying();

    public boolean onMediaButtonDown(int i, KeyEvent keyevent)
    {
    //    0    0:iload_1         
    //    1    1:lookupswitch    5: default 52
    //                   79: 72
    //                   85: 72
    //                   86: 66
    //                   126: 54
    //                   127: 60
    //    2   52:iconst_1        
    //    3   53:ireturn         
    //    4   54:aload_0         
    //    5   55:invokevirtual   #51  <Method void onStart()>
    //    6   58:iconst_1        
    //    7   59:ireturn         
    //    8   60:aload_0         
    //    9   61:invokevirtual   #54  <Method void onPause()>
    //   10   64:iconst_1        
    //   11   65:ireturn         
    //   12   66:aload_0         
    //   13   67:invokevirtual   #57  <Method void onStop()>
    //   14   70:iconst_1        
    //   15   71:ireturn         
    //   16   72:aload_0         
    //   17   73:invokevirtual   #59  <Method boolean onIsPlaying()>
    //   18   76:ifeq            85
    //   19   79:aload_0         
    //   20   80:invokevirtual   #54  <Method void onPause()>
    //   21   83:iconst_1        
    //   22   84:ireturn         
    //   23   85:aload_0         
    //   24   86:invokevirtual   #51  <Method void onStart()>
    //   25   89:iconst_1        
    //   26   90:ireturn         
    }

    public boolean onMediaButtonUp(int i, KeyEvent keyevent)
    {
    //    0    0:iconst_1        
    //    1    1:ireturn         
    }

    public abstract void onPause();

    public abstract void onSeekTo(long l);

    public abstract void onStart();

    public abstract void onStop();

    static final int AUDIOFOCUS_GAIN = 1;
    static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
    static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
    static final int AUDIOFOCUS_LOSS = -1;
    static final int AUDIOFOCUS_LOSS_TRANSIENT = -2;
    static final int AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK = -3;
}
