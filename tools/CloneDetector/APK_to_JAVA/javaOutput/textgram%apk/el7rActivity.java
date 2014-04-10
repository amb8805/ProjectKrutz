// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.*;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.analytics.GoogleAnalyticsTracker;

// Referenced classes of package codeadore.textgram:
//            Settings, Utilities, MainActivity

public class el7rActivity extends ActionBarActivity
{

    public el7rActivity()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #22  <Method void ActionBarActivity()>
    //    2    4:return          
    }

    public void onBackPressed()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #25  <Method void ActionBarActivity.onBackPressed()>
    //    2    4:aload_0         
    //    3    5:ldc1            #26  <Int 0x7f040008>
    //    4    7:ldc1            #27  <Int 0x7f04000b>
    //    5    9:invokevirtual   #31  <Method void overridePendingTransition(int, int)>
    //    6   12:return          
    }

    protected void onCreate(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #35  <Method void ActionBarActivity.onCreate(Bundle)>
    //    3    5:aload_0         
    //    4    6:ldc1            #36  <Int 0x7f040009>
    //    5    8:ldc1            #37  <Int 0x7f04000a>
    //    6   10:invokevirtual   #31  <Method void overridePendingTransition(int, int)>
    //    7   13:aload_0         
    //    8   14:aload_0         
    //    9   15:putfield        #39  <Field el7rActivity thisActivity>
    //   10   18:aload_0         
    //   11   19:invokevirtual   #43  <Method ActionBar getSupportActionBar()>
    //   12   22:astore_2        
    //   13   23:aload_0         
    //   14   24:invokevirtual   #47  <Method LayoutInflater getLayoutInflater()>
    //   15   27:ldc1            #48  <Int 0x7f030002>
    //   16   29:aconst_null     
    //   17   30:invokevirtual   #54  <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
    //   18   33:astore_3        
    //   19   34:aload_2         
    //   20   35:aload_3         
    //   21   36:invokevirtual   #60  <Method void ActionBar.setCustomView(View)>
    //   22   39:aload_2         
    //   23   40:iconst_0        
    //   24   41:invokevirtual   #64  <Method void ActionBar.setDisplayShowTitleEnabled(boolean)>
    //   25   44:aload_2         
    //   26   45:iconst_1        
    //   27   46:invokevirtual   #67  <Method void ActionBar.setDisplayShowCustomEnabled(boolean)>
    //   28   49:aload_0         
    //   29   50:aload_3         
    //   30   51:ldc1            #68  <Int 0x7f06001d>
    //   31   53:invokevirtual   #74  <Method View View.findViewById(int)>
    //   32   56:checkcast       #76  <Class TextView>
    //   33   59:putfield        #78  <Field TextView actionBarTV>
    //   34   62:aload_0         
    //   35   63:invokestatic    #84  <Method GoogleAnalyticsTracker GoogleAnalyticsTracker.getInstance()>
    //   36   66:putfield        #86  <Field GoogleAnalyticsTracker tracker>
    //   37   69:aload_0         
    //   38   70:getfield        #86  <Field GoogleAnalyticsTracker tracker>
    //   39   73:getstatic       #91  <Field String Settings.googleAnalyticsKey>
    //   40   76:bipush          20
    //   41   78:aload_0         
    //   42   79:invokevirtual   #95  <Method void GoogleAnalyticsTracker.startNewSession(String, int, Context)>
    //   43   82:return          
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #101 <Method MenuInflater getMenuInflater()>
    //    2    4:ldc1            #102 <Int 0x7f0d0000>
    //    3    6:aload_1         
    //    4    7:invokevirtual   #107 <Method void MenuInflater.inflate(int, Menu)>
    //    5   10:aload_0         
    //    6   11:aload_1         
    //    7   12:putfield        #109 <Field Menu theMenu>
    //    8   15:aload_0         
    //    9   16:invokevirtual   #113 <Method Context getBaseContext()>
    //   10   19:ldc1            #115 <String "layout_inflater">
    //   11   21:invokevirtual   #121 <Method Object Context.getSystemService(String)>
    //   12   24:checkcast       #50  <Class LayoutInflater>
    //   13   27:astore_2        
    //   14   28:aload_2         
    //   15   29:ldc1            #122 <Int 0x7f030000>
    //   16   31:aconst_null     
    //   17   32:invokevirtual   #54  <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
    //   18   35:astore_3        
    //   19   36:aload_3         
    //   20   37:ldc1            #123 <Int 0x7f06001c>
    //   21   39:invokevirtual   #74  <Method View View.findViewById(int)>
    //   22   42:checkcast       #125 <Class Button>
    //   23   45:astore          4
    //   24   47:aload           4
    //   25   49:aload_0         
    //   26   50:ldc1            #126 <Int 0x7f0b0014>
    //   27   52:invokevirtual   #130 <Method String getString(int)>
    //   28   55:invokevirtual   #134 <Method void Button.setText(CharSequence)>
    //   29   58:aload           4
    //   30   60:new             #136 <Class el7rActivity$1>
    //   31   63:dup             
    //   32   64:aload_0         
    //   33   65:invokespecial   #139 <Method void el7rActivity$1(el7rActivity)>
    //   34   68:invokevirtual   #143 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //   35   71:aload_1         
    //   36   72:ldc1            #144 <Int 0x7f0600e0>
    //   37   74:invokeinterface #150 <Method MenuItem Menu.findItem(int)>
    //   38   79:aload_3         
    //   39   80:invokestatic    #156 <Method MenuItem MenuItemCompat.setActionView(MenuItem, View)>
    //   40   83:pop             
    //   41   84:aload_1         
    //   42   85:ldc1            #157 <Int 0x7f0600df>
    //   43   87:invokeinterface #150 <Method MenuItem Menu.findItem(int)>
    //   44   92:putstatic       #159 <Field MenuItem progressItem>
    //   45   95:aload_2         
    //   46   96:ldc1            #160 <Int 0x7f030001>
    //   47   98:aconst_null     
    //   48   99:invokevirtual   #54  <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
    //   49  102:astore          6
    //   50  104:getstatic       #159 <Field MenuItem progressItem>
    //   51  107:aload           6
    //   52  109:invokestatic    #156 <Method MenuItem MenuItemCompat.setActionView(MenuItem, View)>
    //   53  112:pop             
    //   54  113:iconst_1        
    //   55  114:ireturn         
    }

    protected void onDestroy()
    {
    // try 0 15 handler(s) 20
    //    0    0:aload_0         
    //    1    1:getfield        #86  <Field GoogleAnalyticsTracker tracker>
    //    2    4:invokevirtual   #167 <Method boolean GoogleAnalyticsTracker.dispatch()>
    //    3    7:pop             
    //    4    8:aload_0         
    //    5    9:getfield        #86  <Field GoogleAnalyticsTracker tracker>
    //    6   12:invokevirtual   #170 <Method void GoogleAnalyticsTracker.stopSession()>
    //    7   15:aload_0         
    //    8   16:invokespecial   #172 <Method void ActionBarActivity.onDestroy()>
    //    9   19:return          
    // catch Exception
    //   10   20:astore_1        
    //   11   21:ldc1            #174 <String "GoogleAnalytics">
    //   12   23:ldc1            #176 <String "in dispatching and stopping">
    //   13   25:invokestatic    #182 <Method int Log.e(String, String)>
    //   14   28:pop             
    //   15   29:goto            15
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
    //    0    0:iload_1         
    //    1    1:bipush          82
    //    2    3:icmpne          28
    //    3    6:aload_0         
    //    4    7:getfield        #109 <Field Menu theMenu>
    //    5   10:ifnull          26
    //    6   13:aload_0         
    //    7   14:getfield        #109 <Field Menu theMenu>
    //    8   17:ldc1            #185 <Int 0x7f0600e1>
    //    9   19:iconst_0        
    //   10   20:invokeinterface #189 <Method boolean Menu.performIdentifierAction(int, int)>
    //   11   25:pop             
    //   12   26:iconst_1        
    //   13   27:ireturn         
    //   14   28:aload_0         
    //   15   29:iload_1         
    //   16   30:aload_2         
    //   17   31:invokespecial   #191 <Method boolean ActionBarActivity.onKeyUp(int, KeyEvent)>
    //   18   34:ireturn         
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
    //    0    0:aload_1         
    //    1    1:aload_0         
    //    2    2:getfield        #39  <Field el7rActivity thisActivity>
    //    3    5:ldc1            #195 <String "MainActivity">
    //    4    7:invokestatic    #201 <Method void Utilities.optionsMenuAction(MenuItem, android.app.Activity, String)>
    //    5   10:iconst_1        
    //    6   11:ireturn         
    }

    public void setTitle(String s)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #78  <Field TextView actionBarTV>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #204 <Method void TextView.setText(CharSequence)>
    //    4    8:return          
    }

    static MenuItem progressItem;
    private TextView actionBarTV;
    SubMenu menu_main;
    Menu theMenu;
    String thisActityName;
    el7rActivity thisActivity;
    GoogleAnalyticsTracker tracker;

    // Unreferenced inner class codeadore/textgram/el7rActivity$1

/* anonymous class */
    class _cls1
        implements android.view.View.OnClickListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field el7rActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:invokestatic    #27  <Method void MainActivity.goNext()>
        //    1    3:return          
        }

        final el7rActivity this$0;
    }

}
