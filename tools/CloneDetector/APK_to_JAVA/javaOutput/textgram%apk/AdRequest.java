// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.google.ads.doubleclick.DfpExtras;
import com.google.ads.mediation.NetworkExtras;
import com.google.ads.mediation.admob.AdMobAdapterExtras;
import com.google.ads.util.AdUtil;
import com.google.ads.util.b;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class AdRequest
{
    public static final class ErrorCode extends Enum
    {

        static 
        {
        //    0    0:new             #2   <Class AdRequest$ErrorCode>
        //    1    3:dup             
        //    2    4:ldc1            #17  <String "INVALID_REQUEST">
        //    3    6:iconst_0        
        //    4    7:ldc1            #19  <String "Invalid Ad request.">
        //    5    9:invokespecial   #23  <Method void AdRequest$ErrorCode(String, int, String)>
        //    6   12:putstatic       #25  <Field AdRequest$ErrorCode INVALID_REQUEST>
        //    7   15:new             #2   <Class AdRequest$ErrorCode>
        //    8   18:dup             
        //    9   19:ldc1            #26  <String "NO_FILL">
        //   10   21:iconst_1        
        //   11   22:ldc1            #28  <String "Ad request successful, but no ad returned due to lack of ad inventory.">
        //   12   24:invokespecial   #23  <Method void AdRequest$ErrorCode(String, int, String)>
        //   13   27:putstatic       #30  <Field AdRequest$ErrorCode NO_FILL>
        //   14   30:new             #2   <Class AdRequest$ErrorCode>
        //   15   33:dup             
        //   16   34:ldc1            #31  <String "NETWORK_ERROR">
        //   17   36:iconst_2        
        //   18   37:ldc1            #33  <String "A network error occurred.">
        //   19   39:invokespecial   #23  <Method void AdRequest$ErrorCode(String, int, String)>
        //   20   42:putstatic       #35  <Field AdRequest$ErrorCode NETWORK_ERROR>
        //   21   45:new             #2   <Class AdRequest$ErrorCode>
        //   22   48:dup             
        //   23   49:ldc1            #36  <String "INTERNAL_ERROR">
        //   24   51:iconst_3        
        //   25   52:ldc1            #38  <String "There was an internal error.">
        //   26   54:invokespecial   #23  <Method void AdRequest$ErrorCode(String, int, String)>
        //   27   57:putstatic       #40  <Field AdRequest$ErrorCode INTERNAL_ERROR>
        //   28   60:iconst_4        
        //   29   61:anewarray       ErrorCode[]
        //   30   64:astore_0        
        //   31   65:aload_0         
        //   32   66:iconst_0        
        //   33   67:getstatic       #25  <Field AdRequest$ErrorCode INVALID_REQUEST>
        //   34   70:aastore         
        //   35   71:aload_0         
        //   36   72:iconst_1        
        //   37   73:getstatic       #30  <Field AdRequest$ErrorCode NO_FILL>
        //   38   76:aastore         
        //   39   77:aload_0         
        //   40   78:iconst_2        
        //   41   79:getstatic       #35  <Field AdRequest$ErrorCode NETWORK_ERROR>
        //   42   82:aastore         
        //   43   83:aload_0         
        //   44   84:iconst_3        
        //   45   85:getstatic       #40  <Field AdRequest$ErrorCode INTERNAL_ERROR>
        //   46   88:aastore         
        //   47   89:aload_0         
        //   48   90:putstatic       #42  <Field AdRequest$ErrorCode[] b>
        //   49   93:return          
        }

        private ErrorCode(String s, int i1, String s1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:iload_2         
        //    3    3:invokespecial   #45  <Method void Enum(String, int)>
        //    4    6:aload_0         
        //    5    7:aload_3         
        //    6    8:putfield        #47  <Field String a>
        //    7   11:return          
        }

        public static ErrorCode valueOf(String s)
        {
        //    0    0:ldc1            #2   <Class AdRequest$ErrorCode>
        //    1    2:aload_0         
        //    2    3:invokestatic    #52  <Method Enum Enum.valueOf(Class, String)>
        //    3    6:checkcast       #2   <Class AdRequest$ErrorCode>
        //    4    9:areturn         
        }

        public static ErrorCode[] values()
        {
        //    0    0:getstatic       #42  <Field AdRequest$ErrorCode[] b>
        //    1    3:invokevirtual   #59  <Method Object _5B_Lcom.google.ads.AdRequest$ErrorCode_3B_.clone()>
        //    2    6:checkcast       #55  <Class AdRequest$ErrorCode[]>
        //    3    9:areturn         
        }

        public String toString()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #47  <Field String a>
        //    2    4:areturn         
        }

        public static final ErrorCode INTERNAL_ERROR;
        public static final ErrorCode INVALID_REQUEST;
        public static final ErrorCode NETWORK_ERROR;
        public static final ErrorCode NO_FILL;
        private static final ErrorCode b[];
        private final String a;
    }

    public static final class Gender extends Enum
    {

        static 
        {
        //    0    0:new             #2   <Class AdRequest$Gender>
        //    1    3:dup             
        //    2    4:ldc1            #14  <String "UNKNOWN">
        //    3    6:iconst_0        
        //    4    7:invokespecial   #18  <Method void AdRequest$Gender(String, int)>
        //    5   10:putstatic       #20  <Field AdRequest$Gender UNKNOWN>
        //    6   13:new             #2   <Class AdRequest$Gender>
        //    7   16:dup             
        //    8   17:ldc1            #21  <String "MALE">
        //    9   19:iconst_1        
        //   10   20:invokespecial   #18  <Method void AdRequest$Gender(String, int)>
        //   11   23:putstatic       #23  <Field AdRequest$Gender MALE>
        //   12   26:new             #2   <Class AdRequest$Gender>
        //   13   29:dup             
        //   14   30:ldc1            #24  <String "FEMALE">
        //   15   32:iconst_2        
        //   16   33:invokespecial   #18  <Method void AdRequest$Gender(String, int)>
        //   17   36:putstatic       #26  <Field AdRequest$Gender FEMALE>
        //   18   39:iconst_3        
        //   19   40:anewarray       Gender[]
        //   20   43:astore_0        
        //   21   44:aload_0         
        //   22   45:iconst_0        
        //   23   46:getstatic       #20  <Field AdRequest$Gender UNKNOWN>
        //   24   49:aastore         
        //   25   50:aload_0         
        //   26   51:iconst_1        
        //   27   52:getstatic       #23  <Field AdRequest$Gender MALE>
        //   28   55:aastore         
        //   29   56:aload_0         
        //   30   57:iconst_2        
        //   31   58:getstatic       #26  <Field AdRequest$Gender FEMALE>
        //   32   61:aastore         
        //   33   62:aload_0         
        //   34   63:putstatic       #28  <Field AdRequest$Gender[] a>
        //   35   66:return          
        }

        private Gender(String s, int i1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:iload_2         
        //    3    3:invokespecial   #29  <Method void Enum(String, int)>
        //    4    6:return          
        }

        public static Gender valueOf(String s)
        {
        //    0    0:ldc1            #2   <Class AdRequest$Gender>
        //    1    2:aload_0         
        //    2    3:invokestatic    #34  <Method Enum Enum.valueOf(Class, String)>
        //    3    6:checkcast       #2   <Class AdRequest$Gender>
        //    4    9:areturn         
        }

        public static Gender[] values()
        {
        //    0    0:getstatic       #28  <Field AdRequest$Gender[] a>
        //    1    3:invokevirtual   #41  <Method Object _5B_Lcom.google.ads.AdRequest$Gender_3B_.clone()>
        //    2    6:checkcast       #37  <Class AdRequest$Gender[]>
        //    3    9:areturn         
        }

        public static final Gender FEMALE;
        public static final Gender MALE;
        public static final Gender UNKNOWN;
        private static final Gender a[];
    }


    static 
    {
    //    0    0:new             #43  <Class SimpleDateFormat>
    //    1    3:dup             
    //    2    4:ldc1            #45  <String "yyyyMMdd">
    //    3    6:invokespecial   #49  <Method void SimpleDateFormat(String)>
    //    4    9:putstatic       #51  <Field SimpleDateFormat a>
    //    5   12:aconst_null     
    //    6   13:putstatic       #53  <Field Method b>
    //    7   16:aconst_null     
    //    8   17:putstatic       #55  <Field Method c>
    // try 20 32 handler(s) 107 150
    //    9   20:ldc1            #57  <String "com.google.analytics.tracking.android.AdMobInfo">
    //   10   22:invokestatic    #63  <Method Class Class.forName(String)>
    //   11   25:invokevirtual   #67  <Method Method[] Class.getMethods()>
    //   12   28:astore_2        
    //   13   29:aload_2         
    //   14   30:arraylength     
    //   15   31:istore_3        
    //   16   32:iconst_0        
    //   17   33:istore          4
    //   18   35:iload           4
    //   19   37:iload_3         
    //   20   38:icmpge          122
    // try 41 74 handler(s) 107 150
    //   21   41:aload_2         
    //   22   42:iload           4
    //   23   44:aaload          
    //   24   45:astore          5
    //   25   47:aload           5
    //   26   49:invokevirtual   #73  <Method String Method.getName()>
    //   27   52:ldc1            #75  <String "getInstance">
    //   28   54:invokevirtual   #81  <Method boolean String.equals(Object)>
    //   29   57:ifeq            77
    //   30   60:aload           5
    //   31   62:invokevirtual   #85  <Method Class[] Method.getParameterTypes()>
    //   32   65:arraylength     
    //   33   66:ifne            77
    //   34   69:aload           5
    //   35   71:putstatic       #53  <Field Method b>
    //   36   74:goto            159
    // try 77 104 handler(s) 107 150
    //   37   77:aload           5
    //   38   79:invokevirtual   #73  <Method String Method.getName()>
    //   39   82:ldc1            #87  <String "getJoinIds">
    //   40   84:invokevirtual   #81  <Method boolean String.equals(Object)>
    //   41   87:ifeq            159
    //   42   90:aload           5
    //   43   92:invokevirtual   #85  <Method Class[] Method.getParameterTypes()>
    //   44   95:arraylength     
    //   45   96:ifne            159
    //   46   99:aload           5
    //   47  101:putstatic       #55  <Field Method c>
    //   48  104:goto            159
    // catch ClassNotFoundException ClassNotFoundException ClassNotFoundException ClassNotFoundException ClassNotFoundException
    //   49  107:astore_1        
    //   50  108:ldc1            #89  <String "No Google Analytics: Library Not Found.">
    //   51  110:invokestatic    #93  <Method void b.a(String)>
    //   52  113:ldc1            #95  <String "emulator">
    //   53  115:invokestatic    #100 <Method String AdUtil.b(String)>
    //   54  118:putstatic       #102 <Field String TEST_EMULATOR>
    //   55  121:return          
    // try 122 134 handler(s) 107 150
    //   56  122:getstatic       #53  <Field Method b>
    //   57  125:ifnull          134
    //   58  128:getstatic       #55  <Field Method c>
    //   59  131:ifnonnull       113
    // try 134 147 handler(s) 107 150
    //   60  134:aconst_null     
    //   61  135:putstatic       #53  <Field Method b>
    //   62  138:aconst_null     
    //   63  139:putstatic       #55  <Field Method c>
    //   64  142:ldc1            #104 <String "No Google Analytics: Library Incompatible.">
    //   65  144:invokestatic    #106 <Method void b.e(String)>
    //   66  147:goto            113
    // catch Throwable Throwable Throwable Throwable Throwable
    //   67  150:astore_0        
    //   68  151:ldc1            #108 <String "No Google Analytics: Error Loading Library">
    //   69  153:invokestatic    #93  <Method void b.a(String)>
    //   70  156:goto            113
    //   71  159:iinc            4  1
    //   72  162:goto            35
    }

    public AdRequest()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #110 <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aconst_null     
    //    4    6:putfield        #112 <Field AdRequest$Gender d>
    //    5    9:aload_0         
    //    6   10:aconst_null     
    //    7   11:putfield        #114 <Field Date e>
    //    8   14:aload_0         
    //    9   15:aconst_null     
    //   10   16:putfield        #116 <Field Set f>
    //   11   19:aload_0         
    //   12   20:aconst_null     
    //   13   21:putfield        #118 <Field Map g>
    //   14   24:aload_0         
    //   15   25:new             #120 <Class HashMap>
    //   16   28:dup             
    //   17   29:invokespecial   #121 <Method void HashMap()>
    //   18   32:putfield        #123 <Field Map h>
    //   19   35:aload_0         
    //   20   36:aconst_null     
    //   21   37:putfield        #125 <Field Location i>
    //   22   40:aload_0         
    //   23   41:iconst_0        
    //   24   42:putfield        #127 <Field boolean j>
    //   25   45:aload_0         
    //   26   46:iconst_0        
    //   27   47:putfield        #129 <Field boolean k>
    //   28   50:aload_0         
    //   29   51:aconst_null     
    //   30   52:putfield        #131 <Field Set l>
    //   31   55:return          
    }

    private AdMobAdapterExtras a()
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 23 handler(s) 37
    //    2    2:aload_0         
    //    3    3:ldc1            #134 <Class AdMobAdapterExtras>
    //    4    5:invokevirtual   #138 <Method Object getNetworkExtras(Class)>
    //    5    8:ifnonnull       23
    //    6   11:aload_0         
    //    7   12:new             #134 <Class AdMobAdapterExtras>
    //    8   15:dup             
    //    9   16:invokespecial   #139 <Method void AdMobAdapterExtras()>
    //   10   19:invokevirtual   #143 <Method AdRequest setNetworkExtras(NetworkExtras)>
    //   11   22:pop             
    // try 23 33 handler(s) 37
    //   12   23:aload_0         
    //   13   24:ldc1            #134 <Class AdMobAdapterExtras>
    //   14   26:invokevirtual   #138 <Method Object getNetworkExtras(Class)>
    //   15   29:checkcast       #134 <Class AdMobAdapterExtras>
    //   16   32:astore_2        
    //   17   33:aload_0         
    //   18   34:monitorexit     
    //   19   35:aload_2         
    //   20   36:areturn         
    // finally
    //   21   37:astore_1        
    //   22   38:aload_0         
    //   23   39:monitorexit     
    //   24   40:aload_1         
    //   25   41:athrow          
    }

    public AdRequest addExtra(String s, Object obj)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #148 <Method AdMobAdapterExtras a()>
    //    2    4:astore_3        
    //    3    5:aload_3         
    //    4    6:invokevirtual   #152 <Method Map AdMobAdapterExtras.getExtras()>
    //    5    9:ifnonnull       24
    //    6   12:aload_3         
    //    7   13:new             #120 <Class HashMap>
    //    8   16:dup             
    //    9   17:invokespecial   #121 <Method void HashMap()>
    //   10   20:invokevirtual   #156 <Method AdMobAdapterExtras AdMobAdapterExtras.setExtras(Map)>
    //   11   23:pop             
    //   12   24:aload_3         
    //   13   25:invokevirtual   #152 <Method Map AdMobAdapterExtras.getExtras()>
    //   14   28:aload_1         
    //   15   29:aload_2         
    //   16   30:invokeinterface #162 <Method Object Map.put(Object, Object)>
    //   17   35:pop             
    //   18   36:aload_0         
    //   19   37:areturn         
    }

    public AdRequest addKeyword(String s)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #116 <Field Set f>
    //    2    4:ifnonnull       18
    //    3    7:aload_0         
    //    4    8:new             #166 <Class HashSet>
    //    5   11:dup             
    //    6   12:invokespecial   #167 <Method void HashSet()>
    //    7   15:putfield        #116 <Field Set f>
    //    8   18:aload_0         
    //    9   19:getfield        #116 <Field Set f>
    //   10   22:aload_1         
    //   11   23:invokeinterface #172 <Method boolean Set.add(Object)>
    //   12   28:pop             
    //   13   29:aload_0         
    //   14   30:areturn         
    }

    public AdRequest addKeywords(Set set)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #116 <Field Set f>
    //    2    4:ifnonnull       18
    //    3    7:aload_0         
    //    4    8:new             #166 <Class HashSet>
    //    5   11:dup             
    //    6   12:invokespecial   #167 <Method void HashSet()>
    //    7   15:putfield        #116 <Field Set f>
    //    8   18:aload_0         
    //    9   19:getfield        #116 <Field Set f>
    //   10   22:aload_1         
    //   11   23:invokeinterface #178 <Method boolean Set.addAll(java.util.Collection)>
    //   12   28:pop             
    //   13   29:aload_0         
    //   14   30:areturn         
    }

    public AdRequest addMediationExtra(String s, Object obj)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #118 <Field Map g>
    //    2    4:ifnonnull       18
    //    3    7:aload_0         
    //    4    8:new             #120 <Class HashMap>
    //    5   11:dup             
    //    6   12:invokespecial   #121 <Method void HashMap()>
    //    7   15:putfield        #118 <Field Map g>
    //    8   18:aload_0         
    //    9   19:getfield        #118 <Field Map g>
    //   10   22:aload_1         
    //   11   23:aload_2         
    //   12   24:invokeinterface #162 <Method Object Map.put(Object, Object)>
    //   13   29:pop             
    //   14   30:aload_0         
    //   15   31:areturn         
    }

    public AdRequest addTestDevice(String s)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #131 <Field Set l>
    //    2    4:ifnonnull       18
    //    3    7:aload_0         
    //    4    8:new             #166 <Class HashSet>
    //    5   11:dup             
    //    6   12:invokespecial   #167 <Method void HashSet()>
    //    7   15:putfield        #131 <Field Set l>
    //    8   18:aload_0         
    //    9   19:getfield        #131 <Field Set l>
    //   10   22:aload_1         
    //   11   23:invokeinterface #172 <Method boolean Set.add(Object)>
    //   12   28:pop             
    //   13   29:aload_0         
    //   14   30:areturn         
    }

    public AdRequest clearBirthday()
    {
    //    0    0:aload_0         
    //    1    1:aconst_null     
    //    2    2:putfield        #114 <Field Date e>
    //    3    5:aload_0         
    //    4    6:areturn         
    }

    public Date getBirthday()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #114 <Field Date e>
    //    2    4:areturn         
    }

    public Gender getGender()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #112 <Field AdRequest$Gender d>
    //    2    4:areturn         
    }

    public Set getKeywords()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #116 <Field Set f>
    //    2    4:ifnonnull       9
    //    3    7:aconst_null     
    //    4    8:areturn         
    //    5    9:aload_0         
    //    6   10:getfield        #116 <Field Set f>
    //    7   13:invokestatic    #194 <Method Set Collections.unmodifiableSet(Set)>
    //    8   16:areturn         
    }

    public Location getLocation()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #125 <Field Location i>
    //    2    4:areturn         
    }

    public Object getNetworkExtras(Class class1)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #123 <Field Map h>
    //    2    4:aload_1         
    //    3    5:invokeinterface #200 <Method Object Map.get(Object)>
    //    4   10:areturn         
    }

    public boolean getPlusOneOptOut()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #148 <Method AdMobAdapterExtras a()>
    //    2    4:invokevirtual   #204 <Method boolean AdMobAdapterExtras.getPlusOneOptOut()>
    //    3    7:ireturn         
    }

    public Map getRequestMap(Context context)
    {
    //    0    0:new             #120 <Class HashMap>
    //    1    3:dup             
    //    2    4:invokespecial   #121 <Method void HashMap()>
    //    3    7:astore_2        
    //    4    8:aload_0         
    //    5    9:getfield        #116 <Field Set f>
    //    6   12:ifnull          28
    //    7   15:aload_2         
    //    8   16:ldc1            #208 <String "kw">
    //    9   18:aload_0         
    //   10   19:getfield        #116 <Field Set f>
    //   11   22:invokeinterface #162 <Method Object Map.put(Object, Object)>
    //   12   27:pop             
    //   13   28:aload_0         
    //   14   29:getfield        #112 <Field AdRequest$Gender d>
    //   15   32:ifnull          54
    //   16   35:aload_2         
    //   17   36:ldc1            #210 <String "cust_gender">
    //   18   38:aload_0         
    //   19   39:getfield        #112 <Field AdRequest$Gender d>
    //   20   42:invokevirtual   #216 <Method int AdRequest$Gender.ordinal()>
    //   21   45:invokestatic    #222 <Method Integer Integer.valueOf(int)>
    //   22   48:invokeinterface #162 <Method Object Map.put(Object, Object)>
    //   23   53:pop             
    //   24   54:aload_0         
    //   25   55:getfield        #114 <Field Date e>
    //   26   58:ifnull          80
    //   27   61:aload_2         
    //   28   62:ldc1            #224 <String "cust_age">
    //   29   64:getstatic       #51  <Field SimpleDateFormat a>
    //   30   67:aload_0         
    //   31   68:getfield        #114 <Field Date e>
    //   32   71:invokevirtual   #228 <Method String SimpleDateFormat.format(Date)>
    //   33   74:invokeinterface #162 <Method Object Map.put(Object, Object)>
    //   34   79:pop             
    //   35   80:aload_0         
    //   36   81:getfield        #125 <Field Location i>
    //   37   84:ifnull          103
    //   38   87:aload_2         
    //   39   88:ldc1            #230 <String "uule">
    //   40   90:aload_0         
    //   41   91:getfield        #125 <Field Location i>
    //   42   94:invokestatic    #233 <Method HashMap AdUtil.a(Location)>
    //   43   97:invokeinterface #162 <Method Object Map.put(Object, Object)>
    //   44  102:pop             
    //   45  103:aload_0         
    //   46  104:getfield        #127 <Field boolean j>
    //   47  107:ifeq            123
    //   48  110:aload_2         
    //   49  111:ldc1            #235 <String "testing">
    //   50  113:iconst_1        
    //   51  114:invokestatic    #222 <Method Integer Integer.valueOf(int)>
    //   52  117:invokeinterface #162 <Method Object Map.put(Object, Object)>
    //   53  122:pop             
    //   54  123:aload_0         
    //   55  124:aload_1         
    //   56  125:invokevirtual   #239 <Method boolean isTestDevice(Context)>
    //   57  128:ifeq            322
    //   58  131:aload_2         
    //   59  132:ldc1            #241 <String "adtest">
    //   60  134:ldc1            #243 <String "on">
    //   61  136:invokeinterface #162 <Method Object Map.put(Object, Object)>
    //   62  141:pop             
    //   63  142:aload_0         
    //   64  143:ldc1            #134 <Class AdMobAdapterExtras>
    //   65  145:invokevirtual   #138 <Method Object getNetworkExtras(Class)>
    //   66  148:checkcast       #134 <Class AdMobAdapterExtras>
    //   67  151:astore          4
    //   68  153:aload_0         
    //   69  154:ldc1            #245 <Class DfpExtras>
    //   70  156:invokevirtual   #138 <Method Object getNetworkExtras(Class)>
    //   71  159:checkcast       #245 <Class DfpExtras>
    //   72  162:astore          5
    //   73  164:aload           5
    //   74  166:ifnull          409
    //   75  169:aload           5
    //   76  171:invokevirtual   #246 <Method Map DfpExtras.getExtras()>
    //   77  174:ifnull          409
    //   78  177:aload           5
    //   79  179:invokevirtual   #246 <Method Map DfpExtras.getExtras()>
    //   80  182:invokeinterface #249 <Method boolean Map.isEmpty()>
    //   81  187:ifne            409
    //   82  190:aload_2         
    //   83  191:ldc1            #251 <String "extras">
    //   84  193:aload           5
    //   85  195:invokevirtual   #246 <Method Map DfpExtras.getExtras()>
    //   86  198:invokeinterface #162 <Method Object Map.put(Object, Object)>
    //   87  203:pop             
    //   88  204:aload           5
    //   89  206:ifnull          236
    //   90  209:aload           5
    //   91  211:invokevirtual   #254 <Method String DfpExtras.getPublisherProvidedId()>
    //   92  214:astore          12
    //   93  216:aload           12
    //   94  218:invokestatic    #259 <Method boolean TextUtils.isEmpty(CharSequence)>
    //   95  221:ifne            236
    //   96  224:aload_2         
    //   97  225:ldc2            #261 <String "ppid">
    //   98  228:aload           12
    //   99  230:invokeinterface #162 <Method Object Map.put(Object, Object)>
    //  100  235:pop             
    //  101  236:aload_0         
    //  102  237:getfield        #118 <Field Map g>
    //  103  240:ifnull          257
    //  104  243:aload_2         
    //  105  244:ldc2            #263 <String "mediation_extras">
    //  106  247:aload_0         
    //  107  248:getfield        #118 <Field Map g>
    //  108  251:invokeinterface #162 <Method Object Map.put(Object, Object)>
    //  109  256:pop             
    // try 257 293 handler(s) 452
    //  110  257:getstatic       #53  <Field Method b>
    //  111  260:ifnull          320
    //  112  263:getstatic       #53  <Field Method b>
    //  113  266:aconst_null     
    //  114  267:iconst_0        
    //  115  268:anewarray       Object[]
    //  116  271:invokevirtual   #267 <Method Object Method.invoke(Object, Object[])>
    //  117  274:astore          8
    //  118  276:getstatic       #55  <Field Method c>
    //  119  279:aload           8
    //  120  281:iconst_0        
    //  121  282:anewarray       Object[]
    //  122  285:invokevirtual   #267 <Method Object Method.invoke(Object, Object[])>
    //  123  288:checkcast       #158 <Class Map>
    //  124  291:astore          9
    //  125  293:aload           9
    //  126  295:ifnull          320
    // try 298 320 handler(s) 452
    //  127  298:aload           9
    //  128  300:invokeinterface #270 <Method int Map.size()>
    //  129  305:ifle            320
    //  130  308:aload_2         
    //  131  309:ldc2            #272 <String "analytics_join_id">
    //  132  312:aload           9
    //  133  314:invokeinterface #162 <Method Object Map.put(Object, Object)>
    //  134  319:pop             
    //  135  320:aload_2         
    //  136  321:areturn         
    //  137  322:aload_0         
    //  138  323:getfield        #129 <Field boolean k>
    //  139  326:ifne            142
    //  140  329:invokestatic    #274 <Method boolean AdUtil.c()>
    //  141  332:ifeq            376
    //  142  335:ldc2            #276 <String "AdRequest.TEST_EMULATOR">
    //  143  338:astore_3        
    //  144  339:new             #278 <Class StringBuilder>
    //  145  342:dup             
    //  146  343:invokespecial   #279 <Method void StringBuilder()>
    //  147  346:ldc2            #281 <String "To get test ads on this device, call adRequest.addTestDevice(">
    //  148  349:invokevirtual   #285 <Method StringBuilder StringBuilder.append(String)>
    //  149  352:aload_3         
    //  150  353:invokevirtual   #285 <Method StringBuilder StringBuilder.append(String)>
    //  151  356:ldc2            #287 <String ");">
    //  152  359:invokevirtual   #285 <Method StringBuilder StringBuilder.append(String)>
    //  153  362:invokevirtual   #290 <Method String StringBuilder.toString()>
    //  154  365:invokestatic    #292 <Method void b.c(String)>
    //  155  368:aload_0         
    //  156  369:iconst_1        
    //  157  370:putfield        #129 <Field boolean k>
    //  158  373:goto            142
    //  159  376:new             #278 <Class StringBuilder>
    //  160  379:dup             
    //  161  380:invokespecial   #279 <Method void StringBuilder()>
    //  162  383:ldc2            #294 <String "\"">
    //  163  386:invokevirtual   #285 <Method StringBuilder StringBuilder.append(String)>
    //  164  389:aload_1         
    //  165  390:invokestatic    #297 <Method String AdUtil.a(Context)>
    //  166  393:invokevirtual   #285 <Method StringBuilder StringBuilder.append(String)>
    //  167  396:ldc2            #294 <String "\"">
    //  168  399:invokevirtual   #285 <Method StringBuilder StringBuilder.append(String)>
    //  169  402:invokevirtual   #290 <Method String StringBuilder.toString()>
    //  170  405:astore_3        
    //  171  406:goto            339
    //  172  409:aload           4
    //  173  411:ifnull          204
    //  174  414:aload           4
    //  175  416:invokevirtual   #152 <Method Map AdMobAdapterExtras.getExtras()>
    //  176  419:ifnull          204
    //  177  422:aload           4
    //  178  424:invokevirtual   #152 <Method Map AdMobAdapterExtras.getExtras()>
    //  179  427:invokeinterface #249 <Method boolean Map.isEmpty()>
    //  180  432:ifne            204
    //  181  435:aload_2         
    //  182  436:ldc1            #251 <String "extras">
    //  183  438:aload           4
    //  184  440:invokevirtual   #152 <Method Map AdMobAdapterExtras.getExtras()>
    //  185  443:invokeinterface #162 <Method Object Map.put(Object, Object)>
    //  186  448:pop             
    //  187  449:goto            204
    // catch Throwable Throwable
    //  188  452:astore          7
    //  189  454:ldc2            #299 <String "Internal Analytics Error:">
    //  190  457:aload           7
    //  191  459:invokestatic    #302 <Method void b.c(String, Throwable)>
    //  192  462:aload_2         
    //  193  463:areturn         
    }

    public boolean isTestDevice(Context context)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #131 <Field Set l>
    //    2    4:ifnull          16
    //    3    7:aload_1         
    //    4    8:invokestatic    #297 <Method String AdUtil.a(Context)>
    //    5   11:astore_2        
    //    6   12:aload_2         
    //    7   13:ifnonnull       18
    //    8   16:iconst_0        
    //    9   17:ireturn         
    //   10   18:aload_0         
    //   11   19:getfield        #131 <Field Set l>
    //   12   22:aload_2         
    //   13   23:invokeinterface #305 <Method boolean Set.contains(Object)>
    //   14   28:ifeq            16
    //   15   31:iconst_1        
    //   16   32:ireturn         
    }

    public AdRequest removeNetworkExtras(Class class1)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #123 <Field Map h>
    //    2    4:aload_1         
    //    3    5:invokeinterface #310 <Method Object Map.remove(Object)>
    //    4   10:pop             
    //    5   11:aload_0         
    //    6   12:areturn         
    }

    public AdRequest setBirthday(String s)
    {
    //    0    0:aload_1         
    //    1    1:ldc2            #315 <String "">
    //    2    4:if_acmpeq       11
    //    3    7:aload_1         
    //    4    8:ifnonnull       18
    //    5   11:aload_0         
    //    6   12:aconst_null     
    //    7   13:putfield        #114 <Field Date e>
    //    8   16:aload_0         
    //    9   17:areturn         
    // try 18 29 handler(s) 31
    //   10   18:aload_0         
    //   11   19:getstatic       #51  <Field SimpleDateFormat a>
    //   12   22:aload_1         
    //   13   23:invokevirtual   #319 <Method Date SimpleDateFormat.parse(String)>
    //   14   26:putfield        #114 <Field Date e>
    //   15   29:aload_0         
    //   16   30:areturn         
    // catch ParseException
    //   17   31:astore_2        
    //   18   32:ldc2            #321 <String "Birthday format invalid.  Expected 'YYYYMMDD' where 'YYYY' is a 4 digit year, 'MM' is a two digit month, and 'DD' is a two digit day.  Birthday value ignored">
    //   19   35:invokestatic    #106 <Method void b.e(String)>
    //   20   38:aload_0         
    //   21   39:aconst_null     
    //   22   40:putfield        #114 <Field Date e>
    //   23   43:aload_0         
    //   24   44:areturn         
    }

    public AdRequest setBirthday(Calendar calendar)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       11
    //    2    4:aload_0         
    //    3    5:aconst_null     
    //    4    6:putfield        #114 <Field Date e>
    //    5    9:aload_0         
    //    6   10:areturn         
    //    7   11:aload_0         
    //    8   12:aload_1         
    //    9   13:invokevirtual   #327 <Method Date Calendar.getTime()>
    //   10   16:invokevirtual   #330 <Method AdRequest setBirthday(Date)>
    //   11   19:pop             
    //   12   20:aload_0         
    //   13   21:areturn         
    }

    public AdRequest setBirthday(Date date)
    {
    //    0    0:aload_1         
    //    1    1:ifnonnull       11
    //    2    4:aload_0         
    //    3    5:aconst_null     
    //    4    6:putfield        #114 <Field Date e>
    //    5    9:aload_0         
    //    6   10:areturn         
    //    7   11:aload_0         
    //    8   12:new             #332 <Class Date>
    //    9   15:dup             
    //   10   16:aload_1         
    //   11   17:invokevirtual   #335 <Method long Date.getTime()>
    //   12   20:invokespecial   #338 <Method void Date(long)>
    //   13   23:putfield        #114 <Field Date e>
    //   14   26:aload_0         
    //   15   27:areturn         
    }

    public AdRequest setExtras(Map map)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #148 <Method AdMobAdapterExtras a()>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #156 <Method AdMobAdapterExtras AdMobAdapterExtras.setExtras(Map)>
    //    4    8:pop             
    //    5    9:aload_0         
    //    6   10:areturn         
    }

    public AdRequest setGender(Gender gender)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #112 <Field AdRequest$Gender d>
    //    3    5:aload_0         
    //    4    6:areturn         
    }

    public AdRequest setKeywords(Set set)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #116 <Field Set f>
    //    3    5:aload_0         
    //    4    6:areturn         
    }

    public AdRequest setLocation(Location location)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #125 <Field Location i>
    //    3    5:aload_0         
    //    4    6:areturn         
    }

    public AdRequest setMediationExtras(Map map)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #118 <Field Map g>
    //    3    5:aload_0         
    //    4    6:areturn         
    }

    public AdRequest setNetworkExtras(NetworkExtras networkextras)
    {
    //    0    0:aload_1         
    //    1    1:ifnull          19
    //    2    4:aload_0         
    //    3    5:getfield        #123 <Field Map h>
    //    4    8:aload_1         
    //    5    9:invokevirtual   #349 <Method Class Object.getClass()>
    //    6   12:aload_1         
    //    7   13:invokeinterface #162 <Method Object Map.put(Object, Object)>
    //    8   18:pop             
    //    9   19:aload_0         
    //   10   20:areturn         
    }

    public AdRequest setPlusOneOptOut(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #148 <Method AdMobAdapterExtras a()>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #354 <Method AdMobAdapterExtras AdMobAdapterExtras.setPlusOneOptOut(boolean)>
    //    4    8:pop             
    //    5    9:aload_0         
    //    6   10:areturn         
    }

    public AdRequest setTestDevices(Set set)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #131 <Field Set l>
    //    3    5:aload_0         
    //    4    6:areturn         
    }

    public AdRequest setTesting(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #127 <Field boolean j>
    //    3    5:aload_0         
    //    4    6:areturn         
    }

    public static final String LOGTAG = "Ads";
    public static final String TEST_EMULATOR;
    public static final String VERSION = "6.4.1";
    private static final SimpleDateFormat a;
    private static Method b;
    private static Method c;
    private Gender d;
    private Date e;
    private Set f;
    private Map g;
    private final Map h;
    private Location i;
    private boolean j;
    private boolean k;
    private Set l;
}
