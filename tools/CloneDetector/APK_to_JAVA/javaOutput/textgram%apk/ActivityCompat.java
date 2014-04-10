// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;

// Referenced classes of package android.support.v4.app:
//            ActivityCompatJB, ActivityCompatHoneycomb

public class ActivityCompat extends ContextCompat
{

    public ActivityCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void ContextCompat()>
    //    2    4:return          
    }

    public static void finishAffinity(Activity activity)
    {
    //    0    0:getstatic       #16  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          16
    //    2    5:icmplt          13
    //    3    8:aload_0         
    //    4    9:invokestatic    #20  <Method void ActivityCompatJB.finishAffinity(Activity)>
    //    5   12:return          
    //    6   13:aload_0         
    //    7   14:invokevirtual   #25  <Method void Activity.finish()>
    //    8   17:return          
    }

    public static boolean invalidateOptionsMenu(Activity activity)
    {
    //    0    0:getstatic       #16  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          11
    //    2    5:icmplt          14
    //    3    8:aload_0         
    //    4    9:invokestatic    #31  <Method void ActivityCompatHoneycomb.invalidateOptionsMenu(Activity)>
    //    5   12:iconst_1        
    //    6   13:ireturn         
    //    7   14:iconst_0        
    //    8   15:ireturn         
    }

    public static void startActivity(Activity activity, Intent intent, Bundle bundle)
    {
    //    0    0:getstatic       #16  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          16
    //    2    5:icmplt          15
    //    3    8:aload_0         
    //    4    9:aload_1         
    //    5   10:aload_2         
    //    6   11:invokestatic    #36  <Method void ActivityCompatJB.startActivity(android.content.Context, Intent, Bundle)>
    //    7   14:return          
    //    8   15:aload_0         
    //    9   16:aload_1         
    //   10   17:invokevirtual   #39  <Method void Activity.startActivity(Intent)>
    //   11   20:return          
    }

    public static void startActivityForResult(Activity activity, Intent intent, int i, Bundle bundle)
    {
    //    0    0:getstatic       #16  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          16
    //    2    5:icmplt          16
    //    3    8:aload_0         
    //    4    9:aload_1         
    //    5   10:iload_2         
    //    6   11:aload_3         
    //    7   12:invokestatic    #43  <Method void ActivityCompatJB.startActivityForResult(Activity, Intent, int, Bundle)>
    //    8   15:return          
    //    9   16:aload_0         
    //   10   17:aload_1         
    //   11   18:iload_2         
    //   12   19:invokevirtual   #46  <Method void Activity.startActivityForResult(Intent, int)>
    //   13   22:return          
    }
}
