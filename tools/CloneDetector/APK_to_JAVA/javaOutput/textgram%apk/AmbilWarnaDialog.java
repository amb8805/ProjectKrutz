// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package yuku.ambilwarna;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.view.*;
import android.widget.ImageView;

// Referenced classes of package yuku.ambilwarna:
//            AmbilWarnaKotak

public class AmbilWarnaDialog
{
    public static interface OnAmbilWarnaListener
    {

        public abstract void onCancel(AmbilWarnaDialog ambilwarnadialog);

        public abstract void onOk(AmbilWarnaDialog ambilwarnadialog, int i);
    }


    public AmbilWarnaDialog(Context context, int i, OnAmbilWarnaListener onambilwarnalistener)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #26  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:iconst_3        
    //    4    6:newarray        float[]
    //    5    8:putfield        #28  <Field float[] currentColorHsv>
    //    6   11:aload_0         
    //    7   12:aload_3         
    //    8   13:putfield        #30  <Field AmbilWarnaDialog$OnAmbilWarnaListener listener>
    //    9   16:iload_2         
    //   10   17:aload_0         
    //   11   18:getfield        #28  <Field float[] currentColorHsv>
    //   12   21:invokestatic    #36  <Method void Color.colorToHSV(int, float[])>
    //   13   24:aload_1         
    //   14   25:invokestatic    #42  <Method LayoutInflater LayoutInflater.from(Context)>
    //   15   28:getstatic       #48  <Field int R$layout.ambilwarna_dialog>
    //   16   31:aconst_null     
    //   17   32:invokevirtual   #52  <Method View LayoutInflater.inflate(int, ViewGroup)>
    //   18   35:astore          4
    //   19   37:aload_0         
    //   20   38:aload           4
    //   21   40:getstatic       #57  <Field int R$id.ambilwarna_viewHue>
    //   22   43:invokevirtual   #63  <Method View View.findViewById(int)>
    //   23   46:putfield        #65  <Field View viewHue>
    //   24   49:aload_0         
    //   25   50:aload           4
    //   26   52:getstatic       #68  <Field int R$id.ambilwarna_viewSatBri>
    //   27   55:invokevirtual   #63  <Method View View.findViewById(int)>
    //   28   58:checkcast       #70  <Class AmbilWarnaKotak>
    //   29   61:putfield        #72  <Field AmbilWarnaKotak viewSatVal>
    //   30   64:aload_0         
    //   31   65:aload           4
    //   32   67:getstatic       #75  <Field int R$id.ambilwarna_cursor>
    //   33   70:invokevirtual   #63  <Method View View.findViewById(int)>
    //   34   73:checkcast       #77  <Class ImageView>
    //   35   76:putfield        #79  <Field ImageView viewCursor>
    //   36   79:aload_0         
    //   37   80:aload           4
    //   38   82:getstatic       #82  <Field int R$id.ambilwarna_warnaLama>
    //   39   85:invokevirtual   #63  <Method View View.findViewById(int)>
    //   40   88:putfield        #84  <Field View viewOldColor>
    //   41   91:aload_0         
    //   42   92:aload           4
    //   43   94:getstatic       #87  <Field int R$id.ambilwarna_warnaBaru>
    //   44   97:invokevirtual   #63  <Method View View.findViewById(int)>
    //   45  100:putfield        #89  <Field View viewNewColor>
    //   46  103:aload_0         
    //   47  104:aload           4
    //   48  106:getstatic       #92  <Field int R$id.ambilwarna_target>
    //   49  109:invokevirtual   #63  <Method View View.findViewById(int)>
    //   50  112:checkcast       #77  <Class ImageView>
    //   51  115:putfield        #94  <Field ImageView viewTarget>
    //   52  118:aload_0         
    //   53  119:aload           4
    //   54  121:getstatic       #97  <Field int R$id.ambilwarna_viewContainer>
    //   55  124:invokevirtual   #63  <Method View View.findViewById(int)>
    //   56  127:checkcast       #99  <Class ViewGroup>
    //   57  130:putfield        #101 <Field ViewGroup viewContainer>
    //   58  133:aload_0         
    //   59  134:getfield        #72  <Field AmbilWarnaKotak viewSatVal>
    //   60  137:aload_0         
    //   61  138:invokespecial   #105 <Method float getHue()>
    //   62  141:invokevirtual   #109 <Method void AmbilWarnaKotak.setHue(float)>
    //   63  144:aload_0         
    //   64  145:getfield        #84  <Field View viewOldColor>
    //   65  148:iload_2         
    //   66  149:invokevirtual   #113 <Method void View.setBackgroundColor(int)>
    //   67  152:aload_0         
    //   68  153:getfield        #89  <Field View viewNewColor>
    //   69  156:iload_2         
    //   70  157:invokevirtual   #113 <Method void View.setBackgroundColor(int)>
    //   71  160:aload_0         
    //   72  161:getfield        #65  <Field View viewHue>
    //   73  164:new             #115 <Class AmbilWarnaDialog$1>
    //   74  167:dup             
    //   75  168:aload_0         
    //   76  169:invokespecial   #118 <Method void AmbilWarnaDialog$1(AmbilWarnaDialog)>
    //   77  172:invokevirtual   #122 <Method void View.setOnTouchListener(android.view.View$OnTouchListener)>
    //   78  175:aload_0         
    //   79  176:getfield        #72  <Field AmbilWarnaKotak viewSatVal>
    //   80  179:new             #124 <Class AmbilWarnaDialog$2>
    //   81  182:dup             
    //   82  183:aload_0         
    //   83  184:invokespecial   #125 <Method void AmbilWarnaDialog$2(AmbilWarnaDialog)>
    //   84  187:invokevirtual   #126 <Method void AmbilWarnaKotak.setOnTouchListener(android.view.View$OnTouchListener)>
    //   85  190:aload_0         
    //   86  191:new             #128 <Class android.app.AlertDialog$Builder>
    //   87  194:dup             
    //   88  195:aload_1         
    //   89  196:invokespecial   #131 <Method void android.app.AlertDialog$Builder(Context)>
    //   90  199:ldc1            #132 <Int 0x104000a>
    //   91  201:new             #134 <Class AmbilWarnaDialog$3>
    //   92  204:dup             
    //   93  205:aload_0         
    //   94  206:invokespecial   #135 <Method void AmbilWarnaDialog$3(AmbilWarnaDialog)>
    //   95  209:invokevirtual   #139 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
    //   96  212:ldc1            #140 <Int 0x1040000>
    //   97  214:new             #142 <Class AmbilWarnaDialog$4>
    //   98  217:dup             
    //   99  218:aload_0         
    //  100  219:invokespecial   #143 <Method void AmbilWarnaDialog$4(AmbilWarnaDialog)>
    //  101  222:invokevirtual   #146 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
    //  102  225:new             #148 <Class AmbilWarnaDialog$5>
    //  103  228:dup             
    //  104  229:aload_0         
    //  105  230:invokespecial   #149 <Method void AmbilWarnaDialog$5(AmbilWarnaDialog)>
    //  106  233:invokevirtual   #153 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setOnCancelListener(android.content.DialogInterface$OnCancelListener)>
    //  107  236:invokevirtual   #157 <Method AlertDialog android.app.AlertDialog$Builder.create()>
    //  108  239:putfield        #159 <Field AlertDialog dialog>
    //  109  242:aload_0         
    //  110  243:getfield        #159 <Field AlertDialog dialog>
    //  111  246:aload           4
    //  112  248:iconst_0        
    //  113  249:iconst_0        
    //  114  250:iconst_0        
    //  115  251:iconst_0        
    //  116  252:invokevirtual   #165 <Method void AlertDialog.setView(View, int, int, int, int)>
    //  117  255:aload           4
    //  118  257:invokevirtual   #169 <Method ViewTreeObserver View.getViewTreeObserver()>
    //  119  260:new             #171 <Class AmbilWarnaDialog$6>
    //  120  263:dup             
    //  121  264:aload_0         
    //  122  265:aload           4
    //  123  267:invokespecial   #174 <Method void AmbilWarnaDialog$6(AmbilWarnaDialog, View)>
    //  124  270:invokevirtual   #180 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
    //  125  273:return          
    }

    static void access$0(AmbilWarnaDialog ambilwarnadialog, float f)
    {
    //    0    0:aload_0         
    //    1    1:fload_1         
    //    2    2:invokespecial   #183 <Method void setHue(float)>
    //    3    5:return          
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:fload_1         
    //    6    2:invokespecial   #183 <Method void setHue(float)>
    //    7    5:return          
    }

    static float access$1(AmbilWarnaDialog ambilwarnadialog)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #105 <Method float getHue()>
    //    2    4:freturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:invokespecial   #105 <Method float getHue()>
    //    5    4:freturn         
    }

    static int access$2(AmbilWarnaDialog ambilwarnadialog)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #191 <Method int getColor()>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:invokespecial   #191 <Method int getColor()>
    //    5    4:ireturn         
    }

    static void access$3(AmbilWarnaDialog ambilwarnadialog, float f)
    {
    //    0    0:aload_0         
    //    1    1:fload_1         
    //    2    2:invokespecial   #195 <Method void setSat(float)>
    //    3    5:return          
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:fload_1         
    //    6    2:invokespecial   #195 <Method void setSat(float)>
    //    7    5:return          
    }

    static void access$4(AmbilWarnaDialog ambilwarnadialog, float f)
    {
    //    0    0:aload_0         
    //    1    1:fload_1         
    //    2    2:invokespecial   #199 <Method void setVal(float)>
    //    3    5:return          
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:fload_1         
    //    6    2:invokespecial   #199 <Method void setVal(float)>
    //    7    5:return          
    }

    private int getColor()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #28  <Field float[] currentColorHsv>
    //    2    4:invokestatic    #203 <Method int Color.HSVToColor(float[])>
    //    3    7:ireturn         
    }

    private float getHue()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #28  <Field float[] currentColorHsv>
    //    2    4:iconst_0        
    //    3    5:faload          
    //    4    6:freturn         
    }

    private float getSat()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #28  <Field float[] currentColorHsv>
    //    2    4:iconst_1        
    //    3    5:faload          
    //    4    6:freturn         
    }

    private float getVal()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #28  <Field float[] currentColorHsv>
    //    2    4:iconst_2        
    //    3    5:faload          
    //    4    6:freturn         
    }

    private void setHue(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #28  <Field float[] currentColorHsv>
    //    2    4:iconst_0        
    //    3    5:fload_1         
    //    4    6:fastore         
    //    5    7:return          
    }

    private void setSat(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #28  <Field float[] currentColorHsv>
    //    2    4:iconst_1        
    //    3    5:fload_1         
    //    4    6:fastore         
    //    5    7:return          
    }

    private void setVal(float f)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #28  <Field float[] currentColorHsv>
    //    2    4:iconst_2        
    //    3    5:fload_1         
    //    4    6:fastore         
    //    5    7:return          
    }

    public AlertDialog getDialog()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #159 <Field AlertDialog dialog>
    //    2    4:areturn         
    }

    protected void moveCursor()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #65  <Field View viewHue>
    //    2    4:invokevirtual   #210 <Method int View.getMeasuredHeight()>
    //    3    7:i2f             
    //    4    8:aload_0         
    //    5    9:invokespecial   #105 <Method float getHue()>
    //    6   12:aload_0         
    //    7   13:getfield        #65  <Field View viewHue>
    //    8   16:invokevirtual   #210 <Method int View.getMeasuredHeight()>
    //    9   19:i2f             
    //   10   20:fmul            
    //   11   21:ldc1            #211 <Float 360F>
    //   12   23:fdiv            
    //   13   24:fsub            
    //   14   25:fstore_1        
    //   15   26:fload_1         
    //   16   27:aload_0         
    //   17   28:getfield        #65  <Field View viewHue>
    //   18   31:invokevirtual   #210 <Method int View.getMeasuredHeight()>
    //   19   34:i2f             
    //   20   35:fcmpl           
    //   21   36:ifne            41
    //   22   39:fconst_0        
    //   23   40:fstore_1        
    //   24   41:aload_0         
    //   25   42:getfield        #79  <Field ImageView viewCursor>
    //   26   45:invokevirtual   #215 <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
    //   27   48:checkcast       #217 <Class android.widget.RelativeLayout$LayoutParams>
    //   28   51:astore_2        
    //   29   52:aload_2         
    //   30   53:aload_0         
    //   31   54:getfield        #65  <Field View viewHue>
    //   32   57:invokevirtual   #220 <Method int View.getLeft()>
    //   33   60:i2d             
    //   34   61:aload_0         
    //   35   62:getfield        #79  <Field ImageView viewCursor>
    //   36   65:invokevirtual   #223 <Method int ImageView.getMeasuredWidth()>
    //   37   68:iconst_2        
    //   38   69:idiv            
    //   39   70:i2d             
    //   40   71:invokestatic    #229 <Method double Math.floor(double)>
    //   41   74:dsub            
    //   42   75:aload_0         
    //   43   76:getfield        #101 <Field ViewGroup viewContainer>
    //   44   79:invokevirtual   #232 <Method int ViewGroup.getPaddingLeft()>
    //   45   82:i2d             
    //   46   83:dsub            
    //   47   84:d2i             
    //   48   85:putfield        #235 <Field int android.widget.RelativeLayout$LayoutParams.leftMargin>
    //   49   88:aload_2         
    //   50   89:fload_1         
    //   51   90:aload_0         
    //   52   91:getfield        #65  <Field View viewHue>
    //   53   94:invokevirtual   #238 <Method int View.getTop()>
    //   54   97:i2f             
    //   55   98:fadd            
    //   56   99:f2d             
    //   57  100:aload_0         
    //   58  101:getfield        #79  <Field ImageView viewCursor>
    //   59  104:invokevirtual   #239 <Method int ImageView.getMeasuredHeight()>
    //   60  107:iconst_2        
    //   61  108:idiv            
    //   62  109:i2d             
    //   63  110:invokestatic    #229 <Method double Math.floor(double)>
    //   64  113:dsub            
    //   65  114:aload_0         
    //   66  115:getfield        #101 <Field ViewGroup viewContainer>
    //   67  118:invokevirtual   #242 <Method int ViewGroup.getPaddingTop()>
    //   68  121:i2d             
    //   69  122:dsub            
    //   70  123:d2i             
    //   71  124:putfield        #245 <Field int android.widget.RelativeLayout$LayoutParams.topMargin>
    //   72  127:aload_0         
    //   73  128:getfield        #79  <Field ImageView viewCursor>
    //   74  131:aload_2         
    //   75  132:invokevirtual   #249 <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
    //   76  135:return          
    }

    protected void moveTarget()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #252 <Method float getSat()>
    //    2    4:aload_0         
    //    3    5:getfield        #72  <Field AmbilWarnaKotak viewSatVal>
    //    4    8:invokevirtual   #253 <Method int AmbilWarnaKotak.getMeasuredWidth()>
    //    5   11:i2f             
    //    6   12:fmul            
    //    7   13:fstore_1        
    //    8   14:fconst_1        
    //    9   15:aload_0         
    //   10   16:invokespecial   #255 <Method float getVal()>
    //   11   19:fsub            
    //   12   20:aload_0         
    //   13   21:getfield        #72  <Field AmbilWarnaKotak viewSatVal>
    //   14   24:invokevirtual   #256 <Method int AmbilWarnaKotak.getMeasuredHeight()>
    //   15   27:i2f             
    //   16   28:fmul            
    //   17   29:fstore_2        
    //   18   30:aload_0         
    //   19   31:getfield        #94  <Field ImageView viewTarget>
    //   20   34:invokevirtual   #215 <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
    //   21   37:checkcast       #217 <Class android.widget.RelativeLayout$LayoutParams>
    //   22   40:astore_3        
    //   23   41:aload_3         
    //   24   42:fload_1         
    //   25   43:aload_0         
    //   26   44:getfield        #72  <Field AmbilWarnaKotak viewSatVal>
    //   27   47:invokevirtual   #257 <Method int AmbilWarnaKotak.getLeft()>
    //   28   50:i2f             
    //   29   51:fadd            
    //   30   52:f2d             
    //   31   53:aload_0         
    //   32   54:getfield        #94  <Field ImageView viewTarget>
    //   33   57:invokevirtual   #223 <Method int ImageView.getMeasuredWidth()>
    //   34   60:iconst_2        
    //   35   61:idiv            
    //   36   62:i2d             
    //   37   63:invokestatic    #229 <Method double Math.floor(double)>
    //   38   66:dsub            
    //   39   67:aload_0         
    //   40   68:getfield        #101 <Field ViewGroup viewContainer>
    //   41   71:invokevirtual   #232 <Method int ViewGroup.getPaddingLeft()>
    //   42   74:i2d             
    //   43   75:dsub            
    //   44   76:d2i             
    //   45   77:putfield        #235 <Field int android.widget.RelativeLayout$LayoutParams.leftMargin>
    //   46   80:aload_3         
    //   47   81:fload_2         
    //   48   82:aload_0         
    //   49   83:getfield        #72  <Field AmbilWarnaKotak viewSatVal>
    //   50   86:invokevirtual   #258 <Method int AmbilWarnaKotak.getTop()>
    //   51   89:i2f             
    //   52   90:fadd            
    //   53   91:f2d             
    //   54   92:aload_0         
    //   55   93:getfield        #94  <Field ImageView viewTarget>
    //   56   96:invokevirtual   #239 <Method int ImageView.getMeasuredHeight()>
    //   57   99:iconst_2        
    //   58  100:idiv            
    //   59  101:i2d             
    //   60  102:invokestatic    #229 <Method double Math.floor(double)>
    //   61  105:dsub            
    //   62  106:aload_0         
    //   63  107:getfield        #101 <Field ViewGroup viewContainer>
    //   64  110:invokevirtual   #242 <Method int ViewGroup.getPaddingTop()>
    //   65  113:i2d             
    //   66  114:dsub            
    //   67  115:d2i             
    //   68  116:putfield        #245 <Field int android.widget.RelativeLayout$LayoutParams.topMargin>
    //   69  119:aload_0         
    //   70  120:getfield        #94  <Field ImageView viewTarget>
    //   71  123:aload_3         
    //   72  124:invokevirtual   #249 <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
    //   73  127:return          
    }

    public void show()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #159 <Field AlertDialog dialog>
    //    2    4:invokevirtual   #261 <Method void AlertDialog.show()>
    //    3    7:return          
    }

    final float currentColorHsv[];
    final AlertDialog dialog;
    final OnAmbilWarnaListener listener;
    final ViewGroup viewContainer;
    final ImageView viewCursor;
    final View viewHue;
    final View viewNewColor;
    final View viewOldColor;
    final AmbilWarnaKotak viewSatVal;
    final ImageView viewTarget;

    static void access$0(AmbilWarnaDialog ambilwarnadialog, float f)
    {
    //    0    0:aload_0         
    //    1    1:fload_1         
    //    2    2:invokespecial   #183 <Method void setHue(float)>
    //    3    5:return          
    }

    static float access$1(AmbilWarnaDialog ambilwarnadialog)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #105 <Method float getHue()>
    //    2    4:freturn         
    }

    static int access$2(AmbilWarnaDialog ambilwarnadialog)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #191 <Method int getColor()>
    //    2    4:ireturn         
    }

    static void access$3(AmbilWarnaDialog ambilwarnadialog, float f)
    {
    //    0    0:aload_0         
    //    1    1:fload_1         
    //    2    2:invokespecial   #195 <Method void setSat(float)>
    //    3    5:return          
    }

    static void access$4(AmbilWarnaDialog ambilwarnadialog, float f)
    {
    //    0    0:aload_0         
    //    1    1:fload_1         
    //    2    2:invokespecial   #199 <Method void setVal(float)>
    //    3    5:return          
    }

    // Unreferenced inner class yuku/ambilwarna/AmbilWarnaDialog$1

