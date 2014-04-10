// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram.custom_widgets;

import android.content.Context;
import android.graphics.*;
import android.text.*;
import android.text.style.BackgroundColorSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

public class el7rTextView extends TextView
{

    public el7rTextView(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #14  <Method void TextView(Context)>
    //    3    5:aload_0         
    //    4    6:aconst_null     
    //    5    7:putfield        #16  <Field String textColor>
    //    6   10:aload_0         
    //    7   11:aconst_null     
    //    8   12:putfield        #18  <Field String shadowColor>
    //    9   15:aload_0         
    //   10   16:ldc1            #20  <String "el7rTextView">
    //   11   18:putfield        #22  <Field String TAG>
    //   12   21:aload_0         
    //   13   22:aconst_null     
    //   14   23:putfield        #24  <Field CharSequence originalText>
    //   15   26:return          
    }

    public el7rTextView(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #27  <Method void TextView(Context, AttributeSet)>
    //    4    6:aload_0         
    //    5    7:aconst_null     
    //    6    8:putfield        #16  <Field String textColor>
    //    7   11:aload_0         
    //    8   12:aconst_null     
    //    9   13:putfield        #18  <Field String shadowColor>
    //   10   16:aload_0         
    //   11   17:ldc1            #20  <String "el7rTextView">
    //   12   19:putfield        #22  <Field String TAG>
    //   13   22:aload_0         
    //   14   23:aconst_null     
    //   15   24:putfield        #24  <Field CharSequence originalText>
    //   16   27:return          
    }

    public void clearShadow()
    {
    //    0    0:aload_0         
    //    1    1:aconst_null     
    //    2    2:putfield        #18  <Field String shadowColor>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #33  <Method TextPaint getPaint()>
    //    5    9:invokevirtual   #38  <Method void TextPaint.clearShadowLayer()>
    //    6   12:return          
    }

