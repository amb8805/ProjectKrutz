// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram;

import android.app.Activity;
import android.content.*;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.*;
import android.os.*;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.text.*;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.*;
import android.widget.Button;
import android.widget.LinearLayout;
import codeadore.textgram.adapters.StylingPagerAdapter;
import codeadore.textgram.custom_widgets.el7rTabPageIndicator;
import codeadore.textgram.custom_widgets.el7rTextView;
import com.google.android.apps.analytics.GoogleAnalyticsTracker;
import eu.janmuller.android.simplecropimage.CropImage;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package codeadore.textgram:
//            el7rFragmentActivity, SuperSurfaceItem, SuperSurface, Utilities, 
//            AdUtilities, ResultActivity

public class StylingActivity extends el7rFragmentActivity
{
    public class NoUnderlineSpan extends UnderlineSpan
    {

        public NoUnderlineSpan()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #10  <Field StylingActivity this$0>
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

        final StylingActivity this$0;
    }


    static 
    {
    //    0    0:new             #59  <Class SuperSurfaceItem>
    //    1    3:dup             
    //    2    4:invokespecial   #62  <Method void SuperSurfaceItem()>
    //    3    7:putstatic       #64  <Field SuperSurfaceItem mainTextItem>
    //    4   10:ldc1            #66  <String "StylingActivity">
    //    5   12:putstatic       #68  <Field String TAG>
    //    6   15:aconst_null     
    //    7   16:putstatic       #70  <Field String typeFacePath>
    //    8   19:iconst_m1       
    //    9   20:putstatic       #72  <Field int lastChosenBGColor>
    //   10   23:aconst_null     
    //   11   24:putstatic       #74  <Field Editable theText>
    //   12   27:iconst_0        
    //   13   28:putstatic       #76  <Field boolean pauseSetBG>
    //   14   31:return          
    }

