// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram;

import android.app.Activity;
import android.content.*;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.*;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.*;
import codeadore.textgram.custom_widgets.EmojisTabPageIndicator;
import com.google.android.apps.analytics.GoogleAnalyticsTracker;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package codeadore.textgram:
//            el7rFragmentActivity, StylingActivity, Settings, FirstTimeActivity, 
//            EmojisPagerAdapter, AdUtilities, StoreActivity, Utilities, 
//            el7rUtilities

public class MainActivity extends el7rFragmentActivity
{

    public MainActivity()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #26  <Method void el7rFragmentActivity()>
    //    2    4:aload_0         
    //    3    5:ldc1            #28  <String "MainActivity">
    //    4    7:putfield        #30  <Field String TAG>
    //    5   10:aload_0         
    //    6   11:iconst_0        
    //    7   12:putfield        #32  <Field boolean smileysLoaded>
    //    8   15:aload_0         
    //    9   16:ldc1            #34  <String "phone">
    //   10   18:putfield        #36  <Field String layout>
    //   11   21:aload_0         
    //   12   22:new             #38  <Class Handler>
    //   13   25:dup             
    //   14   26:invokespecial   #39  <Method void Handler()>
    //   15   29:putfield        #41  <Field Handler handler>
    //   16   32:return          
    }

    public static void goNext()
    {
    //    0    0:new             #44  <Class Intent>
    //    1    3:dup             
    //    2    4:getstatic       #46  <Field Activity c>
    //    3    7:ldc1            #48  <Class StylingActivity>
    //    4    9:invokespecial   #51  <Method void Intent(android.content.Context, Class)>
    //    5   12:astore_0        
    //    6   13:getstatic       #53  <Field EditText editText>
    //    7   16:invokevirtual   #59  <Method Editable EditText.getText()>
    //    8   19:putstatic       #63  <Field Editable StylingActivity.theText>
    //    9   22:getstatic       #46  <Field Activity c>
    //   10   25:aload_0         
    //   11   26:invokevirtual   #69  <Method void Activity.startActivity(Intent)>
    //   12   29:return          
    }

    public void onCreate(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #77  <Method void el7rFragmentActivity.onCreate(Bundle)>
    //    3    5:aload_0         
    //    4    6:ldc1            #78  <Int 0x7f03001d>
    //    5    8:invokevirtual   #82  <Method void setContentView(int)>
    //    6   11:aload_0         
    //    7   12:new             #38  <Class Handler>
    //    8   15:dup             
    //    9   16:invokespecial   #39  <Method void Handler()>
    //   10   19:putfield        #84  <Field Handler UIHandler>
    //   11   22:aload_0         
    //   12   23:putstatic       #46  <Field Activity c>
    //   13   26:aload_0         
    //   14   27:aload_0         
    //   15   28:ldc1            #85  <Int 0x7f06005b>
    //   16   30:invokevirtual   #89  <Method View findViewById(int)>
    //   17   33:checkcast       #91  <Class LinearLayout>
    //   18   36:putfield        #93  <Field LinearLayout smileysLL>
    //   19   39:aload_0         
    //   20   40:ldc1            #94  <Int 0x7f060056>
    //   21   42:invokevirtual   #89  <Method View findViewById(int)>
    //   22   45:checkcast       #55  <Class EditText>
    //   23   48:putstatic       #53  <Field EditText editText>
    //   24   51:aload_0         
    //   25   52:ldc1            #95  <Int 0x7f060055>
    //   26   54:invokevirtual   #89  <Method View findViewById(int)>
    //   27   57:checkcast       #97  <Class TextView>
    //   28   60:astore_2        
    //   29   61:aload_0         
    //   30   62:aload_0         
    //   31   63:ldc1            #99  <String "TextgramSettings">
    //   32   65:iconst_0        
    //   33   66:invokevirtual   #103 <Method SharedPreferences getSharedPreferences(String, int)>
    //   34   69:putfield        #105 <Field SharedPreferences settings>
    // try 72 95 handler(s) 481
    //   35   72:new             #107 <Class JSONObject>
    //   36   75:dup             
    //   37   76:aload_0         
    //   38   77:getfield        #105 <Field SharedPreferences settings>
    //   39   80:ldc1            #109 <String "settingsJSON">
    //   40   82:ldc1            #111 <String "{ \"adnetwork\":\"admob\", \"interstitials\":\"applovin\", \"message_id\":\"none\", \"message_html\":\"\" }">
    //   41   84:invokeinterface #117 <Method String SharedPreferences.getString(String, String)>
    //   42   89:invokespecial   #120 <Method void JSONObject(String)>
    //   43   92:putstatic       #126 <Field JSONObject Settings.json>
    //   44   95:aload_0         
    //   45   96:invokevirtual   #130 <Method Intent getIntent()>
    //   46   99:astore          4
    //   47  101:aload           4
    //   48  103:invokevirtual   #134 <Method Bundle Intent.getExtras()>
    //   49  106:astore          5
    //   50  108:ldc1            #136 <String "android.intent.action.SEND">
    //   51  110:aload           4
    //   52  112:invokevirtual   #140 <Method String Intent.getAction()>
    //   53  115:invokevirtual   #146 <Method boolean String.equals(Object)>
    //   54  118:ifeq            148
    //   55  121:aload           5
    //   56  123:ldc1            #148 <String "android.intent.extra.TEXT">
    //   57  125:invokevirtual   #154 <Method boolean Bundle.containsKey(String)>
    //   58  128:ifeq            148
    // try 131 148 handler(s) 516
    //   59  131:aload           5
    //   60  133:ldc1            #148 <String "android.intent.extra.TEXT">
    //   61  135:invokevirtual   #157 <Method String Bundle.getString(String)>
    //   62  138:astore          31
    //   63  140:getstatic       #53  <Field EditText editText>
    //   64  143:aload           31
    //   65  145:invokevirtual   #161 <Method void EditText.setText(CharSequence)>
    //   66  148:aload_0         
    //   67  149:getfield        #41  <Field Handler handler>
    //   68  152:astore          6
    //   69  154:new             #163 <Class MainActivity$1>
    //   70  157:dup             
    //   71  158:aload_0         
    //   72  159:invokespecial   #166 <Method void MainActivity$1(MainActivity)>
    //   73  162:astore          7
    //   74  164:aload           6
    //   75  166:aload           7
    //   76  168:ldc2w           #167 <Long 300L>
    //   77  171:invokevirtual   #172 <Method boolean Handler.postDelayed(Runnable, long)>
    //   78  174:pop             
    //   79  175:aload_0         
    //   80  176:getfield        #176 <Field GoogleAnalyticsTracker tracker>
    //   81  179:ldc1            #178 <String "/MainActivity">
    //   82  181:invokevirtual   #183 <Method void GoogleAnalyticsTracker.trackPageView(String)>
    //   83  184:aload_0         
    //   84  185:ldc1            #185 <String "MyPrefs">
    //   85  187:iconst_0        
    //   86  188:invokevirtual   #103 <Method SharedPreferences getSharedPreferences(String, int)>
    //   87  191:astore          9
    //   88  193:aload           9
    //   89  195:ldc1            #187 <String "FirstRun2">
    //   90  197:iconst_1        
    //   91  198:invokeinterface #191 <Method boolean SharedPreferences.getBoolean(String, boolean)>
    //   92  203:ifeq            248
    // try 206 220 handler(s) 489
    //   93  206:aload_0         
    //   94  207:new             #44  <Class Intent>
    //   95  210:dup             
    //   96  211:aload_0         
    //   97  212:ldc1            #193 <Class FirstTimeActivity>
    //   98  214:invokespecial   #51  <Method void Intent(android.content.Context, Class)>
    //   99  217:invokevirtual   #194 <Method void startActivity(Intent)>
    //  100  220:aload           9
    //  101  222:invokeinterface #198 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
    //  102  227:astore          27
    //  103  229:aload           27
    //  104  231:ldc1            #187 <String "FirstRun2">
    //  105  233:iconst_0        
    //  106  234:invokeinterface #204 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
    //  107  239:pop             
    //  108  240:aload           27
    //  109  242:invokeinterface #208 <Method boolean android.content.SharedPreferences$Editor.commit()>
    //  110  247:pop             
    //  111  248:aload_0         
    //  112  249:aload_0         
    //  113  250:ldc1            #209 <Int 0x7f060058>
    //  114  252:invokevirtual   #89  <Method View findViewById(int)>
    //  115  255:checkcast       #211 <Class ImageButton>
    //  116  258:putfield        #213 <Field ImageButton smileysBtn>
    //  117  261:aload_0         
    //  118  262:aload_0         
    //  119  263:ldc1            #85  <Int 0x7f06005b>
    //  120  265:invokevirtual   #89  <Method View findViewById(int)>
    //  121  268:checkcast       #91  <Class LinearLayout>
    //  122  271:putfield        #93  <Field LinearLayout smileysLL>
    // try 274 290 handler(s) 499
    //  123  274:aload_0         
    //  124  275:getfield        #93  <Field LinearLayout smileysLL>
    //  125  278:invokevirtual   #217 <Method int LinearLayout.getVisibility()>
    //  126  281:ifne            290
    //  127  284:aload_0         
    //  128  285:ldc1            #219 <String "tablet">
    //  129  287:putfield        #36  <Field String layout>
    //  130  290:aload_0         
    //  131  291:ldc1            #220 <Int 0x7f060059>
    //  132  293:invokevirtual   #89  <Method View findViewById(int)>
    //  133  296:checkcast       #211 <Class ImageButton>
    //  134  299:astore          11
    //  135  301:new             #222 <Class MainActivity$2>
    //  136  304:dup             
    //  137  305:aload_0         
    //  138  306:invokespecial   #223 <Method void MainActivity$2(MainActivity)>
    //  139  309:astore          12
    //  140  311:aload           11
    //  141  313:aload           12
    //  142  315:invokevirtual   #227 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
    //  143  318:aload_0         
    //  144  319:ldc1            #228 <Int 0x7f06005a>
    //  145  321:invokevirtual   #89  <Method View findViewById(int)>
    //  146  324:checkcast       #230 <Class Button>
    //  147  327:astore          13
    //  148  329:new             #232 <Class MainActivity$3>
    //  149  332:dup             
    //  150  333:aload_0         
    //  151  334:invokespecial   #233 <Method void MainActivity$3(MainActivity)>
    //  152  337:astore          14
    //  153  339:aload           13
    //  154  341:aload           14
    //  155  343:invokevirtual   #234 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //  156  346:aload_0         
    //  157  347:ldc1            #185 <String "MyPrefs">
    //  158  349:iconst_0        
    //  159  350:invokevirtual   #103 <Method SharedPreferences getSharedPreferences(String, int)>
    //  160  353:astore          15
    //  161  355:aload           9
    //  162  357:ldc1            #236 <String "FirstTimeTooltipStore">
    //  163  359:iconst_1        
    //  164  360:invokeinterface #191 <Method boolean SharedPreferences.getBoolean(String, boolean)>
    //  165  365:ifeq            396
    //  166  368:aload           15
    //  167  370:invokeinterface #198 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
    //  168  375:astore          23
    //  169  377:aload           23
    //  170  379:ldc1            #236 <String "FirstTimeTooltipStore">
    //  171  381:iconst_0        
    //  172  382:invokeinterface #204 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
    //  173  387:pop             
    //  174  388:aload           23
    //  175  390:invokeinterface #208 <Method boolean android.content.SharedPreferences$Editor.commit()>
    //  176  395:pop             
    //  177  396:aload_0         
    //  178  397:getfield        #213 <Field ImageButton smileysBtn>
    //  179  400:ifnull          509
    //  180  403:aload_0         
    //  181  404:getfield        #213 <Field ImageButton smileysBtn>
    //  182  407:astore          21
    //  183  409:new             #238 <Class MainActivity$4>
    //  184  412:dup             
    //  185  413:aload_0         
    //  186  414:invokespecial   #239 <Method void MainActivity$4(MainActivity)>
    //  187  417:astore          22
    //  188  419:aload           21
    //  189  421:aload           22
    //  190  423:invokevirtual   #227 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
    //  191  426:aload_0         
    //  192  427:invokevirtual   #242 <Method void setupSmileys()>
    //  193  430:getstatic       #53  <Field EditText editText>
    //  194  433:astore          16
    //  195  435:new             #244 <Class MainActivity$5>
    //  196  438:dup             
    //  197  439:aload_0         
    //  198  440:aload_2         
    //  199  441:invokespecial   #247 <Method void MainActivity$5(MainActivity, TextView)>
    //  200  444:astore          17
    //  201  446:aload           16
    //  202  448:aload           17
    //  203  450:invokevirtual   #251 <Method void EditText.addTextChangedListener(TextWatcher)>
    //  204  453:aload_0         
    //  205  454:getfield        #84  <Field Handler UIHandler>
    //  206  457:astore          18
    //  207  459:new             #253 <Class MainActivity$6>
    //  208  462:dup             
    //  209  463:aload_0         
    //  210  464:invokespecial   #254 <Method void MainActivity$6(MainActivity)>
    //  211  467:astore          19
    //  212  469:aload           18
    //  213  471:aload           19
    //  214  473:ldc2w           #167 <Long 300L>
    //  215  476:invokevirtual   #172 <Method boolean Handler.postDelayed(Runnable, long)>
    //  216  479:pop             
    //  217  480:return          
    // catch JSONException
    //  218  481:astore_3        
    //  219  482:aload_3         
    //  220  483:invokevirtual   #257 <Method void JSONException.printStackTrace()>
    //  221  486:goto            95
    // catch Exception
    //  222  489:astore          26
    //  223  491:aload           26
    //  224  493:invokevirtual   #258 <Method void Exception.printStackTrace()>
    //  225  496:goto            220
    // catch Exception
    //  226  499:astore          10
    //  227  501:aload           10
    //  228  503:invokevirtual   #258 <Method void Exception.printStackTrace()>
    //  229  506:goto            290
    //  230  509:aload_0         
    //  231  510:invokevirtual   #242 <Method void setupSmileys()>
    //  232  513:goto            426
    // catch Exception
    //  233  516:astore          30
    //  234  518:goto            148
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #262 <Method boolean el7rFragmentActivity.onCreateOptionsMenu(Menu)>
    //    3    5:pop             
    //    4    6:aload_1         
    //    5    7:ldc2            #263 <Int 0x7f0600e0>
    //    6   10:invokeinterface #269 <Method MenuItem Menu.findItem(int)>
    //    7   15:iconst_1        
    //    8   16:invokeinterface #275 <Method MenuItem MenuItem.setVisible(boolean)>
    //    9   21:pop             
    //   10   22:iconst_1        
    //   11   23:ireturn         
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #36  <Field String layout>
    //    2    4:ldc1            #34  <String "phone">
    //    3    6:if_acmpne       31
    //    4    9:iload_1         
    //    5   10:iconst_4        
    //    6   11:icmpne          31
    //    7   14:aload_0         
    //    8   15:getfield        #93  <Field LinearLayout smileysLL>
    //    9   18:invokevirtual   #217 <Method int LinearLayout.getVisibility()>
    //   10   21:ifne            31
    //   11   24:aload_0         
    //   12   25:iconst_0        
    //   13   26:invokevirtual   #281 <Method void toggleEmojis(boolean)>
    //   14   29:iconst_0        
    //   15   30:ireturn         
    //   16   31:aload_0         
    //   17   32:iload_1         
    //   18   33:aload_2         
    //   19   34:invokespecial   #283 <Method boolean el7rFragmentActivity.onKeyDown(int, KeyEvent)>
    //   20   37:ireturn         
    }

    protected void onResume()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #286 <Method void el7rFragmentActivity.onResume()>
    //    2    4:ldc1            #28  <String "MainActivity">
    //    3    6:putstatic       #289 <Field String Settings.currentEmojisActivity>
    //    4    9:return          
    }

    public void setupSmileys()
    {
    //    0    0:ldc1            #28  <String "MainActivity">
    //    1    2:putstatic       #289 <Field String Settings.currentEmojisActivity>
    //    2    5:aload_0         
    //    3    6:ldc2            #290 <Int 0x7f06005e>
    //    4    9:invokevirtual   #89  <Method View findViewById(int)>
    //    5   12:checkcast       #292 <Class ViewPager>
    //    6   15:astore_1        
    //    7   16:aload_1         
    //    8   17:new             #294 <Class EmojisPagerAdapter>
    //    9   20:dup             
    //   10   21:aload_0         
    //   11   22:invokevirtual   #298 <Method android.support.v4.app.FragmentManager getSupportFragmentManager()>
    //   12   25:invokespecial   #301 <Method void EmojisPagerAdapter(android.support.v4.app.FragmentManager)>
    //   13   28:invokevirtual   #305 <Method void ViewPager.setAdapter(android.support.v4.view.PagerAdapter)>
    //   14   31:aload_0         
    //   15   32:ldc2            #306 <Int 0x7f06005c>
    //   16   35:invokevirtual   #89  <Method View findViewById(int)>
    //   17   38:checkcast       #308 <Class EmojisTabPageIndicator>
    //   18   41:aload_1         
    //   19   42:invokevirtual   #312 <Method void EmojisTabPageIndicator.setViewPager(ViewPager)>
    //   20   45:aload_0         
    //   21   46:ldc2            #313 <Int 0x7f06005d>
    //   22   49:invokevirtual   #89  <Method View findViewById(int)>
    //   23   52:checkcast       #211 <Class ImageButton>
    //   24   55:new             #315 <Class MainActivity$7>
    //   25   58:dup             
    //   26   59:aload_0         
    //   27   60:invokespecial   #316 <Method void MainActivity$7(MainActivity)>
    //   28   63:invokevirtual   #227 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
    //   29   66:return          
    }

    protected void toggleEmojis(boolean flag)
    {
    //    0    0:iload_1         
    //    1    1:ifeq            60
    //    2    4:aload_0         
    //    3    5:getfield        #213 <Field ImageButton smileysBtn>
    //    4    8:ldc2            #317 <Int 0x7f02006e>
    //    5   11:invokevirtual   #320 <Method void ImageButton.setBackgroundResource(int)>
    //    6   14:aload_0         
    //    7   15:getfield        #93  <Field LinearLayout smileysLL>
    //    8   18:iconst_0        
    //    9   19:invokevirtual   #323 <Method void LinearLayout.setVisibility(int)>
    //   10   22:aload_0         
    //   11   23:ldc2            #324 <Int 0x7f04000c>
    //   12   26:invokestatic    #330 <Method android.view.animation.Animation AnimationUtils.loadAnimation(android.content.Context, int)>
    //   13   29:astore_3        
    //   14   30:aload_0         
    //   15   31:getfield        #93  <Field LinearLayout smileysLL>
    //   16   34:aload_3         
    //   17   35:invokevirtual   #334 <Method void LinearLayout.startAnimation(android.view.animation.Animation)>
    //   18   38:aload_0         
    //   19   39:ldc2            #336 <String "input_method">
    //   20   42:invokevirtual   #340 <Method Object getSystemService(String)>
    //   21   45:checkcast       #342 <Class InputMethodManager>
    //   22   48:getstatic       #53  <Field EditText editText>
    //   23   51:invokevirtual   #346 <Method android.os.IBinder EditText.getWindowToken()>
    //   24   54:iconst_0        
    //   25   55:invokevirtual   #350 <Method boolean InputMethodManager.hideSoftInputFromWindow(android.os.IBinder, int)>
    //   26   58:pop             
    //   27   59:return          
    //   28   60:aload_0         
    //   29   61:getfield        #213 <Field ImageButton smileysBtn>
    //   30   64:ldc2            #351 <Int 0x7f02006d>
    //   31   67:invokevirtual   #320 <Method void ImageButton.setBackgroundResource(int)>
    //   32   70:aload_0         
    //   33   71:ldc2            #352 <Int 0x7f040007>
    //   34   74:invokestatic    #330 <Method android.view.animation.Animation AnimationUtils.loadAnimation(android.content.Context, int)>
    //   35   77:astore_2        
    //   36   78:aload_0         
    //   37   79:getfield        #93  <Field LinearLayout smileysLL>
    //   38   82:aload_2         
    //   39   83:invokevirtual   #334 <Method void LinearLayout.startAnimation(android.view.animation.Animation)>
    //   40   86:aload_0         
    //   41   87:getfield        #93  <Field LinearLayout smileysLL>
    //   42   90:bipush          8
    //   43   92:invokevirtual   #323 <Method void LinearLayout.setVisibility(int)>
    //   44   95:return          
    }

    public static Activity c;
    public static EditText editText;
    String TAG;
    Handler UIHandler;
    Handler handler;
    String layout;
    SharedPreferences settings;
    ImageButton smileysBtn;
    LinearLayout smileysLL;
    boolean smileysLoaded;

    // Unreferenced inner class codeadore/textgram/MainActivity$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field MainActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field MainActivity this$0>
        //    2    4:aload_0         
        //    3    5:getfield        #17  <Field MainActivity this$0>
        //    4    8:ldc1            #22  <Int 0x7f060053>
        //    5   10:invokevirtual   #26  <Method View MainActivity.findViewById(int)>
        //    6   13:invokestatic    #32  <Method void AdUtilities.installAd(Activity, View)>
        //    7   16:return          
        }

        final MainActivity this$0;
    }


    // Unreferenced inner class codeadore/textgram/MainActivity$2

