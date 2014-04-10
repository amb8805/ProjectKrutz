// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram.styling_fragments;

import android.os.Bundle;
import android.support.v4.app.*;
import android.support.v4.view.ViewPager;
import android.view.*;
import android.widget.Button;
import android.widget.LinearLayout;
import codeadore.textgram.StylingActivity;

// Referenced classes of package codeadore.textgram.styling_fragments:
//            StylingImagesFragment, StylingTextOpacityFragment, StylingTextRotationFragment, StylingTextReflectionFragment, 
//            StylingTextSizeFragment, StylingLineSpacingFragment

public class StylingTextFragment extends Fragment
{

    public StylingTextFragment()
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
    //    5    9:ldc1            #17  <Int 0x7f0600d8>
    //    6   11:invokevirtual   #23  <Method View View.findViewById(int)>
    //    7   14:checkcast       #25  <Class Button>
    //    8   17:astore_2        
    //    9   18:aload_0         
    //   10   19:getfield        #16  <Field View view>
    //   11   22:ldc1            #26  <Int 0x7f0600d9>
    //   12   24:invokevirtual   #23  <Method View View.findViewById(int)>
    //   13   27:checkcast       #25  <Class Button>
    //   14   30:astore_3        
    //   15   31:aload_0         
    //   16   32:getfield        #16  <Field View view>
    //   17   35:ldc1            #27  <Int 0x7f0600db>
    //   18   37:invokevirtual   #23  <Method View View.findViewById(int)>
    //   19   40:checkcast       #25  <Class Button>
    //   20   43:astore          4
    //   21   45:aload_0         
    //   22   46:getfield        #16  <Field View view>
    //   23   49:ldc1            #28  <Int 0x7f0600dc>
    //   24   51:invokevirtual   #23  <Method View View.findViewById(int)>
    //   25   54:checkcast       #25  <Class Button>
    //   26   57:astore          5
    //   27   59:aload_0         
    //   28   60:getfield        #16  <Field View view>
    //   29   63:ldc1            #29  <Int 0x7f0600dd>
    //   30   65:invokevirtual   #23  <Method View View.findViewById(int)>
    //   31   68:checkcast       #25  <Class Button>
    //   32   71:astore          6
    //   33   73:aload_0         
    //   34   74:getfield        #16  <Field View view>
    //   35   77:ldc1            #30  <Int 0x7f0600da>
    //   36   79:invokevirtual   #23  <Method View View.findViewById(int)>
    //   37   82:checkcast       #25  <Class Button>
    //   38   85:astore          7
    //   39   87:aload_0         
    //   40   88:getfield        #16  <Field View view>
    //   41   91:ldc1            #31  <Int 0x7f0600de>
    //   42   93:invokevirtual   #23  <Method View View.findViewById(int)>
    //   43   96:checkcast       #25  <Class Button>
    //   44   99:astore          8
    //   45  101:aload_2         
    //   46  102:new             #33  <Class StylingTextFragment$1>
    //   47  105:dup             
    //   48  106:aload_0         
    //   49  107:invokespecial   #36  <Method void StylingTextFragment$1(StylingTextFragment)>
    //   50  110:invokevirtual   #40  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //   51  113:aload_3         
    //   52  114:new             #42  <Class StylingTextFragment$2>
    //   53  117:dup             
    //   54  118:aload_0         
    //   55  119:invokespecial   #43  <Method void StylingTextFragment$2(StylingTextFragment)>
    //   56  122:invokevirtual   #40  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //   57  125:aload           4
    //   58  127:new             #45  <Class StylingTextFragment$3>
    //   59  130:dup             
    //   60  131:aload_0         
    //   61  132:invokespecial   #46  <Method void StylingTextFragment$3(StylingTextFragment)>
    //   62  135:invokevirtual   #40  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //   63  138:aload           8
    //   64  140:new             #48  <Class StylingTextFragment$4>
    //   65  143:dup             
    //   66  144:aload_0         
    //   67  145:invokespecial   #49  <Method void StylingTextFragment$4(StylingTextFragment)>
    //   68  148:invokevirtual   #40  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //   69  151:aload           7
    //   70  153:new             #51  <Class StylingTextFragment$5>
    //   71  156:dup             
    //   72  157:aload_0         
    //   73  158:invokespecial   #52  <Method void StylingTextFragment$5(StylingTextFragment)>
    //   74  161:invokevirtual   #40  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //   75  164:aload           5
    //   76  166:new             #54  <Class StylingTextFragment$6>
    //   77  169:dup             
    //   78  170:aload_0         
    //   79  171:invokespecial   #55  <Method void StylingTextFragment$6(StylingTextFragment)>
    //   80  174:invokevirtual   #40  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //   81  177:aload           6
    //   82  179:new             #57  <Class StylingTextFragment$7>
    //   83  182:dup             
    //   84  183:aload_0         
    //   85  184:invokespecial   #58  <Method void StylingTextFragment$7(StylingTextFragment)>
    //   86  187:invokevirtual   #40  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //   87  190:return          
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
    //    0    0:aload_1         
    //    1    1:ldc1            #61  <Int 0x7f03003a>
    //    2    3:aload_2         
    //    3    4:iconst_0        
    //    4    5:invokevirtual   #67  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
    //    5    8:astore          4
    //    6   10:aload_0         
    //    7   11:aload           4
    //    8   13:putfield        #16  <Field View view>
    //    9   16:aload           4
    //   10   18:areturn         
    }

    View view;

    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingTextFragment$1