/* anonymous class */
    class _cls1
        implements android.view.View.OnTouchListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #16  <Field AmbilWarnaDialog this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public boolean onTouch(View view, MotionEvent motionevent)
        {
        //    0    0:aload_2         
        //    1    1:invokevirtual   #27  <Method int MotionEvent.getAction()>
        //    2    4:iconst_2        
        //    3    5:icmpeq          23
        //    4    8:aload_2         
        //    5    9:invokevirtual   #27  <Method int MotionEvent.getAction()>
        //    6   12:ifeq            23
        //    7   15:aload_2         
        //    8   16:invokevirtual   #27  <Method int MotionEvent.getAction()>
        //    9   19:iconst_1        
        //   10   20:icmpne          151
        //   11   23:aload_2         
        //   12   24:invokevirtual   #31  <Method float MotionEvent.getY()>
        //   13   27:fstore_3        
        //   14   28:fload_3         
        //   15   29:fconst_0        
        //   16   30:fcmpg           
        //   17   31:ifge            36
        //   18   34:fconst_0        
        //   19   35:fstore_3        
        //   20   36:fload_3         
        //   21   37:aload_0         
        //   22   38:getfield        #16  <Field AmbilWarnaDialog this$0>
        //   23   41:getfield        #35  <Field View AmbilWarnaDialog.viewHue>
        //   24   44:invokevirtual   #40  <Method int View.getMeasuredHeight()>
        //   25   47:i2f             
        //   26   48:fcmpl           
        //   27   49:ifle            67
        //   28   52:aload_0         
        //   29   53:getfield        #16  <Field AmbilWarnaDialog this$0>
        //   30   56:getfield        #35  <Field View AmbilWarnaDialog.viewHue>
        //   31   59:invokevirtual   #40  <Method int View.getMeasuredHeight()>
        //   32   62:i2f             
        //   33   63:ldc1            #41  <Float 0.001F>
        //   34   65:fsub            
        //   35   66:fstore_3        
        //   36   67:ldc1            #42  <Float 360F>
        //   37   69:fload_3         
        //   38   70:ldc1            #42  <Float 360F>
        //   39   72:aload_0         
        //   40   73:getfield        #16  <Field AmbilWarnaDialog this$0>
        //   41   76:getfield        #35  <Field View AmbilWarnaDialog.viewHue>
        //   42   79:invokevirtual   #40  <Method int View.getMeasuredHeight()>
        //   43   82:i2f             
        //   44   83:fdiv            
        //   45   84:fmul            
        //   46   85:fsub            
        //   47   86:fstore          4
        //   48   88:fload           4
        //   49   90:ldc1            #42  <Float 360F>
        //   50   92:fcmpl           
        //   51   93:ifne            99
        //   52   96:fconst_0        
        //   53   97:fstore          4
        //   54   99:aload_0         
        //   55  100:getfield        #16  <Field AmbilWarnaDialog this$0>
        //   56  103:fload           4
        //   57  105:invokestatic    #46  <Method void AmbilWarnaDialog.access$0(AmbilWarnaDialog, float)>
        //   58  108:aload_0         
        //   59  109:getfield        #16  <Field AmbilWarnaDialog this$0>
        //   60  112:getfield        #50  <Field AmbilWarnaKotak AmbilWarnaDialog.viewSatVal>
        //   61  115:aload_0         
        //   62  116:getfield        #16  <Field AmbilWarnaDialog this$0>
        //   63  119:invokestatic    #54  <Method float AmbilWarnaDialog.access$1(AmbilWarnaDialog)>
        //   64  122:invokevirtual   #60  <Method void AmbilWarnaKotak.setHue(float)>
        //   65  125:aload_0         
        //   66  126:getfield        #16  <Field AmbilWarnaDialog this$0>
        //   67  129:invokevirtual   #63  <Method void AmbilWarnaDialog.moveCursor()>
        //   68  132:aload_0         
        //   69  133:getfield        #16  <Field AmbilWarnaDialog this$0>
        //   70  136:getfield        #66  <Field View AmbilWarnaDialog.viewNewColor>
        //   71  139:aload_0         
        //   72  140:getfield        #16  <Field AmbilWarnaDialog this$0>
        //   73  143:invokestatic    #70  <Method int AmbilWarnaDialog.access$2(AmbilWarnaDialog)>
        //   74  146:invokevirtual   #74  <Method void View.setBackgroundColor(int)>
        //   75  149:iconst_1        
        //   76  150:ireturn         
        //   77  151:iconst_0        
        //   78  152:ireturn         
        }

        final AmbilWarnaDialog this$0;
    }


    // Unreferenced inner class yuku/ambilwarna/AmbilWarnaDialog$2

