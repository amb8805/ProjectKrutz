// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.ads;

import android.webkit.WebView;
import com.google.ads.internal.d;
import com.google.ads.internal.e;
import com.google.ads.util.b;
import java.util.HashMap;

// Referenced classes of package com.google.ads:
//            o

public class z
    implements o
{

    public z()
    {
    //    0    0:aload_0         
    //    1    1:new             #12  <Class AdActivity$StaticMethodWrapper>
    //    2    4:dup             
    //    3    5:invokespecial   #14  <Method void AdActivity$StaticMethodWrapper()>
    //    4    8:invokespecial   #17  <Method void z(AdActivity$StaticMethodWrapper)>
    //    5   11:return          
    }

    public z(AdActivity.StaticMethodWrapper staticmethodwrapper)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #18  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:putfield        #20  <Field AdActivity$StaticMethodWrapper a>
    //    5    9:return          
    }

    public void a(d d, HashMap hashmap, WebView webview)
    {
    //    0    0:aload_2         
    //    1    1:ldc1            #22  <String "a">
    //    2    3:invokevirtual   #28  <Method Object HashMap.get(Object)>
    //    3    6:checkcast       #30  <Class String>
    //    4    9:astore          4
    //    5   11:aload           4
    //    6   13:ifnonnull       22
    //    7   16:ldc1            #32  <String "Could not get the action parameter for open GMSG.">
    //    8   18:invokestatic    #37  <Method void b.a(String)>
    //    9   21:return          
    //   10   22:aload           4
    //   11   24:ldc1            #39  <String "webapp">
    //   12   26:invokevirtual   #43  <Method boolean String.equals(Object)>
    //   13   29:ifeq            51
    //   14   32:aload_0         
    //   15   33:getfield        #20  <Field AdActivity$StaticMethodWrapper a>
    //   16   36:aload_1         
    //   17   37:new             #45  <Class e>
    //   18   40:dup             
    //   19   41:ldc1            #39  <String "webapp">
    //   20   43:aload_2         
    //   21   44:invokespecial   #48  <Method void e(String, HashMap)>
    //   22   47:invokevirtual   #52  <Method void AdActivity$StaticMethodWrapper.launchAdActivity(d, e)>
    //   23   50:return          
    //   24   51:aload           4
    //   25   53:ldc1            #54  <String "expand">
    //   26   55:invokevirtual   #43  <Method boolean String.equals(Object)>
    //   27   58:ifeq            80
    //   28   61:aload_0         
    //   29   62:getfield        #20  <Field AdActivity$StaticMethodWrapper a>
    //   30   65:aload_1         
    //   31   66:new             #45  <Class e>
    //   32   69:dup             
    //   33   70:ldc1            #54  <String "expand">
    //   34   72:aload_2         
    //   35   73:invokespecial   #48  <Method void e(String, HashMap)>
    //   36   76:invokevirtual   #52  <Method void AdActivity$StaticMethodWrapper.launchAdActivity(d, e)>
    //   37   79:return          
    //   38   80:aload_0         
    //   39   81:getfield        #20  <Field AdActivity$StaticMethodWrapper a>
    //   40   84:aload_1         
    //   41   85:new             #45  <Class e>
    //   42   88:dup             
    //   43   89:ldc1            #56  <String "intent">
    //   44   91:aload_2         
    //   45   92:invokespecial   #48  <Method void e(String, HashMap)>
    //   46   95:invokevirtual   #52  <Method void AdActivity$StaticMethodWrapper.launchAdActivity(d, e)>
    //   47   98:return          
    }

    private AdActivity.StaticMethodWrapper a;
}
