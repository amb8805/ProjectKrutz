// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.view.menu;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.IBinder;
import android.view.*;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.internal.view.menu:
//            ListMenuPresenter, MenuItemImpl, MenuBuilder

public class MenuDialogHelper
    implements android.content.DialogInterface.OnKeyListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, MenuPresenter.Callback
{

    public MenuDialogHelper(MenuBuilder menubuilder)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #25  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:putfield        #27  <Field MenuBuilder mMenu>
    //    5    9:return          
    }

    public void dismiss()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #30  <Field AlertDialog mDialog>
    //    2    4:ifnull          14
    //    3    7:aload_0         
    //    4    8:getfield        #30  <Field AlertDialog mDialog>
    //    5   11:invokevirtual   #34  <Method void AlertDialog.dismiss()>
    //    6   14:return          
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #27  <Field MenuBuilder mMenu>
    //    2    4:aload_0         
    //    3    5:getfield        #38  <Field ListMenuPresenter mPresenter>
    //    4    8:invokevirtual   #44  <Method ListAdapter ListMenuPresenter.getAdapter()>
    //    5   11:iload_2         
    //    6   12:invokeinterface #50  <Method Object ListAdapter.getItem(int)>
    //    7   17:checkcast       #52  <Class MenuItemImpl>
    //    8   20:iconst_0        
    //    9   21:invokevirtual   #58  <Method boolean MenuBuilder.performItemAction(android.view.MenuItem, int)>
    //   10   24:pop             
    //   11   25:return          
    }

    public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
    //    0    0:iload_2         
    //    1    1:ifne            12
    //    2    4:aload_1         
    //    3    5:aload_0         
    //    4    6:getfield        #27  <Field MenuBuilder mMenu>
    //    5    9:if_acmpne       16
    //    6   12:aload_0         
    //    7   13:invokevirtual   #61  <Method void dismiss()>
    //    8   16:aload_0         
    //    9   17:getfield        #63  <Field MenuPresenter$Callback mPresenterCallback>
    //   10   20:ifnull          34
    //   11   23:aload_0         
    //   12   24:getfield        #63  <Field MenuPresenter$Callback mPresenterCallback>
    //   13   27:aload_1         
    //   14   28:iload_2         
    //   15   29:invokeinterface #65  <Method void MenuPresenter$Callback.onCloseMenu(MenuBuilder, boolean)>
    //   16   34:return          
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #38  <Field ListMenuPresenter mPresenter>
    //    2    4:aload_0         
    //    3    5:getfield        #27  <Field MenuBuilder mMenu>
    //    4    8:iconst_1        
    //    5    9:invokevirtual   #68  <Method void ListMenuPresenter.onCloseMenu(MenuBuilder, boolean)>
    //    6   12:return          
    }

    public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
    //    0    0:iload_2         
    //    1    1:bipush          82
    //    2    3:icmpeq          11
    //    3    6:iload_2         
    //    4    7:iconst_4        
    //    5    8:icmpne          150
    //    6   11:aload_3         
    //    7   12:invokevirtual   #76  <Method int KeyEvent.getAction()>
    //    8   15:ifne            72
    //    9   18:aload_3         
    //   10   19:invokevirtual   #79  <Method int KeyEvent.getRepeatCount()>
    //   11   22:ifne            72
    //   12   25:aload_0         
    //   13   26:getfield        #30  <Field AlertDialog mDialog>
    //   14   29:invokevirtual   #83  <Method Window AlertDialog.getWindow()>
    //   15   32:astore          7
    //   16   34:aload           7
    //   17   36:ifnull          150
    //   18   39:aload           7
    //   19   41:invokevirtual   #89  <Method View Window.getDecorView()>
    //   20   44:astore          8
    //   21   46:aload           8
    //   22   48:ifnull          150
    //   23   51:aload           8
    //   24   53:invokevirtual   #95  <Method android.view.KeyEvent$DispatcherState View.getKeyDispatcherState()>
    //   25   56:astore          9
    //   26   58:aload           9
    //   27   60:ifnull          150
    //   28   63:aload           9
    //   29   65:aload_3         
    //   30   66:aload_0         
    //   31   67:invokevirtual   #101 <Method void android.view.KeyEvent$DispatcherState.startTracking(KeyEvent, Object)>
    //   32   70:iconst_1        
    //   33   71:ireturn         
    //   34   72:aload_3         
    //   35   73:invokevirtual   #76  <Method int KeyEvent.getAction()>
    //   36   76:iconst_1        
    //   37   77:icmpne          150
    //   38   80:aload_3         
    //   39   81:invokevirtual   #105 <Method boolean KeyEvent.isCanceled()>
    //   40   84:ifne            150
    //   41   87:aload_0         
    //   42   88:getfield        #30  <Field AlertDialog mDialog>
    //   43   91:invokevirtual   #83  <Method Window AlertDialog.getWindow()>
    //   44   94:astore          4
    //   45   96:aload           4
    //   46   98:ifnull          150
    //   47  101:aload           4
    //   48  103:invokevirtual   #89  <Method View Window.getDecorView()>
    //   49  106:astore          5
    //   50  108:aload           5
    //   51  110:ifnull          150
    //   52  113:aload           5
    //   53  115:invokevirtual   #95  <Method android.view.KeyEvent$DispatcherState View.getKeyDispatcherState()>
    //   54  118:astore          6
    //   55  120:aload           6
    //   56  122:ifnull          150
    //   57  125:aload           6
    //   58  127:aload_3         
    //   59  128:invokevirtual   #109 <Method boolean android.view.KeyEvent$DispatcherState.isTracking(KeyEvent)>
    //   60  131:ifeq            150
    //   61  134:aload_0         
    //   62  135:getfield        #27  <Field MenuBuilder mMenu>
    //   63  138:iconst_1        
    //   64  139:invokevirtual   #113 <Method void MenuBuilder.close(boolean)>
    //   65  142:aload_1         
    //   66  143:invokeinterface #116 <Method void DialogInterface.dismiss()>
    //   67  148:iconst_1        
    //   68  149:ireturn         
    //   69  150:aload_0         
    //   70  151:getfield        #27  <Field MenuBuilder mMenu>
    //   71  154:iload_2         
    //   72  155:aload_3         
    //   73  156:iconst_0        
    //   74  157:invokevirtual   #120 <Method boolean MenuBuilder.performShortcut(int, KeyEvent, int)>
    //   75  160:ireturn         
    }

    public boolean onOpenSubMenu(MenuBuilder menubuilder)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #63  <Field MenuPresenter$Callback mPresenterCallback>
    //    2    4:ifnull          18
    //    3    7:aload_0         
    //    4    8:getfield        #63  <Field MenuPresenter$Callback mPresenterCallback>
    //    5   11:aload_1         
    //    6   12:invokeinterface #124 <Method boolean MenuPresenter$Callback.onOpenSubMenu(MenuBuilder)>
    //    7   17:ireturn         
    //    8   18:iconst_0        
    //    9   19:ireturn         
    }

    public void setPresenterCallback(MenuPresenter.Callback callback)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #63  <Field MenuPresenter$Callback mPresenterCallback>
    //    3    5:return          
    }

    public void show(IBinder ibinder)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #27  <Field MenuBuilder mMenu>
    //    2    4:astore_2        
    //    3    5:new             #130 <Class android.app.AlertDialog$Builder>
    //    4    8:dup             
    //    5    9:aload_2         
    //    6   10:invokevirtual   #134 <Method android.content.Context MenuBuilder.getContext()>
    //    7   13:invokespecial   #137 <Method void android.app.AlertDialog$Builder(android.content.Context)>
    //    8   16:astore_3        
    //    9   17:aload_0         
    //   10   18:new             #40  <Class ListMenuPresenter>
    //   11   21:dup             
    //   12   22:getstatic       #143 <Field int android.support.v7.appcompat.R$layout.abc_list_menu_item_layout>
    //   13   25:getstatic       #148 <Field int android.support.v7.appcompat.R$style.Theme_AppCompat_CompactMenu_Dialog>
    //   14   28:invokespecial   #151 <Method void ListMenuPresenter(int, int)>
    //   15   31:putfield        #38  <Field ListMenuPresenter mPresenter>
    //   16   34:aload_0         
    //   17   35:getfield        #38  <Field ListMenuPresenter mPresenter>
    //   18   38:aload_0         
    //   19   39:invokevirtual   #154 <Method void ListMenuPresenter.setCallback(MenuPresenter$Callback)>
    //   20   42:aload_0         
    //   21   43:getfield        #27  <Field MenuBuilder mMenu>
    //   22   46:aload_0         
    //   23   47:getfield        #38  <Field ListMenuPresenter mPresenter>
    //   24   50:invokevirtual   #158 <Method void MenuBuilder.addMenuPresenter(MenuPresenter)>
    //   25   53:aload_3         
    //   26   54:aload_0         
    //   27   55:getfield        #38  <Field ListMenuPresenter mPresenter>
    //   28   58:invokevirtual   #44  <Method ListAdapter ListMenuPresenter.getAdapter()>
    //   29   61:aload_0         
    //   30   62:invokevirtual   #162 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setAdapter(ListAdapter, android.content.DialogInterface$OnClickListener)>
    //   31   65:pop             
    //   32   66:aload_2         
    //   33   67:invokevirtual   #165 <Method View MenuBuilder.getHeaderView()>
    //   34   70:astore          5
    //   35   72:aload           5
    //   36   74:ifnull          157
    //   37   77:aload_3         
    //   38   78:aload           5
    //   39   80:invokevirtual   #169 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setCustomTitle(View)>
    //   40   83:pop             
    //   41   84:aload_3         
    //   42   85:aload_0         
    //   43   86:invokevirtual   #173 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setOnKeyListener(android.content.DialogInterface$OnKeyListener)>
    //   44   89:pop             
    //   45   90:aload_0         
    //   46   91:aload_3         
    //   47   92:invokevirtual   #177 <Method AlertDialog android.app.AlertDialog$Builder.create()>
    //   48   95:putfield        #30  <Field AlertDialog mDialog>
    //   49   98:aload_0         
    //   50   99:getfield        #30  <Field AlertDialog mDialog>
    //   51  102:aload_0         
    //   52  103:invokevirtual   #181 <Method void AlertDialog.setOnDismissListener(android.content.DialogInterface$OnDismissListener)>
    //   53  106:aload_0         
    //   54  107:getfield        #30  <Field AlertDialog mDialog>
    //   55  110:invokevirtual   #83  <Method Window AlertDialog.getWindow()>
    //   56  113:invokevirtual   #185 <Method android.view.WindowManager$LayoutParams Window.getAttributes()>
    //   57  116:astore          8
    //   58  118:aload           8
    //   59  120:sipush          1003
    //   60  123:putfield        #190 <Field int android.view.WindowManager$LayoutParams.type>
    //   61  126:aload_1         
    //   62  127:ifnull          136
    //   63  130:aload           8
    //   64  132:aload_1         
    //   65  133:putfield        #194 <Field IBinder android.view.WindowManager$LayoutParams.token>
    //   66  136:aload           8
    //   67  138:ldc1            #195 <Int 0x20000>
    //   68  140:aload           8
    //   69  142:getfield        #198 <Field int android.view.WindowManager$LayoutParams.flags>
    //   70  145:ior             
    //   71  146:putfield        #198 <Field int android.view.WindowManager$LayoutParams.flags>
    //   72  149:aload_0         
    //   73  150:getfield        #30  <Field AlertDialog mDialog>
    //   74  153:invokevirtual   #200 <Method void AlertDialog.show()>
    //   75  156:return          
    //   76  157:aload_3         
    //   77  158:aload_2         
    //   78  159:invokevirtual   #204 <Method android.graphics.drawable.Drawable MenuBuilder.getHeaderIcon()>
    //   79  162:invokevirtual   #208 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setIcon(android.graphics.drawable.Drawable)>
    //   80  165:aload_2         
    //   81  166:invokevirtual   #212 <Method CharSequence MenuBuilder.getHeaderTitle()>
    //   82  169:invokevirtual   #216 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
    //   83  172:pop             
    //   84  173:goto            84
    }

    private AlertDialog mDialog;
    private MenuBuilder mMenu;
    ListMenuPresenter mPresenter;
    private MenuPresenter.Callback mPresenterCallback;
}