    public StylingActivity()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #77  <Method void el7rFragmentActivity()>
    //    2    4:aload_0         
    //    3    5:ldc1            #79  <String "">
    //    4    7:putfield        #81  <Field String lastOrientation>
    //    5   10:aload_0         
    //    6   11:iconst_0        
    //    7   12:putfield        #83  <Field boolean treeObserverActionDone>
    //    8   15:return          
    }

    public static void applyHighlightColor(String s)
    {
    //    0    0:getstatic       #87  <Field SuperSurface superSurface>
    //    1    3:invokevirtual   #93  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
    //    2    6:aload_0         
    //    3    7:putfield        #96  <Field String SuperSurfaceItem.highlightColor>
    //    4   10:getstatic       #87  <Field SuperSurface superSurface>
    //    5   13:invokevirtual   #93  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
    //    6   16:invokestatic    #100 <Method void updateTextBitmap(SuperSurfaceItem)>
    //    7   19:getstatic       #87  <Field SuperSurface superSurface>
    //    8   22:invokevirtual   #103 <Method void SuperSurface.requestUpdate()>
    //    9   25:return          
    }

    public static void applyTextColor(String s)
    {
    //    0    0:getstatic       #87  <Field SuperSurface superSurface>
    //    1    3:invokevirtual   #93  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
    //    2    6:aload_0         
    //    3    7:putfield        #107 <Field String SuperSurfaceItem.textColor>
    //    4   10:getstatic       #87  <Field SuperSurface superSurface>
    //    5   13:invokevirtual   #93  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
    //    6   16:invokestatic    #100 <Method void updateTextBitmap(SuperSurfaceItem)>
    //    7   19:getstatic       #87  <Field SuperSurface superSurface>
    //    8   22:invokevirtual   #103 <Method void SuperSurface.requestUpdate()>
    //    9   25:return          
    }

    public static void applyTextShadow(String s)
    {
    //    0    0:aload_0         
    //    1    1:ldc1            #112 <String "[none]">
    //    2    3:if_acmpeq       35
    // try 6 34 handler(s) 61
    //    3    6:getstatic       #87  <Field SuperSurface superSurface>
    //    4    9:invokevirtual   #93  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
    //    5   12:aload_0         
    //    6   13:invokestatic    #118 <Method int Color.parseColor(String)>
    //    7   16:putfield        #121 <Field int SuperSurfaceItem.textShadowColor>
    //    8   19:getstatic       #87  <Field SuperSurface superSurface>
    //    9   22:invokevirtual   #93  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
    //   10   25:invokestatic    #100 <Method void updateTextBitmap(SuperSurfaceItem)>
    //   11   28:getstatic       #87  <Field SuperSurface superSurface>
    //   12   31:invokevirtual   #103 <Method void SuperSurface.requestUpdate()>
    //   13   34:return          
    // try 35 60 handler(s) 61
    //   14   35:getstatic       #87  <Field SuperSurface superSurface>
    //   15   38:invokevirtual   #93  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
    //   16   41:iconst_0        
    //   17   42:putfield        #121 <Field int SuperSurfaceItem.textShadowColor>
    //   18   45:getstatic       #87  <Field SuperSurface superSurface>
    //   19   48:invokevirtual   #93  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
    //   20   51:invokestatic    #100 <Method void updateTextBitmap(SuperSurfaceItem)>
    //   21   54:getstatic       #87  <Field SuperSurface superSurface>
    //   22   57:invokevirtual   #103 <Method void SuperSurface.requestUpdate()>
    //   23   60:return          
    // catch Exception Exception
    //   24   61:astore_1        
    //   25   62:aload_1         
    //   26   63:invokevirtual   #124 <Method void Exception.printStackTrace()>
    //   27   66:return          
    }

    public static void copyStream(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
    //    0    0:sipush          1024
    //    1    3:newarray        byte[]
    //    2    5:astore_2        
    //    3    6:aload_0         
    //    4    7:aload_2         
    //    5    8:invokevirtual   #134 <Method int InputStream.read(byte[])>
    //    6   11:istore_3        
    //    7   12:iload_3         
    //    8   13:iconst_m1       
    //    9   14:icmpne          18
    //   10   17:return          
    //   11   18:aload_1         
    //   12   19:aload_2         
    //   13   20:iconst_0        
    //   14   21:iload_3         
    //   15   22:invokevirtual   #140 <Method void OutputStream.write(byte[], int, int)>
    //   16   25:goto            6
    }

    public static void resetItems()
    {
    // try 0 38 handler(s) 39
    //    0    0:new             #143 <Class StylingPagerAdapter>
    //    1    3:dup             
    //    2    4:getstatic       #145 <Field FragmentManager fragmentManager>
    //    3    7:invokespecial   #148 <Method void StylingPagerAdapter(FragmentManager)>
    //    4   10:putstatic       #150 <Field StylingPagerAdapter pagerAdapter>
    //    5   13:getstatic       #152 <Field ViewPager viewPager>
    //    6   16:getstatic       #150 <Field StylingPagerAdapter pagerAdapter>
    //    7   19:invokevirtual   #158 <Method void ViewPager.setAdapter(android.support.v4.view.PagerAdapter)>
    //    8   22:getstatic       #160 <Field el7rTabPageIndicator titleIndicator>
    //    9   25:getstatic       #152 <Field ViewPager viewPager>
    //   10   28:invokevirtual   #166 <Method void el7rTabPageIndicator.setViewPager(ViewPager)>
    //   11   31:getstatic       #160 <Field el7rTabPageIndicator titleIndicator>
    //   12   34:iconst_0        
    //   13   35:invokevirtual   #170 <Method void el7rTabPageIndicator.setCurrentItem(int)>
    //   14   38:return          
    // catch Exception
    //   15   39:astore_0        
    //   16   40:getstatic       #68  <Field String TAG>
    //   17   43:new             #172 <Class StringBuilder>
    //   18   46:dup             
    //   19   47:ldc1            #174 <String "in reload(): ">
    //   20   49:invokespecial   #176 <Method void StringBuilder(String)>
    //   21   52:aload_0         
    //   22   53:invokevirtual   #180 <Method String Exception.toString()>
    //   23   56:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
    //   24   59:invokevirtual   #185 <Method String StringBuilder.toString()>
    //   25   62:invokestatic    #191 <Method int Log.e(String, String)>
    //   26   65:pop             
    //   27   66:return          
    }

    public static void setTemplate(String s)
        throws IOException
    {
    //    0    0:getstatic       #194 <Field Context c>
    //    1    3:aload_0         
    //    2    4:ldc1            #196 <String "textcolor">
    //    3    6:invokestatic    #202 <Method String Utilities.getTemplateField(Context, String, String)>
    //    4    9:astore_1        
    //    5   10:getstatic       #194 <Field Context c>
    //    6   13:aload_0         
    //    7   14:ldc1            #204 <String "text_shadow">
    //    8   16:invokestatic    #202 <Method String Utilities.getTemplateField(Context, String, String)>
    //    9   19:astore_2        
    //   10   20:getstatic       #194 <Field Context c>
    //   11   23:aload_0         
    //   12   24:ldc1            #206 <String "text_reflection">
    //   13   26:invokestatic    #202 <Method String Utilities.getTemplateField(Context, String, String)>
    //   14   29:iconst_0        
    //   15   30:invokestatic    #210 <Method int Utilities.IntegerValueOf(String, int)>
    //   16   33:istore_3        
    //   17   34:getstatic       #194 <Field Context c>
    //   18   37:aload_0         
    //   19   38:ldc1            #212 <String "textsize">
    //   20   40:invokestatic    #202 <Method String Utilities.getTemplateField(Context, String, String)>
    //   21   43:bipush          25
    //   22   45:invokestatic    #210 <Method int Utilities.IntegerValueOf(String, int)>
    //   23   48:istore          4
    //   24   50:getstatic       #194 <Field Context c>
    //   25   53:aload_0         
    //   26   54:ldc1            #214 <String "padding_top">
    //   27   56:invokestatic    #202 <Method String Utilities.getTemplateField(Context, String, String)>
    //   28   59:bipush          10
    //   29   61:invokestatic    #210 <Method int Utilities.IntegerValueOf(String, int)>
    //   30   64:istore          5
    //   31   66:getstatic       #194 <Field Context c>
    //   32   69:aload_0         
    //   33   70:ldc1            #216 <String "padding_bottom">
    //   34   72:invokestatic    #202 <Method String Utilities.getTemplateField(Context, String, String)>
    //   35   75:bipush          10
    //   36   77:invokestatic    #210 <Method int Utilities.IntegerValueOf(String, int)>
    //   37   80:istore          6
    //   38   82:getstatic       #194 <Field Context c>
    //   39   85:aload_0         
    //   40   86:ldc1            #218 <String "padding_left">
    //   41   88:invokestatic    #202 <Method String Utilities.getTemplateField(Context, String, String)>
    //   42   91:bipush          10
    //   43   93:invokestatic    #210 <Method int Utilities.IntegerValueOf(String, int)>
    //   44   96:istore          7
    //   45   98:getstatic       #194 <Field Context c>
    //   46  101:aload_0         
    //   47  102:ldc1            #220 <String "padding_right">
    //   48  104:invokestatic    #202 <Method String Utilities.getTemplateField(Context, String, String)>
    //   49  107:bipush          10
    //   50  109:invokestatic    #210 <Method int Utilities.IntegerValueOf(String, int)>
    //   51  112:istore          8
    //   52  114:getstatic       #194 <Field Context c>
    //   53  117:aload_0         
    //   54  118:ldc1            #222 <String "rotation">
    //   55  120:invokestatic    #202 <Method String Utilities.getTemplateField(Context, String, String)>
    //   56  123:iconst_0        
    //   57  124:invokestatic    #210 <Method int Utilities.IntegerValueOf(String, int)>
    //   58  127:istore          9
    //   59  129:getstatic       #194 <Field Context c>
    //   60  132:aload_0         
    //   61  133:ldc1            #224 <String "background">
    //   62  135:invokestatic    #202 <Method String Utilities.getTemplateField(Context, String, String)>
    //   63  138:astore          10
    //   64  140:getstatic       #194 <Field Context c>
    //   65  143:aload_0         
    //   66  144:ldc1            #226 <String "font">
    //   67  146:invokestatic    #202 <Method String Utilities.getTemplateField(Context, String, String)>
    //   68  149:astore          11
    //   69  151:getstatic       #194 <Field Context c>
    //   70  154:aload_0         
    //   71  155:ldc1            #228 <String "highlight_color">
    //   72  157:invokestatic    #202 <Method String Utilities.getTemplateField(Context, String, String)>
    //   73  160:astore          12
    //   74  162:aload           11
    //   75  164:ldc1            #230 <String "[this]">
    //   76  166:if_acmpne       440
    //   77  169:new             #172 <Class StringBuilder>
    //   78  172:dup             
    //   79  173:aload_0         
    //   80  174:invokestatic    #236 <Method String String.valueOf(Object)>
    //   81  177:invokespecial   #176 <Method void StringBuilder(String)>
    //   82  180:ldc1            #238 <String "/font.ttf">
    //   83  182:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
    //   84  185:invokevirtual   #185 <Method String StringBuilder.toString()>
    //   85  188:astore          13
    //   86  190:aload           10
    //   87  192:ifnonnull       447
    //   88  195:new             #172 <Class StringBuilder>
    //   89  198:dup             
    //   90  199:aload_0         
    //   91  200:invokestatic    #236 <Method String String.valueOf(Object)>
    //   92  203:invokespecial   #176 <Method void StringBuilder(String)>
    //   93  206:ldc1            #240 <String "/background.jpg">
    //   94  208:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
    //   95  211:invokevirtual   #185 <Method String StringBuilder.toString()>
    //   96  214:astore          14
    //   97  216:getstatic       #194 <Field Context c>
    //   98  219:aload           14
    //   99  221:invokestatic    #244 <Method Bitmap Utilities.getBitmapFromPath(Context, String)>
    //  100  224:astore          15
    //  101  226:sipush          612
    //  102  229:iload           8
    //  103  231:iload           7
    //  104  233:iadd            
    //  105  234:isub            
    //  106  235:istore          16
    //  107  237:sipush          612
    //  108  240:iload           5
    //  109  242:iload           6
    //  110  244:iadd            
    //  111  245:isub            
    //  112  246:istore          17
    //  113  248:getstatic       #64  <Field SuperSurfaceItem mainTextItem>
    //  114  251:iload           7
    //  115  253:i2f             
    //  116  254:putfield        #248 <Field float SuperSurfaceItem.posX>
    //  117  257:getstatic       #64  <Field SuperSurfaceItem mainTextItem>
    //  118  260:iload           5
    //  119  262:i2f             
    //  120  263:putfield        #251 <Field float SuperSurfaceItem.posY>
    //  121  266:getstatic       #64  <Field SuperSurfaceItem mainTextItem>
    //  122  269:sipush          612
    //  123  272:iload           8
    //  124  274:iload           7
    //  125  276:iadd            
    //  126  277:isub            
    //  127  278:i2f             
    //  128  279:putfield        #254 <Field float SuperSurfaceItem.width>
    //  129  282:getstatic       #64  <Field SuperSurfaceItem mainTextItem>
    //  130  285:sipush          612
    //  131  288:iload           5
    //  132  290:iload           6
    //  133  292:iadd            
    //  134  293:isub            
    //  135  294:i2f             
    //  136  295:putfield        #257 <Field float SuperSurfaceItem.height>
    //  137  298:iload           9
    //  138  300:ifeq            488
    //  139  303:getstatic       #64  <Field SuperSurfaceItem mainTextItem>
    //  140  306:iload           9
    //  141  308:putfield        #259 <Field int SuperSurfaceItem.rotation>
    //  142  311:getstatic       #87  <Field SuperSurface superSurface>
    //  143  314:aload           15
    //  144  316:aload           14
    //  145  318:invokevirtual   #263 <Method void SuperSurface.setBackground(Bitmap, String)>
    //  146  321:aload           13
    //  147  323:invokestatic    #266 <Method void setTypeFace(String)>
    // try 326 333 handler(s) 498
    //  148  326:getstatic       #64  <Field SuperSurfaceItem mainTextItem>
    //  149  329:aload_1         
    //  150  330:putfield        #107 <Field String SuperSurfaceItem.textColor>
    //  151  333:getstatic       #64  <Field SuperSurfaceItem mainTextItem>
    //  152  336:aload           12
    //  153  338:putfield        #96  <Field String SuperSurfaceItem.highlightColor>
    //  154  341:getstatic       #64  <Field SuperSurfaceItem mainTextItem>
    //  155  344:bipush          70
    //  156  346:putfield        #269 <Field int SuperSurfaceItem.highlightOpacity>
    //  157  349:getstatic       #64  <Field SuperSurfaceItem mainTextItem>
    //  158  352:iload           4
    //  159  354:i2f             
    //  160  355:putfield        #272 <Field float SuperSurfaceItem.textSize>
    //  161  358:getstatic       #64  <Field SuperSurfaceItem mainTextItem>
    //  162  361:getfield        #274 <Field el7rTextView SuperSurfaceItem.textViewDraw>
    //  163  364:invokevirtual   #280 <Method android.view.ViewGroup$LayoutParams el7rTextView.getLayoutParams()>
    //  164  367:iload           17
    //  165  369:putfield        #284 <Field int android.view.ViewGroup$LayoutParams.height>
    //  166  372:getstatic       #64  <Field SuperSurfaceItem mainTextItem>
    //  167  375:getfield        #274 <Field el7rTextView SuperSurfaceItem.textViewDraw>
    //  168  378:invokevirtual   #280 <Method android.view.ViewGroup$LayoutParams el7rTextView.getLayoutParams()>
    //  169  381:iload           16
    //  170  383:putfield        #286 <Field int android.view.ViewGroup$LayoutParams.width>
    //  171  386:getstatic       #64  <Field SuperSurfaceItem mainTextItem>
    //  172  389:iconst_0        
    //  173  390:putfield        #121 <Field int SuperSurfaceItem.textShadowColor>
    //  174  393:aload_2         
    //  175  394:ifnull          407
    //  176  397:getstatic       #64  <Field SuperSurfaceItem mainTextItem>
    //  177  400:aload_2         
    //  178  401:invokestatic    #118 <Method int Color.parseColor(String)>
    //  179  404:putfield        #121 <Field int SuperSurfaceItem.textShadowColor>
    //  180  407:getstatic       #64  <Field SuperSurfaceItem mainTextItem>
    //  181  410:iconst_0        
    //  182  411:putfield        #289 <Field int SuperSurfaceItem.reflection>
    //  183  414:iload_3         
    //  184  415:ifeq            425
    //  185  418:getstatic       #64  <Field SuperSurfaceItem mainTextItem>
    //  186  421:iload_3         
    //  187  422:putfield        #289 <Field int SuperSurfaceItem.reflection>
    //  188  425:getstatic       #291 <Field Handler UIHandler>
    //  189  428:new             #293 <Class StylingActivity$6>
    //  190  431:dup             
    //  191  432:invokespecial   #294 <Method void StylingActivity$6()>
    //  192  435:invokevirtual   #300 <Method boolean Handler.post(Runnable)>
    //  193  438:pop             
    //  194  439:return          
    //  195  440:aload           11
    //  196  442:astore          13
    //  197  444:goto            190
    //  198  447:aload           10
    //  199  449:ldc1            #230 <String "[this]">
    //  200  451:invokevirtual   #304 <Method boolean String.contains(CharSequence)>
    //  201  454:ifeq            481
    //  202  457:new             #172 <Class StringBuilder>
    //  203  460:dup             
    //  204  461:aload_0         
    //  205  462:invokestatic    #236 <Method String String.valueOf(Object)>
    //  206  465:invokespecial   #176 <Method void StringBuilder(String)>
    //  207  468:ldc1            #240 <String "/background.jpg">
    //  208  470:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
    //  209  473:invokevirtual   #185 <Method String StringBuilder.toString()>
    //  210  476:astore          14
    //  211  478:goto            216
    //  212  481:aload           10
    //  213  483:astore          14
    //  214  485:goto            216
    //  215  488:getstatic       #64  <Field SuperSurfaceItem mainTextItem>
    //  216  491:iconst_0        
    //  217  492:putfield        #259 <Field int SuperSurfaceItem.rotation>
    //  218  495:goto            311
    // catch Exception
    //  219  498:astore          18
    //  220  500:aload           18
    //  221  502:invokevirtual   #124 <Method void Exception.printStackTrace()>
    //  222  505:goto            333
    }

    public static void setTypeFace(String s)
    {
    // try 0 10 handler(s) 11
    //    0    0:getstatic       #87  <Field SuperSurface superSurface>
    //    1    3:invokevirtual   #93  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
    //    2    6:aload_0         
    //    3    7:putfield        #305 <Field String SuperSurfaceItem.typeFacePath>
    //    4   10:return          
    // catch Exception
    //    5   11:astore_1        
    //    6   12:aload_1         
    //    7   13:invokevirtual   #124 <Method void Exception.printStackTrace()>
    //    8   16:return          
    }

    public static void startActivityForResultFork(Intent intent, int i)
    {
    //    0    0:getstatic       #194 <Field Context c>
    //    1    3:checkcast       #309 <Class Activity>
    //    2    6:aload_0         
    //    3    7:iload_1         
    //    4    8:invokevirtual   #312 <Method void Activity.startActivityForResult(Intent, int)>
    //    5   11:return          
    }

    public static void toggleSubFragment(boolean flag)
    {
    //    0    0:iload_0         
    //    1    1:ifeq            20
    //    2    4:getstatic       #152 <Field ViewPager viewPager>
    //    3    7:bipush          8
    //    4    9:invokevirtual   #317 <Method void ViewPager.setVisibility(int)>
    //    5   12:getstatic       #319 <Field LinearLayout fragmentContainerLL>
    //    6   15:iconst_0        
    //    7   16:invokevirtual   #322 <Method void LinearLayout.setVisibility(int)>
    //    8   19:return          
    //    9   20:getstatic       #319 <Field LinearLayout fragmentContainerLL>
    //   10   23:bipush          8
    //   11   25:invokevirtual   #322 <Method void LinearLayout.setVisibility(int)>
    //   12   28:getstatic       #152 <Field ViewPager viewPager>
    //   13   31:iconst_0        
    //   14   32:invokevirtual   #317 <Method void ViewPager.setVisibility(int)>
    //   15   35:return          
    }

    public static void updateText(SuperSurfaceItem supersurfaceitem)
    {
    // try 0 22 handler(s) 29
    //    0    0:getstatic       #87  <Field SuperSurface superSurface>
    //    1    3:invokevirtual   #93  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
    //    2    6:aload_0         
    //    3    7:getfield        #327 <Field SpannableString SuperSurfaceItem.text>
    //    4   10:invokevirtual   #331 <Method void SuperSurfaceItem.setText(SpannableString)>
    //    5   13:getstatic       #87  <Field SuperSurface superSurface>
    //    6   16:invokevirtual   #93  <Method SuperSurfaceItem SuperSurface.getCurrentTextItem()>
    //    7   19:invokevirtual   #333 <Method void SuperSurfaceItem.updateTextBitmap()>
    //    8   22:getstatic       #64  <Field SuperSurfaceItem mainTextItem>
    //    9   25:invokestatic    #100 <Method void updateTextBitmap(SuperSurfaceItem)>
    //   10   28:return          
    // catch Exception
    //   11   29:astore_1        
    //   12   30:getstatic       #68  <Field String TAG>
    //   13   33:new             #172 <Class StringBuilder>
    //   14   36:dup             
    //   15   37:ldc2            #335 <String "in updateText(): ">
    //   16   40:invokespecial   #176 <Method void StringBuilder(String)>
    //   17   43:aload_1         
    //   18   44:invokevirtual   #180 <Method String Exception.toString()>
    //   19   47:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
    //   20   50:invokevirtual   #185 <Method String StringBuilder.toString()>
    //   21   53:invokestatic    #191 <Method int Log.e(String, String)>
    //   22   56:pop             
    //   23   57:aload_1         
    //   24   58:invokevirtual   #124 <Method void Exception.printStackTrace()>
    //   25   61:goto            22
    }

    public static void updateTextBitmap(SuperSurfaceItem supersurfaceitem)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #333 <Method void SuperSurfaceItem.updateTextBitmap()>
    //    2    4:getstatic       #87  <Field SuperSurface superSurface>
    //    3    7:invokevirtual   #103 <Method void SuperSurface.requestUpdate()>
    //    4   10:return          
    }

    public void cropPicture(Activity activity, String s, int i)
    {
    //    0    0:new             #339 <Class Intent>
    //    1    3:dup             
    //    2    4:aload_1         
    //    3    5:ldc2            #341 <Class CropImage>
    //    4    8:invokespecial   #344 <Method void Intent(Context, Class)>
    //    5   11:astore          4
    //    6   13:aload           4
    //    7   15:ldc2            #346 <String "image-path">
    //    8   18:aload_0         
    //    9   19:getfield        #348 <Field File mFileTemp>
    //   10   22:invokevirtual   #353 <Method String File.getPath()>
    //   11   25:invokevirtual   #357 <Method Intent Intent.putExtra(String, String)>
    //   12   28:pop             
    //   13   29:aload           4
    //   14   31:ldc2            #359 <String "scale">
    //   15   34:iconst_1        
    //   16   35:invokevirtual   #362 <Method Intent Intent.putExtra(String, boolean)>
    //   17   38:pop             
    //   18   39:aload           4
    //   19   41:ldc2            #364 <String "orientation_in_degrees">
    //   20   44:iconst_1        
    //   21   45:invokevirtual   #362 <Method Intent Intent.putExtra(String, boolean)>
    //   22   48:pop             
    //   23   49:aload           4
    //   24   51:ldc2            #366 <String "aspectX">
    //   25   54:iconst_0        
    //   26   55:invokevirtual   #369 <Method Intent Intent.putExtra(String, int)>
    //   27   58:pop             
    //   28   59:aload           4
    //   29   61:ldc2            #371 <String "aspectY">
    //   30   64:iconst_0        
    //   31   65:invokevirtual   #369 <Method Intent Intent.putExtra(String, int)>
    //   32   68:pop             
    //   33   69:aload_1         
    //   34   70:aload           4
    //   35   72:iload_3         
    //   36   73:invokevirtual   #312 <Method void Activity.startActivityForResult(Intent, int)>
    //   37   76:return          
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:aload_3         
    //    4    4:invokespecial   #377 <Method void el7rFragmentActivity.onActivityResult(int, int, Intent)>
    // try 7 12 handler(s) 117
    //    5    7:aload_3         
    //    6    8:invokevirtual   #381 <Method android.net.Uri Intent.getData()>
    //    7   11:pop             
    //    8   12:iload_1         
    //    9   13:tableswitch     1 6: default 52
    //                   1 53
    //                   2 53
    //                   3 53
    //                   4 133
    //                   5 187
    //                   6 294
    //   10   52:return          
    // try 53 108 handler(s) 109 125 117
    //   11   53:aload_0         
    //   12   54:invokevirtual   #385 <Method ContentResolver getContentResolver()>
    //   13   57:aload_3         
    //   14   58:invokevirtual   #381 <Method android.net.Uri Intent.getData()>
    //   15   61:invokevirtual   #391 <Method InputStream ContentResolver.openInputStream(android.net.Uri)>
    //   16   64:astore          17
    //   17   66:new             #393 <Class FileOutputStream>
    //   18   69:dup             
    //   19   70:aload_0         
    //   20   71:getfield        #348 <Field File mFileTemp>
    //   21   74:invokespecial   #396 <Method void FileOutputStream(File)>
    //   22   77:astore          18
    //   23   79:aload           17
    //   24   81:aload           18
    //   25   83:invokestatic    #398 <Method void copyStream(InputStream, OutputStream)>
    //   26   86:aload           18
    //   27   88:invokevirtual   #401 <Method void FileOutputStream.close()>
    //   28   91:aload           17
    //   29   93:invokevirtual   #402 <Method void InputStream.close()>
    //   30   96:aload_0         
    //   31   97:aload_0         
    //   32   98:getfield        #406 <Field el7rFragmentActivity thisActivity>
    //   33  101:aconst_null     
    //   34  102:iload_1         
    //   35  103:iconst_3        
    //   36  104:iadd            
    //   37  105:invokevirtual   #408 <Method void cropPicture(Activity, String, int)>
    //   38  108:return          
    // catch FileNotFoundException
    //   39  109:astore          16
    // try 111 116 handler(s) 117
    //   40  111:aload           16
    //   41  113:invokevirtual   #409 <Method void FileNotFoundException.printStackTrace()>
    //   42  116:return          
    // catch Exception Exception Exception Exception Exception Exception Exception
    //   43  117:astore          4
    //   44  119:aload           4
    //   45  121:invokevirtual   #124 <Method void Exception.printStackTrace()>
    //   46  124:return          
    // catch IOException
    //   47  125:astore          15
    // try 127 132 handler(s) 117
    //   48  127:aload           15
    //   49  129:invokevirtual   #410 <Method void IOException.printStackTrace()>
    //   50  132:return          
    //   51  133:iload_2         
    //   52  134:iconst_m1       
    //   53  135:icmpne          52
    // try 138 186 handler(s) 117
    //   54  138:iconst_1        
    //   55  139:putstatic       #76  <Field boolean pauseSetBG>
    //   56  142:aload_0         
    //   57  143:getfield        #348 <Field File mFileTemp>
    //   58  146:invokevirtual   #353 <Method String File.getPath()>
    //   59  149:invokestatic    #416 <Method Bitmap BitmapFactory.decodeFile(String)>
    //   60  152:astore          12
    //   61  154:getstatic       #194 <Field Context c>
    //   62  157:aload           12
    //   63  159:invokestatic    #420 <Method String Utilities.createURIFromBitmap(Context, Bitmap)>
    //   64  162:astore          13
    //   65  164:getstatic       #291 <Field Handler UIHandler>
    //   66  167:new             #422 <Class StylingActivity$5>
    //   67  170:dup             
    //   68  171:aload_0         
    //   69  172:aload           12
    //   70  174:aload           13
    //   71  176:invokespecial   #425 <Method void StylingActivity$5(StylingActivity, Bitmap, String)>
    //   72  179:ldc2w           #426 <Long 50L>
    //   73  182:invokevirtual   #431 <Method boolean Handler.postDelayed(Runnable, long)>
    //   74  185:pop             
    //   75  186:return          
    //   76  187:iload_2         
    //   77  188:iconst_m1       
    //   78  189:icmpne          52
    // try 192 293 handler(s) 117
    //   79  192:aload_0         
    //   80  193:getfield        #348 <Field File mFileTemp>
    //   81  196:invokevirtual   #353 <Method String File.getPath()>
    //   82  199:invokestatic    #416 <Method Bitmap BitmapFactory.decodeFile(String)>
    //   83  202:astore          8
    //   84  204:getstatic       #194 <Field Context c>
    //   85  207:aload           8
    //   86  209:invokestatic    #420 <Method String Utilities.createURIFromBitmap(Context, Bitmap)>
    //   87  212:astore          9
    //   88  214:getstatic       #194 <Field Context c>
    //   89  217:aload           8
    //   90  219:invokestatic    #435 <Method Bitmap Utilities.decorateBitmap(Context, Bitmap)>
    //   91  222:astore          10
    //   92  224:new             #59  <Class SuperSurfaceItem>
    //   93  227:dup             
    //   94  228:invokespecial   #62  <Method void SuperSurfaceItem()>
    //   95  231:astore          11
    //   96  233:aload           11
    //   97  235:new             #172 <Class StringBuilder>
    //   98  238:dup             
    //   99  239:ldc2            #437 <String "[URI]/">
    //  100  242:invokespecial   #176 <Method void StringBuilder(String)>
    //  101  245:aload           9
    //  102  247:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
    //  103  250:invokevirtual   #185 <Method String StringBuilder.toString()>
    //  104  253:putfield        #440 <Field String SuperSurfaceItem.bitmapPath>
    //  105  256:aload           11
    //  106  258:aload           10
    //  107  260:putfield        #444 <Field Bitmap SuperSurfaceItem.bitmap>
    //  108  263:aload           11
    //  109  265:ldc2            #445 <Float 250F>
    //  110  268:putfield        #254 <Field float SuperSurfaceItem.width>
    //  111  271:aload           11
    //  112  273:ldc2            #445 <Float 250F>
    //  113  276:putfield        #257 <Field float SuperSurfaceItem.height>
    //  114  279:getstatic       #87  <Field SuperSurface superSurface>
    //  115  282:aload           11
    //  116  284:invokevirtual   #448 <Method void SuperSurface.addItem(SuperSurfaceItem)>
    //  117  287:getstatic       #87  <Field SuperSurface superSurface>
    //  118  290:invokevirtual   #103 <Method void SuperSurface.requestUpdate()>
    //  119  293:return          
    //  120  294:iload_2         
    //  121  295:iconst_m1       
    //  122  296:icmpne          52
    // try 299 361 handler(s) 117
    //  123  299:aload_0         
    //  124  300:getfield        #348 <Field File mFileTemp>
    //  125  303:invokevirtual   #353 <Method String File.getPath()>
    //  126  306:invokestatic    #416 <Method Bitmap BitmapFactory.decodeFile(String)>
    //  127  309:astore          6
    //  128  311:getstatic       #194 <Field Context c>
    //  129  314:aload           6
    //  130  316:invokestatic    #420 <Method String Utilities.createURIFromBitmap(Context, Bitmap)>
    //  131  319:astore          7
    //  132  321:getstatic       #87  <Field SuperSurface superSurface>
    //  133  324:aload           6
    //  134  326:new             #172 <Class StringBuilder>
    //  135  329:dup             
    //  136  330:ldc2            #437 <String "[URI]/">
    //  137  333:invokespecial   #176 <Method void StringBuilder(String)>
    //  138  336:aload           7
    //  139  338:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
    //  140  341:invokevirtual   #185 <Method String StringBuilder.toString()>
    //  141  344:invokevirtual   #451 <Method void SuperSurface.setFilter(Bitmap, String)>
    //  142  347:getstatic       #87  <Field SuperSurface superSurface>
    //  143  350:bipush          50
    //  144  352:invokevirtual   #454 <Method void SuperSurface.setFilterOpacity(int)>
    //  145  355:getstatic       #87  <Field SuperSurface superSurface>
    //  146  358:invokevirtual   #103 <Method void SuperSurface.requestUpdate()>
    //  147  361:return          
    }

    public void onConfigurationChanged(Configuration configuration)
    {
    //    0    0:getstatic       #87  <Field SuperSurface superSurface>
    //    1    3:pop             
    //    2    4:aload_0         
    //    3    5:ldc2            #457 <Int 0x7f0600b8>
    //    4    8:invokevirtual   #461 <Method View findViewById(int)>
    //    5   11:checkcast       #154 <Class ViewPager>
    //    6   14:astore_3        
    //    7   15:aload_3         
    //    8   16:putstatic       #152 <Field ViewPager viewPager>
    //    9   19:aload_0         
    //   10   20:invokevirtual   #465 <Method FragmentManager getSupportFragmentManager()>
    //   11   23:putstatic       #145 <Field FragmentManager fragmentManager>
    //   12   26:new             #143 <Class StylingPagerAdapter>
    //   13   29:dup             
    //   14   30:getstatic       #145 <Field FragmentManager fragmentManager>
    //   15   33:invokespecial   #148 <Method void StylingPagerAdapter(FragmentManager)>
    //   16   36:putstatic       #150 <Field StylingPagerAdapter pagerAdapter>
    //   17   39:aload_3         
    //   18   40:getstatic       #150 <Field StylingPagerAdapter pagerAdapter>
    //   19   43:invokevirtual   #158 <Method void ViewPager.setAdapter(android.support.v4.view.PagerAdapter)>
    //   20   46:ldc2            #467 <String "CONFIG">
    //   21   49:ldc2            #469 <String "CHANGED!!!">
    //   22   52:invokestatic    #191 <Method int Log.e(String, String)>
    //   23   55:pop             
    //   24   56:aload_0         
    //   25   57:aload_1         
    //   26   58:invokespecial   #471 <Method void el7rFragmentActivity.onConfigurationChanged(Configuration)>
    //   27   61:return          
    }

    protected void onCreate(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #475 <Method void el7rFragmentActivity.onCreate(Bundle)>
    //    3    5:aload_0         
    //    4    6:ldc2            #476 <Int 0x7f030033>
    //    5    9:invokevirtual   #479 <Method void setContentView(int)>
    //    6   12:aload_0         
    //    7   13:ldc2            #480 <Int 0x7f0600bb>
    //    8   16:invokevirtual   #461 <Method View findViewById(int)>
    //    9   19:checkcast       #321 <Class LinearLayout>
    //   10   22:astore_2        
    //   11   23:aload_2         
    //   12   24:ifnull          32
    //   13   27:aload_0         
    //   14   28:aload_2         
    //   15   29:invokestatic    #486 <Method void AdUtilities.installAd(Activity, View)>
    //   16   32:aload_0         
    //   17   33:getfield        #490 <Field GoogleAnalyticsTracker tracker>
    //   18   36:ldc2            #492 <String "/StylingActivity">
    //   19   39:invokevirtual   #497 <Method void GoogleAnalyticsTracker.trackPageView(String)>
    //   20   42:new             #296 <Class Handler>
    //   21   45:dup             
    //   22   46:invokespecial   #498 <Method void Handler()>
    //   23   49:putstatic       #291 <Field Handler UIHandler>
    //   24   52:aload_0         
    //   25   53:putstatic       #194 <Field Context c>
    //   26   56:aload_0         
    //   27   57:invokevirtual   #502 <Method LayoutInflater getLayoutInflater()>
    //   28   60:putstatic       #504 <Field LayoutInflater layoutInflater>
    //   29   63:aload_0         
    //   30   64:aload_0         
    //   31   65:invokevirtual   #508 <Method ActionBar getSupportActionBar()>
    //   32   68:putfield        #510 <Field ActionBar actionBar>
    //   33   71:aload_0         
    //   34   72:invokevirtual   #465 <Method FragmentManager getSupportFragmentManager()>
    //   35   75:putstatic       #145 <Field FragmentManager fragmentManager>
    //   36   78:aload_0         
    //   37   79:ldc2            #511 <Int 0x7f0600b9>
    //   38   82:invokevirtual   #461 <Method View findViewById(int)>
    //   39   85:checkcast       #321 <Class LinearLayout>
    //   40   88:putstatic       #319 <Field LinearLayout fragmentContainerLL>
    //   41   91:aload_0         
    //   42   92:getfield        #510 <Field ActionBar actionBar>
    //   43   95:iconst_1        
    //   44   96:invokevirtual   #516 <Method void ActionBar.setDisplayHomeAsUpEnabled(boolean)>
    //   45   99:aload_0         
    //   46  100:getfield        #510 <Field ActionBar actionBar>
    //   47  103:ldc2            #517 <Int 0x7f030002>
    //   48  106:invokevirtual   #520 <Method void ActionBar.setCustomView(int)>
    //   49  109:aload_0         
    //   50  110:getfield        #510 <Field ActionBar actionBar>
    //   51  113:iconst_0        
    //   52  114:invokevirtual   #523 <Method void ActionBar.setDisplayShowTitleEnabled(boolean)>
    //   53  117:aload_0         
    //   54  118:getfield        #510 <Field ActionBar actionBar>
    //   55  121:iconst_1        
    //   56  122:invokevirtual   #526 <Method void ActionBar.setDisplayShowCustomEnabled(boolean)>
    //   57  125:aload_0         
    //   58  126:ldc2            #527 <Int 0x7f0600ba>
    //   59  129:invokevirtual   #461 <Method View findViewById(int)>
    //   60  132:checkcast       #276 <Class el7rTextView>
    //   61  135:putstatic       #528 <Field el7rTextView textViewDraw>
    //   62  138:getstatic       #64  <Field SuperSurfaceItem mainTextItem>
    //   63  141:aload_0         
    //   64  142:invokevirtual   #532 <Method void SuperSurfaceItem.setup(StylingActivity)>
    //   65  145:getstatic       #64  <Field SuperSurfaceItem mainTextItem>
    //   66  148:iconst_0        
    //   67  149:putfield        #535 <Field boolean SuperSurfaceItem.deletable>
    //   68  152:getstatic       #74  <Field Editable theText>
    //   69  155:ifnonnull       464
    //   70  158:aload_1         
    //   71  159:ldc2            #536 <String "theText">
    //   72  162:invokevirtual   #542 <Method String Bundle.getString(String)>
    //   73  165:ifnull          188
    //   74  168:getstatic       #64  <Field SuperSurfaceItem mainTextItem>
    //   75  171:new             #544 <Class SpannableString>
    //   76  174:dup             
    //   77  175:aload_1         
    //   78  176:ldc2            #536 <String "theText">
    //   79  179:invokevirtual   #542 <Method String Bundle.getString(String)>
    //   80  182:invokespecial   #547 <Method void SpannableString(CharSequence)>
    //   81  185:putfield        #327 <Field SpannableString SuperSurfaceItem.text>
    //   82  188:aload_0         
    //   83  189:ldc2            #548 <Int 0x7f0600b5>
    //   84  192:invokevirtual   #461 <Method View findViewById(int)>
    //   85  195:checkcast       #89  <Class SuperSurface>
    //   86  198:putstatic       #87  <Field SuperSurface superSurface>
    //   87  201:getstatic       #87  <Field SuperSurface superSurface>
    //   88  204:ldc2            #550 <String "full">
    //   89  207:invokevirtual   #553 <Method void SuperSurface.reset(String)>
    //   90  210:aload_0         
    //   91  211:iconst_0        
    //   92  212:putfield        #555 <Field boolean superSurfaceSetupDone>
    //   93  215:getstatic       #87  <Field SuperSurface superSurface>
    //   94  218:invokevirtual   #559 <Method ViewTreeObserver SuperSurface.getViewTreeObserver()>
    //   95  221:new             #561 <Class StylingActivity$1>
    //   96  224:dup             
    //   97  225:aload_0         
    //   98  226:aload_1         
    //   99  227:invokespecial   #564 <Method void StylingActivity$1(StylingActivity, Bundle)>
    //  100  230:invokevirtual   #570 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
    //  101  233:aload_0         
    //  102  234:ldc2            #457 <Int 0x7f0600b8>
    //  103  237:invokevirtual   #461 <Method View findViewById(int)>
    //  104  240:checkcast       #154 <Class ViewPager>
    //  105  243:astore          4
    //  106  245:aload           4
    //  107  247:putstatic       #152 <Field ViewPager viewPager>
    //  108  250:aload_0         
    //  109  251:invokevirtual   #465 <Method FragmentManager getSupportFragmentManager()>
    //  110  254:putstatic       #145 <Field FragmentManager fragmentManager>
    //  111  257:new             #143 <Class StylingPagerAdapter>
    //  112  260:dup             
    //  113  261:getstatic       #145 <Field FragmentManager fragmentManager>
    //  114  264:invokespecial   #148 <Method void StylingPagerAdapter(FragmentManager)>
    //  115  267:putstatic       #150 <Field StylingPagerAdapter pagerAdapter>
    //  116  270:aload           4
    //  117  272:getstatic       #150 <Field StylingPagerAdapter pagerAdapter>
    //  118  275:invokevirtual   #158 <Method void ViewPager.setAdapter(android.support.v4.view.PagerAdapter)>
    //  119  278:bipush          9
    //  120  280:anewarray       String[]
    //  121  283:astore          5
    //  122  285:aload           5
    //  123  287:iconst_0        
    //  124  288:aload_0         
    //  125  289:ldc2            #571 <Int 0x7f0b0017>
    //  126  292:invokevirtual   #574 <Method String getString(int)>
    //  127  295:aastore         
    //  128  296:aload           5
    //  129  298:iconst_1        
    //  130  299:aload_0         
    //  131  300:ldc2            #575 <Int 0x7f0b0018>
    //  132  303:invokevirtual   #574 <Method String getString(int)>
    //  133  306:aastore         
    //  134  307:aload           5
    //  135  309:iconst_2        
    //  136  310:aload_0         
    //  137  311:ldc2            #576 <Int 0x7f0b0019>
    //  138  314:invokevirtual   #574 <Method String getString(int)>
    //  139  317:aastore         
    //  140  318:aload           5
    //  141  320:iconst_3        
    //  142  321:aload_0         
    //  143  322:ldc2            #577 <Int 0x7f0b001b>
    //  144  325:invokevirtual   #574 <Method String getString(int)>
    //  145  328:aastore         
    //  146  329:aload           5
    //  147  331:iconst_4        
    //  148  332:aload_0         
    //  149  333:ldc2            #578 <Int 0x7f0b001c>
    //  150  336:invokevirtual   #574 <Method String getString(int)>
    //  151  339:aastore         
    //  152  340:aload           5
    //  153  342:iconst_5        
    //  154  343:aload_0         
    //  155  344:ldc2            #579 <Int 0x7f0b0068>
    //  156  347:invokevirtual   #574 <Method String getString(int)>
    //  157  350:aastore         
    //  158  351:aload           5
    //  159  353:bipush          6
    //  160  355:aload_0         
    //  161  356:ldc2            #580 <Int 0x7f0b001a>
    //  162  359:invokevirtual   #574 <Method String getString(int)>
    //  163  362:aastore         
    //  164  363:aload           5
    //  165  365:bipush          7
    //  166  367:aload_0         
    //  167  368:ldc2            #581 <Int 0x7f0b001d>
    //  168  371:invokevirtual   #574 <Method String getString(int)>
    //  169  374:aastore         
    //  170  375:aload           5
    //  171  377:bipush          8
    //  172  379:aload_0         
    //  173  380:ldc2            #582 <Int 0x7f0b001e>
    //  174  383:invokevirtual   #574 <Method String getString(int)>
    //  175  386:aastore         
    //  176  387:aload           5
    //  177  389:putstatic       #586 <Field String[] StylingPagerAdapter.titles_strings>
    //  178  392:aload_0         
    //  179  393:ldc2            #587 <Int 0x7f0600b7>
    //  180  396:invokevirtual   #461 <Method View findViewById(int)>
    //  181  399:checkcast       #162 <Class el7rTabPageIndicator>
    //  182  402:putstatic       #160 <Field el7rTabPageIndicator titleIndicator>
    //  183  405:getstatic       #160 <Field el7rTabPageIndicator titleIndicator>
    //  184  408:ifnull          433
    //  185  411:getstatic       #160 <Field el7rTabPageIndicator titleIndicator>
    //  186  414:aload           4
    //  187  416:invokevirtual   #166 <Method void el7rTabPageIndicator.setViewPager(ViewPager)>
    //  188  419:getstatic       #160 <Field el7rTabPageIndicator titleIndicator>
    //  189  422:new             #589 <Class StylingActivity$2>
    //  190  425:dup             
    //  191  426:aload_0         
    //  192  427:invokespecial   #591 <Method void StylingActivity$2(StylingActivity)>
    //  193  430:invokevirtual   #595 <Method void el7rTabPageIndicator.setOnPageChangeListener(android.support.v4.view.ViewPager$OnPageChangeListener)>
    //  194  433:ldc2            #597 <String "mounted">
    //  195  436:invokestatic    #602 <Method String Environment.getExternalStorageState()>
    //  196  439:invokevirtual   #606 <Method boolean String.equals(Object)>
    //  197  442:ifeq            503
    //  198  445:aload_0         
    //  199  446:new             #350 <Class File>
    //  200  449:dup             
    //  201  450:aload_0         
    //  202  451:invokevirtual   #610 <Method File getCacheDir()>
    //  203  454:ldc2            #612 <String "temp_photo.jpg">
    //  204  457:invokespecial   #615 <Method void File(File, String)>
    //  205  460:putfield        #348 <Field File mFileTemp>
    //  206  463:return          
    //  207  464:new             #544 <Class SpannableString>
    //  208  467:dup             
    //  209  468:getstatic       #74  <Field Editable theText>
    //  210  471:invokespecial   #547 <Method void SpannableString(CharSequence)>
    //  211  474:astore_3        
    //  212  475:aload_3         
    //  213  476:new             #617 <Class StylingActivity$NoUnderlineSpan>
    //  214  479:dup             
    //  215  480:aload_0         
    //  216  481:invokespecial   #618 <Method void StylingActivity$NoUnderlineSpan(StylingActivity)>
    //  217  484:iconst_0        
    //  218  485:aload_3         
    //  219  486:invokevirtual   #622 <Method int SpannableString.length()>
    //  220  489:iconst_0        
    //  221  490:invokevirtual   #626 <Method void SpannableString.setSpan(Object, int, int, int)>
    //  222  493:getstatic       #64  <Field SuperSurfaceItem mainTextItem>
    //  223  496:aload_3         
    //  224  497:invokevirtual   #331 <Method void SuperSurfaceItem.setText(SpannableString)>
    //  225  500:goto            188
    //  226  503:aload_0         
    //  227  504:new             #350 <Class File>
    //  228  507:dup             
    //  229  508:aload_0         
    //  230  509:invokevirtual   #629 <Method File getFilesDir()>
    //  231  512:ldc2            #612 <String "temp_photo.jpg">
    //  232  515:invokespecial   #615 <Method void File(File, String)>
    //  233  518:putfield        #348 <Field File mFileTemp>
    //  234  521:return          
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #633 <Method boolean el7rFragmentActivity.onCreateOptionsMenu(Menu)>
    //    3    5:pop             
    //    4    6:aload_0         
    //    5    7:aload_1         
    //    6    8:putfield        #637 <Field Menu theMenu>
    //    7   11:aload_1         
    //    8   12:ldc2            #638 <Int 0x7f0600e0>
    //    9   15:invokeinterface #644 <Method MenuItem Menu.findItem(int)>
    //   10   20:astore_3        
    //   11   21:aload_3         
    //   12   22:invokestatic    #650 <Method View MenuItemCompat.getActionView(MenuItem)>
    //   13   25:ldc2            #651 <Int 0x7f06001c>
    //   14   28:invokevirtual   #654 <Method View View.findViewById(int)>
    //   15   31:checkcast       #656 <Class Button>
    //   16   34:new             #658 <Class StylingActivity$7>
    //   17   37:dup             
    //   18   38:aload_0         
    //   19   39:invokespecial   #659 <Method void StylingActivity$7(StylingActivity)>
    //   20   42:invokevirtual   #663 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //   21   45:aload_3         
    //   22   46:iconst_1        
    //   23   47:invokeinterface #669 <Method MenuItem MenuItem.setVisible(boolean)>
    //   24   52:pop             
    //   25   53:iconst_1        
    //   26   54:ireturn         
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
    //    0    0:iload_1         
    //    1    1:iconst_4        
    //    2    2:icmpne          20
    //    3    5:getstatic       #319 <Field LinearLayout fragmentContainerLL>
    //    4    8:invokevirtual   #674 <Method int LinearLayout.getVisibility()>
    //    5   11:ifne            20
    //    6   14:iconst_0        
    //    7   15:invokestatic    #676 <Method void toggleSubFragment(boolean)>
    //    8   18:iconst_0        
    //    9   19:ireturn         
    //   10   20:aload_0         
    //   11   21:iload_1         
    //   12   22:aload_2         
    //   13   23:invokespecial   #678 <Method boolean el7rFragmentActivity.onKeyDown(int, KeyEvent)>
    //   14   26:ireturn         
    }

    protected void onPause()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #681 <Method void el7rFragmentActivity.onPause()>
    //    2    4:getstatic       #87  <Field SuperSurface superSurface>
    //    3    7:invokevirtual   #684 <Method void SuperSurface.pause()>
    //    4   10:return          
    }

    public void onRestoreInstanceState(Bundle bundle)
    {
    //    0    0:ldc2            #687 <String "I'm at">
    //    1    3:ldc2            #688 <String "onRestoreInstanceState">
    //    2    6:invokestatic    #191 <Method int Log.e(String, String)>
    //    3    9:pop             
    //    4   10:aload_0         
    //    5   11:aload_1         
    //    6   12:invokespecial   #690 <Method void el7rFragmentActivity.onRestoreInstanceState(Bundle)>
    //    7   15:getstatic       #87  <Field SuperSurface superSurface>
    //    8   18:getfield        #693 <Field ArrayList SuperSurface.itemsList>
    //    9   21:invokevirtual   #698 <Method void ArrayList.clear()>
    //   10   24:aload_1         
    //   11   25:ldc2            #699 <String "templatesList">
    //   12   28:invokevirtual   #703 <Method ArrayList Bundle.getStringArrayList(String)>
    //   13   31:putstatic       #705 <Field ArrayList templatesList>
    //   14   34:aload_1         
    //   15   35:ldc2            #706 <String "backgroundsList">
    //   16   38:invokevirtual   #703 <Method ArrayList Bundle.getStringArrayList(String)>
    //   17   41:putstatic       #708 <Field ArrayList backgroundsList>
    //   18   44:aload_1         
    //   19   45:ldc2            #709 <String "stickersList">
    //   20   48:invokevirtual   #703 <Method ArrayList Bundle.getStringArrayList(String)>
    //   21   51:putstatic       #711 <Field ArrayList stickersList>
    //   22   54:aload_1         
    //   23   55:ldc2            #712 <String "framesList">
    //   24   58:invokevirtual   #703 <Method ArrayList Bundle.getStringArrayList(String)>
    //   25   61:putstatic       #714 <Field ArrayList framesList>
    //   26   64:aload_1         
    //   27   65:ldc2            #715 <String "filtersList">
    //   28   68:invokevirtual   #703 <Method ArrayList Bundle.getStringArrayList(String)>
    //   29   71:putstatic       #717 <Field ArrayList filtersList>
    //   30   74:aload_1         
    //   31   75:ldc2            #699 <String "templatesList">
    //   32   78:invokevirtual   #703 <Method ArrayList Bundle.getStringArrayList(String)>
    //   33   81:putstatic       #705 <Field ArrayList templatesList>
    //   34   84:aload_1         
    //   35   85:ldc2            #718 <String "fontsList">
    //   36   88:invokevirtual   #703 <Method ArrayList Bundle.getStringArrayList(String)>
    //   37   91:putstatic       #720 <Field ArrayList fontsList>
    //   38   94:aload_1         
    //   39   95:ldc2            #721 <String "colorsList">
    //   40   98:invokevirtual   #703 <Method ArrayList Bundle.getStringArrayList(String)>
    //   41  101:putstatic       #723 <Field ArrayList colorsList>
    //   42  104:aload_1         
    //   43  105:ldc2            #724 <String "shadowColorsList">
    //   44  108:invokevirtual   #703 <Method ArrayList Bundle.getStringArrayList(String)>
    //   45  111:putstatic       #726 <Field ArrayList shadowColorsList>
    //   46  114:aload_0         
    //   47  115:iconst_0        
    //   48  116:putfield        #83  <Field boolean treeObserverActionDone>
    //   49  119:getstatic       #87  <Field SuperSurface superSurface>
    //   50  122:invokevirtual   #559 <Method ViewTreeObserver SuperSurface.getViewTreeObserver()>
    //   51  125:new             #728 <Class StylingActivity$4>
    //   52  128:dup             
    //   53  129:aload_0         
    //   54  130:aload_1         
    //   55  131:invokespecial   #729 <Method void StylingActivity$4(StylingActivity, Bundle)>
    //   56  134:invokevirtual   #570 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
    //   57  137:return          
    }

    protected void onResume()
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:invokevirtual   #734 <Method Resources getResources()>
    //    3    5:invokevirtual   #740 <Method Configuration Resources.getConfiguration()>
    //    4    8:getfield        #745 <Field int Configuration.orientation>
    //    5   11:invokevirtual   #748 <Method void setRequestedOrientation(int)>
    //    6   14:aload_0         
    //    7   15:invokespecial   #750 <Method void el7rFragmentActivity.onResume()>
    //    8   18:getstatic       #291 <Field Handler UIHandler>
    //    9   21:new             #752 <Class StylingActivity$3>
    //   10   24:dup             
    //   11   25:aload_0         
    //   12   26:invokespecial   #753 <Method void StylingActivity$3(StylingActivity)>
    //   13   29:ldc2w           #754 <Long 2000L>
    //   14   32:invokevirtual   #431 <Method boolean Handler.postDelayed(Runnable, long)>
    //   15   35:pop             
    //   16   36:getstatic       #87  <Field SuperSurface superSurface>
    //   17   39:invokevirtual   #758 <Method void SuperSurface.resume()>
    //   18   42:return          
    }

    public void onSaveInstanceState(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #761 <Method void el7rFragmentActivity.onSaveInstanceState(Bundle)>
    //    3    5:aload_1         
    //    4    6:ldc2            #699 <String "templatesList">
    //    5    9:getstatic       #705 <Field ArrayList templatesList>
    //    6   12:invokevirtual   #765 <Method void Bundle.putStringArrayList(String, ArrayList)>
    //    7   15:aload_1         
    //    8   16:ldc2            #706 <String "backgroundsList">
    //    9   19:getstatic       #708 <Field ArrayList backgroundsList>
    //   10   22:invokevirtual   #765 <Method void Bundle.putStringArrayList(String, ArrayList)>
    //   11   25:aload_1         
    //   12   26:ldc2            #709 <String "stickersList">
    //   13   29:getstatic       #711 <Field ArrayList stickersList>
    //   14   32:invokevirtual   #765 <Method void Bundle.putStringArrayList(String, ArrayList)>
    //   15   35:aload_1         
    //   16   36:ldc2            #712 <String "framesList">
    //   17   39:getstatic       #714 <Field ArrayList framesList>
    //   18   42:invokevirtual   #765 <Method void Bundle.putStringArrayList(String, ArrayList)>
    //   19   45:aload_1         
    //   20   46:ldc2            #715 <String "filtersList">
    //   21   49:getstatic       #717 <Field ArrayList filtersList>
    //   22   52:invokevirtual   #765 <Method void Bundle.putStringArrayList(String, ArrayList)>
    //   23   55:aload_1         
    //   24   56:ldc2            #718 <String "fontsList">
    //   25   59:getstatic       #720 <Field ArrayList fontsList>
    //   26   62:invokevirtual   #765 <Method void Bundle.putStringArrayList(String, ArrayList)>
    //   27   65:aload_1         
    //   28   66:ldc2            #721 <String "colorsList">
    //   29   69:getstatic       #723 <Field ArrayList colorsList>
    //   30   72:invokevirtual   #765 <Method void Bundle.putStringArrayList(String, ArrayList)>
    //   31   75:aload_1         
    //   32   76:ldc2            #724 <String "shadowColorsList">
    //   33   79:getstatic       #726 <Field ArrayList shadowColorsList>
    //   34   82:invokevirtual   #765 <Method void Bundle.putStringArrayList(String, ArrayList)>
    //   35   85:aload_1         
    //   36   86:ldc2            #767 <String "backgroundPath">
    //   37   89:getstatic       #87  <Field SuperSurface superSurface>
    //   38   92:invokevirtual   #770 <Method String SuperSurface.getCanvasBackgroundPath()>
    //   39   95:invokevirtual   #774 <Method void Bundle.putString(String, String)>
    //   40   98:aload_1         
    //   41   99:ldc2            #776 <String "framePath">
    //   42  102:getstatic       #87  <Field SuperSurface superSurface>
    //   43  105:invokevirtual   #779 <Method String SuperSurface.getCanvasFramePath()>
    //   44  108:invokevirtual   #774 <Method void Bundle.putString(String, String)>
    //   45  111:aload_1         
    //   46  112:ldc2            #781 <String "filterPath">
    //   47  115:getstatic       #87  <Field SuperSurface superSurface>
    //   48  118:invokevirtual   #784 <Method String SuperSurface.getCanvasFilterPath()>
    //   49  121:invokevirtual   #774 <Method void Bundle.putString(String, String)>
    //   50  124:new             #695 <Class ArrayList>
    //   51  127:dup             
    //   52  128:invokespecial   #785 <Method void ArrayList()>
    //   53  131:astore_2        
    //   54  132:new             #695 <Class ArrayList>
    //   55  135:dup             
    //   56  136:invokespecial   #785 <Method void ArrayList()>
    //   57  139:astore_3        
    //   58  140:new             #695 <Class ArrayList>
    //   59  143:dup             
    //   60  144:invokespecial   #785 <Method void ArrayList()>
    //   61  147:astore          4
    //   62  149:new             #695 <Class ArrayList>
    //   63  152:dup             
    //   64  153:invokespecial   #785 <Method void ArrayList()>
    //   65  156:astore          5
    //   66  158:new             #695 <Class ArrayList>
    //   67  161:dup             
    //   68  162:invokespecial   #785 <Method void ArrayList()>
    //   69  165:astore          6
    //   70  167:new             #695 <Class ArrayList>
    //   71  170:dup             
    //   72  171:invokespecial   #785 <Method void ArrayList()>
    //   73  174:astore          7
    //   74  176:new             #695 <Class ArrayList>
    //   75  179:dup             
    //   76  180:invokespecial   #785 <Method void ArrayList()>
    //   77  183:astore          8
    //   78  185:new             #695 <Class ArrayList>
    //   79  188:dup             
    //   80  189:invokespecial   #785 <Method void ArrayList()>
    //   81  192:astore          9
    //   82  194:new             #695 <Class ArrayList>
    //   83  197:dup             
    //   84  198:invokespecial   #785 <Method void ArrayList()>
    //   85  201:astore          10
    //   86  203:new             #695 <Class ArrayList>
    //   87  206:dup             
    //   88  207:invokespecial   #785 <Method void ArrayList()>
    //   89  210:astore          11
    //   90  212:new             #695 <Class ArrayList>
    //   91  215:dup             
    //   92  216:invokespecial   #785 <Method void ArrayList()>
    //   93  219:astore          12
    //   94  221:new             #695 <Class ArrayList>
    //   95  224:dup             
    //   96  225:invokespecial   #785 <Method void ArrayList()>
    //   97  228:astore          13
    //   98  230:new             #695 <Class ArrayList>
    //   99  233:dup             
    //  100  234:invokespecial   #785 <Method void ArrayList()>
    //  101  237:astore          14
    //  102  239:new             #695 <Class ArrayList>
    //  103  242:dup             
    //  104  243:invokespecial   #785 <Method void ArrayList()>
    //  105  246:astore          15
    //  106  248:new             #695 <Class ArrayList>
    //  107  251:dup             
    //  108  252:invokespecial   #785 <Method void ArrayList()>
    //  109  255:astore          16
    //  110  257:new             #695 <Class ArrayList>
    //  111  260:dup             
    //  112  261:invokespecial   #785 <Method void ArrayList()>
    //  113  264:astore          17
    //  114  266:getstatic       #87  <Field SuperSurface superSurface>
    //  115  269:invokevirtual   #789 <Method ArrayList SuperSurface.getItemsList()>
    //  116  272:invokevirtual   #793 <Method Iterator ArrayList.iterator()>
    //  117  275:astore          18
    //  118  277:aload           18
    //  119  279:invokeinterface #799 <Method boolean Iterator.hasNext()>
    //  120  284:ifne            471
    //  121  287:aload_1         
    //  122  288:ldc2            #801 <String "itemsBitmapsPaths">
    //  123  291:aload_2         
    //  124  292:invokevirtual   #765 <Method void Bundle.putStringArrayList(String, ArrayList)>
    //  125  295:aload_3         
    //  126  296:invokevirtual   #804 <Method int ArrayList.size()>
    //  127  299:newarray        float[]
    //  128  301:astore          42
    //  129  303:iconst_0        
    //  130  304:istore          43
    //  131  306:iload           43
    //  132  308:aload_3         
    //  133  309:invokevirtual   #804 <Method int ArrayList.size()>
    //  134  312:icmplt          810
    //  135  315:aload_1         
    //  136  316:ldc2            #806 <String "itemsPosXs">
    //  137  319:aload           42
    //  138  321:invokevirtual   #810 <Method void Bundle.putFloatArray(String, float[])>
    //  139  324:aload_3         
    //  140  325:invokevirtual   #804 <Method int ArrayList.size()>
    //  141  328:newarray        float[]
    //  142  330:astore          44
    //  143  332:iconst_0        
    //  144  333:istore          45
    //  145  335:iload           45
    //  146  337:aload_3         
    //  147  338:invokevirtual   #804 <Method int ArrayList.size()>
    //  148  341:icmplt          833
    //  149  344:aload_1         
    //  150  345:ldc2            #812 <String "itemsPosYs">
    //  151  348:aload           44
    //  152  350:invokevirtual   #810 <Method void Bundle.putFloatArray(String, float[])>
    //  153  353:aload_1         
    //  154  354:ldc2            #814 <String "itemsWidths">
    //  155  357:aload           5
    //  156  359:invokevirtual   #817 <Method void Bundle.putIntegerArrayList(String, ArrayList)>
    //  157  362:aload_1         
    //  158  363:ldc2            #819 <String "itemsHeights">
    //  159  366:aload           6
    //  160  368:invokevirtual   #817 <Method void Bundle.putIntegerArrayList(String, ArrayList)>
    //  161  371:aload_1         
    //  162  372:ldc2            #821 <String "itemRotations">
    //  163  375:aload           7
    //  164  377:invokevirtual   #817 <Method void Bundle.putIntegerArrayList(String, ArrayList)>
    //  165  380:aload_1         
    //  166  381:ldc2            #823 <String "textReflections">
    //  167  384:aload           8
    //  168  386:invokevirtual   #817 <Method void Bundle.putIntegerArrayList(String, ArrayList)>
    //  169  389:aload_1         
    //  170  390:ldc2            #825 <String "textColors">
    //  171  393:aload           9
    //  172  395:invokevirtual   #765 <Method void Bundle.putStringArrayList(String, ArrayList)>
    //  173  398:aload_1         
    //  174  399:ldc2            #827 <String "textShadowColors">
    //  175  402:aload           10
    //  176  404:invokevirtual   #817 <Method void Bundle.putIntegerArrayList(String, ArrayList)>
    //  177  407:aload_1         
    //  178  408:ldc2            #829 <String "textSizes">
    //  179  411:aload           11
    //  180  413:invokevirtual   #817 <Method void Bundle.putIntegerArrayList(String, ArrayList)>
    //  181  416:aload_1         
    //  182  417:ldc2            #831 <String "textGravities">
    //  183  420:aload           12
    //  184  422:invokevirtual   #817 <Method void Bundle.putIntegerArrayList(String, ArrayList)>
    //  185  425:aload_1         
    //  186  426:ldc2            #833 <String "textLineSpacings">
    //  187  429:aload           13
    //  188  431:invokevirtual   #817 <Method void Bundle.putIntegerArrayList(String, ArrayList)>
    //  189  434:aload_1         
    //  190  435:ldc2            #835 <String "typeFacePaths">
    //  191  438:aload           14
    //  192  440:invokevirtual   #765 <Method void Bundle.putStringArrayList(String, ArrayList)>
    //  193  443:aload_1         
    //  194  444:ldc2            #837 <String "texts">
    //  195  447:aload           15
    //  196  449:invokevirtual   #765 <Method void Bundle.putStringArrayList(String, ArrayList)>
    //  197  452:aload_1         
    //  198  453:ldc2            #839 <String "itemDeletable">
    //  199  456:aload           16
    //  200  458:invokevirtual   #765 <Method void Bundle.putStringArrayList(String, ArrayList)>
    //  201  461:aload_1         
    //  202  462:ldc2            #841 <String "itemTypes">
    //  203  465:aload           17
    //  204  467:invokevirtual   #765 <Method void Bundle.putStringArrayList(String, ArrayList)>
    //  205  470:return          
    //  206  471:aload           18
    //  207  473:invokeinterface #845 <Method Object Iterator.next()>
    //  208  478:checkcast       #59  <Class SuperSurfaceItem>
    //  209  481:astore          19
    //  210  483:aload           19
    //  211  485:getfield        #848 <Field String SuperSurfaceItem.type>
    //  212  488:ldc2            #850 <String "nosave">
    //  213  491:if_acmpeq       277
    //  214  494:aload_2         
    //  215  495:aload           19
    //  216  497:getfield        #440 <Field String SuperSurfaceItem.bitmapPath>
    //  217  500:invokevirtual   #853 <Method boolean ArrayList.add(Object)>
    //  218  503:pop             
    //  219  504:aload_3         
    //  220  505:getstatic       #87  <Field SuperSurface superSurface>
    //  221  508:aload           19
    //  222  510:getfield        #856 <Field float SuperSurfaceItem.tempPosX>
    //  223  513:invokevirtual   #860 <Method float SuperSurface.resetFixedSize(float)>
    //  224  516:invokestatic    #865 <Method Float Float.valueOf(float)>
    //  225  519:invokevirtual   #853 <Method boolean ArrayList.add(Object)>
    //  226  522:pop             
    //  227  523:aload           4
    //  228  525:getstatic       #87  <Field SuperSurface superSurface>
    //  229  528:aload           19
    //  230  530:getfield        #868 <Field float SuperSurfaceItem.tempPosY>
    //  231  533:invokevirtual   #860 <Method float SuperSurface.resetFixedSize(float)>
    //  232  536:invokestatic    #865 <Method Float Float.valueOf(float)>
    //  233  539:invokevirtual   #853 <Method boolean ArrayList.add(Object)>
    //  234  542:pop             
    //  235  543:aload           5
    //  236  545:getstatic       #87  <Field SuperSurface superSurface>
    //  237  548:aload           19
    //  238  550:getfield        #871 <Field float SuperSurfaceItem.tempWidth>
    //  239  553:f2i             
    //  240  554:invokevirtual   #874 <Method int SuperSurface.resetFixedSize(int)>
    //  241  557:invokestatic    #879 <Method Integer Integer.valueOf(int)>
    //  242  560:invokevirtual   #853 <Method boolean ArrayList.add(Object)>
    //  243  563:pop             
    //  244  564:aload           6
    //  245  566:getstatic       #87  <Field SuperSurface superSurface>
    //  246  569:aload           19
    //  247  571:getfield        #882 <Field float SuperSurfaceItem.tempHeight>
    //  248  574:f2i             
    //  249  575:invokevirtual   #874 <Method int SuperSurface.resetFixedSize(int)>
    //  250  578:invokestatic    #879 <Method Integer Integer.valueOf(int)>
    //  251  581:invokevirtual   #853 <Method boolean ArrayList.add(Object)>
    //  252  584:pop             
    //  253  585:aload           7
    //  254  587:aload           19
    //  255  589:getfield        #259 <Field int SuperSurfaceItem.rotation>
    //  256  592:invokestatic    #879 <Method Integer Integer.valueOf(int)>
    //  257  595:invokevirtual   #853 <Method boolean ArrayList.add(Object)>
    //  258  598:pop             
    //  259  599:aload           8
    //  260  601:aload           19
    //  261  603:getfield        #289 <Field int SuperSurfaceItem.reflection>
    //  262  606:invokestatic    #879 <Method Integer Integer.valueOf(int)>
    //  263  609:invokevirtual   #853 <Method boolean ArrayList.add(Object)>
    //  264  612:pop             
    //  265  613:aload           19
    //  266  615:getfield        #535 <Field boolean SuperSurfaceItem.deletable>
    //  267  618:ifeq            702
    //  268  621:aload           16
    //  269  623:ldc2            #884 <String "true">
    //  270  626:invokevirtual   #853 <Method boolean ArrayList.add(Object)>
    //  271  629:pop             
    //  272  630:aload           17
    //  273  632:aload           19
    //  274  634:getfield        #848 <Field String SuperSurfaceItem.type>
    //  275  637:invokevirtual   #853 <Method boolean ArrayList.add(Object)>
    //  276  640:pop             
    //  277  641:aload           19
    //  278  643:getfield        #848 <Field String SuperSurfaceItem.type>
    //  279  646:ldc2            #885 <String "bitmap">
    //  280  649:if_acmpne       714
    //  281  652:aload           9
    //  282  654:ldc2            #887 <String "#000000">
    //  283  657:invokevirtual   #853 <Method boolean ArrayList.add(Object)>
    //  284  660:pop             
    //  285  661:aload           10
    //  286  663:ldc2            #888 <Int 0xff000000>
    //  287  666:invokestatic    #879 <Method Integer Integer.valueOf(int)>
    //  288  669:invokevirtual   #853 <Method boolean ArrayList.add(Object)>
    //  289  672:pop             
    //  290  673:aload           11
    //  291  675:bipush          15
    //  292  677:invokestatic    #879 <Method Integer Integer.valueOf(int)>
    //  293  680:invokevirtual   #853 <Method boolean ArrayList.add(Object)>
    //  294  683:pop             
    //  295  684:aload           14
    //  296  686:ldc1            #79  <String "">
    //  297  688:invokevirtual   #853 <Method boolean ArrayList.add(Object)>
    //  298  691:pop             
    //  299  692:aload           15
    //  300  694:aconst_null     
    //  301  695:invokevirtual   #853 <Method boolean ArrayList.add(Object)>
    //  302  698:pop             
    //  303  699:goto            277
    //  304  702:aload           16
    //  305  704:ldc2            #890 <String "false">
    //  306  707:invokevirtual   #853 <Method boolean ArrayList.add(Object)>
    //  307  710:pop             
    //  308  711:goto            630
    //  309  714:aload           9
    //  310  716:aload           19
    //  311  718:getfield        #107 <Field String SuperSurfaceItem.textColor>
    //  312  721:invokevirtual   #853 <Method boolean ArrayList.add(Object)>
    //  313  724:pop             
    //  314  725:aload           10
    //  315  727:aload           19
    //  316  729:getfield        #121 <Field int SuperSurfaceItem.textShadowColor>
    //  317  732:invokestatic    #879 <Method Integer Integer.valueOf(int)>
    //  318  735:invokevirtual   #853 <Method boolean ArrayList.add(Object)>
    //  319  738:pop             
    //  320  739:aload           11
    //  321  741:aload           19
    //  322  743:getfield        #272 <Field float SuperSurfaceItem.textSize>
    //  323  746:f2i             
    //  324  747:invokestatic    #879 <Method Integer Integer.valueOf(int)>
    //  325  750:invokevirtual   #853 <Method boolean ArrayList.add(Object)>
    //  326  753:pop             
    //  327  754:aload           12
    //  328  756:aload           19
    //  329  758:getfield        #893 <Field int SuperSurfaceItem.textGravity>
    //  330  761:invokestatic    #879 <Method Integer Integer.valueOf(int)>
    //  331  764:invokevirtual   #853 <Method boolean ArrayList.add(Object)>
    //  332  767:pop             
    //  333  768:aload           13
    //  334  770:aload           19
    //  335  772:getfield        #896 <Field int SuperSurfaceItem.lineSpacing>
    //  336  775:invokestatic    #879 <Method Integer Integer.valueOf(int)>
    //  337  778:invokevirtual   #853 <Method boolean ArrayList.add(Object)>
    //  338  781:pop             
    //  339  782:aload           14
    //  340  784:aload           19
    //  341  786:getfield        #305 <Field String SuperSurfaceItem.typeFacePath>
    //  342  789:invokevirtual   #853 <Method boolean ArrayList.add(Object)>
    //  343  792:pop             
    //  344  793:aload           15
    //  345  795:aload           19
    //  346  797:getfield        #327 <Field SpannableString SuperSurfaceItem.text>
    //  347  800:invokevirtual   #897 <Method String SpannableString.toString()>
    //  348  803:invokevirtual   #853 <Method boolean ArrayList.add(Object)>
    //  349  806:pop             
    //  350  807:goto            277
    //  351  810:aload           42
    //  352  812:iload           43
    //  353  814:aload_3         
    //  354  815:iload           43
    //  355  817:invokevirtual   #901 <Method Object ArrayList.get(int)>
    //  356  820:checkcast       #862 <Class Float>
    //  357  823:invokevirtual   #905 <Method float Float.floatValue()>
    //  358  826:fastore         
    //  359  827:iinc            43  1
    //  360  830:goto            306
    //  361  833:aload           44
    //  362  835:iload           45
    //  363  837:aload           4
    //  364  839:iload           45
    //  365  841:invokevirtual   #901 <Method Object ArrayList.get(int)>
    //  366  844:checkcast       #862 <Class Float>
    //  367  847:invokevirtual   #905 <Method float Float.floatValue()>
    //  368  850:fastore         
    //  369  851:iinc            45  1
    //  370  854:goto            335
    }

    public static String TAG;
    public static Handler UIHandler;
    public static ArrayList backgroundsList;
    public static Context c;
    public static ArrayList colorsList;
    public static ArrayList filtersList;
    public static ArrayList fontsList;
    public static LinearLayout fragmentContainerLL;
    public static FragmentManager fragmentManager;
    public static ArrayList framesList;
    public static int lastChosenBGColor;
    public static LayoutInflater layoutInflater;
    public static SuperSurfaceItem mainTextItem;
    static StylingPagerAdapter pagerAdapter;
    static boolean pauseSetBG;
    public static ArrayList shadowColorsList;
    public static ArrayList stickersList;
    public static SuperSurface superSurface;
    public static ArrayList templatesList;
    public static el7rTextView textViewDraw;
    public static Editable theText;
    static el7rTabPageIndicator titleIndicator;
    static String typeFacePath;
    public static ViewPager viewPager;
    ActionBar actionBar;
    String lastOrientation;
    private File mFileTemp;
    boolean superSurfaceSetupDone;
    boolean treeObserverActionDone;

    // Unreferenced inner class codeadore/textgram/StylingActivity$1