/* anonymous class */
    class _cls2
        implements android.view.View.OnTouchListener
    {

        _cls2()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #16  <Field AmbilWarnaDialog this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public boolean onTouch(View view, MotionEvent motionevent)
        {
        //    0    0:aload_2         
        //    1    1:invokevirtual   #27  <Method int MotionEvent.getAction()>
        //    2    4:iconst_2        
        //    3    5:icmpeq          23
        //    4    8:aload_2         
        //    5    9:invokevirtual   #27  <Method int MotionEvent.getAction()>
        //    6   12:ifeq            23
        //    7   15:aload_2         
        //    8   16:invokevirtual   #27  <Method int MotionEvent.getAction()>
        //    9   19:iconst_1        
        //   10   20:icmpne          183
        //   11   23:aload_2         
        //   12   24:invokevirtual   #31  <Method float MotionEvent.getX()>
        //   13   27:fstore_3        
        //   14   28:aload_2         
        //   15   29:invokevirtual   #34  <Method float MotionEvent.getY()>
        //   16   32:fstore          4
        //   17   34:fload_3         
        //   18   35:fconst_0        
        //   19   36:fcmpg           
        //   20   37:ifge            42
        //   21   40:fconst_0        
        //   22   41:fstore_3        
        //   23   42:fload_3         
        //   24   43:aload_0         
        //   25   44:getfield        #16  <Field AmbilWarnaDialog this$0>
        //   26   47:getfield        #38  <Field AmbilWarnaKotak AmbilWarnaDialog.viewSatVal>
        //   27   50:invokevirtual   #43  <Method int AmbilWarnaKotak.getMeasuredWidth()>
        //   28   53:i2f             
        //   29   54:fcmpl           
        //   30   55:ifle            70
        //   31   58:aload_0         
        //   32   59:getfield        #16  <Field AmbilWarnaDialog this$0>
        //   33   62:getfield        #38  <Field AmbilWarnaKotak AmbilWarnaDialog.viewSatVal>
        //   34   65:invokevirtual   #43  <Method int AmbilWarnaKotak.getMeasuredWidth()>
        //   35   68:i2f             
        //   36   69:fstore_3        
        //   37   70:fload           4
        //   38   72:fconst_0        
        //   39   73:fcmpg           
        //   40   74:ifge            80
        //   41   77:fconst_0        
        //   42   78:fstore          4
        //   43   80:fload           4
        //   44   82:aload_0         
        //   45   83:getfield        #16  <Field AmbilWarnaDialog this$0>
        //   46   86:getfield        #38  <Field AmbilWarnaKotak AmbilWarnaDialog.viewSatVal>
        //   47   89:invokevirtual   #46  <Method int AmbilWarnaKotak.getMeasuredHeight()>
        //   48   92:i2f             
        //   49   93:fcmpl           
        //   50   94:ifle            110
        //   51   97:aload_0         
        //   52   98:getfield        #16  <Field AmbilWarnaDialog this$0>
        //   53  101:getfield        #38  <Field AmbilWarnaKotak AmbilWarnaDialog.viewSatVal>
        //   54  104:invokevirtual   #46  <Method int AmbilWarnaKotak.getMeasuredHeight()>
        //   55  107:i2f             
        //   56  108:fstore          4
        //   57  110:aload_0         
        //   58  111:getfield        #16  <Field AmbilWarnaDialog this$0>
        //   59  114:fload_3         
        //   60  115:fconst_1        
        //   61  116:aload_0         
        //   62  117:getfield        #16  <Field AmbilWarnaDialog this$0>
        //   63  120:getfield        #38  <Field AmbilWarnaKotak AmbilWarnaDialog.viewSatVal>
        //   64  123:invokevirtual   #43  <Method int AmbilWarnaKotak.getMeasuredWidth()>
        //   65  126:i2f             
        //   66  127:fdiv            
        //   67  128:fmul            
        //   68  129:invokestatic    #50  <Method void AmbilWarnaDialog.access$3(AmbilWarnaDialog, float)>
        //   69  132:aload_0         
        //   70  133:getfield        #16  <Field AmbilWarnaDialog this$0>
        //   71  136:fconst_1        
        //   72  137:fload           4
        //   73  139:fconst_1        
        //   74  140:aload_0         
        //   75  141:getfield        #16  <Field AmbilWarnaDialog this$0>
        //   76  144:getfield        #38  <Field AmbilWarnaKotak AmbilWarnaDialog.viewSatVal>
        //   77  147:invokevirtual   #46  <Method int AmbilWarnaKotak.getMeasuredHeight()>
        //   78  150:i2f             
        //   79  151:fdiv            
        //   80  152:fmul            
        //   81  153:fsub            
        //   82  154:invokestatic    #53  <Method void AmbilWarnaDialog.access$4(AmbilWarnaDialog, float)>
        //   83  157:aload_0         
        //   84  158:getfield        #16  <Field AmbilWarnaDialog this$0>
        //   85  161:invokevirtual   #56  <Method void AmbilWarnaDialog.moveTarget()>
        //   86  164:aload_0         
        //   87  165:getfield        #16  <Field AmbilWarnaDialog this$0>
        //   88  168:getfield        #60  <Field View AmbilWarnaDialog.viewNewColor>
        //   89  171:aload_0         
        //   90  172:getfield        #16  <Field AmbilWarnaDialog this$0>
        //   91  175:invokestatic    #64  <Method int AmbilWarnaDialog.access$2(AmbilWarnaDialog)>
        //   92  178:invokevirtual   #70  <Method void View.setBackgroundColor(int)>
        //   93  181:iconst_1        
        //   94  182:ireturn         
        //   95  183:iconst_0        
        //   96  184:ireturn         
        }

        final AmbilWarnaDialog this$0;
    }


    // Unreferenced inner class yuku/ambilwarna/AmbilWarnaDialog$3

