// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads.searchads;

import android.content.Context;
import android.graphics.Color;
import com.google.ads.AdRequest;
import com.google.ads.mediation.admob.AdMobAdapterExtras;
import java.util.Locale;
import java.util.Map;

public class SearchAdRequest extends AdRequest
{
    public static final class BorderType extends Enum
    {

        static 
        {
        //    0    0:new             #2   <Class SearchAdRequest$BorderType>
        //    1    3:dup             
        //    2    4:ldc1            #17  <String "NONE">
        //    3    6:iconst_0        
        //    4    7:ldc1            #19  <String "none">
        //    5    9:invokespecial   #23  <Method void SearchAdRequest$BorderType(String, int, String)>
        //    6   12:putstatic       #25  <Field SearchAdRequest$BorderType NONE>
        //    7   15:new             #2   <Class SearchAdRequest$BorderType>
        //    8   18:dup             
        //    9   19:ldc1            #26  <String "DASHED">
        //   10   21:iconst_1        
        //   11   22:ldc1            #28  <String "dashed">
        //   12   24:invokespecial   #23  <Method void SearchAdRequest$BorderType(String, int, String)>
        //   13   27:putstatic       #30  <Field SearchAdRequest$BorderType DASHED>
        //   14   30:new             #2   <Class SearchAdRequest$BorderType>
        //   15   33:dup             
        //   16   34:ldc1            #31  <String "DOTTED">
        //   17   36:iconst_2        
        //   18   37:ldc1            #33  <String "dotted">
        //   19   39:invokespecial   #23  <Method void SearchAdRequest$BorderType(String, int, String)>
        //   20   42:putstatic       #35  <Field SearchAdRequest$BorderType DOTTED>
        //   21   45:new             #2   <Class SearchAdRequest$BorderType>
        //   22   48:dup             
        //   23   49:ldc1            #36  <String "SOLID">
        //   24   51:iconst_3        
        //   25   52:ldc1            #38  <String "solid">
        //   26   54:invokespecial   #23  <Method void SearchAdRequest$BorderType(String, int, String)>
        //   27   57:putstatic       #40  <Field SearchAdRequest$BorderType SOLID>
        //   28   60:iconst_4        
        //   29   61:anewarray       BorderType[]
        //   30   64:astore_0        
        //   31   65:aload_0         
        //   32   66:iconst_0        
        //   33   67:getstatic       #25  <Field SearchAdRequest$BorderType NONE>
        //   34   70:aastore         
        //   35   71:aload_0         
        //   36   72:iconst_1        
        //   37   73:getstatic       #30  <Field SearchAdRequest$BorderType DASHED>
        //   38   76:aastore         
        //   39   77:aload_0         
        //   40   78:iconst_2        
        //   41   79:getstatic       #35  <Field SearchAdRequest$BorderType DOTTED>
        //   42   82:aastore         
        //   43   83:aload_0         
        //   44   84:iconst_3        
        //   45   85:getstatic       #40  <Field SearchAdRequest$BorderType SOLID>
        //   46   88:aastore         
        //   47   89:aload_0         
        //   48   90:putstatic       #42  <Field SearchAdRequest$BorderType[] b>
        //   49   93:return          
        }

        private BorderType(String s, int i1, String s1)
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

        public static BorderType valueOf(String s)
        {
        //    0    0:ldc1            #2   <Class SearchAdRequest$BorderType>
        //    1    2:aload_0         
        //    2    3:invokestatic    #52  <Method Enum Enum.valueOf(Class, String)>
        //    3    6:checkcast       #2   <Class SearchAdRequest$BorderType>
        //    4    9:areturn         
        }

        public static BorderType[] values()
        {
        //    0    0:getstatic       #42  <Field SearchAdRequest$BorderType[] b>
        //    1    3:invokevirtual   #59  <Method Object _5B_Lcom.google.ads.searchads.SearchAdRequest$BorderType_3B_.clone()>
        //    2    6:checkcast       #55  <Class SearchAdRequest$BorderType[]>
        //    3    9:areturn         
        }

        public String toString()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #47  <Field String a>
        //    2    4:areturn         
        }