/* anonymous class */
    class _cls2
        implements android.view.View.OnClickListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field MainActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:new             #24  <Class android.app.AlertDialog$Builder>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:getfield        #17  <Field MainActivity this$0>
        //    4    8:invokespecial   #27  <Method void android.app.AlertDialog$Builder(android.content.Context)>
        //    5   11:ldc1            #28  <Int 0x1080027>
        //    6   13:invokevirtual   #32  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setIcon(int)>
        //    7   16:ldc1            #33  <Int 0x7f0b0043>
        //    8   18:invokevirtual   #36  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
        //    9   21:ldc1            #37  <Int 0x7f0b0044>
        //   10   23:invokevirtual   #40  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
        //   11   26:ldc1            #41  <Int 0x7f02007f>
        //   12   28:invokevirtual   #32  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setIcon(int)>
        //   13   31:ldc1            #42  <Int 0x7f0b0037>
        //   14   33:new             #44  <Class MainActivity$2$1>
        //   15   36:dup             
        //   16   37:aload_0         
        //   17   38:invokespecial   #47  <Method void MainActivity$2$1(MainActivity$2)>
        //   18   41:invokevirtual   #51  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
        //   19   44:ldc1            #52  <Int 0x7f0b0036>
        //   20   46:aconst_null     
        //   21   47:invokevirtual   #55  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
        //   22   50:invokevirtual   #59  <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
        //   23   53:pop             
        //   24   54:return          
        }

        final MainActivity this$0;
    }


    // Unreferenced inner class codeadore/textgram/MainActivity$2$1