/* anonymous class */
    class _cls3
        implements android.content.DialogInterface.OnClickListener
    {

        _cls3()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #16  <Field AmbilWarnaDialog this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(DialogInterface dialoginterface, int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field AmbilWarnaDialog this$0>
        //    2    4:getfield        #25  <Field AmbilWarnaDialog$OnAmbilWarnaListener AmbilWarnaDialog.listener>
        //    3    7:ifnull          33
        //    4   10:aload_0         
        //    5   11:getfield        #16  <Field AmbilWarnaDialog this$0>
        //    6   14:getfield        #25  <Field AmbilWarnaDialog$OnAmbilWarnaListener AmbilWarnaDialog.listener>
        //    7   17:aload_0         
        //    8   18:getfield        #16  <Field AmbilWarnaDialog this$0>
        //    9   21:aload_0         
        //   10   22:getfield        #16  <Field AmbilWarnaDialog this$0>
        //   11   25:invokestatic    #29  <Method int AmbilWarnaDialog.access$2(AmbilWarnaDialog)>
        //   12   28:invokeinterface #35  <Method void AmbilWarnaDialog$OnAmbilWarnaListener.onOk(AmbilWarnaDialog, int)>
        //   13   33:return          
        }

        final AmbilWarnaDialog this$0;
    }


    // Unreferenced inner class yuku/ambilwarna/AmbilWarnaDialog$4

