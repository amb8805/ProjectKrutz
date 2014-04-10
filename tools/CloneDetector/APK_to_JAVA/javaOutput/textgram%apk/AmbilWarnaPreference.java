// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package yuku.ambilwarna.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import yuku.ambilwarna.AmbilWarnaDialog;

public class AmbilWarnaPreference extends Preference
{
    private static class SavedState extends android.preference.Preference.BaseSavedState
    {

        static 
        {
        //    0    0:new             #13  <Class AmbilWarnaPreference$SavedState$1>
        //    1    3:dup             
        //    2    4:invokespecial   #16  <Method void AmbilWarnaPreference$SavedState$1()>
        //    3    7:putstatic       #18  <Field android.os.Parcelable$Creator CREATOR>
        //    4   10:return          
        }

        public SavedState(Parcel parcel)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #21  <Method void android.preference.Preference$BaseSavedState(Parcel)>
        //    3    5:aload_0         
        //    4    6:aload_1         
        //    5    7:invokevirtual   #27  <Method int Parcel.readInt()>
        //    6   10:putfield        #29  <Field int value>
        //    7   13:return          
        }

        public SavedState(Parcelable parcelable)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #32  <Method void android.preference.Preference$BaseSavedState(Parcelable)>
        //    3    5:return          
        }

        public void writeToParcel(Parcel parcel, int i)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:iload_2         
        //    3    3:invokespecial   #36  <Method void android.preference.Preference$BaseSavedState.writeToParcel(Parcel, int)>
        //    4    6:aload_1         
        //    5    7:aload_0         
        //    6    8:getfield        #29  <Field int value>
        //    7   11:invokevirtual   #40  <Method void Parcel.writeInt(int)>
        //    8   14:return          
        }

        public static final android.os.Parcelable.Creator CREATOR;
        int value;
    }


    public AmbilWarnaPreference(Context context, AttributeSet attributeset)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:invokespecial   #10  <Method void Preference(Context, AttributeSet)>
    //    4    6:aload_0         
    //    5    7:getstatic       #15  <Field int yuku.ambilwarna.R$layout.ambilwarna_pref_widget>
    //    6   10:invokevirtual   #19  <Method void setWidgetLayoutResource(int)>
    //    7   13:return          
    }

    static boolean access$0(AmbilWarnaPreference ambilwarnapreference, Object obj)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #25  <Method boolean callChangeListener(Object)>
    //    3    5:ireturn         
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:aload_1         
    //    6    2:invokevirtual   #25  <Method boolean callChangeListener(Object)>
    //    7    5:ireturn         
    }

    static boolean access$1(AmbilWarnaPreference ambilwarnapreference, int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokevirtual   #31  <Method boolean persistInt(int)>
    //    3    5:ireturn         
// Previous instruction length mismatch
    //    4    0:aload_0         
    //    5    1:iload_1         
    //    6    2:invokevirtual   #31  <Method boolean persistInt(int)>
    //    7    5:ireturn         
    }

    static void access$2(AmbilWarnaPreference ambilwarnapreference)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #37  <Method void notifyChanged()>
    //    2    4:return          
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:invokevirtual   #37  <Method void notifyChanged()>
    //    5    4:return          
    }

    public void forceSetValue(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #40  <Field int value>
    //    3    5:aload_0         
    //    4    6:iload_1         
    //    5    7:invokevirtual   #31  <Method boolean persistInt(int)>
    //    6   10:pop             
    //    7   11:aload_0         
    //    8   12:invokevirtual   #37  <Method void notifyChanged()>
    //    9   15:return          
    }

    protected void onBindView(View view)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #44  <Method void Preference.onBindView(View)>
    //    3    5:aload_1         
    //    4    6:getstatic       #49  <Field int yuku.ambilwarna.R$id.ambilwarna_pref_widget_kotak>
    //    5    9:invokevirtual   #55  <Method View View.findViewById(int)>
    //    6   12:astore_2        
    //    7   13:aload_2         
    //    8   14:ifnull          25
    //    9   17:aload_2         
    //   10   18:aload_0         
    //   11   19:getfield        #40  <Field int value>
    //   12   22:invokevirtual   #58  <Method void View.setBackgroundColor(int)>
    //   13   25:return          
    }

    protected void onClick()
    {
    //    0    0:new             #61  <Class AmbilWarnaDialog>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokevirtual   #65  <Method Context getContext()>
    //    4    8:aload_0         
    //    5    9:getfield        #40  <Field int value>
    //    6   12:new             #67  <Class AmbilWarnaPreference$1>
    //    7   15:dup             
    //    8   16:aload_0         
    //    9   17:invokespecial   #69  <Method void AmbilWarnaPreference$1(AmbilWarnaPreference)>
    //   10   20:invokespecial   #72  <Method void AmbilWarnaDialog(Context, int, yuku.ambilwarna.AmbilWarnaDialog$OnAmbilWarnaListener)>
    //   11   23:invokevirtual   #75  <Method void AmbilWarnaDialog.show()>
    //   12   26:return          
    }

    protected Object onGetDefaultValue(TypedArray typedarray, int i)
    {
    //    0    0:aload_1         
    //    1    1:iload_2         
    //    2    2:iconst_0        
    //    3    3:invokevirtual   #83  <Method int TypedArray.getInteger(int, int)>
    //    4    6:invokestatic    #89  <Method Integer Integer.valueOf(int)>
    //    5    9:areturn         
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #97  <Method Class Object.getClass()>
    //    2    4:ldc1            #99  <Class AmbilWarnaPreference$SavedState>
    //    3    6:invokevirtual   #102 <Method boolean Object.equals(Object)>
    //    4    9:ifne            18
    //    5   12:aload_0         
    //    6   13:aload_1         
    //    7   14:invokespecial   #104 <Method void Preference.onRestoreInstanceState(Parcelable)>
    //    8   17:return          
    //    9   18:aload_1         
    //   10   19:checkcast       #99  <Class AmbilWarnaPreference$SavedState>
    //   11   22:astore_2        
    //   12   23:aload_0         
    //   13   24:aload_2         
    //   14   25:invokevirtual   #108 <Method Parcelable AmbilWarnaPreference$SavedState.getSuperState()>
    //   15   28:invokespecial   #104 <Method void Preference.onRestoreInstanceState(Parcelable)>
    //   16   31:aload_0         
    //   17   32:aload_2         
    //   18   33:getfield        #109 <Field int AmbilWarnaPreference$SavedState.value>
    //   19   36:putfield        #40  <Field int value>
    //   20   39:aload_0         
    //   21   40:invokevirtual   #37  <Method void notifyChanged()>
    //   22   43:return          
    }

    protected Parcelable onSaveInstanceState()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #112 <Method Parcelable Preference.onSaveInstanceState()>
    //    2    4:astore_1        
    //    3    5:aload_0         
    //    4    6:invokevirtual   #116 <Method boolean isPersistent()>
    //    5    9:ifeq            14
    //    6   12:aload_1         
    //    7   13:areturn         
    //    8   14:new             #99  <Class AmbilWarnaPreference$SavedState>
    //    9   17:dup             
    //   10   18:aload_1         
    //   11   19:invokespecial   #118 <Method void AmbilWarnaPreference$SavedState(Parcelable)>
    //   12   22:astore_2        
    //   13   23:aload_2         
    //   14   24:aload_0         
    //   15   25:getfield        #40  <Field int value>
    //   16   28:putfield        #109 <Field int AmbilWarnaPreference$SavedState.value>
    //   17   31:aload_2         
    //   18   32:areturn         
    }

    protected void onSetInitialValue(boolean flag, Object obj)
    {
    //    0    0:iload_1         
    //    1    1:ifeq            17
    //    2    4:aload_0         
    //    3    5:aload_0         
    //    4    6:aload_0         
    //    5    7:getfield        #40  <Field int value>
    //    6   10:invokevirtual   #124 <Method int getPersistedInt(int)>
    //    7   13:putfield        #40  <Field int value>
    //    8   16:return          
    //    9   17:aload_2         
    //   10   18:checkcast       #85  <Class Integer>
    //   11   21:invokevirtual   #128 <Method int Integer.intValue()>
    //   12   24:istore_3        
    //   13   25:aload_0         
    //   14   26:iload_3         
    //   15   27:putfield        #40  <Field int value>
    //   16   30:aload_0         
    //   17   31:iload_3         
    //   18   32:invokevirtual   #31  <Method boolean persistInt(int)>
    //   19   35:pop             
    //   20   36:return          
    }

    int value;

    static boolean access$0(AmbilWarnaPreference ambilwarnapreference, Object obj)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #25  <Method boolean callChangeListener(Object)>
    //    3    5:ireturn         
    }

    static boolean access$1(AmbilWarnaPreference ambilwarnapreference, int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokevirtual   #31  <Method boolean persistInt(int)>
    //    3    5:ireturn         
    }

    static void access$2(AmbilWarnaPreference ambilwarnapreference)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #37  <Method void notifyChanged()>
    //    2    4:return          
    }

    // Unreferenced inner class yuku/ambilwarna/widget/AmbilWarnaPreference$1

