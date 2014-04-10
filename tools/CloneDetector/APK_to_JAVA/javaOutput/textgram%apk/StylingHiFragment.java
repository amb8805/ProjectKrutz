// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram.styling_fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import android.view.*;
import android.widget.Button;
import android.widget.ImageButton;
import codeadore.textgram.*;
import codeadore.textgram.custom_widgets.el7rTextView;
import com.nineoldandroids.view.ViewPropertyAnimator;
import java.io.IOException;
import java.util.ArrayList;

public class StylingHiFragment extends Fragment
{
    public class NoStrikethroughSpan extends StrikethroughSpan
    {

        public NoStrikethroughSpan()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #10  <Field StylingHiFragment this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #13  <Method void StrikethroughSpan()>
        //    5    9:return          
        }

        public void updateDrawState(TextPaint textpaint)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #17  <Method void StrikethroughSpan.updateDrawState(TextPaint)>
        //    3    5:aload_1         
        //    4    6:iconst_0        
        //    5    7:invokevirtual   #23  <Method void TextPaint.setStrikeThruText(boolean)>
        //    6   10:return          
        }

        final StylingHiFragment this$0;
    }

    public class NoUnderlineSpan extends UnderlineSpan
    {

        public NoUnderlineSpan()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #10  <Field StylingHiFragment this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #13  <Method void UnderlineSpan()>
        //    5    9:return          
        }

        public void updateDrawState(TextPaint textpaint)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #17  <Method void UnderlineSpan.updateDrawState(TextPaint)>
        //    3    5:aload_1         
        //    4    6:iconst_0        
        //    5    7:invokevirtual   #23  <Method void TextPaint.setUnderlineText(boolean)>
        //    6   10:return          
        }

        final StylingHiFragment this$0;
    }


    public StylingHiFragment()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #14  <Method void Fragment()>
    //    2    4:aload_0         
    //    3    5:iconst_0        
    //    4    6:putfield        #16  <Field boolean isBold>
    //    5    9:aload_0         
    //    6   10:iconst_0        
    //    7   11:putfield        #18  <Field boolean isUnderline>
    //    8   14:aload_0         
    //    9   15:iconst_0        
    //   10   16:putfield        #20  <Field boolean isStrike>
    //   11   19:return          
    }

    public void onActivityCreated(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #24  <Method void Fragment.onActivityCreated(Bundle)>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #28  <Method android.support.v4.app.FragmentActivity getActivity()>
    //    5    9:astore_2        
    //    6   10:aload_0         
    //    7   11:getfield        #30  <Field View view>
    //    8   14:ldc1            #31  <Int 0x7f0600c9>
    //    9   16:invokevirtual   #37  <Method View View.findViewById(int)>
    //   10   19:checkcast       #39  <Class Button>
    //   11   22:new             #41  <Class StylingHiFragment$1>
    //   12   25:dup             
    //   13   26:aload_0         
    //   14   27:invokespecial   #44  <Method void StylingHiFragment$1(StylingHiFragment)>
    //   15   30:invokevirtual   #48  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //   16   33:aload_0         
    //   17   34:getfield        #30  <Field View view>
    //   18   37:ldc1            #49  <Int 0x7f0600c7>
    //   19   39:invokevirtual   #37  <Method View View.findViewById(int)>
    //   20   42:checkcast       #39  <Class Button>
    //   21   45:new             #51  <Class StylingHiFragment$2>
    //   22   48:dup             
    //   23   49:aload_0         
    //   24   50:aload_2         
    //   25   51:invokespecial   #54  <Method void StylingHiFragment$2(StylingHiFragment, Activity)>
    //   26   54:invokevirtual   #48  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //   27   57:aload_0         
    //   28   58:getfield        #30  <Field View view>
    //   29   61:ldc1            #55  <Int 0x7f0600c6>
    //   30   63:invokevirtual   #37  <Method View View.findViewById(int)>
    //   31   66:new             #57  <Class StylingHiFragment$3>
    //   32   69:dup             
    //   33   70:aload_0         
    //   34   71:aload_2         
    //   35   72:invokespecial   #58  <Method void StylingHiFragment$3(StylingHiFragment, Activity)>
    //   36   75:invokevirtual   #59  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
    //   37   78:aload_0         
    //   38   79:getfield        #30  <Field View view>
    //   39   82:ldc1            #60  <Int 0x7f0600c8>
    //   40   84:invokevirtual   #37  <Method View View.findViewById(int)>
    //   41   87:checkcast       #39  <Class Button>
    //   42   90:astore_3        
    //   43   91:aload_3         
    //   44   92:new             #62  <Class StylingHiFragment$4>
    //   45   95:dup             
    //   46   96:aload_0         
    //   47   97:aload_3         
    //   48   98:invokespecial   #65  <Method void StylingHiFragment$4(StylingHiFragment, Button)>
    //   49  101:invokevirtual   #48  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //   50  104:aload_0         
    //   51  105:getfield        #30  <Field View view>
    //   52  108:ldc1            #66  <Int 0x7f0600c0>
    //   53  110:invokevirtual   #37  <Method View View.findViewById(int)>
    //   54  113:checkcast       #68  <Class ImageButton>
    //   55  116:astore          4
    //   56  118:aload_0         
    //   57  119:getfield        #30  <Field View view>
    //   58  122:ldc1            #69  <Int 0x7f0600c2>
    //   59  124:invokevirtual   #37  <Method View View.findViewById(int)>
    //   60  127:checkcast       #68  <Class ImageButton>
    //   61  130:astore          5
    //   62  132:aload_0         
    //   63  133:getfield        #30  <Field View view>
    //   64  136:ldc1            #70  <Int 0x7f0600c1>
    //   65  138:invokevirtual   #37  <Method View View.findViewById(int)>
    //   66  141:checkcast       #68  <Class ImageButton>
    //   67  144:astore          6
    //   68  146:aload           4
    //   69  148:ldc1            #71  <Int 0x7f020078>
    //   70  150:invokevirtual   #75  <Method void ImageButton.setBackgroundResource(int)>
    //   71  153:aload           4
    //   72  155:new             #77  <Class StylingHiFragment$5>
    //   73  158:dup             
    //   74  159:aload_0         
    //   75  160:aload           4
    //   76  162:aload           5
    //   77  164:aload           6
    //   78  166:invokespecial   #80  <Method void StylingHiFragment$5(StylingHiFragment, ImageButton, ImageButton, ImageButton)>
    //   79  169:invokevirtual   #81  <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
    //   80  172:aload           6
    //   81  174:new             #83  <Class StylingHiFragment$6>
    //   82  177:dup             
    //   83  178:aload_0         
    //   84  179:aload           4
    //   85  181:aload           5
    //   86  183:aload           6
    //   87  185:invokespecial   #84  <Method void StylingHiFragment$6(StylingHiFragment, ImageButton, ImageButton, ImageButton)>
    //   88  188:invokevirtual   #81  <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
    //   89  191:aload           5
    //   90  193:new             #86  <Class StylingHiFragment$7>
    //   91  196:dup             
    //   92  197:aload_0         
    //   93  198:aload           4
    //   94  200:aload           5
    //   95  202:aload           6
    //   96  204:invokespecial   #87  <Method void StylingHiFragment$7(StylingHiFragment, ImageButton, ImageButton, ImageButton)>
    //   97  207:invokevirtual   #81  <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
    //   98  210:aload_0         
    //   99  211:getfield        #30  <Field View view>
    //  100  214:ldc1            #88  <Int 0x7f0600c3>
    //  101  216:invokevirtual   #37  <Method View View.findViewById(int)>
    //  102  219:checkcast       #68  <Class ImageButton>
    //  103  222:astore          7
    //  104  224:aload           7
    //  105  226:new             #90  <Class StylingHiFragment$8>
    //  106  229:dup             
    //  107  230:aload_0         
    //  108  231:aload           7
    //  109  233:invokespecial   #93  <Method void StylingHiFragment$8(StylingHiFragment, ImageButton)>
    //  110  236:invokevirtual   #81  <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
    //  111  239:aload_0         
    //  112  240:getfield        #30  <Field View view>
    //  113  243:ldc1            #94  <Int 0x7f0600c4>
    //  114  245:invokevirtual   #37  <Method View View.findViewById(int)>
    //  115  248:checkcast       #68  <Class ImageButton>
    //  116  251:astore          8
    //  117  253:aload           8
    //  118  255:new             #96  <Class StylingHiFragment$9>
    //  119  258:dup             
    //  120  259:aload_0         
    //  121  260:aload           8
    //  122  262:invokespecial   #97  <Method void StylingHiFragment$9(StylingHiFragment, ImageButton)>
    //  123  265:invokevirtual   #81  <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
    //  124  268:aload_0         
    //  125  269:getfield        #30  <Field View view>
    //  126  272:ldc1            #98  <Int 0x7f0600c5>
    //  127  274:invokevirtual   #37  <Method View View.findViewById(int)>
    //  128  277:checkcast       #68  <Class ImageButton>
    //  129  280:astore          9
    //  130  282:aload           9
    //  131  284:new             #100 <Class StylingHiFragment$10>
    //  132  287:dup             
    //  133  288:aload_0         
    //  134  289:aload           9
    //  135  291:invokespecial   #101 <Method void StylingHiFragment$10(StylingHiFragment, ImageButton)>
    //  136  294:invokevirtual   #81  <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
    //  137  297:aload_0         
    //  138  298:getfield        #30  <Field View view>
    //  139  301:ldc1            #102 <Int 0x7f0600ca>
    //  140  303:invokevirtual   #37  <Method View View.findViewById(int)>
    //  141  306:checkcast       #39  <Class Button>
    //  142  309:astore          10
    //  143  311:aload           10
    //  144  313:ifnull          329
    //  145  316:aload           10
    //  146  318:new             #104 <Class StylingHiFragment$11>
    //  147  321:dup             
    //  148  322:aload_0         
    //  149  323:invokespecial   #105 <Method void StylingHiFragment$11(StylingHiFragment)>
    //  150  326:invokevirtual   #48  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //  151  329:return          
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
    //    0    0:aload_1         
    //    1    1:ldc1            #108 <Int 0x7f030036>
    //    2    3:aload_2         
    //    3    4:iconst_0        
    //    4    5:invokevirtual   #114 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
    //    5    8:astore          4
    //    6   10:aload_0         
    //    7   11:aload           4
    //    8   13:putfield        #30  <Field View view>
    //    9   16:aload           4
    //   10   18:areturn         
    }

    public void onSaveInstanceState(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #117 <Method void Fragment.onSaveInstanceState(Bundle)>
    //    3    5:aload_0         
    //    4    6:iconst_1        
    //    5    7:invokevirtual   #121 <Method void setUserVisibleHint(boolean)>
    //    6   10:return          
    }

    boolean isBold;
    boolean isStrike;
    boolean isUnderline;
    View view;

    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingHiFragment$1

