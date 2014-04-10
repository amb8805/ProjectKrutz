// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram.styling_fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.*;
import android.widget.*;
import codeadore.textgram.*;

public class StylingTextSizeFragment extends Fragment
{

    public StylingTextSizeFragment()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #10  <Method void Fragment()>
    //    2    4:return          
    }

    public void onActivityCreated(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #14  <Method void Fragment.onActivityCreated(Bundle)>
    //    3    5:aload_0         
    //    4    6:getfield        #16  <Field View view>
    //    5    9:ldc1            #17  <Int 0x7f0600d6>
    //    6   11:invokevirtual   #23  <Method View View.findViewById(int)>
    //    7   14:checkcast       #25  <Class SeekBar>
    //    8   17:astore_2        
    //    9   18:aload_0         
    //   10   19:getfield        #16  <Field View view>
    //   11   22:ldc1            #26  <Int 0x7f0600d5>
    //   12   24:invokevirtual   #23  <Method View View.findViewById(int)>
    //   13   27:checkcast       #28  <Class TextView>
    //   14   30:astore_3        
    //   15   31:aload_0         
    //   16   32:getfield        #16  <Field View view>
    //   17   35:ldc1            #29  <Int 0x7f0600d4>
    //   18   37:invokevirtual   #23  <Method View View.findViewById(int)>
    //   19   40:checkcast       #28  <Class TextView>
    //   20   43:astore          4
    //   21   45:aload           4
    //   22   47:ifnull          64
    //   23   50:aload           4
    //   24   52:aload_0         
    //   25   53:invokevirtual   #33  <Method FragmentActivity getActivity()>
    //   26   56:ldc1            #34  <Int 0x7f0b002e>
    //   27   58:invokevirtual   #40  <Method String FragmentActivity.getString(int)>
    //   28   61:invokevirtual   #44  <Method void TextView.setText(CharSequence)>
    //   29   64:aload_2         
    //   30   65:sipush          200
    //   31   68:invokevirtual   #48  <Method void SeekBar.setMax(int)>
    //   32   71:getstatic       #54  <Field SuperSurface StylingActivity.superSurface>
    //   33   74:invokevirtual   #60  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
    //   34   77:ifnull          110
    //   35   80:aload_2         
    //   36   81:getstatic       #54  <Field SuperSurface StylingActivity.superSurface>
    //   37   84:invokevirtual   #60  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
    //   38   87:getfield        #66  <Field float SuperSurfaceItem.textSize>
    //   39   90:f2i             
    //   40   91:invokevirtual   #69  <Method void SeekBar.setProgress(int)>
    //   41   94:aload_3         
    //   42   95:getstatic       #54  <Field SuperSurface StylingActivity.superSurface>
    //   43   98:invokevirtual   #60  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
    //   44  101:getfield        #66  <Field float SuperSurfaceItem.textSize>
    //   45  104:invokestatic    #75  <Method String String.valueOf(float)>
    //   46  107:invokevirtual   #44  <Method void TextView.setText(CharSequence)>
    //   47  110:aload_2         
    //   48  111:new             #77  <Class StylingTextSizeFragment$1>
    //   49  114:dup             
    //   50  115:aload_0         
    //   51  116:aload_3         
    //   52  117:invokespecial   #80  <Method void StylingTextSizeFragment$1(StylingTextSizeFragment, TextView)>
    //   53  120:invokevirtual   #84  <Method void SeekBar.setOnSeekBarChangeListener(android.widget.SeekBar$OnSeekBarChangeListener)>
    //   54  123:aload_0         
    //   55  124:getfield        #16  <Field View view>
    //   56  127:ldc1            #85  <Int 0x7f0600d7>
    //   57  129:invokevirtual   #23  <Method View View.findViewById(int)>
    //   58  132:checkcast       #87  <Class Button>
    //   59  135:new             #89  <Class StylingTextSizeFragment$2>
    //   60  138:dup             
    //   61  139:aload_0         
    //   62  140:invokespecial   #92  <Method void StylingTextSizeFragment$2(StylingTextSizeFragment)>
    //   63  143:invokevirtual   #96  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //   64  146:return          
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
    //    0    0:aload_1         
    //    1    1:ldc1            #99  <Int 0x7f030039>
    //    2    3:aload_2         
    //    3    4:iconst_0        
    //    4    5:invokevirtual   #105 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
    //    5    8:astore          4
    //    6   10:aload_0         
    //    7   11:aload           4
    //    8   13:putfield        #16  <Field View view>
    //    9   16:aload           4
    //   10   18:areturn         
    }

    View view;

    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingTextSizeFragment$1

/* anonymous class */
    class _cls1
        implements android.widget.SeekBar.OnSeekBarChangeListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field StylingTextSizeFragment this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field TextView val$tv>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
        {
        //    0    0:getstatic       #32  <Field SuperSurface StylingActivity.superSurface>
        //    1    3:invokevirtual   #38  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //    2    6:ifnull          46
        //    3    9:getstatic       #32  <Field SuperSurface StylingActivity.superSurface>
        //    4   12:invokevirtual   #38  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //    5   15:iload_2         
        //    6   16:i2f             
        //    7   17:putfield        #44  <Field float SuperSurfaceItem.textSize>
        //    8   20:aload_0         
        //    9   21:getfield        #21  <Field TextView val$tv>
        //   10   24:iload_2         
        //   11   25:invokestatic    #50  <Method String String.valueOf(int)>
        //   12   28:invokevirtual   #56  <Method void TextView.setText(CharSequence)>
        //   13   31:getstatic       #32  <Field SuperSurface StylingActivity.superSurface>
        //   14   34:invokevirtual   #38  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //   15   37:invokestatic    #60  <Method void StylingActivity.updateTextBitmap(SuperSurfaceItem)>
        //   16   40:getstatic       #32  <Field SuperSurface StylingActivity.superSurface>
        //   17   43:invokevirtual   #63  <Method void SuperSurface.requestUpdate()>
        //   18   46:return          
        }

        public void onStartTrackingTouch(SeekBar seekbar)
        {
        //    0    0:getstatic       #32  <Field SuperSurface StylingActivity.superSurface>
        //    1    3:invokevirtual   #38  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //    2    6:iconst_1        
        //    3    7:putfield        #69  <Field boolean SuperSurfaceItem.selected>
        //    4   10:return          
        }

        public void onStopTrackingTouch(SeekBar seekbar)
        {
        //    0    0:getstatic       #32  <Field SuperSurface StylingActivity.superSurface>
        //    1    3:invokevirtual   #38  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //    2    6:iconst_0        
        //    3    7:putfield        #69  <Field boolean SuperSurfaceItem.selected>
        //    4   10:getstatic       #32  <Field SuperSurface StylingActivity.superSurface>
        //    5   13:invokevirtual   #63  <Method void SuperSurface.requestUpdate()>
        //    6   16:return          
        }

        final StylingTextSizeFragment this$0;
        private final TextView val$tv;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingTextSizeFragment$2

/* anonymous class */
    class _cls2
        implements android.view.View.OnClickListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StylingTextSizeFragment this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view1)
        {
        //    0    0:iconst_0        
        //    1    1:invokestatic    #28  <Method void StylingActivity.toggleSubFragment(boolean)>
        //    2    4:return          
        }

        final StylingTextSizeFragment this$0;
    }

}
