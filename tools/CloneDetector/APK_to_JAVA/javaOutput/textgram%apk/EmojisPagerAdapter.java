// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram;

import android.support.v4.app.*;
import android.view.View;

// Referenced classes of package codeadore.textgram:
//            EmojisCategFragment

public class EmojisPagerAdapter extends FragmentPagerAdapter
{

    public EmojisPagerAdapter(FragmentManager fragmentmanager)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #10  <Method void FragmentPagerAdapter(FragmentManager)>
    //    3    5:aload_0         
    //    4    6:iconst_5        
    //    5    7:anewarray       String[]
    //    6   10:dup             
    //    7   11:iconst_0        
    //    8   12:ldc1            #14  <String "bell">
    //    9   14:aastore         
    //   10   15:dup             
    //   11   16:iconst_1        
    //   12   17:ldc1            #16  <String "car">
    //   13   19:aastore         
    //   14   20:dup             
    //   15   21:iconst_2        
    //   16   22:ldc1            #18  <String "face">
    //   17   24:aastore         
    //   18   25:dup             
    //   19   26:iconst_3        
    //   20   27:ldc1            #20  <String "flower">
    //   21   29:aastore         
    //   22   30:dup             
    //   23   31:iconst_4        
    //   24   32:ldc1            #22  <String "symbols">
    //   25   34:aastore         
    //   26   35:putfield        #24  <Field String[] categories>
    //   27   38:return          
    }

    public void destroyItem(View view, int i, Object obj)
    {
    //    0    0:return          
    }

    public int getCount()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #24  <Field String[] categories>
    //    2    4:arraylength     
    //    3    5:ireturn         
    }

    public Fragment getItem(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #24  <Field String[] categories>
    //    2    4:iload_1         
    //    3    5:aaload          
    //    4    6:invokestatic    #36  <Method Fragment EmojisCategFragment.newInstance(String)>
    //    5    9:areturn         
    }

    public CharSequence getPageTitle(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #24  <Field String[] categories>
    //    2    4:iload_1         
    //    3    5:aaload          
    //    4    6:areturn         
    }

    String categories[];
}