/* anonymous class */
    class _cls1
        implements android.view.View.OnClickListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StylingHiFragment this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view1)
        {
        //    0    0:getstatic       #30  <Field SuperSurface StylingActivity.superSurface>
        //    1    3:ldc1            #32  <String "semi">
        //    2    5:invokevirtual   #38  <Method void SuperSurface.reset(String)>
        //    3    8:getstatic       #30  <Field SuperSurface StylingActivity.superSurface>
        //    4   11:invokevirtual   #42  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //    5   14:bipush          100
        //    6   16:putfield        #48  <Field int SuperSurfaceItem.opacity>
        //    7   19:getstatic       #30  <Field SuperSurface StylingActivity.superSurface>
        //    8   22:invokevirtual   #42  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //    9   25:iconst_0        
        //   10   26:putfield        #51  <Field int SuperSurfaceItem.reflection>
        //   11   29:getstatic       #30  <Field SuperSurface StylingActivity.superSurface>
        //   12   32:invokevirtual   #42  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //   13   35:iconst_0        
        //   14   36:putfield        #54  <Field int SuperSurfaceItem.rotation>
        //   15   39:getstatic       #30  <Field SuperSurface StylingActivity.superSurface>
        //   16   42:invokevirtual   #42  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //   17   45:getfield        #58  <Field el7rTextView SuperSurfaceItem.textViewDraw>
        //   18   48:aconst_null     
        //   19   49:invokevirtual   #63  <Method void el7rTextView.setShadowColor(String)>
        //   20   52:getstatic       #30  <Field SuperSurface StylingActivity.superSurface>
        //   21   55:invokevirtual   #42  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //   22   58:aconst_null     
        //   23   59:putfield        #67  <Field String SuperSurfaceItem.highlightColor>
        //   24   62:getstatic       #30  <Field SuperSurface StylingActivity.superSurface>
        //   25   65:invokevirtual   #42  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //   26   68:bipush          70
        //   27   70:putfield        #70  <Field int SuperSurfaceItem.highlightOpacity>
        // try 73 86 handler(s) 93
        //   28   73:getstatic       #74  <Field ArrayList StylingActivity.templatesList>
        //   29   76:iconst_2        
        //   30   77:invokevirtual   #80  <Method Object ArrayList.get(int)>
        //   31   80:checkcast       #82  <Class String>
        //   32   83:invokestatic    #85  <Method void StylingActivity.setTemplate(String)>
        //   33   86:getstatic       #30  <Field SuperSurface StylingActivity.superSurface>
        //   34   89:invokevirtual   #88  <Method void SuperSurface.requestUpdate()>
        //   35   92:return          
        // catch IOException
        //   36   93:astore_2        
        //   37   94:aload_2         
        //   38   95:invokevirtual   #91  <Method void IOException.printStackTrace()>
        //   39   98:goto            86
        }

        final StylingHiFragment this$0;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingHiFragment$10

