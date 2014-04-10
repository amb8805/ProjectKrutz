// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;

public class AdSize
{

    static 
    {
    //    0    0:new             #2   <Class AdSize>
    //    1    3:dup             
    //    2    4:iconst_m1       
    //    3    5:bipush          -2
    //    4    7:ldc1            #34  <String "mb">
    //    5    9:invokespecial   #38  <Method void AdSize(int, int, String)>
    //    6   12:putstatic       #40  <Field AdSize SMART_BANNER>
    //    7   15:new             #2   <Class AdSize>
    //    8   18:dup             
    //    9   19:sipush          320
    //   10   22:bipush          50
    //   11   24:ldc1            #34  <String "mb">
    //   12   26:invokespecial   #38  <Method void AdSize(int, int, String)>
    //   13   29:putstatic       #42  <Field AdSize BANNER>
    //   14   32:new             #2   <Class AdSize>
    //   15   35:dup             
    //   16   36:sipush          300
    //   17   39:sipush          250
    //   18   42:ldc1            #44  <String "as">
    //   19   44:invokespecial   #38  <Method void AdSize(int, int, String)>
    //   20   47:putstatic       #46  <Field AdSize IAB_MRECT>
    //   21   50:new             #2   <Class AdSize>
    //   22   53:dup             
    //   23   54:sipush          468
    //   24   57:bipush          60
    //   25   59:ldc1            #44  <String "as">
    //   26   61:invokespecial   #38  <Method void AdSize(int, int, String)>
    //   27   64:putstatic       #48  <Field AdSize IAB_BANNER>
    //   28   67:new             #2   <Class AdSize>
    //   29   70:dup             
    //   30   71:sipush          728
    //   31   74:bipush          90
    //   32   76:ldc1            #44  <String "as">
    //   33   78:invokespecial   #38  <Method void AdSize(int, int, String)>
    //   34   81:putstatic       #50  <Field AdSize IAB_LEADERBOARD>
    //   35   84:new             #2   <Class AdSize>
    //   36   87:dup             
    //   37   88:sipush          160
    //   38   91:sipush          600
    //   39   94:ldc1            #44  <String "as">
    //   40   96:invokespecial   #38  <Method void AdSize(int, int, String)>
    //   41   99:putstatic       #52  <Field AdSize IAB_WIDE_SKYSCRAPER>
    //   42  102:return          
    }

    public AdSize(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:aconst_null     
    //    4    4:invokespecial   #38  <Method void AdSize(int, int, String)>
    //    5    7:aload_0         
    //    6    8:invokespecial   #56  <Method boolean a()>
    //    7   11:ifeq            26
    //    8   14:aload_0         
    //    9   15:iconst_0        
    //   10   16:putfield        #58  <Field boolean e>
    //   11   19:aload_0         
    //   12   20:ldc1            #34  <String "mb">
    //   13   22:putfield        #60  <Field String f>
    //   14   25:return          
    //   15   26:aload_0         
    //   16   27:iconst_1        
    //   17   28:putfield        #58  <Field boolean e>
    //   18   31:return          
    }

    private AdSize(int i, int j, String s)
    {
    //    0    0:iconst_1        
    //    1    1:istore          4
    //    2    3:aload_0         
    //    3    4:invokespecial   #62  <Method void Object()>
    //    4    7:aload_0         
    //    5    8:iload_1         
    //    6    9:putfield        #64  <Field int a>
    //    7   12:aload_0         
    //    8   13:iload_2         
    //    9   14:putfield        #66  <Field int b>
    //   10   17:aload_0         
    //   11   18:aload_3         
    //   12   19:putfield        #60  <Field String f>
    //   13   22:iload_1         
    //   14   23:iconst_m1       
    //   15   24:icmpne          55
    //   16   27:iload           4
    //   17   29:istore          5
    //   18   31:aload_0         
    //   19   32:iload           5
    //   20   34:putfield        #68  <Field boolean c>
    //   21   37:iload_2         
    //   22   38:bipush          -2
    //   23   40:icmpne          61
    //   24   43:aload_0         
    //   25   44:iload           4
    //   26   46:putfield        #70  <Field boolean d>
    //   27   49:aload_0         
    //   28   50:iconst_0        
    //   29   51:putfield        #58  <Field boolean e>
    //   30   54:return          
    //   31   55:iconst_0        
    //   32   56:istore          5
    //   33   58:goto            31
    //   34   61:iconst_0        
    //   35   62:istore          4
    //   36   64:goto            43
    }

