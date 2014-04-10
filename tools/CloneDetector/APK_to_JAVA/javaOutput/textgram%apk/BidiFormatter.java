// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.text;

import java.util.Locale;

// Referenced classes of package android.support.v4.text:
//            TextDirectionHeuristicsCompat, TextUtilsCompat, TextDirectionHeuristicCompat

public final class BidiFormatter
{
    public static final class Builder
    {

        public Builder()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #14  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:invokestatic    #20  <Method Locale Locale.getDefault()>
        //    4    8:invokestatic    #26  <Method boolean BidiFormatter.access$000(Locale)>
        //    5   11:invokespecial   #30  <Method void initialize(boolean)>
        //    6   14:return          
        }

        public Builder(Locale locale)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #14  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:invokestatic    #26  <Method boolean BidiFormatter.access$000(Locale)>
        //    5    9:invokespecial   #30  <Method void initialize(boolean)>
        //    6   12:return          
        }

        public Builder(boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #14  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:iload_1         
        //    4    6:invokespecial   #30  <Method void initialize(boolean)>
        //    5    9:return          
        }

        private static BidiFormatter getDefaultInstanceFromContext(boolean flag)
        {
        //    0    0:iload_0         
        //    1    1:ifeq            8
        //    2    4:invokestatic    #37  <Method BidiFormatter BidiFormatter.access$200()>
        //    3    7:areturn         
        //    4    8:invokestatic    #40  <Method BidiFormatter BidiFormatter.access$300()>
        //    5   11:areturn         
        }

        private void initialize(boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:putfield        #42  <Field boolean mIsRtlContext>
        //    3    5:aload_0         
        //    4    6:invokestatic    #46  <Method TextDirectionHeuristicCompat BidiFormatter.access$100()>
        //    5    9:putfield        #48  <Field TextDirectionHeuristicCompat mTextDirectionHeuristicCompat>
        //    6   12:aload_0         
        //    7   13:iconst_2        
        //    8   14:putfield        #50  <Field int mFlags>
        //    9   17:return          
        }

        public BidiFormatter build()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #50  <Field int mFlags>
        //    2    4:iconst_2        
        //    3    5:icmpne          26
        //    4    8:aload_0         
        //    5    9:getfield        #48  <Field TextDirectionHeuristicCompat mTextDirectionHeuristicCompat>
        //    6   12:invokestatic    #46  <Method TextDirectionHeuristicCompat BidiFormatter.access$100()>
        //    7   15:if_acmpne       26
        //    8   18:aload_0         
        //    9   19:getfield        #42  <Field boolean mIsRtlContext>
        //   10   22:invokestatic    #53  <Method BidiFormatter getDefaultInstanceFromContext(boolean)>
        //   11   25:areturn         
        //   12   26:new             #22  <Class BidiFormatter>
        //   13   29:dup             
        //   14   30:aload_0         
        //   15   31:getfield        #42  <Field boolean mIsRtlContext>
        //   16   34:aload_0         
        //   17   35:getfield        #50  <Field int mFlags>
        //   18   38:aload_0         
        //   19   39:getfield        #48  <Field TextDirectionHeuristicCompat mTextDirectionHeuristicCompat>
        //   20   42:aconst_null     
        //   21   43:invokespecial   #56  <Method void BidiFormatter(boolean, int, TextDirectionHeuristicCompat, BidiFormatter$1)>
        //   22   46:areturn         
        }

        public Builder setTextDirectionHeuristic(TextDirectionHeuristicCompat textdirectionheuristiccompat)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #48  <Field TextDirectionHeuristicCompat mTextDirectionHeuristicCompat>
        //    3    5:aload_0         
        //    4    6:areturn         
        }

        public Builder stereoReset(boolean flag)
        {
        //    0    0:iload_1         
        //    1    1:ifeq            16
        //    2    4:aload_0         
        //    3    5:iconst_2        
        //    4    6:aload_0         
        //    5    7:getfield        #50  <Field int mFlags>
        //    6   10:ior             
        //    7   11:putfield        #50  <Field int mFlags>
        //    8   14:aload_0         
        //    9   15:areturn         
        //   10   16:aload_0         
        //   11   17:bipush          -3
        //   12   19:aload_0         
        //   13   20:getfield        #50  <Field int mFlags>
        //   14   23:iand            
        //   15   24:putfield        #50  <Field int mFlags>
        //   16   27:aload_0         
        //   17   28:areturn         
        }

        private int mFlags;
        private boolean mIsRtlContext;
        private TextDirectionHeuristicCompat mTextDirectionHeuristicCompat;
    }

    private static class DirectionalityEstimator
    {

        static 
        {
        //    0    0:sipush          1792
        //    1    3:newarray        byte[]
        //    2    5:putstatic       #21  <Field byte[] DIR_TYPE_CACHE>
        //    3    8:iconst_0        
        //    4    9:istore_0        
        //    5   10:iload_0         
        //    6   11:sipush          1792
        //    7   14:icmpge          32
        //    8   17:getstatic       #21  <Field byte[] DIR_TYPE_CACHE>
        //    9   20:iload_0         
        //   10   21:iload_0         
        //   11   22:invokestatic    #27  <Method byte Character.getDirectionality(int)>
        //   12   25:bastore         
        //   13   26:iinc            0  1
        //   14   29:goto            10
        //   15   32:return          
        }

        DirectionalityEstimator(String s, boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #31  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:putfield        #33  <Field String text>
        //    5    9:aload_0         
        //    6   10:iload_2         
        //    7   11:putfield        #35  <Field boolean isHtml>
        //    8   14:aload_0         
        //    9   15:aload_1         
        //   10   16:invokevirtual   #40  <Method int String.length()>
        //   11   19:putfield        #42  <Field int length>
        //   12   22:return          
        }

        private static byte getCachedDirectionality(char c)
        {
        //    0    0:iload_0         
        //    1    1:sipush          1792
        //    2    4:icmpge          13
        //    3    7:getstatic       #21  <Field byte[] DIR_TYPE_CACHE>
        //    4   10:iload_0         
        //    5   11:baload          
        //    6   12:ireturn         
        //    7   13:iload_0         
        //    8   14:invokestatic    #46  <Method byte Character.getDirectionality(char)>
        //    9   17:ireturn         
        }

        private byte skipEntityBackward()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #50  <Field int charIndex>
        //    2    4:istore_1        
        //    3    5:aload_0         
        //    4    6:getfield        #50  <Field int charIndex>
        //    5    9:ifle            59
        //    6   12:aload_0         
        //    7   13:getfield        #33  <Field String text>
        //    8   16:astore_2        
        //    9   17:iconst_m1       
        //   10   18:aload_0         
        //   11   19:getfield        #50  <Field int charIndex>
        //   12   22:iadd            
        //   13   23:istore_3        
        //   14   24:aload_0         
        //   15   25:iload_3         
        //   16   26:putfield        #50  <Field int charIndex>
        //   17   29:aload_0         
        //   18   30:aload_2         
        //   19   31:iload_3         
        //   20   32:invokevirtual   #54  <Method char String.charAt(int)>
        //   21   35:putfield        #56  <Field char lastChar>
        //   22   38:aload_0         
        //   23   39:getfield        #56  <Field char lastChar>
        //   24   42:bipush          38
        //   25   44:icmpne          50
        //   26   47:bipush          12
        //   27   49:ireturn         
        //   28   50:aload_0         
        //   29   51:getfield        #56  <Field char lastChar>
        //   30   54:bipush          59
        //   31   56:icmpne          5
        //   32   59:aload_0         
        //   33   60:iload_1         
        //   34   61:putfield        #50  <Field int charIndex>
        //   35   64:aload_0         
        //   36   65:bipush          59
        //   37   67:putfield        #56  <Field char lastChar>
        //   38   70:bipush          13
        //   39   72:ireturn         
        }

        private byte skipEntityForward()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #50  <Field int charIndex>
        //    2    4:aload_0         
        //    3    5:getfield        #42  <Field int length>
        //    4    8:icmpge          45
        //    5   11:aload_0         
        //    6   12:getfield        #33  <Field String text>
        //    7   15:astore_1        
        //    8   16:aload_0         
        //    9   17:getfield        #50  <Field int charIndex>
        //   10   20:istore_2        
        //   11   21:aload_0         
        //   12   22:iload_2         
        //   13   23:iconst_1        
        //   14   24:iadd            
        //   15   25:putfield        #50  <Field int charIndex>
        //   16   28:aload_1         
        //   17   29:iload_2         
        //   18   30:invokevirtual   #54  <Method char String.charAt(int)>
        //   19   33:istore_3        
        //   20   34:aload_0         
        //   21   35:iload_3         
        //   22   36:putfield        #56  <Field char lastChar>
        //   23   39:iload_3         
        //   24   40:bipush          59
        //   25   42:icmpne          0
        //   26   45:bipush          12
        //   27   47:ireturn         
        }

        private byte skipTagBackward()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #50  <Field int charIndex>
        //    2    4:istore_1        
        //    3    5:aload_0         
        //    4    6:getfield        #50  <Field int charIndex>
        //    5    9:ifle            59
        //    6   12:aload_0         
        //    7   13:getfield        #33  <Field String text>
        //    8   16:astore_2        
        //    9   17:iconst_m1       
        //   10   18:aload_0         
        //   11   19:getfield        #50  <Field int charIndex>
        //   12   22:iadd            
        //   13   23:istore_3        
        //   14   24:aload_0         
        //   15   25:iload_3         
        //   16   26:putfield        #50  <Field int charIndex>
        //   17   29:aload_0         
        //   18   30:aload_2         
        //   19   31:iload_3         
        //   20   32:invokevirtual   #54  <Method char String.charAt(int)>
        //   21   35:putfield        #56  <Field char lastChar>
        //   22   38:aload_0         
        //   23   39:getfield        #56  <Field char lastChar>
        //   24   42:bipush          60
        //   25   44:icmpne          50
        //   26   47:bipush          12
        //   27   49:ireturn         
        //   28   50:aload_0         
        //   29   51:getfield        #56  <Field char lastChar>
        //   30   54:bipush          62
        //   31   56:icmpne          73
        //   32   59:aload_0         
        //   33   60:iload_1         
        //   34   61:putfield        #50  <Field int charIndex>
        //   35   64:aload_0         
        //   36   65:bipush          62
        //   37   67:putfield        #56  <Field char lastChar>
        //   38   70:bipush          13
        //   39   72:ireturn         
        //   40   73:aload_0         
        //   41   74:getfield        #56  <Field char lastChar>
        //   42   77:bipush          34
        //   43   79:icmpeq          91
        //   44   82:aload_0         
        //   45   83:getfield        #56  <Field char lastChar>
        //   46   86:bipush          39
        //   47   88:icmpne          5
        //   48   91:aload_0         
        //   49   92:getfield        #56  <Field char lastChar>
        //   50   95:istore          4
        //   51   97:aload_0         
        //   52   98:getfield        #50  <Field int charIndex>
        //   53  101:ifle            5
        //   54  104:aload_0         
        //   55  105:getfield        #33  <Field String text>
        //   56  108:astore          5
        //   57  110:iconst_m1       
        //   58  111:aload_0         
        //   59  112:getfield        #50  <Field int charIndex>
        //   60  115:iadd            
        //   61  116:istore          6
        //   62  118:aload_0         
        //   63  119:iload           6
        //   64  121:putfield        #50  <Field int charIndex>
        //   65  124:aload           5
        //   66  126:iload           6
        //   67  128:invokevirtual   #54  <Method char String.charAt(int)>
        //   68  131:istore          7
        //   69  133:aload_0         
        //   70  134:iload           7
        //   71  136:putfield        #56  <Field char lastChar>
        //   72  139:iload           7
        //   73  141:iload           4
        //   74  143:icmpeq          5
        //   75  146:goto            97
        }

        private byte skipTagForward()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #50  <Field int charIndex>
        //    2    4:istore_1        
        //    3    5:aload_0         
        //    4    6:getfield        #50  <Field int charIndex>
        //    5    9:aload_0         
        //    6   10:getfield        #42  <Field int length>
        //    7   13:icmpge          134
        //    8   16:aload_0         
        //    9   17:getfield        #33  <Field String text>
        //   10   20:astore_2        
        //   11   21:aload_0         
        //   12   22:getfield        #50  <Field int charIndex>
        //   13   25:istore_3        
        //   14   26:aload_0         
        //   15   27:iload_3         
        //   16   28:iconst_1        
        //   17   29:iadd            
        //   18   30:putfield        #50  <Field int charIndex>
        //   19   33:aload_0         
        //   20   34:aload_2         
        //   21   35:iload_3         
        //   22   36:invokevirtual   #54  <Method char String.charAt(int)>
        //   23   39:putfield        #56  <Field char lastChar>
        //   24   42:aload_0         
        //   25   43:getfield        #56  <Field char lastChar>
        //   26   46:bipush          62
        //   27   48:icmpne          54
        //   28   51:bipush          12
        //   29   53:ireturn         
        //   30   54:aload_0         
        //   31   55:getfield        #56  <Field char lastChar>
        //   32   58:bipush          34
        //   33   60:icmpeq          72
        //   34   63:aload_0         
        //   35   64:getfield        #56  <Field char lastChar>
        //   36   67:bipush          39
        //   37   69:icmpne          5
        //   38   72:aload_0         
        //   39   73:getfield        #56  <Field char lastChar>
        //   40   76:istore          4
        //   41   78:aload_0         
        //   42   79:getfield        #50  <Field int charIndex>
        //   43   82:aload_0         
        //   44   83:getfield        #42  <Field int length>
        //   45   86:icmpge          5
        //   46   89:aload_0         
        //   47   90:getfield        #33  <Field String text>
        //   48   93:astore          5
        //   49   95:aload_0         
        //   50   96:getfield        #50  <Field int charIndex>
        //   51   99:istore          6
        //   52  101:aload_0         
        //   53  102:iload           6
        //   54  104:iconst_1        
        //   55  105:iadd            
        //   56  106:putfield        #50  <Field int charIndex>
        //   57  109:aload           5
        //   58  111:iload           6
        //   59  113:invokevirtual   #54  <Method char String.charAt(int)>
        //   60  116:istore          7
        //   61  118:aload_0         
        //   62  119:iload           7
        //   63  121:putfield        #56  <Field char lastChar>
        //   64  124:iload           7
        //   65  126:iload           4
        //   66  128:icmpeq          5
        //   67  131:goto            78
        //   68  134:aload_0         
        //   69  135:iload_1         
        //   70  136:putfield        #50  <Field int charIndex>
        //   71  139:aload_0         
        //   72  140:bipush          60
        //   73  142:putfield        #56  <Field char lastChar>
        //   74  145:bipush          13
        //   75  147:ireturn         
        }

        byte dirTypeBackward()
        {
        //    0    0:aload_0         
        //    1    1:aload_0         
        //    2    2:getfield        #33  <Field String text>
        //    3    5:iconst_m1       
        //    4    6:aload_0         
        //    5    7:getfield        #50  <Field int charIndex>
        //    6   10:iadd            
        //    7   11:invokevirtual   #54  <Method char String.charAt(int)>
        //    8   14:putfield        #56  <Field char lastChar>
        //    9   17:aload_0         
        //   10   18:getfield        #56  <Field char lastChar>
        //   11   21:invokestatic    #64  <Method boolean Character.isLowSurrogate(char)>
        //   12   24:ifeq            59
        //   13   27:aload_0         
        //   14   28:getfield        #33  <Field String text>
        //   15   31:aload_0         
        //   16   32:getfield        #50  <Field int charIndex>
        //   17   35:invokestatic    #68  <Method int Character.codePointBefore(CharSequence, int)>
        //   18   38:istore_2        
        //   19   39:aload_0         
        //   20   40:aload_0         
        //   21   41:getfield        #50  <Field int charIndex>
        //   22   44:iload_2         
        //   23   45:invokestatic    #72  <Method int Character.charCount(int)>
        //   24   48:isub            
        //   25   49:putfield        #50  <Field int charIndex>
        //   26   52:iload_2         
        //   27   53:invokestatic    #27  <Method byte Character.getDirectionality(int)>
        //   28   56:istore_1        
        //   29   57:iload_1         
        //   30   58:ireturn         
        //   31   59:aload_0         
        //   32   60:iconst_m1       
        //   33   61:aload_0         
        //   34   62:getfield        #50  <Field int charIndex>
        //   35   65:iadd            
        //   36   66:putfield        #50  <Field int charIndex>
        //   37   69:aload_0         
        //   38   70:getfield        #56  <Field char lastChar>
        //   39   73:invokestatic    #74  <Method byte getCachedDirectionality(char)>
        //   40   76:istore_1        
        //   41   77:aload_0         
        //   42   78:getfield        #35  <Field boolean isHtml>
        //   43   81:ifeq            57
        //   44   84:aload_0         
        //   45   85:getfield        #56  <Field char lastChar>
        //   46   88:bipush          62
        //   47   90:icmpne          98
        //   48   93:aload_0         
        //   49   94:invokespecial   #76  <Method byte skipTagBackward()>
        //   50   97:ireturn         
        //   51   98:aload_0         
        //   52   99:getfield        #56  <Field char lastChar>
        //   53  102:bipush          59
        //   54  104:icmpne          57
        //   55  107:aload_0         
        //   56  108:invokespecial   #78  <Method byte skipEntityBackward()>
        //   57  111:ireturn         
        }

        byte dirTypeForward()
        {
        //    0    0:aload_0         
        //    1    1:aload_0         
        //    2    2:getfield        #33  <Field String text>
        //    3    5:aload_0         
        //    4    6:getfield        #50  <Field int charIndex>
        //    5    9:invokevirtual   #54  <Method char String.charAt(int)>
        //    6   12:putfield        #56  <Field char lastChar>
        //    7   15:aload_0         
        //    8   16:getfield        #56  <Field char lastChar>
        //    9   19:invokestatic    #82  <Method boolean Character.isHighSurrogate(char)>
        //   10   22:ifeq            57
        //   11   25:aload_0         
        //   12   26:getfield        #33  <Field String text>
        //   13   29:aload_0         
        //   14   30:getfield        #50  <Field int charIndex>
        //   15   33:invokestatic    #85  <Method int Character.codePointAt(CharSequence, int)>
        //   16   36:istore_2        
        //   17   37:aload_0         
        //   18   38:aload_0         
        //   19   39:getfield        #50  <Field int charIndex>
        //   20   42:iload_2         
        //   21   43:invokestatic    #72  <Method int Character.charCount(int)>
        //   22   46:iadd            
        //   23   47:putfield        #50  <Field int charIndex>
        //   24   50:iload_2         
        //   25   51:invokestatic    #27  <Method byte Character.getDirectionality(int)>
        //   26   54:istore_1        
        //   27   55:iload_1         
        //   28   56:ireturn         
        //   29   57:aload_0         
        //   30   58:iconst_1        
        //   31   59:aload_0         
        //   32   60:getfield        #50  <Field int charIndex>
        //   33   63:iadd            
        //   34   64:putfield        #50  <Field int charIndex>
        //   35   67:aload_0         
        //   36   68:getfield        #56  <Field char lastChar>
        //   37   71:invokestatic    #74  <Method byte getCachedDirectionality(char)>
        //   38   74:istore_1        
        //   39   75:aload_0         
        //   40   76:getfield        #35  <Field boolean isHtml>
        //   41   79:ifeq            55
        //   42   82:aload_0         
        //   43   83:getfield        #56  <Field char lastChar>
        //   44   86:bipush          60
        //   45   88:icmpne          96
        //   46   91:aload_0         
        //   47   92:invokespecial   #87  <Method byte skipTagForward()>
        //   48   95:ireturn         
        //   49   96:aload_0         
        //   50   97:getfield        #56  <Field char lastChar>
        //   51  100:bipush          38
        //   52  102:icmpne          55
        //   53  105:aload_0         
        //   54  106:invokespecial   #89  <Method byte skipEntityForward()>
        //   55  109:ireturn         
        }

        int getEntryDir()
        {
        //    0    0:aload_0         
        //    1    1:iconst_0        
        //    2    2:putfield        #50  <Field int charIndex>
        //    3    5:iconst_0        
        //    4    6:istore_1        
        //    5    7:iconst_0        
        //    6    8:istore_2        
        //    7    9:iconst_0        
        //    8   10:istore_3        
        //    9   11:aload_0         
        //   10   12:getfield        #50  <Field int charIndex>
        //   11   15:aload_0         
        //   12   16:getfield        #42  <Field int length>
        //   13   19:icmpge          173
        //   14   22:iload_3         
        //   15   23:ifne            173
        //   16   26:aload_0         
        //   17   27:invokevirtual   #92  <Method byte dirTypeForward()>
        //   18   30:tableswitch     0 18: default 120
        //                       0 149
        //                       1 162
        //                       2 162
        //                       3 120
        //                       4 120
        //                       5 120
        //                       6 120
        //                       7 120
        //                       8 120
        //                       9 11
        //                       10 120
        //                       11 120
        //                       12 120
        //                       13 120
        //                       14 125
        //                       15 125
        //                       16 133
        //                       17 133
        //                       18 141
        //   19  120:iload_1         
        //   20  121:istore_3        
        //   21  122:goto            11
        //   22  125:iinc            1  1
        //   23  128:iconst_m1       
        //   24  129:istore_2        
        //   25  130:goto            11
        //   26  133:iinc            1  1
        //   27  136:iconst_1        
        //   28  137:istore_2        
        //   29  138:goto            11
        //   30  141:iinc            1  -1
        //   31  144:iconst_0        
        //   32  145:istore_2        
        //   33  146:goto            11
        //   34  149:iload_1         
        //   35  150:ifne            157
        //   36  153:iconst_m1       
        //   37  154:istore_2        
        //   38  155:iload_2         
        //   39  156:ireturn         
        //   40  157:iload_1         
        //   41  158:istore_3        
        //   42  159:goto            11
        //   43  162:iload_1         
        //   44  163:ifne            168
        //   45  166:iconst_1        
        //   46  167:ireturn         
        //   47  168:iload_1         
        //   48  169:istore_3        
        //   49  170:goto            11
        //   50  173:iload_3         
        //   51  174:ifne            179
        //   52  177:iconst_0        
        //   53  178:ireturn         
        //   54  179:iload_2         
        //   55  180:ifne            155
        //   56  183:aload_0         
        //   57  184:getfield        #50  <Field int charIndex>
        //   58  187:ifle            263
        //   59  190:aload_0         
        //   60  191:invokevirtual   #94  <Method byte dirTypeBackward()>
        //   61  194:tableswitch     14 18: default 228
        //                       14 231
        //                       15 231
        //                       16 244
        //                       17 244
        //                       18 257
        //   62  228:goto            183
        //   63  231:iload_3         
        //   64  232:iload_1         
        //   65  233:icmpne          238
        //   66  236:iconst_m1       
        //   67  237:ireturn         
        //   68  238:iinc            1  -1
        //   69  241:goto            183
        //   70  244:iload_3         
        //   71  245:iload_1         
        //   72  246:icmpne          251
        //   73  249:iconst_1        
        //   74  250:ireturn         
        //   75  251:iinc            1  -1
        //   76  254:goto            183
        //   77  257:iinc            1  1
        //   78  260:goto            183
        //   79  263:iconst_0        
        //   80  264:ireturn         
        }

        int getExitDir()
        {
        //    0    0:aload_0         
        //    1    1:aload_0         
        //    2    2:getfield        #42  <Field int length>
        //    3    5:putfield        #50  <Field int charIndex>
        //    4    8:iconst_0        
        //    5    9:istore_1        
        //    6   10:iconst_0        
        //    7   11:istore_2        
        //    8   12:aload_0         
        //    9   13:getfield        #50  <Field int charIndex>
        //   10   16:ifle            181
        //   11   19:aload_0         
        //   12   20:invokevirtual   #94  <Method byte dirTypeBackward()>
        //   13   23:tableswitch     0 18: default 112
        //                       0 121
        //                       1 147
        //                       2 147
        //                       3 112
        //                       4 112
        //                       5 112
        //                       6 112
        //                       7 112
        //                       8 112
        //                       9 12
        //                       10 112
        //                       11 112
        //                       12 112
        //                       13 112
        //                       14 136
        //                       15 136
        //                       16 162
        //                       17 162
        //                       18 175
        //   14  112:iload_2         
        //   15  113:ifne            12
        //   16  116:iload_1         
        //   17  117:istore_2        
        //   18  118:goto            12
        //   19  121:iload_1         
        //   20  122:ifne            127
        //   21  125:iconst_m1       
        //   22  126:ireturn         
        //   23  127:iload_2         
        //   24  128:ifne            12
        //   25  131:iload_1         
        //   26  132:istore_2        
        //   27  133:goto            12
        //   28  136:iload_2         
        //   29  137:iload_1         
        //   30  138:icmpeq          125
        //   31  141:iinc            1  -1
        //   32  144:goto            12
        //   33  147:iload_1         
        //   34  148:ifne            153
        //   35  151:iconst_1        
        //   36  152:ireturn         
        //   37  153:iload_2         
        //   38  154:ifne            12
        //   39  157:iload_1         
        //   40  158:istore_2        
        //   41  159:goto            12
        //   42  162:iload_2         
        //   43  163:iload_1         
        //   44  164:icmpne          169
        //   45  167:iconst_1        
        //   46  168:ireturn         
        //   47  169:iinc            1  -1
        //   48  172:goto            12
        //   49  175:iinc            1  1
        //   50  178:goto            12
        //   51  181:iconst_0        
        //   52  182:ireturn         
        }

        private static final byte DIR_TYPE_CACHE[];
        private static final int DIR_TYPE_CACHE_SIZE = 1792;
        private int charIndex;
        private final boolean isHtml;
        private char lastChar;
        private final int length;
        private final String text;
    }


    static 
    {
    //    0    0:getstatic       #47  <Field TextDirectionHeuristicCompat TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR>
    //    1    3:putstatic       #49  <Field TextDirectionHeuristicCompat DEFAULT_TEXT_DIRECTION_HEURISTIC>
    //    2    6:sipush          8206
    //    3    9:invokestatic    #55  <Method String Character.toString(char)>
    //    4   12:putstatic       #57  <Field String LRM_STRING>
    //    5   15:sipush          8207
    //    6   18:invokestatic    #55  <Method String Character.toString(char)>
    //    7   21:putstatic       #59  <Field String RLM_STRING>
    //    8   24:new             #2   <Class BidiFormatter>
    //    9   27:dup             
    //   10   28:iconst_0        
    //   11   29:iconst_2        
    //   12   30:getstatic       #49  <Field TextDirectionHeuristicCompat DEFAULT_TEXT_DIRECTION_HEURISTIC>
    //   13   33:invokespecial   #63  <Method void BidiFormatter(boolean, int, TextDirectionHeuristicCompat)>
    //   14   36:putstatic       #65  <Field BidiFormatter DEFAULT_LTR_INSTANCE>
    //   15   39:new             #2   <Class BidiFormatter>
    //   16   42:dup             
    //   17   43:iconst_1        
    //   18   44:iconst_2        
    //   19   45:getstatic       #49  <Field TextDirectionHeuristicCompat DEFAULT_TEXT_DIRECTION_HEURISTIC>
    //   20   48:invokespecial   #63  <Method void BidiFormatter(boolean, int, TextDirectionHeuristicCompat)>
    //   21   51:putstatic       #67  <Field BidiFormatter DEFAULT_RTL_INSTANCE>
    //   22   54:return          
    }

    private BidiFormatter(boolean flag, int i, TextDirectionHeuristicCompat textdirectionheuristiccompat)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #69  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:iload_1         
    //    4    6:putfield        #71  <Field boolean mIsRtlContext>
    //    5    9:aload_0         
    //    6   10:iload_2         
    //    7   11:putfield        #73  <Field int mFlags>
    //    8   14:aload_0         
    //    9   15:aload_3         
    //   10   16:putfield        #75  <Field TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat>
    //   11   19:return          
    }

    BidiFormatter(boolean flag, int i, TextDirectionHeuristicCompat textdirectionheuristiccompat, _cls1 _pcls1)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:iload_2         
    //    3    3:aload_3         
    //    4    4:invokespecial   #63  <Method void BidiFormatter(boolean, int, TextDirectionHeuristicCompat)>
    //    5    7:return          
    }

    static boolean access$000(Locale locale)
    {
    //    0    0:aload_0         
    //    1    1:invokestatic    #81  <Method boolean isRtlLocale(Locale)>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:invokestatic    #81  <Method boolean isRtlLocale(Locale)>
    //    5    4:ireturn         
    }

    static TextDirectionHeuristicCompat access$100()
    {
    //    0    0:getstatic       #49  <Field TextDirectionHeuristicCompat DEFAULT_TEXT_DIRECTION_HEURISTIC>
    //    1    3:areturn         
// Previous instruction length mismatch
    //    2    0:getstatic       #49  <Field TextDirectionHeuristicCompat DEFAULT_TEXT_DIRECTION_HEURISTIC>
    //    3    3:areturn         
    }

    static BidiFormatter access$200()
    {
    //    0    0:getstatic       #67  <Field BidiFormatter DEFAULT_RTL_INSTANCE>
    //    1    3:areturn         
// Previous instruction length mismatch
    //    2    0:getstatic       #67  <Field BidiFormatter DEFAULT_RTL_INSTANCE>
    //    3    3:areturn         
    }

    static BidiFormatter access$300()
    {
    //    0    0:getstatic       #65  <Field BidiFormatter DEFAULT_LTR_INSTANCE>
    //    1    3:areturn         
// Previous instruction length mismatch
    //    2    0:getstatic       #65  <Field BidiFormatter DEFAULT_LTR_INSTANCE>
    //    3    3:areturn         
    }

    private static int getEntryDir(String s)
    {
    //    0    0:new             #90  <Class BidiFormatter$DirectionalityEstimator>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:iconst_0        
    //    4    6:invokespecial   #93  <Method void BidiFormatter$DirectionalityEstimator(String, boolean)>
    //    5    9:invokevirtual   #96  <Method int BidiFormatter$DirectionalityEstimator.getEntryDir()>
    //    6   12:ireturn         
    }

    private static int getExitDir(String s)
    {
    //    0    0:new             #90  <Class BidiFormatter$DirectionalityEstimator>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:iconst_0        
    //    4    6:invokespecial   #93  <Method void BidiFormatter$DirectionalityEstimator(String, boolean)>
    //    5    9:invokevirtual   #99  <Method int BidiFormatter$DirectionalityEstimator.getExitDir()>
    //    6   12:ireturn         
    }

    public static BidiFormatter getInstance()
    {
    //    0    0:new             #102 <Class BidiFormatter$Builder>
    //    1    3:dup             
    //    2    4:invokespecial   #103 <Method void BidiFormatter$Builder()>
    //    3    7:invokevirtual   #106 <Method BidiFormatter BidiFormatter$Builder.build()>
    //    4   10:areturn         
    }

    public static BidiFormatter getInstance(Locale locale)
    {
    //    0    0:new             #102 <Class BidiFormatter$Builder>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #110 <Method void BidiFormatter$Builder(Locale)>
    //    4    8:invokevirtual   #106 <Method BidiFormatter BidiFormatter$Builder.build()>
    //    5   11:areturn         
    }

    public static BidiFormatter getInstance(boolean flag)
    {
    //    0    0:new             #102 <Class BidiFormatter$Builder>
    //    1    3:dup             
    //    2    4:iload_0         
    //    3    5:invokespecial   #114 <Method void BidiFormatter$Builder(boolean)>
    //    4    8:invokevirtual   #106 <Method BidiFormatter BidiFormatter$Builder.build()>
    //    5   11:areturn         
    }

    private static boolean isRtlLocale(Locale locale)
    {
    //    0    0:aload_0         
    //    1    1:invokestatic    #120 <Method int TextUtilsCompat.getLayoutDirectionFromLocale(Locale)>
    //    2    4:iconst_1        
    //    3    5:icmpne          10
    //    4    8:iconst_1        
    //    5    9:ireturn         
    //    6   10:iconst_0        
    //    7   11:ireturn         
    }

    private String markAfter(String s, TextDirectionHeuristicCompat textdirectionheuristiccompat)
    {
    //    0    0:aload_2         
    //    1    1:aload_1         
    //    2    2:iconst_0        
    //    3    3:aload_1         
    //    4    4:invokevirtual   #127 <Method int String.length()>
    //    5    7:invokeinterface #133 <Method boolean TextDirectionHeuristicCompat.isRtl(CharSequence, int, int)>
    //    6   12:istore_3        
    //    7   13:aload_0         
    //    8   14:getfield        #71  <Field boolean mIsRtlContext>
    //    9   17:ifne            36
    //   10   20:iload_3         
    //   11   21:ifne            32
    //   12   24:aload_1         
    //   13   25:invokestatic    #135 <Method int getExitDir(String)>
    //   14   28:iconst_1        
    //   15   29:icmpne          36
    //   16   32:getstatic       #57  <Field String LRM_STRING>
    //   17   35:areturn         
    //   18   36:aload_0         
    //   19   37:getfield        #71  <Field boolean mIsRtlContext>
    //   20   40:ifeq            59
    //   21   43:iload_3         
    //   22   44:ifeq            55
    //   23   47:aload_1         
    //   24   48:invokestatic    #135 <Method int getExitDir(String)>
    //   25   51:iconst_m1       
    //   26   52:icmpne          59
    //   27   55:getstatic       #59  <Field String RLM_STRING>
    //   28   58:areturn         
    //   29   59:ldc1            #22  <String "">
    //   30   61:areturn         
    }

    private String markBefore(String s, TextDirectionHeuristicCompat textdirectionheuristiccompat)
    {
    //    0    0:aload_2         
    //    1    1:aload_1         
    //    2    2:iconst_0        
    //    3    3:aload_1         
    //    4    4:invokevirtual   #127 <Method int String.length()>
    //    5    7:invokeinterface #133 <Method boolean TextDirectionHeuristicCompat.isRtl(CharSequence, int, int)>
    //    6   12:istore_3        
    //    7   13:aload_0         
    //    8   14:getfield        #71  <Field boolean mIsRtlContext>
    //    9   17:ifne            36
    //   10   20:iload_3         
    //   11   21:ifne            32
    //   12   24:aload_1         
    //   13   25:invokestatic    #138 <Method int getEntryDir(String)>
    //   14   28:iconst_1        
    //   15   29:icmpne          36
    //   16   32:getstatic       #57  <Field String LRM_STRING>
    //   17   35:areturn         
    //   18   36:aload_0         
    //   19   37:getfield        #71  <Field boolean mIsRtlContext>
    //   20   40:ifeq            59
    //   21   43:iload_3         
    //   22   44:ifeq            55
    //   23   47:aload_1         
    //   24   48:invokestatic    #138 <Method int getEntryDir(String)>
    //   25   51:iconst_m1       
    //   26   52:icmpne          59
    //   27   55:getstatic       #59  <Field String RLM_STRING>
    //   28   58:areturn         
    //   29   59:ldc1            #22  <String "">
    //   30   61:areturn         
    }

    public boolean getStereoReset()
    {
    //    0    0:iconst_2        
    //    1    1:aload_0         
    //    2    2:getfield        #73  <Field int mFlags>
    //    3    5:iand            
    //    4    6:ifeq            11
    //    5    9:iconst_1        
    //    6   10:ireturn         
    //    7   11:iconst_0        
    //    8   12:ireturn         
    }

    public boolean isRtl(String s)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #75  <Field TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat>
    //    2    4:aload_1         
    //    3    5:iconst_0        
    //    4    6:aload_1         
    //    5    7:invokevirtual   #127 <Method int String.length()>
    //    6   10:invokeinterface #133 <Method boolean TextDirectionHeuristicCompat.isRtl(CharSequence, int, int)>
    //    7   15:ireturn         
    }

    public boolean isRtlContext()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #71  <Field boolean mIsRtlContext>
    //    2    4:ireturn         
    }

    public String unicodeWrap(String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_0         
    //    3    3:getfield        #75  <Field TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat>
    //    4    6:iconst_1        
    //    5    7:invokevirtual   #147 <Method String unicodeWrap(String, TextDirectionHeuristicCompat, boolean)>
    //    6   10:areturn         
    }

    public String unicodeWrap(String s, TextDirectionHeuristicCompat textdirectionheuristiccompat)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iconst_1        
    //    4    4:invokevirtual   #147 <Method String unicodeWrap(String, TextDirectionHeuristicCompat, boolean)>
    //    5    7:areturn         
    }

    public String unicodeWrap(String s, TextDirectionHeuristicCompat textdirectionheuristiccompat, boolean flag)
    {
    //    0    0:aload_2         
    //    1    1:aload_1         
    //    2    2:iconst_0        
    //    3    3:aload_1         
    //    4    4:invokevirtual   #127 <Method int String.length()>
    //    5    7:invokeinterface #133 <Method boolean TextDirectionHeuristicCompat.isRtl(CharSequence, int, int)>
    //    6   12:istore          4
    //    7   14:new             #149 <Class StringBuilder>
    //    8   17:dup             
    //    9   18:invokespecial   #150 <Method void StringBuilder()>
    //   10   21:astore          5
    //   11   23:aload_0         
    //   12   24:invokevirtual   #152 <Method boolean getStereoReset()>
    //   13   27:ifeq            57
    //   14   30:iload_3         
    //   15   31:ifeq            57
    //   16   34:iload           4
    //   17   36:ifeq            133
    //   18   39:getstatic       #155 <Field TextDirectionHeuristicCompat TextDirectionHeuristicsCompat.RTL>
    //   19   42:astore          13
    //   20   44:aload           5
    //   21   46:aload_0         
    //   22   47:aload_1         
    //   23   48:aload           13
    //   24   50:invokespecial   #157 <Method String markBefore(String, TextDirectionHeuristicCompat)>
    //   25   53:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
    //   26   56:pop             
    //   27   57:iload           4
    //   28   59:aload_0         
    //   29   60:getfield        #71  <Field boolean mIsRtlContext>
    //   30   63:icmpeq          149
    //   31   66:iload           4
    //   32   68:ifeq            141
    //   33   71:sipush          8235
    //   34   74:istore          9
    //   35   76:aload           5
    //   36   78:iload           9
    //   37   80:invokevirtual   #164 <Method StringBuilder StringBuilder.append(char)>
    //   38   83:pop             
    //   39   84:aload           5
    //   40   86:aload_1         
    //   41   87:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
    //   42   90:pop             
    //   43   91:aload           5
    //   44   93:sipush          8236
    //   45   96:invokevirtual   #164 <Method StringBuilder StringBuilder.append(char)>
    //   46   99:pop             
    //   47  100:iload_3         
    //   48  101:ifeq            127
    //   49  104:iload           4
    //   50  106:ifeq            159
    //   51  109:getstatic       #155 <Field TextDirectionHeuristicCompat TextDirectionHeuristicsCompat.RTL>
    //   52  112:astore          7
    //   53  114:aload           5
    //   54  116:aload_0         
    //   55  117:aload_1         
    //   56  118:aload           7
    //   57  120:invokespecial   #166 <Method String markAfter(String, TextDirectionHeuristicCompat)>
    //   58  123:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
    //   59  126:pop             
    //   60  127:aload           5
    //   61  129:invokevirtual   #169 <Method String StringBuilder.toString()>
    //   62  132:areturn         
    //   63  133:getstatic       #172 <Field TextDirectionHeuristicCompat TextDirectionHeuristicsCompat.LTR>
    //   64  136:astore          13
    //   65  138:goto            44
    //   66  141:sipush          8234
    //   67  144:istore          9
    //   68  146:goto            76
    //   69  149:aload           5
    //   70  151:aload_1         
    //   71  152:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
    //   72  155:pop             
    //   73  156:goto            100
    //   74  159:getstatic       #172 <Field TextDirectionHeuristicCompat TextDirectionHeuristicsCompat.LTR>
    //   75  162:astore          7
    //   76  164:goto            114
    }

    public String unicodeWrap(String s, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_0         
    //    3    3:getfield        #75  <Field TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat>
    //    4    6:iload_2         
    //    5    7:invokevirtual   #147 <Method String unicodeWrap(String, TextDirectionHeuristicCompat, boolean)>
    //    6   10:areturn         
    }

    private static final int DEFAULT_FLAGS = 2;
    private static final BidiFormatter DEFAULT_LTR_INSTANCE;
    private static final BidiFormatter DEFAULT_RTL_INSTANCE;
    private static TextDirectionHeuristicCompat DEFAULT_TEXT_DIRECTION_HEURISTIC;
    private static final int DIR_LTR = -1;
    private static final int DIR_RTL = 1;
    private static final int DIR_UNKNOWN = 0;
    private static final String EMPTY_STRING = "";
    private static final int FLAG_STEREO_RESET = 2;
    private static final char LRE = 8234;
    private static final char LRM = 8206;
    private static final String LRM_STRING;
    private static final char PDF = 8236;
    private static final char RLE = 8235;
    private static final char RLM = 8207;
    private static final String RLM_STRING;
    private final TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat;
    private final int mFlags;
    private final boolean mIsRtlContext;

    static boolean access$000(Locale locale)
    {
    //    0    0:aload_0         
    //    1    1:invokestatic    #81  <Method boolean isRtlLocale(Locale)>
    //    2    4:ireturn         
    }

    static TextDirectionHeuristicCompat access$100()
    {
    //    0    0:getstatic       #49  <Field TextDirectionHeuristicCompat DEFAULT_TEXT_DIRECTION_HEURISTIC>
    //    1    3:areturn         
    }

    static BidiFormatter access$200()
    {
    //    0    0:getstatic       #67  <Field BidiFormatter DEFAULT_RTL_INSTANCE>
    //    1    3:areturn         
    }

    static BidiFormatter access$300()
    {
    //    0    0:getstatic       #65  <Field BidiFormatter DEFAULT_LTR_INSTANCE>
    //    1    3:areturn         
    }

    // Unreferenced inner class android/support/v4/text/BidiFormatter$1

/* anonymous class */
    static class _cls1
    {
    }

}
