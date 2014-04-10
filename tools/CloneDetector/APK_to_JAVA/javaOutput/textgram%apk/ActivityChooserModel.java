// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v7.internal.widget;

import android.content.*;
import android.content.pm.*;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.*;
import java.math.BigDecimal;
import java.util.*;
import org.xmlpull.v1.*;

public class ActivityChooserModel extends DataSetObservable
{
    public static interface ActivityChooserModelClient
    {

        public abstract void setActivityChooserModel(ActivityChooserModel activitychoosermodel);
    }

    public final class ActivityResolveInfo
        implements Comparable
    {

        public ActivityResolveInfo(ResolveInfo resolveinfo)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #17  <Field ActivityChooserModel this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #20  <Method void Object()>
        //    5    9:aload_0         
        //    6   10:aload_2         
        //    7   11:putfield        #22  <Field ResolveInfo resolveInfo>
        //    8   14:return          
        }

        public int compareTo(ActivityResolveInfo activityresolveinfo)
        {
        //    0    0:aload_1         
        //    1    1:getfield        #26  <Field float weight>
        //    2    4:invokestatic    #32  <Method int Float.floatToIntBits(float)>
        //    3    7:aload_0         
        //    4    8:getfield        #26  <Field float weight>
        //    5   11:invokestatic    #32  <Method int Float.floatToIntBits(float)>
        //    6   14:isub            
        //    7   15:ireturn         
        }

        public volatile int compareTo(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #2   <Class ActivityChooserModel$ActivityResolveInfo>
        //    3    5:invokevirtual   #35  <Method int compareTo(ActivityChooserModel$ActivityResolveInfo)>
        //    4    8:ireturn         
        }

        public boolean equals(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:if_acmpne       7
        //    3    5:iconst_1        
        //    4    6:ireturn         
        //    5    7:aload_1         
        //    6    8:ifnonnull       13
        //    7   11:iconst_0        
        //    8   12:ireturn         
        //    9   13:aload_0         
        //   10   14:invokevirtual   #41  <Method Class Object.getClass()>
        //   11   17:aload_1         
        //   12   18:invokevirtual   #41  <Method Class Object.getClass()>
        //   13   21:if_acmpeq       26
        //   14   24:iconst_0        
        //   15   25:ireturn         
        //   16   26:aload_1         
        //   17   27:checkcast       #2   <Class ActivityChooserModel$ActivityResolveInfo>
        //   18   30:astore_2        
        //   19   31:aload_0         
        //   20   32:getfield        #26  <Field float weight>
        //   21   35:invokestatic    #32  <Method int Float.floatToIntBits(float)>
        //   22   38:aload_2         
        //   23   39:getfield        #26  <Field float weight>
        //   24   42:invokestatic    #32  <Method int Float.floatToIntBits(float)>
        //   25   45:icmpeq          5
        //   26   48:iconst_0        
        //   27   49:ireturn         
        }

        public int hashCode()
        {
        //    0    0:bipush          31
        //    1    2:aload_0         
        //    2    3:getfield        #26  <Field float weight>
        //    3    6:invokestatic    #32  <Method int Float.floatToIntBits(float)>
        //    4    9:iadd            
        //    5   10:ireturn         
        }

        public String toString()
        {
        //    0    0:new             #47  <Class StringBuilder>
        //    1    3:dup             
        //    2    4:invokespecial   #48  <Method void StringBuilder()>
        //    3    7:astore_1        
        //    4    8:aload_1         
        //    5    9:ldc1            #50  <String "[">
        //    6   11:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
        //    7   14:pop             
        //    8   15:aload_1         
        //    9   16:ldc1            #56  <String "resolveInfo:">
        //   10   18:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
        //   11   21:aload_0         
        //   12   22:getfield        #22  <Field ResolveInfo resolveInfo>
        //   13   25:invokevirtual   #60  <Method String ResolveInfo.toString()>
        //   14   28:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
        //   15   31:pop             
        //   16   32:aload_1         
        //   17   33:ldc1            #62  <String "; weight:">
        //   18   35:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
        //   19   38:new             #64  <Class BigDecimal>
        //   20   41:dup             
        //   21   42:aload_0         
        //   22   43:getfield        #26  <Field float weight>
        //   23   46:f2d             
        //   24   47:invokespecial   #67  <Method void BigDecimal(double)>
        //   25   50:invokevirtual   #70  <Method StringBuilder StringBuilder.append(Object)>
        //   26   53:pop             
        //   27   54:aload_1         
        //   28   55:ldc1            #72  <String "]">
        //   29   57:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
        //   30   60:pop             
        //   31   61:aload_1         
        //   32   62:invokevirtual   #73  <Method String StringBuilder.toString()>
        //   33   65:areturn         
        }

