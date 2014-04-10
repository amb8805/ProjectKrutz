// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram.styling_fragments;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.*;
import android.widget.*;
import codeadore.textgram.*;

public class StylingLineSpacingFragment extends Fragment
{

    public StylingLineSpacingFragment()
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
    //   26   56:ldc1            #34  <Int 0x7f0b002f>
    //   27   58:invokevirtual   #40  <Method String FragmentActivity.getString(int)>
    //   28   61:invokevirtual   #44  <Method void TextView.setText(CharSequence)>
    //   29   64:aload_2         
    //   30   65:sipush          200
    //   31   68:invokevirtual   #48  <Method void SeekBar.setMax(int)>
    //   32   71:getstatic       #54  <Field SuperSurface StylingActivity.superSurface>
    //   33   74:invokevirtual   #60  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
    //   34   77:ifnull          109
    //   35   80:aload_2         
    //   36   81:getstatic       #54  <Field SuperSurface StylingActivity.superSurface>
    //   37   84:invokevirtual   #60  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
    //   38   87:getfield        #66  <Field int SuperSurfaceItem.lineSpacing>
    //   39   90:invokevirtual   #69  <Method void SeekBar.setProgress(int)>
    //   40   93:aload_3         
    //   41   94:getstatic       #54  <Field SuperSurface StylingActivity.superSurface>
    //   42   97:invokevirtual   #60  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
    //   43  100:getfield        #66  <Field int SuperSurfaceItem.lineSpacing>
    //   44  103:invokestatic    #74  <Method String String.valueOf(int)>
    //   45  106:invokevirtual   #44  <Method void TextView.setText(CharSequence)>
    //   46  109:new             #76  <Class Handler>
    //   47  112:dup             
    //   48  113:invokespecial   #77  <Method void Handler()>
    //   49  116:new             #79  <Class StylingLineSpacingFragment$1>
    //   50  119:dup             
    //   51  120:aload_0         
    //   52  121:aload_2         
    //   53  122:aload_3         
    //   54  123:invokespecial   #82  <Method void StylingLineSpacingFragment$1(StylingLineSpacingFragment, SeekBar, TextView)>
    //   55  126:ldc2w           #83  <Long 200L>
    //   56  129:invokevirtual   #88  <Method boolean Handler.postDelayed(Runnable, long)>
    //   57  132:pop             
    //   58  133:aload_2         
    //   59  134:new             #90  <Class StylingLineSpacingFragment$2>
    //   60  137:dup             
    //   61  138:aload_0         
    //   62  139:aload_3         
    //   63  140:invokespecial   #93  <Method void StylingLineSpacingFragment$2(StylingLineSpacingFragment, TextView)>
    //   64  143:invokevirtual   #97  <Method void SeekBar.setOnSeekBarChangeListener(android.widget.SeekBar$OnSeekBarChangeListener)>
    //   65  146:aload_0         
    //   66  147:getfield        #16  <Field View view>
    //   67  150:ldc1            #98  <Int 0x7f0600d7>
    //   68  152:invokevirtual   #23  <Method View View.findViewById(int)>
    //   69  155:checkcast       #100 <Class Button>
    //   70  158:new             #102 <Class StylingLineSpacingFragment$3>
    //   71  161:dup             
    //   72  162:aload_0         
    //   73  163:invokespecial   #105 <Method void StylingLineSpacingFragment$3(StylingLineSpacingFragment)>
    //   74  166:invokevirtual   #109 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //   75  169:return          
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
    //    0    0:aload_1         
    //    1    1:ldc1            #112 <Int 0x7f030039>
    //    2    3:aload_2         
    //    3    4:iconst_0        
    //    4    5:invokevirtual   #118 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
    //    5    8:astore          4
    //    6   10:aload_0         
    //    7   11:aload           4
    //    8   13:putfield        #16  <Field View view>
    //    9   16:aload           4
    //   10   18:areturn         
    }

    View view;

    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingLineSpacingFragment$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #21  <Field StylingLineSpacingFragment this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #23  <Field SeekBar val$sb>
        //    6   10:aload_0         
        //    7   11:aload_3         
        //    8   12:putfield        #25  <Field TextView val$tv>
        //    9   15:aload_0         
        //   10   16:invokespecial   #28  <Method void Object()>
        //   11   19:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #23  <Field SeekBar val$sb>
        //    2    4:getstatic       #35  <Field SuperSurface StylingActivity.superSurface>
        //    3    7:invokevirtual   #41  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //    4   10:getfield        #47  <Field int SuperSurfaceItem.lineSpacing>
        //    5   13:invokevirtual   #53  <Method void SeekBar.setProgress(int)>
        //    6   16:aload_0         
        //    7   17:getfield        #25  <Field TextView val$tv>
        //    8   20:getstatic       #35  <Field SuperSurface StylingActivity.superSurface>
        //    9   23:invokevirtual   #41  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //   10   26:getfield        #47  <Field int SuperSurfaceItem.lineSpacing>
        //   11   29:invokestatic    #59  <Method String String.valueOf(int)>
        //   12   32:invokevirtual   #65  <Method void TextView.setText(CharSequence)>
        //   13   35:return          
        }

        final StylingLineSpacingFragment this$0;
        private final SeekBar val$sb;
        private final TextView val$tv;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingLineSpacingFragment$2

/* anonymous class */
    class _cls2
        implements android.widget.SeekBar.OnSeekBarChangeListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field StylingLineSpacingFragment this$0>
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
        //    2    6:ifnull          28
        //    3    9:getstatic       #32  <Field SuperSurface StylingActivity.superSurface>
        //    4   12:invokevirtual   #38  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //    5   15:iload_2         
        //    6   16:putfield        #44  <Field int SuperSurfaceItem.lineSpacing>
        //    7   19:getstatic       #32  <Field SuperSurface StylingActivity.superSurface>
        //    8   22:invokevirtual   #38  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //    9   25:invokestatic    #48  <Method void StylingActivity.updateTextBitmap(SuperSurfaceItem)>
        //   10   28:aload_0         
        //   11   29:getfield        #21  <Field TextView val$tv>
        //   12   32:iload_2         
        //   13   33:invokestatic    #54  <Method String String.valueOf(int)>
        //   14   36:invokevirtual   #60  <Method void TextView.setText(CharSequence)>
        //   15   39:getstatic       #32  <Field SuperSurface StylingActivity.superSurface>
        //   16   42:invokevirtual   #63  <Method void SuperSurface.requestUpdate()>
        //   17   45:return          
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

        final StylingLineSpacingFragment this$0;
        private final TextView val$tv;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingLineSpacingFragment$3

/* anonymous class */
    class _cls3
        implements android.view.View.OnClickListener
    {

        _cls3()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StylingLineSpacingFragment this$0>
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

        final StylingLineSpacingFragment this$0;
    }

}
