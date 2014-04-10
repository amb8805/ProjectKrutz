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

public class StylingHighlightOptionsFragment extends Fragment
{

    public StylingHighlightOptionsFragment()
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
    //   20   43:aload_0         
    //   21   44:invokevirtual   #33  <Method FragmentActivity getActivity()>
    //   22   47:ldc1            #34  <Int 0x7f0b0069>
    //   23   49:invokevirtual   #40  <Method String FragmentActivity.getString(int)>
    //   24   52:invokevirtual   #44  <Method void TextView.setText(CharSequence)>
    //   25   55:aload_2         
    //   26   56:sipush          255
    //   27   59:invokevirtual   #48  <Method void SeekBar.setMax(int)>
    //   28   62:getstatic       #54  <Field SuperSurface StylingActivity.superSurface>
    //   29   65:invokevirtual   #60  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
    //   30   68:ifnull          100
    //   31   71:aload_2         
    //   32   72:getstatic       #54  <Field SuperSurface StylingActivity.superSurface>
    //   33   75:invokevirtual   #60  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
    //   34   78:getfield        #66  <Field int SuperSurfaceItem.highlightOpacity>
    //   35   81:invokevirtual   #69  <Method void SeekBar.setProgress(int)>
    //   36   84:aload_3         
    //   37   85:getstatic       #54  <Field SuperSurface StylingActivity.superSurface>
    //   38   88:invokevirtual   #60  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
    //   39   91:getfield        #66  <Field int SuperSurfaceItem.highlightOpacity>
    //   40   94:invokestatic    #74  <Method String String.valueOf(int)>
    //   41   97:invokevirtual   #44  <Method void TextView.setText(CharSequence)>
    //   42  100:aload_2         
    //   43  101:new             #76  <Class StylingHighlightOptionsFragment$1>
    //   44  104:dup             
    //   45  105:aload_0         
    //   46  106:aload_3         
    //   47  107:invokespecial   #79  <Method void StylingHighlightOptionsFragment$1(StylingHighlightOptionsFragment, TextView)>
    //   48  110:invokevirtual   #83  <Method void SeekBar.setOnSeekBarChangeListener(android.widget.SeekBar$OnSeekBarChangeListener)>
    //   49  113:aload_0         
    //   50  114:getfield        #16  <Field View view>
    //   51  117:ldc1            #84  <Int 0x7f0600d7>
    //   52  119:invokevirtual   #23  <Method View View.findViewById(int)>
    //   53  122:checkcast       #86  <Class Button>
    //   54  125:new             #88  <Class StylingHighlightOptionsFragment$2>
    //   55  128:dup             
    //   56  129:aload_0         
    //   57  130:invokespecial   #91  <Method void StylingHighlightOptionsFragment$2(StylingHighlightOptionsFragment)>
    //   58  133:invokevirtual   #95  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //   59  136:return          
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
    //    0    0:aload_1         
    //    1    1:ldc1            #98  <Int 0x7f030039>
    //    2    3:aload_2         
    //    3    4:iconst_0        
    //    4    5:invokevirtual   #104 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
    //    5    8:astore          4
    //    6   10:aload_0         
    //    7   11:aload           4
    //    8   13:putfield        #16  <Field View view>
    //    9   16:aload           4
    //   10   18:areturn         
    }

    View view;

    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingHighlightOptionsFragment$1

/* anonymous class */
    class _cls1
        implements android.widget.SeekBar.OnSeekBarChangeListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field StylingHighlightOptionsFragment this$0>
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
        //    2    6:ifnull          51
        //    3    9:getstatic       #32  <Field SuperSurface StylingActivity.superSurface>
        //    4   12:invokevirtual   #38  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //    5   15:iload_2         
        //    6   16:putfield        #44  <Field int SuperSurfaceItem.highlightOpacity>
        //    7   19:aload_0         
        //    8   20:getfield        #21  <Field TextView val$tv>
        //    9   23:iload_2         
        //   10   24:invokestatic    #50  <Method String String.valueOf(int)>
        //   11   27:invokevirtual   #56  <Method void TextView.setText(CharSequence)>
        //   12   30:getstatic       #32  <Field SuperSurface StylingActivity.superSurface>
        //   13   33:invokevirtual   #59  <Method void SuperSurface.requestUpdate()>
        //   14   36:getstatic       #32  <Field SuperSurface StylingActivity.superSurface>
        //   15   39:invokevirtual   #38  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //   16   42:invokestatic    #63  <Method void StylingActivity.updateTextBitmap(SuperSurfaceItem)>
        //   17   45:getstatic       #32  <Field SuperSurface StylingActivity.superSurface>
        //   18   48:invokevirtual   #59  <Method void SuperSurface.requestUpdate()>
        //   19   51:return          
        }

        public void onStartTrackingTouch(SeekBar seekbar)
        {
        //    0    0:return          
        }

        public void onStopTrackingTouch(SeekBar seekbar)
        {
        //    0    0:return          
        }

        final StylingHighlightOptionsFragment this$0;
        private final TextView val$tv;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingHighlightOptionsFragment$2

/* anonymous class */
    class _cls2
        implements android.view.View.OnClickListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StylingHighlightOptionsFragment this$0>
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

        final StylingHighlightOptionsFragment this$0;
    }

}