/* anonymous class */
    class _cls1
        implements android.content.DialogInterface.OnClickListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field MainActivity$2 this$1>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(DialogInterface dialoginterface, int i)
        {
        //    0    0:getstatic       #27  <Field EditText MainActivity.editText>
        //    1    3:ldc1            #29  <String "">
        //    2    5:invokevirtual   #35  <Method void EditText.setText(CharSequence)>
        //    3    8:return          
        }

        final _cls2 this$1;
    }


    // Unreferenced inner class codeadore/textgram/MainActivity$3

/* anonymous class */
    class _cls3
        implements android.view.View.OnClickListener
    {

        _cls3()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field MainActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:new             #24  <Class Intent>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:getfield        #17  <Field MainActivity this$0>
        //    4    8:ldc1            #26  <Class StoreActivity>
        //    5   10:invokespecial   #29  <Method void Intent(android.content.Context, Class)>
        //    6   13:astore_2        
        //    7   14:aload_0         
        //    8   15:getfield        #17  <Field MainActivity this$0>
        //    9   18:aload_2         
        //   10   19:invokevirtual   #33  <Method void MainActivity.startActivity(Intent)>
        //   11   22:return          
        }

        final MainActivity this$0;
    }


    // Unreferenced inner class codeadore/textgram/MainActivity$4