/* anonymous class */
    class _cls1
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field StylingActivity this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field Bundle val$savedInstanceState>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public void onGlobalLayout()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field StylingActivity this$0>
        //    2    4:getfield        #29  <Field boolean StylingActivity.superSurfaceSetupDone>
        //    3    7:ifne            60
        //    4   10:getstatic       #33  <Field SuperSurfaceItem StylingActivity.mainTextItem>
        //    5   13:ldc1            #35  <String "text">
        //    6   15:putfield        #41  <Field String SuperSurfaceItem.type>
        //    7   18:aload_0         
        //    8   19:getfield        #21  <Field Bundle val$savedInstanceState>
        //    9   22:ifnonnull       61
        //   10   25:getstatic       #45  <Field SuperSurface StylingActivity.superSurface>
        //   11   28:getstatic       #33  <Field SuperSurfaceItem StylingActivity.mainTextItem>
        //   12   31:invokevirtual   #51  <Method void SuperSurface.addItem(SuperSurfaceItem)>
        //   13   34:aload_0         
        //   14   35:getfield        #19  <Field StylingActivity this$0>
        //   15   38:iconst_1        
        //   16   39:putfield        #29  <Field boolean StylingActivity.superSurfaceSetupDone>
        //   17   42:getstatic       #55  <Field Handler StylingActivity.UIHandler>
        //   18   45:new             #57  <Class StylingActivity$1$1>
        //   19   48:dup             
        //   20   49:aload_0         
        //   21   50:invokespecial   #60  <Method void StylingActivity$1$1(StylingActivity$1)>
        //   22   53:ldc2w           #61  <Long 100L>
        //   23   56:invokevirtual   #68  <Method boolean Handler.postDelayed(Runnable, long)>
        //   24   59:pop             
        //   25   60:return          
        //   26   61:aload_0         
        //   27   62:getfield        #19  <Field StylingActivity this$0>
        //   28   65:iconst_1        
        //   29   66:putfield        #29  <Field boolean StylingActivity.superSurfaceSetupDone>
        //   30   69:getstatic       #45  <Field SuperSurface StylingActivity.superSurface>
        //   31   72:iconst_0        
        //   32   73:invokevirtual   #72  <Method void SuperSurface.setVisibility(int)>
        //   33   76:return          
        }

        final StylingActivity this$0;
        private final Bundle val$savedInstanceState;
    }


    // Unreferenced inner class codeadore/textgram/StylingActivity$1$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StylingActivity$1 this$1>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        // try 0 29 handler(s) 30
        //    0    0:getstatic       #28  <Field ArrayList StylingActivity.templatesList>
        //    1    3:invokevirtual   #34  <Method int ArrayList.size()>
        //    2    6:ifle            29
        //    3    9:getstatic       #28  <Field ArrayList StylingActivity.templatesList>
        //    4   12:iconst_2        
        //    5   13:invokevirtual   #38  <Method Object ArrayList.get(int)>
        //    6   16:checkcast       #40  <Class String>
        //    7   19:invokestatic    #44  <Method void StylingActivity.setTemplate(String)>
        //    8   22:getstatic       #48  <Field SuperSurface StylingActivity.superSurface>
        //    9   25:iconst_0        
        //   10   26:invokevirtual   #54  <Method void SuperSurface.setVisibility(int)>
        //   11   29:return          
        // catch IOException
        //   12   30:astore_1        
        //   13   31:aload_1         
        //   14   32:invokevirtual   #57  <Method void IOException.printStackTrace()>
        //   15   35:return          
        }

        final _cls1 this$1;
    }


    // Unreferenced inner class codeadore/textgram/StylingActivity$2