        public static final BorderType DASHED;
        public static final BorderType DOTTED;
        public static final BorderType NONE;
        public static final BorderType SOLID;
        private static final BorderType b[];
        private String a;
    }


    public SearchAdRequest()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #24  <Method void AdRequest()>
    //    2    4:return          
    }

    private String a(int i1)
    {
    //    0    0:getstatic       #31  <Field Locale Locale.US>
    //    1    3:astore_2        
    //    2    4:iconst_1        
    //    3    5:anewarray       Object[]
    //    4    8:astore_3        
    //    5    9:aload_3         
    //    6   10:iconst_0        
    //    7   11:ldc1            #34  <Int 0xffffff>
    //    8   13:iload_1         
    //    9   14:iand            
    //   10   15:invokestatic    #40  <Method Integer Integer.valueOf(int)>
    //   11   18:aastore         
    //   12   19:aload_2         
    //   13   20:ldc1            #42  <String "#%06x">
    //   14   22:aload_3         
    //   15   23:invokestatic    #48  <Method String String.format(Locale, String, Object[])>
    //   16   26:areturn         
    }

    public Map getRequestMap(Context context)
    {
    //    0    0:aload_0         
    //    1    1:ldc1            #52  <Class AdMobAdapterExtras>
    //    2    3:invokevirtual   #56  <Method Object getNetworkExtras(Class)>
    //    3    6:checkcast       #52  <Class AdMobAdapterExtras>
    //    4    9:astore_2        
    //    5   10:aload_2         
    //    6   11:ifnonnull       28
    //    7   14:new             #52  <Class AdMobAdapterExtras>
    //    8   17:dup             
    //    9   18:invokespecial   #57  <Method void AdMobAdapterExtras()>
    //   10   21:astore_2        
    //   11   22:aload_0         
    //   12   23:aload_2         
    //   13   24:invokevirtual   #61  <Method AdRequest setNetworkExtras(com.google.ads.mediation.NetworkExtras)>
    //   14   27:pop             
    //   15   28:aload_0         
    //   16   29:getfield        #63  <Field String a>
    //   17   32:ifnull          51
    //   18   35:aload_2         
    //   19   36:invokevirtual   #67  <Method Map AdMobAdapterExtras.getExtras()>
    //   20   39:ldc1            #69  <String "q">
    //   21   41:aload_0         
    //   22   42:getfield        #63  <Field String a>
    //   23   45:invokeinterface #75  <Method Object Map.put(Object, Object)>
    //   24   50:pop             
    //   25   51:aload_0         
    //   26   52:getfield        #77  <Field int b>
    //   27   55:invokestatic    #83  <Method int Color.alpha(int)>
    //   28   58:ifeq            81
    //   29   61:aload_2         
    //   30   62:invokevirtual   #67  <Method Map AdMobAdapterExtras.getExtras()>
    //   31   65:ldc1            #85  <String "bgcolor">
    //   32   67:aload_0         
    //   33   68:aload_0         
    //   34   69:getfield        #77  <Field int b>
    //   35   72:invokespecial   #87  <Method String a(int)>
    //   36   75:invokeinterface #75  <Method Object Map.put(Object, Object)>
    //   37   80:pop             
    //   38   81:aload_0         
    //   39   82:getfield        #89  <Field int c>
    //   40   85:invokestatic    #83  <Method int Color.alpha(int)>
    //   41   88:sipush          255
    //   42   91:icmpne          147
    //   43   94:aload_0         
    //   44   95:getfield        #91  <Field int d>
    //   45   98:invokestatic    #83  <Method int Color.alpha(int)>
    //   46  101:sipush          255
    //   47  104:icmpne          147
    //   48  107:aload_2         
    //   49  108:invokevirtual   #67  <Method Map AdMobAdapterExtras.getExtras()>
    //   50  111:ldc1            #93  <String "gradientfrom">
    //   51  113:aload_0         
    //   52  114:aload_0         
    //   53  115:getfield        #89  <Field int c>
    //   54  118:invokespecial   #87  <Method String a(int)>
    //   55  121:invokeinterface #75  <Method Object Map.put(Object, Object)>
    //   56  126:pop             
    //   57  127:aload_2         
    //   58  128:invokevirtual   #67  <Method Map AdMobAdapterExtras.getExtras()>
    //   59  131:ldc1            #95  <String "gradientto">
    //   60  133:aload_0         
    //   61  134:aload_0         
    //   62  135:getfield        #91  <Field int d>
    //   63  138:invokespecial   #87  <Method String a(int)>
    //   64  141:invokeinterface #75  <Method Object Map.put(Object, Object)>
    //   65  146:pop             
    //   66  147:aload_0         
    //   67  148:getfield        #97  <Field int e>
    //   68  151:invokestatic    #83  <Method int Color.alpha(int)>
    //   69  154:ifeq            177
    //   70  157:aload_2         
    //   71  158:invokevirtual   #67  <Method Map AdMobAdapterExtras.getExtras()>
    //   72  161:ldc1            #99  <String "hcolor">
    //   73  163:aload_0         
    //   74  164:aload_0         
    //   75  165:getfield        #97  <Field int e>
    //   76  168:invokespecial   #87  <Method String a(int)>
    //   77  171:invokeinterface #75  <Method Object Map.put(Object, Object)>
    //   78  176:pop             
    //   79  177:aload_0         
    //   80  178:getfield        #101 <Field int f>
    //   81  181:invokestatic    #83  <Method int Color.alpha(int)>
    //   82  184:ifeq            207
    //   83  187:aload_2         
    //   84  188:invokevirtual   #67  <Method Map AdMobAdapterExtras.getExtras()>
    //   85  191:ldc1            #103 <String "dcolor">
    //   86  193:aload_0         
    //   87  194:aload_0         
    //   88  195:getfield        #101 <Field int f>
    //   89  198:invokespecial   #87  <Method String a(int)>
    //   90  201:invokeinterface #75  <Method Object Map.put(Object, Object)>
    //   91  206:pop             
    //   92  207:aload_0         
    //   93  208:getfield        #105 <Field int g>
    //   94  211:invokestatic    #83  <Method int Color.alpha(int)>
    //   95  214:ifeq            237
    //   96  217:aload_2         
    //   97  218:invokevirtual   #67  <Method Map AdMobAdapterExtras.getExtras()>
    //   98  221:ldc1            #107 <String "acolor">
    //   99  223:aload_0         
    //  100  224:aload_0         
    //  101  225:getfield        #105 <Field int g>
    //  102  228:invokespecial   #87  <Method String a(int)>
    //  103  231:invokeinterface #75  <Method Object Map.put(Object, Object)>
    //  104  236:pop             
    //  105  237:aload_0         
    //  106  238:getfield        #109 <Field String h>
    //  107  241:ifnull          260
    //  108  244:aload_2         
    //  109  245:invokevirtual   #67  <Method Map AdMobAdapterExtras.getExtras()>
    //  110  248:ldc1            #111 <String "font">
    //  111  250:aload_0         
    //  112  251:getfield        #109 <Field String h>
    //  113  254:invokeinterface #75  <Method Object Map.put(Object, Object)>
    //  114  259:pop             
    //  115  260:aload_2         
    //  116  261:invokevirtual   #67  <Method Map AdMobAdapterExtras.getExtras()>
    //  117  264:ldc1            #113 <String "headersize">
    //  118  266:aload_0         
    //  119  267:getfield        #115 <Field int i>
    //  120  270:invokestatic    #118 <Method String Integer.toString(int)>
    //  121  273:invokeinterface #75  <Method Object Map.put(Object, Object)>
    //  122  278:pop             
    //  123  279:aload_0         
    //  124  280:getfield        #120 <Field int j>
    //  125  283:invokestatic    #83  <Method int Color.alpha(int)>
    //  126  286:ifeq            309
    //  127  289:aload_2         
    //  128  290:invokevirtual   #67  <Method Map AdMobAdapterExtras.getExtras()>
    //  129  293:ldc1            #122 <String "bcolor">
    //  130  295:aload_0         
    //  131  296:aload_0         
    //  132  297:getfield        #120 <Field int j>
    //  133  300:invokespecial   #87  <Method String a(int)>
    //  134  303:invokeinterface #75  <Method Object Map.put(Object, Object)>
    //  135  308:pop             
    //  136  309:aload_0         
    //  137  310:getfield        #124 <Field SearchAdRequest$BorderType k>
    //  138  313:ifnull          335
    //  139  316:aload_2         
    //  140  317:invokevirtual   #67  <Method Map AdMobAdapterExtras.getExtras()>
    //  141  320:ldc1            #126 <String "btype">
    //  142  322:aload_0         
    //  143  323:getfield        #124 <Field SearchAdRequest$BorderType k>
    //  144  326:invokevirtual   #131 <Method String SearchAdRequest$BorderType.toString()>
    //  145  329:invokeinterface #75  <Method Object Map.put(Object, Object)>
    //  146  334:pop             
    //  147  335:aload_2         
    //  148  336:invokevirtual   #67  <Method Map AdMobAdapterExtras.getExtras()>
    //  149  339:ldc1            #133 <String "bthick">
    //  150  341:aload_0         
    //  151  342:getfield        #135 <Field int l>
    //  152  345:invokestatic    #118 <Method String Integer.toString(int)>
    //  153  348:invokeinterface #75  <Method Object Map.put(Object, Object)>
    //  154  353:pop             
    //  155  354:aload_0         
    //  156  355:getfield        #137 <Field String m>
    //  157  358:ifnull          377
    //  158  361:aload_2         
    //  159  362:invokevirtual   #67  <Method Map AdMobAdapterExtras.getExtras()>
    //  160  365:ldc1            #139 <String "channel">
    //  161  367:aload_0         
    //  162  368:getfield        #137 <Field String m>
    //  163  371:invokeinterface #75  <Method Object Map.put(Object, Object)>
    //  164  376:pop             
    //  165  377:aload_0         
    //  166  378:aload_1         
    //  167  379:invokespecial   #141 <Method Map AdRequest.getRequestMap(Context)>
    //  168  382:areturn         
    }

    public void setAnchorTextColor(int i1)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #105 <Field int g>
    //    3    5:return          
    }

    public void setBackgroundColor(int i1)
    {
    //    0    0:iload_1         
    //    1    1:invokestatic    #83  <Method int Color.alpha(int)>
    //    2    4:sipush          255
    //    3    7:icmpne          25
    //    4   10:aload_0         
    //    5   11:iload_1         
    //    6   12:putfield        #77  <Field int b>
    //    7   15:aload_0         
    //    8   16:iconst_0        
    //    9   17:putfield        #89  <Field int c>
    //   10   20:aload_0         
    //   11   21:iconst_0        
    //   12   22:putfield        #91  <Field int d>
    //   13   25:return          
    }

    public void setBackgroundGradient(int i1, int j1)
    {
    //    0    0:iload_1         
    //    1    1:invokestatic    #83  <Method int Color.alpha(int)>
    //    2    4:sipush          255
    //    3    7:icmpne          41
    //    4   10:iload_2         
    //    5   11:invokestatic    #83  <Method int Color.alpha(int)>
    //    6   14:sipush          255
    //    7   17:icmpne          41
    //    8   20:aload_0         
    //    9   21:iconst_0        
    //   10   22:iconst_0        
    //   11   23:iconst_0        
    //   12   24:iconst_0        
    //   13   25:invokestatic    #150 <Method int Color.argb(int, int, int, int)>
    //   14   28:putfield        #77  <Field int b>
    //   15   31:aload_0         
    //   16   32:iload_1         
    //   17   33:putfield        #89  <Field int c>
    //   18   36:aload_0         
    //   19   37:iload_2         
    //   20   38:putfield        #91  <Field int d>
    //   21   41:return          
    }

    public void setBorderColor(int i1)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #120 <Field int j>
    //    3    5:return          
    }

    public void setBorderThickness(int i1)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #135 <Field int l>
    //    3    5:return          
    }

    public void setBorderType(BorderType bordertype)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #124 <Field SearchAdRequest$BorderType k>
    //    3    5:return          
    }

    public void setCustomChannels(String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #137 <Field String m>
    //    3    5:return          
    }

    public void setDescriptionTextColor(int i1)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #101 <Field int f>
    //    3    5:return          
    }

    public void setFontFace(String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #109 <Field String h>
    //    3    5:return          
    }

    public void setHeaderTextColor(int i1)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #97  <Field int e>
    //    3    5:return          
    }

    public void setHeaderTextSize(int i1)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #115 <Field int i>
    //    3    5:return          
    }

    public void setQuery(String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #63  <Field String a>
    //    3    5:return          
    }

    private String a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private String h;
    private int i;
    private int j;
    private BorderType k;
    private int l;
    private String m;
}
