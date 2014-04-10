// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.nineoldandroids.animation;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.nineoldandroids.animation:
//            Keyframe, FloatKeyframeSet, IntKeyframeSet, TypeEvaluator

class KeyframeSet
{

    public transient KeyframeSet(Keyframe akeyframe[])
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #21  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:arraylength     
    //    5    7:putfield        #23  <Field int mNumKeyframes>
    //    6   10:aload_0         
    //    7   11:new             #25  <Class ArrayList>
    //    8   14:dup             
    //    9   15:invokespecial   #26  <Method void ArrayList()>
    //   10   18:putfield        #28  <Field ArrayList mKeyframes>
    //   11   21:aload_0         
    //   12   22:getfield        #28  <Field ArrayList mKeyframes>
    //   13   25:aload_1         
    //   14   26:invokestatic    #34  <Method java.util.List Arrays.asList(Object[])>
    //   15   29:invokevirtual   #38  <Method boolean ArrayList.addAll(java.util.Collection)>
    //   16   32:pop             
    //   17   33:aload_0         
    //   18   34:aload_0         
    //   19   35:getfield        #28  <Field ArrayList mKeyframes>
    //   20   38:iconst_0        
    //   21   39:invokevirtual   #42  <Method Object ArrayList.get(int)>
    //   22   42:checkcast       #44  <Class Keyframe>
    //   23   45:putfield        #46  <Field Keyframe mFirstKeyframe>
    //   24   48:aload_0         
    //   25   49:aload_0         
    //   26   50:getfield        #28  <Field ArrayList mKeyframes>
    //   27   53:iconst_m1       
    //   28   54:aload_0         
    //   29   55:getfield        #23  <Field int mNumKeyframes>
    //   30   58:iadd            
    //   31   59:invokevirtual   #42  <Method Object ArrayList.get(int)>
    //   32   62:checkcast       #44  <Class Keyframe>
    //   33   65:putfield        #48  <Field Keyframe mLastKeyframe>
    //   34   68:aload_0         
    //   35   69:aload_0         
    //   36   70:getfield        #48  <Field Keyframe mLastKeyframe>
    //   37   73:invokevirtual   #52  <Method Interpolator Keyframe.getInterpolator()>
    //   38   76:putfield        #54  <Field Interpolator mInterpolator>
    //   39   79:return          
    }

    public static transient KeyframeSet ofFloat(float af[])
    {
    //    0    0:aload_0         
    //    1    1:arraylength     
    //    2    2:istore_1        
    //    3    3:iload_1         
    //    4    4:iconst_2        
    //    5    5:invokestatic    #62  <Method int Math.max(int, int)>
    //    6    8:anewarray       Keyframe.FloatKeyframe[]
    //    7   11:astore_2        
    //    8   12:iload_1         
    //    9   13:iconst_1        
    //   10   14:icmpne          49
    //   11   17:aload_2         
    //   12   18:iconst_0        
    //   13   19:fconst_0        
    //   14   20:invokestatic    #67  <Method Keyframe Keyframe.ofFloat(float)>
    //   15   23:checkcast       #64  <Class Keyframe$FloatKeyframe>
    //   16   26:aastore         
    //   17   27:aload_2         
    //   18   28:iconst_1        
    //   19   29:fconst_1        
    //   20   30:aload_0         
    //   21   31:iconst_0        
    //   22   32:faload          
    //   23   33:invokestatic    #70  <Method Keyframe Keyframe.ofFloat(float, float)>
    //   24   36:checkcast       #64  <Class Keyframe$FloatKeyframe>
    //   25   39:aastore         
    //   26   40:new             #72  <Class FloatKeyframeSet>
    //   27   43:dup             
    //   28   44:aload_2         
    //   29   45:invokespecial   #75  <Method void FloatKeyframeSet(Keyframe$FloatKeyframe[])>
    //   30   48:areturn         
    //   31   49:aload_2         
    //   32   50:iconst_0        
    //   33   51:fconst_0        
    //   34   52:aload_0         
    //   35   53:iconst_0        
    //   36   54:faload          
    //   37   55:invokestatic    #70  <Method Keyframe Keyframe.ofFloat(float, float)>
    //   38   58:checkcast       #64  <Class Keyframe$FloatKeyframe>
    //   39   61:aastore         
    //   40   62:iconst_1        
    //   41   63:istore_3        
    //   42   64:iload_3         
    //   43   65:iload_1         
    //   44   66:icmpge          40
    //   45   69:aload_2         
    //   46   70:iload_3         
    //   47   71:iload_3         
    //   48   72:i2f             
    //   49   73:iload_1         
    //   50   74:iconst_1        
    //   51   75:isub            
    //   52   76:i2f             
    //   53   77:fdiv            
    //   54   78:aload_0         
    //   55   79:iload_3         
    //   56   80:faload          
    //   57   81:invokestatic    #70  <Method Keyframe Keyframe.ofFloat(float, float)>
    //   58   84:checkcast       #64  <Class Keyframe$FloatKeyframe>
    //   59   87:aastore         
    //   60   88:iinc            3  1
    //   61   91:goto            64
    }

    public static transient KeyframeSet ofInt(int ai[])
    {
    //    0    0:aload_0         
    //    1    1:arraylength     
    //    2    2:istore_1        
    //    3    3:iload_1         
    //    4    4:iconst_2        
    //    5    5:invokestatic    #62  <Method int Math.max(int, int)>
    //    6    8:anewarray       Keyframe.IntKeyframe[]
    //    7   11:astore_2        
    //    8   12:iload_1         
    //    9   13:iconst_1        
    //   10   14:icmpne          49
    //   11   17:aload_2         
    //   12   18:iconst_0        
    //   13   19:fconst_0        
    //   14   20:invokestatic    #81  <Method Keyframe Keyframe.ofInt(float)>
    //   15   23:checkcast       #79  <Class Keyframe$IntKeyframe>
    //   16   26:aastore         
    //   17   27:aload_2         
    //   18   28:iconst_1        
    //   19   29:fconst_1        
    //   20   30:aload_0         
    //   21   31:iconst_0        
    //   22   32:iaload          
    //   23   33:invokestatic    #84  <Method Keyframe Keyframe.ofInt(float, int)>
    //   24   36:checkcast       #79  <Class Keyframe$IntKeyframe>
    //   25   39:aastore         
    //   26   40:new             #86  <Class IntKeyframeSet>
    //   27   43:dup             
    //   28   44:aload_2         
    //   29   45:invokespecial   #89  <Method void IntKeyframeSet(Keyframe$IntKeyframe[])>
    //   30   48:areturn         
    //   31   49:aload_2         
    //   32   50:iconst_0        
    //   33   51:fconst_0        
    //   34   52:aload_0         
    //   35   53:iconst_0        
    //   36   54:iaload          
    //   37   55:invokestatic    #84  <Method Keyframe Keyframe.ofInt(float, int)>
    //   38   58:checkcast       #79  <Class Keyframe$IntKeyframe>
    //   39   61:aastore         
    //   40   62:iconst_1        
    //   41   63:istore_3        
    //   42   64:iload_3         
    //   43   65:iload_1         
    //   44   66:icmpge          40
    //   45   69:aload_2         
    //   46   70:iload_3         
    //   47   71:iload_3         
    //   48   72:i2f             
    //   49   73:iload_1         
    //   50   74:iconst_1        
    //   51   75:isub            
    //   52   76:i2f             
    //   53   77:fdiv            
    //   54   78:aload_0         
    //   55   79:iload_3         
    //   56   80:iaload          
    //   57   81:invokestatic    #84  <Method Keyframe Keyframe.ofInt(float, int)>
    //   58   84:checkcast       #79  <Class Keyframe$IntKeyframe>
    //   59   87:aastore         
    //   60   88:iinc            3  1
    //   61   91:goto            64
    }

    public static transient KeyframeSet ofKeyframe(Keyframe akeyframe[])
    {
    //    0    0:aload_0         
    //    1    1:arraylength     
    //    2    2:istore_1        
    //    3    3:iconst_0        
    //    4    4:istore_2        
    //    5    5:iconst_0        
    //    6    6:istore_3        
    //    7    7:iconst_0        
    //    8    8:istore          4
    //    9   10:iconst_0        
    //   10   11:istore          5
    //   11   13:iload           5
    //   12   15:iload_1         
    //   13   16:icmplt          57
    //   14   19:iload_2         
    //   15   20:ifeq            114
    //   16   23:iload_3         
    //   17   24:ifne            114
    //   18   27:iload           4
    //   19   29:ifne            114
    //   20   32:iload_1         
    //   21   33:anewarray       Keyframe.FloatKeyframe[]
    //   22   36:astore          8
    //   23   38:iconst_0        
    //   24   39:istore          9
    //   25   41:iload           9
    //   26   43:iload_1         
    //   27   44:icmplt          96
    //   28   47:new             #72  <Class FloatKeyframeSet>
    //   29   50:dup             
    //   30   51:aload           8
    //   31   53:invokespecial   #75  <Method void FloatKeyframeSet(Keyframe$FloatKeyframe[])>
    //   32   56:areturn         
    //   33   57:aload_0         
    //   34   58:iload           5
    //   35   60:aaload          
    //   36   61:instanceof      #64  <Class Keyframe$FloatKeyframe>
    //   37   64:ifeq            75
    //   38   67:iconst_1        
    //   39   68:istore_2        
    //   40   69:iinc            5  1
    //   41   72:goto            13
    //   42   75:aload_0         
    //   43   76:iload           5
    //   44   78:aaload          
    //   45   79:instanceof      #79  <Class Keyframe$IntKeyframe>
    //   46   82:ifeq            90
    //   47   85:iconst_1        
    //   48   86:istore_3        
    //   49   87:goto            69
    //   50   90:iconst_1        
    //   51   91:istore          4
    //   52   93:goto            69
    //   53   96:aload           8
    //   54   98:iload           9
    //   55  100:aload_0         
    //   56  101:iload           9
    //   57  103:aaload          
    //   58  104:checkcast       #64  <Class Keyframe$FloatKeyframe>
    //   59  107:aastore         
    //   60  108:iinc            9  1
    //   61  111:goto            41
    //   62  114:iload_3         
    //   63  115:ifeq            170
    //   64  118:iload_2         
    //   65  119:ifne            170
    //   66  122:iload           4
    //   67  124:ifne            170
    //   68  127:iload_1         
    //   69  128:anewarray       Keyframe.IntKeyframe[]
    //   70  131:astore          6
    //   71  133:iconst_0        
    //   72  134:istore          7
    //   73  136:iload           7
    //   74  138:iload_1         
    //   75  139:icmplt          152
    //   76  142:new             #86  <Class IntKeyframeSet>
    //   77  145:dup             
    //   78  146:aload           6
    //   79  148:invokespecial   #89  <Method void IntKeyframeSet(Keyframe$IntKeyframe[])>
    //   80  151:areturn         
    //   81  152:aload           6
    //   82  154:iload           7
    //   83  156:aload_0         
    //   84  157:iload           7
    //   85  159:aaload          
    //   86  160:checkcast       #79  <Class Keyframe$IntKeyframe>
    //   87  163:aastore         
    //   88  164:iinc            7  1
    //   89  167:goto            136
    //   90  170:new             #2   <Class KeyframeSet>
    //   91  173:dup             
    //   92  174:aload_0         
    //   93  175:invokespecial   #93  <Method void KeyframeSet(Keyframe[])>
    //   94  178:areturn         
    }

    public static transient KeyframeSet ofObject(Object aobj[])
    {
    //    0    0:aload_0         
    //    1    1:arraylength     
    //    2    2:istore_1        
    //    3    3:iload_1         
    //    4    4:iconst_2        
    //    5    5:invokestatic    #62  <Method int Math.max(int, int)>
    //    6    8:anewarray       Keyframe.ObjectKeyframe[]
    //    7   11:astore_2        
    //    8   12:iload_1         
    //    9   13:iconst_1        
    //   10   14:icmpne          49
    //   11   17:aload_2         
    //   12   18:iconst_0        
    //   13   19:fconst_0        
    //   14   20:invokestatic    #99  <Method Keyframe Keyframe.ofObject(float)>
    //   15   23:checkcast       #97  <Class Keyframe$ObjectKeyframe>
    //   16   26:aastore         
    //   17   27:aload_2         
    //   18   28:iconst_1        
    //   19   29:fconst_1        
    //   20   30:aload_0         
    //   21   31:iconst_0        
    //   22   32:aaload          
    //   23   33:invokestatic    #102 <Method Keyframe Keyframe.ofObject(float, Object)>
    //   24   36:checkcast       #97  <Class Keyframe$ObjectKeyframe>
    //   25   39:aastore         
    //   26   40:new             #2   <Class KeyframeSet>
    //   27   43:dup             
    //   28   44:aload_2         
    //   29   45:invokespecial   #93  <Method void KeyframeSet(Keyframe[])>
    //   30   48:areturn         
    //   31   49:aload_2         
    //   32   50:iconst_0        
    //   33   51:fconst_0        
    //   34   52:aload_0         
    //   35   53:iconst_0        
    //   36   54:aaload          
    //   37   55:invokestatic    #102 <Method Keyframe Keyframe.ofObject(float, Object)>
    //   38   58:checkcast       #97  <Class Keyframe$ObjectKeyframe>
    //   39   61:aastore         
    //   40   62:iconst_1        
    //   41   63:istore_3        
    //   42   64:iload_3         
    //   43   65:iload_1         
    //   44   66:icmpge          40
    //   45   69:aload_2         
    //   46   70:iload_3         
    //   47   71:iload_3         
    //   48   72:i2f             
    //   49   73:iload_1         
    //   50   74:iconst_1        
    //   51   75:isub            
    //   52   76:i2f             
    //   53   77:fdiv            
    //   54   78:aload_0         
    //   55   79:iload_3         
    //   56   80:aaload          
    //   57   81:invokestatic    #102 <Method Keyframe Keyframe.ofObject(float, Object)>
    //   58   84:checkcast       #97  <Class Keyframe$ObjectKeyframe>
    //   59   87:aastore         
    //   60   88:iinc            3  1
    //   61   91:goto            64
    }

    public KeyframeSet clone()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #28  <Field ArrayList mKeyframes>
    //    2    4:astore_1        
    //    3    5:aload_0         
    //    4    6:getfield        #28  <Field ArrayList mKeyframes>
    //    5    9:invokevirtual   #108 <Method int ArrayList.size()>
    //    6   12:istore_2        
    //    7   13:iload_2         
    //    8   14:anewarray       Keyframe[]
    //    9   17:astore_3        
    //   10   18:iconst_0        
    //   11   19:istore          4
    //   12   21:iload           4
    //   13   23:iload_2         
    //   14   24:icmplt          36
    //   15   27:new             #2   <Class KeyframeSet>
    //   16   30:dup             
    //   17   31:aload_3         
    //   18   32:invokespecial   #93  <Method void KeyframeSet(Keyframe[])>
    //   19   35:areturn         
    //   20   36:aload_3         
    //   21   37:iload           4
    //   22   39:aload_1         
    //   23   40:iload           4
    //   24   42:invokevirtual   #42  <Method Object ArrayList.get(int)>
    //   25   45:checkcast       #44  <Class Keyframe>
    //   26   48:invokevirtual   #111 <Method Keyframe Keyframe.clone()>
    //   27   51:aastore         
    //   28   52:iinc            4  1
    //   29   55:goto            21
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #116 <Method KeyframeSet clone()>
    //    2    4:areturn         
    }

    public Object getValue(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #23  <Field int mNumKeyframes>
    //    2    4:iconst_2        
    //    3    5:icmpne          51
    //    4    8:aload_0         
    //    5    9:getfield        #54  <Field Interpolator mInterpolator>
    //    6   12:ifnull          26
    //    7   15:aload_0         
    //    8   16:getfield        #54  <Field Interpolator mInterpolator>
    //    9   19:fload_1         
    //   10   20:invokeinterface #124 <Method float Interpolator.getInterpolation(float)>
    //   11   25:fstore_1        
    //   12   26:aload_0         
    //   13   27:getfield        #126 <Field TypeEvaluator mEvaluator>
    //   14   30:fload_1         
    //   15   31:aload_0         
    //   16   32:getfield        #46  <Field Keyframe mFirstKeyframe>
    //   17   35:invokevirtual   #128 <Method Object Keyframe.getValue()>
    //   18   38:aload_0         
    //   19   39:getfield        #48  <Field Keyframe mLastKeyframe>
    //   20   42:invokevirtual   #128 <Method Object Keyframe.getValue()>
    //   21   45:invokeinterface #134 <Method Object TypeEvaluator.evaluate(float, Object, Object)>
    //   22   50:areturn         
    //   23   51:fload_1         
    //   24   52:fconst_0        
    //   25   53:fcmpg           
    //   26   54:ifgt            139
    //   27   57:aload_0         
    //   28   58:getfield        #28  <Field ArrayList mKeyframes>
    //   29   61:iconst_1        
    //   30   62:invokevirtual   #42  <Method Object ArrayList.get(int)>
    //   31   65:checkcast       #44  <Class Keyframe>
    //   32   68:astore          12
    //   33   70:aload           12
    //   34   72:invokevirtual   #52  <Method Interpolator Keyframe.getInterpolator()>
    //   35   75:astore          13
    //   36   77:aload           13
    //   37   79:ifnull          91
    //   38   82:aload           13
    //   39   84:fload_1         
    //   40   85:invokeinterface #124 <Method float Interpolator.getInterpolation(float)>
    //   41   90:fstore_1        
    //   42   91:aload_0         
    //   43   92:getfield        #46  <Field Keyframe mFirstKeyframe>
    //   44   95:invokevirtual   #138 <Method float Keyframe.getFraction()>
    //   45   98:fstore          14
    //   46  100:fload_1         
    //   47  101:fload           14
    //   48  103:fsub            
    //   49  104:aload           12
    //   50  106:invokevirtual   #138 <Method float Keyframe.getFraction()>
    //   51  109:fload           14
    //   52  111:fsub            
    //   53  112:fdiv            
    //   54  113:fstore          15
    //   55  115:aload_0         
    //   56  116:getfield        #126 <Field TypeEvaluator mEvaluator>
    //   57  119:fload           15
    //   58  121:aload_0         
    //   59  122:getfield        #46  <Field Keyframe mFirstKeyframe>
    //   60  125:invokevirtual   #128 <Method Object Keyframe.getValue()>
    //   61  128:aload           12
    //   62  130:invokevirtual   #128 <Method Object Keyframe.getValue()>
    //   63  133:invokeinterface #134 <Method Object TypeEvaluator.evaluate(float, Object, Object)>
    //   64  138:areturn         
    //   65  139:fload_1         
    //   66  140:fconst_1        
    //   67  141:fcmpl           
    //   68  142:iflt            235
    //   69  145:aload_0         
    //   70  146:getfield        #28  <Field ArrayList mKeyframes>
    //   71  149:bipush          -2
    //   72  151:aload_0         
    //   73  152:getfield        #23  <Field int mNumKeyframes>
    //   74  155:iadd            
    //   75  156:invokevirtual   #42  <Method Object ArrayList.get(int)>
    //   76  159:checkcast       #44  <Class Keyframe>
    //   77  162:astore          8
    //   78  164:aload_0         
    //   79  165:getfield        #48  <Field Keyframe mLastKeyframe>
    //   80  168:invokevirtual   #52  <Method Interpolator Keyframe.getInterpolator()>
    //   81  171:astore          9
    //   82  173:aload           9
    //   83  175:ifnull          187
    //   84  178:aload           9
    //   85  180:fload_1         
    //   86  181:invokeinterface #124 <Method float Interpolator.getInterpolation(float)>
    //   87  186:fstore_1        
    //   88  187:aload           8
    //   89  189:invokevirtual   #138 <Method float Keyframe.getFraction()>
    //   90  192:fstore          10
    //   91  194:fload_1         
    //   92  195:fload           10
    //   93  197:fsub            
    //   94  198:aload_0         
    //   95  199:getfield        #48  <Field Keyframe mLastKeyframe>
    //   96  202:invokevirtual   #138 <Method float Keyframe.getFraction()>
    //   97  205:fload           10
    //   98  207:fsub            
    //   99  208:fdiv            
    //  100  209:fstore          11
    //  101  211:aload_0         
    //  102  212:getfield        #126 <Field TypeEvaluator mEvaluator>
    //  103  215:fload           11
    //  104  217:aload           8
    //  105  219:invokevirtual   #128 <Method Object Keyframe.getValue()>
    //  106  222:aload_0         
    //  107  223:getfield        #48  <Field Keyframe mLastKeyframe>
    //  108  226:invokevirtual   #128 <Method Object Keyframe.getValue()>
    //  109  229:invokeinterface #134 <Method Object TypeEvaluator.evaluate(float, Object, Object)>
    //  110  234:areturn         
    //  111  235:aload_0         
    //  112  236:getfield        #46  <Field Keyframe mFirstKeyframe>
    //  113  239:astore_2        
    //  114  240:iconst_1        
    //  115  241:istore_3        
    //  116  242:iload_3         
    //  117  243:aload_0         
    //  118  244:getfield        #23  <Field int mNumKeyframes>
    //  119  247:icmplt          258
    //  120  250:aload_0         
    //  121  251:getfield        #48  <Field Keyframe mLastKeyframe>
    //  122  254:invokevirtual   #128 <Method Object Keyframe.getValue()>
    //  123  257:areturn         
    //  124  258:aload_0         
    //  125  259:getfield        #28  <Field ArrayList mKeyframes>
    //  126  262:iload_3         
    //  127  263:invokevirtual   #42  <Method Object ArrayList.get(int)>
    //  128  266:checkcast       #44  <Class Keyframe>
    //  129  269:astore          4
    //  130  271:fload_1         
    //  131  272:aload           4
    //  132  274:invokevirtual   #138 <Method float Keyframe.getFraction()>
    //  133  277:fcmpg           
    //  134  278:ifge            344
    //  135  281:aload           4
    //  136  283:invokevirtual   #52  <Method Interpolator Keyframe.getInterpolator()>
    //  137  286:astore          5
    //  138  288:aload           5
    //  139  290:ifnull          302
    //  140  293:aload           5
    //  141  295:fload_1         
    //  142  296:invokeinterface #124 <Method float Interpolator.getInterpolation(float)>
    //  143  301:fstore_1        
    //  144  302:aload_2         
    //  145  303:invokevirtual   #138 <Method float Keyframe.getFraction()>
    //  146  306:fstore          6
    //  147  308:fload_1         
    //  148  309:fload           6
    //  149  311:fsub            
    //  150  312:aload           4
    //  151  314:invokevirtual   #138 <Method float Keyframe.getFraction()>
    //  152  317:fload           6
    //  153  319:fsub            
    //  154  320:fdiv            
    //  155  321:fstore          7
    //  156  323:aload_0         
    //  157  324:getfield        #126 <Field TypeEvaluator mEvaluator>
    //  158  327:fload           7
    //  159  329:aload_2         
    //  160  330:invokevirtual   #128 <Method Object Keyframe.getValue()>
    //  161  333:aload           4
    //  162  335:invokevirtual   #128 <Method Object Keyframe.getValue()>
    //  163  338:invokeinterface #134 <Method Object TypeEvaluator.evaluate(float, Object, Object)>
    //  164  343:areturn         
    //  165  344:aload           4
    //  166  346:astore_2        
    //  167  347:iinc            3  1
    //  168  350:goto            242
    }

    public void setEvaluator(TypeEvaluator typeevaluator)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #126 <Field TypeEvaluator mEvaluator>
    //    3    5:return          
    }

    public String toString()
    {
    //    0    0:ldc1            #144 <String " ">
    //    1    2:astore_1        
    //    2    3:iconst_0        
    //    3    4:istore_2        
    //    4    5:iload_2         
    //    5    6:aload_0         
    //    6    7:getfield        #23  <Field int mNumKeyframes>
    //    7   10:icmplt          15
    //    8   13:aload_1         
    //    9   14:areturn         
    //   10   15:new             #146 <Class StringBuilder>
    //   11   18:dup             
    //   12   19:aload_1         
    //   13   20:invokestatic    #152 <Method String String.valueOf(Object)>
    //   14   23:invokespecial   #155 <Method void StringBuilder(String)>
    //   15   26:aload_0         
    //   16   27:getfield        #28  <Field ArrayList mKeyframes>
    //   17   30:iload_2         
    //   18   31:invokevirtual   #42  <Method Object ArrayList.get(int)>
    //   19   34:checkcast       #44  <Class Keyframe>
    //   20   37:invokevirtual   #128 <Method Object Keyframe.getValue()>
    //   21   40:invokevirtual   #159 <Method StringBuilder StringBuilder.append(Object)>
    //   22   43:ldc1            #161 <String "  ">
    //   23   45:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
    //   24   48:invokevirtual   #166 <Method String StringBuilder.toString()>
    //   25   51:astore_1        
    //   26   52:iinc            2  1
    //   27   55:goto            5
    }

    TypeEvaluator mEvaluator;
    Keyframe mFirstKeyframe;
    Interpolator mInterpolator;
    ArrayList mKeyframes;
    Keyframe mLastKeyframe;
    int mNumKeyframes;
}
