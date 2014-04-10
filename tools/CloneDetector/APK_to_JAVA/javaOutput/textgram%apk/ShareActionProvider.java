// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.support.v4.view.ActionProvider;
import android.support.v7.internal.widget.ActivityChooserModel;
import android.support.v7.internal.widget.ActivityChooserView;
import android.util.TypedValue;
import android.view.*;

public class ShareActionProvider extends ActionProvider
{
    public static interface OnShareTargetSelectedListener
    {

        public abstract boolean onShareTargetSelected(ShareActionProvider shareactionprovider, Intent intent);
    }

    private class ShareActivityChooserModelPolicy
        implements android.support.v7.internal.widget.ActivityChooserModel.OnChooseActivityListener
    {

        private ShareActivityChooserModelPolicy()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #12  <Field ShareActionProvider this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #15  <Method void Object()>
        //    5    9:return          
        }

        ShareActivityChooserModelPolicy(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #18  <Method void ShareActionProvider$ShareActivityChooserModelPolicy(ShareActionProvider)>
        //    3    5:return          
        }

        public boolean onChooseActivity(ActivityChooserModel activitychoosermodel, Intent intent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field ShareActionProvider this$0>
        //    2    4:invokestatic    #26  <Method ShareActionProvider$OnShareTargetSelectedListener ShareActionProvider.access$400(ShareActionProvider)>
        //    3    7:ifnull          28
        //    4   10:aload_0         
        //    5   11:getfield        #12  <Field ShareActionProvider this$0>
        //    6   14:invokestatic    #26  <Method ShareActionProvider$OnShareTargetSelectedListener ShareActionProvider.access$400(ShareActionProvider)>
        //    7   17:aload_0         
        //    8   18:getfield        #12  <Field ShareActionProvider this$0>
        //    9   21:aload_2         
        //   10   22:invokeinterface #32  <Method boolean ShareActionProvider$OnShareTargetSelectedListener.onShareTargetSelected(ShareActionProvider, Intent)>
        //   11   27:pop             
        //   12   28:iconst_0        
        //   13   29:ireturn         
        }

