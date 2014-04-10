// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            ShareCompatICS, ShareCompatJB

public class ShareCompat
{
    public static class IntentBuilder
    {

        private IntentBuilder(Activity activity)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #22  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:putfield        #24  <Field Activity mActivity>
        //    5    9:aload_0         
        //    6   10:new             #26  <Class Intent>
        //    7   13:dup             
        //    8   14:invokespecial   #27  <Method void Intent()>
        //    9   17:ldc1            #29  <String "android.intent.action.SEND">
        //   10   19:invokevirtual   #33  <Method Intent Intent.setAction(String)>
        //   11   22:putfield        #35  <Field Intent mIntent>
        //   12   25:aload_0         
        //   13   26:getfield        #35  <Field Intent mIntent>
        //   14   29:ldc1            #37  <String "android.support.v4.app.EXTRA_CALLING_PACKAGE">
        //   15   31:aload_1         
        //   16   32:invokevirtual   #43  <Method String Activity.getPackageName()>
        //   17   35:invokevirtual   #47  <Method Intent Intent.putExtra(String, String)>
        //   18   38:pop             
        //   19   39:aload_0         
        //   20   40:getfield        #35  <Field Intent mIntent>
        //   21   43:ldc1            #49  <String "android.support.v4.app.EXTRA_CALLING_ACTIVITY">
        //   22   45:aload_1         
        //   23   46:invokevirtual   #53  <Method ComponentName Activity.getComponentName()>
        //   24   49:invokevirtual   #56  <Method Intent Intent.putExtra(String, Parcelable)>
        //   25   52:pop             
        //   26   53:aload_0         
        //   27   54:getfield        #35  <Field Intent mIntent>
        //   28   57:ldc1            #57  <Int 0x80000>
        //   29   59:invokevirtual   #61  <Method Intent Intent.addFlags(int)>
        //   30   62:pop             
        //   31   63:return          
        }