        public final ResolveInfo resolveInfo;
        final ActivityChooserModel this$0;
        public float weight;
    }

    public static interface ActivitySorter
    {

        public abstract void sort(Intent intent, List list, List list1);
    }

    private final class DefaultSorter
        implements ActivitySorter
    {

        private DefaultSorter()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #18  <Field ActivityChooserModel this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #21  <Method void Object()>
        //    5    9:aload_0         
        //    6   10:new             #23  <Class HashMap>
        //    7   13:dup             
        //    8   14:invokespecial   #24  <Method void HashMap()>
        //    9   17:putfield        #26  <Field Map mPackageNameToActivityMap>
        //   10   20:return          
        }

        DefaultSorter(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #29  <Method void ActivityChooserModel$DefaultSorter(ActivityChooserModel)>
        //    3    5:return          
        }

        public void sort(Intent intent, List list, List list1)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #26  <Field Map mPackageNameToActivityMap>
        //    2    4:astore          4
        //    3    6:aload           4
        //    4    8:invokeinterface #36  <Method void Map.clear()>
        //    5   13:aload_2         
        //    6   14:invokeinterface #42  <Method int List.size()>
        //    7   19:istore          5
        //    8   21:iconst_0        
        //    9   22:istore          6
        //   10   24:iload           6
        //   11   26:iload           5
        //   12   28:icmpge          77
        //   13   31:aload_2         
        //   14   32:iload           6
        //   15   34:invokeinterface #46  <Method Object List.get(int)>
        //   16   39:checkcast       #48  <Class ActivityChooserModel$ActivityResolveInfo>
        //   17   42:astore          12
        //   18   44:aload           12
        //   19   46:fconst_0        
        //   20   47:putfield        #51  <Field float ActivityChooserModel$ActivityResolveInfo.weight>
        //   21   50:aload           4
        //   22   52:aload           12
        //   23   54:getfield        #55  <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
        //   24   57:getfield        #61  <Field ActivityInfo ResolveInfo.activityInfo>
        //   25   60:getfield        #67  <Field String ActivityInfo.packageName>
        //   26   63:aload           12
        //   27   65:invokeinterface #71  <Method Object Map.put(Object, Object)>
        //   28   70:pop             
        //   29   71:iinc            6  1
        //   30   74:goto            24
        //   31   77:iconst_m1       
        //   32   78:aload_3         
        //   33   79:invokeinterface #42  <Method int List.size()>
        //   34   84:iadd            
        //   35   85:istore          7
        //   36   87:fconst_1        
        //   37   88:fstore          8
        //   38   90:iload           7
        //   39   92:istore          9
        //   40   94:iload           9
        //   41   96:iflt            169
        //   42   99:aload_3         
        //   43  100:iload           9
        //   44  102:invokeinterface #46  <Method Object List.get(int)>
        //   45  107:checkcast       #73  <Class ActivityChooserModel$HistoricalRecord>
        //   46  110:astore          10
        //   47  112:aload           4
        //   48  114:aload           10
        //   49  116:getfield        #77  <Field ComponentName ActivityChooserModel$HistoricalRecord.activity>
        //   50  119:invokevirtual   #83  <Method String ComponentName.getPackageName()>
        //   51  122:invokeinterface #86  <Method Object Map.get(Object)>
        //   52  127:checkcast       #48  <Class ActivityChooserModel$ActivityResolveInfo>
        //   53  130:astore          11
        //   54  132:aload           11
        //   55  134:ifnull          163
        //   56  137:aload           11
        //   57  139:aload           11
        //   58  141:getfield        #51  <Field float ActivityChooserModel$ActivityResolveInfo.weight>
        //   59  144:fload           8
        //   60  146:aload           10
        //   61  148:getfield        #87  <Field float ActivityChooserModel$HistoricalRecord.weight>
        //   62  151:fmul            
        //   63  152:fadd            
        //   64  153:putfield        #51  <Field float ActivityChooserModel$ActivityResolveInfo.weight>
        //   65  156:fload           8
        //   66  158:ldc1            #9   <Float 0.95F>
        //   67  160:fmul            
        //   68  161:fstore          8
        //   69  163:iinc            9  -1
        //   70  166:goto            94
        //   71  169:aload_2         
        //   72  170:invokestatic    #92  <Method void Collections.sort(List)>
        //   73  173:return          
        }

        private static final float WEIGHT_DECAY_COEFFICIENT = 0.95F;
        private final Map mPackageNameToActivityMap;
        final ActivityChooserModel this$0;
    }

    public static final class HistoricalRecord
    {

        public HistoricalRecord(ComponentName componentname, long l, float f)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #15  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:putfield        #17  <Field ComponentName activity>
        //    5    9:aload_0         
        //    6   10:lload_2         
        //    7   11:putfield        #19  <Field long time>
        //    8   14:aload_0         
        //    9   15:fload           4
        //   10   17:putfield        #21  <Field float weight>
        //   11   20:return          
        }

        public HistoricalRecord(String s, long l, float f)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokestatic    #28  <Method ComponentName ComponentName.unflattenFromString(String)>
        //    3    5:lload_2         
        //    4    6:fload           4
        //    5    8:invokespecial   #30  <Method void ActivityChooserModel$HistoricalRecord(ComponentName, long, float)>
        //    6   11:return          
        }

        public boolean equals(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:if_acmpne       7
        //    3    5:iconst_1        
        //    4    6:ireturn         
        //    5    7:aload_1         
        //    6    8:ifnonnull       13
        //    7   11:iconst_0        
        //    8   12:ireturn         
        //    9   13:aload_0         
        //   10   14:invokevirtual   #36  <Method Class Object.getClass()>
        //   11   17:aload_1         
        //   12   18:invokevirtual   #36  <Method Class Object.getClass()>
        //   13   21:if_acmpeq       26
        //   14   24:iconst_0        
        //   15   25:ireturn         
        //   16   26:aload_1         
        //   17   27:checkcast       #2   <Class ActivityChooserModel$HistoricalRecord>
        //   18   30:astore_2        
        //   19   31:aload_0         
        //   20   32:getfield        #17  <Field ComponentName activity>
        //   21   35:ifnonnull       47
        //   22   38:aload_2         
        //   23   39:getfield        #17  <Field ComponentName activity>
        //   24   42:ifnull          63
        //   25   45:iconst_0        
        //   26   46:ireturn         
        //   27   47:aload_0         
        //   28   48:getfield        #17  <Field ComponentName activity>
        //   29   51:aload_2         
        //   30   52:getfield        #17  <Field ComponentName activity>
        //   31   55:invokevirtual   #38  <Method boolean ComponentName.equals(Object)>
        //   32   58:ifne            63
        //   33   61:iconst_0        
        //   34   62:ireturn         
        //   35   63:aload_0         
        //   36   64:getfield        #19  <Field long time>
        //   37   67:aload_2         
        //   38   68:getfield        #19  <Field long time>
        //   39   71:lcmp            
        //   40   72:ifeq            77
        //   41   75:iconst_0        
        //   42   76:ireturn         
        //   43   77:aload_0         
        //   44   78:getfield        #21  <Field float weight>
        //   45   81:invokestatic    #44  <Method int Float.floatToIntBits(float)>
        //   46   84:aload_2         
        //   47   85:getfield        #21  <Field float weight>
        //   48   88:invokestatic    #44  <Method int Float.floatToIntBits(float)>
        //   49   91:icmpeq          5
        //   50   94:iconst_0        
        //   51   95:ireturn         
        }

        public int hashCode()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #17  <Field ComponentName activity>
        //    2    4:ifnonnull       42
        //    3    7:iconst_0        
        //    4    8:istore_1        
        //    5    9:bipush          31
        //    6   11:bipush          31
        //    7   13:iload_1         
        //    8   14:bipush          31
        //    9   16:iadd            
        //   10   17:imul            
        //   11   18:aload_0         
        //   12   19:getfield        #19  <Field long time>
        //   13   22:aload_0         
        //   14   23:getfield        #19  <Field long time>
        //   15   26:bipush          32
        //   16   28:lushr           
        //   17   29:lxor            
        //   18   30:l2i             
        //   19   31:iadd            
        //   20   32:imul            
        //   21   33:aload_0         
        //   22   34:getfield        #21  <Field float weight>
        //   23   37:invokestatic    #44  <Method int Float.floatToIntBits(float)>
        //   24   40:iadd            
        //   25   41:ireturn         
        //   26   42:aload_0         
        //   27   43:getfield        #17  <Field ComponentName activity>
        //   28   46:invokevirtual   #48  <Method int ComponentName.hashCode()>
        //   29   49:istore_1        
        //   30   50:goto            9
        }

        public String toString()
        {
        //    0    0:new             #52  <Class StringBuilder>
        //    1    3:dup             
        //    2    4:invokespecial   #53  <Method void StringBuilder()>
        //    3    7:astore_1        
        //    4    8:aload_1         
        //    5    9:ldc1            #55  <String "[">
        //    6   11:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
        //    7   14:pop             
        //    8   15:aload_1         
        //    9   16:ldc1            #61  <String "; activity:">
        //   10   18:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
        //   11   21:aload_0         
        //   12   22:getfield        #17  <Field ComponentName activity>
        //   13   25:invokevirtual   #64  <Method StringBuilder StringBuilder.append(Object)>
        //   14   28:pop             
        //   15   29:aload_1         
        //   16   30:ldc1            #66  <String "; time:">
        //   17   32:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
        //   18   35:aload_0         
        //   19   36:getfield        #19  <Field long time>
        //   20   39:invokevirtual   #69  <Method StringBuilder StringBuilder.append(long)>
        //   21   42:pop             
        //   22   43:aload_1         
        //   23   44:ldc1            #71  <String "; weight:">
        //   24   46:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
        //   25   49:new             #73  <Class BigDecimal>
        //   26   52:dup             
        //   27   53:aload_0         
        //   28   54:getfield        #21  <Field float weight>
        //   29   57:f2d             
        //   30   58:invokespecial   #76  <Method void BigDecimal(double)>
        //   31   61:invokevirtual   #64  <Method StringBuilder StringBuilder.append(Object)>
        //   32   64:pop             
        //   33   65:aload_1         
        //   34   66:ldc1            #78  <String "]">
        //   35   68:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
        //   36   71:pop             
        //   37   72:aload_1         
        //   38   73:invokevirtual   #80  <Method String StringBuilder.toString()>
        //   39   76:areturn         
        }

        public final ComponentName activity;
        public final long time;
        public final float weight;
    }

    public static interface OnChooseActivityListener
    {

        public abstract boolean onChooseActivity(ActivityChooserModel activitychoosermodel, Intent intent);
    }

    private final class PersistHistoryAsyncTask extends AsyncTask
    {

        private PersistHistoryAsyncTask()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #11  <Field ActivityChooserModel this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #14  <Method void AsyncTask()>
        //    5    9:return          
        }

        PersistHistoryAsyncTask(_cls1 _pcls1)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokespecial   #17  <Method void ActivityChooserModel$PersistHistoryAsyncTask(ActivityChooserModel)>
        //    3    5:return          
        }

        public volatile Object doInBackground(Object aobj[])
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokevirtual   #22  <Method Void doInBackground(Object[])>
        //    3    5:areturn         
        }

        public transient Void doInBackground(Object aobj[])
        {
        //    0    0:aload_1         
        //    1    1:iconst_0        
        //    2    2:aaload          
        //    3    3:checkcast       #32  <Class List>
        //    4    6:astore_2        
        //    5    7:aload_1         
        //    6    8:iconst_1        
        //    7    9:aaload          
        //    8   10:checkcast       #34  <Class String>
        //    9   13:astore_3        
        // try 14 28 handler(s) 182
        //   10   14:aload_0         
        //   11   15:getfield        #11  <Field ActivityChooserModel this$0>
        //   12   18:invokestatic    #40  <Method Context ActivityChooserModel.access$200(ActivityChooserModel)>
        //   13   21:aload_3         
        //   14   22:iconst_0        
        //   15   23:invokevirtual   #46  <Method FileOutputStream Context.openFileOutput(String, int)>
        //   16   26:astore          6
        //   17   28:invokestatic    #52  <Method XmlSerializer Xml.newSerializer()>
        //   18   31:astore          7
        // try 33 75 handler(s) 253 316 379 442
        //   19   33:aload           7
        //   20   35:aload           6
        //   21   37:aconst_null     
        //   22   38:invokeinterface #58  <Method void XmlSerializer.setOutput(java.io.OutputStream, String)>
        //   23   43:aload           7
        //   24   45:ldc1            #60  <String "UTF-8">
        //   25   47:iconst_1        
        //   26   48:invokestatic    #66  <Method Boolean Boolean.valueOf(boolean)>
        //   27   51:invokeinterface #70  <Method void XmlSerializer.startDocument(String, Boolean)>
        //   28   56:aload           7
        //   29   58:aconst_null     
        //   30   59:ldc1            #72  <String "historical-records">
        //   31   61:invokeinterface #76  <Method XmlSerializer XmlSerializer.startTag(String, String)>
        //   32   66:pop             
        //   33   67:aload_2         
        //   34   68:invokeinterface #80  <Method int List.size()>
        //   35   73:istore          24
        //   36   75:iconst_0        
        //   37   76:istore          25
        //   38   78:iload           25
        //   39   80:iload           24
        //   40   82:icmpge          214
        // try 85 176 handler(s) 253 316 379 442
        //   41   85:aload_2         
        //   42   86:iconst_0        
        //   43   87:invokeinterface #84  <Method Object List.remove(int)>
        //   44   92:checkcast       #86  <Class ActivityChooserModel$HistoricalRecord>
        //   45   95:astore          26
        //   46   97:aload           7
        //   47   99:aconst_null     
        //   48  100:ldc1            #88  <String "historical-record">
        //   49  102:invokeinterface #76  <Method XmlSerializer XmlSerializer.startTag(String, String)>
        //   50  107:pop             
        //   51  108:aload           7
        //   52  110:aconst_null     
        //   53  111:ldc1            #90  <String "activity">
        //   54  113:aload           26
        //   55  115:getfield        #93  <Field ComponentName ActivityChooserModel$HistoricalRecord.activity>
        //   56  118:invokevirtual   #99  <Method String ComponentName.flattenToString()>
        //   57  121:invokeinterface #103 <Method XmlSerializer XmlSerializer.attribute(String, String, String)>
        //   58  126:pop             
        //   59  127:aload           7
        //   60  129:aconst_null     
        //   61  130:ldc1            #105 <String "time">
        //   62  132:aload           26
        //   63  134:getfield        #108 <Field long ActivityChooserModel$HistoricalRecord.time>
        //   64  137:invokestatic    #111 <Method String String.valueOf(long)>
        //   65  140:invokeinterface #103 <Method XmlSerializer XmlSerializer.attribute(String, String, String)>
        //   66  145:pop             
        //   67  146:aload           7
        //   68  148:aconst_null     
        //   69  149:ldc1            #113 <String "weight">
        //   70  151:aload           26
        //   71  153:getfield        #116 <Field float ActivityChooserModel$HistoricalRecord.weight>
        //   72  156:invokestatic    #119 <Method String String.valueOf(float)>
        //   73  159:invokeinterface #103 <Method XmlSerializer XmlSerializer.attribute(String, String, String)>
        //   74  164:pop             
        //   75  165:aload           7
        //   76  167:aconst_null     
        //   77  168:ldc1            #88  <String "historical-record">
        //   78  170:invokeinterface #122 <Method XmlSerializer XmlSerializer.endTag(String, String)>
        //   79  175:pop             
        //   80  176:iinc            25  1
        //   81  179:goto            78
        // catch FileNotFoundException
        //   82  182:astore          4
        //   83  184:invokestatic    #125 <Method String ActivityChooserModel.access$300()>
        //   84  187:new             #127 <Class StringBuilder>
        //   85  190:dup             
        //   86  191:invokespecial   #128 <Method void StringBuilder()>
        //   87  194:ldc1            #130 <String "Error writing historical recrod file: ">
        //   88  196:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
        //   89  199:aload_3         
        //   90  200:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
        //   91  203:invokevirtual   #137 <Method String StringBuilder.toString()>
        //   92  206:aload           4
        //   93  208:invokestatic    #143 <Method int Log.e(String, String, Throwable)>
        //   94  211:pop             
        //   95  212:aconst_null     
        //   96  213:areturn         
        // try 214 232 handler(s) 253 316 379 442
        //   97  214:aload           7
        //   98  216:aconst_null     
        //   99  217:ldc1            #72  <String "historical-records">
        //  100  219:invokeinterface #122 <Method XmlSerializer XmlSerializer.endTag(String, String)>
        //  101  224:pop             
        //  102  225:aload           7
        //  103  227:invokeinterface #146 <Method void XmlSerializer.endDocument()>
        //  104  232:aload_0         
        //  105  233:getfield        #11  <Field ActivityChooserModel this$0>
        //  106  236:iconst_1        
        //  107  237:invokestatic    #150 <Method boolean ActivityChooserModel.access$502(ActivityChooserModel, boolean)>
        //  108  240:pop             
        //  109  241:aload           6
        //  110  243:ifnull          251
        // try 246 251 handler(s) 466
        //  111  246:aload           6
        //  112  248:invokevirtual   #155 <Method void FileOutputStream.close()>
        //  113  251:aconst_null     
        //  114  252:areturn         
        // catch IllegalArgumentException IllegalArgumentException IllegalArgumentException
        //  115  253:astore          19
        // try 255 289 handler(s) 442
        //  116  255:invokestatic    #125 <Method String ActivityChooserModel.access$300()>
        //  117  258:new             #127 <Class StringBuilder>
        //  118  261:dup             
        //  119  262:invokespecial   #128 <Method void StringBuilder()>
        //  120  265:ldc1            #130 <String "Error writing historical recrod file: ">
        //  121  267:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
        //  122  270:aload_0         
        //  123  271:getfield        #11  <Field ActivityChooserModel this$0>
        //  124  274:invokestatic    #159 <Method String ActivityChooserModel.access$400(ActivityChooserModel)>
        //  125  277:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
        //  126  280:invokevirtual   #137 <Method String StringBuilder.toString()>
        //  127  283:aload           19
        //  128  285:invokestatic    #143 <Method int Log.e(String, String, Throwable)>
        //  129  288:pop             
        //  130  289:aload_0         
        //  131  290:getfield        #11  <Field ActivityChooserModel this$0>
        //  132  293:iconst_1        
        //  133  294:invokestatic    #150 <Method boolean ActivityChooserModel.access$502(ActivityChooserModel, boolean)>
        //  134  297:pop             
        //  135  298:aload           6
        //  136  300:ifnull          251
        // try 303 308 handler(s) 311
        //  137  303:aload           6
        //  138  305:invokevirtual   #155 <Method void FileOutputStream.close()>
        //  139  308:goto            251
        // catch IOException
        //  140  311:astore          22
        //  141  313:goto            251
        // catch IllegalStateException IllegalStateException IllegalStateException
        //  142  316:astore          15
        // try 318 352 handler(s) 442
        //  143  318:invokestatic    #125 <Method String ActivityChooserModel.access$300()>
        //  144  321:new             #127 <Class StringBuilder>
        //  145  324:dup             
        //  146  325:invokespecial   #128 <Method void StringBuilder()>
        //  147  328:ldc1            #130 <String "Error writing historical recrod file: ">
        //  148  330:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
        //  149  333:aload_0         
        //  150  334:getfield        #11  <Field ActivityChooserModel this$0>
        //  151  337:invokestatic    #159 <Method String ActivityChooserModel.access$400(ActivityChooserModel)>
        //  152  340:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
        //  153  343:invokevirtual   #137 <Method String StringBuilder.toString()>
        //  154  346:aload           15
        //  155  348:invokestatic    #143 <Method int Log.e(String, String, Throwable)>
        //  156  351:pop             
        //  157  352:aload_0         
        //  158  353:getfield        #11  <Field ActivityChooserModel this$0>
        //  159  356:iconst_1        
        //  160  357:invokestatic    #150 <Method boolean ActivityChooserModel.access$502(ActivityChooserModel, boolean)>
        //  161  360:pop             
        //  162  361:aload           6
        //  163  363:ifnull          251
        // try 366 371 handler(s) 374
        //  164  366:aload           6
        //  165  368:invokevirtual   #155 <Method void FileOutputStream.close()>
        //  166  371:goto            251
        // catch IOException
        //  167  374:astore          18
        //  168  376:goto            251
        // catch IOException IOException IOException
        //  169  379:astore          11
        // try 381 415 handler(s) 442
        //  170  381:invokestatic    #125 <Method String ActivityChooserModel.access$300()>
        //  171  384:new             #127 <Class StringBuilder>
        //  172  387:dup             
        //  173  388:invokespecial   #128 <Method void StringBuilder()>
        //  174  391:ldc1            #130 <String "Error writing historical recrod file: ">
        //  175  393:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
        //  176  396:aload_0         
        //  177  397:getfield        #11  <Field ActivityChooserModel this$0>
        //  178  400:invokestatic    #159 <Method String ActivityChooserModel.access$400(ActivityChooserModel)>
        //  179  403:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
        //  180  406:invokevirtual   #137 <Method String StringBuilder.toString()>
        //  181  409:aload           11
        //  182  411:invokestatic    #143 <Method int Log.e(String, String, Throwable)>
        //  183  414:pop             
        //  184  415:aload_0         
        //  185  416:getfield        #11  <Field ActivityChooserModel this$0>
        //  186  419:iconst_1        
        //  187  420:invokestatic    #150 <Method boolean ActivityChooserModel.access$502(ActivityChooserModel, boolean)>
        //  188  423:pop             
        //  189  424:aload           6
        //  190  426:ifnull          251
        // try 429 434 handler(s) 437
        //  191  429:aload           6
        //  192  431:invokevirtual   #155 <Method void FileOutputStream.close()>
        //  193  434:goto            251
        // catch IOException
        //  194  437:astore          14
        //  195  439:goto            251
        // finally
        //  196  442:astore          8
        //  197  444:aload_0         
        //  198  445:getfield        #11  <Field ActivityChooserModel this$0>
        //  199  448:iconst_1        
        //  200  449:invokestatic    #150 <Method boolean ActivityChooserModel.access$502(ActivityChooserModel, boolean)>
        //  201  452:pop             
        //  202  453:aload           6
        //  203  455:ifnull          463
        // try 458 463 handler(s) 471
        //  204  458:aload           6
        //  205  460:invokevirtual   #155 <Method void FileOutputStream.close()>
        //  206  463:aload           8
        //  207  465:athrow          
        // catch IOException
        //  208  466:astore          34
        //  209  468:goto            251
        // catch IOException
        //  210  471:astore          10
        //  211  473:goto            463
        }

        final ActivityChooserModel this$0;
    }


    static 
    {
    //    0    0:ldc1            #2   <Class ActivityChooserModel>
    //    1    2:invokevirtual   #73  <Method String Class.getSimpleName()>
    //    2    5:putstatic       #75  <Field String LOG_TAG>
    //    3    8:new             #77  <Class Object>
    //    4   11:dup             
    //    5   12:invokespecial   #80  <Method void Object()>
    //    6   15:putstatic       #82  <Field Object sRegistryLock>
    //    7   18:new             #84  <Class HashMap>
    //    8   21:dup             
    //    9   22:invokespecial   #85  <Method void HashMap()>
    //   10   25:putstatic       #87  <Field Map sDataModelRegistry>
    //   11   28:return          
    }

    private ActivityChooserModel(Context context, String s)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #89  <Method void DataSetObservable()>
    //    2    4:aload_0         
    //    3    5:new             #77  <Class Object>
    //    4    8:dup             
    //    5    9:invokespecial   #80  <Method void Object()>
    //    6   12:putfield        #91  <Field Object mInstanceLock>
    //    7   15:aload_0         
    //    8   16:new             #93  <Class ArrayList>
    //    9   19:dup             
    //   10   20:invokespecial   #94  <Method void ArrayList()>
    //   11   23:putfield        #96  <Field List mActivities>
    //   12   26:aload_0         
    //   13   27:new             #93  <Class ArrayList>
    //   14   30:dup             
    //   15   31:invokespecial   #94  <Method void ArrayList()>
    //   16   34:putfield        #98  <Field List mHistoricalRecords>
    //   17   37:aload_0         
    //   18   38:new             #100 <Class ActivityChooserModel$DefaultSorter>
    //   19   41:dup             
    //   20   42:aload_0         
    //   21   43:aconst_null     
    //   22   44:invokespecial   #103 <Method void ActivityChooserModel$DefaultSorter(ActivityChooserModel, ActivityChooserModel$1)>
    //   23   47:putfield        #105 <Field ActivityChooserModel$ActivitySorter mActivitySorter>
    //   24   50:aload_0         
    //   25   51:bipush          50
    //   26   53:putfield        #107 <Field int mHistoryMaxSize>
    //   27   56:aload_0         
    //   28   57:iconst_1        
    //   29   58:putfield        #109 <Field boolean mCanReadHistoricalData>
    //   30   61:aload_0         
    //   31   62:iconst_0        
    //   32   63:putfield        #111 <Field boolean mReadShareHistoryCalled>
    //   33   66:aload_0         
    //   34   67:iconst_1        
    //   35   68:putfield        #113 <Field boolean mHistoricalRecordsChanged>
    //   36   71:aload_0         
    //   37   72:iconst_0        
    //   38   73:putfield        #115 <Field boolean mReloadActivities>
    //   39   76:aload_0         
    //   40   77:aload_1         
    //   41   78:invokevirtual   #121 <Method Context Context.getApplicationContext()>
    //   42   81:putfield        #123 <Field Context mContext>
    //   43   84:aload_2         
    //   44   85:invokestatic    #129 <Method boolean TextUtils.isEmpty(CharSequence)>
    //   45   88:ifne            124
    //   46   91:aload_2         
    //   47   92:ldc1            #31  <String ".xml">
    //   48   94:invokevirtual   #135 <Method boolean String.endsWith(String)>
    //   49   97:ifne            124
    //   50  100:aload_0         
    //   51  101:new             #137 <Class StringBuilder>
    //   52  104:dup             
    //   53  105:invokespecial   #138 <Method void StringBuilder()>
    //   54  108:aload_2         
    //   55  109:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
    //   56  112:ldc1            #31  <String ".xml">
    //   57  114:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
    //   58  117:invokevirtual   #145 <Method String StringBuilder.toString()>
    //   59  120:putfield        #147 <Field String mHistoryFileName>
    //   60  123:return          
    //   61  124:aload_0         
    //   62  125:aload_2         
    //   63  126:putfield        #147 <Field String mHistoryFileName>
    //   64  129:return          
    }

    static Context access$200(ActivityChooserModel activitychoosermodel)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #123 <Field Context mContext>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #123 <Field Context mContext>
    //    5    4:areturn         
    }

    static String access$300()
    {
    //    0    0:getstatic       #75  <Field String LOG_TAG>
    //    1    3:areturn         
// Previous instruction length mismatch
    //    2    0:getstatic       #75  <Field String LOG_TAG>
    //    3    3:areturn         
    }

    static String access$400(ActivityChooserModel activitychoosermodel)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #147 <Field String mHistoryFileName>
    //    2    4:areturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:getfield        #147 <Field String mHistoryFileName>
    //    5    4:areturn         
    }

    static boolean access$502(ActivityChooserModel activitychoosermodel, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #109 <Field boolean mCanReadHistoricalData>
    //    3    5:iload_1         
    //    4    6:ireturn         
// Previous instruction length mismatch
    //    5    0:aload_0         
    //    6    1:iload_1         
    //    7    2:putfield        #109 <Field boolean mCanReadHistoricalData>
    //    8    5:iload_1         
    //    9    6:ireturn         
    }

    private boolean addHisoricalRecord(HistoricalRecord historicalrecord)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #98  <Field List mHistoricalRecords>
    //    2    4:aload_1         
    //    3    5:invokeinterface #162 <Method boolean List.add(Object)>
    //    4   10:istore_2        
    //    5   11:iload_2         
    //    6   12:ifeq            37
    //    7   15:aload_0         
    //    8   16:iconst_1        
    //    9   17:putfield        #113 <Field boolean mHistoricalRecordsChanged>
    //   10   20:aload_0         
    //   11   21:invokespecial   #165 <Method void pruneExcessiveHistoricalRecordsIfNeeded()>
    //   12   24:aload_0         
    //   13   25:invokespecial   #168 <Method void persistHistoricalDataIfNeeded()>
    //   14   28:aload_0         
    //   15   29:invokespecial   #172 <Method boolean sortActivitiesIfNeeded()>
    //   16   32:pop             
    //   17   33:aload_0         
    //   18   34:invokevirtual   #175 <Method void notifyChanged()>
    //   19   37:iload_2         
    //   20   38:ireturn         
    }

    private void ensureConsistentState()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #179 <Method boolean loadActivitiesIfNeeded()>
    //    2    4:aload_0         
    //    3    5:invokespecial   #182 <Method boolean readHistoricalDataIfNeeded()>
    //    4    8:ior             
    //    5    9:istore_1        
    //    6   10:aload_0         
    //    7   11:invokespecial   #165 <Method void pruneExcessiveHistoricalRecordsIfNeeded()>
    //    8   14:iload_1         
    //    9   15:ifeq            27
    //   10   18:aload_0         
    //   11   19:invokespecial   #172 <Method boolean sortActivitiesIfNeeded()>
    //   12   22:pop             
    //   13   23:aload_0         
    //   14   24:invokevirtual   #175 <Method void notifyChanged()>
    //   15   27:return          
    }

    private void executePersistHistoryAsyncTaskBase()
    {
    //    0    0:new             #185 <Class ActivityChooserModel$PersistHistoryAsyncTask>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:aconst_null     
    //    4    6:invokespecial   #186 <Method void ActivityChooserModel$PersistHistoryAsyncTask(ActivityChooserModel, ActivityChooserModel$1)>
    //    5    9:astore_1        
    //    6   10:iconst_2        
    //    7   11:anewarray       Object[]
    //    8   14:astore_2        
    //    9   15:aload_2         
    //   10   16:iconst_0        
    //   11   17:new             #93  <Class ArrayList>
    //   12   20:dup             
    //   13   21:aload_0         
    //   14   22:getfield        #98  <Field List mHistoricalRecords>
    //   15   25:invokespecial   #189 <Method void ArrayList(java.util.Collection)>
    //   16   28:aastore         
    //   17   29:aload_2         
    //   18   30:iconst_1        
    //   19   31:aload_0         
    //   20   32:getfield        #147 <Field String mHistoryFileName>
    //   21   35:aastore         
    //   22   36:aload_1         
    //   23   37:aload_2         
    //   24   38:invokevirtual   #193 <Method AsyncTask ActivityChooserModel$PersistHistoryAsyncTask.execute(Object[])>
    //   25   41:pop             
    //   26   42:return          
    }

    private void executePersistHistoryAsyncTaskSDK11()
    {
    //    0    0:new             #185 <Class ActivityChooserModel$PersistHistoryAsyncTask>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:aconst_null     
    //    4    6:invokespecial   #186 <Method void ActivityChooserModel$PersistHistoryAsyncTask(ActivityChooserModel, ActivityChooserModel$1)>
    //    5    9:astore_1        
    //    6   10:getstatic       #200 <Field java.util.concurrent.Executor AsyncTask.SERIAL_EXECUTOR>
    //    7   13:astore_2        
    //    8   14:iconst_2        
    //    9   15:anewarray       Object[]
    //   10   18:astore_3        
    //   11   19:aload_3         
    //   12   20:iconst_0        
    //   13   21:new             #93  <Class ArrayList>
    //   14   24:dup             
    //   15   25:aload_0         
    //   16   26:getfield        #98  <Field List mHistoricalRecords>
    //   17   29:invokespecial   #189 <Method void ArrayList(java.util.Collection)>
    //   18   32:aastore         
    //   19   33:aload_3         
    //   20   34:iconst_1        
    //   21   35:aload_0         
    //   22   36:getfield        #147 <Field String mHistoryFileName>
    //   23   39:aastore         
    //   24   40:aload_1         
    //   25   41:aload_2         
    //   26   42:aload_3         
    //   27   43:invokevirtual   #204 <Method AsyncTask ActivityChooserModel$PersistHistoryAsyncTask.executeOnExecutor(java.util.concurrent.Executor, Object[])>
    //   28   46:pop             
    //   29   47:return          
    }

    public static ActivityChooserModel get(Context context, String s)
    {
    //    0    0:getstatic       #82  <Field Object sRegistryLock>
    //    1    3:astore_2        
    //    2    4:aload_2         
    //    3    5:monitorenter    
    // try 6 20 handler(s) 53
    //    4    6:getstatic       #87  <Field Map sDataModelRegistry>
    //    5    9:aload_1         
    //    6   10:invokeinterface #211 <Method Object Map.get(Object)>
    //    7   15:checkcast       #2   <Class ActivityChooserModel>
    //    8   18:astore          4
    //    9   20:aload           4
    //   10   22:ifnonnull       48
    // try 25 48 handler(s) 53
    //   11   25:new             #2   <Class ActivityChooserModel>
    //   12   28:dup             
    //   13   29:aload_0         
    //   14   30:aload_1         
    //   15   31:invokespecial   #213 <Method void ActivityChooserModel(Context, String)>
    //   16   34:astore          4
    //   17   36:getstatic       #87  <Field Map sDataModelRegistry>
    //   18   39:aload_1         
    //   19   40:aload           4
    //   20   42:invokeinterface #217 <Method Object Map.put(Object, Object)>
    //   21   47:pop             
    // try 48 50 handler(s) 53
    //   22   48:aload_2         
    //   23   49:monitorexit     
    //   24   50:aload           4
    //   25   52:areturn         
    // finally
    //   26   53:astore_3        
    // try 54 56 handler(s) 53
    //   27   54:aload_2         
    //   28   55:monitorexit     
    //   29   56:aload_3         
    //   30   57:athrow          
    }

    private boolean loadActivitiesIfNeeded()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #115 <Field boolean mReloadActivities>
    //    2    4:istore_1        
    //    3    5:iconst_0        
    //    4    6:istore_2        
    //    5    7:iload_1         
    //    6    8:ifeq            114
    //    7   11:aload_0         
    //    8   12:getfield        #219 <Field Intent mIntent>
    //    9   15:astore_3        
    //   10   16:iconst_0        
    //   11   17:istore_2        
    //   12   18:aload_3         
    //   13   19:ifnull          114
    //   14   22:aload_0         
    //   15   23:iconst_0        
    //   16   24:putfield        #115 <Field boolean mReloadActivities>
    //   17   27:aload_0         
    //   18   28:getfield        #96  <Field List mActivities>
    //   19   31:invokeinterface #222 <Method void List.clear()>
    //   20   36:aload_0         
    //   21   37:getfield        #123 <Field Context mContext>
    //   22   40:invokevirtual   #226 <Method PackageManager Context.getPackageManager()>
    //   23   43:aload_0         
    //   24   44:getfield        #219 <Field Intent mIntent>
    //   25   47:iconst_0        
    //   26   48:invokevirtual   #232 <Method List PackageManager.queryIntentActivities(Intent, int)>
    //   27   51:astore          4
    //   28   53:aload           4
    //   29   55:invokeinterface #236 <Method int List.size()>
    //   30   60:istore          5
    //   31   62:iconst_0        
    //   32   63:istore          6
    //   33   65:iload           6
    //   34   67:iload           5
    //   35   69:icmpge          112
    //   36   72:aload           4
    //   37   74:iload           6
    //   38   76:invokeinterface #239 <Method Object List.get(int)>
    //   39   81:checkcast       #241 <Class ResolveInfo>
    //   40   84:astore          7
    //   41   86:aload_0         
    //   42   87:getfield        #96  <Field List mActivities>
    //   43   90:new             #243 <Class ActivityChooserModel$ActivityResolveInfo>
    //   44   93:dup             
    //   45   94:aload_0         
    //   46   95:aload           7
    //   47   97:invokespecial   #246 <Method void ActivityChooserModel$ActivityResolveInfo(ActivityChooserModel, ResolveInfo)>
    //   48  100:invokeinterface #162 <Method boolean List.add(Object)>
    //   49  105:pop             
    //   50  106:iinc            6  1
    //   51  109:goto            65
    //   52  112:iconst_1        
    //   53  113:istore_2        
    //   54  114:iload_2         
    //   55  115:ireturn         
    }

    private void persistHistoricalDataIfNeeded()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #111 <Field boolean mReadShareHistoryCalled>
    //    2    4:ifne            17
    //    3    7:new             #248 <Class IllegalStateException>
    //    4   10:dup             
    //    5   11:ldc1            #250 <String "No preceding call to #readHistoricalData">
    //    6   13:invokespecial   #253 <Method void IllegalStateException(String)>
    //    7   16:athrow          
    //    8   17:aload_0         
    //    9   18:getfield        #113 <Field boolean mHistoricalRecordsChanged>
    //   10   21:ifne            25
    //   11   24:return          
    //   12   25:aload_0         
    //   13   26:iconst_0        
    //   14   27:putfield        #113 <Field boolean mHistoricalRecordsChanged>
    //   15   30:aload_0         
    //   16   31:getfield        #147 <Field String mHistoryFileName>
    //   17   34:invokestatic    #129 <Method boolean TextUtils.isEmpty(CharSequence)>
    //   18   37:ifne            24
    //   19   40:getstatic       #258 <Field int android.os.Build$VERSION.SDK_INT>
    //   20   43:bipush          11
    //   21   45:icmplt          53
    //   22   48:aload_0         
    //   23   49:invokespecial   #260 <Method void executePersistHistoryAsyncTaskSDK11()>
    //   24   52:return          
    //   25   53:aload_0         
    //   26   54:invokespecial   #262 <Method void executePersistHistoryAsyncTaskBase()>
    //   27   57:return          
    }

    private void pruneExcessiveHistoricalRecordsIfNeeded()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #98  <Field List mHistoricalRecords>
    //    2    4:invokeinterface #236 <Method int List.size()>
    //    3    9:aload_0         
    //    4   10:getfield        #107 <Field int mHistoryMaxSize>
    //    5   13:isub            
    //    6   14:istore_1        
    //    7   15:iload_1         
    //    8   16:ifgt            20
    //    9   19:return          
    //   10   20:aload_0         
    //   11   21:iconst_1        
    //   12   22:putfield        #113 <Field boolean mHistoricalRecordsChanged>
    //   13   25:iconst_0        
    //   14   26:istore_2        
    //   15   27:iload_2         
    //   16   28:iload_1         
    //   17   29:icmpge          19
    //   18   32:aload_0         
    //   19   33:getfield        #98  <Field List mHistoricalRecords>
    //   20   36:iconst_0        
    //   21   37:invokeinterface #265 <Method Object List.remove(int)>
    //   22   42:checkcast       #267 <Class ActivityChooserModel$HistoricalRecord>
    //   23   45:pop             
    //   24   46:iinc            2  1
    //   25   49:goto            27
    }

    private boolean readHistoricalDataIfNeeded()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #109 <Field boolean mCanReadHistoricalData>
    //    2    4:ifeq            40
    //    3    7:aload_0         
    //    4    8:getfield        #113 <Field boolean mHistoricalRecordsChanged>
    //    5   11:ifeq            40
    //    6   14:aload_0         
    //    7   15:getfield        #147 <Field String mHistoryFileName>
    //    8   18:invokestatic    #129 <Method boolean TextUtils.isEmpty(CharSequence)>
    //    9   21:ifne            40
    //   10   24:aload_0         
    //   11   25:iconst_0        
    //   12   26:putfield        #109 <Field boolean mCanReadHistoricalData>
    //   13   29:aload_0         
    //   14   30:iconst_1        
    //   15   31:putfield        #111 <Field boolean mReadShareHistoryCalled>
    //   16   34:aload_0         
    //   17   35:invokespecial   #270 <Method void readHistoricalDataImpl()>
    //   18   38:iconst_1        
    //   19   39:ireturn         
    //   20   40:iconst_0        
    //   21   41:ireturn         
    }

    private void readHistoricalDataImpl()
    {
    // try 0 12 handler(s) 319
    //    0    0:aload_0         
    //    1    1:getfield        #123 <Field Context mContext>
    //    2    4:aload_0         
    //    3    5:getfield        #147 <Field String mHistoryFileName>
    //    4    8:invokevirtual   #280 <Method FileInputStream Context.openFileInput(String)>
    //    5   11:astore_2        
    // try 12 26 handler(s) 79 203 303
    //    6   12:invokestatic    #286 <Method XmlPullParser Xml.newPullParser()>
    //    7   15:astore          11
    //    8   17:aload           11
    //    9   19:aload_2         
    //   10   20:aconst_null     
    //   11   21:invokeinterface #292 <Method void XmlPullParser.setInput(java.io.InputStream, String)>
    //   12   26:iconst_0        
    //   13   27:istore          12
    //   14   29:iload           12
    //   15   31:iconst_1        
    //   16   32:icmpeq          53
    //   17   35:iload           12
    //   18   37:iconst_2        
    //   19   38:icmpeq          53
    // try 41 50 handler(s) 79 203 303
    //   20   41:aload           11
    //   21   43:invokeinterface #295 <Method int XmlPullParser.next()>
    //   22   48:istore          12
    //   23   50:goto            29
    // try 53 79 handler(s) 79 203 303
    //   24   53:ldc1            #40  <String "historical-records">
    //   25   55:aload           11
    //   26   57:invokeinterface #298 <Method String XmlPullParser.getName()>
    //   27   62:invokevirtual   #301 <Method boolean String.equals(Object)>
    //   28   65:ifne            125
    //   29   68:new             #274 <Class XmlPullParserException>
    //   30   71:dup             
    //   31   72:ldc2            #303 <String "Share records file does not start with historical-records tag.">
    //   32   75:invokespecial   #304 <Method void XmlPullParserException(String)>
    //   33   78:athrow          
    // catch XmlPullParserException XmlPullParserException XmlPullParserException XmlPullParserException XmlPullParserException XmlPullParserException XmlPullParserException
    //   34   79:astore          8
    // try 81 113 handler(s) 303
    //   35   81:getstatic       #75  <Field String LOG_TAG>
    //   36   84:new             #137 <Class StringBuilder>
    //   37   87:dup             
    //   38   88:invokespecial   #138 <Method void StringBuilder()>
    //   39   91:ldc2            #306 <String "Error reading historical recrod file: ">
    //   40   94:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
    //   41   97:aload_0         
    //   42   98:getfield        #147 <Field String mHistoryFileName>
    //   43  101:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
    //   44  104:invokevirtual   #145 <Method String StringBuilder.toString()>
    //   45  107:aload           8
    //   46  109:invokestatic    #312 <Method int Log.e(String, String, Throwable)>
    //   47  112:pop             
    //   48  113:aload_2         
    //   49  114:ifnull          320
    // try 117 121 handler(s) 122
    //   50  117:aload_2         
    //   51  118:invokevirtual   #317 <Method void FileInputStream.close()>
    //   52  121:return          
    // catch IOException
    //   53  122:astore          10
    //   54  124:return          
    // try 125 138 handler(s) 79 203 303
    //   55  125:aload_0         
    //   56  126:getfield        #98  <Field List mHistoricalRecords>
    //   57  129:astore          13
    //   58  131:aload           13
    //   59  133:invokeinterface #222 <Method void List.clear()>
    // try 138 147 handler(s) 79 203 303
    //   60  138:aload           11
    //   61  140:invokeinterface #295 <Method int XmlPullParser.next()>
    //   62  145:istore          14
    //   63  147:iload           14
    //   64  149:iconst_1        
    //   65  150:icmpne          165
    //   66  153:aload_2         
    //   67  154:ifnull          320
    // try 157 161 handler(s) 162
    //   68  157:aload_2         
    //   69  158:invokevirtual   #317 <Method void FileInputStream.close()>
    //   70  161:return          
    // catch IOException
    //   71  162:astore          16
    //   72  164:return          
    //   73  165:iload           14
    //   74  167:iconst_3        
    //   75  168:icmpeq          138
    //   76  171:iload           14
    //   77  173:iconst_4        
    //   78  174:icmpeq          138
    // try 177 203 handler(s) 79 203 303
    //   79  177:ldc1            #37  <String "historical-record">
    //   80  179:aload           11
    //   81  181:invokeinterface #298 <Method String XmlPullParser.getName()>
    //   82  186:invokevirtual   #301 <Method boolean String.equals(Object)>
    //   83  189:ifne            249
    //   84  192:new             #274 <Class XmlPullParserException>
    //   85  195:dup             
    //   86  196:ldc2            #319 <String "Share records file not well-formed.">
    //   87  199:invokespecial   #304 <Method void XmlPullParserException(String)>
    //   88  202:athrow          
    // catch IOException IOException IOException IOException IOException IOException IOException
    //   89  203:astore          5
    // try 205 237 handler(s) 303
    //   90  205:getstatic       #75  <Field String LOG_TAG>
    //   91  208:new             #137 <Class StringBuilder>
    //   92  211:dup             
    //   93  212:invokespecial   #138 <Method void StringBuilder()>
    //   94  215:ldc2            #306 <String "Error reading historical recrod file: ">
    //   95  218:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
    //   96  221:aload_0         
    //   97  222:getfield        #147 <Field String mHistoryFileName>
    //   98  225:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
    //   99  228:invokevirtual   #145 <Method String StringBuilder.toString()>
    //  100  231:aload           5
    //  101  233:invokestatic    #312 <Method int Log.e(String, String, Throwable)>
    //  102  236:pop             
    //  103  237:aload_2         
    //  104  238:ifnull          320
    // try 241 245 handler(s) 246
    //  105  241:aload_2         
    //  106  242:invokevirtual   #317 <Method void FileInputStream.close()>
    //  107  245:return          
    // catch IOException
    //  108  246:astore          7
    //  109  248:return          
    // try 249 300 handler(s) 79 203 303
    //  110  249:aload           13
    //  111  251:new             #267 <Class ActivityChooserModel$HistoricalRecord>
    //  112  254:dup             
    //  113  255:aload           11
    //  114  257:aconst_null     
    //  115  258:ldc1            #8   <String "activity">
    //  116  260:invokeinterface #323 <Method String XmlPullParser.getAttributeValue(String, String)>
    //  117  265:aload           11
    //  118  267:aconst_null     
    //  119  268:ldc1            #11  <String "time">
    //  120  270:invokeinterface #323 <Method String XmlPullParser.getAttributeValue(String, String)>
    //  121  275:invokestatic    #329 <Method long Long.parseLong(String)>
    //  122  278:aload           11
    //  123  280:aconst_null     
    //  124  281:ldc1            #14  <String "weight">
    //  125  283:invokeinterface #323 <Method String XmlPullParser.getAttributeValue(String, String)>
    //  126  288:invokestatic    #335 <Method float Float.parseFloat(String)>
    //  127  291:invokespecial   #338 <Method void ActivityChooserModel$HistoricalRecord(String, long, float)>
    //  128  294:invokeinterface #162 <Method boolean List.add(Object)>
    //  129  299:pop             
    //  130  300:goto            138
    // finally
    //  131  303:astore_3        
    //  132  304:aload_2         
    //  133  305:ifnull          312
    // try 308 312 handler(s) 314
    //  134  308:aload_2         
    //  135  309:invokevirtual   #317 <Method void FileInputStream.close()>
    //  136  312:aload_3         
    //  137  313:athrow          
    // catch IOException
    //  138  314:astore          4
    //  139  316:goto            312
    // catch FileNotFoundException
    //  140  319:astore_1        
    //  141  320:return          
    }

    private boolean sortActivitiesIfNeeded()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #105 <Field ActivityChooserModel$ActivitySorter mActivitySorter>
    //    2    4:ifnull          64
    //    3    7:aload_0         
    //    4    8:getfield        #219 <Field Intent mIntent>
    //    5   11:ifnull          64
    //    6   14:aload_0         
    //    7   15:getfield        #96  <Field List mActivities>
    //    8   18:invokeinterface #340 <Method boolean List.isEmpty()>
    //    9   23:ifne            64
    //   10   26:aload_0         
    //   11   27:getfield        #98  <Field List mHistoricalRecords>
    //   12   30:invokeinterface #340 <Method boolean List.isEmpty()>
    //   13   35:ifne            64
    //   14   38:aload_0         
    //   15   39:getfield        #105 <Field ActivityChooserModel$ActivitySorter mActivitySorter>
    //   16   42:aload_0         
    //   17   43:getfield        #219 <Field Intent mIntent>
    //   18   46:aload_0         
    //   19   47:getfield        #96  <Field List mActivities>
    //   20   50:aload_0         
    //   21   51:getfield        #98  <Field List mHistoricalRecords>
    //   22   54:invokestatic    #346 <Method List Collections.unmodifiableList(List)>
    //   23   57:invokeinterface #352 <Method void ActivityChooserModel$ActivitySorter.sort(Intent, List, List)>
    //   24   62:iconst_1        
    //   25   63:ireturn         
    //   26   64:iconst_0        
    //   27   65:ireturn         
    }

    public Intent chooseActivity(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #91  <Field Object mInstanceLock>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:monitorenter    
    // try 7 16 handler(s) 149
    //    5    7:aload_0         
    //    6    8:getfield        #219 <Field Intent mIntent>
    //    7   11:ifnonnull       18
    //    8   14:aload_2         
    //    9   15:monitorexit     
    //   10   16:aconst_null     
    //   11   17:areturn         
    // try 18 124 handler(s) 149
    //   12   18:aload_0         
    //   13   19:invokespecial   #356 <Method void ensureConsistentState()>
    //   14   22:aload_0         
    //   15   23:getfield        #96  <Field List mActivities>
    //   16   26:iload_1         
    //   17   27:invokeinterface #239 <Method Object List.get(int)>
    //   18   32:checkcast       #243 <Class ActivityChooserModel$ActivityResolveInfo>
    //   19   35:astore          4
    //   20   37:new             #358 <Class ComponentName>
    //   21   40:dup             
    //   22   41:aload           4
    //   23   43:getfield        #362 <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
    //   24   46:getfield        #366 <Field ActivityInfo ResolveInfo.activityInfo>
    //   25   49:getfield        #371 <Field String ActivityInfo.packageName>
    //   26   52:aload           4
    //   27   54:getfield        #362 <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
    //   28   57:getfield        #366 <Field ActivityInfo ResolveInfo.activityInfo>
    //   29   60:getfield        #374 <Field String ActivityInfo.name>
    //   30   63:invokespecial   #377 <Method void ComponentName(String, String)>
    //   31   66:astore          5
    //   32   68:new             #379 <Class Intent>
    //   33   71:dup             
    //   34   72:aload_0         
    //   35   73:getfield        #219 <Field Intent mIntent>
    //   36   76:invokespecial   #382 <Method void Intent(Intent)>
    //   37   79:astore          6
    //   38   81:aload           6
    //   39   83:aload           5
    //   40   85:invokevirtual   #386 <Method Intent Intent.setComponent(ComponentName)>
    //   41   88:pop             
    //   42   89:aload_0         
    //   43   90:getfield        #388 <Field ActivityChooserModel$OnChooseActivityListener mActivityChoserModelPolicy>
    //   44   93:ifnull          126
    //   45   96:new             #379 <Class Intent>
    //   46   99:dup             
    //   47  100:aload           6
    //   48  102:invokespecial   #382 <Method void Intent(Intent)>
    //   49  105:astore          8
    //   50  107:aload_0         
    //   51  108:getfield        #388 <Field ActivityChooserModel$OnChooseActivityListener mActivityChoserModelPolicy>
    //   52  111:aload_0         
    //   53  112:aload           8
    //   54  114:invokeinterface #394 <Method boolean ActivityChooserModel$OnChooseActivityListener.onChooseActivity(ActivityChooserModel, Intent)>
    //   55  119:ifeq            126
    //   56  122:aload_2         
    //   57  123:monitorexit     
    //   58  124:aconst_null     
    //   59  125:areturn         
    // try 126 146 handler(s) 149
    //   60  126:aload_0         
    //   61  127:new             #267 <Class ActivityChooserModel$HistoricalRecord>
    //   62  130:dup             
    //   63  131:aload           5
    //   64  133:invokestatic    #400 <Method long System.currentTimeMillis()>
    //   65  136:fconst_1        
    //   66  137:invokespecial   #403 <Method void ActivityChooserModel$HistoricalRecord(ComponentName, long, float)>
    //   67  140:invokespecial   #405 <Method boolean addHisoricalRecord(ActivityChooserModel$HistoricalRecord)>
    //   68  143:pop             
    //   69  144:aload_2         
    //   70  145:monitorexit     
    //   71  146:aload           6
    //   72  148:areturn         
    // finally
    //   73  149:astore_3        
    // try 150 152 handler(s) 149
    //   74  150:aload_2         
    //   75  151:monitorexit     
    //   76  152:aload_3         
    //   77  153:athrow          
    }

    public ResolveInfo getActivity(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #91  <Field Object mInstanceLock>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:monitorenter    
    // try 7 31 handler(s) 34
    //    5    7:aload_0         
    //    6    8:invokespecial   #356 <Method void ensureConsistentState()>
    //    7   11:aload_0         
    //    8   12:getfield        #96  <Field List mActivities>
    //    9   15:iload_1         
    //   10   16:invokeinterface #239 <Method Object List.get(int)>
    //   11   21:checkcast       #243 <Class ActivityChooserModel$ActivityResolveInfo>
    //   12   24:getfield        #362 <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
    //   13   27:astore          4
    //   14   29:aload_2         
    //   15   30:monitorexit     
    //   16   31:aload           4
    //   17   33:areturn         
    // finally
    //   18   34:astore_3        
    // try 35 37 handler(s) 34
    //   19   35:aload_2         
    //   20   36:monitorexit     
    //   21   37:aload_3         
    //   22   38:athrow          
    }

    public int getActivityCount()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #91  <Field Object mInstanceLock>
    //    2    4:astore_1        
    //    3    5:aload_1         
    //    4    6:monitorenter    
    // try 7 23 handler(s) 25
    //    5    7:aload_0         
    //    6    8:invokespecial   #356 <Method void ensureConsistentState()>
    //    7   11:aload_0         
    //    8   12:getfield        #96  <Field List mActivities>
    //    9   15:invokeinterface #236 <Method int List.size()>
    //   10   20:istore_3        
    //   11   21:aload_1         
    //   12   22:monitorexit     
    //   13   23:iload_3         
    //   14   24:ireturn         
    // finally
    //   15   25:astore_2        
    // try 26 28 handler(s) 25
    //   16   26:aload_1         
    //   17   27:monitorexit     
    //   18   28:aload_2         
    //   19   29:athrow          
    }

    public int getActivityIndex(ResolveInfo resolveinfo)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #91  <Field Object mInstanceLock>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:monitorenter    
    // try 7 26 handler(s) 64
    //    5    7:aload_0         
    //    6    8:invokespecial   #356 <Method void ensureConsistentState()>
    //    7   11:aload_0         
    //    8   12:getfield        #96  <Field List mActivities>
    //    9   15:astore          4
    //   10   17:aload           4
    //   11   19:invokeinterface #236 <Method int List.size()>
    //   12   24:istore          5
    //   13   26:iconst_0        
    //   14   27:istore          6
    //   15   29:iload           6
    //   16   31:iload           5
    //   17   33:icmpge          60
    // try 36 57 handler(s) 64
    //   18   36:aload           4
    //   19   38:iload           6
    //   20   40:invokeinterface #239 <Method Object List.get(int)>
    //   21   45:checkcast       #243 <Class ActivityChooserModel$ActivityResolveInfo>
    //   22   48:getfield        #362 <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
    //   23   51:aload_1         
    //   24   52:if_acmpne       69
    //   25   55:aload_2         
    //   26   56:monitorexit     
    //   27   57:iload           6
    //   28   59:ireturn         
    // try 60 62 handler(s) 64
    //   29   60:aload_2         
    //   30   61:monitorexit     
    //   31   62:iconst_m1       
    //   32   63:ireturn         
    // finally
    //   33   64:astore_3        
    // try 65 67 handler(s) 64
    //   34   65:aload_2         
    //   35   66:monitorexit     
    //   36   67:aload_3         
    //   37   68:athrow          
    //   38   69:iinc            6  1
    //   39   72:goto            29
    }

    public ResolveInfo getDefaultActivity()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #91  <Field Object mInstanceLock>
    //    2    4:astore_1        
    //    3    5:aload_1         
    //    4    6:monitorenter    
    // try 7 42 handler(s) 48
    //    5    7:aload_0         
    //    6    8:invokespecial   #356 <Method void ensureConsistentState()>
    //    7   11:aload_0         
    //    8   12:getfield        #96  <Field List mActivities>
    //    9   15:invokeinterface #340 <Method boolean List.isEmpty()>
    //   10   20:ifne            44
    //   11   23:aload_0         
    //   12   24:getfield        #96  <Field List mActivities>
    //   13   27:iconst_0        
    //   14   28:invokeinterface #239 <Method Object List.get(int)>
    //   15   33:checkcast       #243 <Class ActivityChooserModel$ActivityResolveInfo>
    //   16   36:getfield        #362 <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
    //   17   39:astore_3        
    //   18   40:aload_1         
    //   19   41:monitorexit     
    //   20   42:aload_3         
    //   21   43:areturn         
    // try 44 46 handler(s) 48
    //   22   44:aload_1         
    //   23   45:monitorexit     
    //   24   46:aconst_null     
    //   25   47:areturn         
    // finally
    //   26   48:astore_2        
    // try 49 51 handler(s) 48
    //   27   49:aload_1         
    //   28   50:monitorexit     
    //   29   51:aload_2         
    //   30   52:athrow          
    }

    public int getHistoryMaxSize()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #91  <Field Object mInstanceLock>
    //    2    4:astore_1        
    //    3    5:aload_1         
    //    4    6:monitorenter    
    // try 7 14 handler(s) 16
    //    5    7:aload_0         
    //    6    8:getfield        #107 <Field int mHistoryMaxSize>
    //    7   11:istore_3        
    //    8   12:aload_1         
    //    9   13:monitorexit     
    //   10   14:iload_3         
    //   11   15:ireturn         
    // finally
    //   12   16:astore_2        
    // try 17 19 handler(s) 16
    //   13   17:aload_1         
    //   14   18:monitorexit     
    //   15   19:aload_2         
    //   16   20:athrow          
    }

    public int getHistorySize()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #91  <Field Object mInstanceLock>
    //    2    4:astore_1        
    //    3    5:aload_1         
    //    4    6:monitorenter    
    // try 7 23 handler(s) 25
    //    5    7:aload_0         
    //    6    8:invokespecial   #356 <Method void ensureConsistentState()>
    //    7   11:aload_0         
    //    8   12:getfield        #98  <Field List mHistoricalRecords>
    //    9   15:invokeinterface #236 <Method int List.size()>
    //   10   20:istore_3        
    //   11   21:aload_1         
    //   12   22:monitorexit     
    //   13   23:iload_3         
    //   14   24:ireturn         
    // finally
    //   15   25:astore_2        
    // try 26 28 handler(s) 25
    //   16   26:aload_1         
    //   17   27:monitorexit     
    //   18   28:aload_2         
    //   19   29:athrow          
    }

    public Intent getIntent()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #91  <Field Object mInstanceLock>
    //    2    4:astore_1        
    //    3    5:aload_1         
    //    4    6:monitorenter    
    // try 7 14 handler(s) 16
    //    5    7:aload_0         
    //    6    8:getfield        #219 <Field Intent mIntent>
    //    7   11:astore_3        
    //    8   12:aload_1         
    //    9   13:monitorexit     
    //   10   14:aload_3         
    //   11   15:areturn         
    // finally
    //   12   16:astore_2        
    // try 17 19 handler(s) 16
    //   13   17:aload_1         
    //   14   18:monitorexit     
    //   15   19:aload_2         
    //   16   20:athrow          
    }

    public void setActivitySorter(ActivitySorter activitysorter)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #91  <Field Object mInstanceLock>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:monitorenter    
    // try 7 17 handler(s) 37
    //    5    7:aload_0         
    //    6    8:getfield        #105 <Field ActivityChooserModel$ActivitySorter mActivitySorter>
    //    7   11:aload_1         
    //    8   12:if_acmpne       18
    //    9   15:aload_2         
    //   10   16:monitorexit     
    //   11   17:return          
    // try 18 34 handler(s) 37
    //   12   18:aload_0         
    //   13   19:aload_1         
    //   14   20:putfield        #105 <Field ActivityChooserModel$ActivitySorter mActivitySorter>
    //   15   23:aload_0         
    //   16   24:invokespecial   #172 <Method boolean sortActivitiesIfNeeded()>
    //   17   27:ifeq            34
    //   18   30:aload_0         
    //   19   31:invokevirtual   #175 <Method void notifyChanged()>
    // try 34 36 handler(s) 37
    //   20   34:aload_2         
    //   21   35:monitorexit     
    //   22   36:return          
    // finally
    //   23   37:astore_3        
    // try 38 40 handler(s) 37
    //   24   38:aload_2         
    //   25   39:monitorexit     
    //   26   40:aload_3         
    //   27   41:athrow          
    }

    public void setDefaultActivity(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #91  <Field Object mInstanceLock>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:monitorenter    
    // try 7 41 handler(s) 112
    //    5    7:aload_0         
    //    6    8:invokespecial   #356 <Method void ensureConsistentState()>
    //    7   11:aload_0         
    //    8   12:getfield        #96  <Field List mActivities>
    //    9   15:iload_1         
    //   10   16:invokeinterface #239 <Method Object List.get(int)>
    //   11   21:checkcast       #243 <Class ActivityChooserModel$ActivityResolveInfo>
    //   12   24:astore          4
    //   13   26:aload_0         
    //   14   27:getfield        #96  <Field List mActivities>
    //   15   30:iconst_0        
    //   16   31:invokeinterface #239 <Method Object List.get(int)>
    //   17   36:checkcast       #243 <Class ActivityChooserModel$ActivityResolveInfo>
    //   18   39:astore          5
    //   19   41:aload           5
    //   20   43:ifnull          117
    // try 46 63 handler(s) 112
    //   21   46:ldc2            #421 <Float 5F>
    //   22   49:aload           5
    //   23   51:getfield        #423 <Field float ActivityChooserModel$ActivityResolveInfo.weight>
    //   24   54:aload           4
    //   25   56:getfield        #423 <Field float ActivityChooserModel$ActivityResolveInfo.weight>
    //   26   59:fsub            
    //   27   60:fadd            
    //   28   61:fstore          6
    // try 63 111 handler(s) 112
    //   29   63:aload_0         
    //   30   64:new             #267 <Class ActivityChooserModel$HistoricalRecord>
    //   31   67:dup             
    //   32   68:new             #358 <Class ComponentName>
    //   33   71:dup             
    //   34   72:aload           4
    //   35   74:getfield        #362 <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
    //   36   77:getfield        #366 <Field ActivityInfo ResolveInfo.activityInfo>
    //   37   80:getfield        #371 <Field String ActivityInfo.packageName>
    //   38   83:aload           4
    //   39   85:getfield        #362 <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
    //   40   88:getfield        #366 <Field ActivityInfo ResolveInfo.activityInfo>
    //   41   91:getfield        #374 <Field String ActivityInfo.name>
    //   42   94:invokespecial   #377 <Method void ComponentName(String, String)>
    //   43   97:invokestatic    #400 <Method long System.currentTimeMillis()>
    //   44  100:fload           6
    //   45  102:invokespecial   #403 <Method void ActivityChooserModel$HistoricalRecord(ComponentName, long, float)>
    //   46  105:invokespecial   #405 <Method boolean addHisoricalRecord(ActivityChooserModel$HistoricalRecord)>
    //   47  108:pop             
    //   48  109:aload_2         
    //   49  110:monitorexit     
    //   50  111:return          
    // finally
    //   51  112:astore_3        
    // try 113 115 handler(s) 112
    //   52  113:aload_2         
    //   53  114:monitorexit     
    //   54  115:aload_3         
    //   55  116:athrow          
    //   56  117:fconst_1        
    //   57  118:fstore          6
    //   58  120:goto            63
    }

    public void setHistoryMaxSize(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #91  <Field Object mInstanceLock>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:monitorenter    
    // try 7 17 handler(s) 41
    //    5    7:aload_0         
    //    6    8:getfield        #107 <Field int mHistoryMaxSize>
    //    7   11:iload_1         
    //    8   12:icmpne          18
    //    9   15:aload_2         
    //   10   16:monitorexit     
    //   11   17:return          
    // try 18 38 handler(s) 41
    //   12   18:aload_0         
    //   13   19:iload_1         
    //   14   20:putfield        #107 <Field int mHistoryMaxSize>
    //   15   23:aload_0         
    //   16   24:invokespecial   #165 <Method void pruneExcessiveHistoricalRecordsIfNeeded()>
    //   17   27:aload_0         
    //   18   28:invokespecial   #172 <Method boolean sortActivitiesIfNeeded()>
    //   19   31:ifeq            38
    //   20   34:aload_0         
    //   21   35:invokevirtual   #175 <Method void notifyChanged()>
    // try 38 40 handler(s) 41
    //   22   38:aload_2         
    //   23   39:monitorexit     
    //   24   40:return          
    // finally
    //   25   41:astore_3        
    // try 42 44 handler(s) 41
    //   26   42:aload_2         
    //   27   43:monitorexit     
    //   28   44:aload_3         
    //   29   45:athrow          
    }

    public void setIntent(Intent intent)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #91  <Field Object mInstanceLock>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:monitorenter    
    // try 7 17 handler(s) 35
    //    5    7:aload_0         
    //    6    8:getfield        #219 <Field Intent mIntent>
    //    7   11:aload_1         
    //    8   12:if_acmpne       18
    //    9   15:aload_2         
    //   10   16:monitorexit     
    //   11   17:return          
    // try 18 34 handler(s) 35
    //   12   18:aload_0         
    //   13   19:aload_1         
    //   14   20:putfield        #219 <Field Intent mIntent>
    //   15   23:aload_0         
    //   16   24:iconst_1        
    //   17   25:putfield        #115 <Field boolean mReloadActivities>
    //   18   28:aload_0         
    //   19   29:invokespecial   #356 <Method void ensureConsistentState()>
    //   20   32:aload_2         
    //   21   33:monitorexit     
    //   22   34:return          
    // finally
    //   23   35:astore_3        
    // try 36 38 handler(s) 35
    //   24   36:aload_2         
    //   25   37:monitorexit     
    //   26   38:aload_3         
    //   27   39:athrow          
    }

    public void setOnChooseActivityListener(OnChooseActivityListener onchooseactivitylistener)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #91  <Field Object mInstanceLock>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:monitorenter    
    // try 7 14 handler(s) 15
    //    5    7:aload_0         
    //    6    8:aload_1         
    //    7    9:putfield        #388 <Field ActivityChooserModel$OnChooseActivityListener mActivityChoserModelPolicy>
    //    8   12:aload_2         
    //    9   13:monitorexit     
    //   10   14:return          
    // finally
    //   11   15:astore_3        
    // try 16 18 handler(s) 15
    //   12   16:aload_2         
    //   13   17:monitorexit     
    //   14   18:aload_3         
    //   15   19:athrow          
    }

    private static final String ATTRIBUTE_ACTIVITY = "activity";
    private static final String ATTRIBUTE_TIME = "time";
    private static final String ATTRIBUTE_WEIGHT = "weight";
    private static final boolean DEBUG = false;
    private static final int DEFAULT_ACTIVITY_INFLATION = 5;
    private static final float DEFAULT_HISTORICAL_RECORD_WEIGHT = 1F;
    public static final String DEFAULT_HISTORY_FILE_NAME = "activity_choser_model_history.xml";
    public static final int DEFAULT_HISTORY_MAX_LENGTH = 50;
    private static final String HISTORY_FILE_EXTENSION = ".xml";
    private static final int INVALID_INDEX = -1;
    private static final String LOG_TAG;
    private static final String TAG_HISTORICAL_RECORD = "historical-record";
    private static final String TAG_HISTORICAL_RECORDS = "historical-records";
    private static final Map sDataModelRegistry;
    private static final Object sRegistryLock;
    private final List mActivities;
    private OnChooseActivityListener mActivityChoserModelPolicy;
    private ActivitySorter mActivitySorter;
    private boolean mCanReadHistoricalData;
    private final Context mContext;
    private final List mHistoricalRecords;
    private boolean mHistoricalRecordsChanged;
    private final String mHistoryFileName;
    private int mHistoryMaxSize;
    private final Object mInstanceLock;
    private Intent mIntent;
    private boolean mReadShareHistoryCalled;
    private boolean mReloadActivities;

    static Context access$200(ActivityChooserModel activitychoosermodel)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #123 <Field Context mContext>
    //    2    4:areturn         
    }

    static String access$300()
    {
    //    0    0:getstatic       #75  <Field String LOG_TAG>
    //    1    3:areturn         
    }

    static String access$400(ActivityChooserModel activitychoosermodel)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #147 <Field String mHistoryFileName>
    //    2    4:areturn         
    }

    static boolean access$502(ActivityChooserModel activitychoosermodel, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #109 <Field boolean mCanReadHistoricalData>
    //    3    5:iload_1         
    //    4    6:ireturn         
    }

    // Unreferenced inner class android/support/v7/internal/widget/ActivityChooserModel$1

/* anonymous class */
    static class _cls1
    {
    }

}