/* anonymous class */
    class _cls4
        implements android.view.View.OnClickListener
    {

        _cls4()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field MainActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field MainActivity this$0>
        //    2    4:getfield        #26  <Field LinearLayout MainActivity.smileysLL>
        //    3    7:invokevirtual   #32  <Method int LinearLayout.getVisibility()>
        //    4   10:istore_2        
        //    5   11:iload_2         
        //    6   12:ifne            31
        //    7   15:aload_0         
        //    8   16:getfield        #17  <Field MainActivity this$0>
        //    9   19:iconst_0        
        //   10   20:invokevirtual   #36  <Method void MainActivity.toggleEmojis(boolean)>
        //   11   23:aload_0         
        //   12   24:getfield        #17  <Field MainActivity this$0>
        //   13   27:invokevirtual   #39  <Method void MainActivity.setupSmileys()>
        //   14   30:return          
        //   15   31:iload_2         
        //   16   32:bipush          8
        //   17   34:icmpne          23
        //   18   37:aload_0         
        //   19   38:getfield        #17  <Field MainActivity this$0>
        //   20   41:iconst_1        
        //   21   42:invokevirtual   #36  <Method void MainActivity.toggleEmojis(boolean)>
        //   22   45:goto            23
        }

        final MainActivity this$0;
    }


    // Unreferenced inner class codeadore/textgram/MainActivity$5