/* anonymous class */
    class _cls10
        implements android.view.View.OnClickListener
    {

        _cls10()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field StylingHiFragment this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field ImageButton val$strikeBtn>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public void onClick(View view1)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field StylingHiFragment this$0>
        //    2    4:getfield        #30  <Field boolean StylingHiFragment.isStrike>
        //    3    7:ifeq            78
        //    4   10:aload_0         
        //    5   11:getfield        #19  <Field StylingHiFragment this$0>
        //    6   14:iconst_0        
        //    7   15:putfield        #30  <Field boolean StylingHiFragment.isStrike>
        //    8   18:getstatic       #36  <Field SuperSurface StylingActivity.superSurface>
        //    9   21:invokevirtual   #42  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //   10   24:invokevirtual   #48  <Method SpannableString SuperSurfaceItem.getText()>
        //   11   27:astore_3        
        //   12   28:aload_3         
        //   13   29:new             #50  <Class StylingHiFragment$NoStrikethroughSpan>
        //   14   32:dup             
        //   15   33:aload_0         
        //   16   34:getfield        #19  <Field StylingHiFragment this$0>
        //   17   37:invokespecial   #53  <Method void StylingHiFragment$NoStrikethroughSpan(StylingHiFragment)>
        //   18   40:iconst_0        
        //   19   41:aload_3         
        //   20   42:invokevirtual   #59  <Method int SpannableString.length()>
        //   21   45:iconst_0        
        //   22   46:invokevirtual   #63  <Method void SpannableString.setSpan(Object, int, int, int)>
        //   23   49:getstatic       #36  <Field SuperSurface StylingActivity.superSurface>
        //   24   52:invokevirtual   #42  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //   25   55:aload_3         
        //   26   56:invokevirtual   #67  <Method void SuperSurfaceItem.setText(SpannableString)>
        //   27   59:getstatic       #36  <Field SuperSurface StylingActivity.superSurface>
        //   28   62:invokevirtual   #42  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //   29   65:invokestatic    #71  <Method void StylingActivity.updateText(SuperSurfaceItem)>
        //   30   68:aload_0         
        //   31   69:getfield        #21  <Field ImageButton val$strikeBtn>
        //   32   72:ldc1            #72  <Int 0x7f020077>
        //   33   74:invokevirtual   #78  <Method void ImageButton.setBackgroundResource(int)>
        //   34   77:return          
        //   35   78:getstatic       #36  <Field SuperSurface StylingActivity.superSurface>
        //   36   81:invokevirtual   #42  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //   37   84:invokevirtual   #48  <Method SpannableString SuperSurfaceItem.getText()>
        //   38   87:astore_2        
        //   39   88:aload_2         
        //   40   89:new             #80  <Class StrikethroughSpan>
        //   41   92:dup             
        //   42   93:invokespecial   #81  <Method void StrikethroughSpan()>
        //   43   96:iconst_0        
        //   44   97:aload_2         
        //   45   98:invokevirtual   #59  <Method int SpannableString.length()>
        //   46  101:iconst_0        
        //   47  102:invokevirtual   #63  <Method void SpannableString.setSpan(Object, int, int, int)>
        //   48  105:getstatic       #36  <Field SuperSurface StylingActivity.superSurface>
        //   49  108:invokevirtual   #42  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //   50  111:aload_2         
        //   51  112:invokevirtual   #67  <Method void SuperSurfaceItem.setText(SpannableString)>
        //   52  115:getstatic       #36  <Field SuperSurface StylingActivity.superSurface>
        //   53  118:invokevirtual   #42  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //   54  121:invokestatic    #71  <Method void StylingActivity.updateText(SuperSurfaceItem)>
        //   55  124:aload_0         
        //   56  125:getfield        #21  <Field ImageButton val$strikeBtn>
        //   57  128:ldc1            #82  <Int 0x7f020078>
        //   58  130:invokevirtual   #78  <Method void ImageButton.setBackgroundResource(int)>
        //   59  133:aload_0         
        //   60  134:getfield        #19  <Field StylingHiFragment this$0>
        //   61  137:iconst_1        
        //   62  138:putfield        #30  <Field boolean StylingHiFragment.isStrike>
        //   63  141:return          
        }

        final StylingHiFragment this$0;
        private final ImageButton val$strikeBtn;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingHiFragment$11

