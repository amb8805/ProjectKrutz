// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.view.MenuItem;
import android.widget.ShareActionProvider;

class ShareCompatICS
{

    ShareCompatICS()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #12  <Method void Object()>
    //    2    4:return          
    }

    public static void configureMenuItem(MenuItem menuitem, Activity activity, Intent intent)
    {
    //    0    0:aload_0         
    //    1    1:invokeinterface #20  <Method android.view.ActionProvider MenuItem.getActionProvider()>
    //    2    6:astore_3        
    //    3    7:aload_3         
    //    4    8:instanceof      #22  <Class ShareActionProvider>
    //    5   11:ifne            70
    //    6   14:new             #22  <Class ShareActionProvider>
    //    7   17:dup             
    //    8   18:aload_1         
    //    9   19:invokespecial   #25  <Method void ShareActionProvider(android.content.Context)>
    //   10   22:astore          4
    //   11   24:aload           4
    //   12   26:new             #27  <Class StringBuilder>
    //   13   29:dup             
    //   14   30:invokespecial   #28  <Method void StringBuilder()>
    //   15   33:ldc1            #8   <String ".sharecompat_">
    //   16   35:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
    //   17   38:aload_1         
    //   18   39:invokevirtual   #36  <Method Class Object.getClass()>
    //   19   42:invokevirtual   #42  <Method String Class.getName()>
    //   20   45:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
    //   21   48:invokevirtual   #45  <Method String StringBuilder.toString()>
    //   22   51:invokevirtual   #49  <Method void ShareActionProvider.setShareHistoryFileName(String)>
    //   23   54:aload           4
    //   24   56:aload_2         
    //   25   57:invokevirtual   #53  <Method void ShareActionProvider.setShareIntent(Intent)>
    //   26   60:aload_0         
    //   27   61:aload           4
    //   28   63:invokeinterface #57  <Method MenuItem MenuItem.setActionProvider(android.view.ActionProvider)>
    //   29   68:pop             
    //   30   69:return          
    //   31   70:aload_3         
    //   32   71:checkcast       #22  <Class ShareActionProvider>
    //   33   74:astore          4
    //   34   76:goto            24
    }

    private static final String HISTORY_FILENAME_PREFIX = ".sharecompat_";
}
