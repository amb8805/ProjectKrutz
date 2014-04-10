// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v4.app:
//            FragmentState, BackStackState

final class FragmentManagerState
    implements Parcelable
{

    static 
    {
    //    0    0:new             #19  <Class FragmentManagerState$1>
    //    1    3:dup             
    //    2    4:invokespecial   #22  <Method void FragmentManagerState$1()>
    //    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
    //    4   10:return          
    }

    public FragmentManagerState()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #25  <Method void Object()>
    //    2    4:return          
    }

    public FragmentManagerState(Parcel parcel)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #25  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:getstatic       #29  <Field android.os.Parcelable$Creator FragmentState.CREATOR>
    //    5    9:invokevirtual   #35  <Method Object[] Parcel.createTypedArray(android.os.Parcelable$Creator)>
    //    6   12:checkcast       #36  <Class FragmentState[]>
    //    7   15:putfield        #38  <Field FragmentState[] mActive>
    //    8   18:aload_0         
    //    9   19:aload_1         
    //   10   20:invokevirtual   #42  <Method int[] Parcel.createIntArray()>
    //   11   23:putfield        #44  <Field int[] mAdded>
    //   12   26:aload_0         
    //   13   27:aload_1         
    //   14   28:getstatic       #47  <Field android.os.Parcelable$Creator BackStackState.CREATOR>
    //   15   31:invokevirtual   #35  <Method Object[] Parcel.createTypedArray(android.os.Parcelable$Creator)>
    //   16   34:checkcast       #48  <Class BackStackState[]>
    //   17   37:putfield        #50  <Field BackStackState[] mBackStack>
    //   18   40:return          
    }

    public int describeContents()
    {
    //    0    0:iconst_0        
    //    1    1:ireturn         
    }

    public void writeToParcel(Parcel parcel, int i)
    {
    //    0    0:aload_1         
    //    1    1:aload_0         
    //    2    2:getfield        #38  <Field FragmentState[] mActive>
    //    3    5:iload_2         
    //    4    6:invokevirtual   #58  <Method void Parcel.writeTypedArray(Parcelable[], int)>
    //    5    9:aload_1         
    //    6   10:aload_0         
    //    7   11:getfield        #44  <Field int[] mAdded>
    //    8   14:invokevirtual   #62  <Method void Parcel.writeIntArray(int[])>
    //    9   17:aload_1         
    //   10   18:aload_0         
    //   11   19:getfield        #50  <Field BackStackState[] mBackStack>
    //   12   22:iload_2         
    //   13   23:invokevirtual   #58  <Method void Parcel.writeTypedArray(Parcelable[], int)>
    //   14   26:return          
    }

    public static final android.os.Parcelable.Creator CREATOR;
    FragmentState mActive[];
    int mAdded[];
    BackStackState mBackStack[];

    // Unreferenced inner class android/support/v4/app/FragmentManagerState$1

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

        public FragmentManagerState createFromParcel(Parcel parcel)
        {
        //    0    0:new             #9   <Class FragmentManagerState>
        //    1    3:dup             
        //    2    4:aload_1         
        //    3    5:invokespecial   #18  <Method void FragmentManagerState(Parcel)>
        //    4    8:areturn         
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokevirtual   #21  <Method FragmentManagerState createFromParcel(Parcel)>
        //    3    5:areturn         
        }

        public FragmentManagerState[] newArray(int i)
        {
        //    0    0:iload_1         
        //    1    1:anewarray       FragmentManagerState[]
        //    2    4:areturn         
        }

        public volatile Object[] newArray(int i)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:invokevirtual   #26  <Method FragmentManagerState[] newArray(int)>
        //    3    5:areturn         
        }
    }

}