/* anonymous class */
    class _cls11
        implements android.view.View.OnClickListener
    {

        _cls11()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StylingHiFragment this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view1)
        {
        //    0    0:getstatic       #28  <Field ViewPager StylingActivity.viewPager>
        //    1    3:iconst_1        
        //    2    4:invokevirtual   #34  <Method void ViewPager.setCurrentItem(int)>
        //    3    7:return          
        }

        final StylingHiFragment this$0;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingHiFragment$2

/* anonymous class */
    class _cls2
        implements android.view.View.OnClickListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field StylingHiFragment this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field Activity val$mainActivity>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public void onClick(View view1)
        {
        //    0    0:new             #28  <Class Intent>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:getfield        #21  <Field Activity val$mainActivity>
        //    4    8:ldc1            #30  <Class EditTextActivity>
        //    5   10:invokespecial   #33  <Method void Intent(android.content.Context, Class)>
        //    6   13:astore_2        
        //    7   14:aload_0         
        //    8   15:getfield        #19  <Field StylingHiFragment this$0>
        //    9   18:aload_2         
        //   10   19:invokevirtual   #37  <Method void StylingHiFragment.startActivity(Intent)>
        //   11   22:return          
        }

        final StylingHiFragment this$0;
        private final Activity val$mainActivity;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingHiFragment$3

