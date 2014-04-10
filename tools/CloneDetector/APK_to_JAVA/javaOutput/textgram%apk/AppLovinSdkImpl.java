// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.impl.sdk;

import android.content.Context;
import android.util.Log;
import com.applovin.sdk.*;

// Referenced classes of package com.applovin.impl.sdk:
//            ac, ao, ap, ae, 
//            g, s, k, bh, 
//            b, AppLovinEventServiceImpl, i, x, 
//            z, ab

public class AppLovinSdkImpl extends AppLovinSdk
{

    public AppLovinSdkImpl()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #46  <Method void AppLovinSdk()>
    //    2    4:aload_0         
    //    3    5:iconst_1        
    //    4    6:putfield        #48  <Field boolean n>
    //    5    9:aload_0         
    //    6   10:iconst_0        
    //    7   11:putfield        #50  <Field boolean o>
    //    8   14:aload_0         
    //    9   15:iconst_0        
    //   10   16:putfield        #52  <Field boolean p>
    //   11   19:aload_0         
    //   12   20:iconst_0        
    //   13   21:putfield        #54  <Field boolean q>
    //   14   24:aload_0         
    //   15   25:iconst_0        
    //   16   26:putfield        #56  <Field boolean r>
    //   17   29:return          
    }

    private static boolean g()
    {
    //    0    0:getstatic       #62  <Field String android.os.Build$VERSION.RELEASE>
    //    1    3:ldc1            #64  <String "1.">
    //    2    5:invokevirtual   #70  <Method boolean String.startsWith(String)>
    //    3    8:ifne            33
    //    4   11:getstatic       #62  <Field String android.os.Build$VERSION.RELEASE>
    //    5   14:ldc1            #72  <String "2.0">
    //    6   16:invokevirtual   #70  <Method boolean String.startsWith(String)>
    //    7   19:ifne            33
    //    8   22:getstatic       #62  <Field String android.os.Build$VERSION.RELEASE>
    //    9   25:ldc1            #74  <String "2.1">
    //   10   27:invokevirtual   #70  <Method boolean String.startsWith(String)>
    //   11   30:ifeq            35
    //   12   33:iconst_0        
    //   13   34:ireturn         
    //   14   35:iconst_1        
    //   15   36:ireturn         
    }

    ap a()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #77  <Field ap f>
    //    2    4:areturn         
    }

    Object a(ab ab)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #80  <Field ac g>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #84  <Method Object ac.a(ab)>
    //    4    8:areturn         
    }

    void a(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:putfield        #48  <Field boolean n>
    //    3    5:aload_0         
    //    4    6:iload_1         
    //    5    7:putfield        #50  <Field boolean o>
    //    6   10:aload_0         
    //    7   11:iconst_1        
    //    8   12:putfield        #52  <Field boolean p>
    //    9   15:return          
    }

    ae b()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #88  <Field ae i>
    //    2    4:areturn         
    }

    boolean c()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #48  <Field boolean n>
    //    2    4:ireturn         
    }

    boolean d()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #52  <Field boolean p>
    //    2    4:ireturn         
    }

    void e()
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:putfield        #48  <Field boolean n>
    //    3    5:aload_0         
    //    4    6:getfield        #77  <Field ap f>
    //    5    9:new             #90  <Class ao>
    //    6   12:dup             
    //    7   13:aload_0         
    //    8   14:invokespecial   #93  <Method void ao(AppLovinSdkImpl)>
    //    9   17:lconst_0        
    //   10   18:invokevirtual   #98  <Method void ap.a(ao, long)>
    //   11   21:return          
    }

    void f()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #80  <Field ac g>
    //    2    4:invokevirtual   #100 <Method void ac.d()>
    //    3    7:aload_0         
    //    4    8:getfield        #80  <Field ac g>
    //    5   11:invokevirtual   #102 <Method void ac.b()>
    //    6   14:aload_0         
    //    7   15:getfield        #88  <Field ae i>
    //    8   18:invokevirtual   #106 <Method void ae.a()>
    //    9   21:return          
    }

    public AppLovinAdService getAdService()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #110 <Field b l>
    //    2    4:areturn         
    }

    public Context getApplicationContext()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #114 <Field Context c>
    //    2    4:areturn         
    }

    public k getConnectionManager()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #118 <Field k h>
    //    2    4:areturn         
    }

    public s getEventManager()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #122 <Field s e>
    //    2    4:areturn         
    }

    public AppLovinEventService getEventService()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #126 <Field AppLovinEventServiceImpl m>
    //    2    4:areturn         
    }

    public AppLovinLogger getLogger()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #130 <Field AppLovinLogger d>
    //    2    4:areturn         
    }

    public String getSdkKey()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #134 <Field String a>
    //    2    4:areturn         
    }

    public AppLovinSdkSettings getSettings()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #138 <Field AppLovinSdkSettings b>
    //    2    4:areturn         
    }

    public ac getSettingsManager()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #80  <Field ac g>
    //    2    4:areturn         
    }

    public AppLovinTargetingData getTargetingData()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #144 <Field i k>
    //    2    4:areturn         
    }

    public boolean hasCriticalErrors()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #54  <Field boolean q>
    //    2    4:ifne            14
    //    3    7:aload_0         
    //    4    8:getfield        #56  <Field boolean r>
    //    5   11:ifeq            16
    //    6   14:iconst_1        
    //    7   15:ireturn         
    //    8   16:iconst_0        
    //    9   17:ireturn         
    }

    protected void initialize(String s1, AppLovinSdkSettings applovinsdksettings, Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #134 <Field String a>
    //    3    5:aload_0         
    //    4    6:aload_2         
    //    5    7:putfield        #138 <Field AppLovinSdkSettings b>
    //    6   10:aload_0         
    //    7   11:aload_3         
    //    8   12:putfield        #114 <Field Context c>
    // try 15 157 handler(s) 292
    //    9   15:new             #151 <Class g>
    //   10   18:dup             
    //   11   19:invokespecial   #152 <Method void g()>
    //   12   22:astore          4
    //   13   24:aload_0         
    //   14   25:aload           4
    //   15   27:putfield        #130 <Field AppLovinLogger d>
    //   16   30:aload_0         
    //   17   31:new             #82  <Class ac>
    //   18   34:dup             
    //   19   35:aload_0         
    //   20   36:invokespecial   #153 <Method void ac(AppLovinSdkImpl)>
    //   21   39:putfield        #80  <Field ac g>
    //   22   42:aload_0         
    //   23   43:new             #155 <Class s>
    //   24   46:dup             
    //   25   47:aload_0         
    //   26   48:invokespecial   #156 <Method void s(AppLovinSdkImpl)>
    //   27   51:putfield        #122 <Field s e>
    //   28   54:aload_0         
    //   29   55:new             #95  <Class ap>
    //   30   58:dup             
    //   31   59:aload_0         
    //   32   60:invokespecial   #157 <Method void ap(AppLovinSdkImpl)>
    //   33   63:putfield        #77  <Field ap f>
    //   34   66:aload_0         
    //   35   67:new             #159 <Class k>
    //   36   70:dup             
    //   37   71:aload_0         
    //   38   72:invokespecial   #160 <Method void k(AppLovinSdkImpl)>
    //   39   75:putfield        #118 <Field k h>
    //   40   78:aload_0         
    //   41   79:new             #104 <Class ae>
    //   42   82:dup             
    //   43   83:aload_0         
    //   44   84:invokespecial   #161 <Method void ae(AppLovinSdkImpl)>
    //   45   87:putfield        #88  <Field ae i>
    //   46   90:aload_0         
    //   47   91:new             #163 <Class bh>
    //   48   94:dup             
    //   49   95:aload_0         
    //   50   96:invokespecial   #164 <Method void bh(AppLovinSdkImpl)>
    //   51   99:putfield        #166 <Field bh j>
    //   52  102:aload_0         
    //   53  103:new             #168 <Class b>
    //   54  106:dup             
    //   55  107:aload_0         
    //   56  108:invokespecial   #169 <Method void b(AppLovinSdkImpl)>
    //   57  111:putfield        #110 <Field b l>
    //   58  114:aload_0         
    //   59  115:new             #171 <Class AppLovinEventServiceImpl>
    //   60  118:dup             
    //   61  119:aload_0         
    //   62  120:invokespecial   #172 <Method void AppLovinEventServiceImpl(AppLovinSdkImpl)>
    //   63  123:putfield        #126 <Field AppLovinEventServiceImpl m>
    //   64  126:aload_0         
    //   65  127:new             #174 <Class i>
    //   66  130:dup             
    //   67  131:aload_0         
    //   68  132:invokespecial   #175 <Method void i(AppLovinSdkImpl)>
    //   69  135:putfield        #144 <Field i k>
    //   70  138:invokestatic    #177 <Method boolean g()>
    //   71  141:ifne            157
    //   72  144:aload_0         
    //   73  145:iconst_1        
    //   74  146:putfield        #54  <Field boolean q>
    //   75  149:ldc1            #179 <String "AppLovinSdk">
    //   76  151:ldc1            #181 <String "Unable to initalize AppLovin SDK: Android SDK version has to be at least level 8">
    //   77  153:invokestatic    #186 <Method int Log.e(String, String)>
    //   78  156:pop             
    //   79  157:aload_1         
    //   80  158:ifnull          169
    // try 161 169 handler(s) 292
    //   81  161:aload_1         
    //   82  162:invokevirtual   #190 <Method int String.length()>
    //   83  165:iconst_1        
    //   84  166:icmpge          182
    // try 169 182 handler(s) 292
    //   85  169:aload_0         
    //   86  170:iconst_1        
    //   87  171:putfield        #56  <Field boolean r>
    //   88  174:ldc1            #179 <String "AppLovinSdk">
    //   89  176:ldc1            #192 <String "Unable to find AppLovin SDK key. Please add     meta-data android:name=\"applovin.sdk.key\" android:value=\"YOUR_SDK_KEY_HERE\" into AndroidManifest.xml.">
    //   90  178:invokestatic    #186 <Method int Log.e(String, String)>
    //   91  181:pop             
    // try 182 226 handler(s) 292
    //   92  182:aload_0         
    //   93  183:invokevirtual   #194 <Method boolean hasCriticalErrors()>
    //   94  186:ifne            286
    //   95  189:aload           4
    //   96  191:aload_0         
    //   97  192:getfield        #122 <Field s e>
    //   98  195:invokevirtual   #197 <Method void g.a(s)>
    //   99  198:aload           4
    //  100  200:aload_0         
    //  101  201:getfield        #80  <Field ac g>
    //  102  204:invokevirtual   #200 <Method void g.a(ac)>
    //  103  207:aload_2         
    //  104  208:instanceof      #202 <Class x>
    //  105  211:ifeq            226
    //  106  214:aload           4
    //  107  216:aload_2         
    //  108  217:checkcast       #202 <Class x>
    //  109  220:invokevirtual   #205 <Method h x.a()>
    //  110  223:invokevirtual   #208 <Method void g.a(h)>
    // try 226 281 handler(s) 292
    //  111  226:aload_0         
    //  112  227:getfield        #80  <Field ac g>
    //  113  230:invokevirtual   #210 <Method void ac.c()>
    //  114  233:aload_0         
    //  115  234:getfield        #80  <Field ac g>
    //  116  237:getstatic       #215 <Field ab z.b>
    //  117  240:invokevirtual   #84  <Method Object ac.a(ab)>
    //  118  243:checkcast       #217 <Class Boolean>
    //  119  246:invokevirtual   #220 <Method boolean Boolean.booleanValue()>
    //  120  249:ifeq            281
    //  121  252:aload_0         
    //  122  253:getfield        #80  <Field ac g>
    //  123  256:aload_2         
    //  124  257:invokevirtual   #223 <Method void ac.a(AppLovinSdkSettings)>
    //  125  260:aload_0         
    //  126  261:getfield        #80  <Field ac g>
    //  127  264:getstatic       #215 <Field ab z.b>
    //  128  267:iconst_0        
    //  129  268:invokestatic    #227 <Method Boolean Boolean.valueOf(boolean)>
    //  130  271:invokevirtual   #230 <Method void ac.a(ab, Object)>
    //  131  274:aload_0         
    //  132  275:getfield        #80  <Field ac g>
    //  133  278:invokevirtual   #102 <Method void ac.b()>
    // try 281 285 handler(s) 292
    //  134  281:aload_0         
    //  135  282:invokevirtual   #232 <Method void e()>
    //  136  285:return          
    // try 286 291 handler(s) 292
    //  137  286:aload_0         
    //  138  287:iconst_0        
    //  139  288:invokevirtual   #234 <Method void a(boolean)>
    //  140  291:return          
    // catch Throwable Throwable Throwable Throwable Throwable Throwable Throwable
    //  141  292:astore          5
    //  142  294:ldc1            #179 <String "AppLovinSdk">
    //  143  296:ldc1            #236 <String "Failed to load AppLovin SDK, ad serving will be disabled">
    //  144  298:aload           5
    //  145  300:invokestatic    #239 <Method int Log.e(String, String, Throwable)>
    //  146  303:pop             
    //  147  304:aload_0         
    //  148  305:iconst_0        
    //  149  306:invokevirtual   #234 <Method void a(boolean)>
    //  150  309:return          
    }

    public void initializeSdk()
    {
    //    0    0:return          
    }

    public boolean isEnabled()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #50  <Field boolean o>
    //    2    4:ireturn         
    }

    public void setPluginVersion(String s1)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       14
    //    2    4:new             #245 <Class IllegalArgumentException>
    //    3    7:dup             
    //    4    8:ldc1            #247 <String "No version specified">
    //    5   10:invokespecial   #249 <Method void IllegalArgumentException(String)>
    //    6   13:athrow          
    //    7   14:aload_0         
    //    8   15:getfield        #80  <Field ac g>
    //    9   18:getstatic       #252 <Field ab z.J>
    //   10   21:aload_1         
    //   11   22:invokevirtual   #230 <Method void ac.a(ab, Object)>
    //   12   25:aload_0         
    //   13   26:getfield        #80  <Field ac g>
    //   14   29:invokevirtual   #102 <Method void ac.b()>
    //   15   32:return          
    }

    public static final String FULL_VERSION = "5.2.2-5.2.2";
    public static final String IMPL_VERSION = "5.2.2";
    private String a;
    private AppLovinSdkSettings b;
    private Context c;
    private AppLovinLogger d;
    private s e;
    private ap f;
    private ac g;
    private k h;
    private ae i;
    private bh j;
    private i k;
    private b l;
    private AppLovinEventServiceImpl m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
}