        private void combineArrayExtra(String s, ArrayList arraylist)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #35  <Field Intent mIntent>
        //    2    4:aload_1         
        //    3    5:invokevirtual   #67  <Method String[] Intent.getStringArrayExtra(String)>
        //    4    8:astore_3        
        //    5    9:aload_3         
        //    6   10:ifnull          65
        //    7   13:aload_3         
        //    8   14:arraylength     
        //    9   15:istore          4
        //   10   17:iload           4
        //   11   19:aload_2         
        //   12   20:invokevirtual   #73  <Method int ArrayList.size()>
        //   13   23:iadd            
        //   14   24:anewarray       String[]
        //   15   27:astore          5
        //   16   29:aload_2         
        //   17   30:aload           5
        //   18   32:invokevirtual   #79  <Method Object[] ArrayList.toArray(Object[])>
        //   19   35:pop             
        //   20   36:aload_3         
        //   21   37:ifnull          53
        //   22   40:aload_3         
        //   23   41:iconst_0        
        //   24   42:aload           5
        //   25   44:aload_2         
        //   26   45:invokevirtual   #73  <Method int ArrayList.size()>
        //   27   48:iload           4
        //   28   50:invokestatic    #85  <Method void System.arraycopy(Object, int, Object, int, int)>
        //   29   53:aload_0         
        //   30   54:getfield        #35  <Field Intent mIntent>
        //   31   57:aload_1         
        //   32   58:aload           5
        //   33   60:invokevirtual   #88  <Method Intent Intent.putExtra(String, String[])>
        //   34   63:pop             
        //   35   64:return          
        //   36   65:iconst_0        
        //   37   66:istore          4
        //   38   68:goto            17
        }

        private void combineArrayExtra(String s, String as[])
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #93  <Method Intent getIntent()>
        //    2    4:astore_3        
        //    3    5:aload_3         
        //    4    6:aload_1         
        //    5    7:invokevirtual   #67  <Method String[] Intent.getStringArrayExtra(String)>
        //    6   10:astore          4
        //    7   12:aload           4
        //    8   14:ifnull          68
        //    9   17:aload           4
        //   10   19:arraylength     
        //   11   20:istore          5
        //   12   22:iload           5
        //   13   24:aload_2         
        //   14   25:arraylength     
        //   15   26:iadd            
        //   16   27:anewarray       String[]
        //   17   30:astore          6
        //   18   32:aload           4
        //   19   34:ifnull          48
        //   20   37:aload           4
        //   21   39:iconst_0        
        //   22   40:aload           6
        //   23   42:iconst_0        
        //   24   43:iload           5
        //   25   45:invokestatic    #85  <Method void System.arraycopy(Object, int, Object, int, int)>
        //   26   48:aload_2         
        //   27   49:iconst_0        
        //   28   50:aload           6
        //   29   52:iload           5
        //   30   54:aload_2         
        //   31   55:arraylength     
        //   32   56:invokestatic    #85  <Method void System.arraycopy(Object, int, Object, int, int)>
        //   33   59:aload_3         
        //   34   60:aload_1         
        //   35   61:aload           6
        //   36   63:invokevirtual   #88  <Method Intent Intent.putExtra(String, String[])>
        //   37   66:pop             
        //   38   67:return          
        //   39   68:iconst_0        
        //   40   69:istore          5
        //   41   71:goto            22
        }

        public static IntentBuilder from(Activity activity)
        {
        //    0    0:new             #2   <Class ShareCompat$IntentBuilder>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:invokespecial   #97  <Method void ShareCompat$IntentBuilder(Activity)>
        //    4    8:areturn         
        }

        public IntentBuilder addEmailBcc(String s)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #101 <Field ArrayList mBccAddresses>
        //    2    4:ifnonnull       18
        //    3    7:aload_0         
        //    4    8:new             #69  <Class ArrayList>
        //    5   11:dup             
        //    6   12:invokespecial   #102 <Method void ArrayList()>
        //    7   15:putfield        #101 <Field ArrayList mBccAddresses>
        //    8   18:aload_0         
        //    9   19:getfield        #101 <Field ArrayList mBccAddresses>
        //   10   22:aload_1         
        //   11   23:invokevirtual   #106 <Method boolean ArrayList.add(Object)>
        //   12   26:pop             
        //   13   27:aload_0         
        //   14   28:areturn         
        }

        public IntentBuilder addEmailBcc(String as[])
        {
        //    0    0:aload_0         
        //    1    1:ldc1            #109 <String "android.intent.extra.BCC">
        //    2    3:aload_1         
        //    3    4:invokespecial   #111 <Method void combineArrayExtra(String, String[])>
        //    4    7:aload_0         
        //    5    8:areturn         
        }

        public IntentBuilder addEmailCc(String s)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #114 <Field ArrayList mCcAddresses>
        //    2    4:ifnonnull       18
        //    3    7:aload_0         
        //    4    8:new             #69  <Class ArrayList>
        //    5   11:dup             
        //    6   12:invokespecial   #102 <Method void ArrayList()>
        //    7   15:putfield        #114 <Field ArrayList mCcAddresses>
        //    8   18:aload_0         
        //    9   19:getfield        #114 <Field ArrayList mCcAddresses>
        //   10   22:aload_1         
        //   11   23:invokevirtual   #106 <Method boolean ArrayList.add(Object)>
        //   12   26:pop             
        //   13   27:aload_0         
        //   14   28:areturn         
        }

        public IntentBuilder addEmailCc(String as[])
        {
        //    0    0:aload_0         
        //    1    1:ldc1            #116 <String "android.intent.extra.CC">
        //    2    3:aload_1         
        //    3    4:invokespecial   #111 <Method void combineArrayExtra(String, String[])>
        //    4    7:aload_0         
        //    5    8:areturn         
        }

        public IntentBuilder addEmailTo(String s)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #119 <Field ArrayList mToAddresses>
        //    2    4:ifnonnull       18
        //    3    7:aload_0         
        //    4    8:new             #69  <Class ArrayList>
        //    5   11:dup             
        //    6   12:invokespecial   #102 <Method void ArrayList()>
        //    7   15:putfield        #119 <Field ArrayList mToAddresses>
        //    8   18:aload_0         
        //    9   19:getfield        #119 <Field ArrayList mToAddresses>
        //   10   22:aload_1         
        //   11   23:invokevirtual   #106 <Method boolean ArrayList.add(Object)>
        //   12   26:pop             
        //   13   27:aload_0         
        //   14   28:areturn         
        }

        public IntentBuilder addEmailTo(String as[])
        {
        //    0    0:aload_0         
        //    1    1:ldc1            #121 <String "android.intent.extra.EMAIL">
        //    2    3:aload_1         
        //    3    4:invokespecial   #111 <Method void combineArrayExtra(String, String[])>
        //    4    7:aload_0         
        //    5    8:areturn         
        }

        public IntentBuilder addStream(Uri uri)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #35  <Field Intent mIntent>
        //    2    4:ldc1            #125 <String "android.intent.extra.STREAM">
        //    3    6:invokevirtual   #129 <Method Parcelable Intent.getParcelableExtra(String)>
        //    4    9:checkcast       #131 <Class Uri>
        //    5   12:astore_2        
        //    6   13:aload_2         
        //    7   14:ifnonnull       23
        //    8   17:aload_0         
        //    9   18:aload_1         
        //   10   19:invokevirtual   #134 <Method ShareCompat$IntentBuilder setStream(Uri)>
        //   11   22:areturn         
        //   12   23:aload_0         
        //   13   24:getfield        #136 <Field ArrayList mStreams>
        //   14   27:ifnonnull       41
        //   15   30:aload_0         
        //   16   31:new             #69  <Class ArrayList>
        //   17   34:dup             
        //   18   35:invokespecial   #102 <Method void ArrayList()>
        //   19   38:putfield        #136 <Field ArrayList mStreams>
        //   20   41:aload_2         
        //   21   42:ifnull          63
        //   22   45:aload_0         
        //   23   46:getfield        #35  <Field Intent mIntent>
        //   24   49:ldc1            #125 <String "android.intent.extra.STREAM">
        //   25   51:invokevirtual   #140 <Method void Intent.removeExtra(String)>
        //   26   54:aload_0         
        //   27   55:getfield        #136 <Field ArrayList mStreams>
        //   28   58:aload_2         
        //   29   59:invokevirtual   #106 <Method boolean ArrayList.add(Object)>
        //   30   62:pop             
        //   31   63:aload_0         
        //   32   64:getfield        #136 <Field ArrayList mStreams>
        //   33   67:aload_1         
        //   34   68:invokevirtual   #106 <Method boolean ArrayList.add(Object)>
        //   35   71:pop             
        //   36   72:aload_0         
        //   37   73:areturn         
        }

        public Intent createChooserIntent()
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #93  <Method Intent getIntent()>
        //    2    4:aload_0         
        //    3    5:getfield        #143 <Field CharSequence mChooserTitle>
        //    4    8:invokestatic    #147 <Method Intent Intent.createChooser(Intent, CharSequence)>
        //    5   11:areturn         
        }

        Activity getActivity()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #24  <Field Activity mActivity>
        //    2    4:areturn         
        }

        public Intent getIntent()
        {
        //    0    0:iconst_1        
        //    1    1:istore_1        
        //    2    2:aload_0         
        //    3    3:getfield        #119 <Field ArrayList mToAddresses>
        //    4    6:ifnull          24
        //    5    9:aload_0         
        //    6   10:ldc1            #121 <String "android.intent.extra.EMAIL">
        //    7   12:aload_0         
        //    8   13:getfield        #119 <Field ArrayList mToAddresses>
        //    9   16:invokespecial   #151 <Method void combineArrayExtra(String, ArrayList)>
        //   10   19:aload_0         
        //   11   20:aconst_null     
        //   12   21:putfield        #119 <Field ArrayList mToAddresses>
        //   13   24:aload_0         
        //   14   25:getfield        #114 <Field ArrayList mCcAddresses>
        //   15   28:ifnull          46
        //   16   31:aload_0         
        //   17   32:ldc1            #116 <String "android.intent.extra.CC">
        //   18   34:aload_0         
        //   19   35:getfield        #114 <Field ArrayList mCcAddresses>
        //   20   38:invokespecial   #151 <Method void combineArrayExtra(String, ArrayList)>
        //   21   41:aload_0         
        //   22   42:aconst_null     
        //   23   43:putfield        #114 <Field ArrayList mCcAddresses>
        //   24   46:aload_0         
        //   25   47:getfield        #101 <Field ArrayList mBccAddresses>
        //   26   50:ifnull          68
        //   27   53:aload_0         
        //   28   54:ldc1            #109 <String "android.intent.extra.BCC">
        //   29   56:aload_0         
        //   30   57:getfield        #101 <Field ArrayList mBccAddresses>
        //   31   60:invokespecial   #151 <Method void combineArrayExtra(String, ArrayList)>
        //   32   63:aload_0         
        //   33   64:aconst_null     
        //   34   65:putfield        #101 <Field ArrayList mBccAddresses>
        //   35   68:aload_0         
        //   36   69:getfield        #136 <Field ArrayList mStreams>
        //   37   72:ifnull          214
        //   38   75:aload_0         
        //   39   76:getfield        #136 <Field ArrayList mStreams>
        //   40   79:invokevirtual   #73  <Method int ArrayList.size()>
        //   41   82:iload_1         
        //   42   83:icmple          214
        //   43   86:aload_0         
        //   44   87:getfield        #35  <Field Intent mIntent>
        //   45   90:invokevirtual   #154 <Method String Intent.getAction()>
        //   46   93:ldc1            #156 <String "android.intent.action.SEND_MULTIPLE">
        //   47   95:invokevirtual   #159 <Method boolean String.equals(Object)>
        //   48   98:istore_2        
        //   49   99:iload_1         
        //   50  100:ifne            160
        //   51  103:iload_2         
        //   52  104:ifeq            160
        //   53  107:aload_0         
        //   54  108:getfield        #35  <Field Intent mIntent>
        //   55  111:ldc1            #29  <String "android.intent.action.SEND">
        //   56  113:invokevirtual   #33  <Method Intent Intent.setAction(String)>
        //   57  116:pop             
        //   58  117:aload_0         
        //   59  118:getfield        #136 <Field ArrayList mStreams>
        //   60  121:ifnull          219
        //   61  124:aload_0         
        //   62  125:getfield        #136 <Field ArrayList mStreams>
        //   63  128:invokevirtual   #163 <Method boolean ArrayList.isEmpty()>
        //   64  131:ifne            219
        //   65  134:aload_0         
        //   66  135:getfield        #35  <Field Intent mIntent>
        //   67  138:ldc1            #125 <String "android.intent.extra.STREAM">
        //   68  140:aload_0         
        //   69  141:getfield        #136 <Field ArrayList mStreams>
        //   70  144:iconst_0        
        //   71  145:invokevirtual   #167 <Method Object ArrayList.get(int)>
        //   72  148:checkcast       #169 <Class Parcelable>
        //   73  151:invokevirtual   #56  <Method Intent Intent.putExtra(String, Parcelable)>
        //   74  154:pop             
        //   75  155:aload_0         
        //   76  156:aconst_null     
        //   77  157:putfield        #136 <Field ArrayList mStreams>
        //   78  160:iload_1         
        //   79  161:ifeq            209
        //   80  164:iload_2         
        //   81  165:ifne            209
        //   82  168:aload_0         
        //   83  169:getfield        #35  <Field Intent mIntent>
        //   84  172:ldc1            #156 <String "android.intent.action.SEND_MULTIPLE">
        //   85  174:invokevirtual   #33  <Method Intent Intent.setAction(String)>
        //   86  177:pop             
        //   87  178:aload_0         
        //   88  179:getfield        #136 <Field ArrayList mStreams>
        //   89  182:ifnull          231
        //   90  185:aload_0         
        //   91  186:getfield        #136 <Field ArrayList mStreams>
        //   92  189:invokevirtual   #163 <Method boolean ArrayList.isEmpty()>
        //   93  192:ifne            231
        //   94  195:aload_0         
        //   95  196:getfield        #35  <Field Intent mIntent>
        //   96  199:ldc1            #125 <String "android.intent.extra.STREAM">
        //   97  201:aload_0         
        //   98  202:getfield        #136 <Field ArrayList mStreams>
        //   99  205:invokevirtual   #173 <Method Intent Intent.putParcelableArrayListExtra(String, ArrayList)>
        //  100  208:pop             
        //  101  209:aload_0         
        //  102  210:getfield        #35  <Field Intent mIntent>
        //  103  213:areturn         
        //  104  214:iconst_0        
        //  105  215:istore_1        
        //  106  216:goto            86
        //  107  219:aload_0         
        //  108  220:getfield        #35  <Field Intent mIntent>
        //  109  223:ldc1            #125 <String "android.intent.extra.STREAM">
        //  110  225:invokevirtual   #140 <Method void Intent.removeExtra(String)>
        //  111  228:goto            155
        //  112  231:aload_0         
        //  113  232:getfield        #35  <Field Intent mIntent>
        //  114  235:ldc1            #125 <String "android.intent.extra.STREAM">
        //  115  237:invokevirtual   #140 <Method void Intent.removeExtra(String)>
        //  116  240:goto            209
        }

        public IntentBuilder setChooserTitle(int i)
        {
        //    0    0:aload_0         
        //    1    1:aload_0         
        //    2    2:getfield        #24  <Field Activity mActivity>
        //    3    5:iload_1         
        //    4    6:invokevirtual   #179 <Method CharSequence Activity.getText(int)>
        //    5    9:invokevirtual   #182 <Method ShareCompat$IntentBuilder setChooserTitle(CharSequence)>
        //    6   12:areturn         
        }

        public IntentBuilder setChooserTitle(CharSequence charsequence)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #143 <Field CharSequence mChooserTitle>
        //    3    5:aload_0         
        //    4    6:areturn         
        }

        public IntentBuilder setEmailBcc(String as[])
        {
        //    0    0:aload_0         
        //    1    1:getfield        #35  <Field Intent mIntent>
        //    2    4:ldc1            #109 <String "android.intent.extra.BCC">
        //    3    6:aload_1         
        //    4    7:invokevirtual   #88  <Method Intent Intent.putExtra(String, String[])>
        //    5   10:pop             
        //    6   11:aload_0         
        //    7   12:areturn         
        }

        public IntentBuilder setEmailCc(String as[])
        {
        //    0    0:aload_0         
        //    1    1:getfield        #35  <Field Intent mIntent>
        //    2    4:ldc1            #116 <String "android.intent.extra.CC">
        //    3    6:aload_1         
        //    4    7:invokevirtual   #88  <Method Intent Intent.putExtra(String, String[])>
        //    5   10:pop             
        //    6   11:aload_0         
        //    7   12:areturn         
        }

        public IntentBuilder setEmailTo(String as[])
        {
        //    0    0:aload_0         
        //    1    1:getfield        #119 <Field ArrayList mToAddresses>
        //    2    4:ifnull          12
        //    3    7:aload_0         
        //    4    8:aconst_null     
        //    5    9:putfield        #119 <Field ArrayList mToAddresses>
        //    6   12:aload_0         
        //    7   13:getfield        #35  <Field Intent mIntent>
        //    8   16:ldc1            #121 <String "android.intent.extra.EMAIL">
        //    9   18:aload_1         
        //   10   19:invokevirtual   #88  <Method Intent Intent.putExtra(String, String[])>
        //   11   22:pop             
        //   12   23:aload_0         
        //   13   24:areturn         
        }

        public IntentBuilder setHtmlText(String s)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #35  <Field Intent mIntent>
        //    2    4:ldc1            #188 <String "android.intent.extra.HTML_TEXT">
        //    3    6:aload_1         
        //    4    7:invokevirtual   #47  <Method Intent Intent.putExtra(String, String)>
        //    5   10:pop             
        //    6   11:aload_0         
        //    7   12:getfield        #35  <Field Intent mIntent>
        //    8   15:ldc1            #190 <String "android.intent.extra.TEXT">
        //    9   17:invokevirtual   #194 <Method boolean Intent.hasExtra(String)>
        //   10   20:ifne            32
        //   11   23:aload_0         
        //   12   24:aload_1         
        //   13   25:invokestatic    #200 <Method Spanned Html.fromHtml(String)>
        //   14   28:invokevirtual   #203 <Method ShareCompat$IntentBuilder setText(CharSequence)>
        //   15   31:pop             
        //   16   32:aload_0         
        //   17   33:areturn         
        }

        public IntentBuilder setStream(Uri uri)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #35  <Field Intent mIntent>
        //    2    4:invokevirtual   #154 <Method String Intent.getAction()>
        //    3    7:ldc1            #29  <String "android.intent.action.SEND">
        //    4    9:invokevirtual   #159 <Method boolean String.equals(Object)>
        //    5   12:ifne            25
        //    6   15:aload_0         
        //    7   16:getfield        #35  <Field Intent mIntent>
        //    8   19:ldc1            #29  <String "android.intent.action.SEND">
        //    9   21:invokevirtual   #33  <Method Intent Intent.setAction(String)>
        //   10   24:pop             
        //   11   25:aload_0         
        //   12   26:aconst_null     
        //   13   27:putfield        #136 <Field ArrayList mStreams>
        //   14   30:aload_0         
        //   15   31:getfield        #35  <Field Intent mIntent>
        //   16   34:ldc1            #125 <String "android.intent.extra.STREAM">
        //   17   36:aload_1         
        //   18   37:invokevirtual   #56  <Method Intent Intent.putExtra(String, Parcelable)>
        //   19   40:pop             
        //   20   41:aload_0         
        //   21   42:areturn         
        }

        public IntentBuilder setSubject(String s)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #35  <Field Intent mIntent>
        //    2    4:ldc1            #206 <String "android.intent.extra.SUBJECT">
        //    3    6:aload_1         
        //    4    7:invokevirtual   #47  <Method Intent Intent.putExtra(String, String)>
        //    5   10:pop             
        //    6   11:aload_0         
        //    7   12:areturn         
        }

        public IntentBuilder setText(CharSequence charsequence)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #35  <Field Intent mIntent>
        //    2    4:ldc1            #190 <String "android.intent.extra.TEXT">
        //    3    6:aload_1         
        //    4    7:invokevirtual   #209 <Method Intent Intent.putExtra(String, CharSequence)>
        //    5   10:pop             
        //    6   11:aload_0         
        //    7   12:areturn         
        }

        public IntentBuilder setType(String s)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #35  <Field Intent mIntent>
        //    2    4:aload_1         
        //    3    5:invokevirtual   #212 <Method Intent Intent.setType(String)>
        //    4    8:pop             
        //    5    9:aload_0         
        //    6   10:areturn         
        }

        public void startChooser()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #24  <Field Activity mActivity>
        //    2    4:aload_0         
        //    3    5:invokevirtual   #215 <Method Intent createChooserIntent()>
        //    4    8:invokevirtual   #219 <Method void Activity.startActivity(Intent)>
        //    5   11:return          
        }

        private Activity mActivity;
        private ArrayList mBccAddresses;
        private ArrayList mCcAddresses;
        private CharSequence mChooserTitle;
        private Intent mIntent;
        private ArrayList mStreams;
        private ArrayList mToAddresses;
    }

    public static class IntentReader
    {

        private IntentReader(Activity activity)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #23  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:putfield        #25  <Field Activity mActivity>
        //    5    9:aload_0         
        //    6   10:aload_1         
        //    7   11:invokevirtual   #31  <Method Intent Activity.getIntent()>
        //    8   14:putfield        #33  <Field Intent mIntent>
        //    9   17:aload_0         
        //   10   18:aload_1         
        //   11   19:invokestatic    #39  <Method String ShareCompat.getCallingPackage(Activity)>
        //   12   22:putfield        #41  <Field String mCallingPackage>
        //   13   25:aload_0         
        //   14   26:aload_1         
        //   15   27:invokestatic    #45  <Method ComponentName ShareCompat.getCallingActivity(Activity)>
        //   16   30:putfield        #47  <Field ComponentName mCallingActivity>
        //   17   33:return          
        }

        public static IntentReader from(Activity activity)
        {
        //    0    0:new             #2   <Class ShareCompat$IntentReader>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:invokespecial   #51  <Method void ShareCompat$IntentReader(Activity)>
        //    4    8:areturn         
        }

        public ComponentName getCallingActivity()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #47  <Field ComponentName mCallingActivity>
        //    2    4:areturn         
        }

        public Drawable getCallingActivityIcon()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #47  <Field ComponentName mCallingActivity>
        //    2    4:ifnonnull       9
        //    3    7:aconst_null     
        //    4    8:areturn         
        //    5    9:aload_0         
        //    6   10:getfield        #25  <Field Activity mActivity>
        //    7   13:invokevirtual   #60  <Method PackageManager Activity.getPackageManager()>
        //    8   16:astore_1        
        // try 17 27 handler(s) 30
        //    9   17:aload_1         
        //   10   18:aload_0         
        //   11   19:getfield        #47  <Field ComponentName mCallingActivity>
        //   12   22:invokevirtual   #66  <Method Drawable PackageManager.getActivityIcon(ComponentName)>
        //   13   25:astore          4
        //   14   27:aload           4
        //   15   29:areturn         
        // catch android.content.pm.PackageManager.NameNotFoundException
        //   16   30:astore_2        
        //   17   31:ldc1            #8   <String "IntentReader">
        //   18   33:ldc1            #68  <String "Could not retrieve icon for calling activity">
        //   19   35:aload_2         
        //   20   36:invokestatic    #74  <Method int Log.e(String, String, Throwable)>
        //   21   39:pop             
        //   22   40:aconst_null     
        //   23   41:areturn         
        }

        public Drawable getCallingApplicationIcon()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #41  <Field String mCallingPackage>
        //    2    4:ifnonnull       9
        //    3    7:aconst_null     
        //    4    8:areturn         
        //    5    9:aload_0         
        //    6   10:getfield        #25  <Field Activity mActivity>
        //    7   13:invokevirtual   #60  <Method PackageManager Activity.getPackageManager()>
        //    8   16:astore_1        
        // try 17 27 handler(s) 30
        //    9   17:aload_1         
        //   10   18:aload_0         
        //   11   19:getfield        #41  <Field String mCallingPackage>
        //   12   22:invokevirtual   #79  <Method Drawable PackageManager.getApplicationIcon(String)>
        //   13   25:astore          4
        //   14   27:aload           4
        //   15   29:areturn         
        // catch android.content.pm.PackageManager.NameNotFoundException
        //   16   30:astore_2        
        //   17   31:ldc1            #8   <String "IntentReader">
        //   18   33:ldc1            #81  <String "Could not retrieve icon for calling application">
        //   19   35:aload_2         
        //   20   36:invokestatic    #74  <Method int Log.e(String, String, Throwable)>
        //   21   39:pop             
        //   22   40:aconst_null     
        //   23   41:areturn         
        }

        public CharSequence getCallingApplicationLabel()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #41  <Field String mCallingPackage>
        //    2    4:ifnonnull       9
        //    3    7:aconst_null     
        //    4    8:areturn         
        //    5    9:aload_0         
        //    6   10:getfield        #25  <Field Activity mActivity>
        //    7   13:invokevirtual   #60  <Method PackageManager Activity.getPackageManager()>
        //    8   16:astore_1        
        // try 17 32 handler(s) 35
        //    9   17:aload_1         
        //   10   18:aload_1         
        //   11   19:aload_0         
        //   12   20:getfield        #41  <Field String mCallingPackage>
        //   13   23:iconst_0        
        //   14   24:invokevirtual   #87  <Method android.content.pm.ApplicationInfo PackageManager.getApplicationInfo(String, int)>
        //   15   27:invokevirtual   #91  <Method CharSequence PackageManager.getApplicationLabel(android.content.pm.ApplicationInfo)>
        //   16   30:astore          4
        //   17   32:aload           4
        //   18   34:areturn         
        // catch android.content.pm.PackageManager.NameNotFoundException
        //   19   35:astore_2        
        //   20   36:ldc1            #8   <String "IntentReader">
        //   21   38:ldc1            #93  <String "Could not retrieve label for calling application">
        //   22   40:aload_2         
        //   23   41:invokestatic    #74  <Method int Log.e(String, String, Throwable)>
        //   24   44:pop             
        //   25   45:aconst_null     
        //   26   46:areturn         
        }

        public String getCallingPackage()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #41  <Field String mCallingPackage>
        //    2    4:areturn         
        }

        public String[] getEmailBcc()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #33  <Field Intent mIntent>
        //    2    4:ldc1            #98  <String "android.intent.extra.BCC">
        //    3    6:invokevirtual   #104 <Method String[] Intent.getStringArrayExtra(String)>
        //    4    9:areturn         
        }

        public String[] getEmailCc()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #33  <Field Intent mIntent>
        //    2    4:ldc1            #107 <String "android.intent.extra.CC">
        //    3    6:invokevirtual   #104 <Method String[] Intent.getStringArrayExtra(String)>
        //    4    9:areturn         
        }

        public String[] getEmailTo()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #33  <Field Intent mIntent>
        //    2    4:ldc1            #110 <String "android.intent.extra.EMAIL">
        //    3    6:invokevirtual   #104 <Method String[] Intent.getStringArrayExtra(String)>
        //    4    9:areturn         
        }

        public String getHtmlText()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #33  <Field Intent mIntent>
        //    2    4:ldc1            #113 <String "android.intent.extra.HTML_TEXT">
        //    3    6:invokevirtual   #117 <Method String Intent.getStringExtra(String)>
        //    4    9:astore_1        
        //    5   10:aload_1         
        //    6   11:ifnonnull       34
        //    7   14:aload_0         
        //    8   15:invokevirtual   #120 <Method CharSequence getText()>
        //    9   18:astore_2        
        //   10   19:aload_2         
        //   11   20:instanceof      #122 <Class Spanned>
        //   12   23:ifeq            36
        //   13   26:aload_2         
        //   14   27:checkcast       #122 <Class Spanned>
        //   15   30:invokestatic    #128 <Method String Html.toHtml(Spanned)>
        //   16   33:astore_1        
        //   17   34:aload_1         
        //   18   35:areturn         
        //   19   36:aload_2         
        //   20   37:ifnull          34
        //   21   40:invokestatic    #132 <Method ShareCompat$ShareCompatImpl ShareCompat.access$000()>
        //   22   43:aload_2         
        //   23   44:invokeinterface #138 <Method String ShareCompat$ShareCompatImpl.escapeHtml(CharSequence)>
        //   24   49:areturn         
        }

        public Uri getStream()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #33  <Field Intent mIntent>
        //    2    4:ldc1            #142 <String "android.intent.extra.STREAM">
        //    3    6:invokevirtual   #146 <Method Parcelable Intent.getParcelableExtra(String)>
        //    4    9:checkcast       #148 <Class Uri>
        //    5   12:areturn         
        }

        public Uri getStream(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #151 <Field ArrayList mStreams>
        //    2    4:ifnonnull       27
        //    3    7:aload_0         
        //    4    8:invokevirtual   #155 <Method boolean isMultipleShare()>
        //    5   11:ifeq            27
        //    6   14:aload_0         
        //    7   15:aload_0         
        //    8   16:getfield        #33  <Field Intent mIntent>
        //    9   19:ldc1            #142 <String "android.intent.extra.STREAM">
        //   10   21:invokevirtual   #159 <Method ArrayList Intent.getParcelableArrayListExtra(String)>
        //   11   24:putfield        #151 <Field ArrayList mStreams>
        //   12   27:aload_0         
        //   13   28:getfield        #151 <Field ArrayList mStreams>
        //   14   31:ifnull          46
        //   15   34:aload_0         
        //   16   35:getfield        #151 <Field ArrayList mStreams>
        //   17   38:iload_1         
        //   18   39:invokevirtual   #165 <Method Object ArrayList.get(int)>
        //   19   42:checkcast       #148 <Class Uri>
        //   20   45:areturn         
        //   21   46:iload_1         
        //   22   47:ifne            63
        //   23   50:aload_0         
        //   24   51:getfield        #33  <Field Intent mIntent>
        //   25   54:ldc1            #142 <String "android.intent.extra.STREAM">
        //   26   56:invokevirtual   #146 <Method Parcelable Intent.getParcelableExtra(String)>
        //   27   59:checkcast       #148 <Class Uri>
        //   28   62:areturn         
        //   29   63:new             #167 <Class IndexOutOfBoundsException>
        //   30   66:dup             
        //   31   67:new             #169 <Class StringBuilder>
        //   32   70:dup             
        //   33   71:invokespecial   #170 <Method void StringBuilder()>
        //   34   74:ldc1            #172 <String "Stream items available: ">
        //   35   76:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
        //   36   79:aload_0         
        //   37   80:invokevirtual   #180 <Method int getStreamCount()>
        //   38   83:invokevirtual   #183 <Method StringBuilder StringBuilder.append(int)>
        //   39   86:ldc1            #185 <String " index requested: ">
        //   40   88:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
        //   41   91:iload_1         
        //   42   92:invokevirtual   #183 <Method StringBuilder StringBuilder.append(int)>
        //   43   95:invokevirtual   #188 <Method String StringBuilder.toString()>
        //   44   98:invokespecial   #191 <Method void IndexOutOfBoundsException(String)>
        //   45  101:athrow          
        }

        public int getStreamCount()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #151 <Field ArrayList mStreams>
        //    2    4:ifnonnull       27
        //    3    7:aload_0         
        //    4    8:invokevirtual   #155 <Method boolean isMultipleShare()>
        //    5   11:ifeq            27
        //    6   14:aload_0         
        //    7   15:aload_0         
        //    8   16:getfield        #33  <Field Intent mIntent>
        //    9   19:ldc1            #142 <String "android.intent.extra.STREAM">
        //   10   21:invokevirtual   #159 <Method ArrayList Intent.getParcelableArrayListExtra(String)>
        //   11   24:putfield        #151 <Field ArrayList mStreams>
        //   12   27:aload_0         
        //   13   28:getfield        #151 <Field ArrayList mStreams>
        //   14   31:ifnull          42
        //   15   34:aload_0         
        //   16   35:getfield        #151 <Field ArrayList mStreams>
        //   17   38:invokevirtual   #194 <Method int ArrayList.size()>
        //   18   41:ireturn         
        //   19   42:aload_0         
        //   20   43:getfield        #33  <Field Intent mIntent>
        //   21   46:ldc1            #142 <String "android.intent.extra.STREAM">
        //   22   48:invokevirtual   #198 <Method boolean Intent.hasExtra(String)>
        //   23   51:ifeq            56
        //   24   54:iconst_1        
        //   25   55:ireturn         
        //   26   56:iconst_0        
        //   27   57:ireturn         
        }

        public String getSubject()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #33  <Field Intent mIntent>
        //    2    4:ldc1            #201 <String "android.intent.extra.SUBJECT">
        //    3    6:invokevirtual   #117 <Method String Intent.getStringExtra(String)>
        //    4    9:areturn         
        }

        public CharSequence getText()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #33  <Field Intent mIntent>
        //    2    4:ldc1            #203 <String "android.intent.extra.TEXT">
        //    3    6:invokevirtual   #207 <Method CharSequence Intent.getCharSequenceExtra(String)>
        //    4    9:areturn         
        }

        public String getType()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #33  <Field Intent mIntent>
        //    2    4:invokevirtual   #210 <Method String Intent.getType()>
        //    3    7:areturn         
        }

        public boolean isMultipleShare()
        {
        //    0    0:ldc1            #212 <String "android.intent.action.SEND_MULTIPLE">
        //    1    2:aload_0         
        //    2    3:getfield        #33  <Field Intent mIntent>
        //    3    6:invokevirtual   #215 <Method String Intent.getAction()>
        //    4    9:invokevirtual   #221 <Method boolean String.equals(Object)>
        //    5   12:ireturn         
        }

        public boolean isShareIntent()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #33  <Field Intent mIntent>
        //    2    4:invokevirtual   #215 <Method String Intent.getAction()>
        //    3    7:astore_1        
        //    4    8:ldc1            #224 <String "android.intent.action.SEND">
        //    5   10:aload_1         
        //    6   11:invokevirtual   #221 <Method boolean String.equals(Object)>
        //    7   14:ifne            26
        //    8   17:ldc1            #212 <String "android.intent.action.SEND_MULTIPLE">
        //    9   19:aload_1         
        //   10   20:invokevirtual   #221 <Method boolean String.equals(Object)>
        //   11   23:ifeq            28
        //   12   26:iconst_1        
        //   13   27:ireturn         
        //   14   28:iconst_0        
        //   15   29:ireturn         
        }

        public boolean isSingleShare()
        {
        //    0    0:ldc1            #224 <String "android.intent.action.SEND">
        //    1    2:aload_0         
        //    2    3:getfield        #33  <Field Intent mIntent>
        //    3    6:invokevirtual   #215 <Method String Intent.getAction()>
        //    4    9:invokevirtual   #221 <Method boolean String.equals(Object)>
        //    5   12:ireturn         
        }

        private static final String TAG = "IntentReader";
        private Activity mActivity;
        private ComponentName mCallingActivity;
        private String mCallingPackage;
        private Intent mIntent;
        private ArrayList mStreams;
    }

    static interface ShareCompatImpl
    {

        public abstract void configureMenuItem(MenuItem menuitem, IntentBuilder intentbuilder);

        public abstract String escapeHtml(CharSequence charsequence);
    }

    static class ShareCompatImplBase
        implements ShareCompatImpl
    {

        ShareCompatImplBase()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        private static void withinStyle(StringBuilder stringbuilder, CharSequence charsequence, int i, int j)
        {
        //    0    0:iload_2         
        //    1    1:istore          4
        //    2    3:iload           4
        //    3    5:iload_3         
        //    4    6:icmpge          183
        //    5    9:aload_1         
        //    6   10:iload           4
        //    7   12:invokeinterface #18  <Method char CharSequence.charAt(int)>
        //    8   17:istore          5
        //    9   19:iload           5
        //   10   21:bipush          60
        //   11   23:icmpne          39
        //   12   26:aload_0         
        //   13   27:ldc1            #20  <String "&lt;">
        //   14   29:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
        //   15   32:pop             
        //   16   33:iinc            4  1
        //   17   36:goto            3
        //   18   39:iload           5
        //   19   41:bipush          62
        //   20   43:icmpne          56
        //   21   46:aload_0         
        //   22   47:ldc1            #28  <String "&gt;">
        //   23   49:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
        //   24   52:pop             
        //   25   53:goto            33
        //   26   56:iload           5
        //   27   58:bipush          38
        //   28   60:icmpne          73
        //   29   63:aload_0         
        //   30   64:ldc1            #30  <String "&amp;">
        //   31   66:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
        //   32   69:pop             
        //   33   70:goto            33
        //   34   73:iload           5
        //   35   75:bipush          126
        //   36   77:icmpgt          87
        //   37   80:iload           5
        //   38   82:bipush          32
        //   39   84:icmpge          120
        //   40   87:aload_0         
        //   41   88:new             #22  <Class StringBuilder>
        //   42   91:dup             
        //   43   92:invokespecial   #31  <Method void StringBuilder()>
        //   44   95:ldc1            #33  <String "&#">
        //   45   97:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
        //   46  100:iload           5
        //   47  102:invokevirtual   #36  <Method StringBuilder StringBuilder.append(int)>
        //   48  105:ldc1            #38  <String ";">
        //   49  107:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
        //   50  110:invokevirtual   #42  <Method String StringBuilder.toString()>
        //   51  113:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
        //   52  116:pop             
        //   53  117:goto            33
        //   54  120:iload           5
        //   55  122:bipush          32
        //   56  124:icmpne          173
        //   57  127:iload           4
        //   58  129:iconst_1        
        //   59  130:iadd            
        //   60  131:iload_3         
        //   61  132:icmpge          163
        //   62  135:aload_1         
        //   63  136:iload           4
        //   64  138:iconst_1        
        //   65  139:iadd            
        //   66  140:invokeinterface #18  <Method char CharSequence.charAt(int)>
        //   67  145:bipush          32
        //   68  147:icmpne          163
        //   69  150:aload_0         
        //   70  151:ldc1            #44  <String "&nbsp;">
        //   71  153:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
        //   72  156:pop             
        //   73  157:iinc            4  1
        //   74  160:goto            127
        //   75  163:aload_0         
        //   76  164:bipush          32
        //   77  166:invokevirtual   #47  <Method StringBuilder StringBuilder.append(char)>
        //   78  169:pop             
        //   79  170:goto            33
        //   80  173:aload_0         
        //   81  174:iload           5
        //   82  176:invokevirtual   #47  <Method StringBuilder StringBuilder.append(char)>
        //   83  179:pop             
        //   84  180:goto            33
        //   85  183:return          
        }

        public void configureMenuItem(MenuItem menuitem, IntentBuilder intentbuilder)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:invokevirtual   #55  <Method Intent ShareCompat$IntentBuilder.createChooserIntent()>
        //    3    5:invokeinterface #61  <Method MenuItem MenuItem.setIntent(Intent)>
        //    4   10:pop             
        //    5   11:return          
        }

        public String escapeHtml(CharSequence charsequence)
        {
        //    0    0:new             #22  <Class StringBuilder>
        //    1    3:dup             
        //    2    4:invokespecial   #31  <Method void StringBuilder()>
        //    3    7:astore_2        
        //    4    8:aload_2         
        //    5    9:aload_1         
        //    6   10:iconst_0        
        //    7   11:aload_1         
        //    8   12:invokeinterface #67  <Method int CharSequence.length()>
        //    9   17:invokestatic    #69  <Method void withinStyle(StringBuilder, CharSequence, int, int)>
        //   10   20:aload_2         
        //   11   21:invokevirtual   #42  <Method String StringBuilder.toString()>
        //   12   24:areturn         
        }
    }

    static class ShareCompatImplICS extends ShareCompatImplBase
    {

        ShareCompatImplICS()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void ShareCompat$ShareCompatImplBase()>
        //    2    4:return          
        }

        public void configureMenuItem(MenuItem menuitem, IntentBuilder intentbuilder)
        {
        //    0    0:aload_1         
        //    1    1:aload_2         
        //    2    2:invokevirtual   #16  <Method Activity ShareCompat$IntentBuilder.getActivity()>
        //    3    5:aload_2         
        //    4    6:invokevirtual   #20  <Method Intent ShareCompat$IntentBuilder.getIntent()>
        //    5    9:invokestatic    #25  <Method void ShareCompatICS.configureMenuItem(MenuItem, Activity, Intent)>
        //    6   12:aload_0         
        //    7   13:aload_1         
        //    8   14:invokevirtual   #29  <Method boolean shouldAddChooserIntent(MenuItem)>
        //    9   17:ifeq            31
        //   10   20:aload_1         
        //   11   21:aload_2         
        //   12   22:invokevirtual   #32  <Method Intent ShareCompat$IntentBuilder.createChooserIntent()>
        //   13   25:invokeinterface #38  <Method MenuItem MenuItem.setIntent(Intent)>
        //   14   30:pop             
        //   15   31:return          
        }

        boolean shouldAddChooserIntent(MenuItem menuitem)
        {
        //    0    0:aload_1         
        //    1    1:invokeinterface #42  <Method boolean MenuItem.hasSubMenu()>
        //    2    6:ifne            11
        //    3    9:iconst_1        
        //    4   10:ireturn         
        //    5   11:iconst_0        
        //    6   12:ireturn         
        }
    }

    static class ShareCompatImplJB extends ShareCompatImplICS
    {

        ShareCompatImplJB()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #8   <Method void ShareCompat$ShareCompatImplICS()>
        //    2    4:return          
        }

        public String escapeHtml(CharSequence charsequence)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #14  <Method String ShareCompatJB.escapeHtml(CharSequence)>
        //    2    4:areturn         
        }

        boolean shouldAddChooserIntent(MenuItem menuitem)
        {
        //    0    0:iconst_0        
        //    1    1:ireturn         
        }
    }


    static 
    {
    //    0    0:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          16
    //    2    5:icmplt          19
    //    3    8:new             #23  <Class ShareCompat$ShareCompatImplJB>
    //    4   11:dup             
    //    5   12:invokespecial   #26  <Method void ShareCompat$ShareCompatImplJB()>
    //    6   15:putstatic       #28  <Field ShareCompat$ShareCompatImpl IMPL>
    //    7   18:return          
    //    8   19:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
    //    9   22:bipush          14
    //   10   24:icmplt          38
    //   11   27:new             #30  <Class ShareCompat$ShareCompatImplICS>
    //   12   30:dup             
    //   13   31:invokespecial   #31  <Method void ShareCompat$ShareCompatImplICS()>
    //   14   34:putstatic       #28  <Field ShareCompat$ShareCompatImpl IMPL>
    //   15   37:return          
    //   16   38:new             #33  <Class ShareCompat$ShareCompatImplBase>
    //   17   41:dup             
    //   18   42:invokespecial   #34  <Method void ShareCompat$ShareCompatImplBase()>
    //   19   45:putstatic       #28  <Field ShareCompat$ShareCompatImpl IMPL>
    //   20   48:return          
    }

    public ShareCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #35  <Method void Object()>
    //    2    4:return          
    }

    static ShareCompatImpl access$000()
    {
    //    0    0:getstatic       #28  <Field ShareCompat$ShareCompatImpl IMPL>
    //    1    3:areturn         
// Previous instruction length mismatch
    //    2    0:getstatic       #28  <Field ShareCompat$ShareCompatImpl IMPL>
    //    3    3:areturn         
    }

    public static void configureMenuItem(Menu menu, int i, IntentBuilder intentbuilder)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokeinterface #45  <Method MenuItem Menu.findItem(int)>
    //    3    7:astore_3        
    //    4    8:aload_3         
    //    5    9:ifnonnull       44
    //    6   12:new             #47  <Class IllegalArgumentException>
    //    7   15:dup             
    //    8   16:new             #49  <Class StringBuilder>
    //    9   19:dup             
    //   10   20:invokespecial   #50  <Method void StringBuilder()>
    //   11   23:ldc1            #52  <String "Could not find menu item with id ">
    //   12   25:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
    //   13   28:iload_1         
    //   14   29:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
    //   15   32:ldc1            #61  <String " in the supplied menu">
    //   16   34:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
    //   17   37:invokevirtual   #65  <Method String StringBuilder.toString()>
    //   18   40:invokespecial   #68  <Method void IllegalArgumentException(String)>
    //   19   43:athrow          
    //   20   44:aload_3         
    //   21   45:aload_2         
    //   22   46:invokestatic    #71  <Method void configureMenuItem(MenuItem, ShareCompat$IntentBuilder)>
    //   23   49:return          
    }

    public static void configureMenuItem(MenuItem menuitem, IntentBuilder intentbuilder)
    {
    //    0    0:getstatic       #28  <Field ShareCompat$ShareCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:aload_1         
    //    3    5:invokeinterface #74  <Method void ShareCompat$ShareCompatImpl.configureMenuItem(MenuItem, ShareCompat$IntentBuilder)>
    //    4   10:return          
    }

    public static ComponentName getCallingActivity(Activity activity)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #81  <Method ComponentName Activity.getCallingActivity()>
    //    2    4:astore_1        
    //    3    5:aload_1         
    //    4    6:ifnonnull       22
    //    5    9:aload_0         
    //    6   10:invokevirtual   #85  <Method Intent Activity.getIntent()>
    //    7   13:ldc1            #8   <String "android.support.v4.app.EXTRA_CALLING_ACTIVITY">
    //    8   15:invokevirtual   #91  <Method Parcelable Intent.getParcelableExtra(String)>
    //    9   18:checkcast       #93  <Class ComponentName>
    //   10   21:astore_1        
    //   11   22:aload_1         
    //   12   23:areturn         
    }

    public static String getCallingPackage(Activity activity)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #97  <Method String Activity.getCallingPackage()>
    //    2    4:astore_1        
    //    3    5:aload_1         
    //    4    6:ifnonnull       19
    //    5    9:aload_0         
    //    6   10:invokevirtual   #85  <Method Intent Activity.getIntent()>
    //    7   13:ldc1            #11  <String "android.support.v4.app.EXTRA_CALLING_PACKAGE">
    //    8   15:invokevirtual   #101 <Method String Intent.getStringExtra(String)>
    //    9   18:astore_1        
    //   10   19:aload_1         
    //   11   20:areturn         
    }

    public static final String EXTRA_CALLING_ACTIVITY = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";
    public static final String EXTRA_CALLING_PACKAGE = "android.support.v4.app.EXTRA_CALLING_PACKAGE";
    private static ShareCompatImpl IMPL;

    static ShareCompatImpl access$000()
    {
    //    0    0:getstatic       #28  <Field ShareCompat$ShareCompatImpl IMPL>
    //    1    3:areturn         
    }
}