/* anonymous class */
    class _cls3
        implements android.view.View.OnClickListener
    {

        _cls3()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field StylingHiFragment this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field Activity val$mainActivity>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public void onClick(View view1)
        {
        //    0    0:new             #28  <Class Intent>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:getfield        #21  <Field Activity val$mainActivity>
        //    4    8:ldc1            #30  <Class CreateTextboxActivity>
        //    5   10:invokespecial   #33  <Method void Intent(android.content.Context, Class)>
        //    6   13:astore_2        
        //    7   14:aload_0         
        //    8   15:getfield        #19  <Field StylingHiFragment this$0>
        //    9   18:aload_2         
        //   10   19:invokevirtual   #37  <Method void StylingHiFragment.startActivity(Intent)>
        //   11   22:return          
        }

        final StylingHiFragment this$0;
        private final Activity val$mainActivity;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingHiFragment$4

/* anonymous class */
    class _cls4
        implements android.view.View.OnClickListener
    {

        _cls4()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field StylingHiFragment this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field Button val$randomizeBtn>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public void onClick(View view1)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field Button val$randomizeBtn>
        //    2    4:iconst_0        
        //    3    5:invokevirtual   #32  <Method void Button.setEnabled(boolean)>
        //    4    8:aload_0         
        //    5    9:getfield        #21  <Field Button val$randomizeBtn>
        //    6   12:invokestatic    #38  <Method ViewPropertyAnimator ViewPropertyAnimator.animate(View)>
        //    7   15:ldc2w           #39  <Long 1000L>
        //    8   18:invokevirtual   #44  <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
        //    9   21:ldc1            #45  <Float 360F>
        //   10   23:invokevirtual   #49  <Method ViewPropertyAnimator ViewPropertyAnimator.rotationYBy(float)>
        //   11   26:pop             
        //   12   27:new             #51  <Class Handler>
        //   13   30:dup             
        //   14   31:invokespecial   #52  <Method void Handler()>
        //   15   34:new             #54  <Class StylingHiFragment$4$1>
        //   16   37:dup             
        //   17   38:aload_0         
        //   18   39:aload_0         
        //   19   40:getfield        #21  <Field Button val$randomizeBtn>
        //   20   43:invokespecial   #57  <Method void StylingHiFragment$4$1(StylingHiFragment$4, Button)>
        //   21   46:ldc2w           #39  <Long 1000L>
        //   22   49:invokevirtual   #61  <Method boolean Handler.postDelayed(Runnable, long)>
        //   23   52:pop             
        //   24   53:return          
        }

        final StylingHiFragment this$0;
        private final Button val$randomizeBtn;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingHiFragment$4$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field StylingHiFragment$4 this$1>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field Button val$randomizeBtn>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field Button val$randomizeBtn>
        //    2    4:iconst_1        
        //    3    5:invokevirtual   #33  <Method void Button.setEnabled(boolean)>
        //    4    8:bipush          -2
        //    5   10:getstatic       #39  <Field ArrayList StylingActivity.templatesList>
        //    6   13:invokevirtual   #45  <Method int ArrayList.size()>
        //    7   16:iadd            
        //    8   17:istore_1        
        //    9   18:iconst_2        
        //   10   19:invokestatic    #51  <Method double Math.random()>
        //   11   22:iconst_1        
        //   12   23:iload_1         
        //   13   24:iconst_2        
        //   14   25:isub            
        //   15   26:iadd            
        //   16   27:i2d             
        //   17   28:dmul            
        //   18   29:d2i             
        //   19   30:iadd            
        //   20   31:istore_2        
        // try 32 55 handler(s) 56
        //   21   32:getstatic       #39  <Field ArrayList StylingActivity.templatesList>
        //   22   35:iload_2         
        //   23   36:invokevirtual   #55  <Method Object ArrayList.get(int)>
        //   24   39:ifnull          55
        //   25   42:getstatic       #39  <Field ArrayList StylingActivity.templatesList>
        //   26   45:iload_2         
        //   27   46:invokevirtual   #55  <Method Object ArrayList.get(int)>
        //   28   49:checkcast       #57  <Class String>
        //   29   52:invokestatic    #61  <Method void StylingActivity.setTemplate(String)>
        //   30   55:return          
        // catch IOException
        //   31   56:astore_3        
        //   32   57:aload_3         
        //   33   58:invokevirtual   #64  <Method void IOException.printStackTrace()>
        //   34   61:return          
        }

        final _cls4 this$1;
        private final Button val$randomizeBtn;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingHiFragment$5

