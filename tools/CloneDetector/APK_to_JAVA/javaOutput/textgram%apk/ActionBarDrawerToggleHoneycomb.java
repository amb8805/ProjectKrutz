// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

class ActionBarDrawerToggleHoneycomb
{
    private static class SetIndicatorInfo
    {

        SetIndicatorInfo(Activity activity)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #16  <Method void Object()>
        // try 4 50 handler(s) 51
        //    2    4:aload_0         
        //    3    5:ldc1            #18  <Class ActionBar>
        //    4    7:ldc1            #19  <String "setHomeAsUpIndicator">
        //    5    9:iconst_1        
        //    6   10:anewarray       Class[]
        //    7   13:dup             
        //    8   14:iconst_0        
        //    9   15:ldc1            #23  <Class Drawable>
        //   10   17:aastore         
        //   11   18:invokevirtual   #27  <Method Method Class.getDeclaredMethod(String, Class[])>
        //   12   21:putfield        #29  <Field Method setHomeAsUpIndicator>
        //   13   24:iconst_1        
        //   14   25:anewarray       Class[]
        //   15   28:astore          8
        //   16   30:aload           8
        //   17   32:iconst_0        
        //   18   33:getstatic       #35  <Field Class Integer.TYPE>
        //   19   36:aastore         
        //   20   37:aload_0         
        //   21   38:ldc1            #18  <Class ActionBar>
        //   22   40:ldc1            #36  <String "setHomeActionContentDescription">
        //   23   42:aload           8
        //   24   44:invokevirtual   #27  <Method Method Class.getDeclaredMethod(String, Class[])>
        //   25   47:putfield        #38  <Field Method setHomeActionContentDescription>
        //   26   50:return          
        // catch NoSuchMethodException
        //   27   51:astore_2        
        //   28   52:aload_1         
        //   29   53:ldc1            #39  <Int 0x102002c>
        //   30   55:invokevirtual   #45  <Method View Activity.findViewById(int)>
        //   31   58:astore_3        
        //   32   59:aload_3         
        //   33   60:ifnull          50
        //   34   63:aload_3         
        //   35   64:invokevirtual   #51  <Method android.view.ViewParent View.getParent()>
        //   36   67:checkcast       #53  <Class ViewGroup>
        //   37   70:astore          4
        //   38   72:aload           4
        //   39   74:invokevirtual   #57  <Method int ViewGroup.getChildCount()>
        //   40   77:iconst_2        
        //   41   78:icmpne          50
        //   42   81:aload           4
        //   43   83:iconst_0        
        //   44   84:invokevirtual   #60  <Method View ViewGroup.getChildAt(int)>
        //   45   87:astore          5
        //   46   89:aload           4
        //   47   91:iconst_1        
        //   48   92:invokevirtual   #60  <Method View ViewGroup.getChildAt(int)>
        //   49   95:astore          6
        //   50   97:aload           5
        //   51   99:invokevirtual   #63  <Method int View.getId()>
        //   52  102:ldc1            #39  <Int 0x102002c>
        //   53  104:icmpne          129
        //   54  107:aload           6
        //   55  109:astore          7
        //   56  111:aload           7
        //   57  113:instanceof      #65  <Class ImageView>
        //   58  116:ifeq            50
        //   59  119:aload_0         
        //   60  120:aload           7
        //   61  122:checkcast       #65  <Class ImageView>
        //   62  125:putfield        #67  <Field ImageView upIndicatorView>
        //   63  128:return          
        //   64  129:aload           5
        //   65  131:astore          7
        //   66  133:goto            111
        }