/* anonymous class */
    class _cls4
        implements android.content.DialogInterface.OnClickListener
    {

        _cls4()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #16  <Field AmbilWarnaDialog this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(DialogInterface dialoginterface, int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field AmbilWarnaDialog this$0>
        //    2    4:getfield        #25  <Field AmbilWarnaDialog$OnAmbilWarnaListener AmbilWarnaDialog.listener>
        //    3    7:ifnull          26
        //    4   10:aload_0         
        //    5   11:getfield        #16  <Field AmbilWarnaDialog this$0>
        //    6   14:getfield        #25  <Field AmbilWarnaDialog$OnAmbilWarnaListener AmbilWarnaDialog.listener>
        //    7   17:aload_0         
        //    8   18:getfield        #16  <Field AmbilWarnaDialog this$0>
        //    9   21:invokeinterface #30  <Method void AmbilWarnaDialog$OnAmbilWarnaListener.onCancel(AmbilWarnaDialog)>
        //   10   26:return          
        }

        final AmbilWarnaDialog this$0;
    }


    // Unreferenced inner class yuku/ambilwarna/AmbilWarnaDialog$5

/* anonymous class */
    class _cls5
        implements android.content.DialogInterface.OnCancelListener
    {

        _cls5()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #16  <Field AmbilWarnaDialog this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void onCancel(DialogInterface dialoginterface)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field AmbilWarnaDialog this$0>
        //    2    4:getfield        #25  <Field AmbilWarnaDialog$OnAmbilWarnaListener AmbilWarnaDialog.listener>
        //    3    7:ifnull          26
        //    4   10:aload_0         
        //    5   11:getfield        #16  <Field AmbilWarnaDialog this$0>
        //    6   14:getfield        #25  <Field AmbilWarnaDialog$OnAmbilWarnaListener AmbilWarnaDialog.listener>
        //    7   17:aload_0         
        //    8   18:getfield        #16  <Field AmbilWarnaDialog this$0>
        //    9   21:invokeinterface #29  <Method void AmbilWarnaDialog$OnAmbilWarnaListener.onCancel(AmbilWarnaDialog)>
        //   10   26:return          
        }

        final AmbilWarnaDialog this$0;
    }


    // Unreferenced inner class yuku/ambilwarna/AmbilWarnaDialog$6

/* anonymous class */
    class _cls6
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        _cls6()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #18  <Field AmbilWarnaDialog this$0>
        //    3    5:aload_0         
        //    4    6:aload_2         
        //    5    7:putfield        #20  <Field View val$view>
        //    6   10:aload_0         
        //    7   11:invokespecial   #23  <Method void Object()>
        //    8   14:return          
        }

        public void onGlobalLayout()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #18  <Field AmbilWarnaDialog this$0>
        //    2    4:invokevirtual   #27  <Method void AmbilWarnaDialog.moveCursor()>
        //    3    7:aload_0         
        //    4    8:getfield        #18  <Field AmbilWarnaDialog this$0>
        //    5   11:invokevirtual   #30  <Method void AmbilWarnaDialog.moveTarget()>
        //    6   14:aload_0         
        //    7   15:getfield        #20  <Field View val$view>
        //    8   18:invokevirtual   #36  <Method ViewTreeObserver View.getViewTreeObserver()>
        //    9   21:aload_0         
        //   10   22:invokevirtual   #42  <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
        //   11   25:return          
        }

        final AmbilWarnaDialog this$0;
        private final View val$view;
    }

}
