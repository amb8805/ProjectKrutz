// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.*;

public class FriendsListFragment extends Fragment
{

    public FriendsListFragment()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #10  <Method void Fragment()>
    //    2    4:return          
    }

    public static Fragment newInstance()
    {
    //    0    0:new             #2   <Class FriendsListFragment>
    //    1    3:dup             
    //    2    4:invokespecial   #13  <Method void FriendsListFragment()>
    //    3    7:areturn         
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
    //    0    0:aload_1         
    //    1    1:ldc1            #16  <Int 0x7f03002a>
    //    2    3:aload_2         
    //    3    4:iconst_0        
    //    4    5:invokevirtual   #22  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
    //    5    8:astore          4
    //    6   10:aload_0         
    //    7   11:aload           4
    //    8   13:putfield        #24  <Field View view>
    //    9   16:aload           4
    //   10   18:areturn         
    }

    View view;
}