/* anonymous class */
    class _cls1
        implements android.view.View.OnClickListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StylingTextFragment this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view1)
        {
        //    0    0:getstatic       #28  <Field FragmentManager StylingActivity.fragmentManager>
        //    1    3:invokevirtual   #34  <Method FragmentTransaction FragmentManager.beginTransaction()>
        //    2    6:astore_2        
        //    3    7:aload_2         
        //    4    8:ldc1            #35  <Int 0x7f0600b9>
        //    5   10:ldc1            #37  <String "text_color">
        //    6   12:invokestatic    #43  <Method StylingImagesFragment StylingImagesFragment.newInstance(String)>
        //    7   15:invokevirtual   #49  <Method FragmentTransaction FragmentTransaction.replace(int, Fragment)>
        //    8   18:pop             
        //    9   19:aload_2         
        //   10   20:invokevirtual   #53  <Method int FragmentTransaction.commit()>
        //   11   23:pop             
        //   12   24:getstatic       #57  <Field LinearLayout StylingActivity.fragmentContainerLL>
        //   13   27:iconst_0        
        //   14   28:invokevirtual   #63  <Method void LinearLayout.setVisibility(int)>
        //   15   31:getstatic       #67  <Field ViewPager StylingActivity.viewPager>
        //   16   34:bipush          8
        //   17   36:invokevirtual   #70  <Method void ViewPager.setVisibility(int)>
        //   18   39:return          
        }

        final StylingTextFragment this$0;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingTextFragment$2

/* anonymous class */
    class _cls2
        implements android.view.View.OnClickListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StylingTextFragment this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view1)
        {
        //    0    0:getstatic       #28  <Field FragmentManager StylingActivity.fragmentManager>
        //    1    3:invokevirtual   #34  <Method FragmentTransaction FragmentManager.beginTransaction()>
        //    2    6:astore_2        
        //    3    7:aload_2         
        //    4    8:ldc1            #35  <Int 0x7f0600b9>
        //    5   10:ldc1            #37  <String "text_shadow">
        //    6   12:invokestatic    #43  <Method StylingImagesFragment StylingImagesFragment.newInstance(String)>
        //    7   15:invokevirtual   #49  <Method FragmentTransaction FragmentTransaction.replace(int, Fragment)>
        //    8   18:pop             
        //    9   19:aload_2         
        //   10   20:invokevirtual   #53  <Method int FragmentTransaction.commit()>
        //   11   23:pop             
        //   12   24:getstatic       #57  <Field LinearLayout StylingActivity.fragmentContainerLL>
        //   13   27:iconst_0        
        //   14   28:invokevirtual   #63  <Method void LinearLayout.setVisibility(int)>
        //   15   31:getstatic       #67  <Field ViewPager StylingActivity.viewPager>
        //   16   34:bipush          8
        //   17   36:invokevirtual   #70  <Method void ViewPager.setVisibility(int)>
        //   18   39:return          
        }

        final StylingTextFragment this$0;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingTextFragment$3