/* anonymous class */
    class _cls2
        implements android.support.v4.view.ViewPager.OnPageChangeListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StylingActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onPageScrollStateChanged(int i)
        {
        //    0    0:return          
        }

        public void onPageScrolled(int i, float f, int j)
        {
        //    0    0:return          
        }

        public void onPageSelected(int i)
        {
        //    0    0:iconst_0        
        //    1    1:invokestatic    #29  <Method void StylingActivity.toggleSubFragment(boolean)>
        //    2    4:getstatic       #33  <Field SuperSurface StylingActivity.superSurface>
        //    3    7:invokevirtual   #38  <Method void SuperSurface.clearSelection()>
        //    4   10:return          
        }

        final StylingActivity this$0;
    }


    // Unreferenced inner class codeadore/textgram/StylingActivity$3

/* anonymous class */
    class _cls3
        implements Runnable
    {

        _cls3()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StylingActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field StylingActivity this$0>
        //    2    4:iconst_m1       
        //    3    5:invokevirtual   #24  <Method void StylingActivity.setRequestedOrientation(int)>
        //    4    8:return          
        }

        final StylingActivity this$0;
    }


    // Unreferenced inner class codeadore/textgram/StylingActivity$4

/* anonymous class */
    class _cls4
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        _cls4()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field StylingActivity this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field Bundle val$savedInstanceState>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public void onGlobalLayout()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field StylingActivity this$0>
        //    2    4:getfield        #29  <Field boolean StylingActivity.treeObserverActionDone>
        //    3    7:ifne            345
        //    4   10:aload_0         
        //    5   11:getfield        #19  <Field StylingActivity this$0>
        //    6   14:iconst_1        
        //    7   15:putfield        #29  <Field boolean StylingActivity.treeObserverActionDone>
        //    8   18:aload_0         
        //    9   19:getfield        #21  <Field Bundle val$savedInstanceState>
        //   10   22:ldc1            #31  <String "backgroundPath">
        //   11   24:invokevirtual   #37  <Method String Bundle.getString(String)>
        //   12   27:astore_1        
        //   13   28:aload_1         
        //   14   29:ifnull          52
        //   15   32:getstatic       #40  <Field boolean StylingActivity.pauseSetBG>
        //   16   35:ifne            52
        //   17   38:getstatic       #44  <Field SuperSurface StylingActivity.superSurface>
        //   18   41:getstatic       #48  <Field Context StylingActivity.c>
        //   19   44:aload_1         
        //   20   45:invokestatic    #54  <Method Bitmap Utilities.getBitmapFromPath(Context, String)>
        //   21   48:aload_1         
        //   22   49:invokevirtual   #60  <Method void SuperSurface.setBackground(Bitmap, String)>
        //   23   52:iconst_0        
        //   24   53:putstatic       #40  <Field boolean StylingActivity.pauseSetBG>
        //   25   56:aload_0         
        //   26   57:getfield        #21  <Field Bundle val$savedInstanceState>
        //   27   60:ldc1            #62  <String "framePath">
        //   28   62:invokevirtual   #37  <Method String Bundle.getString(String)>
        //   29   65:astore_2        
        //   30   66:aload_2         
        //   31   67:ifnull          84
        //   32   70:getstatic       #44  <Field SuperSurface StylingActivity.superSurface>
        //   33   73:getstatic       #48  <Field Context StylingActivity.c>
        //   34   76:aload_2         
        //   35   77:invokestatic    #54  <Method Bitmap Utilities.getBitmapFromPath(Context, String)>
        //   36   80:aload_2         
        //   37   81:invokevirtual   #65  <Method void SuperSurface.setFrame(Bitmap, String)>
        //   38   84:aload_0         
        //   39   85:getfield        #21  <Field Bundle val$savedInstanceState>
        //   40   88:ldc1            #67  <String "filterPath">
        //   41   90:invokevirtual   #37  <Method String Bundle.getString(String)>
        //   42   93:astore_3        
        //   43   94:aload_3         
        //   44   95:ifnull          112
        //   45   98:getstatic       #44  <Field SuperSurface StylingActivity.superSurface>
        //   46  101:getstatic       #48  <Field Context StylingActivity.c>
        //   47  104:aload_3         
        //   48  105:invokestatic    #54  <Method Bitmap Utilities.getBitmapFromPath(Context, String)>
        //   49  108:aload_3         
        //   50  109:invokevirtual   #70  <Method void SuperSurface.setFilter(Bitmap, String)>
        //   51  112:getstatic       #44  <Field SuperSurface StylingActivity.superSurface>
        //   52  115:invokevirtual   #73  <Method void SuperSurface.updateTemps()>
        //   53  118:getstatic       #77  <Field SuperSurfaceItem StylingActivity.mainTextItem>
        //   54  121:invokestatic    #81  <Method void StylingActivity.updateTextBitmap(SuperSurfaceItem)>
        //   55  124:aload_0         
        //   56  125:getfield        #21  <Field Bundle val$savedInstanceState>
        //   57  128:ldc1            #83  <String "itemsBitmapsPaths">
        //   58  130:invokevirtual   #87  <Method ArrayList Bundle.getStringArrayList(String)>
        //   59  133:astore          4
        //   60  135:aload_0         
        //   61  136:getfield        #21  <Field Bundle val$savedInstanceState>
        //   62  139:ldc1            #89  <String "itemsPosXs">
        //   63  141:invokevirtual   #93  <Method float[] Bundle.getFloatArray(String)>
        //   64  144:astore          5
        //   65  146:aload_0         
        //   66  147:getfield        #21  <Field Bundle val$savedInstanceState>
        //   67  150:ldc1            #95  <String "itemsPosYs">
        //   68  152:invokevirtual   #93  <Method float[] Bundle.getFloatArray(String)>
        //   69  155:astore          6
        //   70  157:aload_0         
        //   71  158:getfield        #21  <Field Bundle val$savedInstanceState>
        //   72  161:ldc1            #97  <String "itemsWidths">
        //   73  163:invokevirtual   #100 <Method ArrayList Bundle.getIntegerArrayList(String)>
        //   74  166:astore          7
        //   75  168:aload_0         
        //   76  169:getfield        #21  <Field Bundle val$savedInstanceState>
        //   77  172:ldc1            #102 <String "itemsHeights">
        //   78  174:invokevirtual   #100 <Method ArrayList Bundle.getIntegerArrayList(String)>
        //   79  177:astore          8
        //   80  179:aload_0         
        //   81  180:getfield        #21  <Field Bundle val$savedInstanceState>
        //   82  183:ldc1            #104 <String "itemRotations">
        //   83  185:invokevirtual   #100 <Method ArrayList Bundle.getIntegerArrayList(String)>
        //   84  188:astore          9
        //   85  190:aload_0         
        //   86  191:getfield        #21  <Field Bundle val$savedInstanceState>
        //   87  194:ldc1            #106 <String "textReflections">
        //   88  196:invokevirtual   #100 <Method ArrayList Bundle.getIntegerArrayList(String)>
        //   89  199:astore          10
        //   90  201:aload_0         
        //   91  202:getfield        #21  <Field Bundle val$savedInstanceState>
        //   92  205:ldc1            #108 <String "textColors">
        //   93  207:invokevirtual   #87  <Method ArrayList Bundle.getStringArrayList(String)>
        //   94  210:astore          11
        //   95  212:aload_0         
        //   96  213:getfield        #21  <Field Bundle val$savedInstanceState>
        //   97  216:ldc1            #110 <String "textShadowColors">
        //   98  218:invokevirtual   #100 <Method ArrayList Bundle.getIntegerArrayList(String)>
        //   99  221:astore          12
        //  100  223:aload_0         
        //  101  224:getfield        #21  <Field Bundle val$savedInstanceState>
        //  102  227:ldc1            #112 <String "textSizes">
        //  103  229:invokevirtual   #100 <Method ArrayList Bundle.getIntegerArrayList(String)>
        //  104  232:astore          13
        //  105  234:aload_0         
        //  106  235:getfield        #21  <Field Bundle val$savedInstanceState>
        //  107  238:ldc1            #114 <String "textGravities">
        //  108  240:invokevirtual   #100 <Method ArrayList Bundle.getIntegerArrayList(String)>
        //  109  243:astore          14
        //  110  245:aload_0         
        //  111  246:getfield        #21  <Field Bundle val$savedInstanceState>
        //  112  249:ldc1            #116 <String "textLineSpacings">
        //  113  251:invokevirtual   #100 <Method ArrayList Bundle.getIntegerArrayList(String)>
        //  114  254:astore          15
        //  115  256:aload_0         
        //  116  257:getfield        #21  <Field Bundle val$savedInstanceState>
        //  117  260:ldc1            #118 <String "typeFacePaths">
        //  118  262:invokevirtual   #87  <Method ArrayList Bundle.getStringArrayList(String)>
        //  119  265:astore          16
        //  120  267:aload_0         
        //  121  268:getfield        #21  <Field Bundle val$savedInstanceState>
        //  122  271:ldc1            #120 <String "texts">
        //  123  273:invokevirtual   #87  <Method ArrayList Bundle.getStringArrayList(String)>
        //  124  276:astore          17
        //  125  278:aload_0         
        //  126  279:getfield        #21  <Field Bundle val$savedInstanceState>
        //  127  282:ldc1            #122 <String "itemTypes">
        //  128  284:invokevirtual   #87  <Method ArrayList Bundle.getStringArrayList(String)>
        //  129  287:astore          18
        //  130  289:aload_0         
        //  131  290:getfield        #21  <Field Bundle val$savedInstanceState>
        //  132  293:ldc1            #124 <String "itemDeletable">
        //  133  295:invokevirtual   #87  <Method ArrayList Bundle.getStringArrayList(String)>
        //  134  298:astore          19
        //  135  300:iconst_0        
        //  136  301:istore          20
        //  137  303:iload           20
        //  138  305:aload           18
        //  139  307:invokevirtual   #130 <Method int ArrayList.size()>
        //  140  310:icmplt          346
        //  141  313:getstatic       #44  <Field SuperSurface StylingActivity.superSurface>
        //  142  316:invokevirtual   #133 <Method void SuperSurface.requestUpdate()>
        //  143  319:getstatic       #137 <Field Handler StylingActivity.UIHandler>
        //  144  322:astore          23
        //  145  324:new             #139 <Class StylingActivity$4$1>
        //  146  327:dup             
        //  147  328:aload_0         
        //  148  329:invokespecial   #142 <Method void StylingActivity$4$1(StylingActivity$4)>
        //  149  332:astore          24
        //  150  334:aload           23
        //  151  336:aload           24
        //  152  338:ldc2w           #143 <Long 100L>
        //  153  341:invokevirtual   #150 <Method boolean Handler.postDelayed(Runnable, long)>
        //  154  344:pop             
        //  155  345:return          
        //  156  346:new             #152 <Class SuperSurfaceItem>
        //  157  349:dup             
        //  158  350:invokespecial   #153 <Method void SuperSurfaceItem()>
        //  159  353:astore          21
        //  160  355:aload           21
        //  161  357:aload           5
        //  162  359:iload           20
        //  163  361:faload          
        //  164  362:putfield        #157 <Field float SuperSurfaceItem.posX>
        //  165  365:aload           21
        //  166  367:aload           6
        //  167  369:iload           20
        //  168  371:faload          
        //  169  372:putfield        #160 <Field float SuperSurfaceItem.posY>
        //  170  375:aload           21
        //  171  377:aload           7
        //  172  379:iload           20
        //  173  381:invokevirtual   #164 <Method Object ArrayList.get(int)>
        //  174  384:checkcast       #166 <Class Integer>
        //  175  387:invokevirtual   #169 <Method int Integer.intValue()>
        //  176  390:i2f             
        //  177  391:putfield        #172 <Field float SuperSurfaceItem.width>
        //  178  394:aload           21
        //  179  396:aload           8
        //  180  398:iload           20
        //  181  400:invokevirtual   #164 <Method Object ArrayList.get(int)>
        //  182  403:checkcast       #166 <Class Integer>
        //  183  406:invokevirtual   #169 <Method int Integer.intValue()>
        //  184  409:i2f             
        //  185  410:putfield        #175 <Field float SuperSurfaceItem.height>
        //  186  413:aload           21
        //  187  415:aload           9
        //  188  417:iload           20
        //  189  419:invokevirtual   #164 <Method Object ArrayList.get(int)>
        //  190  422:checkcast       #166 <Class Integer>
        //  191  425:invokevirtual   #169 <Method int Integer.intValue()>
        //  192  428:putfield        #179 <Field int SuperSurfaceItem.rotation>
        //  193  431:aload           19
        //  194  433:iload           20
        //  195  435:invokevirtual   #164 <Method Object ArrayList.get(int)>
        //  196  438:checkcast       #181 <Class String>
        //  197  441:ldc1            #183 <String "true">
        //  198  443:invokevirtual   #187 <Method boolean String.contains(CharSequence)>
        //  199  446:ifeq            810
        //  200  449:aload           21
        //  201  451:iconst_1        
        //  202  452:putfield        #190 <Field boolean SuperSurfaceItem.deletable>
        //  203  455:aload           17
        //  204  457:iload           20
        //  205  459:invokevirtual   #164 <Method Object ArrayList.get(int)>
        //  206  462:ifnull          477
        //  207  465:aload           17
        //  208  467:iload           20
        //  209  469:invokevirtual   #164 <Method Object ArrayList.get(int)>
        //  210  472:ldc1            #192 <String "">
        //  211  474:if_acmpne       555
        //  212  477:aload           4
        //  213  479:iload           20
        //  214  481:invokevirtual   #164 <Method Object ArrayList.get(int)>
        //  215  484:ifnull          532
        //  216  487:aload           4
        //  217  489:iload           20
        //  218  491:invokevirtual   #164 <Method Object ArrayList.get(int)>
        //  219  494:checkcast       #181 <Class String>
        //  220  497:ldc1            #194 <String "[URI]">
        //  221  499:invokevirtual   #187 <Method boolean String.contains(CharSequence)>
        //  222  502:ifeq            819
        //  223  505:aload           21
        //  224  507:getstatic       #48  <Field Context StylingActivity.c>
        //  225  510:getstatic       #48  <Field Context StylingActivity.c>
        //  226  513:aload           4
        //  227  515:iload           20
        //  228  517:invokevirtual   #164 <Method Object ArrayList.get(int)>
        //  229  520:checkcast       #181 <Class String>
        //  230  523:invokestatic    #54  <Method Bitmap Utilities.getBitmapFromPath(Context, String)>
        //  231  526:invokestatic    #198 <Method Bitmap Utilities.decorateBitmap(Context, Bitmap)>
        //  232  529:putfield        #202 <Field Bitmap SuperSurfaceItem.bitmap>
        //  233  532:aload           21
        //  234  534:aload           4
        //  235  536:iload           20
        //  236  538:invokevirtual   #164 <Method Object ArrayList.get(int)>
        //  237  541:checkcast       #181 <Class String>
        //  238  544:putfield        #206 <Field String SuperSurfaceItem.bitmapPath>
        //  239  547:getstatic       #44  <Field SuperSurface StylingActivity.superSurface>
        //  240  550:aload           21
        //  241  552:invokevirtual   #209 <Method void SuperSurface.addItem(SuperSurfaceItem)>
        //  242  555:aload           18
        //  243  557:iload           20
        //  244  559:invokevirtual   #164 <Method Object ArrayList.get(int)>
        //  245  562:checkcast       #181 <Class String>
        //  246  565:ldc1            #211 <String "text">
        //  247  567:invokevirtual   #187 <Method boolean String.contains(CharSequence)>
        //  248  570:ifeq            804
        //  249  573:aload           21
        //  250  575:aload           10
        //  251  577:iload           20
        //  252  579:invokevirtual   #164 <Method Object ArrayList.get(int)>
        //  253  582:checkcast       #166 <Class Integer>
        //  254  585:invokevirtual   #169 <Method int Integer.intValue()>
        //  255  588:putfield        #214 <Field int SuperSurfaceItem.reflection>
        //  256  591:aload           21
        //  257  593:aload           16
        //  258  595:iload           20
        //  259  597:invokevirtual   #164 <Method Object ArrayList.get(int)>
        //  260  600:checkcast       #181 <Class String>
        //  261  603:putfield        #217 <Field String SuperSurfaceItem.typeFacePath>
        //  262  606:aload           21
        //  263  608:ldc1            #211 <String "text">
        //  264  610:putfield        #220 <Field String SuperSurfaceItem.type>
        //  265  613:aload           21
        //  266  615:aload_0         
        //  267  616:getfield        #19  <Field StylingActivity this$0>
        //  268  619:invokevirtual   #224 <Method void SuperSurfaceItem.setup(StylingActivity)>
        //  269  622:aload           21
        //  270  624:invokevirtual   #226 <Method void SuperSurfaceItem.updateTextBitmap()>
        //  271  627:new             #228 <Class SpannableString>
        //  272  630:dup             
        //  273  631:aload           17
        //  274  633:iload           20
        //  275  635:invokevirtual   #164 <Method Object ArrayList.get(int)>
        //  276  638:checkcast       #230 <Class CharSequence>
        //  277  641:invokespecial   #233 <Method void SpannableString(CharSequence)>
        //  278  644:astore          22
        //  279  646:aload           21
        //  280  648:aload           22
        //  281  650:invokevirtual   #237 <Method void SuperSurfaceItem.setText(SpannableString)>
        //  282  653:aload           21
        //  283  655:aload           11
        //  284  657:iload           20
        //  285  659:invokevirtual   #164 <Method Object ArrayList.get(int)>
        //  286  662:checkcast       #181 <Class String>
        //  287  665:putfield        #240 <Field String SuperSurfaceItem.textColor>
        //  288  668:aload           12
        //  289  670:iload           20
        //  290  672:invokevirtual   #164 <Method Object ArrayList.get(int)>
        //  291  675:checkcast       #166 <Class Integer>
        //  292  678:invokevirtual   #169 <Method int Integer.intValue()>
        //  293  681:ifeq            712
        //  294  684:aload           12
        //  295  686:iload           20
        //  296  688:invokevirtual   #164 <Method Object ArrayList.get(int)>
        //  297  691:ifnull          712
        //  298  694:aload           21
        //  299  696:aload           12
        //  300  698:iload           20
        //  301  700:invokevirtual   #164 <Method Object ArrayList.get(int)>
        //  302  703:checkcast       #166 <Class Integer>
        //  303  706:invokevirtual   #169 <Method int Integer.intValue()>
        //  304  709:putfield        #243 <Field int SuperSurfaceItem.textShadowColor>
        //  305  712:aload           21
        //  306  714:aload           13
        //  307  716:iload           20
        //  308  718:invokevirtual   #164 <Method Object ArrayList.get(int)>
        //  309  721:checkcast       #166 <Class Integer>
        //  310  724:invokevirtual   #169 <Method int Integer.intValue()>
        //  311  727:i2f             
        //  312  728:putfield        #246 <Field float SuperSurfaceItem.textSize>
        //  313  731:aload           21
        //  314  733:aload           14
        //  315  735:iload           20
        //  316  737:invokevirtual   #164 <Method Object ArrayList.get(int)>
        //  317  740:checkcast       #166 <Class Integer>
        //  318  743:invokevirtual   #169 <Method int Integer.intValue()>
        //  319  746:invokevirtual   #250 <Method void SuperSurfaceItem.setTextGravity(int)>
        //  320  749:aload           21
        //  321  751:aload           15
        //  322  753:iload           20
        //  323  755:invokevirtual   #164 <Method Object ArrayList.get(int)>
        //  324  758:checkcast       #166 <Class Integer>
        //  325  761:invokevirtual   #169 <Method int Integer.intValue()>
        //  326  764:putfield        #253 <Field int SuperSurfaceItem.lineSpacing>
        //  327  767:getstatic       #44  <Field SuperSurface StylingActivity.superSurface>
        //  328  770:aload           21
        //  329  772:invokevirtual   #209 <Method void SuperSurface.addItem(SuperSurfaceItem)>
        //  330  775:aload           21
        //  331  777:invokevirtual   #226 <Method void SuperSurfaceItem.updateTextBitmap()>
        //  332  780:aload           21
        //  333  782:getfield        #190 <Field boolean SuperSurfaceItem.deletable>
        //  334  785:ifne            804
        //  335  788:aload           21
        //  336  790:putstatic       #77  <Field SuperSurfaceItem StylingActivity.mainTextItem>
        //  337  793:getstatic       #256 <Field SuperSurfaceItem SuperSurface.currentTextItemVar>
        //  338  796:ifnonnull       804
        //  339  799:aload           21
        //  340  801:putstatic       #256 <Field SuperSurfaceItem SuperSurface.currentTextItemVar>
        //  341  804:iinc            20  1
        //  342  807:goto            303
        //  343  810:aload           21
        //  344  812:iconst_0        
        //  345  813:putfield        #190 <Field boolean SuperSurfaceItem.deletable>
        //  346  816:goto            455
        //  347  819:aload           21
        //  348  821:getstatic       #48  <Field Context StylingActivity.c>
        //  349  824:aload           4
        //  350  826:iload           20
        //  351  828:invokevirtual   #164 <Method Object ArrayList.get(int)>
        //  352  831:checkcast       #181 <Class String>
        //  353  834:invokestatic    #54  <Method Bitmap Utilities.getBitmapFromPath(Context, String)>
        //  354  837:putfield        #202 <Field Bitmap SuperSurfaceItem.bitmap>
        //  355  840:goto            532
        }

        final StylingActivity this$0;
        private final Bundle val$savedInstanceState;
    }


    // Unreferenced inner class codeadore/textgram/StylingActivity$4$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StylingActivity$4 this$1>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:getstatic       #26  <Field SuperSurfaceItem StylingActivity.mainTextItem>
        //    1    3:invokestatic    #30  <Method void StylingActivity.updateTextBitmap(SuperSurfaceItem)>
        //    2    6:return          
        }

        final _cls4 this$1;
    }


    // Unreferenced inner class codeadore/textgram/StylingActivity$5

