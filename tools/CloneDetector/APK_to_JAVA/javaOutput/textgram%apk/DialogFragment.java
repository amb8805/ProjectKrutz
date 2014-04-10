// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.*;

// Referenced classes of package android.support.v4.app:
//            Fragment, FragmentManager, FragmentTransaction, FragmentActivity

public class DialogFragment extends Fragment
    implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener
{

    public DialogFragment()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #51  <Method void Fragment()>
    //    2    4:aload_0         
    //    3    5:iconst_0        
    //    4    6:putfield        #53  <Field int mStyle>
    //    5    9:aload_0         
    //    6   10:iconst_0        
    //    7   11:putfield        #55  <Field int mTheme>
    //    8   14:aload_0         
    //    9   15:iconst_1        
    //   10   16:putfield        #57  <Field boolean mCancelable>
    //   11   19:aload_0         
    //   12   20:iconst_1        
    //   13   21:putfield        #59  <Field boolean mShowsDialog>
    //   14   24:aload_0         
    //   15   25:iconst_m1       
    //   16   26:putfield        #61  <Field int mBackStackId>
    //   17   29:return          
    }

    public void dismiss()
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:invokevirtual   #66  <Method void dismissInternal(boolean)>
    //    3    5:return          
    }

    public void dismissAllowingStateLoss()
    {
    //    0    0:aload_0         
    //    1    1:iconst_1        
    //    2    2:invokevirtual   #66  <Method void dismissInternal(boolean)>
    //    3    5:return          
    }

    void dismissInternal(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #69  <Field boolean mDismissed>
    //    2    4:ifeq            8
    //    3    7:return          
    //    4    8:aload_0         
    //    5    9:iconst_1        
    //    6   10:putfield        #69  <Field boolean mDismissed>
    //    7   13:aload_0         
    //    8   14:iconst_0        
    //    9   15:putfield        #71  <Field boolean mShownByMe>
    //   10   18:aload_0         
    //   11   19:getfield        #73  <Field Dialog mDialog>
    //   12   22:ifnull          37
    //   13   25:aload_0         
    //   14   26:getfield        #73  <Field Dialog mDialog>
    //   15   29:invokevirtual   #77  <Method void Dialog.dismiss()>
    //   16   32:aload_0         
    //   17   33:aconst_null     
    //   18   34:putfield        #73  <Field Dialog mDialog>
    //   19   37:aload_0         
    //   20   38:iconst_1        
    //   21   39:putfield        #79  <Field boolean mViewDestroyed>
    //   22   42:aload_0         
    //   23   43:getfield        #61  <Field int mBackStackId>
    //   24   46:iflt            67
    //   25   49:aload_0         
    //   26   50:invokevirtual   #83  <Method FragmentManager getFragmentManager()>
    //   27   53:aload_0         
    //   28   54:getfield        #61  <Field int mBackStackId>
    //   29   57:iconst_1        
    //   30   58:invokevirtual   #89  <Method void FragmentManager.popBackStack(int, int)>
    //   31   61:aload_0         
    //   32   62:iconst_m1       
    //   33   63:putfield        #61  <Field int mBackStackId>
    //   34   66:return          
    //   35   67:aload_0         
    //   36   68:invokevirtual   #83  <Method FragmentManager getFragmentManager()>
    //   37   71:invokevirtual   #93  <Method FragmentTransaction FragmentManager.beginTransaction()>
    //   38   74:astore_2        
    //   39   75:aload_2         
    //   40   76:aload_0         
    //   41   77:invokevirtual   #99  <Method FragmentTransaction FragmentTransaction.remove(Fragment)>
    //   42   80:pop             
    //   43   81:iload_1         
    //   44   82:ifeq            91
    //   45   85:aload_2         
    //   46   86:invokevirtual   #103 <Method int FragmentTransaction.commitAllowingStateLoss()>
    //   47   89:pop             
    //   48   90:return          
    //   49   91:aload_2         
    //   50   92:invokevirtual   #106 <Method int FragmentTransaction.commit()>
    //   51   95:pop             
    //   52   96:return          
    }

    public Dialog getDialog()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #73  <Field Dialog mDialog>
    //    2    4:areturn         
    }

    public LayoutInflater getLayoutInflater(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #59  <Field boolean mShowsDialog>
    //    2    4:ifne            13
    //    3    7:aload_0         
    //    4    8:aload_1         
    //    5    9:invokespecial   #112 <Method LayoutInflater Fragment.getLayoutInflater(Bundle)>
    //    6   12:areturn         
    //    7   13:aload_0         
    //    8   14:aload_0         
    //    9   15:aload_1         
    //   10   16:invokevirtual   #116 <Method Dialog onCreateDialog(Bundle)>
    //   11   19:putfield        #73  <Field Dialog mDialog>
    //   12   22:aload_0         
    //   13   23:getfield        #53  <Field int mStyle>
    //   14   26:tableswitch     1 3: default 52
    //                   1 87
    //                   2 87
    //                   3 75
    //   15   52:aload_0         
    //   16   53:getfield        #73  <Field Dialog mDialog>
    //   17   56:ifnull          99
    //   18   59:aload_0         
    //   19   60:getfield        #73  <Field Dialog mDialog>
    //   20   63:invokevirtual   #120 <Method Context Dialog.getContext()>
    //   21   66:ldc1            #122 <String "layout_inflater">
    //   22   68:invokevirtual   #128 <Method Object Context.getSystemService(String)>
    //   23   71:checkcast       #130 <Class LayoutInflater>
    //   24   74:areturn         
    //   25   75:aload_0         
    //   26   76:getfield        #73  <Field Dialog mDialog>
    //   27   79:invokevirtual   #134 <Method Window Dialog.getWindow()>
    //   28   82:bipush          24
    //   29   84:invokevirtual   #140 <Method void Window.addFlags(int)>
    //   30   87:aload_0         
    //   31   88:getfield        #73  <Field Dialog mDialog>
    //   32   91:iconst_1        
    //   33   92:invokevirtual   #144 <Method boolean Dialog.requestWindowFeature(int)>
    //   34   95:pop             
    //   35   96:goto            52
    //   36   99:aload_0         
    //   37  100:getfield        #148 <Field FragmentActivity mActivity>
    //   38  103:ldc1            #122 <String "layout_inflater">
    //   39  105:invokevirtual   #151 <Method Object FragmentActivity.getSystemService(String)>
    //   40  108:checkcast       #130 <Class LayoutInflater>
    //   41  111:areturn         
    }

    public boolean getShowsDialog()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #59  <Field boolean mShowsDialog>
    //    2    4:ireturn         
    }

    public int getTheme()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #55  <Field int mTheme>
    //    2    4:ireturn         
    }

    public boolean isCancelable()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #57  <Field boolean mCancelable>
    //    2    4:ireturn         
    }

    public void onActivityCreated(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #159 <Method void Fragment.onActivityCreated(Bundle)>
    //    3    5:aload_0         
    //    4    6:getfield        #59  <Field boolean mShowsDialog>
    //    5    9:ifne            13
    //    6   12:return          
    //    7   13:aload_0         
    //    8   14:invokevirtual   #163 <Method View getView()>
    //    9   17:astore_2        
    //   10   18:aload_2         
    //   11   19:ifnull          47
    //   12   22:aload_2         
    //   13   23:invokevirtual   #169 <Method android.view.ViewParent View.getParent()>
    //   14   26:ifnull          39
    //   15   29:new             #171 <Class IllegalStateException>
    //   16   32:dup             
    //   17   33:ldc1            #173 <String "DialogFragment can not be attached to a container view">
    //   18   35:invokespecial   #176 <Method void IllegalStateException(String)>
    //   19   38:athrow          
    //   20   39:aload_0         
    //   21   40:getfield        #73  <Field Dialog mDialog>
    //   22   43:aload_2         
    //   23   44:invokevirtual   #180 <Method void Dialog.setContentView(View)>
    //   24   47:aload_0         
    //   25   48:getfield        #73  <Field Dialog mDialog>
    //   26   51:aload_0         
    //   27   52:invokevirtual   #184 <Method FragmentActivity getActivity()>
    //   28   55:invokevirtual   #188 <Method void Dialog.setOwnerActivity(Activity)>
    //   29   58:aload_0         
    //   30   59:getfield        #73  <Field Dialog mDialog>
    //   31   62:aload_0         
    //   32   63:getfield        #57  <Field boolean mCancelable>
    //   33   66:invokevirtual   #191 <Method void Dialog.setCancelable(boolean)>
    //   34   69:aload_0         
    //   35   70:getfield        #73  <Field Dialog mDialog>
    //   36   73:aload_0         
    //   37   74:invokevirtual   #195 <Method void Dialog.setOnCancelListener(android.content.DialogInterface$OnCancelListener)>
    //   38   77:aload_0         
    //   39   78:getfield        #73  <Field Dialog mDialog>
    //   40   81:aload_0         
    //   41   82:invokevirtual   #199 <Method void Dialog.setOnDismissListener(android.content.DialogInterface$OnDismissListener)>
    //   42   85:aload_1         
    //   43   86:ifnull          12
    //   44   89:aload_1         
    //   45   90:ldc1            #18  <String "android:savedDialogState">
    //   46   92:invokevirtual   #205 <Method Bundle Bundle.getBundle(String)>
    //   47   95:astore_3        
    //   48   96:aload_3         
    //   49   97:ifnull          12
    //   50  100:aload_0         
    //   51  101:getfield        #73  <Field Dialog mDialog>
    //   52  104:aload_3         
    //   53  105:invokevirtual   #208 <Method void Dialog.onRestoreInstanceState(Bundle)>
    //   54  108:return          
    }

    public void onAttach(Activity activity)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #211 <Method void Fragment.onAttach(Activity)>
    //    3    5:aload_0         
    //    4    6:getfield        #71  <Field boolean mShownByMe>
    //    5    9:ifne            17
    //    6   12:aload_0         
    //    7   13:iconst_0        
    //    8   14:putfield        #69  <Field boolean mDismissed>
    //    9   17:return          
    }

    public void onCancel(DialogInterface dialoginterface)
    {
    //    0    0:return          
    }

    public void onCreate(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #216 <Method void Fragment.onCreate(Bundle)>
    //    3    5:aload_0         
    //    4    6:getfield        #219 <Field int mContainerId>
    //    5    9:ifne            82
    //    6   12:iconst_1        
    //    7   13:istore_2        
    //    8   14:aload_0         
    //    9   15:iload_2         
    //   10   16:putfield        #59  <Field boolean mShowsDialog>
    //   11   19:aload_1         
    //   12   20:ifnull          81
    //   13   23:aload_0         
    //   14   24:aload_1         
    //   15   25:ldc1            #24  <String "android:style">
    //   16   27:iconst_0        
    //   17   28:invokevirtual   #223 <Method int Bundle.getInt(String, int)>
    //   18   31:putfield        #53  <Field int mStyle>
    //   19   34:aload_0         
    //   20   35:aload_1         
    //   21   36:ldc1            #27  <String "android:theme">
    //   22   38:iconst_0        
    //   23   39:invokevirtual   #223 <Method int Bundle.getInt(String, int)>
    //   24   42:putfield        #55  <Field int mTheme>
    //   25   45:aload_0         
    //   26   46:aload_1         
    //   27   47:ldc1            #15  <String "android:cancelable">
    //   28   49:iconst_1        
    //   29   50:invokevirtual   #227 <Method boolean Bundle.getBoolean(String, boolean)>
    //   30   53:putfield        #57  <Field boolean mCancelable>
    //   31   56:aload_0         
    //   32   57:aload_1         
    //   33   58:ldc1            #21  <String "android:showsDialog">
    //   34   60:aload_0         
    //   35   61:getfield        #59  <Field boolean mShowsDialog>
    //   36   64:invokevirtual   #227 <Method boolean Bundle.getBoolean(String, boolean)>
    //   37   67:putfield        #59  <Field boolean mShowsDialog>
    //   38   70:aload_0         
    //   39   71:aload_1         
    //   40   72:ldc1            #12  <String "android:backStackId">
    //   41   74:iconst_m1       
    //   42   75:invokevirtual   #223 <Method int Bundle.getInt(String, int)>
    //   43   78:putfield        #61  <Field int mBackStackId>
    //   44   81:return          
    //   45   82:iconst_0        
    //   46   83:istore_2        
    //   47   84:goto            14
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
    //    0    0:new             #75  <Class Dialog>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokevirtual   #184 <Method FragmentActivity getActivity()>
    //    4    8:aload_0         
    //    5    9:invokevirtual   #229 <Method int getTheme()>
    //    6   12:invokespecial   #232 <Method void Dialog(Context, int)>
    //    7   15:areturn         
    }

    public void onDestroyView()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #235 <Method void Fragment.onDestroyView()>
    //    2    4:aload_0         
    //    3    5:getfield        #73  <Field Dialog mDialog>
    //    4    8:ifnull          28
    //    5   11:aload_0         
    //    6   12:iconst_1        
    //    7   13:putfield        #79  <Field boolean mViewDestroyed>
    //    8   16:aload_0         
    //    9   17:getfield        #73  <Field Dialog mDialog>
    //   10   20:invokevirtual   #77  <Method void Dialog.dismiss()>
    //   11   23:aload_0         
    //   12   24:aconst_null     
    //   13   25:putfield        #73  <Field Dialog mDialog>
    //   14   28:return          
    }

    public void onDetach()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #238 <Method void Fragment.onDetach()>
    //    2    4:aload_0         
    //    3    5:getfield        #71  <Field boolean mShownByMe>
    //    4    8:ifne            23
    //    5   11:aload_0         
    //    6   12:getfield        #69  <Field boolean mDismissed>
    //    7   15:ifne            23
    //    8   18:aload_0         
    //    9   19:iconst_1        
    //   10   20:putfield        #69  <Field boolean mDismissed>
    //   11   23:return          
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #79  <Field boolean mViewDestroyed>
    //    2    4:ifne            12
    //    3    7:aload_0         
    //    4    8:iconst_1        
    //    5    9:invokevirtual   #66  <Method void dismissInternal(boolean)>
    //    6   12:return          
    }

    public void onSaveInstanceState(Bundle bundle)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #242 <Method void Fragment.onSaveInstanceState(Bundle)>
    //    3    5:aload_0         
    //    4    6:getfield        #73  <Field Dialog mDialog>
    //    5    9:ifnull          31
    //    6   12:aload_0         
    //    7   13:getfield        #73  <Field Dialog mDialog>
    //    8   16:invokevirtual   #245 <Method Bundle Dialog.onSaveInstanceState()>
    //    9   19:astore_2        
    //   10   20:aload_2         
    //   11   21:ifnull          31
    //   12   24:aload_1         
    //   13   25:ldc1            #18  <String "android:savedDialogState">
    //   14   27:aload_2         
    //   15   28:invokevirtual   #249 <Method void Bundle.putBundle(String, Bundle)>
    //   16   31:aload_0         
    //   17   32:getfield        #53  <Field int mStyle>
    //   18   35:ifeq            48
    //   19   38:aload_1         
    //   20   39:ldc1            #24  <String "android:style">
    //   21   41:aload_0         
    //   22   42:getfield        #53  <Field int mStyle>
    //   23   45:invokevirtual   #253 <Method void Bundle.putInt(String, int)>
    //   24   48:aload_0         
    //   25   49:getfield        #55  <Field int mTheme>
    //   26   52:ifeq            65
    //   27   55:aload_1         
    //   28   56:ldc1            #27  <String "android:theme">
    //   29   58:aload_0         
    //   30   59:getfield        #55  <Field int mTheme>
    //   31   62:invokevirtual   #253 <Method void Bundle.putInt(String, int)>
    //   32   65:aload_0         
    //   33   66:getfield        #57  <Field boolean mCancelable>
    //   34   69:ifne            82
    //   35   72:aload_1         
    //   36   73:ldc1            #15  <String "android:cancelable">
    //   37   75:aload_0         
    //   38   76:getfield        #57  <Field boolean mCancelable>
    //   39   79:invokevirtual   #257 <Method void Bundle.putBoolean(String, boolean)>
    //   40   82:aload_0         
    //   41   83:getfield        #59  <Field boolean mShowsDialog>
    //   42   86:ifne            99
    //   43   89:aload_1         
    //   44   90:ldc1            #21  <String "android:showsDialog">
    //   45   92:aload_0         
    //   46   93:getfield        #59  <Field boolean mShowsDialog>
    //   47   96:invokevirtual   #257 <Method void Bundle.putBoolean(String, boolean)>
    //   48   99:aload_0         
    //   49  100:getfield        #61  <Field int mBackStackId>
    //   50  103:iconst_m1       
    //   51  104:icmpeq          117
    //   52  107:aload_1         
    //   53  108:ldc1            #12  <String "android:backStackId">
    //   54  110:aload_0         
    //   55  111:getfield        #61  <Field int mBackStackId>
    //   56  114:invokevirtual   #253 <Method void Bundle.putInt(String, int)>
    //   57  117:return          
    }

    public void onStart()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #260 <Method void Fragment.onStart()>
    //    2    4:aload_0         
    //    3    5:getfield        #73  <Field Dialog mDialog>
    //    4    8:ifnull          23
    //    5   11:aload_0         
    //    6   12:iconst_0        
    //    7   13:putfield        #79  <Field boolean mViewDestroyed>
    //    8   16:aload_0         
    //    9   17:getfield        #73  <Field Dialog mDialog>
    //   10   20:invokevirtual   #263 <Method void Dialog.show()>
    //   11   23:return          
    }

    public void onStop()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #266 <Method void Fragment.onStop()>
    //    2    4:aload_0         
    //    3    5:getfield        #73  <Field Dialog mDialog>
    //    4    8:ifnull          18
    //    5   11:aload_0         
    //    6   12:getfield        #73  <Field Dialog mDialog>
    //    7   15:invokevirtual   #269 <Method void Dialog.hide()>
    //    8   18:return          
    }

    public void setCancelable(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #57  <Field boolean mCancelable>
    //    3    5:aload_0         
    //    4    6:getfield        #73  <Field Dialog mDialog>
    //    5    9:ifnull          20
    //    6   12:aload_0         
    //    7   13:getfield        #73  <Field Dialog mDialog>
    //    8   16:iload_1         
    //    9   17:invokevirtual   #191 <Method void Dialog.setCancelable(boolean)>
    //   10   20:return          
    }

    public void setShowsDialog(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #59  <Field boolean mShowsDialog>
    //    3    5:return          
    }

    public void setStyle(int i, int j)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #53  <Field int mStyle>
    //    3    5:aload_0         
    //    4    6:getfield        #53  <Field int mStyle>
    //    5    9:iconst_2        
    //    6   10:icmpeq          21
    //    7   13:aload_0         
    //    8   14:getfield        #53  <Field int mStyle>
    //    9   17:iconst_3        
    //   10   18:icmpne          28
    //   11   21:aload_0         
    //   12   22:ldc2            #272 <Int 0x1030059>
    //   13   25:putfield        #55  <Field int mTheme>
    //   14   28:iload_2         
    //   15   29:ifeq            37
    //   16   32:aload_0         
    //   17   33:iload_2         
    //   18   34:putfield        #55  <Field int mTheme>
    //   19   37:return          
    }

    public int show(FragmentTransaction fragmenttransaction, String s)
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:putfield        #69  <Field boolean mDismissed>
    //    3    5:aload_0         
    //    4    6:iconst_1        
    //    5    7:putfield        #71  <Field boolean mShownByMe>
    //    6   10:aload_1         
    //    7   11:aload_0         
    //    8   12:aload_2         
    //    9   13:invokevirtual   #277 <Method FragmentTransaction FragmentTransaction.add(Fragment, String)>
    //   10   16:pop             
    //   11   17:aload_0         
    //   12   18:iconst_0        
    //   13   19:putfield        #79  <Field boolean mViewDestroyed>
    //   14   22:aload_0         
    //   15   23:aload_1         
    //   16   24:invokevirtual   #106 <Method int FragmentTransaction.commit()>
    //   17   27:putfield        #61  <Field int mBackStackId>
    //   18   30:aload_0         
    //   19   31:getfield        #61  <Field int mBackStackId>
    //   20   34:ireturn         
    }

    public void show(FragmentManager fragmentmanager, String s)
    {
    //    0    0:aload_0         
    //    1    1:iconst_0        
    //    2    2:putfield        #69  <Field boolean mDismissed>
    //    3    5:aload_0         
    //    4    6:iconst_1        
    //    5    7:putfield        #71  <Field boolean mShownByMe>
    //    6   10:aload_1         
    //    7   11:invokevirtual   #93  <Method FragmentTransaction FragmentManager.beginTransaction()>
    //    8   14:astore_3        
    //    9   15:aload_3         
    //   10   16:aload_0         
    //   11   17:aload_2         
    //   12   18:invokevirtual   #277 <Method FragmentTransaction FragmentTransaction.add(Fragment, String)>
    //   13   21:pop             
    //   14   22:aload_3         
    //   15   23:invokevirtual   #106 <Method int FragmentTransaction.commit()>
    //   16   26:pop             
    //   17   27:return          
    }

    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    int mBackStackId;
    boolean mCancelable;
    Dialog mDialog;
    boolean mDismissed;
    boolean mShownByMe;
    boolean mShowsDialog;
    int mStyle;
    int mTheme;
    boolean mViewDestroyed;
}
