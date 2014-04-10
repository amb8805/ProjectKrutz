// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.*;
import codeadore.textgram.adapters.StorePagerAdapter;
import codeadore.textgram.custom_widgets.NoScrollViewPager;
import codeadore.textgram.custom_widgets.el7rTabPageIndicator;
import com.google.android.apps.analytics.GoogleAnalyticsTracker;

// Referenced classes of package codeadore.textgram:
//            el7rFragmentActivity, MainActivity, Utilities, StylingActivity, 
//            StoreItemActivity

public class StoreActivity extends el7rFragmentActivity
{

    static 
    {
    //    0    0:ldc1            #22  <String "StoreActivity">
    //    1    2:putstatic       #24  <Field String TAG>
    //    2    5:return          
    }

    public StoreActivity()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #27  <Method void el7rFragmentActivity()>
    //    2    4:return          
    }

    public static void reset()
    {
    // try 0 72 handler(s) 104
    //    0    0:iconst_1        
    //    1    1:invokestatic    #36  <Method Boolean Boolean.valueOf(boolean)>
    //    2    4:putstatic       #42  <Field Boolean StorePagerAdapter.destoryOn>
    //    3    7:getstatic       #44  <Field NoScrollViewPager viewPager>
    //    4   10:invokevirtual   #50  <Method int NoScrollViewPager.getCurrentItem()>
    //    5   13:istore_2        
    //    6   14:new             #38  <Class StorePagerAdapter>
    //    7   17:dup             
    //    8   18:getstatic       #52  <Field FragmentManager fragmentManager>
    //    9   21:invokespecial   #55  <Method void StorePagerAdapter(FragmentManager)>
    //   10   24:putstatic       #57  <Field StorePagerAdapter adapter>
    //   11   27:getstatic       #44  <Field NoScrollViewPager viewPager>
    //   12   30:getstatic       #57  <Field StorePagerAdapter adapter>
    //   13   33:invokevirtual   #61  <Method void NoScrollViewPager.setAdapter(android.support.v4.view.PagerAdapter)>
    //   14   36:getstatic       #63  <Field el7rTabPageIndicator titleIndicator>
    //   15   39:getstatic       #44  <Field NoScrollViewPager viewPager>
    //   16   42:invokevirtual   #69  <Method void el7rTabPageIndicator.setViewPager(android.support.v4.view.ViewPager)>
    //   17   45:getstatic       #44  <Field NoScrollViewPager viewPager>
    //   18   48:iload_2         
    //   19   49:invokevirtual   #73  <Method void NoScrollViewPager.setCurrentItem(int)>
    //   20   52:getstatic       #63  <Field el7rTabPageIndicator titleIndicator>
    //   21   55:iload_2         
    //   22   56:invokevirtual   #74  <Method void el7rTabPageIndicator.setCurrentItem(int)>
    //   23   59:iconst_0        
    //   24   60:invokestatic    #36  <Method Boolean Boolean.valueOf(boolean)>
    //   25   63:putstatic       #42  <Field Boolean StorePagerAdapter.destoryOn>
    //   26   66:getstatic       #78  <Field Activity MainActivity.c>
    //   27   69:invokestatic    #84  <Method void Utilities.updateLists(android.content.Context)>
    // try 72 75 handler(s) 76
    //   28   72:invokestatic    #89  <Method void StylingActivity.resetItems()>
    //   29   75:return          
    // catch Exception
    //   30   76:astore_3        
    // try 77 103 handler(s) 104
    //   31   77:getstatic       #24  <Field String TAG>
    //   32   80:new             #91  <Class StringBuilder>
    //   33   83:dup             
    //   34   84:ldc1            #93  <String "in StoreActivity.reset -> StylingActivity.resetItems() call, : ">
    //   35   86:invokespecial   #96  <Method void StringBuilder(String)>
    //   36   89:aload_3         
    //   37   90:invokevirtual   #100 <Method String Exception.toString()>
    //   38   93:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
    //   39   96:invokevirtual   #105 <Method String StringBuilder.toString()>
    //   40   99:invokestatic    #111 <Method int Log.e(String, String)>
    //   41  102:pop             
    //   42  103:return          
    // catch Exception Exception
    //   43  104:astore_0        
    //   44  105:getstatic       #24  <Field String TAG>
    //   45  108:new             #91  <Class StringBuilder>
    //   46  111:dup             
    //   47  112:ldc1            #113 <String "in StoreActivity.reload(): ">
    //   48  114:invokespecial   #96  <Method void StringBuilder(String)>
    //   49  117:aload_0         
    //   50  118:invokevirtual   #100 <Method String Exception.toString()>
    //   51  121:invokevirtual   #104 <Method StringBuilder StringBuilder.append(String)>
    //   52  124:invokevirtual   #105 <Method String StringBuilder.toString()>
    //   53  127:invokestatic    #111 <Method int Log.e(String, String)>
    //   54  130:pop             
    //   55  131:return          
    }

    public static void viewItem(String s)
    {
    //    0    0:new             #116 <Class Intent>
    //    1    3:dup             
    //    2    4:getstatic       #117 <Field Activity c>
    //    3    7:ldc1            #119 <Class StoreItemActivity>
    //    4    9:invokespecial   #122 <Method void Intent(android.content.Context, Class)>
    //    5   12:astore_1        
    //    6   13:aload_1         
    //    7   14:ldc1            #124 <String "unique_id">
    //    8   16:aload_0         
    //    9   17:invokevirtual   #128 <Method Intent Intent.putExtra(String, String)>
    //   10   20:pop             
    //   11   21:getstatic       #117 <Field Activity c>
    //   12   24:aload_1         
    //   13   25:invokevirtual   #134 <Method void Activity.startActivity(Intent)>
    //   14   28:return          
    }

    public void onBackPressed()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #137 <Method void el7rFragmentActivity.onBackPressed()>
    //    2    4:aload_0         
    //    3    5:ldc1            #138 <Int 0x7f04000d>
    //    4    7:ldc1            #139 <Int 0x7f040007>
    //    5    9:invokevirtual   #143 <Method void overridePendingTransition(int, int)>
    //    6   12:return          
    }

    protected void onCreate(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #147 <Method void el7rFragmentActivity.onCreate(Bundle)>
    //    3    5:aload_0         
    //    4    6:ldc1            #148 <Int 0x7f04000c>
    //    5    8:ldc1            #149 <Int 0x7f040006>
    //    6   10:invokevirtual   #143 <Method void overridePendingTransition(int, int)>
    //    7   13:aload_0         
    //    8   14:ldc1            #150 <Int 0x7f030021>
    //    9   16:invokevirtual   #153 <Method void setContentView(int)>
    //   10   19:aload_0         
    //   11   20:invokevirtual   #157 <Method ActionBar getSupportActionBar()>
    //   12   23:iconst_1        
    //   13   24:invokevirtual   #163 <Method void ActionBar.setDisplayHomeAsUpEnabled(boolean)>
    //   14   27:aload_0         
    //   15   28:aload_0         
    //   16   29:ldc1            #164 <Int 0x7f0b003f>
    //   17   31:invokevirtual   #168 <Method String getString(int)>
    //   18   34:invokevirtual   #171 <Method void setTitle(String)>
    //   19   37:aload_0         
    //   20   38:getfield        #175 <Field GoogleAnalyticsTracker tracker>
    //   21   41:ldc1            #177 <String "/StoreActivity">
    //   22   43:invokevirtual   #182 <Method void GoogleAnalyticsTracker.trackPageView(String)>
    //   23   46:new             #184 <Class Handler>
    //   24   49:dup             
    //   25   50:invokespecial   #185 <Method void Handler()>
    //   26   53:putstatic       #187 <Field Handler UIHandler>
    //   27   56:aload_0         
    //   28   57:putstatic       #117 <Field Activity c>
    //   29   60:aload_0         
    //   30   61:ldc1            #188 <Int 0x7f06006f>
    //   31   63:invokevirtual   #192 <Method android.view.View findViewById(int)>
    //   32   66:checkcast       #46  <Class NoScrollViewPager>
    //   33   69:astore_2        
    //   34   70:aload_2         
    //   35   71:putstatic       #44  <Field NoScrollViewPager viewPager>
    //   36   74:getstatic       #198 <Field int android.os.Build$VERSION.SDK_INT>
    //   37   77:bipush          14
    //   38   79:icmplt          155
    //   39   82:new             #200 <Class DisplayMetrics>
    //   40   85:dup             
    //   41   86:invokespecial   #201 <Method void DisplayMetrics()>
    //   42   89:astore_3        
    //   43   90:aload_0         
    //   44   91:invokevirtual   #205 <Method WindowManager getWindowManager()>
    //   45   94:invokeinterface #211 <Method Display WindowManager.getDefaultDisplay()>
    //   46   99:aload_3         
    //   47  100:invokevirtual   #217 <Method void Display.getMetrics(DisplayMetrics)>
    //   48  103:aload_3         
    //   49  104:getfield        #220 <Field int DisplayMetrics.widthPixels>
    //   50  107:i2f             
    //   51  108:aload_3         
    //   52  109:getfield        #224 <Field float DisplayMetrics.xdpi>
    //   53  112:fdiv            
    //   54  113:f2d             
    //   55  114:ldc2w           #225 <Double 2D>
    //   56  117:invokestatic    #232 <Method double Math.pow(double, double)>
    //   57  120:aload_3         
    //   58  121:getfield        #235 <Field int DisplayMetrics.heightPixels>
    //   59  124:i2f             
    //   60  125:aload_3         
    //   61  126:getfield        #238 <Field float DisplayMetrics.ydpi>
    //   62  129:fdiv            
    //   63  130:f2d             
    //   64  131:ldc2w           #225 <Double 2D>
    //   65  134:invokestatic    #232 <Method double Math.pow(double, double)>
    //   66  137:dadd            
    //   67  138:invokestatic    #242 <Method double Math.sqrt(double)>
    //   68  141:ldc2w           #243 <Double 4.5D>
    //   69  144:dcmpl           
    //   70  145:ifle            155
    //   71  148:getstatic       #44  <Field NoScrollViewPager viewPager>
    //   72  151:iconst_1        
    //   73  152:invokevirtual   #247 <Method void NoScrollViewPager.setEnable3D(boolean)>
    //   74  155:aload_2         
    //   75  156:invokevirtual   #250 <Method void NoScrollViewPager.enableScroll()>
    //   76  159:aload_0         
    //   77  160:invokevirtual   #254 <Method FragmentManager getSupportFragmentManager()>
    //   78  163:putstatic       #52  <Field FragmentManager fragmentManager>
    //   79  166:new             #38  <Class StorePagerAdapter>
    //   80  169:dup             
    //   81  170:aload_0         
    //   82  171:invokevirtual   #254 <Method FragmentManager getSupportFragmentManager()>
    //   83  174:invokespecial   #55  <Method void StorePagerAdapter(FragmentManager)>
    //   84  177:putstatic       #57  <Field StorePagerAdapter adapter>
    //   85  180:aload_2         
    //   86  181:getstatic       #57  <Field StorePagerAdapter adapter>
    //   87  184:invokevirtual   #61  <Method void NoScrollViewPager.setAdapter(android.support.v4.view.PagerAdapter)>
    //   88  187:bipush          7
    //   89  189:anewarray       String[]
    //   90  192:astore          4
    //   91  194:aload           4
    //   92  196:iconst_0        
    //   93  197:aload_0         
    //   94  198:ldc2            #257 <Int 0x7f0b003c>
    //   95  201:invokevirtual   #168 <Method String getString(int)>
    //   96  204:aastore         
    //   97  205:aload           4
    //   98  207:iconst_1        
    //   99  208:aload_0         
    //  100  209:ldc2            #258 <Int 0x7f0b0018>
    //  101  212:invokevirtual   #168 <Method String getString(int)>
    //  102  215:aastore         
    //  103  216:aload           4
    //  104  218:iconst_2        
    //  105  219:aload_0         
    //  106  220:ldc2            #259 <Int 0x7f0b0019>
    //  107  223:invokevirtual   #168 <Method String getString(int)>
    //  108  226:aastore         
    //  109  227:aload           4
    //  110  229:iconst_3        
    //  111  230:aload_0         
    //  112  231:ldc2            #260 <Int 0x7f0b001b>
    //  113  234:invokevirtual   #168 <Method String getString(int)>
    //  114  237:aastore         
    //  115  238:aload           4
    //  116  240:iconst_4        
    //  117  241:aload_0         
    //  118  242:ldc2            #261 <Int 0x7f0b001a>
    //  119  245:invokevirtual   #168 <Method String getString(int)>
    //  120  248:aastore         
    //  121  249:aload           4
    //  122  251:iconst_5        
    //  123  252:aload_0         
    //  124  253:ldc2            #262 <Int 0x7f0b001d>
    //  125  256:invokevirtual   #168 <Method String getString(int)>
    //  126  259:aastore         
    //  127  260:aload           4
    //  128  262:bipush          6
    //  129  264:aload_0         
    //  130  265:ldc2            #263 <Int 0x7f0b001e>
    //  131  268:invokevirtual   #168 <Method String getString(int)>
    //  132  271:aastore         
    //  133  272:aload           4
    //  134  274:putstatic       #267 <Field String[] StorePagerAdapter.titles_strings>
    //  135  277:aload_0         
    //  136  278:ldc2            #268 <Int 0x7f06006e>
    //  137  281:invokevirtual   #192 <Method android.view.View findViewById(int)>
    //  138  284:checkcast       #65  <Class el7rTabPageIndicator>
    //  139  287:putstatic       #63  <Field el7rTabPageIndicator titleIndicator>
    //  140  290:getstatic       #63  <Field el7rTabPageIndicator titleIndicator>
    //  141  293:aload_2         
    //  142  294:invokevirtual   #69  <Method void el7rTabPageIndicator.setViewPager(android.support.v4.view.ViewPager)>
    //  143  297:return          
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #274 <Method MenuInflater getMenuInflater()>
    //    2    4:ldc2            #275 <Int 0x7f0d0000>
    //    3    7:aload_1         
    //    4    8:invokevirtual   #281 <Method void MenuInflater.inflate(int, Menu)>
    //    5   11:aload_1         
    //    6   12:ldc2            #282 <Int 0x7f0600e2>
    //    7   15:invokeinterface #288 <Method MenuItem Menu.findItem(int)>
    //    8   20:iconst_0        
    //    9   21:invokeinterface #294 <Method MenuItem MenuItem.setVisible(boolean)>
    //   10   26:pop             
    //   11   27:iconst_1        
    //   12   28:ireturn         
    }

    static String TAG;
    public static Handler UIHandler;
    static StorePagerAdapter adapter;
    public static Activity c;
    static FragmentManager fragmentManager;
    static el7rTabPageIndicator titleIndicator;
    public static NoScrollViewPager viewPager;
}
