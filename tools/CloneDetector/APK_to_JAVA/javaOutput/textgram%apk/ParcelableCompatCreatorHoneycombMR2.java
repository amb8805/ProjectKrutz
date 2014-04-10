// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.os;

import android.os.Parcel;

// Referenced classes of package android.support.v4.os:
//            ParcelableCompatCreatorCallbacks

class ParcelableCompatCreatorHoneycombMR2
    implements android.os.Parcelable.ClassLoaderCreator
{

    public ParcelableCompatCreatorHoneycombMR2(ParcelableCompatCreatorCallbacks parcelablecompatcreatorcallbacks)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #15  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:putfield        #17  <Field ParcelableCompatCreatorCallbacks mCallbacks>
    //    5    9:return          
    }

    public Object createFromParcel(Parcel parcel)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #17  <Field ParcelableCompatCreatorCallbacks mCallbacks>
    //    2    4:aload_1         
    //    3    5:aconst_null     
    //    4    6:invokeinterface #24  <Method Object ParcelableCompatCreatorCallbacks.createFromParcel(Parcel, ClassLoader)>
    //    5   11:areturn         
    }

    public Object createFromParcel(Parcel parcel, ClassLoader classloader)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #17  <Field ParcelableCompatCreatorCallbacks mCallbacks>
    //    2    4:aload_1         
    //    3    5:aload_2         
    //    4    6:invokeinterface #24  <Method Object ParcelableCompatCreatorCallbacks.createFromParcel(Parcel, ClassLoader)>
    //    5   11:areturn         
    }

    public Object[] newArray(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #17  <Field ParcelableCompatCreatorCallbacks mCallbacks>
    //    2    4:iload_1         
    //    3    5:invokeinterface #28  <Method Object[] ParcelableCompatCreatorCallbacks.newArray(int)>
    //    4   10:areturn         
    }

    private final ParcelableCompatCreatorCallbacks mCallbacks;
}
