// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.text;

import java.nio.CharBuffer;
import java.util.Locale;

// Referenced classes of package android.support.v4.text:
//            TextDirectionHeuristicCompat, TextUtilsCompat

public class TextDirectionHeuristicsCompat
{
    private static class AnyStrong
        implements TextDirectionAlgorithm
    {

        static 
        {
        //    0    0:new             #2   <Class TextDirectionHeuristicsCompat$AnyStrong>
        //    1    3:dup             
        //    2    4:iconst_1        
        //    3    5:invokespecial   #17  <Method void TextDirectionHeuristicsCompat$AnyStrong(boolean)>
        //    4    8:putstatic       #19  <Field TextDirectionHeuristicsCompat$AnyStrong INSTANCE_RTL>
        //    5   11:new             #2   <Class TextDirectionHeuristicsCompat$AnyStrong>
        //    6   14:dup             
        //    7   15:iconst_0        
        //    8   16:invokespecial   #17  <Method void TextDirectionHeuristicsCompat$AnyStrong(boolean)>
        //    9   19:putstatic       #21  <Field TextDirectionHeuristicsCompat$AnyStrong INSTANCE_LTR>
        //   10   22:return          
        }

        private AnyStrong(boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #23  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:iload_1         
        //    4    6:putfield        #25  <Field boolean mLookForRtl>
        //    5    9:return          
        }

        public int checkRtl(CharSequence charsequence, int i, int j)
        {
        //    0    0:iconst_1        
        //    1    1:istore          4
        //    2    3:iconst_0        
        //    3    4:istore          5
        //    4    6:iload_2         
        //    5    7:istore          6
        //    6    9:iload_2         
        //    7   10:iload_3         
        //    8   11:iadd            
        //    9   12:istore          7
        //   10   14:iload           6
        //   11   16:iload           7
        //   12   18:icmpge          94
        //   13   21:aload_1         
        //   14   22:iload           6
        //   15   24:invokeinterface #33  <Method char CharSequence.charAt(int)>
        //   16   29:invokestatic    #39  <Method byte Character.getDirectionality(char)>
        //   17   32:invokestatic    #45  <Method int TextDirectionHeuristicsCompat.access$200(int)>
        //   18   35:tableswitch     0 1: default 56
        //                       0 62
        //                       1 81
        //   19   56:iinc            6  1
        //   20   59:goto            14
        //   21   62:aload_0         
        //   22   63:getfield        #25  <Field boolean mLookForRtl>
        //   23   66:ifeq            75
        //   24   69:iconst_0        
        //   25   70:istore          4
        //   26   72:iload           4
        //   27   74:ireturn         
        //   28   75:iconst_1        
        //   29   76:istore          5
        //   30   78:goto            56
        //   31   81:aload_0         
        //   32   82:getfield        #25  <Field boolean mLookForRtl>
        //   33   85:ifeq            72
        //   34   88:iconst_1        
        //   35   89:istore          5
        //   36   91:goto            56
        //   37   94:iload           5
        //   38   96:ifeq            108
        //   39   99:aload_0         
        //   40  100:getfield        #25  <Field boolean mLookForRtl>
        //   41  103:ifne            72
        //   42  106:iconst_0        
        //   43  107:ireturn         
        //   44  108:iconst_2        
        //   45  109:ireturn         
        }

        public static final AnyStrong INSTANCE_LTR;
        public static final AnyStrong INSTANCE_RTL;
        private final boolean mLookForRtl;
    }

    private static class FirstStrong
        implements TextDirectionAlgorithm
    {

        static 
        {
        //    0    0:new             #2   <Class TextDirectionHeuristicsCompat$FirstStrong>
        //    1    3:dup             
        //    2    4:invokespecial   #13  <Method void TextDirectionHeuristicsCompat$FirstStrong()>
        //    3    7:putstatic       #15  <Field TextDirectionHeuristicsCompat$FirstStrong INSTANCE>
        //    4   10:return          
        }

        private FirstStrong()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #16  <Method void Object()>
        //    2    4:return          
        }

