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
import android.widget.*;
import com.google.android.apps.analytics.GoogleAnalyticsTracker;
import java.lang.reflect.Field;

// Referenced classes of package codeadore.textgram:
//            Settings, Utilities, MainActivity

public class el7rFragmentActivity extends ActionBarActivity
{

    public el7rFragmentActivity()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #20  <Method void ActionBarActivity()>
    //    2    4:return          
    }

    public void onBackPressed()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #23  <Method void ActionBarActivity.onBackPressed()>
    //    2    4:aload_0         
    //    3    5:ldc1            #24  <Int 0x7f040008>
    //    4    7:ldc1            #25  <Int 0x7f04000b>
    //    5    9:invokevirtual   #29  <Method void overridePendingTransition(int, int)>
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
    //    6   10:invokevirtual   #29  <Method void overridePendingTransition(int, int)>
    // try 13 28 handler(s) 120
    //    7   13:aload_0         
    //    8   14:invokestatic    #43  <Method ViewConfiguration ViewConfiguration.get(Context)>
    //    9   17:astore          5
    //   10   19:ldc1            #39  <Class ViewConfiguration>
    //   11   21:ldc1            #45  <String "sHasPermanentMenuKey">
    //   12   23:invokevirtual   #51  <Method Field Class.getDeclaredField(String)>
    //   13   26:astore          6
    //   14   28:aload           6
    //   15   30:ifnull          47
    // try 33 47 handler(s) 120
    //   16   33:aload           6
    //   17   35:iconst_1        
    //   18   36:invokevirtual   #57  <Method void Field.setAccessible(boolean)>
    //   19   39:aload           6
    //   20   41:aload           5
    //   21   43:iconst_0        
    //   22   44:invokevirtual   #61  <Method void Field.setBoolean(Object, boolean)>
    //   23   47:aload_0         
    //   24   48:aload_0         
    //   25   49:putfield        #63  <Field el7rFragmentActivity thisActivity>
    //   26   52:aload_0         
    //   27   53:invokevirtual   #67  <Method ActionBar getSupportActionBar()>
    //   28   56:astore_3        
    //   29   57:aload_0         
    //   30   58:invokevirtual   #71  <Method LayoutInflater getLayoutInflater()>
    //   31   61:ldc1            #72  <Int 0x7f030002>
    //   32   63:aconst_null     
    //   33   64:invokevirtual   #78  <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
    //   34   67:astore          4
    //   35   69:aload_3         
    //   36   70:aload           4
    //   37   72:invokevirtual   #84  <Method void ActionBar.setCustomView(View)>
    //   38   75:aload_3         
    //   39   76:iconst_0        
    //   40   77:invokevirtual   #87  <Method void ActionBar.setDisplayShowTitleEnabled(boolean)>
    //   41   80:aload_3         
    //   42   81:iconst_1        
    //   43   82:invokevirtual   #90  <Method void ActionBar.setDisplayShowCustomEnabled(boolean)>
    //   44   85:aload_0         
    //   45   86:aload           4
    //   46   88:ldc1            #91  <Int 0x7f06001d>
    //   47   90:invokevirtual   #97  <Method View View.findViewById(int)>
    //   48   93:checkcast       #99  <Class TextView>
    //   49   96:putfield        #101 <Field TextView actionBarTV>
    //   50   99:aload_0         
    //   51  100:invokestatic    #107 <Method GoogleAnalyticsTracker GoogleAnalyticsTracker.getInstance()>
    //   52  103:putfield        #109 <Field GoogleAnalyticsTracker tracker>
    //   53  106:aload_0         
    //   54  107:getfield        #109 <Field GoogleAnalyticsTracker tracker>
    //   55  110:getstatic       #115 <Field String Settings.googleAnalyticsKey>
    //   56  113:bipush          20
    //   57  115:aload_0         
    //   58  116:invokevirtual   #119 <Method void GoogleAnalyticsTracker.startNewSession(String, int, Context)>
    //   59  119:return          
    // catch Exception Exception
    //   60  120:astore_2        
    //   61  121:goto            47
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #125 <Method MenuInflater getMenuInflater()>
    //    2    4:ldc1            #126 <Int 0x7f0d0000>
    //    3    6:aload_1         
    //    4    7:invokevirtual   #131 <Method void MenuInflater.inflate(int, Menu)>
    //    5   10:aload_0         
    //    6   11:invokevirtual   #135 <Method Context getBaseContext()>
    //    7   14:ldc1            #137 <String "layout_inflater">
    //    8   16:invokevirtual   #143 <Method Object Context.getSystemService(String)>
    //    9   19:checkcast       #74  <Class LayoutInflater>
    //   10   22:ldc1            #144 <Int 0x7f030000>
    //   11   24:aconst_null     
    //   12   25:invokevirtual   #78  <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
    //   13   28:astore_2        
    //   14   29:aload_2         
    //   15   30:ldc1            #145 <Int 0x7f06001c>
    //   16   32:invokevirtual   #97  <Method View View.findViewById(int)>
    //   17   35:checkcast       #147 <Class Button>
    //   18   38:astore_3        
    //   19   39:aload_3         
    //   20   40:aload_0         
    //   21   41:ldc1            #148 <Int 0x7f0b0014>
    //   22   43:invokevirtual   #152 <Method String getString(int)>
    //   23   46:invokevirtual   #156 <Method void Button.setText(CharSequence)>
    //   24   49:aload_3         
    //   25   50:new             #158 <Class el7rFragmentActivity$1>
    //   26   53:dup             
    //   27   54:aload_0         
    //   28   55:invokespecial   #161 <Method void el7rFragmentActivity$1(el7rFragmentActivity)>
    //   29   58:invokevirtual   #165 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
    //   30   61:aload_1         
    //   31   62:ldc1            #166 <Int 0x7f0600e0>
    //   32   64:invokeinterface #172 <Method MenuItem Menu.findItem(int)>
    //   33   69:aload_2         
    //   34   70:invokestatic    #178 <Method MenuItem MenuItemCompat.setActionView(MenuItem, View)>
    //   35   73:pop             
    //   36   74:aload_1         
    //   37   75:ldc1            #179 <Int 0x7f0600df>
    //   38   77:invokeinterface #172 <Method MenuItem Menu.findItem(int)>
    //   39   82:putstatic       #181 <Field MenuItem progressItem>
    //   40   85:new             #183 <Class ProgressBar>
    //   41   88:dup             
    //   42   89:aload_0         
    //   43   90:invokespecial   #186 <Method void ProgressBar(Context)>
    //   44   93:astore          5
    //   45   95:getstatic       #181 <Field MenuItem progressItem>
    //   46   98:aload           5
    //   47  100:invokestatic    #178 <Method MenuItem MenuItemCompat.setActionView(MenuItem, View)>
    //   48  103:pop             
    //   49  104:iconst_1        
    //   50  105:ireturn         
    }

    protected void onDestroy()
    {
    // try 0 15 handler(s) 20
    //    0    0:aload_0         
    //    1    1:getfield        #109 <Field GoogleAnalyticsTracker tracker>
    //    2    4:invokevirtual   #191 <Method boolean GoogleAnalyticsTracker.dispatch()>
    //    3    7:pop             
    //    4    8:aload_0         
    //    5    9:getfield        #109 <Field GoogleAnalyticsTracker tracker>
    //    6   12:invokevirtual   #194 <Method void GoogleAnalyticsTracker.stopSession()>
    //    7   15:aload_0         
    //    8   16:invokespecial   #196 <Method void ActionBarActivity.onDestroy()>
    //    9   19:return          
    // catch Exception
    //   10   20:astore_1        
    //   11   21:ldc1            #198 <String "GoogleAnalytics">
    //   12   23:ldc1            #200 <String "in dispatching and stopping">
    //   13   25:invokestatic    #206 <Method int Log.e(String, String)>
    //   14   28:pop             
    //   15   29:goto            15
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
    //    0    0:iload_1         
    //    1    1:bipush          82
    //    2    3:icmpne          28
    //    3    6:aload_0         
    //    4    7:getfield        #210 <Field Menu theMenu>
    //    5   10:ifnull          26
    //    6   13:aload_0         
    //    7   14:getfield        #210 <Field Menu theMenu>
    //    8   17:ldc1            #211 <Int 0x7f0600e1>
    //    9   19:iconst_0        
    //   10   20:invokeinterface #215 <Method boolean Menu.performIdentifierAction(int, int)>
    //   11   25:pop             
    //   12   26:iconst_1        
    //   13   27:ireturn         
    //   14   28:aload_0         
    //   15   29:iload_1         
    //   16   30:aload_2         
    //   17   31:invokespecial   #217 <Method boolean ActionBarActivity.onKeyUp(int, KeyEvent)>
    //   18   34:ireturn         
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
    //    0    0:aload_1         
    //    1    1:aload_0         
    //    2    2:getfield        #63  <Field el7rFragmentActivity thisActivity>
    //    3    5:ldc1            #221 <String "MainActivity">
    //    4    7:invokestatic    #227 <Method void Utilities.optionsMenuAction(MenuItem, android.app.Activity, String)>
    //    5   10:iconst_1        
    //    6   11:ireturn         
    }

    public void setTitle(String s)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #101 <Field TextView actionBarTV>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #230 <Method void TextView.setText(CharSequence)>
    //    4    8:return          
    }

    static MenuItem progressItem;
    TextView actionBarTV;
    SubMenu menu_main;
    Menu theMenu;
    el7rFragmentActivity thisActivity;
    GoogleAnalyticsTracker tracker;

    // Unreferenced inner class codeadore/textgram/el7rFragmentActivity$1

/* anonymous class */
    class _cls1
        implements android.view.View.OnClickListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field el7rFragmentActivity this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:return          
        }

        public void onClick(View view)
        {
        //    0    0:invokestatic    #27  <Method void MainActivity.goNext()>
        //    1    3:return          
        }

        final el7rFragmentActivity this$0;
    }

}
