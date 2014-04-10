// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.text;

import java.util.Locale;

// Referenced classes of package android.support.v4.text:
//            ICUCompat

public class TextUtilsCompat
{

    static 
    {
    //    0    0:new             #13  <Class Locale>
    //    1    3:dup             
    //    2    4:ldc1            #15  <String "">
    //    3    6:ldc1            #15  <String "">
    //    4    8:invokespecial   #19  <Method void Locale(String, String)>
    //    5   11:putstatic       #21  <Field Locale ROOT>
    //    6   14:ldc1            #23  <String "Arab">
    //    7   16:putstatic       #25  <Field String ARAB_SCRIPT_SUBTAG>
    //    8   19:ldc1            #27  <String "Hebr">
    //    9   21:putstatic       #29  <Field String HEBR_SCRIPT_SUBTAG>
    //   10   24:return          
    }

    public TextUtilsCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #31  <Method void Object()>
    //    2    4:return          
    }

    private static int getLayoutDirectionFromFirstChar(Locale locale)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:invokevirtual   #37  <Method String Locale.getDisplayName(Locale)>
    //    3    5:iconst_0        
    //    4    6:invokevirtual   #43  <Method char String.charAt(int)>
    //    5    9:invokestatic    #49  <Method byte Character.getDirectionality(char)>
    //    6   12:tableswitch     1 2: default 36
    //                   1 38
    //                   2 38
    //    7   36:iconst_0        
    //    8   37:ireturn         
    //    9   38:iconst_1        
    //   10   39:ireturn         
    }

    public static int getLayoutDirectionFromLocale(Locale locale)
    {
    //    0    0:aload_0         
    //    1    1:ifnull          56
    //    2    4:aload_0         
    //    3    5:getstatic       #21  <Field Locale ROOT>
    //    4    8:invokevirtual   #54  <Method boolean Locale.equals(Object)>
    //    5   11:ifne            56
    //    6   14:aload_0         
    //    7   15:invokevirtual   #58  <Method String Locale.toString()>
    //    8   18:invokestatic    #64  <Method String ICUCompat.addLikelySubtags(String)>
    //    9   21:invokestatic    #67  <Method String ICUCompat.getScript(String)>
    //   10   24:astore_1        
    //   11   25:aload_1         
    //   12   26:ifnonnull       34
    //   13   29:aload_0         
    //   14   30:invokestatic    #69  <Method int getLayoutDirectionFromFirstChar(Locale)>
    //   15   33:ireturn         
    //   16   34:aload_1         
    //   17   35:getstatic       #25  <Field String ARAB_SCRIPT_SUBTAG>
    //   18   38:invokevirtual   #73  <Method boolean String.equalsIgnoreCase(String)>
    //   19   41:ifne            54
    //   20   44:aload_1         
    //   21   45:getstatic       #29  <Field String HEBR_SCRIPT_SUBTAG>
    //   22   48:invokevirtual   #73  <Method boolean String.equalsIgnoreCase(String)>
    //   23   51:ifeq            56
    //   24   54:iconst_1        
    //   25   55:ireturn         
    //   26   56:iconst_0        
    //   27   57:ireturn         
    }

    public static String htmlEncode(String s)
    {
    //    0    0:new             #76  <Class StringBuilder>
    //    1    3:dup             
    //    2    4:invokespecial   #77  <Method void StringBuilder()>
    //    3    7:astore_1        
    //    4    8:iconst_0        
    //    5    9:istore_2        
    //    6   10:iload_2         
    //    7   11:aload_0         
    //    8   12:invokevirtual   #81  <Method int String.length()>
    //    9   15:icmpge          138
    //   10   18:aload_0         
    //   11   19:iload_2         
    //   12   20:invokevirtual   #43  <Method char String.charAt(int)>
    //   13   23:istore_3        
    //   14   24:iload_3         
    //   15   25:lookupswitch    5: default 76
    //                   34: 128
    //                   38: 108
    //                   39: 118
    //                   60: 88
    //                   62: 98
    //   16   76:aload_1         
    //   17   77:iload_3         
    //   18   78:invokevirtual   #85  <Method StringBuilder StringBuilder.append(char)>
    //   19   81:pop             
    //   20   82:iinc            2  1
    //   21   85:goto            10
    //   22   88:aload_1         
    //   23   89:ldc1            #87  <String "&lt;">
    //   24   91:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   25   94:pop             
    //   26   95:goto            82
    //   27   98:aload_1         
    //   28   99:ldc1            #92  <String "&gt;">
    //   29  101:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   30  104:pop             
    //   31  105:goto            82
    //   32  108:aload_1         
    //   33  109:ldc1            #94  <String "&amp;">
    //   34  111:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   35  114:pop             
    //   36  115:goto            82
    //   37  118:aload_1         
    //   38  119:ldc1            #96  <String "&#39;">
    //   39  121:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   40  124:pop             
    //   41  125:goto            82
    //   42  128:aload_1         
    //   43  129:ldc1            #98  <String "&quot;">
    //   44  131:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
    //   45  134:pop             
    //   46  135:goto            82
    //   47  138:aload_1         
    //   48  139:invokevirtual   #99  <Method String StringBuilder.toString()>
    //   49  142:areturn         
    }

    private static String ARAB_SCRIPT_SUBTAG;
    private static String HEBR_SCRIPT_SUBTAG;
    public static final Locale ROOT;
}
