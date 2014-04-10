// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram.adapters;

import android.support.v4.app.*;
import android.view.ViewGroup;
import codeadore.textgram.store.StoreFeaturedFragment;
import codeadore.textgram.store.StoreListFragment;

public class StorePagerAdapter extends FragmentPagerAdapter
{

    static 
    {
    //    0    0:bipush          7
    //    1    2:anewarray       String[]
    //    2    5:dup             
    //    3    6:iconst_0        
    //    4    7:ldc1            #15  <String "home">
    //    5    9:aastore         
    //    6   10:dup             
    //    7   11:iconst_1        
    //    8   12:ldc1            #17  <String "template">
    //    9   14:aastore         
    //   10   15:dup             
    //   11   16:iconst_2        
    //   12   17:ldc1            #19  <String "sticker">
    //   13   19:aastore         
    //   14   20:dup             
    //   15   21:iconst_3        
    //   16   22:ldc1            #21  <String "font">
    //   17   24:aastore         
    //   18   25:dup             
    //   19   26:iconst_4        
    //   20   27:ldc1            #23  <String "background">
    //   21   29:aastore         
    //   22   30:dup             
    //   23   31:iconst_5        
    //   24   32:ldc1            #25  <String "filter">
    //   25   34:aastore         
    //   26   35:dup             
    //   27   36:bipush          6
    //   28   38:ldc1            #27  <String "frame">
    //   29   40:aastore         
    //   30   41:putstatic       #29  <Field String[] titles_ids>
    //   31   44:bipush          7
    //   32   46:anewarray       String[]
    //   33   49:dup             
    //   34   50:iconst_0        
    //   35   51:ldc1            #15  <String "home">
    //   36   53:aastore         
    //   37   54:dup             
    //   38   55:iconst_1        
    //   39   56:ldc1            #31  <String "templates">
    //   40   58:aastore         
    //   41   59:dup             
    //   42   60:iconst_2        
    //   43   61:ldc1            #33  <String "stickers">
    //   44   63:aastore         
    //   45   64:dup             
    //   46   65:iconst_3        
    //   47   66:ldc1            #35  <String "fonts">
    //   48   68:aastore         
    //   49   69:dup             
    //   50   70:iconst_4        
    //   51   71:ldc1            #37  <String "backgrounds">
    //   52   73:aastore         
    //   53   74:dup             
    //   54   75:iconst_5        
    //   55   76:ldc1            #39  <String "filters">
    //   56   78:aastore         
    //   57   79:dup             
    //   58   80:bipush          6
    //   59   82:ldc1            #41  <String "frames">
    //   60   84:aastore         
    //   61   85:putstatic       #43  <Field String[] titles_strings>
    //   62   88:iconst_0        
    //   63   89:invokestatic    #49  <Method Boolean Boolean.valueOf(boolean)>
    //   64   92:putstatic       #51  <Field Boolean destoryOn>
    //   65   95:return          
    }

    public StorePagerAdapter(FragmentManager fragmentmanager)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #55  <Method void FragmentPagerAdapter(FragmentManager)>
    //    3    5:return          
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
    //    0    0:getstatic       #51  <Field Boolean destoryOn>
    //    1    3:invokevirtual   #61  <Method boolean Boolean.booleanValue()>
    //    2    6:ifeq            16
    //    3    9:aload_0         
    //    4   10:aload_1         
    //    5   11:iload_2         
    //    6   12:aload_3         
    //    7   13:invokespecial   #63  <Method void FragmentPagerAdapter.destroyItem(ViewGroup, int, Object)>
    //    8   16:return          
    }

    public int getCount()
    {
    //    0    0:getstatic       #29  <Field String[] titles_ids>
    //    1    3:arraylength     
    //    2    4:ireturn         
    }

    public Fragment getItem(int i)
    {
    //    0    0:getstatic       #29  <Field String[] titles_ids>
    //    1    3:iload_1         
    //    2    4:aaload          
    //    3    5:ldc1            #15  <String "home">
    //    4    7:if_acmpne       18
    //    5   10:new             #69  <Class StoreFeaturedFragment>
    //    6   13:dup             
    //    7   14:invokespecial   #71  <Method void StoreFeaturedFragment()>
    //    8   17:areturn         
    //    9   18:getstatic       #29  <Field String[] titles_ids>
    //   10   21:iload_1         
    //   11   22:aaload          
    //   12   23:getstatic       #29  <Field String[] titles_ids>
    //   13   26:iload_1         
    //   14   27:aaload          
    //   15   28:invokestatic    #77  <Method StoreListFragment StoreListFragment.newInstance(String, String)>
    //   16   31:areturn         
    }

    public CharSequence getPageTitle(int i)
    {
    //    0    0:getstatic       #43  <Field String[] titles_strings>
    //    1    3:iload_1         
    //    2    4:aaload          
    //    3    5:areturn         
    }

    public static Boolean destoryOn;
    public static String titles_ids[];
    public static String titles_strings[];
}