/* anonymous class */
    class _cls5
        implements TextWatcher
    {

        _cls5()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field MainActivity this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field TextView val$charsCountTV>
        //    6   10:aload_0         
        //    7   11:invokespecial   #24  <Method void Object()>
        //    8   14:return          
        }

        public void afterTextChanged(Editable editable)
        {
        //    0    0:return          
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        //    0    0:return          
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        //    0    0:getstatic       #35  <Field EditText MainActivity.editText>
        //    1    3:invokevirtual   #41  <Method Editable EditText.getText()>
        //    2    6:invokeinterface #47  <Method int Editable.length()>
        //    3   11:istore          5
        // try 13 35 handler(s) 36
        //    4   13:aload_0         
        //    5   14:getfield        #21  <Field TextView val$charsCountTV>
        //    6   17:new             #49  <Class StringBuilder>
        //    7   20:dup             
        //    8   21:invokespecial   #50  <Method void StringBuilder()>
        //    9   24:iload           5
        //   10   26:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
        //   11   29:invokevirtual   #58  <Method String StringBuilder.toString()>
        //   12   32:invokevirtual   #64  <Method void TextView.setText(CharSequence)>
        //   13   35:return          
        // catch Exception
        //   14   36:astore          6
        //   15   38:ldc1            #66  <String "MainActivity">
        //   16   40:new             #49  <Class StringBuilder>
        //   17   43:dup             
        //   18   44:ldc1            #68  <String "in editText TextWatcher: ">
        //   19   46:invokespecial   #71  <Method void StringBuilder(String)>
        //   20   49:aload           6
        //   21   51:invokevirtual   #72  <Method String Exception.toString()>
        //   22   54:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
        //   23   57:invokevirtual   #58  <Method String StringBuilder.toString()>
        //   24   60:invokestatic    #81  <Method int Log.e(String, String)>
        //   25   63:pop             
        //   26   64:aload           6
        //   27   66:invokevirtual   #84  <Method void Exception.printStackTrace()>
        //   28   69:return          
        }

        final MainActivity this$0;
        private final TextView val$charsCountTV;
    }


    // Unreferenced inner class codeadore/textgram/MainActivity$6