/* anonymous class */
    class _cls3
        implements android.view.View.OnClickListener
    {

        _cls3()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StylingTextFragment this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view1)
        {
        //    0    0:getstatic       #28  <Field FragmentManager StylingActivity.fragmentManager>
        //    1    3:invokevirtual   #34  <Method FragmentTransaction FragmentManager.beginTransaction()>
        //    2    6:astore_2        
        //    3    7:aload_2         
        //    4    8:ldc1            #35  <Int 0x7f0600b9>
        //    5   10:new             #37  <Class StylingTextOpacityFragment>
        //    6   13:dup             
        //    7   14:invokespecial   #38  <Method void StylingTextOpacityFragment()>
        //    8   17:invokevirtual   #44  <Method FragmentTransaction FragmentTransaction.replace(int, Fragment)>
        //    9   20:pop             
        //   10   21:aload_2         
        //   11   22:invokevirtual   #48  <Method int FragmentTransaction.commit()>
        //   12   25:pop             
        //   13   26:getstatic       #52  <Field LinearLayout StylingActivity.fragmentContainerLL>
        //   14   29:iconst_0        
        //   15   30:invokevirtual   #58  <Method void LinearLayout.setVisibility(int)>
        //   16   33:getstatic       #62  <Field ViewPager StylingActivity.viewPager>
        //   17   36:bipush          8
        //   18   38:invokevirtual   #65  <Method void ViewPager.setVisibility(int)>
        //   19   41:return          
        }

        final StylingTextFragment this$0;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingTextFragment$4

/* anonymous class */
    class _cls4
        implements android.view.View.OnClickListener
    {

        _cls4()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StylingTextFragment this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view1)
        {
        //    0    0:getstatic       #28  <Field FragmentManager StylingActivity.fragmentManager>
        //    1    3:invokevirtual   #34  <Method FragmentTransaction FragmentManager.beginTransaction()>
        //    2    6:astore_2        
        //    3    7:aload_2         
        //    4    8:ldc1            #35  <Int 0x7f0600b9>
        //    5   10:new             #37  <Class StylingTextRotationFragment>
        //    6   13:dup             
        //    7   14:invokespecial   #38  <Method void StylingTextRotationFragment()>
        //    8   17:invokevirtual   #44  <Method FragmentTransaction FragmentTransaction.replace(int, Fragment)>
        //    9   20:pop             
        //   10   21:aload_2         
        //   11   22:invokevirtual   #48  <Method int FragmentTransaction.commit()>
        //   12   25:pop             
        //   13   26:getstatic       #52  <Field LinearLayout StylingActivity.fragmentContainerLL>
        //   14   29:iconst_0        
        //   15   30:invokevirtual   #58  <Method void LinearLayout.setVisibility(int)>
        //   16   33:getstatic       #62  <Field ViewPager StylingActivity.viewPager>
        //   17   36:bipush          8
        //   18   38:invokevirtual   #65  <Method void ViewPager.setVisibility(int)>
        //   19   41:return          
        }

        final StylingTextFragment this$0;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingTextFragment$5

