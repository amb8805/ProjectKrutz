// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.ads.util.i;

public class m extends i
{
    public static final class a extends i
    {

        public a()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #28  <Method void i()>
        //    2    4:aload_0         
        //    3    5:new             #30  <Class com.google.ads.util.i$c>
        //    4    8:dup             
        //    5    9:aload_0         
        //    6   10:ldc1            #32  <String "ASDomains">
        //    7   12:aconst_null     
        //    8   13:invokespecial   #35  <Method void com.google.ads.util.i$c(i, String, Object)>
        //    9   16:putfield        #37  <Field com.google.ads.util.i$c a>
        //   10   19:aload_0         
        //   11   20:new             #30  <Class com.google.ads.util.i$c>
        //   12   23:dup             
        //   13   24:aload_0         
        //   14   25:ldc1            #39  <String "minHwAccelerationVersionBanner">
        //   15   27:bipush          18
        //   16   29:invokestatic    #45  <Method Integer Integer.valueOf(int)>
        //   17   32:invokespecial   #35  <Method void com.google.ads.util.i$c(i, String, Object)>
        //   18   35:putfield        #47  <Field com.google.ads.util.i$c b>
        //   19   38:aload_0         
        //   20   39:new             #30  <Class com.google.ads.util.i$c>
        //   21   42:dup             
        //   22   43:aload_0         
        //   23   44:ldc1            #49  <String "minHwAccelerationVersionOverlay">
        //   24   46:bipush          18
        //   25   48:invokestatic    #45  <Method Integer Integer.valueOf(int)>
        //   26   51:invokespecial   #35  <Method void com.google.ads.util.i$c(i, String, Object)>
        //   27   54:putfield        #51  <Field com.google.ads.util.i$c c>
        //   28   57:aload_0         
        //   29   58:new             #30  <Class com.google.ads.util.i$c>
        //   30   61:dup             
        //   31   62:aload_0         
        //   32   63:ldc1            #49  <String "minHwAccelerationVersionOverlay">
        //   33   65:bipush          14
        //   34   67:invokestatic    #45  <Method Integer Integer.valueOf(int)>
        //   35   70:invokespecial   #35  <Method void com.google.ads.util.i$c(i, String, Object)>
        //   36   73:putfield        #53  <Field com.google.ads.util.i$c d>
        //   37   76:aload_0         
        //   38   77:new             #30  <Class com.google.ads.util.i$c>
        //   39   80:dup             
        //   40   81:aload_0         
        //   41   82:ldc1            #55  <String "mraidBannerPath">
        //   42   84:ldc1            #57  <String "http://media.admob.com/mraid/v1/mraid_app_banner.js">
        //   43   86:invokespecial   #35  <Method void com.google.ads.util.i$c(i, String, Object)>
        //   44   89:putfield        #59  <Field com.google.ads.util.i$c e>
        //   45   92:aload_0         
        //   46   93:new             #30  <Class com.google.ads.util.i$c>
        //   47   96:dup             
        //   48   97:aload_0         
        //   49   98:ldc1            #61  <String "mraidExpandedBannerPath">
        //   50  100:ldc1            #63  <String "http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js">
        //   51  102:invokespecial   #35  <Method void com.google.ads.util.i$c(i, String, Object)>
        //   52  105:putfield        #65  <Field com.google.ads.util.i$c f>
        //   53  108:aload_0         
        //   54  109:new             #30  <Class com.google.ads.util.i$c>
        //   55  112:dup             
        //   56  113:aload_0         
        //   57  114:ldc1            #67  <String "mraidInterstitialPath">
        //   58  116:ldc1            #69  <String "http://media.admob.com/mraid/v1/mraid_app_interstitial.js">
        //   59  118:invokespecial   #35  <Method void com.google.ads.util.i$c(i, String, Object)>
        //   60  121:putfield        #71  <Field com.google.ads.util.i$c g>
        //   61  124:aload_0         
        //   62  125:new             #30  <Class com.google.ads.util.i$c>
        //   63  128:dup             
        //   64  129:aload_0         
        //   65  130:ldc1            #73  <String "badAdReportPath">
        //   66  132:ldc1            #75  <String "https://badad.googleplex.com/s/reportAd">
        //   67  134:invokespecial   #35  <Method void com.google.ads.util.i$c(i, String, Object)>
        //   68  137:putfield        #77  <Field com.google.ads.util.i$c h>
        //   69  140:aload_0         
        //   70  141:new             #30  <Class com.google.ads.util.i$c>
        //   71  144:dup             
        //   72  145:aload_0         
        //   73  146:ldc1            #79  <String "appCacheMaxSize">
        //   74  148:lconst_0        
        //   75  149:invokestatic    #84  <Method Long Long.valueOf(long)>
        //   76  152:invokespecial   #35  <Method void com.google.ads.util.i$c(i, String, Object)>
        //   77  155:putfield        #86  <Field com.google.ads.util.i$c i>
        //   78  158:aload_0         
        //   79  159:new             #30  <Class com.google.ads.util.i$c>
        //   80  162:dup             
        //   81  163:aload_0         
        //   82  164:ldc1            #88  <String "appCacheMaxSizePaddingInBytes">
        //   83  166:ldc2w           #89  <Long 0x20000L>
        //   84  169:invokestatic    #84  <Method Long Long.valueOf(long)>
        //   85  172:invokespecial   #35  <Method void com.google.ads.util.i$c(i, String, Object)>
        //   86  175:putfield        #92  <Field com.google.ads.util.i$c j>
        //   87  178:aload_0         
        //   88  179:new             #30  <Class com.google.ads.util.i$c>
        //   89  182:dup             
        //   90  183:aload_0         
        //   91  184:ldc1            #94  <String "maxTotalAppCacheQuotaInBytes">
        //   92  186:ldc2w           #95  <Long 0x500000L>
        //   93  189:invokestatic    #84  <Method Long Long.valueOf(long)>
        //   94  192:invokespecial   #35  <Method void com.google.ads.util.i$c(i, String, Object)>
        //   95  195:putfield        #98  <Field com.google.ads.util.i$c k>
        //   96  198:aload_0         
        //   97  199:new             #30  <Class com.google.ads.util.i$c>
        //   98  202:dup             
        //   99  203:aload_0         
        //  100  204:ldc1            #100 <String "maxTotalDatabaseQuotaInBytes">
        //  101  206:ldc2w           #95  <Long 0x500000L>
        //  102  209:invokestatic    #84  <Method Long Long.valueOf(long)>
        //  103  212:invokespecial   #35  <Method void com.google.ads.util.i$c(i, String, Object)>
        //  104  215:putfield        #102 <Field com.google.ads.util.i$c l>
        //  105  218:aload_0         
        //  106  219:new             #30  <Class com.google.ads.util.i$c>
        //  107  222:dup             
        //  108  223:aload_0         
        //  109  224:ldc1            #104 <String "maxDatabaseQuotaPerOriginInBytes">
        //  110  226:ldc2w           #105 <Long 0x100000L>
        //  111  229:invokestatic    #84  <Method Long Long.valueOf(long)>
        //  112  232:invokespecial   #35  <Method void com.google.ads.util.i$c(i, String, Object)>
        //  113  235:putfield        #108 <Field com.google.ads.util.i$c m>
        //  114  238:aload_0         
        //  115  239:new             #30  <Class com.google.ads.util.i$c>
        //  116  242:dup             
        //  117  243:aload_0         
        //  118  244:ldc1            #110 <String "databaseQuotaIncreaseStepInBytes">
        //  119  246:ldc2w           #89  <Long 0x20000L>
        //  120  249:invokestatic    #84  <Method Long Long.valueOf(long)>
        //  121  252:invokespecial   #35  <Method void com.google.ads.util.i$c(i, String, Object)>
        //  122  255:putfield        #112 <Field com.google.ads.util.i$c n>
        //  123  258:aload_0         
        //  124  259:new             #30  <Class com.google.ads.util.i$c>
        //  125  262:dup             
        //  126  263:aload_0         
        //  127  264:ldc1            #114 <String "isInitialized">
        //  128  266:iconst_0        
        //  129  267:invokestatic    #119 <Method Boolean Boolean.valueOf(boolean)>
        //  130  270:invokespecial   #35  <Method void com.google.ads.util.i$c(i, String, Object)>
        //  131  273:putfield        #121 <Field com.google.ads.util.i$c o>
        //  132  276:return          
        }