/* anonymous class */
    class _cls5
        implements android.view.View.OnClickListener
    {

        _cls5()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #21  <Field StylingHiFragment this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #23  <Field ImageButton val$alignLeftBtn>
        //    6   10:aload_0         
        //    7   11:aload_3         
        //    8   12:putfield        #25  <Field ImageButton val$alignRightBtn>
        //    9   15:aload_0         
        //   10   16:aload           4
        //   11   18:putfield        #27  <Field ImageButton val$alignCenterBtn>
        //   12   21:aload_0         
        //   13   22:invokespecial   #30  <Method void Object()>
        //   14   25:return          
        }

        public void onClick(View view1)
        {
        //    0    0:getstatic       #38  <Field SuperSurface StylingActivity.superSurface>
        //    1    3:invokevirtual   #44  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //    2    6:iconst_3        
        //    3    7:invokevirtual   #50  <Method void SuperSurfaceItem.setTextGravity(int)>
        //    4   10:aload_0         
        //    5   11:getfield        #23  <Field ImageButton val$alignLeftBtn>
        //    6   14:ldc1            #51  <Int 0x7f020078>
        //    7   16:invokevirtual   #56  <Method void ImageButton.setBackgroundResource(int)>
        //    8   19:aload_0         
        //    9   20:getfield        #25  <Field ImageButton val$alignRightBtn>
        //   10   23:ldc1            #57  <Int 0x7f020077>
        //   11   25:invokevirtual   #56  <Method void ImageButton.setBackgroundResource(int)>
        //   12   28:aload_0         
        //   13   29:getfield        #27  <Field ImageButton val$alignCenterBtn>
        //   14   32:ldc1            #57  <Int 0x7f020077>
        //   15   34:invokevirtual   #56  <Method void ImageButton.setBackgroundResource(int)>
        //   16   37:getstatic       #38  <Field SuperSurface StylingActivity.superSurface>
        //   17   40:invokevirtual   #44  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //   18   43:invokestatic    #61  <Method void StylingActivity.updateTextBitmap(SuperSurfaceItem)>
        //   19   46:return          
        }

        final StylingHiFragment this$0;
        private final ImageButton val$alignCenterBtn;
        private final ImageButton val$alignLeftBtn;
        private final ImageButton val$alignRightBtn;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingHiFragment$6

/* anonymous class */
    class _cls6
        implements android.view.View.OnClickListener
    {

        _cls6()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #21  <Field StylingHiFragment this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #23  <Field ImageButton val$alignLeftBtn>
        //    6   10:aload_0         
        //    7   11:aload_3         
        //    8   12:putfield        #25  <Field ImageButton val$alignRightBtn>
        //    9   15:aload_0         
        //   10   16:aload           4
        //   11   18:putfield        #27  <Field ImageButton val$alignCenterBtn>
        //   12   21:aload_0         
        //   13   22:invokespecial   #30  <Method void Object()>
        //   14   25:return          
        }

        public void onClick(View view1)
        {
        //    0    0:getstatic       #38  <Field SuperSurface StylingActivity.superSurface>
        //    1    3:invokevirtual   #44  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //    2    6:iconst_1        
        //    3    7:invokevirtual   #50  <Method void SuperSurfaceItem.setTextGravity(int)>
        //    4   10:aload_0         
        //    5   11:getfield        #23  <Field ImageButton val$alignLeftBtn>
        //    6   14:ldc1            #51  <Int 0x7f020077>
        //    7   16:invokevirtual   #56  <Method void ImageButton.setBackgroundResource(int)>
        //    8   19:aload_0         
        //    9   20:getfield        #25  <Field ImageButton val$alignRightBtn>
        //   10   23:ldc1            #51  <Int 0x7f020077>
        //   11   25:invokevirtual   #56  <Method void ImageButton.setBackgroundResource(int)>
        //   12   28:aload_0         
        //   13   29:getfield        #27  <Field ImageButton val$alignCenterBtn>
        //   14   32:ldc1            #57  <Int 0x7f020078>
        //   15   34:invokevirtual   #56  <Method void ImageButton.setBackgroundResource(int)>
        //   16   37:getstatic       #38  <Field SuperSurface StylingActivity.superSurface>
        //   17   40:invokevirtual   #44  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //   18   43:invokestatic    #61  <Method void StylingActivity.updateTextBitmap(SuperSurfaceItem)>
        //   19   46:return          
        }

        final StylingHiFragment this$0;
        private final ImageButton val$alignCenterBtn;
        private final ImageButton val$alignLeftBtn;
        private final ImageButton val$alignRightBtn;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingHiFragment$7