/* anonymous class */
    class _cls6
        implements Runnable
    {

        _cls6()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field MainActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        static MainActivity access$0(_cls6 _pcls6)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field MainActivity this$0>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #17  <Field MainActivity this$0>
        //    5    4:areturn         
        }

        public void run()
        {
        // try 0 7 handler(s) 26
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field MainActivity this$0>
        //    2    4:invokestatic    #31  <Method void Utilities.updateLists(android.content.Context)>
        //    3    7:new             #33  <Class Thread>
        //    4   10:dup             
        //    5   11:new             #35  <Class MainActivity$6$1>
        //    6   14:dup             
        //    7   15:aload_0         
        //    8   16:invokespecial   #38  <Method void MainActivity$6$1(MainActivity$6)>
        //    9   19:invokespecial   #41  <Method void Thread(Runnable)>
        //   10   22:invokevirtual   #44  <Method void Thread.start()>
        //   11   25:return          
        // catch IOException
        //   12   26:astore_1        
        //   13   27:aload_0         
        //   14   28:getfield        #17  <Field MainActivity this$0>
        //   15   31:getfield        #48  <Field String MainActivity.TAG>
        //   16   34:ldc1            #50  <String "in calling Utilities.updateLists()">
        //   17   36:invokestatic    #56  <Method int Log.e(String, String)>
        //   18   39:pop             
        //   19   40:aload_1         
        //   20   41:invokevirtual   #59  <Method void IOException.printStackTrace()>
        //   21   44:goto            7
        }

        final MainActivity this$0;

            static MainActivity access$0(_cls6 _pcls6)
            {
            //    0    0:aload_0         
            //    1    1:getfield        #17  <Field MainActivity this$0>
            //    2    4:areturn         
            }
    }


    // Unreferenced inner class codeadore/textgram/MainActivity$6$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field MainActivity$6 this$1>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        static _cls6 access$0(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field MainActivity$6 this$1>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #17  <Field MainActivity$6 this$1>
        //    5    4:areturn         
        }

        public void run()
        {
        // try 0 55 handler(s) 214
        //    0    0:new             #27  <Class StringBuilder>
        //    1    3:dup             
        //    2    4:ldc1            #29  <String "http://www.codeadore.net/secure/tg_settings/settings_json.php?build=">
        //    3    6:invokespecial   #32  <Method void StringBuilder(String)>
        //    4    9:getstatic       #38  <Field String Settings.buildFor>
        //    5   12:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
        //    6   15:invokevirtual   #46  <Method String StringBuilder.toString()>
        //    7   18:invokestatic    #52  <Method String el7rUtilities.geHTTPtContents(String)>
        //    8   21:astore_2        
        //    9   22:aload_0         
        //   10   23:getfield        #17  <Field MainActivity$6 this$1>
        //   11   26:invokestatic    #55  <Method MainActivity MainActivity$6.access$0(MainActivity$6)>
        //   12   29:getfield        #61  <Field SharedPreferences MainActivity.settings>
        //   13   32:invokeinterface #67  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
        //   14   37:astore_3        
        //   15   38:aload_3         
        //   16   39:ldc1            #69  <String "settingsJSON">
        //   17   41:aload_2         
        //   18   42:invokeinterface #75  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
        //   19   47:pop             
        //   20   48:aload_3         
        //   21   49:invokeinterface #79  <Method boolean android.content.SharedPreferences$Editor.commit()>
        //   22   54:pop             
        // try 55 106 handler(s) 206 214
        //   23   55:new             #81  <Class JSONObject>
        //   24   58:dup             
        //   25   59:aload_2         
        //   26   60:invokespecial   #82  <Method void JSONObject(String)>
        //   27   63:putstatic       #86  <Field JSONObject Settings.json>
        //   28   66:getstatic       #86  <Field JSONObject Settings.json>
        //   29   69:ldc1            #88  <String "message_id">
        //   30   71:invokevirtual   #92  <Method int JSONObject.getInt(String)>
        //   31   74:istore          7
        //   32   76:getstatic       #86  <Field JSONObject Settings.json>
        //   33   79:ldc1            #94  <String "message_html">
        //   34   81:invokevirtual   #97  <Method String JSONObject.getString(String)>
        //   35   84:astore          8
        //   36   86:aload_0         
        //   37   87:getfield        #17  <Field MainActivity$6 this$1>
        //   38   90:invokestatic    #55  <Method MainActivity MainActivity$6.access$0(MainActivity$6)>
        //   39   93:getfield        #61  <Field SharedPreferences MainActivity.settings>
        //   40   96:ldc1            #99  <String "lastReadMessage">
        //   41   98:iconst_0        
        //   42   99:invokeinterface #102 <Method int SharedPreferences.getInt(String, int)>
        //   43  104:istore          9
        //   44  106:iload           7
        //   45  108:ifeq            219
        // try 111 117 handler(s) 206 214
        //   46  111:iconst_0        
        //   47  112:invokestatic    #108 <Method Boolean Boolean.valueOf(boolean)>
        //   48  115:astore          10
        //   49  117:iload           9
        //   50  119:ifne            179
        // try 122 139 handler(s) 206 214
        //   51  122:aload_3         
        //   52  123:ldc1            #99  <String "lastReadMessage">
        //   53  125:iload           7
        //   54  127:invokeinterface #112 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
        //   55  132:pop             
        //   56  133:iconst_1        
        //   57  134:invokestatic    #108 <Method Boolean Boolean.valueOf(boolean)>
        //   58  137:astore          10
        // try 139 178 handler(s) 206 214
        //   59  139:aload_3         
        //   60  140:invokeinterface #79  <Method boolean android.content.SharedPreferences$Editor.commit()>
        //   61  145:pop             
        //   62  146:aload           10
        //   63  148:invokevirtual   #115 <Method boolean Boolean.booleanValue()>
        //   64  151:ifeq            219
        //   65  154:aload_0         
        //   66  155:getfield        #17  <Field MainActivity$6 this$1>
        //   67  158:invokestatic    #55  <Method MainActivity MainActivity$6.access$0(MainActivity$6)>
        //   68  161:getfield        #119 <Field Handler MainActivity.handler>
        //   69  164:new             #121 <Class MainActivity$6$1$1>
        //   70  167:dup             
        //   71  168:aload_0         
        //   72  169:aload           8
        //   73  171:invokespecial   #124 <Method void MainActivity$6$1$1(MainActivity$6$1, String)>
        //   74  174:invokevirtual   #130 <Method boolean Handler.post(Runnable)>
        //   75  177:pop             
        //   76  178:return          
        //   77  179:iload           9
        //   78  181:iload           7
        //   79  183:icmpge          139
        // try 186 203 handler(s) 206 214
        //   80  186:iconst_1        
        //   81  187:invokestatic    #108 <Method Boolean Boolean.valueOf(boolean)>
        //   82  190:astore          10
        //   83  192:aload_3         
        //   84  193:ldc1            #99  <String "lastReadMessage">
        //   85  195:iload           7
        //   86  197:invokeinterface #112 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
        //   87  202:pop             
        //   88  203:goto            139
        // catch JSONException JSONException JSONException JSONException JSONException
        //   89  206:astore          6
        // try 208 213 handler(s) 214
        //   90  208:aload           6
        //   91  210:invokevirtual   #133 <Method void JSONException.printStackTrace()>
        //   92  213:return          
        // catch IOException IOException IOException IOException IOException IOException IOException
        //   93  214:astore_1        
        //   94  215:aload_1         
        //   95  216:invokevirtual   #134 <Method void IOException.printStackTrace()>
        //   96  219:return          
        }

        final _cls6 this$1;

            static _cls6 access$0(_cls1 _pcls1)
            {
            //    0    0:aload_0         
            //    1    1:getfield        #17  <Field MainActivity$6 this$1>
            //    2    4:areturn         
            }
    }


    // Unreferenced inner class codeadore/textgram/MainActivity$6$1$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field MainActivity$6$1 this$2>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #21  <Field String val$message_html>
        //    6   10:aload_0         
        //    7   11:invokespecial   #23  <Method void Object()>
        //    8   14:return          
        }

        public void run()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field MainActivity$6$1 this$2>
        //    2    4:invokestatic    #27  <Method MainActivity$6 MainActivity$6$1.access$0(MainActivity$6$1)>
        //    3    7:invokestatic    #32  <Method MainActivity MainActivity$6.access$0(MainActivity$6)>
        //    4   10:aload_0         
        //    5   11:getfield        #21  <Field String val$message_html>
        //    6   14:invokestatic    #38  <Method void el7rUtilities.viewHTMLMessage(android.content.Context, String)>
        //    7   17:return          
        }

        final _cls1 this$2;
        private final String val$message_html;
    }


    // Unreferenced inner class codeadore/textgram/MainActivity$7

