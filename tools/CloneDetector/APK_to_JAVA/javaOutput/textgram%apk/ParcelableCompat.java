// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.os;

import android.os.Parcel;

// Referenced classes of package android.support.v4.os:
//            ParcelableCompatCreatorHoneycombMR2Stub, ParcelableCompatCreatorCallbacks

public class ParcelableCompat
{
    static class CompatCreator
        implements android.os.Parcelable.Creator
    {

        public CompatCreator(ParcelableCompatCreatorCallbacks parcelablecompatcreatorcallbacks)
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

        public Object[] newArray(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field ParcelableCompatCreatorCallbacks mCallbacks>
        //    2    4:iload_1         
        //    3    5:invokeinterface #28  <Method Object[] ParcelableCompatCreatorCallbacks.newArray(int)>
        //    4   10:areturn         
        }

        final ParcelableCompatCreatorCallbacks mCallbacks;
    }


    public ParcelableCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    public static android.os.Parcelable.Creator newCreator(ParcelableCompatCreatorCallbacks parcelablecompatcreatorcallbacks)
    {
    //    0    0:getstatic       #16  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          13
    //    2    5:icmplt          13
    //    3    8:aload_0         
    //    4    9:invokestatic    #21  <Method android.os.Parcelable$Creator ParcelableCompatCreatorHoneycombMR2Stub.instantiate(ParcelableCompatCreatorCallbacks)>
    //    5   12:pop             
    //    6   13:new             #23  <Class ParcelableCompat$CompatCreator>
    //    7   16:dup             
    //    8   17:aload_0         
    //    9   18:invokespecial   #26  <Method void ParcelableCompat$CompatCreator(ParcelableCompatCreatorCallbacks)>
    //   10   21:areturn         
    }
}