/* anonymous class */
    class _cls7
        implements android.view.View.OnClickListener
    {

        _cls7()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #21  <Field StylingHiFragment this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #23  <Field ImageButton val$alignLeftBtn>
        //    6   10:aload_0         
        //    7   11:aload_3         
        //    8   12:putfield        #25  <Field ImageButton val$alignRightBtn>
        //    9   15:aload_0         
        //   10   16:aload           4
        //   11   18:putfield        #27  <Field ImageButton val$alignCenterBtn>
        //   12   21:aload_0         
        //   13   22:invokespecial   #30  <Method void Object()>
        //   14   25:return          
        }

        public void onClick(View view1)
        {
        //    0    0:getstatic       #38  <Field SuperSurface StylingActivity.superSurface>
        //    1    3:invokevirtual   #44  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //    2    6:iconst_5        
        //    3    7:invokevirtual   #50  <Method void SuperSurfaceItem.setTextGravity(int)>
        //    4   10:aload_0         
        //    5   11:getfield        #23  <Field ImageButton val$alignLeftBtn>
        //    6   14:ldc1            #51  <Int 0x7f020077>
        //    7   16:invokevirtual   #56  <Method void ImageButton.setBackgroundResource(int)>
        //    8   19:aload_0         
        //    9   20:getfield        #25  <Field ImageButton val$alignRightBtn>
        //   10   23:ldc1            #57  <Int 0x7f020078>
        //   11   25:invokevirtual   #56  <Method void ImageButton.setBackgroundResource(int)>
        //   12   28:aload_0         
        //   13   29:getfield        #27  <Field ImageButton val$alignCenterBtn>
        //   14   32:ldc1            #51  <Int 0x7f020077>
        //   15   34:invokevirtual   #56  <Method void ImageButton.setBackgroundResource(int)>
        //   16   37:getstatic       #38  <Field SuperSurface StylingActivity.superSurface>
        //   17   40:invokevirtual   #44  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //   18   43:invokestatic    #61  <Method void StylingActivity.updateTextBitmap(SuperSurfaceItem)>
        //   19   46:return          
        }

        final StylingHiFragment this$0;
        private final ImageButton val$alignCenterBtn;
        private final ImageButton val$alignLeftBtn;
        private final ImageButton val$alignRightBtn;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingHiFragment$8

/* anonymous class */
    class _cls8
        implements android.view.View.OnClickListener
    {

        _cls8()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field StylingHiFragment this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field ImageButton val$boldBtn>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public void onClick(View view1)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field StylingHiFragment this$0>
        //    2    4:getfield        #30  <Field boolean StylingHiFragment.isBold>
        //    3    7:ifeq            62
        //    4   10:getstatic       #36  <Field SuperSurface StylingActivity.superSurface>
        //    5   13:invokevirtual   #42  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //    6   16:getfield        #48  <Field el7rTextView SuperSurfaceItem.textViewDraw>
        //    7   19:getstatic       #36  <Field SuperSurface StylingActivity.superSurface>
        //    8   22:invokevirtual   #42  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //    9   25:getfield        #48  <Field el7rTextView SuperSurfaceItem.textViewDraw>
        //   10   28:invokevirtual   #54  <Method android.graphics.Typeface el7rTextView.getTypeface()>
        //   11   31:iconst_0        
        //   12   32:invokevirtual   #58  <Method void el7rTextView.setTypeface(android.graphics.Typeface, int)>
        //   13   35:aload_0         
        //   14   36:getfield        #21  <Field ImageButton val$boldBtn>
        //   15   39:ldc1            #59  <Int 0x7f020077>
        //   16   41:invokevirtual   #65  <Method void ImageButton.setBackgroundResource(int)>
        //   17   44:aload_0         
        //   18   45:getfield        #19  <Field StylingHiFragment this$0>
        //   19   48:iconst_0        
        //   20   49:putfield        #30  <Field boolean StylingHiFragment.isBold>
        //   21   52:getstatic       #36  <Field SuperSurface StylingActivity.superSurface>
        //   22   55:invokevirtual   #42  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //   23   58:invokestatic    #69  <Method void StylingActivity.updateTextBitmap(SuperSurfaceItem)>
        //   24   61:return          
        //   25   62:getstatic       #36  <Field SuperSurface StylingActivity.superSurface>
        //   26   65:invokevirtual   #42  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //   27   68:getfield        #48  <Field el7rTextView SuperSurfaceItem.textViewDraw>
        //   28   71:getstatic       #36  <Field SuperSurface StylingActivity.superSurface>
        //   29   74:invokevirtual   #42  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //   30   77:getfield        #48  <Field el7rTextView SuperSurfaceItem.textViewDraw>
        //   31   80:invokevirtual   #54  <Method android.graphics.Typeface el7rTextView.getTypeface()>
        //   32   83:iconst_1        
        //   33   84:invokevirtual   #58  <Method void el7rTextView.setTypeface(android.graphics.Typeface, int)>
        //   34   87:aload_0         
        //   35   88:getfield        #21  <Field ImageButton val$boldBtn>
        //   36   91:ldc1            #70  <Int 0x7f020078>
        //   37   93:invokevirtual   #65  <Method void ImageButton.setBackgroundResource(int)>
        //   38   96:aload_0         
        //   39   97:getfield        #19  <Field StylingHiFragment this$0>
        //   40  100:iconst_1        
        //   41  101:putfield        #30  <Field boolean StylingHiFragment.isBold>
        //   42  104:goto            52
        }

        final StylingHiFragment this$0;
        private final ImageButton val$boldBtn;
    }


    // Unreferenced inner class codeadore/textgram/styling_fragments/StylingHiFragment$9

