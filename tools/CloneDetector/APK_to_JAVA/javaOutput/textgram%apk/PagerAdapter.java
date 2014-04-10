// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class PagerAdapter
{

    public PagerAdapter()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #15  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:new             #17  <Class DataSetObservable>
    //    4    8:dup             
    //    5    9:invokespecial   #18  <Method void DataSetObservable()>
    //    6   12:putfield        #20  <Field DataSetObservable mObservable>
    //    7   15:return          
    }

    public void destroyItem(View view, int i, Object obj)
    {
    //    0    0:new             #24  <Class UnsupportedOperationException>
    //    1    3:dup             
    //    2    4:ldc1            #26  <String "Required method destroyItem was not overridden">
    //    3    6:invokespecial   #29  <Method void UnsupportedOperationException(String)>
    //    4    9:athrow          
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iload_2         
    //    3    3:aload_3         
    //    4    4:invokevirtual   #32  <Method void destroyItem(View, int, Object)>
    //    5    7:return          
    }

    public void finishUpdate(View view)
    {
    //    0    0:return          
    }

    public void finishUpdate(ViewGroup viewgroup)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #37  <Method void finishUpdate(View)>
    //    3    5:return          
    }

    public abstract int getCount();

    public int getItemPosition(Object obj)
    {
    //    0    0:iconst_m1       
    //    1    1:ireturn         
    }

    public CharSequence getPageTitle(int i)
    {
    //    0    0:aconst_null     
    //    1    1:areturn         
    }

    public float getPageWidth(int i)
    {
    //    0    0:fconst_1        
    //    1    1:freturn         
    }

    public Object instantiateItem(View view, int i)
    {
    //    0    0:new             #24  <Class UnsupportedOperationException>
    //    1    3:dup             
    //    2    4:ldc1            #49  <String "Required method instantiateItem was not overridden">
    //    3    6:invokespecial   #29  <Method void UnsupportedOperationException(String)>
    //    4    9:athrow          
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iload_2         
    //    3    3:invokevirtual   #52  <Method Object instantiateItem(View, int)>
    //    4    6:areturn         
    }

    public abstract boolean isViewFromObject(View view, Object obj);

    public void notifyDataSetChanged()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #20  <Field DataSetObservable mObservable>
    //    2    4:invokevirtual   #58  <Method void DataSetObservable.notifyChanged()>
    //    3    7:return          
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #20  <Field DataSetObservable mObservable>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #64  <Method void DataSetObservable.registerObserver(Object)>
    //    4    8:return          
    }

    public void restoreState(Parcelable parcelable, ClassLoader classloader)
    {
    //    0    0:return          
    }

    public Parcelable saveState()
    {
    //    0    0:aconst_null     
    //    1    1:areturn         
    }

    public void setPrimaryItem(View view, int i, Object obj)
    {
    //    0    0:return          
    }

    public void setPrimaryItem(ViewGroup viewgroup, int i, Object obj)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iload_2         
    //    3    3:aload_3         
    //    4    4:invokevirtual   #71  <Method void setPrimaryItem(View, int, Object)>
    //    5    7:return          
    }

    public void startUpdate(View view)
    {
    //    0    0:return          
    }

    public void startUpdate(ViewGroup viewgroup)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #74  <Method void startUpdate(View)>
    //    3    5:return          
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #20  <Field DataSetObservable mObservable>
    //    2    4:aload_1         
    //    3    5:invokevirtual   #78  <Method void DataSetObservable.unregisterObserver(Object)>
    //    4    8:return          
    }

    public static final int POSITION_NONE = -2;
    public static final int POSITION_UNCHANGED = -1;
    private DataSetObservable mObservable;
}
