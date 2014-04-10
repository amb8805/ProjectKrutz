// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.nineoldandroids.animation;

import android.util.Log;
import com.nineoldandroids.util.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// Referenced classes of package com.nineoldandroids.animation:
//            IntEvaluator, FloatEvaluator, KeyframeSet, IntKeyframeSet, 
//            FloatKeyframeSet, Keyframe, TypeEvaluator

public class PropertyValuesHolder
    implements Cloneable
{
    static class FloatPropertyValuesHolder extends PropertyValuesHolder
    {

        public FloatPropertyValuesHolder(Property property, FloatKeyframeSet floatkeyframeset)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aconst_null     
        //    3    3:invokespecial   #15  <Method void PropertyValuesHolder(Property, PropertyValuesHolder)>
        //    4    6:aload_0         
        //    5    7:getstatic       #21  <Field Class Float.TYPE>
        //    6   10:putfield        #24  <Field Class mValueType>
        //    7   13:aload_0         
        //    8   14:aload_2         
        //    9   15:putfield        #28  <Field KeyframeSet mKeyframeSet>
        //   10   18:aload_0         
        //   11   19:aload_0         
        //   12   20:getfield        #28  <Field KeyframeSet mKeyframeSet>
        //   13   23:checkcast       #30  <Class FloatKeyframeSet>
        //   14   26:putfield        #32  <Field FloatKeyframeSet mFloatKeyframeSet>
        //   15   29:aload_1         
        //   16   30:instanceof      #34  <Class FloatProperty>
        //   17   33:ifeq            47
        //   18   36:aload_0         
        //   19   37:aload_0         
        //   20   38:getfield        #38  <Field Property mProperty>
        //   21   41:checkcast       #34  <Class FloatProperty>
        //   22   44:putfield        #40  <Field FloatProperty mFloatProperty>
        //   23   47:return          
        }

        public transient FloatPropertyValuesHolder(Property property, float af[])
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aconst_null     
        //    3    3:invokespecial   #15  <Method void PropertyValuesHolder(Property, PropertyValuesHolder)>
        //    4    6:aload_0         
        //    5    7:aload_2         
        //    6    8:invokevirtual   #45  <Method void setFloatValues(float[])>
        //    7   11:aload_1         
        //    8   12:instanceof      #34  <Class FloatProperty>
        //    9   15:ifeq            29
        //   10   18:aload_0         
        //   11   19:aload_0         
        //   12   20:getfield        #38  <Field Property mProperty>
        //   13   23:checkcast       #34  <Class FloatProperty>
        //   14   26:putfield        #40  <Field FloatProperty mFloatProperty>
        //   15   29:return          
        }

        public FloatPropertyValuesHolder(String s, FloatKeyframeSet floatkeyframeset)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aconst_null     
        //    3    3:invokespecial   #49  <Method void PropertyValuesHolder(String, PropertyValuesHolder)>
        //    4    6:aload_0         
        //    5    7:getstatic       #21  <Field Class Float.TYPE>
        //    6   10:putfield        #24  <Field Class mValueType>
        //    7   13:aload_0         
        //    8   14:aload_2         
        //    9   15:putfield        #28  <Field KeyframeSet mKeyframeSet>
        //   10   18:aload_0         
        //   11   19:aload_0         
        //   12   20:getfield        #28  <Field KeyframeSet mKeyframeSet>
        //   13   23:checkcast       #30  <Class FloatKeyframeSet>
        //   14   26:putfield        #32  <Field FloatKeyframeSet mFloatKeyframeSet>
        //   15   29:return          
        }

        public transient FloatPropertyValuesHolder(String s, float af[])
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aconst_null     
        //    3    3:invokespecial   #49  <Method void PropertyValuesHolder(String, PropertyValuesHolder)>
        //    4    6:aload_0         
        //    5    7:aload_2         
        //    6    8:invokevirtual   #45  <Method void setFloatValues(float[])>
        //    7   11:return          
        }

        void calculateValue(float f)
        {
        //    0    0:aload_0         
        //    1    1:aload_0         
        //    2    2:getfield        #32  <Field FloatKeyframeSet mFloatKeyframeSet>
        //    3    5:fload_1         
        //    4    6:invokevirtual   #56  <Method float FloatKeyframeSet.getFloatValue(float)>
        //    5    9:putfield        #58  <Field float mFloatAnimatedValue>
        //    6   12:return          
        }

        public FloatPropertyValuesHolder clone()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #63  <Method PropertyValuesHolder PropertyValuesHolder.clone()>
        //    2    4:checkcast       #2   <Class PropertyValuesHolder$FloatPropertyValuesHolder>
        //    3    7:astore_1        
        //    4    8:aload_1         
        //    5    9:aload_1         
        //    6   10:getfield        #28  <Field KeyframeSet mKeyframeSet>
        //    7   13:checkcast       #30  <Class FloatKeyframeSet>
        //    8   16:putfield        #32  <Field FloatKeyframeSet mFloatKeyframeSet>
        //    9   19:aload_1         
        //   10   20:areturn         
        }

        public volatile PropertyValuesHolder clone()
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #65  <Method PropertyValuesHolder$FloatPropertyValuesHolder clone()>
        //    2    4:areturn         
        }

        Object getAnimatedValue()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #58  <Field float mFloatAnimatedValue>
        //    2    4:invokestatic    #71  <Method Float Float.valueOf(float)>
        //    3    7:areturn         
        }

        void setAnimatedValue(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #40  <Field FloatProperty mFloatProperty>
        //    2    4:ifnull          20
        //    3    7:aload_0         
        //    4    8:getfield        #40  <Field FloatProperty mFloatProperty>
        //    5   11:aload_1         
        //    6   12:aload_0         
        //    7   13:getfield        #58  <Field float mFloatAnimatedValue>
        //    8   16:invokevirtual   #81  <Method void FloatProperty.setValue(Object, float)>
        //    9   19:return          
        //   10   20:aload_0         
        //   11   21:getfield        #38  <Field Property mProperty>
        //   12   24:ifnull          43
        //   13   27:aload_0         
        //   14   28:getfield        #38  <Field Property mProperty>
        //   15   31:aload_1         
        //   16   32:aload_0         
        //   17   33:getfield        #58  <Field float mFloatAnimatedValue>
        //   18   36:invokestatic    #71  <Method Float Float.valueOf(float)>
        //   19   39:invokevirtual   #87  <Method void Property.set(Object, Object)>
        //   20   42:return          
        //   21   43:aload_0         
        //   22   44:getfield        #91  <Field Method mSetter>
        //   23   47:ifnull          19
        // try 50 76 handler(s) 77 91
        //   24   50:aload_0         
        //   25   51:getfield        #95  <Field Object[] mTmpValueArray>
        //   26   54:iconst_0        
        //   27   55:aload_0         
        //   28   56:getfield        #58  <Field float mFloatAnimatedValue>
        //   29   59:invokestatic    #71  <Method Float Float.valueOf(float)>
        //   30   62:aastore         
        //   31   63:aload_0         
        //   32   64:getfield        #91  <Field Method mSetter>
        //   33   67:aload_1         
        //   34   68:aload_0         
        //   35   69:getfield        #95  <Field Object[] mTmpValueArray>
        //   36   72:invokevirtual   #101 <Method Object Method.invoke(Object, Object[])>
        //   37   75:pop             
        //   38   76:return          
        // catch InvocationTargetException
        //   39   77:astore          4
        //   40   79:ldc1            #103 <String "PropertyValuesHolder">
        //   41   81:aload           4
        //   42   83:invokevirtual   #107 <Method String InvocationTargetException.toString()>
        //   43   86:invokestatic    #113 <Method int Log.e(String, String)>
        //   44   89:pop             
        //   45   90:return          
        // catch IllegalAccessException
        //   46   91:astore_2        
        //   47   92:ldc1            #103 <String "PropertyValuesHolder">
        //   48   94:aload_2         
        //   49   95:invokevirtual   #114 <Method String IllegalAccessException.toString()>
        //   50   98:invokestatic    #113 <Method int Log.e(String, String)>
        //   51  101:pop             
        //   52  102:return          
        }

        public transient void setFloatValues(float af[])
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #115 <Method void PropertyValuesHolder.setFloatValues(float[])>
        //    3    5:aload_0         
        //    4    6:aload_0         
        //    5    7:getfield        #28  <Field KeyframeSet mKeyframeSet>
        //    6   10:checkcast       #30  <Class FloatKeyframeSet>
        //    7   13:putfield        #32  <Field FloatKeyframeSet mFloatKeyframeSet>
        //    8   16:return          
        }

        void setupSetter(Class class1)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #38  <Field Property mProperty>
        //    2    4:ifnull          8
        //    3    7:return          
        //    4    8:aload_0         
        //    5    9:aload_1         
        //    6   10:invokespecial   #119 <Method void PropertyValuesHolder.setupSetter(Class)>
        //    7   13:return          
        }

        float mFloatAnimatedValue;
        FloatKeyframeSet mFloatKeyframeSet;
        private FloatProperty mFloatProperty;
    }

    static class IntPropertyValuesHolder extends PropertyValuesHolder
    {

        public IntPropertyValuesHolder(Property property, IntKeyframeSet intkeyframeset)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aconst_null     
        //    3    3:invokespecial   #15  <Method void PropertyValuesHolder(Property, PropertyValuesHolder)>
        //    4    6:aload_0         
        //    5    7:getstatic       #21  <Field Class Integer.TYPE>
        //    6   10:putfield        #24  <Field Class mValueType>
        //    7   13:aload_0         
        //    8   14:aload_2         
        //    9   15:putfield        #28  <Field KeyframeSet mKeyframeSet>
        //   10   18:aload_0         
        //   11   19:aload_0         
        //   12   20:getfield        #28  <Field KeyframeSet mKeyframeSet>
        //   13   23:checkcast       #30  <Class IntKeyframeSet>
        //   14   26:putfield        #32  <Field IntKeyframeSet mIntKeyframeSet>
        //   15   29:aload_1         
        //   16   30:instanceof      #34  <Class IntProperty>
        //   17   33:ifeq            47
        //   18   36:aload_0         
        //   19   37:aload_0         
        //   20   38:getfield        #38  <Field Property mProperty>
        //   21   41:checkcast       #34  <Class IntProperty>
        //   22   44:putfield        #40  <Field IntProperty mIntProperty>
        //   23   47:return          
        }

        public transient IntPropertyValuesHolder(Property property, int ai[])
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aconst_null     
        //    3    3:invokespecial   #15  <Method void PropertyValuesHolder(Property, PropertyValuesHolder)>
        //    4    6:aload_0         
        //    5    7:aload_2         
        //    6    8:invokevirtual   #45  <Method void setIntValues(int[])>
        //    7   11:aload_1         
        //    8   12:instanceof      #34  <Class IntProperty>
        //    9   15:ifeq            29
        //   10   18:aload_0         
        //   11   19:aload_0         
        //   12   20:getfield        #38  <Field Property mProperty>
        //   13   23:checkcast       #34  <Class IntProperty>
        //   14   26:putfield        #40  <Field IntProperty mIntProperty>
        //   15   29:return          
        }

        public IntPropertyValuesHolder(String s, IntKeyframeSet intkeyframeset)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aconst_null     
        //    3    3:invokespecial   #49  <Method void PropertyValuesHolder(String, PropertyValuesHolder)>
        //    4    6:aload_0         
        //    5    7:getstatic       #21  <Field Class Integer.TYPE>
        //    6   10:putfield        #24  <Field Class mValueType>
        //    7   13:aload_0         
        //    8   14:aload_2         
        //    9   15:putfield        #28  <Field KeyframeSet mKeyframeSet>
        //   10   18:aload_0         
        //   11   19:aload_0         
        //   12   20:getfield        #28  <Field KeyframeSet mKeyframeSet>
        //   13   23:checkcast       #30  <Class IntKeyframeSet>
        //   14   26:putfield        #32  <Field IntKeyframeSet mIntKeyframeSet>
        //   15   29:return          
        }

        public transient IntPropertyValuesHolder(String s, int ai[])
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aconst_null     
        //    3    3:invokespecial   #49  <Method void PropertyValuesHolder(String, PropertyValuesHolder)>
        //    4    6:aload_0         
        //    5    7:aload_2         
        //    6    8:invokevirtual   #45  <Method void setIntValues(int[])>
        //    7   11:return          
        }

        void calculateValue(float f)
        {
        //    0    0:aload_0         
        //    1    1:aload_0         
        //    2    2:getfield        #32  <Field IntKeyframeSet mIntKeyframeSet>
        //    3    5:fload_1         
        //    4    6:invokevirtual   #56  <Method int IntKeyframeSet.getIntValue(float)>
        //    5    9:putfield        #58  <Field int mIntAnimatedValue>
        //    6   12:return          
        }

        public IntPropertyValuesHolder clone()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #63  <Method PropertyValuesHolder PropertyValuesHolder.clone()>
        //    2    4:checkcast       #2   <Class PropertyValuesHolder$IntPropertyValuesHolder>
        //    3    7:astore_1        
        //    4    8:aload_1         
        //    5    9:aload_1         
        //    6   10:getfield        #28  <Field KeyframeSet mKeyframeSet>
        //    7   13:checkcast       #30  <Class IntKeyframeSet>
        //    8   16:putfield        #32  <Field IntKeyframeSet mIntKeyframeSet>
        //    9   19:aload_1         
        //   10   20:areturn         
        }

        public volatile PropertyValuesHolder clone()
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #65  <Method PropertyValuesHolder$IntPropertyValuesHolder clone()>
        //    2    4:areturn         
        }

        Object getAnimatedValue()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #58  <Field int mIntAnimatedValue>
        //    2    4:invokestatic    #71  <Method Integer Integer.valueOf(int)>
        //    3    7:areturn         
        }

        void setAnimatedValue(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #40  <Field IntProperty mIntProperty>
        //    2    4:ifnull          20
        //    3    7:aload_0         
        //    4    8:getfield        #40  <Field IntProperty mIntProperty>
        //    5   11:aload_1         
        //    6   12:aload_0         
        //    7   13:getfield        #58  <Field int mIntAnimatedValue>
        //    8   16:invokevirtual   #81  <Method void IntProperty.setValue(Object, int)>
        //    9   19:return          
        //   10   20:aload_0         
        //   11   21:getfield        #38  <Field Property mProperty>
        //   12   24:ifnull          43
        //   13   27:aload_0         
        //   14   28:getfield        #38  <Field Property mProperty>
        //   15   31:aload_1         
        //   16   32:aload_0         
        //   17   33:getfield        #58  <Field int mIntAnimatedValue>
        //   18   36:invokestatic    #71  <Method Integer Integer.valueOf(int)>
        //   19   39:invokevirtual   #87  <Method void Property.set(Object, Object)>
        //   20   42:return          
        //   21   43:aload_0         
        //   22   44:getfield        #91  <Field Method mSetter>
        //   23   47:ifnull          19
        // try 50 76 handler(s) 77 91
        //   24   50:aload_0         
        //   25   51:getfield        #95  <Field Object[] mTmpValueArray>
        //   26   54:iconst_0        
        //   27   55:aload_0         
        //   28   56:getfield        #58  <Field int mIntAnimatedValue>
        //   29   59:invokestatic    #71  <Method Integer Integer.valueOf(int)>
        //   30   62:aastore         
        //   31   63:aload_0         
        //   32   64:getfield        #91  <Field Method mSetter>
        //   33   67:aload_1         
        //   34   68:aload_0         
        //   35   69:getfield        #95  <Field Object[] mTmpValueArray>
        //   36   72:invokevirtual   #101 <Method Object Method.invoke(Object, Object[])>
        //   37   75:pop             
        //   38   76:return          
        // catch InvocationTargetException
        //   39   77:astore          4
        //   40   79:ldc1            #103 <String "PropertyValuesHolder">
        //   41   81:aload           4
        //   42   83:invokevirtual   #107 <Method String InvocationTargetException.toString()>
        //   43   86:invokestatic    #113 <Method int Log.e(String, String)>
        //   44   89:pop             
        //   45   90:return          
        // catch IllegalAccessException
        //   46   91:astore_2        
        //   47   92:ldc1            #103 <String "PropertyValuesHolder">
        //   48   94:aload_2         
        //   49   95:invokevirtual   #114 <Method String IllegalAccessException.toString()>
        //   50   98:invokestatic    #113 <Method int Log.e(String, String)>
        //   51  101:pop             
        //   52  102:return          
        }

        public transient void setIntValues(int ai[])
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #115 <Method void PropertyValuesHolder.setIntValues(int[])>
        //    3    5:aload_0         
        //    4    6:aload_0         
        //    5    7:getfield        #28  <Field KeyframeSet mKeyframeSet>
        //    6   10:checkcast       #30  <Class IntKeyframeSet>
        //    7   13:putfield        #32  <Field IntKeyframeSet mIntKeyframeSet>
        //    8   16:return          
        }

        void setupSetter(Class class1)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #38  <Field Property mProperty>
        //    2    4:ifnull          8
        //    3    7:return          
        //    4    8:aload_0         
        //    5    9:aload_1         
        //    6   10:invokespecial   #119 <Method void PropertyValuesHolder.setupSetter(Class)>
        //    7   13:return          
        }

        int mIntAnimatedValue;
        IntKeyframeSet mIntKeyframeSet;
        private IntProperty mIntProperty;
    }


    static 
    {
    //    0    0:new             #39  <Class IntEvaluator>
    //    1    3:dup             
    //    2    4:invokespecial   #42  <Method void IntEvaluator()>
    //    3    7:putstatic       #44  <Field TypeEvaluator sIntEvaluator>
    //    4   10:new             #46  <Class FloatEvaluator>
    //    5   13:dup             
    //    6   14:invokespecial   #47  <Method void FloatEvaluator()>
    //    7   17:putstatic       #49  <Field TypeEvaluator sFloatEvaluator>
    //    8   20:bipush          6
    //    9   22:anewarray       Class[]
    //   10   25:astore_0        
    //   11   26:aload_0         
    //   12   27:iconst_0        
    //   13   28:getstatic       #56  <Field Class Float.TYPE>
    //   14   31:aastore         
    //   15   32:aload_0         
    //   16   33:iconst_1        
    //   17   34:ldc1            #53  <Class Float>
    //   18   36:aastore         
    //   19   37:aload_0         
    //   20   38:iconst_2        
    //   21   39:getstatic       #59  <Field Class Double.TYPE>
    //   22   42:aastore         
    //   23   43:aload_0         
    //   24   44:iconst_3        
    //   25   45:getstatic       #62  <Field Class Integer.TYPE>
    //   26   48:aastore         
    //   27   49:aload_0         
    //   28   50:iconst_4        
    //   29   51:ldc1            #58  <Class Double>
    //   30   53:aastore         
    //   31   54:aload_0         
    //   32   55:iconst_5        
    //   33   56:ldc1            #61  <Class Integer>
    //   34   58:aastore         
    //   35   59:aload_0         
    //   36   60:putstatic       #64  <Field Class[] FLOAT_VARIANTS>
    //   37   63:bipush          6
    //   38   65:anewarray       Class[]
    //   39   68:astore_1        
    //   40   69:aload_1         
    //   41   70:iconst_0        
    //   42   71:getstatic       #62  <Field Class Integer.TYPE>
    //   43   74:aastore         
    //   44   75:aload_1         
    //   45   76:iconst_1        
    //   46   77:ldc1            #61  <Class Integer>
    //   47   79:aastore         
    //   48   80:aload_1         
    //   49   81:iconst_2        
    //   50   82:getstatic       #56  <Field Class Float.TYPE>
    //   51   85:aastore         
    //   52   86:aload_1         
    //   53   87:iconst_3        
    //   54   88:getstatic       #59  <Field Class Double.TYPE>
    //   55   91:aastore         
    //   56   92:aload_1         
    //   57   93:iconst_4        
    //   58   94:ldc1            #53  <Class Float>
    //   59   96:aastore         
    //   60   97:aload_1         
    //   61   98:iconst_5        
    //   62   99:ldc1            #58  <Class Double>
    //   63  101:aastore         
    //   64  102:aload_1         
    //   65  103:putstatic       #66  <Field Class[] INTEGER_VARIANTS>
    //   66  106:bipush          6
    //   67  108:anewarray       Class[]
    //   68  111:astore_2        
    //   69  112:aload_2         
    //   70  113:iconst_0        
    //   71  114:getstatic       #59  <Field Class Double.TYPE>
    //   72  117:aastore         
    //   73  118:aload_2         
    //   74  119:iconst_1        
    //   75  120:ldc1            #58  <Class Double>
    //   76  122:aastore         
    //   77  123:aload_2         
    //   78  124:iconst_2        
    //   79  125:getstatic       #56  <Field Class Float.TYPE>
    //   80  128:aastore         
    //   81  129:aload_2         
    //   82  130:iconst_3        
    //   83  131:getstatic       #62  <Field Class Integer.TYPE>
    //   84  134:aastore         
    //   85  135:aload_2         
    //   86  136:iconst_4        
    //   87  137:ldc1            #53  <Class Float>
    //   88  139:aastore         
    //   89  140:aload_2         
    //   90  141:iconst_5        
    //   91  142:ldc1            #61  <Class Integer>
    //   92  144:aastore         
    //   93  145:aload_2         
    //   94  146:putstatic       #68  <Field Class[] DOUBLE_VARIANTS>
    //   95  149:new             #70  <Class HashMap>
    //   96  152:dup             
    //   97  153:invokespecial   #71  <Method void HashMap()>
    //   98  156:putstatic       #73  <Field HashMap sSetterPropertyMap>
    //   99  159:new             #70  <Class HashMap>
    //  100  162:dup             
    //  101  163:invokespecial   #71  <Method void HashMap()>
    //  102  166:putstatic       #75  <Field HashMap sGetterPropertyMap>
    //  103  169:return          
    }

    private PropertyValuesHolder(Property property)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #77  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aconst_null     
    //    4    6:putfield        #79  <Field Method mSetter>
    //    5    9:aload_0         
    //    6   10:aconst_null     
    //    7   11:putfield        #81  <Field Method mGetter>
    //    8   14:aload_0         
    //    9   15:aconst_null     
    //   10   16:putfield        #83  <Field KeyframeSet mKeyframeSet>
    //   11   19:aload_0         
    //   12   20:new             #85  <Class ReentrantReadWriteLock>
    //   13   23:dup             
    //   14   24:invokespecial   #86  <Method void ReentrantReadWriteLock()>
    //   15   27:putfield        #88  <Field ReentrantReadWriteLock mPropertyMapLock>
    //   16   30:aload_0         
    //   17   31:iconst_1        
    //   18   32:anewarray       Object[]
    //   19   35:putfield        #90  <Field Object[] mTmpValueArray>
    //   20   38:aload_0         
    //   21   39:aload_1         
    //   22   40:putfield        #92  <Field Property mProperty>
    //   23   43:aload_1         
    //   24   44:ifnull          55
    //   25   47:aload_0         
    //   26   48:aload_1         
    //   27   49:invokevirtual   #98  <Method String Property.getName()>
    //   28   52:putfield        #100 <Field String mPropertyName>
    //   29   55:return          
    }

    PropertyValuesHolder(Property property, PropertyValuesHolder propertyvaluesholder)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #103 <Method void PropertyValuesHolder(Property)>
    //    3    5:return          
    }

    private PropertyValuesHolder(String s)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #77  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aconst_null     
    //    4    6:putfield        #79  <Field Method mSetter>
    //    5    9:aload_0         
    //    6   10:aconst_null     
    //    7   11:putfield        #81  <Field Method mGetter>
    //    8   14:aload_0         
    //    9   15:aconst_null     
    //   10   16:putfield        #83  <Field KeyframeSet mKeyframeSet>
    //   11   19:aload_0         
    //   12   20:new             #85  <Class ReentrantReadWriteLock>
    //   13   23:dup             
    //   14   24:invokespecial   #86  <Method void ReentrantReadWriteLock()>
    //   15   27:putfield        #88  <Field ReentrantReadWriteLock mPropertyMapLock>
    //   16   30:aload_0         
    //   17   31:iconst_1        
    //   18   32:anewarray       Object[]
    //   19   35:putfield        #90  <Field Object[] mTmpValueArray>
    //   20   38:aload_0         
    //   21   39:aload_1         
    //   22   40:putfield        #100 <Field String mPropertyName>
    //   23   43:return          
    }

    PropertyValuesHolder(String s, PropertyValuesHolder propertyvaluesholder)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #107 <Method void PropertyValuesHolder(String)>
    //    3    5:return          
    }

    static String getMethodName(String s, String s1)
    {
    //    0    0:aload_1         
    //    1    1:ifnull          11
    //    2    4:aload_1         
    //    3    5:invokevirtual   #115 <Method int String.length()>
    //    4    8:ifne            13
    //    5   11:aload_0         
    //    6   12:areturn         
    //    7   13:aload_1         
    //    8   14:iconst_0        
    //    9   15:invokevirtual   #119 <Method char String.charAt(int)>
    //   10   18:invokestatic    #125 <Method char Character.toUpperCase(char)>
    //   11   21:istore_2        
    //   12   22:aload_1         
    //   13   23:iconst_1        
    //   14   24:invokevirtual   #129 <Method String String.substring(int)>
    //   15   27:astore_3        
    //   16   28:new             #131 <Class StringBuilder>
    //   17   31:dup             
    //   18   32:aload_0         
    //   19   33:invokestatic    #135 <Method String String.valueOf(Object)>
    //   20   36:invokespecial   #136 <Method void StringBuilder(String)>
    //   21   39:iload_2         
    //   22   40:invokevirtual   #140 <Method StringBuilder StringBuilder.append(char)>
    //   23   43:aload_3         
    //   24   44:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
    //   25   47:invokevirtual   #146 <Method String StringBuilder.toString()>
    //   26   50:areturn         
    }

    private Method getPropertyFunction(Class class1, String s, Class class2)
    {
    //    0    0:aconst_null     
    //    1    1:astore          4
    //    2    3:aload_2         
    //    3    4:aload_0         
    //    4    5:getfield        #100 <Field String mPropertyName>
    //    5    8:invokestatic    #152 <Method String getMethodName(String, String)>
    //    6   11:astore          5
    //    7   13:aload_3         
    //    8   14:ifnonnull       93
    // try 17 26 handler(s) 33
    //    9   17:aload_1         
    //   10   18:aload           5
    //   11   20:aconst_null     
    //   12   21:invokevirtual   #156 <Method Method Class.getMethod(String, Class[])>
    //   13   24:astore          17
    //   14   26:aload           17
    //   15   28:astore          4
    //   16   30:aload           4
    //   17   32:areturn         
    // catch NoSuchMethodException
    //   18   33:astore          14
    // try 35 50 handler(s) 53
    //   19   35:aload_1         
    //   20   36:aload           5
    //   21   38:aconst_null     
    //   22   39:invokevirtual   #159 <Method Method Class.getDeclaredMethod(String, Class[])>
    //   23   42:astore          4
    //   24   44:aload           4
    //   25   46:iconst_1        
    //   26   47:invokevirtual   #165 <Method void Method.setAccessible(boolean)>
    //   27   50:goto            30
    // catch NoSuchMethodException
    //   28   53:astore          15
    //   29   55:ldc1            #167 <String "PropertyValuesHolder">
    //   30   57:new             #131 <Class StringBuilder>
    //   31   60:dup             
    //   32   61:ldc1            #169 <String "Couldn't find no-arg method for property ">
    //   33   63:invokespecial   #136 <Method void StringBuilder(String)>
    //   34   66:aload_0         
    //   35   67:getfield        #100 <Field String mPropertyName>
    //   36   70:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
    //   37   73:ldc1            #171 <String ": ">
    //   38   75:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
    //   39   78:aload           14
    //   40   80:invokevirtual   #174 <Method StringBuilder StringBuilder.append(Object)>
    //   41   83:invokevirtual   #146 <Method String StringBuilder.toString()>
    //   42   86:invokestatic    #180 <Method int Log.e(String, String)>
    //   43   89:pop             
    //   44   90:goto            30
    //   45   93:iconst_1        
    //   46   94:anewarray       Class[]
    //   47   97:astore          6
    //   48   99:aload_0         
    //   49  100:getfield        #182 <Field Class mValueType>
    //   50  103:ldc1            #53  <Class Float>
    //   51  105:invokevirtual   #186 <Method boolean Object.equals(Object)>
    //   52  108:ifeq            171
    //   53  111:getstatic       #64  <Field Class[] FLOAT_VARIANTS>
    //   54  114:astore          7
    //   55  116:aload           7
    //   56  118:arraylength     
    //   57  119:istore          8
    //   58  121:iconst_0        
    //   59  122:istore          9
    //   60  124:iload           9
    //   61  126:iload           8
    //   62  128:icmplt          228
    //   63  131:ldc1            #167 <String "PropertyValuesHolder">
    //   64  133:new             #131 <Class StringBuilder>
    //   65  136:dup             
    //   66  137:ldc1            #188 <String "Couldn't find setter/getter for property ">
    //   67  139:invokespecial   #136 <Method void StringBuilder(String)>
    //   68  142:aload_0         
    //   69  143:getfield        #100 <Field String mPropertyName>
    //   70  146:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
    //   71  149:ldc1            #190 <String " with value type ">
    //   72  151:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
    //   73  154:aload_0         
    //   74  155:getfield        #182 <Field Class mValueType>
    //   75  158:invokevirtual   #174 <Method StringBuilder StringBuilder.append(Object)>
    //   76  161:invokevirtual   #146 <Method String StringBuilder.toString()>
    //   77  164:invokestatic    #180 <Method int Log.e(String, String)>
    //   78  167:pop             
    //   79  168:goto            30
    //   80  171:aload_0         
    //   81  172:getfield        #182 <Field Class mValueType>
    //   82  175:ldc1            #61  <Class Integer>
    //   83  177:invokevirtual   #186 <Method boolean Object.equals(Object)>
    //   84  180:ifeq            191
    //   85  183:getstatic       #66  <Field Class[] INTEGER_VARIANTS>
    //   86  186:astore          7
    //   87  188:goto            116
    //   88  191:aload_0         
    //   89  192:getfield        #182 <Field Class mValueType>
    //   90  195:ldc1            #58  <Class Double>
    //   91  197:invokevirtual   #186 <Method boolean Object.equals(Object)>
    //   92  200:ifeq            211
    //   93  203:getstatic       #68  <Field Class[] DOUBLE_VARIANTS>
    //   94  206:astore          7
    //   95  208:goto            116
    //   96  211:iconst_1        
    //   97  212:anewarray       Class[]
    //   98  215:astore          7
    //   99  217:aload           7
    //  100  219:iconst_0        
    //  101  220:aload_0         
    //  102  221:getfield        #182 <Field Class mValueType>
    //  103  224:aastore         
    //  104  225:goto            116
    //  105  228:aload           7
    //  106  230:iload           9
    //  107  232:aaload          
    //  108  233:astore          10
    //  109  235:aload           6
    //  110  237:iconst_0        
    //  111  238:aload           10
    //  112  240:aastore         
    // try 241 257 handler(s) 260
    //  113  241:aload_1         
    //  114  242:aload           5
    //  115  244:aload           6
    //  116  246:invokevirtual   #156 <Method Method Class.getMethod(String, Class[])>
    //  117  249:astore          4
    //  118  251:aload_0         
    //  119  252:aload           10
    //  120  254:putfield        #182 <Field Class mValueType>
    //  121  257:aload           4
    //  122  259:areturn         
    // catch NoSuchMethodException
    //  123  260:astore          11
    // try 262 284 handler(s) 287
    //  124  262:aload_1         
    //  125  263:aload           5
    //  126  265:aload           6
    //  127  267:invokevirtual   #159 <Method Method Class.getDeclaredMethod(String, Class[])>
    //  128  270:astore          4
    //  129  272:aload           4
    //  130  274:iconst_1        
    //  131  275:invokevirtual   #165 <Method void Method.setAccessible(boolean)>
    //  132  278:aload_0         
    //  133  279:aload           10
    //  134  281:putfield        #182 <Field Class mValueType>
    //  135  284:aload           4
    //  136  286:areturn         
    // catch NoSuchMethodException
    //  137  287:astore          12
    //  138  289:iinc            9  1
    //  139  292:goto            124
    }

    public static transient PropertyValuesHolder ofFloat(Property property, float af[])
    {
    //    0    0:new             #194 <Class PropertyValuesHolder$FloatPropertyValuesHolder>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:invokespecial   #197 <Method void PropertyValuesHolder$FloatPropertyValuesHolder(Property, float[])>
    //    5    9:areturn         
    }

    public static transient PropertyValuesHolder ofFloat(String s, float af[])
    {
    //    0    0:new             #194 <Class PropertyValuesHolder$FloatPropertyValuesHolder>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:invokespecial   #201 <Method void PropertyValuesHolder$FloatPropertyValuesHolder(String, float[])>
    //    5    9:areturn         
    }

    public static transient PropertyValuesHolder ofInt(Property property, int ai[])
    {
    //    0    0:new             #205 <Class PropertyValuesHolder$IntPropertyValuesHolder>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:invokespecial   #208 <Method void PropertyValuesHolder$IntPropertyValuesHolder(Property, int[])>
    //    5    9:areturn         
    }

    public static transient PropertyValuesHolder ofInt(String s, int ai[])
    {
    //    0    0:new             #205 <Class PropertyValuesHolder$IntPropertyValuesHolder>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:invokespecial   #212 <Method void PropertyValuesHolder$IntPropertyValuesHolder(String, int[])>
    //    5    9:areturn         
    }

    public static transient PropertyValuesHolder ofKeyframe(Property property, Keyframe akeyframe[])
    {
    //    0    0:aload_1         
    //    1    1:invokestatic    #219 <Method KeyframeSet KeyframeSet.ofKeyframe(Keyframe[])>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:instanceof      #221 <Class IntKeyframeSet>
    //    5    9:ifeq            25
    //    6   12:new             #205 <Class PropertyValuesHolder$IntPropertyValuesHolder>
    //    7   15:dup             
    //    8   16:aload_0         
    //    9   17:aload_2         
    //   10   18:checkcast       #221 <Class IntKeyframeSet>
    //   11   21:invokespecial   #224 <Method void PropertyValuesHolder$IntPropertyValuesHolder(Property, IntKeyframeSet)>
    //   12   24:areturn         
    //   13   25:aload_2         
    //   14   26:instanceof      #226 <Class FloatKeyframeSet>
    //   15   29:ifeq            45
    //   16   32:new             #194 <Class PropertyValuesHolder$FloatPropertyValuesHolder>
    //   17   35:dup             
    //   18   36:aload_0         
    //   19   37:aload_2         
    //   20   38:checkcast       #226 <Class FloatKeyframeSet>
    //   21   41:invokespecial   #229 <Method void PropertyValuesHolder$FloatPropertyValuesHolder(Property, FloatKeyframeSet)>
    //   22   44:areturn         
    //   23   45:new             #2   <Class PropertyValuesHolder>
    //   24   48:dup             
    //   25   49:aload_0         
    //   26   50:invokespecial   #103 <Method void PropertyValuesHolder(Property)>
    //   27   53:astore_3        
    //   28   54:aload_3         
    //   29   55:aload_2         
    //   30   56:putfield        #83  <Field KeyframeSet mKeyframeSet>
    //   31   59:aload_3         
    //   32   60:aload_1         
    //   33   61:iconst_0        
    //   34   62:aaload          
    //   35   63:invokevirtual   #235 <Method Class Keyframe.getType()>
    //   36   66:putfield        #182 <Field Class mValueType>
    //   37   69:aload_3         
    //   38   70:areturn         
    }

    public static transient PropertyValuesHolder ofKeyframe(String s, Keyframe akeyframe[])
    {
    //    0    0:aload_1         
    //    1    1:invokestatic    #219 <Method KeyframeSet KeyframeSet.ofKeyframe(Keyframe[])>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:instanceof      #221 <Class IntKeyframeSet>
    //    5    9:ifeq            25
    //    6   12:new             #205 <Class PropertyValuesHolder$IntPropertyValuesHolder>
    //    7   15:dup             
    //    8   16:aload_0         
    //    9   17:aload_2         
    //   10   18:checkcast       #221 <Class IntKeyframeSet>
    //   11   21:invokespecial   #239 <Method void PropertyValuesHolder$IntPropertyValuesHolder(String, IntKeyframeSet)>
    //   12   24:areturn         
    //   13   25:aload_2         
    //   14   26:instanceof      #226 <Class FloatKeyframeSet>
    //   15   29:ifeq            45
    //   16   32:new             #194 <Class PropertyValuesHolder$FloatPropertyValuesHolder>
    //   17   35:dup             
    //   18   36:aload_0         
    //   19   37:aload_2         
    //   20   38:checkcast       #226 <Class FloatKeyframeSet>
    //   21   41:invokespecial   #242 <Method void PropertyValuesHolder$FloatPropertyValuesHolder(String, FloatKeyframeSet)>
    //   22   44:areturn         
    //   23   45:new             #2   <Class PropertyValuesHolder>
    //   24   48:dup             
    //   25   49:aload_0         
    //   26   50:invokespecial   #107 <Method void PropertyValuesHolder(String)>
    //   27   53:astore_3        
    //   28   54:aload_3         
    //   29   55:aload_2         
    //   30   56:putfield        #83  <Field KeyframeSet mKeyframeSet>
    //   31   59:aload_3         
    //   32   60:aload_1         
    //   33   61:iconst_0        
    //   34   62:aaload          
    //   35   63:invokevirtual   #235 <Method Class Keyframe.getType()>
    //   36   66:putfield        #182 <Field Class mValueType>
    //   37   69:aload_3         
    //   38   70:areturn         
    }

    public static transient PropertyValuesHolder ofObject(Property property, TypeEvaluator typeevaluator, Object aobj[])
    {
    //    0    0:new             #2   <Class PropertyValuesHolder>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #103 <Method void PropertyValuesHolder(Property)>
    //    4    8:astore_3        
    //    5    9:aload_3         
    //    6   10:aload_2         
    //    7   11:invokevirtual   #248 <Method void setObjectValues(Object[])>
    //    8   14:aload_3         
    //    9   15:aload_1         
    //   10   16:invokevirtual   #252 <Method void setEvaluator(TypeEvaluator)>
    //   11   19:aload_3         
    //   12   20:areturn         
    }

    public static transient PropertyValuesHolder ofObject(String s, TypeEvaluator typeevaluator, Object aobj[])
    {
    //    0    0:new             #2   <Class PropertyValuesHolder>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #107 <Method void PropertyValuesHolder(String)>
    //    4    8:astore_3        
    //    5    9:aload_3         
    //    6   10:aload_2         
    //    7   11:invokevirtual   #248 <Method void setObjectValues(Object[])>
    //    8   14:aload_3         
    //    9   15:aload_1         
    //   10   16:invokevirtual   #252 <Method void setEvaluator(TypeEvaluator)>
    //   11   19:aload_3         
    //   12   20:areturn         
    }

    private void setupGetter(Class class1)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:aload_1         
    //    3    3:getstatic       #75  <Field HashMap sGetterPropertyMap>
    //    4    6:ldc2            #257 <String "get">
    //    5    9:aconst_null     
    //    6   10:invokespecial   #261 <Method Method setupSetterOrGetter(Class, HashMap, String, Class)>
    //    7   13:putfield        #81  <Field Method mGetter>
    //    8   16:return          
    }

    private Method setupSetterOrGetter(Class class1, HashMap hashmap, String s, Class class2)
    {
    // try 0 20 handler(s) 104
    //    0    0:aload_0         
    //    1    1:getfield        #88  <Field ReentrantReadWriteLock mPropertyMapLock>
    //    2    4:invokevirtual   #265 <Method java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock ReentrantReadWriteLock.writeLock()>
    //    3    7:invokevirtual   #270 <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.lock()>
    //    4   10:aload_2         
    //    5   11:aload_1         
    //    6   12:invokevirtual   #273 <Method Object HashMap.get(Object)>
    //    7   15:checkcast       #70  <Class HashMap>
    //    8   18:astore          6
    //    9   20:aconst_null     
    //   10   21:astore          7
    //   11   23:aload           6
    //   12   25:ifnull          42
    // try 28 42 handler(s) 104
    //   13   28:aload           6
    //   14   30:aload_0         
    //   15   31:getfield        #100 <Field String mPropertyName>
    //   16   34:invokevirtual   #273 <Method Object HashMap.get(Object)>
    //   17   37:checkcast       #161 <Class Method>
    //   18   40:astore          7
    //   19   42:aload           7
    //   20   44:ifnonnull       91
    // try 47 57 handler(s) 104
    //   21   47:aload_0         
    //   22   48:aload_1         
    //   23   49:aload_3         
    //   24   50:aload           4
    //   25   52:invokespecial   #275 <Method Method getPropertyFunction(Class, String, Class)>
    //   26   55:astore          7
    //   27   57:aload           6
    //   28   59:ifnonnull       79
    // try 62 79 handler(s) 104
    //   29   62:new             #70  <Class HashMap>
    //   30   65:dup             
    //   31   66:invokespecial   #71  <Method void HashMap()>
    //   32   69:astore          6
    //   33   71:aload_2         
    //   34   72:aload_1         
    //   35   73:aload           6
    //   36   75:invokevirtual   #279 <Method Object HashMap.put(Object, Object)>
    //   37   78:pop             
    // try 79 91 handler(s) 104
    //   38   79:aload           6
    //   39   81:aload_0         
    //   40   82:getfield        #100 <Field String mPropertyName>
    //   41   85:aload           7
    //   42   87:invokevirtual   #279 <Method Object HashMap.put(Object, Object)>
    //   43   90:pop             
    //   44   91:aload_0         
    //   45   92:getfield        #88  <Field ReentrantReadWriteLock mPropertyMapLock>
    //   46   95:invokevirtual   #265 <Method java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock ReentrantReadWriteLock.writeLock()>
    //   47   98:invokevirtual   #282 <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.unlock()>
    //   48  101:aload           7
    //   49  103:areturn         
    // finally
    //   50  104:astore          5
    //   51  106:aload_0         
    //   52  107:getfield        #88  <Field ReentrantReadWriteLock mPropertyMapLock>
    //   53  110:invokevirtual   #265 <Method java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock ReentrantReadWriteLock.writeLock()>
    //   54  113:invokevirtual   #282 <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.unlock()>
    //   55  116:aload           5
    //   56  118:athrow          
    }

    private void setupValue(Object obj, Keyframe keyframe)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #92  <Field Property mProperty>
    //    2    4:ifnull          19
    //    3    7:aload_2         
    //    4    8:aload_0         
    //    5    9:getfield        #92  <Field Property mProperty>
    //    6   12:aload_1         
    //    7   13:invokevirtual   #289 <Method Object Property.get(Object)>
    //    8   16:invokevirtual   #293 <Method void Keyframe.setValue(Object)>
    // try 19 34 handler(s) 51 65
    //    9   19:aload_0         
    //   10   20:getfield        #81  <Field Method mGetter>
    //   11   23:ifnonnull       34
    //   12   26:aload_0         
    //   13   27:aload_1         
    //   14   28:invokevirtual   #296 <Method Class Object.getClass()>
    //   15   31:invokespecial   #298 <Method void setupGetter(Class)>
    // try 34 50 handler(s) 51 65
    //   16   34:aload_2         
    //   17   35:aload_0         
    //   18   36:getfield        #81  <Field Method mGetter>
    //   19   39:aload_1         
    //   20   40:iconst_0        
    //   21   41:anewarray       Object[]
    //   22   44:invokevirtual   #302 <Method Object Method.invoke(Object, Object[])>
    //   23   47:invokevirtual   #293 <Method void Keyframe.setValue(Object)>
    //   24   50:return          
    // catch InvocationTargetException InvocationTargetException
    //   25   51:astore          5
    //   26   53:ldc1            #167 <String "PropertyValuesHolder">
    //   27   55:aload           5
    //   28   57:invokevirtual   #303 <Method String InvocationTargetException.toString()>
    //   29   60:invokestatic    #180 <Method int Log.e(String, String)>
    //   30   63:pop             
    //   31   64:return          
    // catch IllegalAccessException IllegalAccessException
    //   32   65:astore_3        
    //   33   66:ldc1            #167 <String "PropertyValuesHolder">
    //   34   68:aload_3         
    //   35   69:invokevirtual   #304 <Method String IllegalAccessException.toString()>
    //   36   72:invokestatic    #180 <Method int Log.e(String, String)>
    //   37   75:pop             
    //   38   76:return          
    }

    void calculateValue(float f)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #83  <Field KeyframeSet mKeyframeSet>
    //    3    5:fload_1         
    //    4    6:invokevirtual   #310 <Method Object KeyframeSet.getValue(float)>
    //    5    9:putfield        #312 <Field Object mAnimatedValue>
    //    6   12:return          
    }

    public PropertyValuesHolder clone()
    {
    // try 0 43 handler(s) 45
    //    0    0:aload_0         
    //    1    1:invokespecial   #319 <Method Object Object.clone()>
    //    2    4:checkcast       #2   <Class PropertyValuesHolder>
    //    3    7:astore_2        
    //    4    8:aload_2         
    //    5    9:aload_0         
    //    6   10:getfield        #100 <Field String mPropertyName>
    //    7   13:putfield        #100 <Field String mPropertyName>
    //    8   16:aload_2         
    //    9   17:aload_0         
    //   10   18:getfield        #92  <Field Property mProperty>
    //   11   21:putfield        #92  <Field Property mProperty>
    //   12   24:aload_2         
    //   13   25:aload_0         
    //   14   26:getfield        #83  <Field KeyframeSet mKeyframeSet>
    //   15   29:invokevirtual   #322 <Method KeyframeSet KeyframeSet.clone()>
    //   16   32:putfield        #83  <Field KeyframeSet mKeyframeSet>
    //   17   35:aload_2         
    //   18   36:aload_0         
    //   19   37:getfield        #324 <Field TypeEvaluator mEvaluator>
    //   20   40:putfield        #324 <Field TypeEvaluator mEvaluator>
    //   21   43:aload_2         
    //   22   44:areturn         
    // catch CloneNotSupportedException
    //   23   45:astore_1        
    //   24   46:aconst_null     
    //   25   47:areturn         
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #326 <Method PropertyValuesHolder clone()>
    //    2    4:areturn         
    }

    Object getAnimatedValue()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #312 <Field Object mAnimatedValue>
    //    2    4:areturn         
    }

    public String getPropertyName()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #100 <Field String mPropertyName>
    //    2    4:areturn         
    }

    void init()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #324 <Field TypeEvaluator mEvaluator>
    //    2    4:ifnonnull       25
    //    3    7:aload_0         
    //    4    8:getfield        #182 <Field Class mValueType>
    //    5   11:ldc1            #61  <Class Integer>
    //    6   13:if_acmpne       44
    //    7   16:getstatic       #44  <Field TypeEvaluator sIntEvaluator>
    //    8   19:astore_1        
    //    9   20:aload_0         
    //   10   21:aload_1         
    //   11   22:putfield        #324 <Field TypeEvaluator mEvaluator>
    //   12   25:aload_0         
    //   13   26:getfield        #324 <Field TypeEvaluator mEvaluator>
    //   14   29:ifnull          43
    //   15   32:aload_0         
    //   16   33:getfield        #83  <Field KeyframeSet mKeyframeSet>
    //   17   36:aload_0         
    //   18   37:getfield        #324 <Field TypeEvaluator mEvaluator>
    //   19   40:invokevirtual   #330 <Method void KeyframeSet.setEvaluator(TypeEvaluator)>
    //   20   43:return          
    //   21   44:aload_0         
    //   22   45:getfield        #182 <Field Class mValueType>
    //   23   48:ldc1            #53  <Class Float>
    //   24   50:if_acmpne       60
    //   25   53:getstatic       #49  <Field TypeEvaluator sFloatEvaluator>
    //   26   56:astore_1        
    //   27   57:goto            20
    //   28   60:aconst_null     
    //   29   61:astore_1        
    //   30   62:goto            20
    }

    void setAnimatedValue(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #92  <Field Property mProperty>
    //    2    4:ifnull          19
    //    3    7:aload_0         
    //    4    8:getfield        #92  <Field Property mProperty>
    //    5   11:aload_1         
    //    6   12:aload_0         
    //    7   13:invokevirtual   #333 <Method Object getAnimatedValue()>
    //    8   16:invokevirtual   #337 <Method void Property.set(Object, Object)>
    //    9   19:aload_0         
    //   10   20:getfield        #79  <Field Method mSetter>
    //   11   23:ifnull          49
    // try 26 49 handler(s) 50 64
    //   12   26:aload_0         
    //   13   27:getfield        #90  <Field Object[] mTmpValueArray>
    //   14   30:iconst_0        
    //   15   31:aload_0         
    //   16   32:invokevirtual   #333 <Method Object getAnimatedValue()>
    //   17   35:aastore         
    //   18   36:aload_0         
    //   19   37:getfield        #79  <Field Method mSetter>
    //   20   40:aload_1         
    //   21   41:aload_0         
    //   22   42:getfield        #90  <Field Object[] mTmpValueArray>
    //   23   45:invokevirtual   #302 <Method Object Method.invoke(Object, Object[])>
    //   24   48:pop             
    //   25   49:return          
    // catch InvocationTargetException
    //   26   50:astore          4
    //   27   52:ldc1            #167 <String "PropertyValuesHolder">
    //   28   54:aload           4
    //   29   56:invokevirtual   #303 <Method String InvocationTargetException.toString()>
    //   30   59:invokestatic    #180 <Method int Log.e(String, String)>
    //   31   62:pop             
    //   32   63:return          
    // catch IllegalAccessException
    //   33   64:astore_2        
    //   34   65:ldc1            #167 <String "PropertyValuesHolder">
    //   35   67:aload_2         
    //   36   68:invokevirtual   #304 <Method String IllegalAccessException.toString()>
    //   37   71:invokestatic    #180 <Method int Log.e(String, String)>
    //   38   74:pop             
    //   39   75:return          
    }

    public void setEvaluator(TypeEvaluator typeevaluator)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #324 <Field TypeEvaluator mEvaluator>
    //    3    5:aload_0         
    //    4    6:getfield        #83  <Field KeyframeSet mKeyframeSet>
    //    5    9:aload_1         
    //    6   10:invokevirtual   #330 <Method void KeyframeSet.setEvaluator(TypeEvaluator)>
    //    7   13:return          
    }

    public transient void setFloatValues(float af[])
    {
    //    0    0:aload_0         
    //    1    1:getstatic       #56  <Field Class Float.TYPE>
    //    2    4:putfield        #182 <Field Class mValueType>
    //    3    7:aload_0         
    //    4    8:aload_1         
    //    5    9:invokestatic    #342 <Method KeyframeSet KeyframeSet.ofFloat(float[])>
    //    6   12:putfield        #83  <Field KeyframeSet mKeyframeSet>
    //    7   15:return          
    }

    public transient void setIntValues(int ai[])
    {
    //    0    0:aload_0         
    //    1    1:getstatic       #62  <Field Class Integer.TYPE>
    //    2    4:putfield        #182 <Field Class mValueType>
    //    3    7:aload_0         
    //    4    8:aload_1         
    //    5    9:invokestatic    #347 <Method KeyframeSet KeyframeSet.ofInt(int[])>
    //    6   12:putfield        #83  <Field KeyframeSet mKeyframeSet>
    //    7   15:return          
    }

    public transient void setKeyframes(Keyframe akeyframe[])
    {
    //    0    0:aload_1         
    //    1    1:arraylength     
    //    2    2:istore_2        
    //    3    3:iload_2         
    //    4    4:iconst_2        
    //    5    5:invokestatic    #355 <Method int Math.max(int, int)>
    //    6    8:anewarray       Keyframe[]
    //    7   11:astore_3        
    //    8   12:aload_0         
    //    9   13:aload_1         
    //   10   14:iconst_0        
    //   11   15:aaload          
    //   12   16:invokevirtual   #235 <Method Class Keyframe.getType()>
    //   13   19:putfield        #182 <Field Class mValueType>
    //   14   22:iconst_0        
    //   15   23:istore          4
    //   16   25:iload           4
    //   17   27:iload_2         
    //   18   28:icmplt          44
    //   19   31:aload_0         
    //   20   32:new             #216 <Class KeyframeSet>
    //   21   35:dup             
    //   22   36:aload_3         
    //   23   37:invokespecial   #357 <Method void KeyframeSet(Keyframe[])>
    //   24   40:putfield        #83  <Field KeyframeSet mKeyframeSet>
    //   25   43:return          
    //   26   44:aload_3         
    //   27   45:iload           4
    //   28   47:aload_1         
    //   29   48:iload           4
    //   30   50:aaload          
    //   31   51:aastore         
    //   32   52:iinc            4  1
    //   33   55:goto            25
    }

    public transient void setObjectValues(Object aobj[])
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iconst_0        
    //    3    3:aaload          
    //    4    4:invokevirtual   #296 <Method Class Object.getClass()>
    //    5    7:putfield        #182 <Field Class mValueType>
    //    6   10:aload_0         
    //    7   11:aload_1         
    //    8   12:invokestatic    #360 <Method KeyframeSet KeyframeSet.ofObject(Object[])>
    //    9   15:putfield        #83  <Field KeyframeSet mKeyframeSet>
    //   10   18:return          
    }

    public void setProperty(Property property)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #92  <Field Property mProperty>
    //    3    5:return          
    }

    public void setPropertyName(String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #100 <Field String mPropertyName>
    //    3    5:return          
    }

    void setupEndValue(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_0         
    //    3    3:getfield        #83  <Field KeyframeSet mKeyframeSet>
    //    4    6:getfield        #367 <Field ArrayList KeyframeSet.mKeyframes>
    //    5    9:iconst_m1       
    //    6   10:aload_0         
    //    7   11:getfield        #83  <Field KeyframeSet mKeyframeSet>
    //    8   14:getfield        #367 <Field ArrayList KeyframeSet.mKeyframes>
    //    9   17:invokevirtual   #372 <Method int ArrayList.size()>
    //   10   20:iadd            
    //   11   21:invokevirtual   #375 <Method Object ArrayList.get(int)>
    //   12   24:checkcast       #231 <Class Keyframe>
    //   13   27:invokespecial   #377 <Method void setupValue(Object, Keyframe)>
    //   14   30:return          
    }

    void setupSetter(Class class1)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:aload_1         
    //    3    3:getstatic       #73  <Field HashMap sSetterPropertyMap>
    //    4    6:ldc2            #379 <String "set">
    //    5    9:aload_0         
    //    6   10:getfield        #182 <Field Class mValueType>
    //    7   13:invokespecial   #261 <Method Method setupSetterOrGetter(Class, HashMap, String, Class)>
    //    8   16:putfield        #79  <Field Method mSetter>
    //    9   19:return          
    }

    void setupSetterAndGetter(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #92  <Field Property mProperty>
    //    2    4:ifnull          127
    // try 7 28 handler(s) 75
    //    3    7:aload_0         
    //    4    8:getfield        #92  <Field Property mProperty>
    //    5   11:aload_1         
    //    6   12:invokevirtual   #289 <Method Object Property.get(Object)>
    //    7   15:pop             
    //    8   16:aload_0         
    //    9   17:getfield        #83  <Field KeyframeSet mKeyframeSet>
    //   10   20:getfield        #367 <Field ArrayList KeyframeSet.mKeyframes>
    //   11   23:invokevirtual   #386 <Method Iterator ArrayList.iterator()>
    //   12   26:astore          12
    // try 28 38 handler(s) 75
    //   13   28:aload           12
    //   14   30:invokeinterface #392 <Method boolean Iterator.hasNext()>
    //   15   35:ifne            39
    //   16   38:return          
    // try 39 72 handler(s) 75
    //   17   39:aload           12
    //   18   41:invokeinterface #395 <Method Object Iterator.next()>
    //   19   46:checkcast       #231 <Class Keyframe>
    //   20   49:astore          13
    //   21   51:aload           13
    //   22   53:invokevirtual   #398 <Method boolean Keyframe.hasValue()>
    //   23   56:ifne            28
    //   24   59:aload           13
    //   25   61:aload_0         
    //   26   62:getfield        #92  <Field Property mProperty>
    //   27   65:aload_1         
    //   28   66:invokevirtual   #289 <Method Object Property.get(Object)>
    //   29   69:invokevirtual   #293 <Method void Keyframe.setValue(Object)>
    //   30   72:goto            28
    // catch ClassCastException ClassCastException ClassCastException
    //   31   75:astore          9
    //   32   77:ldc1            #167 <String "PropertyValuesHolder">
    //   33   79:new             #131 <Class StringBuilder>
    //   34   82:dup             
    //   35   83:ldc2            #400 <String "No such property (">
    //   36   86:invokespecial   #136 <Method void StringBuilder(String)>
    //   37   89:aload_0         
    //   38   90:getfield        #92  <Field Property mProperty>
    //   39   93:invokevirtual   #98  <Method String Property.getName()>
    //   40   96:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
    //   41   99:ldc2            #402 <String ") on target object ">
    //   42  102:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
    //   43  105:aload_1         
    //   44  106:invokevirtual   #174 <Method StringBuilder StringBuilder.append(Object)>
    //   45  109:ldc2            #404 <String ". Trying reflection instead">
    //   46  112:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
    //   47  115:invokevirtual   #146 <Method String StringBuilder.toString()>
    //   48  118:invokestatic    #180 <Method int Log.e(String, String)>
    //   49  121:pop             
    //   50  122:aload_0         
    //   51  123:aconst_null     
    //   52  124:putfield        #92  <Field Property mProperty>
    //   53  127:aload_1         
    //   54  128:invokevirtual   #296 <Method Class Object.getClass()>
    //   55  131:astore_2        
    //   56  132:aload_0         
    //   57  133:getfield        #79  <Field Method mSetter>
    //   58  136:ifnonnull       144
    //   59  139:aload_0         
    //   60  140:aload_2         
    //   61  141:invokevirtual   #406 <Method void setupSetter(Class)>
    //   62  144:aload_0         
    //   63  145:getfield        #83  <Field KeyframeSet mKeyframeSet>
    //   64  148:getfield        #367 <Field ArrayList KeyframeSet.mKeyframes>
    //   65  151:invokevirtual   #386 <Method Iterator ArrayList.iterator()>
    //   66  154:astore_3        
    //   67  155:aload_3         
    //   68  156:invokeinterface #392 <Method boolean Iterator.hasNext()>
    //   69  161:ifeq            247
    //   70  164:aload_3         
    //   71  165:invokeinterface #395 <Method Object Iterator.next()>
    //   72  170:checkcast       #231 <Class Keyframe>
    //   73  173:astore          4
    //   74  175:aload           4
    //   75  177:invokevirtual   #398 <Method boolean Keyframe.hasValue()>
    //   76  180:ifne            155
    //   77  183:aload_0         
    //   78  184:getfield        #81  <Field Method mGetter>
    //   79  187:ifnonnull       195
    //   80  190:aload_0         
    //   81  191:aload_2         
    //   82  192:invokespecial   #298 <Method void setupGetter(Class)>
    // try 195 212 handler(s) 215 231
    //   83  195:aload           4
    //   84  197:aload_0         
    //   85  198:getfield        #81  <Field Method mGetter>
    //   86  201:aload_1         
    //   87  202:iconst_0        
    //   88  203:anewarray       Object[]
    //   89  206:invokevirtual   #302 <Method Object Method.invoke(Object, Object[])>
    //   90  209:invokevirtual   #293 <Method void Keyframe.setValue(Object)>
    //   91  212:goto            155
    // catch InvocationTargetException
    //   92  215:astore          7
    //   93  217:ldc1            #167 <String "PropertyValuesHolder">
    //   94  219:aload           7
    //   95  221:invokevirtual   #303 <Method String InvocationTargetException.toString()>
    //   96  224:invokestatic    #180 <Method int Log.e(String, String)>
    //   97  227:pop             
    //   98  228:goto            155
    // catch IllegalAccessException
    //   99  231:astore          5
    //  100  233:ldc1            #167 <String "PropertyValuesHolder">
    //  101  235:aload           5
    //  102  237:invokevirtual   #304 <Method String IllegalAccessException.toString()>
    //  103  240:invokestatic    #180 <Method int Log.e(String, String)>
    //  104  243:pop             
    //  105  244:goto            155
    //  106  247:return          
    }

    void setupStartValue(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_0         
    //    3    3:getfield        #83  <Field KeyframeSet mKeyframeSet>
    //    4    6:getfield        #367 <Field ArrayList KeyframeSet.mKeyframes>
    //    5    9:iconst_0        
    //    6   10:invokevirtual   #375 <Method Object ArrayList.get(int)>
    //    7   13:checkcast       #231 <Class Keyframe>
    //    8   16:invokespecial   #377 <Method void setupValue(Object, Keyframe)>
    //    9   19:return          
    }

    public String toString()
    {
    //    0    0:new             #131 <Class StringBuilder>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:getfield        #100 <Field String mPropertyName>
    //    4    8:invokestatic    #135 <Method String String.valueOf(Object)>
    //    5   11:invokespecial   #136 <Method void StringBuilder(String)>
    //    6   14:ldc1            #171 <String ": ">
    //    7   16:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
    //    8   19:aload_0         
    //    9   20:getfield        #83  <Field KeyframeSet mKeyframeSet>
    //   10   23:invokevirtual   #408 <Method String KeyframeSet.toString()>
    //   11   26:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
    //   12   29:invokevirtual   #146 <Method String StringBuilder.toString()>
    //   13   32:areturn         
    }

    private static Class DOUBLE_VARIANTS[];
    private static Class FLOAT_VARIANTS[];
    private static Class INTEGER_VARIANTS[];
    private static final TypeEvaluator sFloatEvaluator;
    private static final HashMap sGetterPropertyMap;
    private static final TypeEvaluator sIntEvaluator;
    private static final HashMap sSetterPropertyMap;
    private Object mAnimatedValue;
    private TypeEvaluator mEvaluator;
    private Method mGetter;
    KeyframeSet mKeyframeSet;
    protected Property mProperty;
    final ReentrantReadWriteLock mPropertyMapLock;
    String mPropertyName;
    Method mSetter;
    final Object mTmpValueArray[];
    Class mValueType;
}
