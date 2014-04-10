// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram;

import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinAdView;
import com.applovin.sdk.*;
import com.google.ads.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package codeadore.textgram:
//            Settings

public class AdUtilities
{

    public AdUtilities()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static void installAd(Activity activity, View view)
    {
    //    0    0:aload_0         
    //    1    1:ldc1            #16  <String "TextgramSettings">
    //    2    3:iconst_0        
    //    3    4:invokevirtual   #22  <Method SharedPreferences Activity.getSharedPreferences(String, int)>
    //    4    7:astore_2        
    //    5    8:getstatic       #28  <Field JSONObject Settings.json>
    //    6   11:ifnull          36
    //    7   14:getstatic       #28  <Field JSONObject Settings.json>
    //    8   17:ldc1            #30  <String "admob_pubid">
    //    9   19:invokevirtual   #36  <Method boolean JSONObject.has(String)>
    //   10   22:ifeq            36
    // try 25 36 handler(s) 137
    //   11   25:getstatic       #28  <Field JSONObject Settings.json>
    //   12   28:ldc1            #30  <String "admob_pubid">
    //   13   30:invokevirtual   #40  <Method String JSONObject.getString(String)>
    //   14   33:putstatic       #44  <Field String Settings.adMobPublisherID>
    //   15   36:getstatic       #48  <Field boolean Settings.isPro>
    //   16   39:ifne            136
    //   17   42:aload_2         
    //   18   43:ldc1            #50  <String "removeAds">
    //   19   45:iconst_0        
    //   20   46:invokeinterface #56  <Method boolean SharedPreferences.getBoolean(String, boolean)>
    //   21   51:ifne            136
    //   22   54:ldc1            #58  <String "admob">
    //   23   56:astore_3        
    //   24   57:ldc1            #58  <String "admob">
    //   25   59:astore          4
    //   26   61:getstatic       #61  <Field boolean Settings.testMode>
    //   27   64:ifne            99
    // try 67 77 handler(s) 147
    //   28   67:getstatic       #28  <Field JSONObject Settings.json>
    //   29   70:ldc1            #63  <String "adnetwork">
    //   30   72:invokevirtual   #40  <Method String JSONObject.getString(String)>
    //   31   75:astore          14
    //   32   77:aload           14
    //   33   79:astore          4
    //   34   81:aload           4
    //   35   83:ifnull          99
    //   36   86:aload           4
    //   37   88:ldc1            #65  <String "applovin">
    //   38   90:invokevirtual   #71  <Method boolean String.contains(CharSequence)>
    //   39   93:ifeq            155
    //   40   96:ldc1            #65  <String "applovin">
    //   41   98:astore_3        
    //   42   99:aload_3         
    //   43  100:ldc1            #65  <String "applovin">
    //   44  102:if_acmpne       187
    //   45  105:new             #73  <Class AppLovinAdView>
    //   46  108:dup             
    //   47  109:aload_0         
    //   48  110:invokestatic    #79  <Method AppLovinSdk AppLovinSdk.getInstance(android.content.Context)>
    //   49  113:getstatic       #85  <Field AppLovinAdSize AppLovinAdSize.BANNER>
    //   50  116:aload_0         
    //   51  117:invokespecial   #88  <Method void AppLovinAdView(AppLovinSdk, AppLovinAdSize, Activity)>
    //   52  120:astore          5
    //   53  122:aload           5
    //   54  124:invokevirtual   #91  <Method void AppLovinAdView.loadNextAd()>
    //   55  127:aload_1         
    //   56  128:checkcast       #93  <Class ViewGroup>
    //   57  131:aload           5
    //   58  133:invokevirtual   #97  <Method void ViewGroup.addView(View)>
    //   59  136:return          
    // catch JSONException
    //   60  137:astore          15
    //   61  139:aload           15
    //   62  141:invokevirtual   #100 <Method void JSONException.printStackTrace()>
    //   63  144:goto            36
    // catch Exception
    //   64  147:astore          13
    //   65  149:ldc1            #58  <String "admob">
    //   66  151:astore_3        
    //   67  152:goto            81
    //   68  155:aload           4
    //   69  157:ldc1            #102 <String "amazon">
    //   70  159:invokevirtual   #71  <Method boolean String.contains(CharSequence)>
    //   71  162:ifeq            171
    //   72  165:ldc1            #102 <String "amazon">
    //   73  167:astore_3        
    //   74  168:goto            99
    //   75  171:aload           4
    //   76  173:ldc1            #104 <String "inneractive">
    //   77  175:invokevirtual   #71  <Method boolean String.contains(CharSequence)>
    //   78  178:ifeq            99
    //   79  181:ldc1            #104 <String "inneractive">
    //   80  183:astore_3        
    //   81  184:goto            99
    //   82  187:new             #106 <Class AdView>
    //   83  190:dup             
    //   84  191:aload_0         
    //   85  192:getstatic       #111 <Field AdSize AdSize.BANNER>
    //   86  195:getstatic       #44  <Field String Settings.adMobPublisherID>
    //   87  198:invokespecial   #114 <Method void AdView(Activity, AdSize, String)>
    //   88  201:astore          6
    //   89  203:aload_1         
    //   90  204:checkcast       #93  <Class ViewGroup>
    //   91  207:aload           6
    //   92  209:invokevirtual   #97  <Method void ViewGroup.addView(View)>
    //   93  212:new             #116 <Class AdRequest>
    //   94  215:dup             
    //   95  216:invokespecial   #117 <Method void AdRequest()>
    //   96  219:astore          7
    //   97  221:aload           7
    //   98  223:ldc1            #119 <String "96E0379DF6F0F2412609EF9879C6B671">
    //   99  225:invokevirtual   #123 <Method AdRequest AdRequest.addTestDevice(String)>
    //  100  228:pop             
    //  101  229:aload           7
    //  102  231:ldc1            #125 <String "5509BFD73B9F82D5DCD46DDD1549872D">
    //  103  233:invokevirtual   #123 <Method AdRequest AdRequest.addTestDevice(String)>
    //  104  236:pop             
    //  105  237:aload           7
    //  106  239:ldc1            #127 <String "CA9056BF5C4D79876E3018245D86F5AA">
    //  107  241:invokevirtual   #123 <Method AdRequest AdRequest.addTestDevice(String)>
    //  108  244:pop             
    //  109  245:aload           7
    //  110  247:ldc1            #129 <String "A63F5506A7260E9B2E76E7B3C9202D12">
    //  111  249:invokevirtual   #123 <Method AdRequest AdRequest.addTestDevice(String)>
    //  112  252:pop             
    //  113  253:aload           7
    //  114  255:ldc1            #131 <String "4CA82EE5AD460911D5BFC8A380AA64D0">
    //  115  257:invokevirtual   #123 <Method AdRequest AdRequest.addTestDevice(String)>
    //  116  260:pop             
    //  117  261:aload           6
    //  118  263:aload           7
    //  119  265:invokevirtual   #135 <Method void AdView.loadAd(AdRequest)>
    //  120  268:return          
    }

