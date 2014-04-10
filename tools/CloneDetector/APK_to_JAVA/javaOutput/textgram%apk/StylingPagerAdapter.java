// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package codeadore.textgram.adapters;

import android.support.v4.app.*;
import codeadore.textgram.StylingPagerFragment;
import codeadore.textgram.styling_fragments.*;

public class StylingPagerAdapter extends FragmentPagerAdapter
{

    static 
    {
    //    0    0:bipush          9
    //    1    2:anewarray       String[]
    //    2    5:dup             
    //    3    6:iconst_0        
    //    4    7:ldc1            #13  <String "hi">
    //    5    9:aastore         
    //    6   10:dup             
    //    7   11:iconst_1        
    //    8   12:ldc1            #15  <String "templates">
    //    9   14:aastore         
    //   10   15:dup             
    //   11   16:iconst_2        
    //   12   17:ldc1            #17  <String "stickers">
    //   13   19:aastore         
    //   14   20:dup             
    //   15   21:iconst_3        
    //   16   22:ldc1            #19  <String "fonts">
    //   17   24:aastore         
    //   18   25:dup             
    //   19   26:iconst_4        
    //   20   27:ldc1            #21  <String "text">
    //   21   29:aastore         
    //   22   30:dup             
    //   23   31:iconst_5        
    //   24   32:ldc1            #23  <String "highlight">
    //   25   34:aastore         
    //   26   35:dup             
    //   27   36:bipush          6
    //   28   38:ldc1            #25  <String "backgrounds">
    //   29   40:aastore         
    //   30   41:dup             
    //   31   42:bipush          7
    //   32   44:ldc1            #27  <String "filters">
    //   33   46:aastore         
    //   34   47:dup             
    //   35   48:bipush          8
    //   36   50:ldc1            #29  <String "frames">
    //   37   52:aastore         
    //   38   53:putstatic       #31  <Field String[] titles_ids>
    //   39   56:bipush          9
    //   40   58:anewarray       String[]
    //   41   61:dup             
    //   42   62:iconst_0        
    //   43   63:ldc1            #13  <String "hi">
    //   44   65:aastore         
    //   45   66:dup             
    //   46   67:iconst_1        
    //   47   68:ldc1            #15  <String "templates">
    //   48   70:aastore         
    //   49   71:dup             
    //   50   72:iconst_2        
    //   51   73:ldc1            #17  <String "stickers">
    //   52   75:aastore         
    //   53   76:dup             
    //   54   77:iconst_3        
    //   55   78:ldc1            #19  <String "fonts">
    //   56   80:aastore         
    //   57   81:dup             
    //   58   82:iconst_4        
    //   59   83:ldc1            #21  <String "text">
    //   60   85:aastore         
    //   61   86:dup             
    //   62   87:iconst_5        
    //   63   88:ldc1            #23  <String "highlight">
    //   64   90:aastore         
    //   65   91:dup             
    //   66   92:bipush          6
    //   67   94:ldc1            #25  <String "backgrounds">
    //   68   96:aastore         
    //   69   97:dup             
    //   70   98:bipush          7
    //   71  100:ldc1            #27  <String "filters">
    //   72  102:aastore         
    //   73  103:dup             
    //   74  104:bipush          8
    //   75  106:ldc1            #29  <String "frames">
    //   76  108:aastore         
    //   77  109:putstatic       #33  <Field String[] titles_strings>
    //   78  112:return          
    }