/* anonymous class */
    class _cls5
        implements android.view.View.OnClickListener
    {

        _cls5()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StylingTextFragment this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view1)
        {
        //    0    0:getstatic       #28  <Field FragmentManager StylingActivity.fragmentManager>
        //    1    3:invokevirtual   #34  <Method FragmentTransaction FragmentManager.beginTransaction()>
        //    2    6:astore_2        
        //    3    7:aload_2         
        //    4    8:ldc1            #35  <Int 0x7f0600b9>
        //    5   10:new             #37  <Class StylingTextReflectionFragment>
        //    6   13:dup             
        //    7   14:invokespecial   #38  <Method void StylingTextReflectionFragment()>
        //    8   17:invokevirtual   #44  <Method FragmentTransaction FragmentTransaction.replace(int, Fragment)>
        //    9   20:pop             
        //   10   21:aload_2         
        //   11   22:invokevirtual   #48  <Method int FragmentTransaction.commit()>
        //   12   25:pop             
        //   13   26:getstatic       #52  <Field LinearLayout StylingActivity.fragmentContainerLL>
        //   14   29:iconst_0        
        //   15   30:invokevirtual   #58  <Method void LinearLayout.setVisibility(int)>
        //   16   33:getstatic       #62  <Field ViewPager StylingActivity.viewPager>
        //   17   36:bipush          8
        //   18   38:invokevirtual   #65  <Method void ViewPager.setVisibility(int)>
        //   19   41:return          
        }

        final StylingTextFragment this$0;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingTextFragment$6

/* anonymous class */
    class _cls6
        implements android.view.View.OnClickListener
    {

        _cls6()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StylingTextFragment this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view1)
        {
        //    0    0:getstatic       #28  <Field FragmentManager StylingActivity.fragmentManager>
        //    1    3:invokevirtual   #34  <Method FragmentTransaction FragmentManager.beginTransaction()>
        //    2    6:astore_2        
        //    3    7:aload_2         
        //    4    8:ldc1            #35  <Int 0x7f0600b9>
        //    5   10:new             #37  <Class StylingTextSizeFragment>
        //    6   13:dup             
        //    7   14:invokespecial   #38  <Method void StylingTextSizeFragment()>
        //    8   17:invokevirtual   #44  <Method FragmentTransaction FragmentTransaction.replace(int, Fragment)>
        //    9   20:pop             
        //   10   21:aload_2         
        //   11   22:invokevirtual   #48  <Method int FragmentTransaction.commit()>
        //   12   25:pop             
        //   13   26:getstatic       #52  <Field LinearLayout StylingActivity.fragmentContainerLL>
        //   14   29:iconst_0        
        //   15   30:invokevirtual   #58  <Method void LinearLayout.setVisibility(int)>
        //   16   33:getstatic       #62  <Field ViewPager StylingActivity.viewPager>
        //   17   36:bipush          8
        //   18   38:invokevirtual   #65  <Method void ViewPager.setVisibility(int)>
        //   19   41:return          
        }

        final StylingTextFragment this$0;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingTextFragment$7

/* anonymous class */
    class _cls7
        implements android.view.View.OnClickListener
    {

        _cls7()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StylingTextFragment this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view1)
        {
        //    0    0:getstatic       #28  <Field FragmentManager StylingActivity.fragmentManager>
        //    1    3:invokevirtual   #34  <Method FragmentTransaction FragmentManager.beginTransaction()>
        //    2    6:astore_2        
        //    3    7:aload_2         
        //    4    8:ldc1            #35  <Int 0x7f0600b9>
        //    5   10:new             #37  <Class StylingLineSpacingFragment>
        //    6   13:dup             
        //    7   14:invokespecial   #38  <Method void StylingLineSpacingFragment()>
        //    8   17:invokevirtual   #44  <Method FragmentTransaction FragmentTransaction.replace(int, Fragment)>
        //    9   20:pop             
        //   10   21:aload_2         
        //   11   22:invokevirtual   #48  <Method int FragmentTransaction.commit()>
        //   12   25:pop             
        //   13   26:getstatic       #52  <Field LinearLayout StylingActivity.fragmentContainerLL>
        //   14   29:iconst_0        
        //   15   30:invokevirtual   #58  <Method void LinearLayout.setVisibility(int)>
        //   16   33:getstatic       #62  <Field ViewPager StylingActivity.viewPager>
        //   17   36:bipush          8
        //   18   38:invokevirtual   #65  <Method void ViewPager.setVisibility(int)>
        //   19   41:return          
        }

        final StylingTextFragment this$0;
    }

}
