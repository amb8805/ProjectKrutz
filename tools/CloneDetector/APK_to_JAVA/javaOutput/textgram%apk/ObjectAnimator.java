// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.nineoldandroids.animation;

import android.view.View;
import com.nineoldandroids.util.Property;
import com.nineoldandroids.view.animation.AnimatorProxy;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.nineoldandroids.animation:
//            ValueAnimator, PreHoneycombCompat, PropertyValuesHolder, TypeEvaluator

public final class ObjectAnimator extends ValueAnimator
{

    static 
    {
    //    0    0:new             #19  <Class HashMap>
    //    1    3:dup             
    //    2    4:invokespecial   #22  <Method void HashMap()>
    //    3    7:putstatic       #24  <Field Map PROXY_PROPERTIES>
    //    4   10:getstatic       #24  <Field Map PROXY_PROPERTIES>
    //    5   13:ldc1            #26  <String "alpha">
    //    6   15:getstatic       #31  <Field Property PreHoneycombCompat.ALPHA>
    //    7   18:invokeinterface #37  <Method Object Map.put(Object, Object)>
    //    8   23:pop             
    //    9   24:getstatic       #24  <Field Map PROXY_PROPERTIES>
    //   10   27:ldc1            #39  <String "pivotX">
    //   11   29:getstatic       #42  <Field Property PreHoneycombCompat.PIVOT_X>
    //   12   32:invokeinterface #37  <Method Object Map.put(Object, Object)>
    //   13   37:pop             
    //   14   38:getstatic       #24  <Field Map PROXY_PROPERTIES>
    //   15   41:ldc1            #44  <String "pivotY">
    //   16   43:getstatic       #47  <Field Property PreHoneycombCompat.PIVOT_Y>
    //   17   46:invokeinterface #37  <Method Object Map.put(Object, Object)>
    //   18   51:pop             
    //   19   52:getstatic       #24  <Field Map PROXY_PROPERTIES>
    //   20   55:ldc1            #49  <String "translationX">
    //   21   57:getstatic       #52  <Field Property PreHoneycombCompat.TRANSLATION_X>
    //   22   60:invokeinterface #37  <Method Object Map.put(Object, Object)>
    //   23   65:pop             
    //   24   66:getstatic       #24  <Field Map PROXY_PROPERTIES>
    //   25   69:ldc1            #54  <String "translationY">
    //   26   71:getstatic       #57  <Field Property PreHoneycombCompat.TRANSLATION_Y>
    //   27   74:invokeinterface #37  <Method Object Map.put(Object, Object)>
    //   28   79:pop             
    //   29   80:getstatic       #24  <Field Map PROXY_PROPERTIES>
    //   30   83:ldc1            #59  <String "rotation">
    //   31   85:getstatic       #62  <Field Property PreHoneycombCompat.ROTATION>
    //   32   88:invokeinterface #37  <Method Object Map.put(Object, Object)>
    //   33   93:pop             
    //   34   94:getstatic       #24  <Field Map PROXY_PROPERTIES>
    //   35   97:ldc1            #64  <String "rotationX">
    //   36   99:getstatic       #67  <Field Property PreHoneycombCompat.ROTATION_X>
    //   37  102:invokeinterface #37  <Method Object Map.put(Object, Object)>
    //   38  107:pop             
    //   39  108:getstatic       #24  <Field Map PROXY_PROPERTIES>
    //   40  111:ldc1            #69  <String "rotationY">
    //   41  113:getstatic       #72  <Field Property PreHoneycombCompat.ROTATION_Y>
    //   42  116:invokeinterface #37  <Method Object Map.put(Object, Object)>
    //   43  121:pop             
    //   44  122:getstatic       #24  <Field Map PROXY_PROPERTIES>
    //   45  125:ldc1            #74  <String "scaleX">
    //   46  127:getstatic       #77  <Field Property PreHoneycombCompat.SCALE_X>
    //   47  130:invokeinterface #37  <Method Object Map.put(Object, Object)>
    //   48  135:pop             
    //   49  136:getstatic       #24  <Field Map PROXY_PROPERTIES>
    //   50  139:ldc1            #79  <String "scaleY">
    //   51  141:getstatic       #82  <Field Property PreHoneycombCompat.SCALE_Y>
    //   52  144:invokeinterface #37  <Method Object Map.put(Object, Object)>
    //   53  149:pop             
    //   54  150:getstatic       #24  <Field Map PROXY_PROPERTIES>
    //   55  153:ldc1            #84  <String "scrollX">
    //   56  155:getstatic       #87  <Field Property PreHoneycombCompat.SCROLL_X>
    //   57  158:invokeinterface #37  <Method Object Map.put(Object, Object)>
    //   58  163:pop             
    //   59  164:getstatic       #24  <Field Map PROXY_PROPERTIES>
    //   60  167:ldc1            #89  <String "scrollY">
    //   61  169:getstatic       #92  <Field Property PreHoneycombCompat.SCROLL_Y>
    //   62  172:invokeinterface #37  <Method Object Map.put(Object, Object)>
    //   63  177:pop             
    //   64  178:getstatic       #24  <Field Map PROXY_PROPERTIES>
    //   65  181:ldc1            #94  <String "x">
    //   66  183:getstatic       #97  <Field Property PreHoneycombCompat.X>
    //   67  186:invokeinterface #37  <Method Object Map.put(Object, Object)>
    //   68  191:pop             
    //   69  192:getstatic       #24  <Field Map PROXY_PROPERTIES>
    //   70  195:ldc1            #99  <String "y">
    //   71  197:getstatic       #102 <Field Property PreHoneycombCompat.Y>
    //   72  200:invokeinterface #37  <Method Object Map.put(Object, Object)>
    //   73  205:pop             
    //   74  206:return          
    }