/* anonymous class */
    class _cls9
        implements android.view.View.OnClickListener
    {

        _cls9()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field StylingHiFragment this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field ImageButton val$underlineBtn>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public void onClick(View view1)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field StylingHiFragment this$0>
        //    2    4:getfield        #30  <Field boolean StylingHiFragment.isUnderline>
        //    3    7:ifeq            78
        //    4   10:aload_0         
        //    5   11:getfield        #19  <Field StylingHiFragment this$0>
        //    6   14:iconst_0        
        //    7   15:putfield        #30  <Field boolean StylingHiFragment.isUnderline>
        //    8   18:getstatic       #36  <Field SuperSurface StylingActivity.superSurface>
        //    9   21:invokevirtual   #42  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //   10   24:invokevirtual   #48  <Method SpannableString SuperSurfaceItem.getText()>
        //   11   27:astore_3        
        //   12   28:aload_3         
        //   13   29:new             #50  <Class StylingHiFragment$NoUnderlineSpan>
        //   14   32:dup             
        //   15   33:aload_0         
        //   16   34:getfield        #19  <Field StylingHiFragment this$0>
        //   17   37:invokespecial   #53  <Method void StylingHiFragment$NoUnderlineSpan(StylingHiFragment)>
        //   18   40:iconst_0        
        //   19   41:aload_3         
        //   20   42:invokevirtual   #59  <Method int SpannableString.length()>
        //   21   45:iconst_0        
        //   22   46:invokevirtual   #63  <Method void SpannableString.setSpan(Object, int, int, int)>
        //   23   49:getstatic       #36  <Field SuperSurface StylingActivity.superSurface>
        //   24   52:invokevirtual   #42  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //   25   55:aload_3         
        //   26   56:invokevirtual   #67  <Method void SuperSurfaceItem.setText(SpannableString)>
        //   27   59:getstatic       #36  <Field SuperSurface StylingActivity.superSurface>
        //   28   62:invokevirtual   #42  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //   29   65:invokestatic    #71  <Method void StylingActivity.updateText(SuperSurfaceItem)>
        //   30   68:aload_0         
        //   31   69:getfield        #21  <Field ImageButton val$underlineBtn>
        //   32   72:ldc1            #72  <Int 0x7f020077>
        //   33   74:invokevirtual   #78  <Method void ImageButton.setBackgroundResource(int)>
        //   34   77:return          
        //   35   78:getstatic       #36  <Field SuperSurface StylingActivity.superSurface>
        //   36   81:invokevirtual   #42  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //   37   84:invokevirtual   #48  <Method SpannableString SuperSurfaceItem.getText()>
        //   38   87:astore_2        
        //   39   88:aload_2         
        //   40   89:new             #80  <Class UnderlineSpan>
        //   41   92:dup             
        //   42   93:invokespecial   #81  <Method void UnderlineSpan()>
        //   43   96:iconst_0        
        //   44   97:aload_2         
        //   45   98:invokevirtual   #59  <Method int SpannableString.length()>
        //   46  101:iconst_0        
        //   47  102:invokevirtual   #63  <Method void SpannableString.setSpan(Object, int, int, int)>
        //   48  105:getstatic       #36  <Field SuperSurface StylingActivity.superSurface>
        //   49  108:invokevirtual   #42  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //   50  111:aload_2         
        //   51  112:invokevirtual   #67  <Method void SuperSurfaceItem.setText(SpannableString)>
        //   52  115:getstatic       #36  <Field SuperSurface StylingActivity.superSurface>
        //   53  118:invokevirtual   #42  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
        //   54  121:invokestatic    #71  <Method void StylingActivity.updateText(SuperSurfaceItem)>
        //   55  124:aload_0         
        //   56  125:getfield        #21  <Field ImageButton val$underlineBtn>
        //   57  128:ldc1            #82  <Int 0x7f020078>
        //   58  130:invokevirtual   #78  <Method void ImageButton.setBackgroundResource(int)>
        //   59  133:aload_0         
        //   60  134:getfield        #19  <Field StylingHiFragment this$0>
        //   61  137:iconst_1        
        //   62  138:putfield        #30  <Field boolean StylingHiFragment.isUnderline>
        //   63  141:return          
        }

        final StylingHiFragment this$0;
        private final ImageButton val$underlineBtn;
    }

}