        public int checkRtl(CharSequence charsequence, int i, int j)
        {
        //    0    0:iconst_2        
        //    1    1:istore          4
        //    2    3:iload_2         
        //    3    4:istore          5
        //    4    6:iload_2         
        //    5    7:iload_3         
        //    6    8:iadd            
        //    7    9:istore          6
        //    8   11:iload           5
        //    9   13:iload           6
        //   10   15:icmpge          46
        //   11   18:iload           4
        //   12   20:iconst_2        
        //   13   21:icmpne          46
        //   14   24:aload_1         
        //   15   25:iload           5
        //   16   27:invokeinterface #24  <Method char CharSequence.charAt(int)>
        //   17   32:invokestatic    #30  <Method byte Character.getDirectionality(char)>
        //   18   35:invokestatic    #36  <Method int TextDirectionHeuristicsCompat.access$100(int)>
        //   19   38:istore          4
        //   20   40:iinc            5  1
        //   21   43:goto            11
        //   22   46:iload           4
        //   23   48:ireturn         
        }

        public static final FirstStrong INSTANCE;
    }

    private static interface TextDirectionAlgorithm
    {

        public abstract int checkRtl(CharSequence charsequence, int i, int j);
    }

    private static abstract class TextDirectionHeuristicImpl
        implements TextDirectionHeuristicCompat
    {

        public TextDirectionHeuristicImpl(TextDirectionAlgorithm textdirectionalgorithm)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #13  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:putfield        #15  <Field TextDirectionHeuristicsCompat$TextDirectionAlgorithm mAlgorithm>
        //    5    9:return          
        }

        private boolean doCheck(CharSequence charsequence, int i, int j)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #15  <Field TextDirectionHeuristicsCompat$TextDirectionAlgorithm mAlgorithm>
        //    2    4:aload_1         
        //    3    5:iload_2         
        //    4    6:iload_3         
        //    5    7:invokeinterface #23  <Method int TextDirectionHeuristicsCompat$TextDirectionAlgorithm.checkRtl(CharSequence, int, int)>
        //    6   12:tableswitch     0 1: default 36
        //                       0 41
        //                       1 43
        //    7   36:aload_0         
        //    8   37:invokevirtual   #27  <Method boolean defaultIsRtl()>
        //    9   40:ireturn         
        //   10   41:iconst_1        
        //   11   42:ireturn         
        //   12   43:iconst_0        
        //   13   44:ireturn         
        }

        protected abstract boolean defaultIsRtl();

        public boolean isRtl(CharSequence charsequence, int i, int j)
        {
        //    0    0:aload_1         
        //    1    1:ifnull          24
        //    2    4:iload_2         
        //    3    5:iflt            24
        //    4    8:iload_3         
        //    5    9:iflt            24
        //    6   12:aload_1         
        //    7   13:invokeinterface #34  <Method int CharSequence.length()>
        //    8   18:iload_3         
        //    9   19:isub            
        //   10   20:iload_2         
        //   11   21:icmpge          32
        //   12   24:new             #36  <Class IllegalArgumentException>
        //   13   27:dup             
        //   14   28:invokespecial   #37  <Method void IllegalArgumentException()>
        //   15   31:athrow          
        //   16   32:aload_0         
        //   17   33:getfield        #15  <Field TextDirectionHeuristicsCompat$TextDirectionAlgorithm mAlgorithm>
        //   18   36:ifnonnull       44
        //   19   39:aload_0         
        //   20   40:invokevirtual   #27  <Method boolean defaultIsRtl()>
        //   21   43:ireturn         
        //   22   44:aload_0         
        //   23   45:aload_1         
        //   24   46:iload_2         
        //   25   47:iload_3         
        //   26   48:invokespecial   #39  <Method boolean doCheck(CharSequence, int, int)>
        //   27   51:ireturn         
        }

        public boolean isRtl(char ac[], int i, int j)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokestatic    #46  <Method CharBuffer CharBuffer.wrap(char[])>
        //    3    5:iload_2         
        //    4    6:iload_3         
        //    5    7:invokevirtual   #48  <Method boolean isRtl(CharSequence, int, int)>
        //    6   10:ireturn         
        }

        private final TextDirectionAlgorithm mAlgorithm;
    }

    private static class TextDirectionHeuristicInternal extends TextDirectionHeuristicImpl
    {

        private TextDirectionHeuristicInternal(TextDirectionAlgorithm textdirectionalgorithm, boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #11  <Method void TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl(TextDirectionHeuristicsCompat$TextDirectionAlgorithm)>
        //    3    5:aload_0         
        //    4    6:iload_2         
        //    5    7:putfield        #13  <Field boolean mDefaultIsRtl>
        //    6   10:return          
        }

        TextDirectionHeuristicInternal(TextDirectionAlgorithm textdirectionalgorithm, boolean flag, _cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:iload_2         
        //    3    3:invokespecial   #16  <Method void TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal(TextDirectionHeuristicsCompat$TextDirectionAlgorithm, boolean)>
        //    4    6:return          
        }

        protected boolean defaultIsRtl()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #13  <Field boolean mDefaultIsRtl>
        //    2    4:ireturn         
        }

        private final boolean mDefaultIsRtl;
    }

    private static class TextDirectionHeuristicLocale extends TextDirectionHeuristicImpl
    {

        static 
        {
        //    0    0:new             #2   <Class TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale>
        //    1    3:dup             
        //    2    4:invokespecial   #11  <Method void TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale()>
        //    3    7:putstatic       #13  <Field TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale INSTANCE>
        //    4   10:return          
        }

        public TextDirectionHeuristicLocale()
        {
        //    0    0:aload_0         
        //    1    1:aconst_null     
        //    2    2:invokespecial   #16  <Method void TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl(TextDirectionHeuristicsCompat$TextDirectionAlgorithm)>
        //    3    5:return          
        }

        protected boolean defaultIsRtl()
        {
        //    0    0:invokestatic    #24  <Method Locale Locale.getDefault()>
        //    1    3:invokestatic    #30  <Method int TextUtilsCompat.getLayoutDirectionFromLocale(Locale)>
        //    2    6:iconst_1        
        //    3    7:icmpne          12
        //    4   10:iconst_1        
        //    5   11:ireturn         
        //    6   12:iconst_0        
        //    7   13:ireturn         
        }

        public static final TextDirectionHeuristicLocale INSTANCE;
    }


    static 
    {
    //    0    0:new             #22  <Class TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal>
    //    1    3:dup             
    //    2    4:aconst_null     
    //    3    5:iconst_0        
    //    4    6:aconst_null     
    //    5    7:invokespecial   #26  <Method void TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal(TextDirectionHeuristicsCompat$TextDirectionAlgorithm, boolean, TextDirectionHeuristicsCompat$1)>
    //    6   10:putstatic       #28  <Field TextDirectionHeuristicCompat LTR>
    //    7   13:new             #22  <Class TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal>
    //    8   16:dup             
    //    9   17:aconst_null     
    //   10   18:iconst_1        
    //   11   19:aconst_null     
    //   12   20:invokespecial   #26  <Method void TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal(TextDirectionHeuristicsCompat$TextDirectionAlgorithm, boolean, TextDirectionHeuristicsCompat$1)>
    //   13   23:putstatic       #30  <Field TextDirectionHeuristicCompat RTL>
    //   14   26:new             #22  <Class TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal>
    //   15   29:dup             
    //   16   30:getstatic       #36  <Field TextDirectionHeuristicsCompat$FirstStrong TextDirectionHeuristicsCompat$FirstStrong.INSTANCE>
    //   17   33:iconst_0        
    //   18   34:aconst_null     
    //   19   35:invokespecial   #26  <Method void TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal(TextDirectionHeuristicsCompat$TextDirectionAlgorithm, boolean, TextDirectionHeuristicsCompat$1)>
    //   20   38:putstatic       #38  <Field TextDirectionHeuristicCompat FIRSTSTRONG_LTR>
    //   21   41:new             #22  <Class TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal>
    //   22   44:dup             
    //   23   45:getstatic       #36  <Field TextDirectionHeuristicsCompat$FirstStrong TextDirectionHeuristicsCompat$FirstStrong.INSTANCE>
    //   24   48:iconst_1        
    //   25   49:aconst_null     
    //   26   50:invokespecial   #26  <Method void TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal(TextDirectionHeuristicsCompat$TextDirectionAlgorithm, boolean, TextDirectionHeuristicsCompat$1)>
    //   27   53:putstatic       #40  <Field TextDirectionHeuristicCompat FIRSTSTRONG_RTL>
    //   28   56:new             #22  <Class TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal>
    //   29   59:dup             
    //   30   60:getstatic       #46  <Field TextDirectionHeuristicsCompat$AnyStrong TextDirectionHeuristicsCompat$AnyStrong.INSTANCE_RTL>
    //   31   63:iconst_0        
    //   32   64:aconst_null     
    //   33   65:invokespecial   #26  <Method void TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal(TextDirectionHeuristicsCompat$TextDirectionAlgorithm, boolean, TextDirectionHeuristicsCompat$1)>
    //   34   68:putstatic       #48  <Field TextDirectionHeuristicCompat ANYRTL_LTR>
    //   35   71:getstatic       #53  <Field TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale.INSTANCE>
    //   36   74:putstatic       #55  <Field TextDirectionHeuristicCompat LOCALE>
    //   37   77:return          
    }

    public TextDirectionHeuristicsCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #57  <Method void Object()>
    //    2    4:return          
    }

    static int access$100(int i)
    {
    //    0    0:iload_0         
    //    1    1:invokestatic    #62  <Method int isRtlTextOrFormat(int)>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:iload_0         
    //    4    1:invokestatic    #62  <Method int isRtlTextOrFormat(int)>
    //    5    4:ireturn         
    }

    static int access$200(int i)
    {
    //    0    0:iload_0         
    //    1    1:invokestatic    #66  <Method int isRtlText(int)>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:iload_0         
    //    4    1:invokestatic    #66  <Method int isRtlText(int)>
    //    5    4:ireturn         
    }

    private static int isRtlText(int i)
    {
    //    0    0:iload_0         
    //    1    1:tableswitch     0 2: default 28
    //                   0 30
    //                   1 32
    //                   2 32
    //    2   28:iconst_2        
    //    3   29:ireturn         
    //    4   30:iconst_1        
    //    5   31:ireturn         
    //    6   32:iconst_0        
    //    7   33:ireturn         
    }

    private static int isRtlTextOrFormat(int i)
    {
    //    0    0:iload_0         
    //    1    1:lookupswitch    7: default 68
    //                   0: 70
    //                   1: 72
    //                   2: 72
    //                   14: 70
    //                   15: 70
    //                   16: 72
    //                   17: 72
    //    2   68:iconst_2        
    //    3   69:ireturn         
    //    4   70:iconst_1        
    //    5   71:ireturn         
    //    6   72:iconst_0        
    //    7   73:ireturn         
    }

    public static final TextDirectionHeuristicCompat ANYRTL_LTR;
    public static final TextDirectionHeuristicCompat FIRSTSTRONG_LTR;
    public static final TextDirectionHeuristicCompat FIRSTSTRONG_RTL;
    public static final TextDirectionHeuristicCompat LOCALE;
    public static final TextDirectionHeuristicCompat LTR;
    public static final TextDirectionHeuristicCompat RTL;
    private static final int STATE_FALSE = 1;
    private static final int STATE_TRUE = 0;
    private static final int STATE_UNKNOWN = 2;

    static int access$100(int i)
    {
    //    0    0:iload_0         
    //    1    1:invokestatic    #62  <Method int isRtlTextOrFormat(int)>
    //    2    4:ireturn         
    }

    static int access$200(int i)
    {
    //    0    0:iload_0         
    //    1    1:invokestatic    #66  <Method int isRtlText(int)>
    //    2    4:ireturn         
    }

    // Unreferenced inner class android/support/v4/text/TextDirectionHeuristicsCompat$1

/* anonymous class */
    static class _cls1
    {
    }

}
