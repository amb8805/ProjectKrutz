// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.app;

import android.os.*;
import android.util.Log;

// Referenced classes of package android.support.v4.app:
//            Fragment, FragmentActivity, FragmentManagerImpl

final class FragmentState
    implements Parcelable
{

    static 
    {
    //    0    0:new             #29  <Class FragmentState$1>
    //    1    3:dup             
    //    2    4:invokespecial   #32  <Method void FragmentState$1()>
    //    3    7:putstatic       #34  <Field android.os.Parcelable$Creator CREATOR>
    //    4   10:return          
    }

    public FragmentState(Parcel parcel)
    {
    //    0    0:iconst_1        
    //    1    1:istore_2        
    //    2    2:aload_0         
    //    3    3:invokespecial   #36  <Method void Object()>
    //    4    6:aload_0         
    //    5    7:aload_1         
    //    6    8:invokevirtual   #42  <Method String Parcel.readString()>
    //    7   11:putfield        #44  <Field String mClassName>
    //    8   14:aload_0         
    //    9   15:aload_1         
    //   10   16:invokevirtual   #48  <Method int Parcel.readInt()>
    //   11   19:putfield        #50  <Field int mIndex>
    //   12   22:aload_1         
    //   13   23:invokevirtual   #48  <Method int Parcel.readInt()>
    //   14   26:ifeq            105
    //   15   29:iload_2         
    //   16   30:istore_3        
    //   17   31:aload_0         
    //   18   32:iload_3         
    //   19   33:putfield        #52  <Field boolean mFromLayout>
    //   20   36:aload_0         
    //   21   37:aload_1         
    //   22   38:invokevirtual   #48  <Method int Parcel.readInt()>
    //   23   41:putfield        #54  <Field int mFragmentId>
    //   24   44:aload_0         
    //   25   45:aload_1         
    //   26   46:invokevirtual   #48  <Method int Parcel.readInt()>
    //   27   49:putfield        #56  <Field int mContainerId>
    //   28   52:aload_0         
    //   29   53:aload_1         
    //   30   54:invokevirtual   #42  <Method String Parcel.readString()>
    //   31   57:putfield        #58  <Field String mTag>
    //   32   60:aload_1         
    //   33   61:invokevirtual   #48  <Method int Parcel.readInt()>
    //   34   64:ifeq            110
    //   35   67:iload_2         
    //   36   68:istore          4
    //   37   70:aload_0         
    //   38   71:iload           4
    //   39   73:putfield        #60  <Field boolean mRetainInstance>
    //   40   76:aload_1         
    //   41   77:invokevirtual   #48  <Method int Parcel.readInt()>
    //   42   80:ifeq            116
    //   43   83:aload_0         
    //   44   84:iload_2         
    //   45   85:putfield        #62  <Field boolean mDetached>
    //   46   88:aload_0         
    //   47   89:aload_1         
    //   48   90:invokevirtual   #66  <Method Bundle Parcel.readBundle()>
    //   49   93:putfield        #68  <Field Bundle mArguments>
    //   50   96:aload_0         
    //   51   97:aload_1         
    //   52   98:invokevirtual   #66  <Method Bundle Parcel.readBundle()>
    //   53  101:putfield        #70  <Field Bundle mSavedFragmentState>
    //   54  104:return          
    //   55  105:iconst_0        
    //   56  106:istore_3        
    //   57  107:goto            31
    //   58  110:iconst_0        
    //   59  111:istore          4
    //   60  113:goto            70
    //   61  116:iconst_0        
    //   62  117:istore_2        
    //   63  118:goto            83
    }

    public FragmentState(Fragment fragment)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #36  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:invokevirtual   #75  <Method Class Object.getClass()>
    //    5    9:invokevirtual   #80  <Method String Class.getName()>
    //    6   12:putfield        #44  <Field String mClassName>
    //    7   15:aload_0         
    //    8   16:aload_1         
    //    9   17:getfield        #83  <Field int Fragment.mIndex>
    //   10   20:putfield        #50  <Field int mIndex>
    //   11   23:aload_0         
    //   12   24:aload_1         
    //   13   25:getfield        #84  <Field boolean Fragment.mFromLayout>
    //   14   28:putfield        #52  <Field boolean mFromLayout>
    //   15   31:aload_0         
    //   16   32:aload_1         
    //   17   33:getfield        #85  <Field int Fragment.mFragmentId>
    //   18   36:putfield        #54  <Field int mFragmentId>
    //   19   39:aload_0         
    //   20   40:aload_1         
    //   21   41:getfield        #86  <Field int Fragment.mContainerId>
    //   22   44:putfield        #56  <Field int mContainerId>
    //   23   47:aload_0         
    //   24   48:aload_1         
    //   25   49:getfield        #87  <Field String Fragment.mTag>
    //   26   52:putfield        #58  <Field String mTag>
    //   27   55:aload_0         
    //   28   56:aload_1         
    //   29   57:getfield        #88  <Field boolean Fragment.mRetainInstance>
    //   30   60:putfield        #60  <Field boolean mRetainInstance>
    //   31   63:aload_0         
    //   32   64:aload_1         
    //   33   65:getfield        #89  <Field boolean Fragment.mDetached>
    //   34   68:putfield        #62  <Field boolean mDetached>
    //   35   71:aload_0         
    //   36   72:aload_1         
    //   37   73:getfield        #90  <Field Bundle Fragment.mArguments>
    //   38   76:putfield        #68  <Field Bundle mArguments>
    //   39   79:return          
    }

    public int describeContents()
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    public Fragment instantiate(FragmentActivity fragmentactivity, Fragment fragment)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #95  <Field Fragment mInstance>
    //    2    4:ifnull          12
    //    3    7:aload_0         
    //    4    8:getfield        #95  <Field Fragment mInstance>
    //    5   11:areturn         
    //    6   12:aload_0         
    //    7   13:getfield        #68  <Field Bundle mArguments>
    //    8   16:ifnull          30
    //    9   19:aload_0         
    //   10   20:getfield        #68  <Field Bundle mArguments>
    //   11   23:aload_1         
    //   12   24:invokevirtual   #101 <Method ClassLoader FragmentActivity.getClassLoader()>
    //   13   27:invokevirtual   #107 <Method void Bundle.setClassLoader(ClassLoader)>
    //   14   30:aload_0         
    //   15   31:aload_1         
    //   16   32:aload_0         
    //   17   33:getfield        #44  <Field String mClassName>
    //   18   36:aload_0         
    //   19   37:getfield        #68  <Field Bundle mArguments>
    //   20   40:invokestatic    #110 <Method Fragment Fragment.instantiate(android.content.Context, String, Bundle)>
    //   21   43:putfield        #95  <Field Fragment mInstance>
    //   22   46:aload_0         
    //   23   47:getfield        #70  <Field Bundle mSavedFragmentState>
    //   24   50:ifnull          75
    //   25   53:aload_0         
    //   26   54:getfield        #70  <Field Bundle mSavedFragmentState>
    //   27   57:aload_1         
    //   28   58:invokevirtual   #101 <Method ClassLoader FragmentActivity.getClassLoader()>
    //   29   61:invokevirtual   #107 <Method void Bundle.setClassLoader(ClassLoader)>
    //   30   64:aload_0         
    //   31   65:getfield        #95  <Field Fragment mInstance>
    //   32   68:aload_0         
    //   33   69:getfield        #70  <Field Bundle mSavedFragmentState>
    //   34   72:putfield        #111 <Field Bundle Fragment.mSavedFragmentState>
    //   35   75:aload_0         
    //   36   76:getfield        #95  <Field Fragment mInstance>
    //   37   79:aload_0         
    //   38   80:getfield        #50  <Field int mIndex>
    //   39   83:aload_2         
    //   40   84:invokevirtual   #115 <Method void Fragment.setIndex(int, Fragment)>
    //   41   87:aload_0         
    //   42   88:getfield        #95  <Field Fragment mInstance>
    //   43   91:aload_0         
    //   44   92:getfield        #52  <Field boolean mFromLayout>
    //   45   95:putfield        #84  <Field boolean Fragment.mFromLayout>
    //   46   98:aload_0         
    //   47   99:getfield        #95  <Field Fragment mInstance>
    //   48  102:iconst_1        
    //   49  103:putfield        #118 <Field boolean Fragment.mRestored>
    //   50  106:aload_0         
    //   51  107:getfield        #95  <Field Fragment mInstance>
    //   52  110:aload_0         
    //   53  111:getfield        #54  <Field int mFragmentId>
    //   54  114:putfield        #85  <Field int Fragment.mFragmentId>
    //   55  117:aload_0         
    //   56  118:getfield        #95  <Field Fragment mInstance>
    //   57  121:aload_0         
    //   58  122:getfield        #56  <Field int mContainerId>
    //   59  125:putfield        #86  <Field int Fragment.mContainerId>
    //   60  128:aload_0         
    //   61  129:getfield        #95  <Field Fragment mInstance>
    //   62  132:aload_0         
    //   63  133:getfield        #58  <Field String mTag>
    //   64  136:putfield        #87  <Field String Fragment.mTag>
    //   65  139:aload_0         
    //   66  140:getfield        #95  <Field Fragment mInstance>
    //   67  143:aload_0         
    //   68  144:getfield        #60  <Field boolean mRetainInstance>
    //   69  147:putfield        #88  <Field boolean Fragment.mRetainInstance>
    //   70  150:aload_0         
    //   71  151:getfield        #95  <Field Fragment mInstance>
    //   72  154:aload_0         
    //   73  155:getfield        #62  <Field boolean mDetached>
    //   74  158:putfield        #89  <Field boolean Fragment.mDetached>
    //   75  161:aload_0         
    //   76  162:getfield        #95  <Field Fragment mInstance>
    //   77  165:aload_1         
    //   78  166:getfield        #122 <Field FragmentManagerImpl FragmentActivity.mFragments>
    //   79  169:putfield        #125 <Field FragmentManagerImpl Fragment.mFragmentManager>
    //   80  172:getstatic       #130 <Field boolean FragmentManagerImpl.DEBUG>
    //   81  175:ifeq            206
    //   82  178:ldc1            #132 <String "FragmentManager">
    //   83  180:new             #134 <Class StringBuilder>
    //   84  183:dup             
    //   85  184:invokespecial   #135 <Method void StringBuilder()>
    //   86  187:ldc1            #137 <String "Instantiated fragment ">
    //   87  189:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
    //   88  192:aload_0         
    //   89  193:getfield        #95  <Field Fragment mInstance>
    //   90  196:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
    //   91  199:invokevirtual   #147 <Method String StringBuilder.toString()>
    //   92  202:invokestatic    #153 <Method int Log.v(String, String)>
    //   93  205:pop             
    //   94  206:aload_0         
    //   95  207:getfield        #95  <Field Fragment mInstance>
    //   96  210:areturn         
    }

    public void writeToParcel(Parcel parcel, int i)
    {
    //    0    0:iconst_1        
    //    1    1:istore_3        
    //    2    2:aload_1         
    //    3    3:aload_0         
    //    4    4:getfield        #44  <Field String mClassName>
    //    5    7:invokevirtual   #159 <Method void Parcel.writeString(String)>
    //    6   10:aload_1         
    //    7   11:aload_0         
    //    8   12:getfield        #50  <Field int mIndex>
    //    9   15:invokevirtual   #163 <Method void Parcel.writeInt(int)>
    //   10   18:aload_0         
    //   11   19:getfield        #52  <Field boolean mFromLayout>
    //   12   22:ifeq            103
    //   13   25:iload_3         
    //   14   26:istore          4
    //   15   28:aload_1         
    //   16   29:iload           4
    //   17   31:invokevirtual   #163 <Method void Parcel.writeInt(int)>
    //   18   34:aload_1         
    //   19   35:aload_0         
    //   20   36:getfield        #54  <Field int mFragmentId>
    //   21   39:invokevirtual   #163 <Method void Parcel.writeInt(int)>
    //   22   42:aload_1         
    //   23   43:aload_0         
    //   24   44:getfield        #56  <Field int mContainerId>
    //   25   47:invokevirtual   #163 <Method void Parcel.writeInt(int)>
    //   26   50:aload_1         
    //   27   51:aload_0         
    //   28   52:getfield        #58  <Field String mTag>
    //   29   55:invokevirtual   #159 <Method void Parcel.writeString(String)>
    //   30   58:aload_0         
    //   31   59:getfield        #60  <Field boolean mRetainInstance>
    //   32   62:ifeq            109
    //   33   65:iload_3         
    //   34   66:istore          5
    //   35   68:aload_1         
    //   36   69:iload           5
    //   37   71:invokevirtual   #163 <Method void Parcel.writeInt(int)>
    //   38   74:aload_0         
    //   39   75:getfield        #62  <Field boolean mDetached>
    //   40   78:ifeq            115
    //   41   81:aload_1         
    //   42   82:iload_3         
    //   43   83:invokevirtual   #163 <Method void Parcel.writeInt(int)>
    //   44   86:aload_1         
    //   45   87:aload_0         
    //   46   88:getfield        #68  <Field Bundle mArguments>
    //   47   91:invokevirtual   #167 <Method void Parcel.writeBundle(Bundle)>
    //   48   94:aload_1         
    //   49   95:aload_0         
    //   50   96:getfield        #70  <Field Bundle mSavedFragmentState>
    //   51   99:invokevirtual   #167 <Method void Parcel.writeBundle(Bundle)>
    //   52  102:return          
    //   53  103:iconst_0        
    //   54  104:istore          4
    //   55  106:goto            28
    //   56  109:iconst_0        
    //   57  110:istore          5
    //   58  112:goto            68
    //   59  115:iconst_0        
    //   60  116:istore_3        
    //   61  117:goto            81
    }

    public static final android.os.Parcelable.Creator CREATOR;
    final Bundle mArguments;
    final String mClassName;
    final int mContainerId;
    final boolean mDetached;
    final int mFragmentId;
    final boolean mFromLayout;
    final int mIndex;
    Fragment mInstance;
    final boolean mRetainInstance;
    Bundle mSavedFragmentState;
    final String mTag;

    // Unreferenced inner class android/support/v4/app/FragmentState$1

/* anonymous class */
    static final class _cls1
        implements android.os.Parcelable.Creator
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #13  <Method void Object()>
        //    2    4:return          
        }

        public FragmentState createFromParcel(Parcel parcel)
        {
        //    0    0:new             #9   <Class FragmentState>
        //    1    3:dup             
        //    2    4:aload_1         
        //    3    5:invokespecial   #18  <Method void FragmentState(Parcel)>
        //    4    8:areturn         
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokevirtual   #21  <Method FragmentState createFromParcel(Parcel)>
        //    3    5:areturn         
        }

        public FragmentState[] newArray(int i)
        {
        //    0    0:iload_1         
        //    1    1:anewarray       FragmentState[]
        //    2    4:areturn         
        }

        public volatile Object[] newArray(int i)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:invokevirtual   #26  <Method FragmentState[] newArray(int)>
        //    3    5:areturn         
        }
    }

}