        public final com.google.ads.util.i.c a;
        public final com.google.ads.util.i.c b;
        public final com.google.ads.util.i.c c;
        public final com.google.ads.util.i.c d;
        public final com.google.ads.util.i.c e;
        public final com.google.ads.util.i.c f;
        public final com.google.ads.util.i.c g;
        public final com.google.ads.util.i.c h;
        public final com.google.ads.util.i.c i;
        public final com.google.ads.util.i.c j;
        public final com.google.ads.util.i.c k;
        public final com.google.ads.util.i.c l;
        public final com.google.ads.util.i.c m;
        public final com.google.ads.util.i.c n;
        public final com.google.ads.util.i.c o;
    }


    static 
    {
    //    0    0:new             #2   <Class m>
    //    1    3:dup             
    //    2    4:invokespecial   #19  <Method void m()>
    //    3    7:putstatic       #21  <Field m d>
    //    4   10:return          
    }

    private m()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #22  <Method void i()>
    //    2    4:aload_0         
    //    3    5:new             #24  <Class com.google.ads.util.i$c>
    //    4    8:dup             
    //    5    9:aload_0         
    //    6   10:ldc1            #26  <String "marketPackages">
    //    7   12:aconst_null     
    //    8   13:invokespecial   #29  <Method void com.google.ads.util.i$c(i, String, Object)>
    //    9   16:putfield        #31  <Field com.google.ads.util.i$c a>
    //   10   19:aload_0         
    //   11   20:new             #33  <Class com.google.ads.util.i$b>
    //   12   23:dup             
    //   13   24:aload_0         
    //   14   25:ldc1            #35  <String "constants">
    //   15   27:new             #37  <Class m$a>
    //   16   30:dup             
    //   17   31:invokespecial   #38  <Method void m$a()>
    //   18   34:invokespecial   #39  <Method void com.google.ads.util.i$b(i, String, Object)>
    //   19   37:putfield        #41  <Field com.google.ads.util.i$b b>
    //   20   40:aload_0         
    //   21   41:new             #33  <Class com.google.ads.util.i$b>
    //   22   44:dup             
    //   23   45:aload_0         
    //   24   46:ldc1            #43  <String "uiHandler">
    //   25   48:new             #45  <Class Handler>
    //   26   51:dup             
    //   27   52:invokestatic    #51  <Method Looper Looper.getMainLooper()>
    //   28   55:invokespecial   #54  <Method void Handler(Looper)>
    //   29   58:invokespecial   #39  <Method void com.google.ads.util.i$b(i, String, Object)>
    //   30   61:putfield        #56  <Field com.google.ads.util.i$b c>
    //   31   64:return          
    }

    public static m a()
    {
    //    0    0:getstatic       #21  <Field m d>
    //    1    3:areturn         
    }

    private static final m d;
    public final com.google.ads.util.i.c a;
    public final com.google.ads.util.i.b b;
    public final com.google.ads.util.i.b c;
}