        public Method setHomeActionContentDescription;
        public Method setHomeAsUpIndicator;
        public ImageView upIndicatorView;
    }


    static 
    {
    //    0    0:iconst_1        
    //    1    1:newarray        int[]
    //    2    3:dup             
    //    3    4:iconst_0        
    //    4    5:ldc1            #13  <Int 0x101030b>
    //    5    7:iastore         
    //    6    8:putstatic       #15  <Field int[] THEME_ATTRS>
    //    7   11:return          
    }

    ActionBarDrawerToggleHoneycomb()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #18  <Method void Object()>
    //    2    4:return          
    }

    public static Drawable getThemeUpIndicator(Activity activity)
    {
    //    0    0:aload_0         
    //    1    1:getstatic       #15  <Field int[] THEME_ATTRS>
    //    2    4:invokevirtual   #26  <Method TypedArray Activity.obtainStyledAttributes(int[])>
    //    3    7:astore_1        
    //    4    8:aload_1         
    //    5    9:iconst_0        
    //    6   10:invokevirtual   #32  <Method Drawable TypedArray.getDrawable(int)>
    //    7   13:astore_2        
    //    8   14:aload_1         
    //    9   15:invokevirtual   #35  <Method void TypedArray.recycle()>
    //   10   18:aload_2         
    //   11   19:areturn         
    }

    public static Object setActionBarDescription(Object obj, Activity activity, int i)
    {
    //    0    0:aload_0         
    //    1    1:ifnonnull       13
    //    2    4:new             #41  <Class ActionBarDrawerToggleHoneycomb$SetIndicatorInfo>
    //    3    7:dup             
    //    4    8:aload_1         
    //    5    9:invokespecial   #44  <Method void ActionBarDrawerToggleHoneycomb$SetIndicatorInfo(Activity)>
    //    6   12:astore_0        
    //    7   13:aload_0         
    //    8   14:checkcast       #41  <Class ActionBarDrawerToggleHoneycomb$SetIndicatorInfo>
    //    9   17:astore_3        
    //   10   18:aload_3         
    //   11   19:getfield        #48  <Field Method ActionBarDrawerToggleHoneycomb$SetIndicatorInfo.setHomeAsUpIndicator>
    //   12   22:ifnull          61
    // try 25 61 handler(s) 63
    //   13   25:aload_1         
    //   14   26:invokevirtual   #52  <Method ActionBar Activity.getActionBar()>
    //   15   29:astore          6
    //   16   31:aload_3         
    //   17   32:getfield        #55  <Field Method ActionBarDrawerToggleHoneycomb$SetIndicatorInfo.setHomeActionContentDescription>
    //   18   35:astore          7
    //   19   37:iconst_1        
    //   20   38:anewarray       Object[]
    //   21   41:astore          8
    //   22   43:aload           8
    //   23   45:iconst_0        
    //   24   46:iload_2         
    //   25   47:invokestatic    #61  <Method Integer Integer.valueOf(int)>
    //   26   50:aastore         
    //   27   51:aload           7
    //   28   53:aload           6
    //   29   55:aload           8
    //   30   57:invokevirtual   #67  <Method Object Method.invoke(Object, Object[])>
    //   31   60:pop             
    //   32   61:aload_0         
    //   33   62:areturn         
    // catch Exception
    //   34   63:astore          4
    //   35   65:ldc1            #8   <String "ActionBarDrawerToggleHoneycomb">
    //   36   67:ldc1            #69  <String "Couldn't set content description via JB-MR2 API">
    //   37   69:aload           4
    //   38   71:invokestatic    #75  <Method int Log.w(String, String, Throwable)>
    //   39   74:pop             
    //   40   75:aload_0         
    //   41   76:areturn         
    }

    public static Object setActionBarUpIndicator(Object obj, Activity activity, Drawable drawable, int i)
    {
    //    0    0:aload_0         
    //    1    1:ifnonnull       13
    //    2    4:new             #41  <Class ActionBarDrawerToggleHoneycomb$SetIndicatorInfo>
    //    3    7:dup             
    //    4    8:aload_1         
    //    5    9:invokespecial   #44  <Method void ActionBarDrawerToggleHoneycomb$SetIndicatorInfo(Activity)>
    //    6   12:astore_0        
    //    7   13:aload_0         
    //    8   14:checkcast       #41  <Class ActionBarDrawerToggleHoneycomb$SetIndicatorInfo>
    //    9   17:astore          4
    //   10   19:aload           4
    //   11   21:getfield        #48  <Field Method ActionBarDrawerToggleHoneycomb$SetIndicatorInfo.setHomeAsUpIndicator>
    //   12   24:ifnull          99
    // try 27 83 handler(s) 85
    //   13   27:aload_1         
    //   14   28:invokevirtual   #52  <Method ActionBar Activity.getActionBar()>
    //   15   31:astore          8
    //   16   33:aload           4
    //   17   35:getfield        #48  <Field Method ActionBarDrawerToggleHoneycomb$SetIndicatorInfo.setHomeAsUpIndicator>
    //   18   38:aload           8
    //   19   40:iconst_1        
    //   20   41:anewarray       Object[]
    //   21   44:dup             
    //   22   45:iconst_0        
    //   23   46:aload_2         
    //   24   47:aastore         
    //   25   48:invokevirtual   #67  <Method Object Method.invoke(Object, Object[])>
    //   26   51:pop             
    //   27   52:aload           4
    //   28   54:getfield        #55  <Field Method ActionBarDrawerToggleHoneycomb$SetIndicatorInfo.setHomeActionContentDescription>
    //   29   57:astore          10
    //   30   59:iconst_1        
    //   31   60:anewarray       Object[]
    //   32   63:astore          11
    //   33   65:aload           11
    //   34   67:iconst_0        
    //   35   68:iload_3         
    //   36   69:invokestatic    #61  <Method Integer Integer.valueOf(int)>
    //   37   72:aastore         
    //   38   73:aload           10
    //   39   75:aload           8
    //   40   77:aload           11
    //   41   79:invokevirtual   #67  <Method Object Method.invoke(Object, Object[])>
    //   42   82:pop             
    //   43   83:aload_0         
    //   44   84:areturn         
    // catch Exception
    //   45   85:astore          6
    //   46   87:ldc1            #8   <String "ActionBarDrawerToggleHoneycomb">
    //   47   89:ldc1            #79  <String "Couldn't set home-as-up indicator via JB-MR2 API">
    //   48   91:aload           6
    //   49   93:invokestatic    #75  <Method int Log.w(String, String, Throwable)>
    //   50   96:pop             
    //   51   97:aload_0         
    //   52   98:areturn         
    //   53   99:aload           4
    //   54  101:getfield        #83  <Field ImageView ActionBarDrawerToggleHoneycomb$SetIndicatorInfo.upIndicatorView>
    //   55  104:ifnull          118
    //   56  107:aload           4
    //   57  109:getfield        #83  <Field ImageView ActionBarDrawerToggleHoneycomb$SetIndicatorInfo.upIndicatorView>
    //   58  112:aload_2         
    //   59  113:invokevirtual   #89  <Method void ImageView.setImageDrawable(Drawable)>
    //   60  116:aload_0         
    //   61  117:areturn         
    //   62  118:ldc1            #8   <String "ActionBarDrawerToggleHoneycomb">
    //   63  120:ldc1            #91  <String "Couldn't set home-as-up indicator">
    //   64  122:invokestatic    #94  <Method int Log.w(String, String)>
    //   65  125:pop             
    //   66  126:aload_0         
    //   67  127:areturn         
    }

    private static final String TAG = "ActionBarDrawerToggleHoneycomb";
    private static final int THEME_ATTRS[];
}