/* anonymous class */
    class _cls5
        implements Runnable
    {

        _cls5()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #21  <Field StylingActivity this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #23  <Field Bitmap val$bitmap>
        //    6   10:aload_0         
        //    7   11:aload_3         
        //    8   12:putfield        #25  <Field String val$theURI>
        //    9   15:aload_0         
        //   10   16:invokespecial   #28  <Method void Object()>
        //   11   19:return          
        }

        public void run()
        {
        //    0    0:getstatic       #33  <Field SuperSurface StylingActivity.superSurface>
        //    1    3:aload_0         
        //    2    4:getfield        #23  <Field Bitmap val$bitmap>
        //    3    7:new             #35  <Class StringBuilder>
        //    4   10:dup             
        //    5   11:ldc1            #37  <String "[URI]/">
        //    6   13:invokespecial   #40  <Method void StringBuilder(String)>
        //    7   16:aload_0         
        //    8   17:getfield        #25  <Field String val$theURI>
        //    9   20:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
        //   10   23:invokevirtual   #48  <Method String StringBuilder.toString()>
        //   11   26:invokevirtual   #54  <Method void SuperSurface.setBackground(Bitmap, String)>
        //   12   29:getstatic       #33  <Field SuperSurface StylingActivity.superSurface>
        //   13   32:invokevirtual   #57  <Method void SuperSurface.requestUpdate()>
        //   14   35:return          
        }

        final StylingActivity this$0;
        private final Bitmap val$bitmap;
        private final String val$theURI;
    }


    // Unreferenced inner class codeadore/textgram/StylingActivity$6