        final ShareActionProvider this$0;
    }

    private class ShareMenuItemOnMenuItemClickListener
        implements android.view.MenuItem.OnMenuItemClickListener
    {

        private ShareMenuItemOnMenuItemClickListener()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #12  <Field ShareActionProvider this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #15  <Method void Object()>
        //    5    9:return          
        }

        ShareMenuItemOnMenuItemClickListener(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #18  <Method void ShareActionProvider$ShareMenuItemOnMenuItemClickListener(ShareActionProvider)>
        //    3    5:return          
        }

        public boolean onMenuItemClick(MenuItem menuitem)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #12  <Field ShareActionProvider this$0>
        //    2    4:invokestatic    #26  <Method Context ShareActionProvider.access$100(ShareActionProvider)>
        //    3    7:aload_0         
        //    4    8:getfield        #12  <Field ShareActionProvider this$0>
        //    5   11:invokestatic    #30  <Method String ShareActionProvider.access$200(ShareActionProvider)>
        //    6   14:invokestatic    #36  <Method ActivityChooserModel ActivityChooserModel.get(Context, String)>
        //    7   17:aload_1         
        //    8   18:invokeinterface #42  <Method int MenuItem.getItemId()>
        //    9   23:invokevirtual   #46  <Method Intent ActivityChooserModel.chooseActivity(int)>
        //   10   26:astore_2        
        //   11   27:aload_2         
        //   12   28:ifnull          49
        //   13   31:aload_2         
        //   14   32:ldc1            #47  <Int 0x80000>
        //   15   34:invokevirtual   #52  <Method Intent Intent.addFlags(int)>
        //   16   37:pop             
        //   17   38:aload_0         
        //   18   39:getfield        #12  <Field ShareActionProvider this$0>
        //   19   42:invokestatic    #26  <Method Context ShareActionProvider.access$100(ShareActionProvider)>
        //   20   45:aload_2         
        //   21   46:invokevirtual   #58  <Method void Context.startActivity(Intent)>
        //   22   49:iconst_1        
        //   23   50:ireturn         
        }

        final ShareActionProvider this$0;
    }


    public ShareActionProvider(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #25  <Method void ActionProvider(Context)>
    //    3    5:aload_0         
    //    4    6:iconst_4        
    //    5    7:putfield        #27  <Field int mMaxShownActivityCount>
    //    6   10:aload_0         
    //    7   11:new             #29  <Class ShareActionProvider$ShareMenuItemOnMenuItemClickListener>
    //    8   14:dup             
    //    9   15:aload_0         
    //   10   16:aconst_null     
    //   11   17:invokespecial   #32  <Method void ShareActionProvider$ShareMenuItemOnMenuItemClickListener(ShareActionProvider, ShareActionProvider$1)>
    //   12   20:putfield        #34  <Field ShareActionProvider$ShareMenuItemOnMenuItemClickListener mOnMenuItemClickListener>
    //   13   23:aload_0         
    //   14   24:ldc1            #11  <String "share_history.xml">
    //   15   26:putfield        #36  <Field String mShareHistoryFileName>
    //   16   29:aload_0         
    //   17   30:aload_1         
    //   18   31:putfield        #38  <Field Context mContext>
    //   19   34:return          
    }

    static Context access$100(ShareActionProvider shareactionprovider)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #38  <Field Context mContext>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #38  <Field Context mContext>
    //    5    4:areturn         
    }

    static String access$200(ShareActionProvider shareactionprovider)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #36  <Field String mShareHistoryFileName>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #36  <Field String mShareHistoryFileName>
    //    5    4:areturn         
    }

    static OnShareTargetSelectedListener access$400(ShareActionProvider shareactionprovider)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #46  <Field ShareActionProvider$OnShareTargetSelectedListener mOnShareTargetSelectedListener>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #46  <Field ShareActionProvider$OnShareTargetSelectedListener mOnShareTargetSelectedListener>
    //    5    4:areturn         
    }

    private void setActivityChooserPolicyIfNeeded()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #46  <Field ShareActionProvider$OnShareTargetSelectedListener mOnShareTargetSelectedListener>
    //    2    4:ifnonnull       8
    //    3    7:return          
    //    4    8:aload_0         
    //    5    9:getfield        #50  <Field android.support.v7.internal.widget.ActivityChooserModel$OnChooseActivityListener mOnChooseActivityListener>
    //    6   12:ifnonnull       28
    //    7   15:aload_0         
    //    8   16:new             #52  <Class ShareActionProvider$ShareActivityChooserModelPolicy>
    //    9   19:dup             
    //   10   20:aload_0         
    //   11   21:aconst_null     
    //   12   22:invokespecial   #53  <Method void ShareActionProvider$ShareActivityChooserModelPolicy(ShareActionProvider, ShareActionProvider$1)>
    //   13   25:putfield        #50  <Field android.support.v7.internal.widget.ActivityChooserModel$OnChooseActivityListener mOnChooseActivityListener>
    //   14   28:aload_0         
    //   15   29:getfield        #38  <Field Context mContext>
    //   16   32:aload_0         
    //   17   33:getfield        #36  <Field String mShareHistoryFileName>
    //   18   36:invokestatic    #59  <Method ActivityChooserModel ActivityChooserModel.get(Context, String)>
    //   19   39:aload_0         
    //   20   40:getfield        #50  <Field android.support.v7.internal.widget.ActivityChooserModel$OnChooseActivityListener mOnChooseActivityListener>
    //   21   43:invokevirtual   #63  <Method void ActivityChooserModel.setOnChooseActivityListener(android.support.v7.internal.widget.ActivityChooserModel$OnChooseActivityListener)>
    //   22   46:return          
    }

    public boolean hasSubMenu()
    {
    //    0    0:iconst_1        
    //    1    1:ireturn         
    }

    public View onCreateActionView()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #38  <Field Context mContext>
    //    2    4:aload_0         
    //    3    5:getfield        #36  <Field String mShareHistoryFileName>
    //    4    8:invokestatic    #59  <Method ActivityChooserModel ActivityChooserModel.get(Context, String)>
    //    5   11:astore_1        
    //    6   12:new             #69  <Class ActivityChooserView>
    //    7   15:dup             
    //    8   16:aload_0         
    //    9   17:getfield        #38  <Field Context mContext>
    //   10   20:invokespecial   #70  <Method void ActivityChooserView(Context)>
    //   11   23:astore_2        
    //   12   24:aload_2         
    //   13   25:aload_1         
    //   14   26:invokevirtual   #74  <Method void ActivityChooserView.setActivityChooserModel(ActivityChooserModel)>
    //   15   29:new             #76  <Class TypedValue>
    //   16   32:dup             
    //   17   33:invokespecial   #78  <Method void TypedValue()>
    //   18   36:astore_3        
    //   19   37:aload_0         
    //   20   38:getfield        #38  <Field Context mContext>
    //   21   41:invokevirtual   #84  <Method android.content.res.Resources$Theme Context.getTheme()>
    //   22   44:getstatic       #89  <Field int android.support.v7.appcompat.R$attr.actionModeShareDrawable>
    //   23   47:aload_3         
    //   24   48:iconst_1        
    //   25   49:invokevirtual   #95  <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
    //   26   52:pop             
    //   27   53:aload_2         
    //   28   54:aload_0         
    //   29   55:getfield        #38  <Field Context mContext>
    //   30   58:invokevirtual   #99  <Method Resources Context.getResources()>
    //   31   61:aload_3         
    //   32   62:getfield        #102 <Field int TypedValue.resourceId>
    //   33   65:invokevirtual   #108 <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
    //   34   68:invokevirtual   #112 <Method void ActivityChooserView.setExpandActivityOverflowButtonDrawable(android.graphics.drawable.Drawable)>
    //   35   71:aload_2         
    //   36   72:aload_0         
    //   37   73:invokevirtual   #116 <Method void ActivityChooserView.setProvider(ActionProvider)>
    //   38   76:aload_2         
    //   39   77:getstatic       #121 <Field int android.support.v7.appcompat.R$string.abc_shareactionprovider_share_with_application>
    //   40   80:invokevirtual   #125 <Method void ActivityChooserView.setDefaultActionButtonContentDescription(int)>
    //   41   83:aload_2         
    //   42   84:getstatic       #128 <Field int android.support.v7.appcompat.R$string.abc_shareactionprovider_share_with>
    //   43   87:invokevirtual   #131 <Method void ActivityChooserView.setExpandActivityOverflowButtonContentDescription(int)>
    //   44   90:aload_2         
    //   45   91:areturn         
    }

    public void onPrepareSubMenu(SubMenu submenu)
    {
    //    0    0:aload_1         
    //    1    1:invokeinterface #138 <Method void SubMenu.clear()>
    //    2    6:aload_0         
    //    3    7:getfield        #38  <Field Context mContext>
    //    4   10:aload_0         
    //    5   11:getfield        #36  <Field String mShareHistoryFileName>
    //    6   14:invokestatic    #59  <Method ActivityChooserModel ActivityChooserModel.get(Context, String)>
    //    7   17:astore_2        
    //    8   18:aload_0         
    //    9   19:getfield        #38  <Field Context mContext>
    //   10   22:invokevirtual   #142 <Method android.content.pm.PackageManager Context.getPackageManager()>
    //   11   25:astore_3        
    //   12   26:aload_2         
    //   13   27:invokevirtual   #146 <Method int ActivityChooserModel.getActivityCount()>
    //   14   30:istore          4
    //   15   32:iload           4
    //   16   34:aload_0         
    //   17   35:getfield        #27  <Field int mMaxShownActivityCount>
    //   18   38:invokestatic    #152 <Method int Math.min(int, int)>
    //   19   41:istore          5
    //   20   43:iconst_0        
    //   21   44:istore          6
    //   22   46:iload           6
    //   23   48:iload           5
    //   24   50:icmpge          105
    //   25   53:aload_2         
    //   26   54:iload           6
    //   27   56:invokevirtual   #156 <Method ResolveInfo ActivityChooserModel.getActivity(int)>
    //   28   59:astore          11
    //   29   61:aload_1         
    //   30   62:iconst_0        
    //   31   63:iload           6
    //   32   65:iload           6
    //   33   67:aload           11
    //   34   69:aload_3         
    //   35   70:invokevirtual   #162 <Method CharSequence ResolveInfo.loadLabel(android.content.pm.PackageManager)>
    //   36   73:invokeinterface #166 <Method MenuItem SubMenu.add(int, int, int, CharSequence)>
    //   37   78:aload           11
    //   38   80:aload_3         
    //   39   81:invokevirtual   #170 <Method android.graphics.drawable.Drawable ResolveInfo.loadIcon(android.content.pm.PackageManager)>
    //   40   84:invokeinterface #176 <Method MenuItem MenuItem.setIcon(android.graphics.drawable.Drawable)>
    //   41   89:aload_0         
    //   42   90:getfield        #34  <Field ShareActionProvider$ShareMenuItemOnMenuItemClickListener mOnMenuItemClickListener>
    //   43   93:invokeinterface #180 <Method MenuItem MenuItem.setOnMenuItemClickListener(android.view.MenuItem$OnMenuItemClickListener)>
    //   44   98:pop             
    //   45   99:iinc            6  1
    //   46  102:goto            46
    //   47  105:iload           5
    //   48  107:iload           4
    //   49  109:icmpge          198
    //   50  112:aload_1         
    //   51  113:iconst_0        
    //   52  114:iload           5
    //   53  116:iload           5
    //   54  118:aload_0         
    //   55  119:getfield        #38  <Field Context mContext>
    //   56  122:getstatic       #183 <Field int android.support.v7.appcompat.R$string.abc_activity_chooser_view_see_all>
    //   57  125:invokevirtual   #187 <Method String Context.getString(int)>
    //   58  128:invokeinterface #191 <Method SubMenu SubMenu.addSubMenu(int, int, int, CharSequence)>
    //   59  133:astore          7
    //   60  135:iconst_0        
    //   61  136:istore          8
    //   62  138:iload           8
    //   63  140:iload           4
    //   64  142:icmpge          198
    //   65  145:aload_2         
    //   66  146:iload           8
    //   67  148:invokevirtual   #156 <Method ResolveInfo ActivityChooserModel.getActivity(int)>
    //   68  151:astore          9
    //   69  153:aload           7
    //   70  155:iconst_0        
    //   71  156:iload           8
    //   72  158:iload           8
    //   73  160:aload           9
    //   74  162:aload_3         
    //   75  163:invokevirtual   #162 <Method CharSequence ResolveInfo.loadLabel(android.content.pm.PackageManager)>
    //   76  166:invokeinterface #166 <Method MenuItem SubMenu.add(int, int, int, CharSequence)>
    //   77  171:aload           9
    //   78  173:aload_3         
    //   79  174:invokevirtual   #170 <Method android.graphics.drawable.Drawable ResolveInfo.loadIcon(android.content.pm.PackageManager)>
    //   80  177:invokeinterface #176 <Method MenuItem MenuItem.setIcon(android.graphics.drawable.Drawable)>
    //   81  182:aload_0         
    //   82  183:getfield        #34  <Field ShareActionProvider$ShareMenuItemOnMenuItemClickListener mOnMenuItemClickListener>
    //   83  186:invokeinterface #180 <Method MenuItem MenuItem.setOnMenuItemClickListener(android.view.MenuItem$OnMenuItemClickListener)>
    //   84  191:pop             
    //   85  192:iinc            8  1
    //   86  195:goto            138
    //   87  198:return          
    }

    public void setOnShareTargetSelectedListener(OnShareTargetSelectedListener onsharetargetselectedlistener)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #46  <Field ShareActionProvider$OnShareTargetSelectedListener mOnShareTargetSelectedListener>
    //    3    5:aload_0         
    //    4    6:invokespecial   #195 <Method void setActivityChooserPolicyIfNeeded()>
    //    5    9:return          
    }

    public void setShareHistoryFileName(String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #36  <Field String mShareHistoryFileName>
    //    3    5:aload_0         
    //    4    6:invokespecial   #195 <Method void setActivityChooserPolicyIfNeeded()>
    //    5    9:return          
    }

    public void setShareIntent(Intent intent)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #38  <Field Context mContext>
    //    2    4:aload_0         
    //    3    5:getfield        #36  <Field String mShareHistoryFileName>
    //    4    8:invokestatic    #59  <Method ActivityChooserModel ActivityChooserModel.get(Context, String)>
    //    5   11:aload_1         
    //    6   12:invokevirtual   #202 <Method void ActivityChooserModel.setIntent(Intent)>
    //    7   15:return          
    }

    private static final int DEFAULT_INITIAL_ACTIVITY_COUNT = 4;
    public static final String DEFAULT_SHARE_HISTORY_FILE_NAME = "share_history.xml";
    private final Context mContext;
    private int mMaxShownActivityCount;
    private android.support.v7.internal.widget.ActivityChooserModel.OnChooseActivityListener mOnChooseActivityListener;
    private final ShareMenuItemOnMenuItemClickListener mOnMenuItemClickListener;
    private OnShareTargetSelectedListener mOnShareTargetSelectedListener;
    private String mShareHistoryFileName;

    static Context access$100(ShareActionProvider shareactionprovider)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #38  <Field Context mContext>
    //    2    4:areturn         
    }

    static String access$200(ShareActionProvider shareactionprovider)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #36  <Field String mShareHistoryFileName>
    //    2    4:areturn         
    }

    static OnShareTargetSelectedListener access$400(ShareActionProvider shareactionprovider)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #46  <Field ShareActionProvider$OnShareTargetSelectedListener mOnShareTargetSelectedListener>
    //    2    4:areturn         
    }

    // Unreferenced inner class android/support/v7/widget/ShareActionProvider$1

/* anonymous class */
    static class _cls1
    {
    }

}