/* anonymous class */
    class _cls7
        implements android.view.View.OnClickListener
    {

        _cls7()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field MainActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:getstatic       #27  <Field EditText MainActivity.editText>
        //    1    3:invokevirtual   #33  <Method int EditText.length()>
        //    2    6:ifle            55
        // try 9 55 handler(s) 56
        //    3    9:getstatic       #27  <Field EditText MainActivity.editText>
        //    4   12:invokevirtual   #36  <Method int EditText.getSelectionStart()>
        //    5   15:istore_3        
        //    6   16:getstatic       #27  <Field EditText MainActivity.editText>
        //    7   19:invokevirtual   #39  <Method int EditText.getSelectionEnd()>
        //    8   22:istore          4
        //    9   24:getstatic       #27  <Field EditText MainActivity.editText>
        //   10   27:getstatic       #27  <Field EditText MainActivity.editText>
        //   11   30:invokevirtual   #43  <Method Editable EditText.getText()>
        //   12   33:iload_3         
        //   13   34:iconst_1        
        //   14   35:isub            
        //   15   36:iload           4
        //   16   38:invokeinterface #49  <Method Editable Editable.delete(int, int)>
        //   17   43:invokevirtual   #53  <Method void EditText.setText(CharSequence)>
        //   18   46:getstatic       #27  <Field EditText MainActivity.editText>
        //   19   49:iload_3         
        //   20   50:iconst_1        
        //   21   51:isub            
        //   22   52:invokevirtual   #57  <Method void EditText.setSelection(int)>
        //   23   55:return          
        // catch Exception
        //   24   56:astore_2        
        //   25   57:aload_2         
        //   26   58:invokevirtual   #60  <Method void Exception.printStackTrace()>
        //   27   61:return          
        }

        final MainActivity this$0;
    }

}