    public StylingPagerAdapter(FragmentManager fragmentmanager)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #37  <Method void FragmentPagerAdapter(FragmentManager)>
    //    3    5:return          
    }

    public int getCount()
    {
    //    0    0:getstatic       #31  <Field String[] titles_ids>
    //    1    3:arraylength     
    //    2    4:ireturn         
    }

    public Fragment getItem(int i)
    {
    //    0    0:getstatic       #31  <Field String[] titles_ids>
    //    1    3:iload_1         
    //    2    4:aaload          
    //    3    5:ldc1            #13  <String "hi">
    //    4    7:if_acmpne       18
    //    5   10:new             #43  <Class StylingHiFragment>
    //    6   13:dup             
    //    7   14:invokespecial   #45  <Method void StylingHiFragment()>
    //    8   17:areturn         
    //    9   18:getstatic       #31  <Field String[] titles_ids>
    //   10   21:iload_1         
    //   11   22:aaload          
    //   12   23:ldc1            #19  <String "fonts">
    //   13   25:if_acmpne       34
    //   14   28:ldc1            #19  <String "fonts">
    //   15   30:invokestatic    #51  <Method StylingImagesFragment StylingImagesFragment.newInstance(String)>
    //   16   33:areturn         
    //   17   34:getstatic       #31  <Field String[] titles_ids>
    //   18   37:iload_1         
    //   19   38:aaload          
    //   20   39:ldc1            #25  <String "backgrounds">
    //   21   41:if_acmpne       50
    //   22   44:ldc1            #25  <String "backgrounds">
    //   23   46:invokestatic    #51  <Method StylingImagesFragment StylingImagesFragment.newInstance(String)>
    //   24   49:areturn         
    //   25   50:getstatic       #31  <Field String[] titles_ids>
    //   26   53:iload_1         
    //   27   54:aaload          
    //   28   55:ldc1            #29  <String "frames">
    //   29   57:if_acmpne       66
    //   30   60:ldc1            #29  <String "frames">
    //   31   62:invokestatic    #51  <Method StylingImagesFragment StylingImagesFragment.newInstance(String)>
    //   32   65:areturn         
    //   33   66:getstatic       #31  <Field String[] titles_ids>
    //   34   69:iload_1         
    //   35   70:aaload          
    //   36   71:ldc1            #27  <String "filters">
    //   37   73:if_acmpne       82
    //   38   76:ldc1            #27  <String "filters">
    //   39   78:invokestatic    #51  <Method StylingImagesFragment StylingImagesFragment.newInstance(String)>
    //   40   81:areturn         
    //   41   82:getstatic       #31  <Field String[] titles_ids>
    //   42   85:iload_1         
    //   43   86:aaload          
    //   44   87:ldc1            #15  <String "templates">
    //   45   89:if_acmpne       98
    //   46   92:ldc1            #15  <String "templates">
    //   47   94:invokestatic    #51  <Method StylingImagesFragment StylingImagesFragment.newInstance(String)>
    //   48   97:areturn         
    //   49   98:getstatic       #31  <Field String[] titles_ids>
    //   50  101:iload_1         
    //   51  102:aaload          
    //   52  103:ldc1            #17  <String "stickers">
    //   53  105:if_acmpne       114
    //   54  108:ldc1            #17  <String "stickers">
    //   55  110:invokestatic    #51  <Method StylingImagesFragment StylingImagesFragment.newInstance(String)>
    //   56  113:areturn         
    //   57  114:getstatic       #31  <Field String[] titles_ids>
    //   58  117:iload_1         
    //   59  118:aaload          
    //   60  119:ldc1            #21  <String "text">
    //   61  121:if_acmpne       132
    //   62  124:new             #53  <Class StylingTextFragment>
    //   63  127:dup             
    //   64  128:invokespecial   #54  <Method void StylingTextFragment()>
    //   65  131:areturn         
    //   66  132:getstatic       #31  <Field String[] titles_ids>
    //   67  135:iload_1         
    //   68  136:aaload          
    //   69  137:ldc1            #23  <String "highlight">
    //   70  139:if_acmpne       148
    //   71  142:ldc1            #23  <String "highlight">
    //   72  144:invokestatic    #51  <Method StylingImagesFragment StylingImagesFragment.newInstance(String)>
    //   73  147:areturn         
    //   74  148:new             #56  <Class StylingPagerFragment>
    //   75  151:dup             
    //   76  152:invokespecial   #57  <Method void StylingPagerFragment()>
    //   77  155:areturn         
    }

    public CharSequence getPageTitle(int i)
    {
    //    0    0:getstatic       #33  <Field String[] titles_strings>
    //    1    3:iload_1         
    //    2    4:aaload          
    //    3    5:areturn         
    }

    public static String titles_ids[];
    public static String titles_strings[];
}
