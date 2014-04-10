// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.ResolveInfo;

// Referenced classes of package android.support.v4.accessibilityservice:
//            AccessibilityServiceInfoCompatIcs, AccessibilityServiceInfoCompatJellyBeanMr2

public class AccessibilityServiceInfoCompat
{
    static class AccessibilityServiceInfoIcsImpl extends AccessibilityServiceInfoStubImpl
    {

        AccessibilityServiceInfoIcsImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void AccessibilityServiceInfoCompat$AccessibilityServiceInfoStubImpl()>
        //    2    4:return          
        }

        public boolean getCanRetrieveWindowContent(AccessibilityServiceInfo accessibilityserviceinfo)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #14  <Method boolean AccessibilityServiceInfoCompatIcs.getCanRetrieveWindowContent(AccessibilityServiceInfo)>
        //    2    4:ireturn         
        }

        public int getCapabilities(AccessibilityServiceInfo accessibilityserviceinfo)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokevirtual   #17  <Method boolean getCanRetrieveWindowContent(AccessibilityServiceInfo)>
        //    3    5:ifeq            10
        //    4    8:iconst_1        
        //    5    9:ireturn         
        //    6   10:iconst_0        
        //    7   11:ireturn         
        }

        public String getDescription(AccessibilityServiceInfo accessibilityserviceinfo)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #21  <Method String AccessibilityServiceInfoCompatIcs.getDescription(AccessibilityServiceInfo)>
        //    2    4:areturn         
        }

        public String getId(AccessibilityServiceInfo accessibilityserviceinfo)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #24  <Method String AccessibilityServiceInfoCompatIcs.getId(AccessibilityServiceInfo)>
        //    2    4:areturn         
        }

        public ResolveInfo getResolveInfo(AccessibilityServiceInfo accessibilityserviceinfo)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #28  <Method ResolveInfo AccessibilityServiceInfoCompatIcs.getResolveInfo(AccessibilityServiceInfo)>
        //    2    4:areturn         
        }

        public String getSettingsActivityName(AccessibilityServiceInfo accessibilityserviceinfo)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #31  <Method String AccessibilityServiceInfoCompatIcs.getSettingsActivityName(AccessibilityServiceInfo)>
        //    2    4:areturn         
        }
    }

    static class AccessibilityServiceInfoJellyBeanMr2 extends AccessibilityServiceInfoIcsImpl
    {

        AccessibilityServiceInfoJellyBeanMr2()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void AccessibilityServiceInfoCompat$AccessibilityServiceInfoIcsImpl()>
        //    2    4:return          
        }

        public int getCapabilities(AccessibilityServiceInfo accessibilityserviceinfo)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #14  <Method int AccessibilityServiceInfoCompatJellyBeanMr2.getCapabilities(AccessibilityServiceInfo)>
        //    2    4:ireturn         
        }
    }

    static class AccessibilityServiceInfoStubImpl
        implements AccessibilityServiceInfoVersionImpl
    {

        AccessibilityServiceInfoStubImpl()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public boolean getCanRetrieveWindowContent(AccessibilityServiceInfo accessibilityserviceinfo)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public int getCapabilities(AccessibilityServiceInfo accessibilityserviceinfo)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }

        public String getDescription(AccessibilityServiceInfo accessibilityserviceinfo)
        {
        //    0    0:aconst_null     
        //    1    1:areturn         
        }

        public String getId(AccessibilityServiceInfo accessibilityserviceinfo)
        {
        //    0    0:aconst_null     
        //    1    1:areturn         
        }

        public ResolveInfo getResolveInfo(AccessibilityServiceInfo accessibilityserviceinfo)
        {
        //    0    0:aconst_null     
        //    1    1:areturn         
        }

        public String getSettingsActivityName(AccessibilityServiceInfo accessibilityserviceinfo)
        {
        //    0    0:aconst_null     
        //    1    1:areturn         
        }
    }

    static interface AccessibilityServiceInfoVersionImpl
    {

        public abstract boolean getCanRetrieveWindowContent(AccessibilityServiceInfo accessibilityserviceinfo);

        public abstract int getCapabilities(AccessibilityServiceInfo accessibilityserviceinfo);

        public abstract String getDescription(AccessibilityServiceInfo accessibilityserviceinfo);

        public abstract String getId(AccessibilityServiceInfo accessibilityserviceinfo);

        public abstract ResolveInfo getResolveInfo(AccessibilityServiceInfo accessibilityserviceinfo);

        public abstract String getSettingsActivityName(AccessibilityServiceInfo accessibilityserviceinfo);
    }


    static 
    {
    //    0    0:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          18
    //    2    5:icmplt          19
    //    3    8:new             #35  <Class AccessibilityServiceInfoCompat$AccessibilityServiceInfoJellyBeanMr2>
    //    4   11:dup             
    //    5   12:invokespecial   #38  <Method void AccessibilityServiceInfoCompat$AccessibilityServiceInfoJellyBeanMr2()>
    //    6   15:putstatic       #40  <Field AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl IMPL>
    //    7   18:return          
    //    8   19:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
    //    9   22:bipush          14
    //   10   24:icmplt          38
    //   11   27:new             #42  <Class AccessibilityServiceInfoCompat$AccessibilityServiceInfoIcsImpl>
    //   12   30:dup             
    //   13   31:invokespecial   #43  <Method void AccessibilityServiceInfoCompat$AccessibilityServiceInfoIcsImpl()>
    //   14   34:putstatic       #40  <Field AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl IMPL>
    //   15   37:return          
    //   16   38:new             #45  <Class AccessibilityServiceInfoCompat$AccessibilityServiceInfoStubImpl>
    //   17   41:dup             
    //   18   42:invokespecial   #46  <Method void AccessibilityServiceInfoCompat$AccessibilityServiceInfoStubImpl()>
    //   19   45:putstatic       #40  <Field AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl IMPL>
    //   20   48:return          
    }

    private AccessibilityServiceInfoCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #47  <Method void Object()>
    //    2    4:return          
    }

    public static String capabilityToString(int i)
    {
    //    0    0:iload_0         
    //    1    1:tableswitch     1 8: default 48
    //                   1 51
    //                   2 54
    //                   3 48
    //                   4 57
    //                   5 48
    //                   6 48
    //                   7 48
    //                   8 60
    //    2   48:ldc1            #51  <String "UNKNOWN">
    //    3   50:areturn         
    //    4   51:ldc1            #52  <String "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT">
    //    5   53:areturn         
    //    6   54:ldc1            #53  <String "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION">
    //    7   56:areturn         
    //    8   57:ldc1            #54  <String "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY">
    //    9   59:areturn         
    //   10   60:ldc1            #55  <String "CAPABILITY_CAN_FILTER_KEY_EVENTS">
    //   11   62:areturn         
    }

    public static String feedbackTypeToString(int i)
    {
    //    0    0:new             #58  <Class StringBuilder>
    //    1    3:dup             
    //    2    4:invokespecial   #59  <Method void StringBuilder()>
    //    3    7:astore_1        
    //    4    8:aload_1         
    //    5    9:ldc1            #61  <String "[">
    //    6   11:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
    //    7   14:pop             
    //    8   15:iload_0         
    //    9   16:ifle            153
    //   10   19:iconst_1        
    //   11   20:iload_0         
    //   12   21:invokestatic    #71  <Method int Integer.numberOfTrailingZeros(int)>
    //   13   24:ishl            
    //   14   25:istore          4
    //   15   27:iload_0         
    //   16   28:iload           4
    //   17   30:iconst_m1       
    //   18   31:ixor            
    //   19   32:iand            
    //   20   33:istore_0        
    //   21   34:aload_1         
    //   22   35:invokevirtual   #75  <Method int StringBuilder.length()>
    //   23   38:iconst_1        
    //   24   39:icmple          49
    //   25   42:aload_1         
    //   26   43:ldc1            #77  <String ", ">
    //   27   45:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
    //   28   48:pop             
    //   29   49:iload           4
    //   30   51:lookupswitch    5: default 100
    //                   1: 103
    //                   2: 123
    //                   4: 113
    //                   8: 143
    //                   16: 133
    //   31  100:goto            15
    //   32  103:aload_1         
    //   33  104:ldc1            #79  <String "FEEDBACK_SPOKEN">
    //   34  106:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
    //   35  109:pop             
    //   36  110:goto            15
    //   37  113:aload_1         
    //   38  114:ldc1            #81  <String "FEEDBACK_AUDIBLE">
    //   39  116:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
    //   40  119:pop             
    //   41  120:goto            15
    //   42  123:aload_1         
    //   43  124:ldc1            #83  <String "FEEDBACK_HAPTIC">
    //   44  126:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
    //   45  129:pop             
    //   46  130:goto            15
    //   47  133:aload_1         
    //   48  134:ldc1            #85  <String "FEEDBACK_GENERIC">
    //   49  136:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
    //   50  139:pop             
    //   51  140:goto            15
    //   52  143:aload_1         
    //   53  144:ldc1            #87  <String "FEEDBACK_VISUAL">
    //   54  146:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
    //   55  149:pop             
    //   56  150:goto            15
    //   57  153:aload_1         
    //   58  154:ldc1            #89  <String "]">
    //   59  156:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
    //   60  159:pop             
    //   61  160:aload_1         
    //   62  161:invokevirtual   #93  <Method String StringBuilder.toString()>
    //   63  164:areturn         
    }

    public static String flagToString(int i)
    {
    //    0    0:iload_0         
    //    1    1:lookupswitch    6: default 60
    //                   1: 62
    //                   2: 65
    //                   4: 68
    //                   8: 71
    //                   16: 74
    //                   32: 77
    //    2   60:aconst_null     
    //    3   61:areturn         
    //    4   62:ldc1            #95  <String "DEFAULT">
    //    5   64:areturn         
    //    6   65:ldc1            #96  <String "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS">
    //    7   67:areturn         
    //    8   68:ldc1            #97  <String "FLAG_REQUEST_TOUCH_EXPLORATION_MODE">
    //    9   70:areturn         
    //   10   71:ldc1            #98  <String "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY">
    //   11   73:areturn         
    //   12   74:ldc1            #99  <String "FLAG_REPORT_VIEW_IDS">
    //   13   76:areturn         
    //   14   77:ldc1            #100 <String "FLAG_REQUEST_FILTER_KEY_EVENTS">
    //   15   79:areturn         
    }

    public static boolean getCanRetrieveWindowContent(AccessibilityServiceInfo accessibilityserviceinfo)
    {
    //    0    0:getstatic       #40  <Field AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #106 <Method boolean AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl.getCanRetrieveWindowContent(AccessibilityServiceInfo)>
    //    3    9:ireturn         
    }

    public static int getCapabilities(AccessibilityServiceInfo accessibilityserviceinfo)
    {
    //    0    0:getstatic       #40  <Field AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #110 <Method int AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl.getCapabilities(AccessibilityServiceInfo)>
    //    3    9:ireturn         
    }

    public static String getDescription(AccessibilityServiceInfo accessibilityserviceinfo)
    {
    //    0    0:getstatic       #40  <Field AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #114 <Method String AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl.getDescription(AccessibilityServiceInfo)>
    //    3    9:areturn         
    }

    public static String getId(AccessibilityServiceInfo accessibilityserviceinfo)
    {
    //    0    0:getstatic       #40  <Field AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #117 <Method String AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl.getId(AccessibilityServiceInfo)>
    //    3    9:areturn         
    }

    public static ResolveInfo getResolveInfo(AccessibilityServiceInfo accessibilityserviceinfo)
    {
    //    0    0:getstatic       #40  <Field AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #121 <Method ResolveInfo AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl.getResolveInfo(AccessibilityServiceInfo)>
    //    3    9:areturn         
    }

    public static String getSettingsActivityName(AccessibilityServiceInfo accessibilityserviceinfo)
    {
    //    0    0:getstatic       #40  <Field AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #124 <Method String AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl.getSettingsActivityName(AccessibilityServiceInfo)>
    //    3    9:areturn         
    }

    public static final int CAPABILITY_CAN_FILTER_KEY_EVENTS = 8;
    public static final int CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 4;
    public static final int CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION = 2;
    public static final int CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT = 1;
    public static final int DEFAULT = 1;
    public static final int FEEDBACK_ALL_MASK = -1;
    public static final int FEEDBACK_BRAILLE = 32;
    public static final int FLAG_INCLUDE_NOT_IMPORTANT_VIEWS = 2;
    public static final int FLAG_REPORT_VIEW_IDS = 16;
    public static final int FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 8;
    public static final int FLAG_REQUEST_FILTER_KEY_EVENTS = 32;
    public static final int FLAG_REQUEST_TOUCH_EXPLORATION_MODE = 4;
    private static final AccessibilityServiceInfoVersionImpl IMPL;
}
