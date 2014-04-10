// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;

// Referenced classes of package android.support.v4.app:
//            ActivityOptionsCompatJB

public class ActivityOptionsCompat
{
    private static class ActivityOptionsImplJB extends ActivityOptionsCompat
    {

        ActivityOptionsImplJB(ActivityOptionsCompatJB activityoptionscompatjb)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #11  <Method void ActivityOptionsCompat()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:putfield        #13  <Field ActivityOptionsCompatJB mImpl>
        //    5    9:return          
        }

        public Bundle toBundle()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #13  <Field ActivityOptionsCompatJB mImpl>
        //    2    4:invokevirtual   #19  <Method Bundle ActivityOptionsCompatJB.toBundle()>
        //    3    7:areturn         
        }

        public void update(ActivityOptionsCompat activityoptionscompat)
        {
        //    0    0:aload_1         
        //    1    1:instanceof      #2   <Class ActivityOptionsCompat$ActivityOptionsImplJB>
        //    2    4:ifeq            23
        //    3    7:aload_1         
        //    4    8:checkcast       #2   <Class ActivityOptionsCompat$ActivityOptionsImplJB>
        //    5   11:astore_2        
        //    6   12:aload_0         
        //    7   13:getfield        #13  <Field ActivityOptionsCompatJB mImpl>
        //    8   16:aload_2         
        //    9   17:getfield        #13  <Field ActivityOptionsCompatJB mImpl>
        //   10   20:invokevirtual   #23  <Method void ActivityOptionsCompatJB.update(ActivityOptionsCompatJB)>
        //   11   23:return          
        }

        private final ActivityOptionsCompatJB mImpl;
    }


    protected ActivityOptionsCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static ActivityOptionsCompat makeCustomAnimation(Context context, int i, int j)
    {
    //    0    0:getstatic       #16  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          16
    //    2    5:icmplt          22
    //    3    8:new             #18  <Class ActivityOptionsCompat$ActivityOptionsImplJB>
    //    4   11:dup             
    //    5   12:aload_0         
    //    6   13:iload_1         
    //    7   14:iload_2         
    //    8   15:invokestatic    #23  <Method ActivityOptionsCompatJB ActivityOptionsCompatJB.makeCustomAnimation(Context, int, int)>
    //    9   18:invokespecial   #26  <Method void ActivityOptionsCompat$ActivityOptionsImplJB(ActivityOptionsCompatJB)>
    //   10   21:areturn         
    //   11   22:new             #2   <Class ActivityOptionsCompat>
    //   12   25:dup             
    //   13   26:invokespecial   #27  <Method void ActivityOptionsCompat()>
    //   14   29:areturn         
    }

    public static ActivityOptionsCompat makeScaleUpAnimation(View view, int i, int j, int k, int l)
    {
    //    0    0:getstatic       #16  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          16
    //    2    5:icmplt          25
    //    3    8:new             #18  <Class ActivityOptionsCompat$ActivityOptionsImplJB>
    //    4   11:dup             
    //    5   12:aload_0         
    //    6   13:iload_1         
    //    7   14:iload_2         
    //    8   15:iload_3         
    //    9   16:iload           4
    //   10   18:invokestatic    #32  <Method ActivityOptionsCompatJB ActivityOptionsCompatJB.makeScaleUpAnimation(View, int, int, int, int)>
    //   11   21:invokespecial   #26  <Method void ActivityOptionsCompat$ActivityOptionsImplJB(ActivityOptionsCompatJB)>
    //   12   24:areturn         
    //   13   25:new             #2   <Class ActivityOptionsCompat>
    //   14   28:dup             
    //   15   29:invokespecial   #27  <Method void ActivityOptionsCompat()>
    //   16   32:areturn         
    }

    public static ActivityOptionsCompat makeThumbnailScaleUpAnimation(View view, Bitmap bitmap, int i, int j)
    {
    //    0    0:getstatic       #16  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          16
    //    2    5:icmplt          23
    //    3    8:new             #18  <Class ActivityOptionsCompat$ActivityOptionsImplJB>
    //    4   11:dup             
    //    5   12:aload_0         
    //    6   13:aload_1         
    //    7   14:iload_2         
    //    8   15:iload_3         
    //    9   16:invokestatic    #37  <Method ActivityOptionsCompatJB ActivityOptionsCompatJB.makeThumbnailScaleUpAnimation(View, Bitmap, int, int)>
    //   10   19:invokespecial   #26  <Method void ActivityOptionsCompat$ActivityOptionsImplJB(ActivityOptionsCompatJB)>
    //   11   22:areturn         
    //   12   23:new             #2   <Class ActivityOptionsCompat>
    //   13   26:dup             
    //   14   27:invokespecial   #27  <Method void ActivityOptionsCompat()>
    //   15   30:areturn         
    }

    public Bundle toBundle()
    {
    //    0    0:aconst_null     
    //    1    1:areturn         
    }

    public void update(ActivityOptionsCompat activityoptionscompat)
    {
    //    0    0:return          
    }
}