/* anonymous class */
    class _cls6
        implements Runnable
    {

        _cls6()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #15  <Method void Object()>
        //    2    4:return          
        }

        public void run()
        {
        //    0    0:getstatic       #20  <Field SuperSurface StylingActivity.superSurface>
        //    1    3:invokevirtual   #25  <Method void SuperSurface.updateTemps()>
        //    2    6:getstatic       #29  <Field SuperSurfaceItem StylingActivity.mainTextItem>
        //    3    9:invokestatic    #33  <Method void StylingActivity.updateTextBitmap(SuperSurfaceItem)>
        //    4   12:getstatic       #20  <Field SuperSurface StylingActivity.superSurface>
        //    5   15:invokevirtual   #36  <Method void SuperSurface.requestUpdate()>
        //    6   18:return          
        }
    }


    // Unreferenced inner class codeadore/textgram/StylingActivity$7

/* anonymous class */
    class _cls7
        implements android.view.View.OnClickListener
    {

        _cls7()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field StylingActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:new             #24  <Class Intent>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:getfield        #17  <Field StylingActivity this$0>
        //    4    8:getfield        #28  <Field el7rFragmentActivity StylingActivity.thisActivity>
        //    5   11:ldc1            #30  <Class ResultActivity>
        //    6   13:invokespecial   #33  <Method void Intent(Context, Class)>
        //    7   16:astore_2        
        //    8   17:getstatic       #37  <Field SuperSurface StylingActivity.superSurface>
        //    9   20:invokevirtual   #43  <Method Bitmap SuperSurface.export()>
        //   10   23:putstatic       #47  <Field Bitmap ResultActivity.resultBitmap>
        //   11   26:aload_0         
        //   12   27:getfield        #17  <Field StylingActivity this$0>
        //   13   30:aload_2         
        //   14   31:invokevirtual   #51  <Method void StylingActivity.startActivity(Intent)>
        //   15   34:return          
        }

        final StylingActivity this$0;
    }

}