    public int getShadowColor()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #18  <Field String shadowColor>
    //    2    4:ifnull          22
    // try 7 15 handler(s) 17
    //    3    7:aload_0         
    //    4    8:getfield        #18  <Field String shadowColor>
    //    5   11:invokestatic    #51  <Method int Color.parseColor(String)>
    //    6   14:istore_2        
    //    7   15:iload_2         
    //    8   16:ireturn         
    // catch Exception
    //    9   17:astore_1        
    //   10   18:aload_1         
    //   11   19:invokevirtual   #54  <Method void Exception.printStackTrace()>
    //   12   22:iconst_0        
    //   13   23:ireturn         
    }

    protected void onDraw(Canvas canvas)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #18  <Field String shadowColor>
    //    2    4:ifnonnull       133
    //    3    7:aload_0         
    //    4    8:invokevirtual   #33  <Method TextPaint getPaint()>
    //    5   11:fconst_0        
    //    6   12:fconst_0        
    //    7   13:fconst_0        
    //    8   14:iconst_0        
    //    9   15:invokevirtual   #60  <Method void TextPaint.setShadowLayer(float, float, float, int)>
    //   10   18:aload_0         
    //   11   19:invokevirtual   #33  <Method TextPaint getPaint()>
    //   12   22:aconst_null     
    //   13   23:invokevirtual   #64  <Method android.graphics.Shader TextPaint.setShader(android.graphics.Shader)>
    //   14   26:pop             
    //   15   27:aload_0         
    //   16   28:aload_1         
    //   17   29:invokespecial   #66  <Method void TextView.onDraw(Canvas)>
    //   18   32:aload_0         
    //   19   33:invokevirtual   #33  <Method TextPaint getPaint()>
    //   20   36:invokevirtual   #38  <Method void TextPaint.clearShadowLayer()>
    //   21   39:aload_0         
    //   22   40:getfield        #16  <Field String textColor>
    //   23   43:ifnull          127
    //   24   46:aload_0         
    //   25   47:getfield        #16  <Field String textColor>
    //   26   50:ldc1            #68  <String ":">
    //   27   52:invokevirtual   #74  <Method boolean String.contains(CharSequence)>
    //   28   55:ifeq            218
    // try 58 127 handler(s) 185
    //   29   58:aload_0         
    //   30   59:getfield        #16  <Field String textColor>
    //   31   62:ldc1            #68  <String ":">
    //   32   64:invokevirtual   #78  <Method String[] String.split(String)>
    //   33   67:astore          10
    //   34   69:aload_0         
    //   35   70:invokevirtual   #81  <Method int getLineCount()>
    //   36   73:aload_0         
    //   37   74:invokevirtual   #85  <Method float getTextSize()>
    //   38   77:f2i             
    //   39   78:imul            
    //   40   79:istore          11
    //   41   81:new             #87  <Class RadialGradient>
    //   42   84:dup             
    //   43   85:iload           11
    //   44   87:iconst_2        
    //   45   88:idiv            
    //   46   89:i2f             
    //   47   90:iload           11
    //   48   92:i2f             
    //   49   93:ldc1            #88  <Float 612F>
    //   50   95:aload           10
    //   51   97:iconst_0        
    //   52   98:aaload          
    //   53   99:invokestatic    #51  <Method int Color.parseColor(String)>
    //   54  102:aload           10
    //   55  104:iconst_1        
    //   56  105:aaload          
    //   57  106:invokestatic    #51  <Method int Color.parseColor(String)>
    //   58  109:getstatic       #94  <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
    //   59  112:invokespecial   #97  <Method void RadialGradient(float, float, float, int, int, android.graphics.Shader$TileMode)>
    //   60  115:astore          12
    //   61  117:aload_0         
    //   62  118:invokevirtual   #33  <Method TextPaint getPaint()>
    //   63  121:aload           12
    //   64  123:invokevirtual   #64  <Method android.graphics.Shader TextPaint.setShader(android.graphics.Shader)>
    //   65  126:pop             
    //   66  127:aload_0         
    //   67  128:aload_1         
    //   68  129:invokespecial   #66  <Method void TextView.onDraw(Canvas)>
    //   69  132:return          
    // try 133 151 handler(s) 154
    //   70  133:aload_0         
    //   71  134:invokevirtual   #33  <Method TextPaint getPaint()>
    //   72  137:ldc1            #98  <Float 5F>
    //   73  139:fconst_0        
    //   74  140:fconst_2        
    //   75  141:aload_0         
    //   76  142:getfield        #18  <Field String shadowColor>
    //   77  145:invokestatic    #51  <Method int Color.parseColor(String)>
    //   78  148:invokevirtual   #60  <Method void TextPaint.setShadowLayer(float, float, float, int)>
    //   79  151:goto            18
    // catch Exception
    //   80  154:astore_2        
    //   81  155:aload_0         
    //   82  156:getfield        #22  <Field String TAG>
    //   83  159:new             #100 <Class StringBuilder>
    //   84  162:dup             
    //   85  163:ldc1            #102 <String "in updateView() -> set sahdow color no empty: ">
    //   86  165:invokespecial   #105 <Method void StringBuilder(String)>
    //   87  168:aload_2         
    //   88  169:invokevirtual   #109 <Method String Exception.toString()>
    //   89  172:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
    //   90  175:invokevirtual   #114 <Method String StringBuilder.toString()>
    //   91  178:invokestatic    #120 <Method int Log.e(String, String)>
    //   92  181:pop             
    //   93  182:goto            18
    // catch Exception
    //   94  185:astore          8
    //   95  187:aload_0         
    //   96  188:getfield        #22  <Field String TAG>
    //   97  191:new             #100 <Class StringBuilder>
    //   98  194:dup             
    //   99  195:ldc1            #122 <String "in updateView() -> set color contains(:): ">
    //  100  197:invokespecial   #105 <Method void StringBuilder(String)>
    //  101  200:aload           8
    //  102  202:invokevirtual   #109 <Method String Exception.toString()>
    //  103  205:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
    //  104  208:invokevirtual   #114 <Method String StringBuilder.toString()>
    //  105  211:invokestatic    #120 <Method int Log.e(String, String)>
    //  106  214:pop             
    //  107  215:goto            127
    // try 218 238 handler(s) 241
    //  108  218:aload_0         
    //  109  219:invokevirtual   #33  <Method TextPaint getPaint()>
    //  110  222:aconst_null     
    //  111  223:invokevirtual   #64  <Method android.graphics.Shader TextPaint.setShader(android.graphics.Shader)>
    //  112  226:pop             
    //  113  227:aload_0         
    //  114  228:aload_0         
    //  115  229:getfield        #16  <Field String textColor>
    //  116  232:invokestatic    #51  <Method int Color.parseColor(String)>
    //  117  235:invokevirtual   #126 <Method void setTextColor(int)>
    //  118  238:goto            127
    // catch Exception
    //  119  241:astore          5
    //  120  243:aload_0         
    //  121  244:getfield        #22  <Field String TAG>
    //  122  247:new             #100 <Class StringBuilder>
    //  123  250:dup             
    //  124  251:ldc1            #128 <String "in updateView() -> setting canvas normal color: ">
    //  125  253:invokespecial   #105 <Method void StringBuilder(String)>
    //  126  256:aload           5
    //  127  258:invokevirtual   #109 <Method String Exception.toString()>
    //  128  261:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
    //  129  264:invokevirtual   #114 <Method String StringBuilder.toString()>
    //  130  267:invokestatic    #120 <Method int Log.e(String, String)>
    //  131  270:pop             
    //  132  271:goto            127
    }

    public void setShadowColor(int i)
    {
    //    0    0:aload_0         
    //    1    1:new             #100 <Class StringBuilder>
    //    2    4:dup             
    //    3    5:ldc1            #131 <String "#">
    //    4    7:invokespecial   #105 <Method void StringBuilder(String)>
    //    5   10:iload_1         
    //    6   11:invokestatic    #137 <Method String Integer.toHexString(int)>
    //    7   14:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
    //    8   17:invokevirtual   #114 <Method String StringBuilder.toString()>
    //    9   20:putfield        #18  <Field String shadowColor>
    //   10   23:return          
    }

    public void setShadowColor(String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #18  <Field String shadowColor>
    //    3    5:return          
    }

    public void setSuperHighlightColor(String s, int i)
    {
    //    0    0:aload_1         
    //    1    1:ldc1            #141 <String "no">
    //    2    3:invokevirtual   #74  <Method boolean String.contains(CharSequence)>
    //    3    6:ifne            118
    //    4    9:iconst_0        
    //    5   10:istore_3        
    //    6   11:iconst_0        
    //    7   12:istore          4
    // try 14 62 handler(s) 119
    //    8   14:aload_1         
    //    9   15:iconst_1        
    //   10   16:iconst_3        
    //   11   17:invokevirtual   #145 <Method String String.substring(int, int)>
    //   12   20:bipush          16
    //   13   22:invokestatic    #149 <Method Integer Integer.valueOf(String, int)>
    //   14   25:invokevirtual   #152 <Method int Integer.intValue()>
    //   15   28:istore_3        
    //   16   29:aload_1         
    //   17   30:iconst_3        
    //   18   31:iconst_5        
    //   19   32:invokevirtual   #145 <Method String String.substring(int, int)>
    //   20   35:bipush          16
    //   21   37:invokestatic    #149 <Method Integer Integer.valueOf(String, int)>
    //   22   40:invokevirtual   #152 <Method int Integer.intValue()>
    //   23   43:istore          4
    //   24   45:aload_1         
    //   25   46:iconst_5        
    //   26   47:bipush          7
    //   27   49:invokevirtual   #145 <Method String String.substring(int, int)>
    //   28   52:bipush          16
    //   29   54:invokestatic    #149 <Method Integer Integer.valueOf(String, int)>
    //   30   57:invokevirtual   #152 <Method int Integer.intValue()>
    //   31   60:istore          8
    //   32   62:iload           8
    //   33   64:istore          6
    //   34   66:new             #154 <Class SpannableString>
    //   35   69:dup             
    //   36   70:aload_0         
    //   37   71:getfield        #24  <Field CharSequence originalText>
    //   38   74:invokespecial   #157 <Method void SpannableString(CharSequence)>
    //   39   77:astore          7
    //   40   79:aload           7
    //   41   81:new             #159 <Class BackgroundColorSpan>
    //   42   84:dup             
    //   43   85:iload_2         
    //   44   86:iload_3         
    //   45   87:iload           4
    //   46   89:iload           6
    //   47   91:invokestatic    #163 <Method int Color.argb(int, int, int, int)>
    //   48   94:invokespecial   #165 <Method void BackgroundColorSpan(int)>
    //   49   97:iconst_0        
    //   50   98:aload           7
    //   51  100:invokeinterface #170 <Method int Spannable.length()>
    //   52  105:bipush          33
    //   53  107:invokeinterface #174 <Method void Spannable.setSpan(Object, int, int, int)>
    //   54  112:aload_0         
    //   55  113:aload           7
    //   56  115:invokevirtual   #177 <Method void setText(CharSequence)>
    //   57  118:return          
    // catch Exception
    //   58  119:astore          5
    //   59  121:aload           5
    //   60  123:invokevirtual   #54  <Method void Exception.printStackTrace()>
    //   61  126:iconst_0        
    //   62  127:istore          6
    //   63  129:goto            66
    }

    public void setSuperTextColor(String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #16  <Field String textColor>
    //    3    5:return          
    }

    public void setText(CharSequence charsequence, android.widget.TextView.BufferType buffertype)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #24  <Field CharSequence originalText>
    //    3    5:aload_0         
    //    4    6:aload_1         
    //    5    7:aload_2         
    //    6    8:invokespecial   #181 <Method void TextView.setText(CharSequence, android.widget.TextView$BufferType)>
    //    7   11:return          
    }

    public void setTextColor(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #182 <Method void TextView.setTextColor(int)>
    //    3    5:aload_0         
    //    4    6:new             #100 <Class StringBuilder>
    //    5    9:dup             
    //    6   10:ldc1            #131 <String "#">
    //    7   12:invokespecial   #105 <Method void StringBuilder(String)>
    //    8   15:iload_1         
    //    9   16:invokestatic    #137 <Method String Integer.toHexString(int)>
    //   10   19:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
    //   11   22:invokevirtual   #114 <Method String StringBuilder.toString()>
    //   12   25:putfield        #16  <Field String textColor>
    //   13   28:return          
    }

    String TAG;
    CharSequence originalText;
    String shadowColor;
    String textColor;
}