    public ObjectAnimator()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #103 <Method void ValueAnimator()>
    //    2    4:return          
    }

    private ObjectAnimator(Object obj, Property property)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #103 <Method void ValueAnimator()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:putfield        #106 <Field Object mTarget>
    //    5    9:aload_0         
    //    6   10:aload_2         
    //    7   11:invokevirtual   #110 <Method void setProperty(Property)>
    //    8   14:return          
    }

    private ObjectAnimator(Object obj, String s)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #103 <Method void ValueAnimator()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:putfield        #106 <Field Object mTarget>
    //    5    9:aload_0         
    //    6   10:aload_2         
    //    7   11:invokevirtual   #115 <Method void setPropertyName(String)>
    //    8   14:return          
    }

    public static transient ObjectAnimator ofFloat(Object obj, Property property, float af[])
    {
    //    0    0:new             #2   <Class ObjectAnimator>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:invokespecial   #119 <Method void ObjectAnimator(Object, Property)>
    //    5    9:astore_3        
    //    6   10:aload_3         
    //    7   11:aload_2         
    //    8   12:invokevirtual   #123 <Method void setFloatValues(float[])>
    //    9   15:aload_3         
    //   10   16:areturn         
    }

    public static transient ObjectAnimator ofFloat(Object obj, String s, float af[])
    {
    //    0    0:new             #2   <Class ObjectAnimator>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:invokespecial   #126 <Method void ObjectAnimator(Object, String)>
    //    5    9:astore_3        
    //    6   10:aload_3         
    //    7   11:aload_2         
    //    8   12:invokevirtual   #123 <Method void setFloatValues(float[])>
    //    9   15:aload_3         
    //   10   16:areturn         
    }

    public static transient ObjectAnimator ofInt(Object obj, Property property, int ai[])
    {
    //    0    0:new             #2   <Class ObjectAnimator>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:invokespecial   #119 <Method void ObjectAnimator(Object, Property)>
    //    5    9:astore_3        
    //    6   10:aload_3         
    //    7   11:aload_2         
    //    8   12:invokevirtual   #132 <Method void setIntValues(int[])>
    //    9   15:aload_3         
    //   10   16:areturn         
    }

    public static transient ObjectAnimator ofInt(Object obj, String s, int ai[])
    {
    //    0    0:new             #2   <Class ObjectAnimator>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:invokespecial   #126 <Method void ObjectAnimator(Object, String)>
    //    5    9:astore_3        
    //    6   10:aload_3         
    //    7   11:aload_2         
    //    8   12:invokevirtual   #132 <Method void setIntValues(int[])>
    //    9   15:aload_3         
    //   10   16:areturn         
    }

    public static transient ObjectAnimator ofObject(Object obj, Property property, TypeEvaluator typeevaluator, Object aobj[])
    {
    //    0    0:new             #2   <Class ObjectAnimator>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:invokespecial   #119 <Method void ObjectAnimator(Object, Property)>
    //    5    9:astore          4
    //    6   11:aload           4
    //    7   13:aload_3         
    //    8   14:invokevirtual   #139 <Method void setObjectValues(Object[])>
    //    9   17:aload           4
    //   10   19:aload_2         
    //   11   20:invokevirtual   #143 <Method void setEvaluator(TypeEvaluator)>
    //   12   23:aload           4
    //   13   25:areturn         
    }

    public static transient ObjectAnimator ofObject(Object obj, String s, TypeEvaluator typeevaluator, Object aobj[])
    {
    //    0    0:new             #2   <Class ObjectAnimator>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:invokespecial   #126 <Method void ObjectAnimator(Object, String)>
    //    5    9:astore          4
    //    6   11:aload           4
    //    7   13:aload_3         
    //    8   14:invokevirtual   #139 <Method void setObjectValues(Object[])>
    //    9   17:aload           4
    //   10   19:aload_2         
    //   11   20:invokevirtual   #143 <Method void setEvaluator(TypeEvaluator)>
    //   12   23:aload           4
    //   13   25:areturn         
    }

    public static transient ObjectAnimator ofPropertyValuesHolder(Object obj, PropertyValuesHolder apropertyvaluesholder[])
    {
    //    0    0:new             #2   <Class ObjectAnimator>
    //    1    3:dup             
    //    2    4:invokespecial   #147 <Method void ObjectAnimator()>
    //    3    7:astore_2        
    //    4    8:aload_2         
    //    5    9:aload_0         
    //    6   10:putfield        #106 <Field Object mTarget>
    //    7   13:aload_2         
    //    8   14:aload_1         
    //    9   15:invokevirtual   #151 <Method void setValues(PropertyValuesHolder[])>
    //   10   18:aload_2         
    //   11   19:areturn         
    }

    void animateValue(float f)
    {
    //    0    0:aload_0         
    //    1    1:fload_1         
    //    2    2:invokespecial   #155 <Method void ValueAnimator.animateValue(float)>
    //    3    5:aload_0         
    //    4    6:getfield        #159 <Field PropertyValuesHolder[] mValues>
    //    5    9:arraylength     
    //    6   10:istore_2        
    //    7   11:iconst_0        
    //    8   12:istore_3        
    //    9   13:iload_3         
    //   10   14:iload_2         
    //   11   15:icmplt          19
    //   12   18:return          
    //   13   19:aload_0         
    //   14   20:getfield        #159 <Field PropertyValuesHolder[] mValues>
    //   15   23:iload_3         
    //   16   24:aaload          
    //   17   25:aload_0         
    //   18   26:getfield        #106 <Field Object mTarget>
    //   19   29:invokevirtual   #165 <Method void PropertyValuesHolder.setAnimatedValue(Object)>
    //   20   32:iinc            3  1
    //   21   35:goto            13
    }

    public ObjectAnimator clone()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #170 <Method ValueAnimator ValueAnimator.clone()>
    //    2    4:checkcast       #2   <Class ObjectAnimator>
    //    3    7:areturn         
    }

    public volatile ValueAnimator clone()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #172 <Method ObjectAnimator clone()>
    //    2    4:areturn         
    }

    public String getPropertyName()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #176 <Field String mPropertyName>
    //    2    4:areturn         
    }

    public Object getTarget()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #106 <Field Object mTarget>
    //    2    4:areturn         
    }

    void initAnimation()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #182 <Field boolean mInitialized>
    //    2    4:ifne            81
    //    3    7:aload_0         
    //    4    8:getfield        #184 <Field Property mProperty>
    //    5   11:ifnonnull       64
    //    6   14:getstatic       #189 <Field boolean AnimatorProxy.NEEDS_PROXY>
    //    7   17:ifeq            64
    //    8   20:aload_0         
    //    9   21:getfield        #106 <Field Object mTarget>
    //   10   24:instanceof      #191 <Class View>
    //   11   27:ifeq            64
    //   12   30:getstatic       #24  <Field Map PROXY_PROPERTIES>
    //   13   33:aload_0         
    //   14   34:getfield        #176 <Field String mPropertyName>
    //   15   37:invokeinterface #195 <Method boolean Map.containsKey(Object)>
    //   16   42:ifeq            64
    //   17   45:aload_0         
    //   18   46:getstatic       #24  <Field Map PROXY_PROPERTIES>
    //   19   49:aload_0         
    //   20   50:getfield        #176 <Field String mPropertyName>
    //   21   53:invokeinterface #199 <Method Object Map.get(Object)>
    //   22   58:checkcast       #201 <Class Property>
    //   23   61:invokevirtual   #110 <Method void setProperty(Property)>
    //   24   64:aload_0         
    //   25   65:getfield        #159 <Field PropertyValuesHolder[] mValues>
    //   26   68:arraylength     
    //   27   69:istore_1        
    //   28   70:iconst_0        
    //   29   71:istore_2        
    //   30   72:iload_2         
    //   31   73:iload_1         
    //   32   74:icmplt          82
    //   33   77:aload_0         
    //   34   78:invokespecial   #203 <Method void ValueAnimator.initAnimation()>
    //   35   81:return          
    //   36   82:aload_0         
    //   37   83:getfield        #159 <Field PropertyValuesHolder[] mValues>
    //   38   86:iload_2         
    //   39   87:aaload          
    //   40   88:aload_0         
    //   41   89:getfield        #106 <Field Object mTarget>
    //   42   92:invokevirtual   #206 <Method void PropertyValuesHolder.setupSetterAndGetter(Object)>
    //   43   95:iinc            2  1
    //   44   98:goto            72
    }

    public ObjectAnimator setDuration(long l)
    {
    //    0    0:aload_0         
    //    1    1:lload_1         
    //    2    2:invokespecial   #211 <Method ValueAnimator ValueAnimator.setDuration(long)>
    //    3    5:pop             
    //    4    6:aload_0         
    //    5    7:areturn         
    }

    public volatile ValueAnimator setDuration(long l)
    {
    //    0    0:aload_0         
    //    1    1:lload_1         
    //    2    2:invokevirtual   #213 <Method ObjectAnimator setDuration(long)>
    //    3    5:areturn         
    }

    public transient void setFloatValues(float af[])
    {
    //    0    0:aload_0         
    //    1    1:getfield        #159 <Field PropertyValuesHolder[] mValues>
    //    2    4:ifnull          15
    //    3    7:aload_0         
    //    4    8:getfield        #159 <Field PropertyValuesHolder[] mValues>
    //    5   11:arraylength     
    //    6   12:ifne            66
    //    7   15:aload_0         
    //    8   16:getfield        #184 <Field Property mProperty>
    //    9   19:ifnull          44
    //   10   22:iconst_1        
    //   11   23:anewarray       PropertyValuesHolder[]
    //   12   26:astore_3        
    //   13   27:aload_3         
    //   14   28:iconst_0        
    //   15   29:aload_0         
    //   16   30:getfield        #184 <Field Property mProperty>
    //   17   33:aload_1         
    //   18   34:invokestatic    #216 <Method PropertyValuesHolder PropertyValuesHolder.ofFloat(Property, float[])>
    //   19   37:aastore         
    //   20   38:aload_0         
    //   21   39:aload_3         
    //   22   40:invokevirtual   #151 <Method void setValues(PropertyValuesHolder[])>
    //   23   43:return          
    //   24   44:iconst_1        
    //   25   45:anewarray       PropertyValuesHolder[]
    //   26   48:astore_2        
    //   27   49:aload_2         
    //   28   50:iconst_0        
    //   29   51:aload_0         
    //   30   52:getfield        #176 <Field String mPropertyName>
    //   31   55:aload_1         
    //   32   56:invokestatic    #219 <Method PropertyValuesHolder PropertyValuesHolder.ofFloat(String, float[])>
    //   33   59:aastore         
    //   34   60:aload_0         
    //   35   61:aload_2         
    //   36   62:invokevirtual   #151 <Method void setValues(PropertyValuesHolder[])>
    //   37   65:return          
    //   38   66:aload_0         
    //   39   67:aload_1         
    //   40   68:invokespecial   #220 <Method void ValueAnimator.setFloatValues(float[])>
    //   41   71:return          
    }

    public transient void setIntValues(int ai[])
    {
    //    0    0:aload_0         
    //    1    1:getfield        #159 <Field PropertyValuesHolder[] mValues>
    //    2    4:ifnull          15
    //    3    7:aload_0         
    //    4    8:getfield        #159 <Field PropertyValuesHolder[] mValues>
    //    5   11:arraylength     
    //    6   12:ifne            66
    //    7   15:aload_0         
    //    8   16:getfield        #184 <Field Property mProperty>
    //    9   19:ifnull          44
    //   10   22:iconst_1        
    //   11   23:anewarray       PropertyValuesHolder[]
    //   12   26:astore_3        
    //   13   27:aload_3         
    //   14   28:iconst_0        
    //   15   29:aload_0         
    //   16   30:getfield        #184 <Field Property mProperty>
    //   17   33:aload_1         
    //   18   34:invokestatic    #223 <Method PropertyValuesHolder PropertyValuesHolder.ofInt(Property, int[])>
    //   19   37:aastore         
    //   20   38:aload_0         
    //   21   39:aload_3         
    //   22   40:invokevirtual   #151 <Method void setValues(PropertyValuesHolder[])>
    //   23   43:return          
    //   24   44:iconst_1        
    //   25   45:anewarray       PropertyValuesHolder[]
    //   26   48:astore_2        
    //   27   49:aload_2         
    //   28   50:iconst_0        
    //   29   51:aload_0         
    //   30   52:getfield        #176 <Field String mPropertyName>
    //   31   55:aload_1         
    //   32   56:invokestatic    #226 <Method PropertyValuesHolder PropertyValuesHolder.ofInt(String, int[])>
    //   33   59:aastore         
    //   34   60:aload_0         
    //   35   61:aload_2         
    //   36   62:invokevirtual   #151 <Method void setValues(PropertyValuesHolder[])>
    //   37   65:return          
    //   38   66:aload_0         
    //   39   67:aload_1         
    //   40   68:invokespecial   #227 <Method void ValueAnimator.setIntValues(int[])>
    //   41   71:return          
    }

    public transient void setObjectValues(Object aobj[])
    {
    //    0    0:aload_0         
    //    1    1:getfield        #159 <Field PropertyValuesHolder[] mValues>
    //    2    4:ifnull          15
    //    3    7:aload_0         
    //    4    8:getfield        #159 <Field PropertyValuesHolder[] mValues>
    //    5   11:arraylength     
    //    6   12:ifne            68
    //    7   15:aload_0         
    //    8   16:getfield        #184 <Field Property mProperty>
    //    9   19:ifnull          45
    //   10   22:iconst_1        
    //   11   23:anewarray       PropertyValuesHolder[]
    //   12   26:astore_3        
    //   13   27:aload_3         
    //   14   28:iconst_0        
    //   15   29:aload_0         
    //   16   30:getfield        #184 <Field Property mProperty>
    //   17   33:aconst_null     
    //   18   34:aload_1         
    //   19   35:invokestatic    #230 <Method PropertyValuesHolder PropertyValuesHolder.ofObject(Property, TypeEvaluator, Object[])>
    //   20   38:aastore         
    //   21   39:aload_0         
    //   22   40:aload_3         
    //   23   41:invokevirtual   #151 <Method void setValues(PropertyValuesHolder[])>
    //   24   44:return          
    //   25   45:iconst_1        
    //   26   46:anewarray       PropertyValuesHolder[]
    //   27   49:astore_2        
    //   28   50:aload_2         
    //   29   51:iconst_0        
    //   30   52:aload_0         
    //   31   53:getfield        #176 <Field String mPropertyName>
    //   32   56:aconst_null     
    //   33   57:aload_1         
    //   34   58:invokestatic    #233 <Method PropertyValuesHolder PropertyValuesHolder.ofObject(String, TypeEvaluator, Object[])>
    //   35   61:aastore         
    //   36   62:aload_0         
    //   37   63:aload_2         
    //   38   64:invokevirtual   #151 <Method void setValues(PropertyValuesHolder[])>
    //   39   67:return          
    //   40   68:aload_0         
    //   41   69:aload_1         
    //   42   70:invokespecial   #234 <Method void ValueAnimator.setObjectValues(Object[])>
    //   43   73:return          
    }

    public void setProperty(Property property)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #159 <Field PropertyValuesHolder[] mValues>
    //    2    4:ifnull          46
    //    3    7:aload_0         
    //    4    8:getfield        #159 <Field PropertyValuesHolder[] mValues>
    //    5   11:iconst_0        
    //    6   12:aaload          
    //    7   13:astore_2        
    //    8   14:aload_2         
    //    9   15:invokevirtual   #236 <Method String PropertyValuesHolder.getPropertyName()>
    //   10   18:astore_3        
    //   11   19:aload_2         
    //   12   20:aload_1         
    //   13   21:invokevirtual   #237 <Method void PropertyValuesHolder.setProperty(Property)>
    //   14   24:aload_0         
    //   15   25:getfield        #241 <Field HashMap mValuesMap>
    //   16   28:aload_3         
    //   17   29:invokevirtual   #244 <Method Object HashMap.remove(Object)>
    //   18   32:pop             
    //   19   33:aload_0         
    //   20   34:getfield        #241 <Field HashMap mValuesMap>
    //   21   37:aload_0         
    //   22   38:getfield        #176 <Field String mPropertyName>
    //   23   41:aload_2         
    //   24   42:invokevirtual   #245 <Method Object HashMap.put(Object, Object)>
    //   25   45:pop             
    //   26   46:aload_0         
    //   27   47:getfield        #184 <Field Property mProperty>
    //   28   50:ifnull          61
    //   29   53:aload_0         
    //   30   54:aload_1         
    //   31   55:invokevirtual   #248 <Method String Property.getName()>
    //   32   58:putfield        #176 <Field String mPropertyName>
    //   33   61:aload_0         
    //   34   62:aload_1         
    //   35   63:putfield        #184 <Field Property mProperty>
    //   36   66:aload_0         
    //   37   67:iconst_0        
    //   38   68:putfield        #182 <Field boolean mInitialized>
    //   39   71:return          
    }

    public void setPropertyName(String s)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #159 <Field PropertyValuesHolder[] mValues>
    //    2    4:ifnull          43
    //    3    7:aload_0         
    //    4    8:getfield        #159 <Field PropertyValuesHolder[] mValues>
    //    5   11:iconst_0        
    //    6   12:aaload          
    //    7   13:astore_2        
    //    8   14:aload_2         
    //    9   15:invokevirtual   #236 <Method String PropertyValuesHolder.getPropertyName()>
    //   10   18:astore_3        
    //   11   19:aload_2         
    //   12   20:aload_1         
    //   13   21:invokevirtual   #249 <Method void PropertyValuesHolder.setPropertyName(String)>
    //   14   24:aload_0         
    //   15   25:getfield        #241 <Field HashMap mValuesMap>
    //   16   28:aload_3         
    //   17   29:invokevirtual   #244 <Method Object HashMap.remove(Object)>
    //   18   32:pop             
    //   19   33:aload_0         
    //   20   34:getfield        #241 <Field HashMap mValuesMap>
    //   21   37:aload_1         
    //   22   38:aload_2         
    //   23   39:invokevirtual   #245 <Method Object HashMap.put(Object, Object)>
    //   24   42:pop             
    //   25   43:aload_0         
    //   26   44:aload_1         
    //   27   45:putfield        #176 <Field String mPropertyName>
    //   28   48:aload_0         
    //   29   49:iconst_0        
    //   30   50:putfield        #182 <Field boolean mInitialized>
    //   31   53:return          
    }

    public void setTarget(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #106 <Field Object mTarget>
    //    2    4:aload_1         
    //    3    5:if_acmpeq       37
    //    4    8:aload_0         
    //    5    9:getfield        #106 <Field Object mTarget>
    //    6   12:astore_2        
    //    7   13:aload_0         
    //    8   14:aload_1         
    //    9   15:putfield        #106 <Field Object mTarget>
    //   10   18:aload_2         
    //   11   19:ifnull          38
    //   12   22:aload_1         
    //   13   23:ifnull          38
    //   14   26:aload_2         
    //   15   27:invokevirtual   #256 <Method Class Object.getClass()>
    //   16   30:aload_1         
    //   17   31:invokevirtual   #256 <Method Class Object.getClass()>
    //   18   34:if_acmpne       38
    //   19   37:return          
    //   20   38:aload_0         
    //   21   39:iconst_0        
    //   22   40:putfield        #182 <Field boolean mInitialized>
    //   23   43:return          
    }

    public void setupEndValues()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #258 <Method void initAnimation()>
    //    2    4:aload_0         
    //    3    5:getfield        #159 <Field PropertyValuesHolder[] mValues>
    //    4    8:arraylength     
    //    5    9:istore_1        
    //    6   10:iconst_0        
    //    7   11:istore_2        
    //    8   12:iload_2         
    //    9   13:iload_1         
    //   10   14:icmplt          18
    //   11   17:return          
    //   12   18:aload_0         
    //   13   19:getfield        #159 <Field PropertyValuesHolder[] mValues>
    //   14   22:iload_2         
    //   15   23:aaload          
    //   16   24:aload_0         
    //   17   25:getfield        #106 <Field Object mTarget>
    //   18   28:invokevirtual   #261 <Method void PropertyValuesHolder.setupEndValue(Object)>
    //   19   31:iinc            2  1
    //   20   34:goto            12
    }

    public void setupStartValues()
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #258 <Method void initAnimation()>
    //    2    4:aload_0         
    //    3    5:getfield        #159 <Field PropertyValuesHolder[] mValues>
    //    4    8:arraylength     
    //    5    9:istore_1        
    //    6   10:iconst_0        
    //    7   11:istore_2        
    //    8   12:iload_2         
    //    9   13:iload_1         
    //   10   14:icmplt          18
    //   11   17:return          
    //   12   18:aload_0         
    //   13   19:getfield        #159 <Field PropertyValuesHolder[] mValues>
    //   14   22:iload_2         
    //   15   23:aaload          
    //   16   24:aload_0         
    //   17   25:getfield        #106 <Field Object mTarget>
    //   18   28:invokevirtual   #265 <Method void PropertyValuesHolder.setupStartValue(Object)>
    //   19   31:iinc            2  1
    //   20   34:goto            12
    }

    public void start()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #268 <Method void ValueAnimator.start()>
    //    2    4:return          
    }

    public String toString()
    {
    //    0    0:new             #271 <Class StringBuilder>
    //    1    3:dup             
    //    2    4:ldc2            #273 <String "ObjectAnimator@">
    //    3    7:invokespecial   #275 <Method void StringBuilder(String)>
    //    4   10:aload_0         
    //    5   11:invokevirtual   #279 <Method int Object.hashCode()>
    //    6   14:invokestatic    #285 <Method String Integer.toHexString(int)>
    //    7   17:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
    //    8   20:ldc2            #291 <String ", target ">
    //    9   23:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
    //   10   26:aload_0         
    //   11   27:getfield        #106 <Field Object mTarget>
    //   12   30:invokevirtual   #294 <Method StringBuilder StringBuilder.append(Object)>
    //   13   33:invokevirtual   #296 <Method String StringBuilder.toString()>
    //   14   36:astore_1        
    //   15   37:aload_0         
    //   16   38:getfield        #159 <Field PropertyValuesHolder[] mValues>
    //   17   41:ifnull          55
    //   18   44:iconst_0        
    //   19   45:istore_2        
    //   20   46:iload_2         
    //   21   47:aload_0         
    //   22   48:getfield        #159 <Field PropertyValuesHolder[] mValues>
    //   23   51:arraylength     
    //   24   52:icmplt          57
    //   25   55:aload_1         
    //   26   56:areturn         
    //   27   57:new             #271 <Class StringBuilder>
    //   28   60:dup             
    //   29   61:aload_1         
    //   30   62:invokestatic    #302 <Method String String.valueOf(Object)>
    //   31   65:invokespecial   #275 <Method void StringBuilder(String)>
    //   32   68:ldc2            #304 <String "\n    ">
    //   33   71:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
    //   34   74:aload_0         
    //   35   75:getfield        #159 <Field PropertyValuesHolder[] mValues>
    //   36   78:iload_2         
    //   37   79:aaload          
    //   38   80:invokevirtual   #305 <Method String PropertyValuesHolder.toString()>
    //   39   83:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
    //   40   86:invokevirtual   #296 <Method String StringBuilder.toString()>
    //   41   89:astore_1        
    //   42   90:iinc            2  1
    //   43   93:goto            46
    }

    private static final boolean DBG;
    private static final Map PROXY_PROPERTIES;
    private Property mProperty;
    private String mPropertyName;
    private Object mTarget;
}