/* anonymous class */
    class _cls1
        implements yuku.ambilwarna.AmbilWarnaDialog.OnAmbilWarnaListener
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field AmbilWarnaPreference this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void Object()>
        //    5    9:return          
        }

        public void onCancel(AmbilWarnaDialog ambilwarnadialog)
        {
        //    0    0:return          
        }

        public void onOk(AmbilWarnaDialog ambilwarnadialog, int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field AmbilWarnaPreference this$0>
        //    2    4:iload_2         
        //    3    5:invokestatic    #29  <Method Integer Integer.valueOf(int)>
        //    4    8:invokestatic    #33  <Method boolean AmbilWarnaPreference.access$0(AmbilWarnaPreference, Object)>
        //    5   11:ifne            15
        //    6   14:return          
        //    7   15:aload_0         
        //    8   16:getfield        #17  <Field AmbilWarnaPreference this$0>
        //    9   19:iload_2         
        //   10   20:putfield        #37  <Field int AmbilWarnaPreference.value>
        //   11   23:aload_0         
        //   12   24:getfield        #17  <Field AmbilWarnaPreference this$0>
        //   13   27:aload_0         
        //   14   28:getfield        #17  <Field AmbilWarnaPreference this$0>
        //   15   31:getfield        #37  <Field int AmbilWarnaPreference.value>
        //   16   34:invokestatic    #41  <Method boolean AmbilWarnaPreference.access$1(AmbilWarnaPreference, int)>
        //   17   37:pop             
        //   18   38:aload_0         
        //   19   39:getfield        #17  <Field AmbilWarnaPreference this$0>
        //   20   42:invokestatic    #44  <Method void AmbilWarnaPreference.access$2(AmbilWarnaPreference)>
        //   21   45:return          
        }

        final AmbilWarnaPreference this$0;
    }


    // Unreferenced inner class yuku/ambilwarna/widget/AmbilWarnaPreference$SavedState$1

/* anonymous class */
    class SavedState._cls1
        implements android.os.Parcelable.Creator
    {

        SavedState._cls1()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #13  <Method void Object()>
        //    2    4:return          
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokevirtual   #18  <Method AmbilWarnaPreference$SavedState createFromParcel(Parcel)>
        //    3    5:areturn         
        }

        public SavedState createFromParcel(Parcel parcel)
        {
        //    0    0:new             #9   <Class AmbilWarnaPreference$SavedState>
        //    1    3:dup             
        //    2    4:aload_1         
        //    3    5:invokespecial   #21  <Method void AmbilWarnaPreference$SavedState(Parcel)>
        //    4    8:areturn         
        }

        public volatile Object[] newArray(int i)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:invokevirtual   #26  <Method AmbilWarnaPreference$SavedState[] newArray(int)>
        //    3    5:areturn         
        }

        public SavedState[] newArray(int i)
        {
        //    0    0:iload_1         
        //    1    1:anewarray       SavedState[]
        //    2    4:areturn         
        }
    }

}