    private static int a(Context context)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #77  <Method Resources Context.getResources()>
    //    2    4:invokevirtual   #83  <Method DisplayMetrics Resources.getDisplayMetrics()>
    //    3    7:astore_1        
    //    4    8:aload_1         
    //    5    9:getfield        #88  <Field int DisplayMetrics.widthPixels>
    //    6   12:i2f             
    //    7   13:aload_1         
    //    8   14:getfield        #92  <Field float DisplayMetrics.density>
    //    9   17:fdiv            
    //   10   18:f2i             
    //   11   19:ireturn         
    }

    private boolean a()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #64  <Field int a>
    //    2    4:iflt            14
    //    3    7:aload_0         
    //    4    8:getfield        #66  <Field int b>
    //    5   11:ifge            16
    //    6   14:iconst_1        
    //    7   15:ireturn         
    //    8   16:iconst_0        
    //    9   17:ireturn         
    }

    private static int b(Context context)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #77  <Method Resources Context.getResources()>
    //    2    4:invokevirtual   #83  <Method DisplayMetrics Resources.getDisplayMetrics()>
    //    3    7:astore_1        
    //    4    8:aload_1         
    //    5    9:getfield        #95  <Field int DisplayMetrics.heightPixels>
    //    6   12:i2f             
    //    7   13:aload_1         
    //    8   14:getfield        #92  <Field float DisplayMetrics.density>
    //    9   17:fdiv            
    //   10   18:f2i             
    //   11   19:istore_2        
    //   12   20:iload_2         
    //   13   21:sipush          400
    //   14   24:icmpgt          30
    //   15   27:bipush          32
    //   16   29:ireturn         
    //   17   30:iload_2         
    //   18   31:sipush          720
    //   19   34:icmpgt          40
    //   20   37:bipush          50
    //   21   39:ireturn         
    //   22   40:bipush          90
    //   23   42:ireturn         
    }

    public static AdSize createAdSize(AdSize adsize, Context context)
    {
    //    0    0:aload_1         
    //    1    1:ifnull          11
    //    2    4:aload_0         
    //    3    5:invokespecial   #56  <Method boolean a()>
    //    4    8:ifne            24
    //    5   11:aload_0         
    //    6   12:invokespecial   #56  <Method boolean a()>
    //    7   15:ifeq            22
    //    8   18:getstatic       #42  <Field AdSize BANNER>
    //    9   21:astore_0        
    //   10   22:aload_0         
    //   11   23:areturn         
    //   12   24:aload_0         
    //   13   25:getfield        #68  <Field boolean c>
    //   14   28:ifeq            93
    //   15   31:aload_1         
    //   16   32:invokestatic    #99  <Method int a(Context)>
    //   17   35:istore_2        
    //   18   36:aload_0         
    //   19   37:getfield        #70  <Field boolean d>
    //   20   40:ifeq            101
    //   21   43:aload_1         
    //   22   44:invokestatic    #101 <Method int b(Context)>
    //   23   47:istore_3        
    //   24   48:new             #2   <Class AdSize>
    //   25   51:dup             
    //   26   52:iload_2         
    //   27   53:iload_3         
    //   28   54:aload_0         
    //   29   55:getfield        #60  <Field String f>
    //   30   58:invokespecial   #38  <Method void AdSize(int, int, String)>
    //   31   61:astore          4
    //   32   63:aload           4
    //   33   65:aload_0         
    //   34   66:getfield        #70  <Field boolean d>
    //   35   69:putfield        #70  <Field boolean d>
    //   36   72:aload           4
    //   37   74:aload_0         
    //   38   75:getfield        #68  <Field boolean c>
    //   39   78:putfield        #68  <Field boolean c>
    //   40   81:aload           4
    //   41   83:aload_0         
    //   42   84:getfield        #58  <Field boolean e>
    //   43   87:putfield        #58  <Field boolean e>
    //   44   90:aload           4
    //   45   92:areturn         
    //   46   93:aload_0         
    //   47   94:invokevirtual   #105 <Method int getWidth()>
    //   48   97:istore_2        
    //   49   98:goto            36
    //   50  101:aload_0         
    //   51  102:invokevirtual   #108 <Method int getHeight()>
    //   52  105:istore_3        
    //   53  106:goto            48
    }

    public boolean equals(Object obj)
    {
    //    0    0:aload_1         
    //    1    1:instanceof      #2   <Class AdSize>
    //    2    4:ifne            9
    //    3    7:iconst_0        
    //    4    8:ireturn         
    //    5    9:aload_1         
    //    6   10:checkcast       #2   <Class AdSize>
    //    7   13:astore_2        
    //    8   14:aload_0         
    //    9   15:getfield        #64  <Field int a>
    //   10   18:aload_2         
    //   11   19:getfield        #64  <Field int a>
    //   12   22:icmpne          7
    //   13   25:aload_0         
    //   14   26:getfield        #66  <Field int b>
    //   15   29:aload_2         
    //   16   30:getfield        #66  <Field int b>
    //   17   33:icmpne          7
    //   18   36:iconst_1        
    //   19   37:ireturn         
    }

    public transient AdSize findBestSize(AdSize aadsize[])
    {
    //    0    0:dconst_0        
    //    1    1:dstore_2        
    //    2    2:aconst_null     
    //    3    3:astore          4
    //    4    5:aload_1         
    //    5    6:ifnull          110
    //    6    9:aload_1         
    //    7   10:arraylength     
    //    8   11:istore          5
    //    9   13:iconst_0        
    //   10   14:istore          6
    //   11   16:iload           6
    //   12   18:iload           5
    //   13   20:icmpge          110
    //   14   23:aload_1         
    //   15   24:iload           6
    //   16   26:aaload          
    //   17   27:astore          7
    //   18   29:aload_0         
    //   19   30:aload           7
    //   20   32:getfield        #64  <Field int a>
    //   21   35:aload           7
    //   22   37:getfield        #66  <Field int b>
    //   23   40:invokevirtual   #116 <Method boolean isSizeAppropriate(int, int)>
    //   24   43:ifeq            113
    //   25   46:aload           7
    //   26   48:getfield        #64  <Field int a>
    //   27   51:i2d             
    //   28   52:aload           7
    //   29   54:getfield        #66  <Field int b>
    //   30   57:i2d             
    //   31   58:dmul            
    //   32   59:aload_0         
    //   33   60:getfield        #64  <Field int a>
    //   34   63:i2d             
    //   35   64:aload_0         
    //   36   65:getfield        #66  <Field int b>
    //   37   68:i2d             
    //   38   69:dmul            
    //   39   70:ddiv            
    //   40   71:dstore          8
    //   41   73:dload           8
    //   42   75:dconst_1        
    //   43   76:dcmpl           
    //   44   77:ifle            86
    //   45   80:dconst_1        
    //   46   81:dload           8
    //   47   83:ddiv            
    //   48   84:dstore          8
    //   49   86:dload           8
    //   50   88:dload_2         
    //   51   89:dcmpl           
    //   52   90:ifle            113
    //   53   93:aload           7
    //   54   95:astore          10
    //   55   97:iinc            6  1
    //   56  100:aload           10
    //   57  102:astore          4
    //   58  104:dload           8
    //   59  106:dstore_2        
    //   60  107:goto            16
    //   61  110:aload           4
    //   62  112:areturn         
    //   63  113:dload_2         
    //   64  114:dstore          8
    //   65  116:aload           4
    //   66  118:astore          10
    //   67  120:goto            97
    }

    public int getHeight()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #66  <Field int b>
    //    2    4:ifge            17
    //    3    7:new             #118 <Class UnsupportedOperationException>
    //    4   10:dup             
    //    5   11:ldc1            #120 <String "Ad size was not set before getHeight() was called.">
    //    6   13:invokespecial   #123 <Method void UnsupportedOperationException(String)>
    //    7   16:athrow          
    //    8   17:aload_0         
    //    9   18:getfield        #66  <Field int b>
    //   10   21:ireturn         
    }

    public int getHeightInPixels(Context context)
    {
    //    0    0:iconst_1        
    //    1    1:aload_0         
    //    2    2:getfield        #66  <Field int b>
    //    3    5:i2f             
    //    4    6:aload_1         
    //    5    7:invokevirtual   #77  <Method Resources Context.getResources()>
    //    6   10:invokevirtual   #83  <Method DisplayMetrics Resources.getDisplayMetrics()>
    //    7   13:invokestatic    #130 <Method float TypedValue.applyDimension(int, float, DisplayMetrics)>
    //    8   16:f2i             
    //    9   17:ireturn         
    }

    public int getWidth()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #64  <Field int a>
    //    2    4:ifge            17
    //    3    7:new             #118 <Class UnsupportedOperationException>
    //    4   10:dup             
    //    5   11:ldc1            #132 <String "Ad size was not set before getWidth() was called.">
    //    6   13:invokespecial   #123 <Method void UnsupportedOperationException(String)>
    //    7   16:athrow          
    //    8   17:aload_0         
    //    9   18:getfield        #64  <Field int a>
    //   10   21:ireturn         
    }

    public int getWidthInPixels(Context context)
    {
    //    0    0:iconst_1        
    //    1    1:aload_0         
    //    2    2:getfield        #64  <Field int a>
    //    3    5:i2f             
    //    4    6:aload_1         
    //    5    7:invokevirtual   #77  <Method Resources Context.getResources()>
    //    6   10:invokevirtual   #83  <Method DisplayMetrics Resources.getDisplayMetrics()>
    //    7   13:invokestatic    #130 <Method float TypedValue.applyDimension(int, float, DisplayMetrics)>
    //    8   16:f2i             
    //    9   17:ireturn         
    }

    public int hashCode()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #64  <Field int a>
    //    2    4:invokestatic    #140 <Method Integer Integer.valueOf(int)>
    //    3    7:invokevirtual   #142 <Method int Integer.hashCode()>
    //    4   10:bipush          16
    //    5   12:ishl            
    //    6   13:ldc1            #143 <Int 65535>
    //    7   15:aload_0         
    //    8   16:getfield        #66  <Field int b>
    //    9   19:invokestatic    #140 <Method Integer Integer.valueOf(int)>
    //   10   22:invokevirtual   #142 <Method int Integer.hashCode()>
    //   11   25:iand            
    //   12   26:ior             
    //   13   27:ireturn         
    }

    public boolean isAutoHeight()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #70  <Field boolean d>
    //    2    4:ireturn         
    }

    public boolean isCustomAdSize()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #58  <Field boolean e>
    //    2    4:ireturn         
    }

    public boolean isFullWidth()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #68  <Field boolean c>
    //    2    4:ireturn         
    }

    public boolean isSizeAppropriate(int i, int j)
    {
    //    0    0:iload_1         
    //    1    1:i2d             
    //    2    2:ldc2w           #147 <Double 1.25D>
    //    3    5:aload_0         
    //    4    6:getfield        #64  <Field int a>
    //    5    9:i2d             
    //    6   10:dmul            
    //    7   11:dcmpg           
    //    8   12:ifgt            62
    //    9   15:iload_1         
    //   10   16:i2d             
    //   11   17:ldc2w           #149 <Double 0.80000000000000004D>
    //   12   20:aload_0         
    //   13   21:getfield        #64  <Field int a>
    //   14   24:i2d             
    //   15   25:dmul            
    //   16   26:dcmpl           
    //   17   27:iflt            62
    //   18   30:iload_2         
    //   19   31:i2d             
    //   20   32:ldc2w           #147 <Double 1.25D>
    //   21   35:aload_0         
    //   22   36:getfield        #66  <Field int b>
    //   23   39:i2d             
    //   24   40:dmul            
    //   25   41:dcmpg           
    //   26   42:ifgt            62
    //   27   45:iload_2         
    //   28   46:i2d             
    //   29   47:ldc2w           #149 <Double 0.80000000000000004D>
    //   30   50:aload_0         
    //   31   51:getfield        #66  <Field int b>
    //   32   54:i2d             
    //   33   55:dmul            
    //   34   56:dcmpl           
    //   35   57:iflt            62
    //   36   60:iconst_1        
    //   37   61:ireturn         
    //   38   62:iconst_0        
    //   39   63:ireturn         
    }

    public String toString()
    {
    //    0    0:new             #154 <Class StringBuilder>
    //    1    3:dup             
    //    2    4:invokespecial   #155 <Method void StringBuilder()>
    //    3    7:aload_0         
    //    4    8:invokevirtual   #105 <Method int getWidth()>
    //    5   11:invokevirtual   #159 <Method StringBuilder StringBuilder.append(int)>
    //    6   14:ldc1            #161 <String "x">
    //    7   16:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
    //    8   19:aload_0         
    //    9   20:invokevirtual   #108 <Method int getHeight()>
    //   10   23:invokevirtual   #159 <Method StringBuilder StringBuilder.append(int)>
    //   11   26:astore_1        
    //   12   27:aload_0         
    //   13   28:getfield        #60  <Field String f>
    //   14   31:ifnonnull       46
    //   15   34:ldc1            #166 <String "">
    //   16   36:astore_2        
    //   17   37:aload_1         
    //   18   38:aload_2         
    //   19   39:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
    //   20   42:invokevirtual   #168 <Method String StringBuilder.toString()>
    //   21   45:areturn         
    //   22   46:new             #154 <Class StringBuilder>
    //   23   49:dup             
    //   24   50:invokespecial   #155 <Method void StringBuilder()>
    //   25   53:ldc1            #170 <String "_">
    //   26   55:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
    //   27   58:aload_0         
    //   28   59:getfield        #60  <Field String f>
    //   29   62:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
    //   30   65:invokevirtual   #168 <Method String StringBuilder.toString()>
    //   31   68:astore_2        
    //   32   69:goto            37
    }

    public static final int AUTO_HEIGHT = -2;
    public static final AdSize BANNER;
    public static final int FULL_WIDTH = -1;
    public static final AdSize IAB_BANNER;
    public static final AdSize IAB_LEADERBOARD;
    public static final AdSize IAB_MRECT;
    public static final AdSize IAB_WIDE_SKYSCRAPER;
    public static final int LANDSCAPE_AD_HEIGHT = 32;
    public static final int LARGE_AD_HEIGHT = 90;
    public static final int PORTRAIT_AD_HEIGHT = 50;
    public static final AdSize SMART_BANNER;
    private final int a;
    private final int b;
    private boolean c;
    private boolean d;
    private boolean e;
    private String f;
}
