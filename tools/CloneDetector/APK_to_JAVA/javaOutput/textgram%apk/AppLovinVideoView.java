// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.impl.adview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.widget.VideoView;

public class AppLovinVideoView extends VideoView
{

    public AppLovinVideoView(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aconst_null     
    //    3    3:invokespecial   #12  <Method void AppLovinVideoView(Context, AttributeSet)>
    //    4    6:return          
    }

    public AppLovinVideoView(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iconst_0        
    //    4    4:invokespecial   #15  <Method void AppLovinVideoView(Context, AttributeSet, int)>
    //    5    7:return          
    }

    public AppLovinVideoView(Context context, AttributeSet attributeset, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iload_3         
    //    4    4:invokespecial   #16  <Method void VideoView(Context, AttributeSet, int)>
    //    5    7:aload_0         
    //    6    8:iconst_0        
    //    7    9:putfield        #18  <Field int a>
    //    8   12:aload_0         
    //    9   13:iconst_0        
    //   10   14:putfield        #20  <Field int b>
    //   11   17:return          
    }

    protected void onMeasure(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #18  <Field int a>
    //    2    4:ifle            14
    //    3    7:aload_0         
    //    4    8:getfield        #20  <Field int b>
    //    5   11:ifgt            21
    //    6   14:aload_0         
    //    7   15:iload_1         
    //    8   16:iload_2         
    //    9   17:invokespecial   #24  <Method void VideoView.onMeasure(int, int)>
    //   10   20:return          
    //   11   21:aload_0         
    //   12   22:getfield        #20  <Field int b>
    //   13   25:i2f             
    //   14   26:aload_0         
    //   15   27:invokevirtual   #28  <Method int getHeight()>
    //   16   30:i2f             
    //   17   31:fdiv            
    //   18   32:fstore_3        
    //   19   33:aload_0         
    //   20   34:getfield        #18  <Field int a>
    //   21   37:i2f             
    //   22   38:aload_0         
    //   23   39:invokevirtual   #31  <Method int getWidth()>
    //   24   42:i2f             
    //   25   43:fdiv            
    //   26   44:fstore          4
    //   27   46:fload_3         
    //   28   47:fload           4
    //   29   49:fcmpl           
    //   30   50:ifle            90
    //   31   53:aload_0         
    //   32   54:getfield        #20  <Field int b>
    //   33   57:i2f             
    //   34   58:fload_3         
    //   35   59:fdiv            
    //   36   60:f2d             
    //   37   61:invokestatic    #37  <Method double Math.ceil(double)>
    //   38   64:d2i             
    //   39   65:istore          5
    //   40   67:aload_0         
    //   41   68:getfield        #18  <Field int a>
    //   42   71:i2f             
    //   43   72:fload_3         
    //   44   73:fdiv            
    //   45   74:f2d             
    //   46   75:invokestatic    #37  <Method double Math.ceil(double)>
    //   47   78:d2i             
    //   48   79:istore          6
    //   49   81:aload_0         
    //   50   82:iload           6
    //   51   84:iload           5
    //   52   86:invokevirtual   #40  <Method void setMeasuredDimension(int, int)>
    //   53   89:return          
    //   54   90:aload_0         
    //   55   91:getfield        #20  <Field int b>
    //   56   94:i2f             
    //   57   95:fload           4
    //   58   97:fdiv            
    //   59   98:f2d             
    //   60   99:invokestatic    #37  <Method double Math.ceil(double)>
    //   61  102:d2i             
    //   62  103:istore          5
    //   63  105:aload_0         
    //   64  106:getfield        #18  <Field int a>
    //   65  109:i2f             
    //   66  110:fload           4
    //   67  112:fdiv            
    //   68  113:f2d             
    //   69  114:invokestatic    #37  <Method double Math.ceil(double)>
    //   70  117:d2i             
    //   71  118:istore          6
    //   72  120:goto            81
    }

    public void setVideoSize(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #18  <Field int a>
    //    3    5:aload_0         
    //    4    6:iload_2         
    //    5    7:putfield        #20  <Field int b>
    //    6   10:aload_0         
    //    7   11:invokevirtual   #47  <Method SurfaceHolder getHolder()>
    //    8   14:iload_1         
    //    9   15:iload_2         
    //   10   16:invokeinterface #52  <Method void SurfaceHolder.setFixedSize(int, int)>
    // try 21 29 handler(s) 30
    //   11   21:aload_0         
    //   12   22:invokevirtual   #56  <Method void requestLayout()>
    //   13   25:aload_0         
    //   14   26:invokevirtual   #59  <Method void invalidate()>
    //   15   29:return          
    // catch Exception
    //   16   30:astore_3        
    //   17   31:return          
    }

    private int a;
    private int b;
}
