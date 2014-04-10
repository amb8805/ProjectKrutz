// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram.styling_fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.*;
import android.widget.*;
import codeadore.textgram.StylingActivity;
import codeadore.textgram.SuperSurface;

public class StylingFilterOptionsFragment extends Fragment
{

    public StylingFilterOptionsFragment()
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
    //   26   56:ldc1            #34  <Int 0x7f0b0030>
    //   27   58:invokevirtual   #40  <Method String FragmentActivity.getString(int)>
    //   28   61:invokevirtual   #44  <Method void TextView.setText(CharSequence)>
    //   29   64:aload_2         
    //   30   65:bipush          100
    //   31   67:invokevirtual   #48  <Method void SeekBar.setMax(int)>
    //   32   70:aload_2         
    //   33   71:getstatic       #54  <Field SuperSurface StylingActivity.superSurface>
    //   34   74:invokevirtual   #60  <Method int SuperSurface.getFilterOpacity()>
    //   35   77:invokevirtual   #63  <Method void SeekBar.setProgress(int)>
    //   36   80:aload_3         
    //   37   81:getstatic       #54  <Field SuperSurface StylingActivity.superSurface>
    //   38   84:invokevirtual   #60  <Method int SuperSurface.getFilterOpacity()>
    //   39   87:invokestatic    #68  <Method String String.valueOf(int)>
    //   40   90:invokevirtual   #44  <Method void TextView.setText(CharSequence)>
    //   41   93:aload_2         
    //   42   94:new             #70  <Class StylingFilterOptionsFragment$1>
    //   43   97:dup             
    //   44   98:aload_0         
    //   45   99:aload_3         
    //   46  100:invokespecial   #73  <Method void StylingFilterOptionsFragment$1(StylingFilterOptionsFragment, TextView)>
    //   47  103:invokevirtual   #77  <Method void SeekBar.setOnSeekBarChangeListener(android.widget.SeekBar$OnSeekBarChangeListener)>
    //   48  106:aload_0         
    //   49  107:getfield        #16  <Field View view>
    //   50  110:ldc1            #78  <Int 0x7f0600d7>
    //   51  112:invokevirtual   #23  <Method View View.findViewById(int)>
    //   52  115:checkcast       #80  <Class Button>
    //   53  118:new             #82  <Class StylingFilterOptionsFragment$2>
    //   54  121:dup             
    //   55  122:aload_0         
    //   56  123:invokespecial   #85  <Method void StylingFilterOptionsFragment$2(StylingFilterOptionsFragment)>
    //   57  126:invokevirtual   #89  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //   58  129:return          
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
    //    0    0:aload_1         
    //    1    1:ldc1            #92  <Int 0x7f030039>
    //    2    3:aload_2         
    //    3    4:iconst_0        
    //    4    5:invokevirtual   #98  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
    //    5    8:astore          4
    //    6   10:aload_0         
    //    7   11:aload           4
    //    8   13:putfield        #16  <Field View view>
    //    9   16:aload           4
    //   10   18:areturn         
    }

    View view;

    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingFilterOptionsFragment$1

/* anonymous class */
    class _cls1
        implements android.widget.SeekBar.OnSeekBarChangeListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field StylingFilterOptionsFragment this$0>
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
        //    1    3:iload_2         
        //    2    4:invokevirtual   #38  <Method void SuperSurface.setFilterOpacity(int)>
        //    3    7:aload_0         
        //    4    8:getfield        #21  <Field TextView val$tv>
        //    5   11:iload_2         
        //    6   12:invokestatic    #44  <Method String String.valueOf(int)>
        //    7   15:invokevirtual   #50  <Method void TextView.setText(CharSequence)>
        //    8   18:getstatic       #32  <Field SuperSurface StylingActivity.superSurface>
        //    9   21:invokevirtual   #53  <Method void SuperSurface.requestUpdate()>
        //   10   24:return          
        }

        public void onStartTrackingTouch(SeekBar seekbar)
        {
        //    0    0:return          
        }

        public void onStopTrackingTouch(SeekBar seekbar)
        {
        //    0    0:return          
        }

        final StylingFilterOptionsFragment this$0;
        private final TextView val$tv;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingFilterOptionsFragment$2

/* anonymous class */
    class _cls2
        implements android.view.View.OnClickListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StylingFilterOptionsFragment this$0>
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

        final StylingFilterOptionsFragment this$0;
    }

}