    public static void installFullScreenAd(Activity activity, View view)
    {
    //    0    0:getstatic       #48  <Field boolean Settings.isPro>
    //    1    3:ifne            104
    //    2    6:ldc1            #58  <String "admob">
    //    3    8:astore_2        
    //    4    9:ldc1            #58  <String "admob">
    //    5   11:astore_3        
    // try 12 22 handler(s) 105
    //    6   12:getstatic       #28  <Field JSONObject Settings.json>
    //    7   15:ldc1            #138 <String "interstitials">
    //    8   17:invokevirtual   #40  <Method String JSONObject.getString(String)>
    //    9   20:astore          6
    //   10   22:aload           6
    //   11   24:astore_3        
    //   12   25:aload_3         
    //   13   26:ifnull          41
    //   14   29:aload_3         
    //   15   30:ldc1            #65  <String "applovin">
    //   16   32:invokevirtual   #71  <Method boolean String.contains(CharSequence)>
    //   17   35:ifeq            113
    //   18   38:ldc1            #65  <String "applovin">
    //   19   40:astore_2        
    //   20   41:aload_2         
    //   21   42:ldc1            #65  <String "applovin">
    //   22   44:if_acmpne       104
    //   23   47:new             #73  <Class AppLovinAdView>
    //   24   50:dup             
    //   25   51:aload_0         
    //   26   52:invokestatic    #79  <Method AppLovinSdk AppLovinSdk.getInstance(android.content.Context)>
    //   27   55:getstatic       #141 <Field AppLovinAdSize AppLovinAdSize.INTERSTITIAL>
    //   28   58:aload_0         
    //   29   59:invokespecial   #88  <Method void AppLovinAdView(AppLovinSdk, AppLovinAdSize, Activity)>
    //   30   62:astore          5
    //   31   64:aload           5
    //   32   66:invokevirtual   #91  <Method void AppLovinAdView.loadNextAd()>
    //   33   69:aload           5
    //   34   71:new             #143 <Class AdUtilities$1>
    //   35   74:dup             
    //   36   75:aload_1         
    //   37   76:invokespecial   #145 <Method void AdUtilities$1(View)>
    //   38   79:invokevirtual   #149 <Method void AppLovinAdView.setAdLoadListener(AppLovinAdLoadListener)>
    //   39   82:aload           5
    //   40   84:new             #151 <Class AdUtilities$2>
    //   41   87:dup             
    //   42   88:aload_1         
    //   43   89:invokespecial   #152 <Method void AdUtilities$2(View)>
    //   44   92:invokevirtual   #156 <Method void AppLovinAdView.setAdClickListener(AppLovinAdClickListener)>
    //   45   95:aload_1         
    //   46   96:checkcast       #93  <Class ViewGroup>
    //   47   99:aload           5
    //   48  101:invokevirtual   #97  <Method void ViewGroup.addView(View)>
    //   49  104:return          
    // catch JSONException
    //   50  105:astore          4
    //   51  107:ldc1            #58  <String "admob">
    //   52  109:astore_2        
    //   53  110:goto            25
    //   54  113:aload_3         
    //   55  114:ldc1            #102 <String "amazon">
    //   56  116:invokevirtual   #71  <Method boolean String.contains(CharSequence)>
    //   57  119:ifeq            128
    //   58  122:ldc1            #102 <String "amazon">
    //   59  124:astore_2        
    //   60  125:goto            41
    //   61  128:aload_3         
    //   62  129:ldc1            #104 <String "inneractive">
    //   63  131:invokevirtual   #71  <Method boolean String.contains(CharSequence)>
    //   64  134:ifeq            41
    //   65  137:ldc1            #104 <String "inneractive">
    //   66  139:astore_2        
    //   67  140:goto            41
    }

    // Unreferenced inner class codeadore/textgram/AdUtilities$1

/* anonymous class */
    class _cls1
        implements AppLovinAdLoadListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field View val$view>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void adReceived(AppLovinAd applovinad)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field View val$view>
        //    2    4:iconst_0        
        //    3    5:invokevirtual   #28  <Method void View.setVisibility(int)>
        //    4    8:return          
        }

        public void failedToReceiveAd(int i)
        {
        //    0    0:return          
        }

        private final View val$view;
    }


    // Unreferenced inner class codeadore/textgram/AdUtilities$2

/* anonymous class */
    class _cls2
        implements AppLovinAdClickListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field View val$view>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void adClicked(AppLovinAd applovinad)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field View val$view>
        //    2    4:bipush          8
        //    3    6:invokevirtual   #28  <Method void View.setVisibility(int)>
        //    4    9:return          
        }

        private final View val$view;
    }

}
