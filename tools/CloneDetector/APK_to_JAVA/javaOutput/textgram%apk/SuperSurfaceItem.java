// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.SpannableString;
import android.widget.LinearLayout;
import codeadore.textgram.custom_widgets.el7rTextView;

// Referenced classes of package codeadore.textgram:
//            StylingActivity, Utilities

public class SuperSurfaceItem
{

    public SuperSurfaceItem()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #53  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aconst_null     
    //    4    6:putfield        #55  <Field String bitmapPath>
    //    5    9:aload_0         
    //    6   10:aconst_null     
    //    7   11:putfield        #57  <Field Bitmap bitmap>
    //    8   14:aload_0         
    //    9   15:aconst_null     
    //   10   16:putfield        #59  <Field Bitmap cachedBitmap>
    //   11   19:aload_0         
    //   12   20:aconst_null     
    //   13   21:putfield        #61  <Field Bitmap cachedHighlightBitmap>
    //   14   24:aload_0         
    //   15   25:fconst_0        
    //   16   26:putfield        #63  <Field float posX>
    //   17   29:aload_0         
    //   18   30:fconst_0        
    //   19   31:putfield        #65  <Field float posY>
    //   20   34:aload_0         
    //   21   35:fconst_0        
    //   22   36:putfield        #67  <Field float tempPosX>
    //   23   39:aload_0         
    //   24   40:fconst_0        
    //   25   41:putfield        #69  <Field float tempPosY>
    //   26   44:aload_0         
    //   27   45:ldc1            #70  <Float 100F>
    //   28   47:putfield        #72  <Field float height>
    //   29   50:aload_0         
    //   30   51:ldc1            #70  <Float 100F>
    //   31   53:putfield        #74  <Field float width>
    //   32   56:aload_0         
    //   33   57:ldc1            #70  <Float 100F>
    //   34   59:putfield        #76  <Field float tempHeight>
    //   35   62:aload_0         
    //   36   63:ldc1            #70  <Float 100F>
    //   37   65:putfield        #78  <Field float tempWidth>
    //   38   68:aload_0         
    //   39   69:iconst_0        
    //   40   70:putfield        #80  <Field int rotation>
    //   41   73:aload_0         
    //   42   74:bipush          100
    //   43   76:putfield        #82  <Field int opacity>
    //   44   79:aload_0         
    //   45   80:iconst_0        
    //   46   81:putfield        #84  <Field int reflection>
    //   47   84:aload_0         
    //   48   85:ldc1            #85  <String "bitmap">
    //   49   87:putfield        #87  <Field String type>
    //   50   90:aload_0         
    //   51   91:iconst_0        
    //   52   92:putfield        #89  <Field boolean selected>
    //   53   95:aload_0         
    //   54   96:iconst_0        
    //   55   97:putfield        #91  <Field boolean highlight>
    //   56  100:aload_0         
    //   57  101:iconst_0        
    //   58  102:putfield        #93  <Field boolean matchesDelete>
    //   59  105:aload_0         
    //   60  106:iconst_0        
    //   61  107:putfield        #95  <Field boolean highlightMatchesDelete>
    //   62  110:aload_0         
    //   63  111:iconst_1        
    //   64  112:putfield        #97  <Field boolean deletable>
    //   65  115:aload_0         
    //   66  116:iconst_0        
    //   67  117:putfield        #99  <Field boolean resizePinActive>
    //   68  120:aload_0         
    //   69  121:iconst_0        
    //   70  122:putfield        #101 <Field boolean rotatePinActive>
    //   71  125:aload_0         
    //   72  126:new             #103 <Class SpannableString>
    //   73  129:dup             
    //   74  130:ldc1            #105 <String "double tap here to edit the text.">
    //   75  132:invokespecial   #108 <Method void SpannableString(CharSequence)>
    //   76  135:putfield        #110 <Field SpannableString text>
    //   77  138:aload_0         
    //   78  139:getstatic       #114 <Field el7rTextView StylingActivity.textViewDraw>
    //   79  142:putfield        #115 <Field el7rTextView textViewDraw>
    //   80  145:aload_0         
    //   81  146:aconst_null     
    //   82  147:putfield        #117 <Field String typeFacePath>
    //   83  150:aload_0         
    //   84  151:iconst_0        
    //   85  152:putfield        #119 <Field int textShadowColor>
    //   86  155:aload_0         
    //   87  156:ldc1            #121 <String "#000000">
    //   88  158:putfield        #123 <Field String textColor>
    //   89  161:aload_0         
    //   90  162:aconst_null     
    //   91  163:putfield        #125 <Field String highlightColor>
    //   92  166:aload_0         
    //   93  167:bipush          70
    //   94  169:putfield        #127 <Field int highlightOpacity>
    //   95  172:aload_0         
    //   96  173:ldc1            #128 <Float 10F>
    //   97  175:putfield        #130 <Field float textSize>
    //   98  178:aload_0         
    //   99  179:iconst_3        
    //  100  180:putfield        #132 <Field int textGravity>
    //  101  183:aload_0         
    //  102  184:iconst_0        
    //  103  185:putfield        #134 <Field int lineSpacing>
    //  104  188:aload_0         
    //  105  189:iconst_0        
    //  106  190:putfield        #136 <Field int textHeight>
    //  107  193:return          
    }

    public void clearTextShadow()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #115 <Field el7rTextView textViewDraw>
    //    2    4:invokevirtual   #142 <Method void el7rTextView.clearShadow()>
    //    3    7:aload_0         
    //    4    8:iconst_0        
    //    5    9:putfield        #119 <Field int textShadowColor>
    //    6   12:return          
    }

    public SpannableString getText()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #110 <Field SpannableString text>
    //    2    4:areturn         
    }

    public int getTextGravity()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #132 <Field int textGravity>
    //    2    4:ireturn         
    }

    public int getTextHeight()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #136 <Field int textHeight>
    //    2    4:ireturn         
    }

    public void setText(SpannableString spannablestring)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #110 <Field SpannableString text>
    //    3    5:aload_0         
    //    4    6:invokevirtual   #152 <Method void updateTextBitmap()>
    //    5    9:return          
    }

    public void setText(String s)
    {
    //    0    0:aload_0         
    //    1    1:new             #103 <Class SpannableString>
    //    2    4:dup             
    //    3    5:aload_1         
    //    4    6:invokespecial   #108 <Method void SpannableString(CharSequence)>
    //    5    9:putfield        #110 <Field SpannableString text>
    //    6   12:aload_0         
    //    7   13:invokevirtual   #152 <Method void updateTextBitmap()>
    //    8   16:return          
    }

    public void setTextGravity(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #132 <Field int textGravity>
    //    3    5:aload_0         
    //    4    6:getfield        #115 <Field el7rTextView textViewDraw>
    //    5    9:aload_0         
    //    6   10:getfield        #132 <Field int textGravity>
    //    7   13:invokevirtual   #158 <Method void el7rTextView.setGravity(int)>
    //    8   16:return          
    }

    public void setTextHeight(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #136 <Field int textHeight>
    //    3    5:return          
    }

    public void setup(StylingActivity stylingactivity)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #163 <Field StylingActivity context>
    //    3    5:aload_0         
    //    4    6:getstatic       #114 <Field el7rTextView StylingActivity.textViewDraw>
    //    5    9:putfield        #115 <Field el7rTextView textViewDraw>
    //    6   12:return          
    }

    public void updateTextBitmap()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #115 <Field el7rTextView textViewDraw>
    //    2    4:aload_0         
    //    3    5:getfield        #110 <Field SpannableString text>
    //    4    8:invokevirtual   #165 <Method void el7rTextView.setText(CharSequence)>
    //    5   11:aload_0         
    //    6   12:getfield        #115 <Field el7rTextView textViewDraw>
    //    7   15:iconst_0        
    //    8   16:iconst_0        
    //    9   17:aload_0         
    //   10   18:getfield        #74  <Field float width>
    //   11   21:f2i             
    //   12   22:aload_0         
    //   13   23:getfield        #72  <Field float height>
    //   14   26:f2i             
    //   15   27:invokevirtual   #168 <Method void el7rTextView.layout(int, int, int, int)>
    //   16   30:aload_0         
    //   17   31:getfield        #115 <Field el7rTextView textViewDraw>
    //   18   34:iconst_5        
    //   19   35:iconst_5        
    //   20   36:iconst_5        
    //   21   37:iconst_5        
    //   22   38:invokevirtual   #171 <Method void el7rTextView.setPadding(int, int, int, int)>
    //   23   41:aload_0         
    //   24   42:getfield        #115 <Field el7rTextView textViewDraw>
    //   25   45:iconst_0        
    //   26   46:fconst_1        
    //   27   47:aload_0         
    //   28   48:getfield        #130 <Field float textSize>
    //   29   51:fadd            
    //   30   52:invokevirtual   #175 <Method void el7rTextView.setTextSize(int, float)>
    //   31   55:aload_0         
    //   32   56:getfield        #115 <Field el7rTextView textViewDraw>
    //   33   59:iconst_0        
    //   34   60:aload_0         
    //   35   61:getfield        #130 <Field float textSize>
    //   36   64:invokevirtual   #175 <Method void el7rTextView.setTextSize(int, float)>
    //   37   67:aload_0         
    //   38   68:getfield        #115 <Field el7rTextView textViewDraw>
    //   39   71:aload_0         
    //   40   72:getfield        #123 <Field String textColor>
    //   41   75:invokevirtual   #178 <Method void el7rTextView.setSuperTextColor(String)>
    //   42   78:aload_0         
    //   43   79:getfield        #125 <Field String highlightColor>
    //   44   82:ifnull          237
    //   45   85:aload_0         
    //   46   86:getfield        #115 <Field el7rTextView textViewDraw>
    //   47   89:aload_0         
    //   48   90:getfield        #125 <Field String highlightColor>
    //   49   93:aload_0         
    //   50   94:getfield        #127 <Field int highlightOpacity>
    //   51   97:invokevirtual   #182 <Method void el7rTextView.setSuperHighlightColor(String, int)>
    //   52  100:aload_0         
    //   53  101:getfield        #119 <Field int textShadowColor>
    //   54  104:ifne            250
    //   55  107:aload_0         
    //   56  108:getfield        #115 <Field el7rTextView textViewDraw>
    //   57  111:aconst_null     
    //   58  112:invokevirtual   #185 <Method void el7rTextView.setShadowColor(String)>
    //   59  115:aload_0         
    //   60  116:getfield        #134 <Field int lineSpacing>
    //   61  119:ifeq            135
    //   62  122:aload_0         
    //   63  123:getfield        #115 <Field el7rTextView textViewDraw>
    //   64  126:aload_0         
    //   65  127:getfield        #134 <Field int lineSpacing>
    //   66  130:i2f             
    //   67  131:fconst_1        
    //   68  132:invokevirtual   #189 <Method void el7rTextView.setLineSpacing(float, float)>
    //   69  135:aload_0         
    //   70  136:getfield        #117 <Field String typeFacePath>
    //   71  139:ifnull          169
    //   72  142:aload_0         
    //   73  143:getfield        #117 <Field String typeFacePath>
    //   74  146:ldc1            #191 <String "">
    //   75  148:if_acmpeq       169
    //   76  151:aload_0         
    //   77  152:getfield        #115 <Field el7rTextView textViewDraw>
    //   78  155:aload_0         
    //   79  156:getfield        #163 <Field StylingActivity context>
    //   80  159:aload_0         
    //   81  160:getfield        #117 <Field String typeFacePath>
    //   82  163:invokestatic    #197 <Method android.graphics.Typeface Utilities.getTypefaceFromPath(android.content.Context, String)>
    //   83  166:invokevirtual   #201 <Method void el7rTextView.setTypeface(android.graphics.Typeface)>
    //   84  169:aload_0         
    //   85  170:getfield        #74  <Field float width>
    //   86  173:f2i             
    //   87  174:aload_0         
    //   88  175:getfield        #72  <Field float height>
    //   89  178:f2i             
    //   90  179:getstatic       #207 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
    //   91  182:invokestatic    #213 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
    //   92  185:astore_1        
    //   93  186:new             #215 <Class Canvas>
    //   94  189:dup             
    //   95  190:aload_1         
    //   96  191:invokespecial   #218 <Method void Canvas(Bitmap)>
    //   97  194:astore_2        
    //   98  195:aload_0         
    //   99  196:getfield        #115 <Field el7rTextView textViewDraw>
    //  100  199:ldc1            #219 <Int 0x100000>
    //  101  201:invokevirtual   #222 <Method void el7rTextView.setDrawingCacheQuality(int)>
    //  102  204:aload_0         
    //  103  205:getfield        #115 <Field el7rTextView textViewDraw>
    //  104  208:aload_2         
    //  105  209:invokevirtual   #226 <Method void el7rTextView.draw(Canvas)>
    //  106  212:aload_0         
    //  107  213:aload_1         
    //  108  214:putfield        #57  <Field Bitmap bitmap>
    //  109  217:aload_0         
    //  110  218:aload_0         
    //  111  219:getfield        #115 <Field el7rTextView textViewDraw>
    //  112  222:invokevirtual   #229 <Method int el7rTextView.getLineHeight()>
    //  113  225:aload_0         
    //  114  226:getfield        #115 <Field el7rTextView textViewDraw>
    //  115  229:invokevirtual   #232 <Method int el7rTextView.getLineCount()>
    //  116  232:imul            
    //  117  233:invokevirtual   #234 <Method void setTextHeight(int)>
    //  118  236:return          
    //  119  237:aload_0         
    //  120  238:getfield        #115 <Field el7rTextView textViewDraw>
    //  121  241:ldc1            #236 <String "#FFFFFF">
    //  122  243:iconst_0        
    //  123  244:invokevirtual   #182 <Method void el7rTextView.setSuperHighlightColor(String, int)>
    //  124  247:goto            100
    //  125  250:aload_0         
    //  126  251:getfield        #115 <Field el7rTextView textViewDraw>
    //  127  254:aload_0         
    //  128  255:getfield        #119 <Field int textShadowColor>
    //  129  258:invokevirtual   #238 <Method void el7rTextView.setShadowColor(int)>
    //  130  261:aload_0         
    //  131  262:getfield        #115 <Field el7rTextView textViewDraw>
    //  132  265:aload_0         
    //  133  266:getfield        #123 <Field String textColor>
    //  134  269:invokevirtual   #178 <Method void el7rTextView.setSuperTextColor(String)>
    //  135  272:goto            115
    }

    public Bitmap bitmap;
    public String bitmapPath;
    public Bitmap cachedBitmap;
    public Bitmap cachedHighlightBitmap;
    public StylingActivity context;
    boolean deletable;
    public float height;
    public boolean highlight;
    public String highlightColor;
    boolean highlightMatchesDelete;
    public int highlightOpacity;
    public LinearLayout layout;
    public int lineSpacing;
    boolean matchesDelete;
    public int opacity;
    public float posX;
    public float posY;
    public int reflection;
    boolean resizePinActive;
    boolean rotatePinActive;
    public int rotation;
    public boolean selected;
    public float tempHeight;
    public float tempPosX;
    public float tempPosY;
    public float tempWidth;
    SpannableString text;
    public String textColor;
    public int textGravity;
    public int textHeight;
    public int textShadowColor;
    public float textSize;
    public el7rTextView textViewDraw;
    public String type;
    public String typeFacePath;
    public float width;
}
