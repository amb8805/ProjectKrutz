// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.android.apps.analytics;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.*;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.SecureRandom;
import java.util.*;

// Referenced classes of package com.google.android.apps.analytics:
//            HitStore, Utils, Referrer, Event, 
//            CustomVariableBuffer, CustomVariable, Hit, GoogleAnalyticsTracker, 
//            HitBuilder, Item, Transaction

class PersistentHitStore
    implements HitStore
{
    static class DataBaseHelper extends SQLiteOpenHelper
    {

        public DataBaseHelper(Context context, PersistentHitStore persistenthitstore)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:ldc1            #12  <String "google_analytics.db">
        //    3    4:iconst_5        
        //    4    5:aload_2         
        //    5    6:invokespecial   #15  <Method void PersistentHitStore$DataBaseHelper(Context, String, int, PersistentHitStore)>
        //    6    9:return          
        }

        DataBaseHelper(Context context, String s, int i, PersistentHitStore persistenthitstore)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aload_2         
        //    3    3:aconst_null     
        //    4    4:iload_3         
        //    5    5:invokespecial   #18  <Method void SQLiteOpenHelper(Context, String, android.database.sqlite.SQLiteDatabase$CursorFactory, int)>
        //    6    8:aload_0         
        //    7    9:iload_3         
        //    8   10:putfield        #20  <Field int databaseVersion>
        //    9   13:aload_0         
        //   10   14:aload           4
        //   11   16:putfield        #22  <Field PersistentHitStore store>
        //   12   19:return          
        }

        public DataBaseHelper(Context context, String s, PersistentHitStore persistenthitstore)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:aload_2         
        //    3    3:iconst_5        
        //    4    4:aload_3         
        //    5    5:invokespecial   #15  <Method void PersistentHitStore$DataBaseHelper(Context, String, int, PersistentHitStore)>
        //    6    8:return          
        }

        private void createECommerceTables(SQLiteDatabase sqlitedatabase)
        {
        //    0    0:aload_1         
        //    1    1:ldc1            #27  <String "DROP TABLE IF EXISTS transaction_events;">
        //    2    3:invokevirtual   #33  <Method void SQLiteDatabase.execSQL(String)>
        //    3    6:aload_1         
        //    4    7:invokestatic    #39  <Method String PersistentHitStore.access$400()>
        //    5   10:invokevirtual   #33  <Method void SQLiteDatabase.execSQL(String)>
        //    6   13:aload_1         
        //    7   14:ldc1            #41  <String "DROP TABLE IF EXISTS item_events;">
        //    8   16:invokevirtual   #33  <Method void SQLiteDatabase.execSQL(String)>
        //    9   19:aload_1         
        //   10   20:invokestatic    #44  <Method String PersistentHitStore.access$500()>
        //   11   23:invokevirtual   #33  <Method void SQLiteDatabase.execSQL(String)>
        //   12   26:return          
        }

        private void createHitTable(SQLiteDatabase sqlitedatabase)
        {
        //    0    0:aload_1         
        //    1    1:ldc1            #47  <String "DROP TABLE IF EXISTS hits;">
        //    2    3:invokevirtual   #33  <Method void SQLiteDatabase.execSQL(String)>
        //    3    6:aload_1         
        //    4    7:invokestatic    #50  <Method String PersistentHitStore.access$600()>
        //    5   10:invokevirtual   #33  <Method void SQLiteDatabase.execSQL(String)>
        //    6   13:return          
        }

        private void createReferrerTable(SQLiteDatabase sqlitedatabase)
        {
        //    0    0:aload_1         
        //    1    1:ldc1            #53  <String "DROP TABLE IF EXISTS referrer;">
        //    2    3:invokevirtual   #33  <Method void SQLiteDatabase.execSQL(String)>
        //    3    6:aload_1         
        //    4    7:ldc1            #55  <String "CREATE TABLE IF NOT EXISTS referrer (referrer TEXT PRIMARY KEY NOT NULL,timestamp_referrer INTEGER NOT NULL,referrer_visit INTEGER NOT NULL DEFAULT 1,referrer_index INTEGER NOT NULL DEFAULT 1);">
        //    5    9:invokevirtual   #33  <Method void SQLiteDatabase.execSQL(String)>
        //    6   12:return          
        }

        private void fixReferrerTable(SQLiteDatabase sqlitedatabase)
        {
        // try 0 14 handler(s) 317 358
        //    0    0:aload_1         
        //    1    1:ldc1            #60  <String "referrer">
        //    2    3:aconst_null     
        //    3    4:aconst_null     
        //    4    5:aconst_null     
        //    5    6:aconst_null     
        //    6    7:aconst_null     
        //    7    8:aconst_null     
        //    8    9:invokevirtual   #64  <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
        //    9   12:astore          9
        //   10   14:aload           9
        //   11   16:astore_3        
        // try 17 25 handler(s) 396 385
        //   12   17:aload_3         
        //   13   18:invokeinterface #70  <Method String[] Cursor.getColumnNames()>
        //   14   23:astore          10
        //   15   25:iconst_0        
        //   16   26:istore          11
        //   17   28:iconst_0        
        //   18   29:istore          12
        //   19   31:iconst_0        
        //   20   32:istore          13
        // try 34 55 handler(s) 396 385
        //   21   34:iload           11
        //   22   36:aload           10
        //   23   38:arraylength     
        //   24   39:icmpge          416
        //   25   42:aload           10
        //   26   44:iload           11
        //   27   46:aaload          
        //   28   47:ldc1            #72  <String "referrer_index">
        //   29   49:invokevirtual   #78  <Method boolean String.equals(Object)>
        //   30   52:ifeq            61
        //   31   55:iconst_1        
        //   32   56:istore          13
        //   33   58:goto            410
        // try 61 74 handler(s) 396 385
        //   34   61:aload           10
        //   35   63:iload           11
        //   36   65:aaload          
        //   37   66:ldc1            #80  <String "referrer_visit">
        //   38   68:invokevirtual   #78  <Method boolean String.equals(Object)>
        //   39   71:ifeq            410
        //   40   74:iconst_1        
        //   41   75:istore          12
        //   42   77:goto            410
        // try 80 141 handler(s) 396 385
        //   43   80:aload_3         
        //   44   81:invokeinterface #84  <Method boolean Cursor.moveToFirst()>
        //   45   86:ifeq            404
        //   46   89:aload_3         
        //   47   90:ldc1            #80  <String "referrer_visit">
        //   48   92:invokeinterface #88  <Method int Cursor.getColumnIndex(String)>
        //   49   97:istore          19
        //   50   99:aload_3         
        //   51  100:ldc1            #72  <String "referrer_index">
        //   52  102:invokeinterface #88  <Method int Cursor.getColumnIndex(String)>
        //   53  107:istore          20
        //   54  109:aload_3         
        //   55  110:aload_3         
        //   56  111:ldc1            #60  <String "referrer">
        //   57  113:invokeinterface #88  <Method int Cursor.getColumnIndex(String)>
        //   58  118:invokeinterface #92  <Method String Cursor.getString(int)>
        //   59  123:astore          21
        //   60  125:aload_3         
        //   61  126:aload_3         
        //   62  127:ldc1            #94  <String "timestamp_referrer">
        //   63  129:invokeinterface #88  <Method int Cursor.getColumnIndex(String)>
        //   64  134:invokeinterface #98  <Method long Cursor.getLong(int)>
        //   65  139:lstore          22
        //   66  141:iload           19
        //   67  143:iconst_m1       
        //   68  144:icmpne          287
        //   69  147:iconst_1        
        //   70  148:istore          24
        //   71  150:goto            429
        // try 153 170 handler(s) 396 385
        //   72  153:new             #100 <Class Referrer>
        //   73  156:dup             
        //   74  157:aload           21
        //   75  159:lload           22
        //   76  161:iload           24
        //   77  163:iload           26
        //   78  165:invokespecial   #103 <Method void Referrer(String, long, int, int)>
        //   79  168:astore          14
        // try 170 179 handler(s) 396 385
        //   80  170:aload_1         
        //   81  171:invokevirtual   #107 <Method void SQLiteDatabase.beginTransaction()>
        //   82  174:aload_0         
        //   83  175:aload_1         
        //   84  176:invokespecial   #109 <Method void createReferrerTable(SQLiteDatabase)>
        //   85  179:aload           14
        //   86  181:ifnull          260
        // try 184 260 handler(s) 396 385
        //   87  184:new             #111 <Class ContentValues>
        //   88  187:dup             
        //   89  188:invokespecial   #113 <Method void ContentValues()>
        //   90  191:astore          15
        //   91  193:aload           15
        //   92  195:ldc1            #60  <String "referrer">
        //   93  197:aload           14
        //   94  199:invokevirtual   #116 <Method String Referrer.getReferrerString()>
        //   95  202:invokevirtual   #120 <Method void ContentValues.put(String, String)>
        //   96  205:aload           15
        //   97  207:ldc1            #94  <String "timestamp_referrer">
        //   98  209:aload           14
        //   99  211:invokevirtual   #124 <Method long Referrer.getTimeStamp()>
        //  100  214:invokestatic    #130 <Method Long Long.valueOf(long)>
        //  101  217:invokevirtual   #133 <Method void ContentValues.put(String, Long)>
        //  102  220:aload           15
        //  103  222:ldc1            #80  <String "referrer_visit">
        //  104  224:aload           14
        //  105  226:invokevirtual   #137 <Method int Referrer.getVisit()>
        //  106  229:invokestatic    #142 <Method Integer Integer.valueOf(int)>
        //  107  232:invokevirtual   #145 <Method void ContentValues.put(String, Integer)>
        //  108  235:aload           15
        //  109  237:ldc1            #72  <String "referrer_index">
        //  110  239:aload           14
        //  111  241:invokevirtual   #148 <Method int Referrer.getIndex()>
        //  112  244:invokestatic    #142 <Method Integer Integer.valueOf(int)>
        //  113  247:invokevirtual   #145 <Method void ContentValues.put(String, Integer)>
        //  114  250:aload_1         
        //  115  251:ldc1            #60  <String "referrer">
        //  116  253:aconst_null     
        //  117  254:aload           15
        //  118  256:invokevirtual   #152 <Method long SQLiteDatabase.insert(String, String, ContentValues)>
        //  119  259:pop2            
        // try 260 264 handler(s) 396 385
        //  120  260:aload_1         
        //  121  261:invokevirtual   #155 <Method void SQLiteDatabase.setTransactionSuccessful()>
        //  122  264:aload_3         
        //  123  265:ifnull          274
        //  124  268:aload_3         
        //  125  269:invokeinterface #158 <Method void Cursor.close()>
        //  126  274:aload_1         
        //  127  275:invokevirtual   #161 <Method boolean SQLiteDatabase.inTransaction()>
        //  128  278:ifeq            286
        //  129  281:aload_1         
        //  130  282:invokestatic    #165 <Method boolean PersistentHitStore.access$900(SQLiteDatabase)>
        //  131  285:pop             
        //  132  286:return          
        // try 287 297 handler(s) 396 385
        //  133  287:aload_3         
        //  134  288:iload           19
        //  135  290:invokeinterface #169 <Method int Cursor.getInt(int)>
        //  136  295:istore          24
        //  137  297:goto            429
        // try 300 310 handler(s) 396 385
        //  138  300:aload_3         
        //  139  301:iload           20
        //  140  303:invokeinterface #169 <Method int Cursor.getInt(int)>
        //  141  308:istore          25
        //  142  310:iload           25
        //  143  312:istore          26
        //  144  314:goto            153
        // catch SQLiteException
        //  145  317:astore          5
        //  146  319:aconst_null     
        //  147  320:astore          6
        // try 322 333 handler(s) 389
        //  148  322:ldc1            #171 <String "GoogleAnalyticsTracker">
        //  149  324:aload           5
        //  150  326:invokevirtual   #174 <Method String SQLiteException.toString()>
        //  151  329:invokestatic    #180 <Method int Log.e(String, String)>
        //  152  332:pop             
        //  153  333:aload           6
        //  154  335:ifnull          345
        //  155  338:aload           6
        //  156  340:invokeinterface #158 <Method void Cursor.close()>
        //  157  345:aload_1         
        //  158  346:invokevirtual   #161 <Method boolean SQLiteDatabase.inTransaction()>
        //  159  349:ifeq            286
        //  160  352:aload_1         
        //  161  353:invokestatic    #165 <Method boolean PersistentHitStore.access$900(SQLiteDatabase)>
        //  162  356:pop             
        //  163  357:return          
        // finally
        //  164  358:astore_2        
        //  165  359:aconst_null     
        //  166  360:astore_3        
        //  167  361:aload_3         
        //  168  362:ifnull          371
        //  169  365:aload_3         
        //  170  366:invokeinterface #158 <Method void Cursor.close()>
        //  171  371:aload_1         
        //  172  372:invokevirtual   #161 <Method boolean SQLiteDatabase.inTransaction()>
        //  173  375:ifeq            383
        //  174  378:aload_1         
        //  175  379:invokestatic    #165 <Method boolean PersistentHitStore.access$900(SQLiteDatabase)>
        //  176  382:pop             
        //  177  383:aload_2         
        //  178  384:athrow          
        // finally
        //  179  385:astore_2        
        //  180  386:goto            361
        // finally
        //  181  389:astore_2        
        //  182  390:aload           6
        //  183  392:astore_3        
        //  184  393:goto            361
        // catch SQLiteException SQLiteException SQLiteException SQLiteException SQLiteException SQLiteException SQLiteException SQLiteException SQLiteException SQLiteException
        //  185  396:astore          5
        //  186  398:aload_3         
        //  187  399:astore          6
        //  188  401:goto            322
        //  189  404:aconst_null     
        //  190  405:astore          14
        //  191  407:goto            170
        //  192  410:iinc            11  1
        //  193  413:goto            34
        //  194  416:iload           13
        //  195  418:ifeq            80
        //  196  421:iload           12
        //  197  423:ifne            264
        //  198  426:goto            80
        //  199  429:iload           20
        //  200  431:iconst_m1       
        //  201  432:icmpne          300
        //  202  435:iconst_1        
        //  203  436:istore          26
        //  204  438:goto            153
        }

        private void migrateEventsToHits(SQLiteDatabase sqlitedatabase, int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #22  <Field PersistentHitStore store>
        //    2    4:aload_1         
        //    3    5:invokevirtual   #185 <Method void PersistentHitStore.loadExistingSession(SQLiteDatabase)>
        //    4    8:aload_0         
        //    5    9:getfield        #22  <Field PersistentHitStore store>
        //    6   12:aload_0         
        //    7   13:getfield        #22  <Field PersistentHitStore store>
        //    8   16:aload_1         
        //    9   17:invokevirtual   #189 <Method CustomVariableBuffer PersistentHitStore.getVisitorVarBuffer(SQLiteDatabase)>
        //   10   20:invokestatic    #193 <Method CustomVariableBuffer PersistentHitStore.access$702(PersistentHitStore, CustomVariableBuffer)>
        //   11   23:pop             
        //   12   24:aload_0         
        //   13   25:getfield        #22  <Field PersistentHitStore store>
        //   14   28:sipush          1000
        //   15   31:aload_1         
        //   16   32:iload_2         
        //   17   33:invokevirtual   #197 <Method Event[] PersistentHitStore.peekEvents(int, SQLiteDatabase, int)>
        //   18   36:astore          4
        //   19   38:iconst_0        
        //   20   39:istore          5
        //   21   41:iload           5
        //   22   43:aload           4
        //   23   45:arraylength     
        //   24   46:icmpge          69
        //   25   49:aload_0         
        //   26   50:getfield        #22  <Field PersistentHitStore store>
        //   27   53:aload           4
        //   28   55:iload           5
        //   29   57:aaload          
        //   30   58:aload_1         
        //   31   59:iconst_0        
        //   32   60:invokestatic    #201 <Method void PersistentHitStore.access$800(PersistentHitStore, Event, SQLiteDatabase, boolean)>
        //   33   63:iinc            5  1
        //   34   66:goto            41
        //   35   69:aload_1         
        //   36   70:ldc1            #203 <String "DELETE from events;">
        //   37   72:invokevirtual   #33  <Method void SQLiteDatabase.execSQL(String)>
        //   38   75:aload_1         
        //   39   76:ldc1            #205 <String "DELETE from item_events;">
        //   40   78:invokevirtual   #33  <Method void SQLiteDatabase.execSQL(String)>
        //   41   81:aload_1         
        //   42   82:ldc1            #207 <String "DELETE from transaction_events;">
        //   43   84:invokevirtual   #33  <Method void SQLiteDatabase.execSQL(String)>
        //   44   87:aload_1         
        //   45   88:ldc1            #209 <String "DELETE from custom_variables;">
        //   46   90:invokevirtual   #33  <Method void SQLiteDatabase.execSQL(String)>
        //   47   93:return          
        }

        private void migratePreV4Referrer(SQLiteDatabase sqlitedatabase)
        {
        //    0    0:aconst_null     
        //    1    1:astore_2        
        // try 2 24 handler(s) 173 212
        //    2    2:aload_1         
        //    3    3:ldc1            #212 <String "install_referrer">
        //    4    5:iconst_1        
        //    5    6:anewarray       String[]
        //    6    9:dup             
        //    7   10:iconst_0        
        //    8   11:ldc1            #60  <String "referrer">
        //    9   13:aastore         
        //   10   14:aconst_null     
        //   11   15:aconst_null     
        //   12   16:aconst_null     
        //   13   17:aconst_null     
        //   14   18:aconst_null     
        //   15   19:invokevirtual   #64  <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
        //   16   22:astore          8
        //   17   24:aload           8
        //   18   26:astore          5
        // try 28 62 handler(s) 263 245
        //   19   28:aload           5
        //   20   30:invokeinterface #84  <Method boolean Cursor.moveToFirst()>
        //   21   35:ifeq            288
        //   22   38:aload           5
        //   23   40:iconst_0        
        //   24   41:invokeinterface #92  <Method String Cursor.getString(int)>
        //   25   46:astore          9
        //   26   48:aload_1         
        //   27   49:ldc1            #214 <String "session">
        //   28   51:aconst_null     
        //   29   52:aconst_null     
        //   30   53:aconst_null     
        //   31   54:aconst_null     
        //   32   55:aconst_null     
        //   33   56:aconst_null     
        //   34   57:invokevirtual   #64  <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
        //   35   60:astore          10
        //   36   62:aload           10
        //   37   64:astore          4
        // try 66 86 handler(s) 274 252
        //   38   66:aload           4
        //   39   68:invokeinterface #84  <Method boolean Cursor.moveToFirst()>
        //   40   73:ifeq            282
        //   41   76:aload           4
        //   42   78:iconst_0        
        //   43   79:invokeinterface #98  <Method long Cursor.getLong(int)>
        //   44   84:lstore          11
        // try 86 148 handler(s) 274 252
        //   45   86:new             #111 <Class ContentValues>
        //   46   89:dup             
        //   47   90:invokespecial   #113 <Method void ContentValues()>
        //   48   93:astore          13
        //   49   95:aload           13
        //   50   97:ldc1            #60  <String "referrer">
        //   51   99:aload           9
        //   52  101:invokevirtual   #120 <Method void ContentValues.put(String, String)>
        //   53  104:aload           13
        //   54  106:ldc1            #94  <String "timestamp_referrer">
        //   55  108:lload           11
        //   56  110:invokestatic    #130 <Method Long Long.valueOf(long)>
        //   57  113:invokevirtual   #133 <Method void ContentValues.put(String, Long)>
        //   58  116:aload           13
        //   59  118:ldc1            #80  <String "referrer_visit">
        //   60  120:iconst_1        
        //   61  121:invokestatic    #142 <Method Integer Integer.valueOf(int)>
        //   62  124:invokevirtual   #145 <Method void ContentValues.put(String, Integer)>
        //   63  127:aload           13
        //   64  129:ldc1            #72  <String "referrer_index">
        //   65  131:iconst_1        
        //   66  132:invokestatic    #142 <Method Integer Integer.valueOf(int)>
        //   67  135:invokevirtual   #145 <Method void ContentValues.put(String, Integer)>
        //   68  138:aload_1         
        //   69  139:ldc1            #60  <String "referrer">
        //   70  141:aconst_null     
        //   71  142:aload           13
        //   72  144:invokevirtual   #152 <Method long SQLiteDatabase.insert(String, String, ContentValues)>
        //   73  147:pop2            
        //   74  148:aload           5
        //   75  150:ifnull          160
        //   76  153:aload           5
        //   77  155:invokeinterface #158 <Method void Cursor.close()>
        //   78  160:aload           4
        //   79  162:ifnull          172
        //   80  165:aload           4
        //   81  167:invokeinterface #158 <Method void Cursor.close()>
        //   82  172:return          
        // catch SQLiteException
        //   83  173:astore          6
        //   84  175:aconst_null     
        //   85  176:astore          4
        // try 178 189 handler(s) 256
        //   86  178:ldc1            #171 <String "GoogleAnalyticsTracker">
        //   87  180:aload           6
        //   88  182:invokevirtual   #174 <Method String SQLiteException.toString()>
        //   89  185:invokestatic    #180 <Method int Log.e(String, String)>
        //   90  188:pop             
        //   91  189:aload_2         
        //   92  190:ifnull          199
        //   93  193:aload_2         
        //   94  194:invokeinterface #158 <Method void Cursor.close()>
        //   95  199:aload           4
        //   96  201:ifnull          172
        //   97  204:aload           4
        //   98  206:invokeinterface #158 <Method void Cursor.close()>
        //   99  211:return          
        // finally
        //  100  212:astore_3        
        //  101  213:aconst_null     
        //  102  214:astore          4
        //  103  216:aconst_null     
        //  104  217:astore          5
        //  105  219:aload           5
        //  106  221:ifnull          231
        //  107  224:aload           5
        //  108  226:invokeinterface #158 <Method void Cursor.close()>
        //  109  231:aload           4
        //  110  233:ifnull          243
        //  111  236:aload           4
        //  112  238:invokeinterface #158 <Method void Cursor.close()>
        //  113  243:aload_3         
        //  114  244:athrow          
        // finally
        //  115  245:astore_3        
        //  116  246:aconst_null     
        //  117  247:astore          4
        //  118  249:goto            219
        // finally
        //  119  252:astore_3        
        //  120  253:goto            219
        // finally
        //  121  256:astore_3        
        //  122  257:aload_2         
        //  123  258:astore          5
        //  124  260:goto            219
        // catch SQLiteException
        //  125  263:astore          6
        //  126  265:aload           5
        //  127  267:astore_2        
        //  128  268:aconst_null     
        //  129  269:astore          4
        //  130  271:goto            178
        // catch SQLiteException SQLiteException
        //  131  274:astore          6
        //  132  276:aload           5
        //  133  278:astore_2        
        //  134  279:goto            178
        //  135  282:lconst_0        
        //  136  283:lstore          11
        //  137  285:goto            86
        //  138  288:aconst_null     
        //  139  289:astore          4
        //  140  291:goto            148
        }

        void createCustomVariableTables(SQLiteDatabase sqlitedatabase)
        {
        //    0    0:aload_1         
        //    1    1:ldc1            #217 <String "DROP TABLE IF EXISTS custom_variables;">
        //    2    3:invokevirtual   #33  <Method void SQLiteDatabase.execSQL(String)>
        //    3    6:aload_1         
        //    4    7:invokestatic    #220 <Method String PersistentHitStore.access$200()>
        //    5   10:invokevirtual   #33  <Method void SQLiteDatabase.execSQL(String)>
        //    6   13:aload_1         
        //    7   14:ldc1            #222 <String "DROP TABLE IF EXISTS custom_var_cache;">
        //    8   16:invokevirtual   #33  <Method void SQLiteDatabase.execSQL(String)>
        //    9   19:aload_1         
        //   10   20:invokestatic    #225 <Method String PersistentHitStore.access$300()>
        //   11   23:invokevirtual   #33  <Method void SQLiteDatabase.execSQL(String)>
        //   12   26:iconst_1        
        //   13   27:istore_2        
        //   14   28:iload_2         
        //   15   29:iconst_5        
        //   16   30:icmpgt          103
        //   17   33:new             #111 <Class ContentValues>
        //   18   36:dup             
        //   19   37:invokespecial   #113 <Method void ContentValues()>
        //   20   40:astore_3        
        //   21   41:aload_3         
        //   22   42:ldc1            #227 <String "event_id">
        //   23   44:iconst_0        
        //   24   45:invokestatic    #142 <Method Integer Integer.valueOf(int)>
        //   25   48:invokevirtual   #145 <Method void ContentValues.put(String, Integer)>
        //   26   51:aload_3         
        //   27   52:ldc1            #229 <String "cv_index">
        //   28   54:iload_2         
        //   29   55:invokestatic    #142 <Method Integer Integer.valueOf(int)>
        //   30   58:invokevirtual   #145 <Method void ContentValues.put(String, Integer)>
        //   31   61:aload_3         
        //   32   62:ldc1            #231 <String "cv_name">
        //   33   64:ldc1            #233 <String "">
        //   34   66:invokevirtual   #120 <Method void ContentValues.put(String, String)>
        //   35   69:aload_3         
        //   36   70:ldc1            #235 <String "cv_scope">
        //   37   72:iconst_3        
        //   38   73:invokestatic    #142 <Method Integer Integer.valueOf(int)>
        //   39   76:invokevirtual   #145 <Method void ContentValues.put(String, Integer)>
        //   40   79:aload_3         
        //   41   80:ldc1            #237 <String "cv_value">
        //   42   82:ldc1            #233 <String "">
        //   43   84:invokevirtual   #120 <Method void ContentValues.put(String, String)>
        //   44   87:aload_1         
        //   45   88:ldc1            #239 <String "custom_var_cache">
        //   46   90:ldc1            #227 <String "event_id">
        //   47   92:aload_3         
        //   48   93:invokevirtual   #152 <Method long SQLiteDatabase.insert(String, String, ContentValues)>
        //   49   96:pop2            
        //   50   97:iinc            2  1
        //   51  100:goto            28
        //   52  103:return          
        }

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
        //    0    0:aload_1         
        //    1    1:ldc1            #242 <String "DROP TABLE IF EXISTS events;">
        //    2    3:invokevirtual   #33  <Method void SQLiteDatabase.execSQL(String)>
        //    3    6:aload_1         
        //    4    7:invokestatic    #245 <Method String PersistentHitStore.access$000()>
        //    5   10:invokevirtual   #33  <Method void SQLiteDatabase.execSQL(String)>
        //    6   13:aload_1         
        //    7   14:ldc1            #247 <String "DROP TABLE IF EXISTS install_referrer;">
        //    8   16:invokevirtual   #33  <Method void SQLiteDatabase.execSQL(String)>
        //    9   19:aload_1         
        //   10   20:ldc1            #249 <String "CREATE TABLE install_referrer (referrer TEXT PRIMARY KEY NOT NULL);">
        //   11   22:invokevirtual   #33  <Method void SQLiteDatabase.execSQL(String)>
        //   12   25:aload_1         
        //   13   26:ldc1            #251 <String "DROP TABLE IF EXISTS session;">
        //   14   28:invokevirtual   #33  <Method void SQLiteDatabase.execSQL(String)>
        //   15   31:aload_1         
        //   16   32:invokestatic    #254 <Method String PersistentHitStore.access$100()>
        //   17   35:invokevirtual   #33  <Method void SQLiteDatabase.execSQL(String)>
        //   18   38:aload_0         
        //   19   39:getfield        #20  <Field int databaseVersion>
        //   20   42:iconst_1        
        //   21   43:icmple          51
        //   22   46:aload_0         
        //   23   47:aload_1         
        //   24   48:invokevirtual   #256 <Method void createCustomVariableTables(SQLiteDatabase)>
        //   25   51:aload_0         
        //   26   52:getfield        #20  <Field int databaseVersion>
        //   27   55:iconst_2        
        //   28   56:icmple          64
        //   29   59:aload_0         
        //   30   60:aload_1         
        //   31   61:invokespecial   #258 <Method void createECommerceTables(SQLiteDatabase)>
        //   32   64:aload_0         
        //   33   65:getfield        #20  <Field int databaseVersion>
        //   34   68:iconst_3        
        //   35   69:icmple          82
        //   36   72:aload_0         
        //   37   73:aload_1         
        //   38   74:invokespecial   #260 <Method void createHitTable(SQLiteDatabase)>
        //   39   77:aload_0         
        //   40   78:aload_1         
        //   41   79:invokespecial   #109 <Method void createReferrerTable(SQLiteDatabase)>
        //   42   82:return          
        }

        public void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
        //    0    0:ldc1            #171 <String "GoogleAnalyticsTracker">
        //    1    2:new             #264 <Class StringBuilder>
        //    2    5:dup             
        //    3    6:invokespecial   #265 <Method void StringBuilder()>
        //    4    9:ldc2            #267 <String "Downgrading database version from ">
        //    5   12:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
        //    6   15:iload_2         
        //    7   16:invokevirtual   #274 <Method StringBuilder StringBuilder.append(int)>
        //    8   19:ldc2            #276 <String " to ">
        //    9   22:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
        //   10   25:iload_3         
        //   11   26:invokevirtual   #274 <Method StringBuilder StringBuilder.append(int)>
        //   12   29:ldc2            #278 <String " not recommended.">
        //   13   32:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
        //   14   35:invokevirtual   #279 <Method String StringBuilder.toString()>
        //   15   38:invokestatic    #282 <Method int Log.w(String, String)>
        //   16   41:pop             
        //   17   42:aload_1         
        //   18   43:ldc1            #55  <String "CREATE TABLE IF NOT EXISTS referrer (referrer TEXT PRIMARY KEY NOT NULL,timestamp_referrer INTEGER NOT NULL,referrer_visit INTEGER NOT NULL DEFAULT 1,referrer_index INTEGER NOT NULL DEFAULT 1);">
        //   19   45:invokevirtual   #33  <Method void SQLiteDatabase.execSQL(String)>
        //   20   48:aload_1         
        //   21   49:invokestatic    #50  <Method String PersistentHitStore.access$600()>
        //   22   52:invokevirtual   #33  <Method void SQLiteDatabase.execSQL(String)>
        //   23   55:aload_1         
        //   24   56:invokestatic    #225 <Method String PersistentHitStore.access$300()>
        //   25   59:invokevirtual   #33  <Method void SQLiteDatabase.execSQL(String)>
        //   26   62:aload_1         
        //   27   63:invokestatic    #254 <Method String PersistentHitStore.access$100()>
        //   28   66:invokevirtual   #33  <Method void SQLiteDatabase.execSQL(String)>
        //   29   69:new             #284 <Class HashSet>
        //   30   72:dup             
        //   31   73:invokespecial   #285 <Method void HashSet()>
        //   32   76:astore          5
        //   33   78:aload_1         
        //   34   79:ldc1            #239 <String "custom_var_cache">
        //   35   81:aconst_null     
        //   36   82:aconst_null     
        //   37   83:aconst_null     
        //   38   84:aconst_null     
        //   39   85:aconst_null     
        //   40   86:aconst_null     
        //   41   87:aconst_null     
        //   42   88:invokevirtual   #288 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String, String)>
        //   43   91:astore          6
        // try 93 130 handler(s) 133 284
        //   44   93:aload           6
        //   45   95:invokeinterface #291 <Method boolean Cursor.moveToNext()>
        //   46  100:ifeq            274
        //   47  103:aload           5
        //   48  105:aload           6
        //   49  107:aload           6
        //   50  109:ldc1            #229 <String "cv_index">
        //   51  111:invokeinterface #88  <Method int Cursor.getColumnIndex(String)>
        //   52  116:invokeinterface #169 <Method int Cursor.getInt(int)>
        //   53  121:invokestatic    #142 <Method Integer Integer.valueOf(int)>
        //   54  124:invokeinterface #296 <Method boolean Set.add(Object)>
        //   55  129:pop             
        //   56  130:goto            93
        // catch SQLiteException
        //   57  133:astore          8
        // try 135 165 handler(s) 284
        //   58  135:ldc1            #171 <String "GoogleAnalyticsTracker">
        //   59  137:new             #264 <Class StringBuilder>
        //   60  140:dup             
        //   61  141:invokespecial   #265 <Method void StringBuilder()>
        //   62  144:ldc2            #298 <String "Error on downgrade: ">
        //   63  147:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
        //   64  150:aload           8
        //   65  152:invokevirtual   #174 <Method String SQLiteException.toString()>
        //   66  155:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
        //   67  158:invokevirtual   #279 <Method String StringBuilder.toString()>
        //   68  161:invokestatic    #180 <Method int Log.e(String, String)>
        //   69  164:pop             
        //   70  165:aload           6
        //   71  167:invokeinterface #158 <Method void Cursor.close()>
        //   72  172:iconst_1        
        //   73  173:istore          10
        //   74  175:iload           10
        //   75  177:iconst_5        
        //   76  178:icmpgt          331
        // try 181 268 handler(s) 296
        //   77  181:aload           5
        //   78  183:iload           10
        //   79  185:invokestatic    #142 <Method Integer Integer.valueOf(int)>
        //   80  188:invokeinterface #301 <Method boolean Set.contains(Object)>
        //   81  193:ifne            268
        //   82  196:new             #111 <Class ContentValues>
        //   83  199:dup             
        //   84  200:invokespecial   #113 <Method void ContentValues()>
        //   85  203:astore          13
        //   86  205:aload           13
        //   87  207:ldc1            #227 <String "event_id">
        //   88  209:iconst_0        
        //   89  210:invokestatic    #142 <Method Integer Integer.valueOf(int)>
        //   90  213:invokevirtual   #145 <Method void ContentValues.put(String, Integer)>
        //   91  216:aload           13
        //   92  218:ldc1            #229 <String "cv_index">
        //   93  220:iload           10
        //   94  222:invokestatic    #142 <Method Integer Integer.valueOf(int)>
        //   95  225:invokevirtual   #145 <Method void ContentValues.put(String, Integer)>
        //   96  228:aload           13
        //   97  230:ldc1            #231 <String "cv_name">
        //   98  232:ldc1            #233 <String "">
        //   99  234:invokevirtual   #120 <Method void ContentValues.put(String, String)>
        //  100  237:aload           13
        //  101  239:ldc1            #235 <String "cv_scope">
        //  102  241:iconst_3        
        //  103  242:invokestatic    #142 <Method Integer Integer.valueOf(int)>
        //  104  245:invokevirtual   #145 <Method void ContentValues.put(String, Integer)>
        //  105  248:aload           13
        //  106  250:ldc1            #237 <String "cv_value">
        //  107  252:ldc1            #233 <String "">
        //  108  254:invokevirtual   #120 <Method void ContentValues.put(String, String)>
        //  109  257:aload_1         
        //  110  258:ldc1            #239 <String "custom_var_cache">
        //  111  260:ldc1            #227 <String "event_id">
        //  112  262:aload           13
        //  113  264:invokevirtual   #152 <Method long SQLiteDatabase.insert(String, String, ContentValues)>
        //  114  267:pop2            
        //  115  268:iinc            10  1
        //  116  271:goto            175
        //  117  274:aload           6
        //  118  276:invokeinterface #158 <Method void Cursor.close()>
        //  119  281:goto            172
        // finally
        //  120  284:astore          7
        //  121  286:aload           6
        //  122  288:invokeinterface #158 <Method void Cursor.close()>
        //  123  293:aload           7
        //  124  295:athrow          
        // catch SQLiteException
        //  125  296:astore          11
        //  126  298:ldc1            #171 <String "GoogleAnalyticsTracker">
        //  127  300:new             #264 <Class StringBuilder>
        //  128  303:dup             
        //  129  304:invokespecial   #265 <Method void StringBuilder()>
        //  130  307:ldc2            #303 <String "Error inserting custom variable on downgrade: ">
        //  131  310:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
        //  132  313:aload           11
        //  133  315:invokevirtual   #174 <Method String SQLiteException.toString()>
        //  134  318:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
        //  135  321:invokevirtual   #279 <Method String StringBuilder.toString()>
        //  136  324:invokestatic    #180 <Method int Log.e(String, String)>
        //  137  327:pop             
        //  138  328:goto            268
        //  139  331:return          
        }

        public void onOpen(SQLiteDatabase sqlitedatabase)
        {
        //    0    0:aload_1         
        //    1    1:invokevirtual   #307 <Method boolean SQLiteDatabase.isReadOnly()>
        //    2    4:ifeq            17
        //    3    7:ldc1            #171 <String "GoogleAnalyticsTracker">
        //    4    9:ldc2            #309 <String "Warning: Need to update database, but it's read only.">
        //    5   12:invokestatic    #282 <Method int Log.w(String, String)>
        //    6   15:pop             
        //    7   16:return          
        //    8   17:aload_0         
        //    9   18:aload_1         
        //   10   19:invokespecial   #311 <Method void fixReferrerTable(SQLiteDatabase)>
        //   11   22:return          
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
        //    0    0:iload_2         
        //    1    1:iload_3         
        //    2    2:icmple          13
        //    3    5:aload_0         
        //    4    6:aload_1         
        //    5    7:iload_2         
        //    6    8:iload_3         
        //    7    9:invokevirtual   #314 <Method void onDowngrade(SQLiteDatabase, int, int)>
        //    8   12:return          
        //    9   13:iload_2         
        //   10   14:iconst_2        
        //   11   15:icmpge          28
        //   12   18:iload_3         
        //   13   19:iconst_1        
        //   14   20:icmple          28
        //   15   23:aload_0         
        //   16   24:aload_1         
        //   17   25:invokevirtual   #256 <Method void createCustomVariableTables(SQLiteDatabase)>
        //   18   28:iload_2         
        //   19   29:iconst_3        
        //   20   30:icmpge          43
        //   21   33:iload_3         
        //   22   34:iconst_2        
        //   23   35:icmple          43
        //   24   38:aload_0         
        //   25   39:aload_1         
        //   26   40:invokespecial   #258 <Method void createECommerceTables(SQLiteDatabase)>
        //   27   43:iload_2         
        //   28   44:iconst_4        
        //   29   45:icmpge          12
        //   30   48:iload_3         
        //   31   49:iconst_3        
        //   32   50:icmple          12
        //   33   53:aload_0         
        //   34   54:aload_1         
        //   35   55:invokespecial   #260 <Method void createHitTable(SQLiteDatabase)>
        //   36   58:aload_0         
        //   37   59:aload_1         
        //   38   60:invokespecial   #109 <Method void createReferrerTable(SQLiteDatabase)>
        //   39   63:aload_0         
        //   40   64:aload_1         
        //   41   65:iload_2         
        //   42   66:invokespecial   #316 <Method void migrateEventsToHits(SQLiteDatabase, int)>
        //   43   69:aload_0         
        //   44   70:aload_1         
        //   45   71:invokespecial   #318 <Method void migratePreV4Referrer(SQLiteDatabase)>
        //   46   74:return          
        }

        private final int databaseVersion;
        private final PersistentHitStore store;
    }


    static 
    {
    //    0    0:new             #170 <Class StringBuilder>
    //    1    3:dup             
    //    2    4:invokespecial   #173 <Method void StringBuilder()>
    //    3    7:ldc1            #175 <String "CREATE TABLE events (">
    //    4    9:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //    5   12:ldc1            #181 <String " '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,">
    //    6   14:iconst_1        
    //    7   15:anewarray       Object[]
    //    8   18:dup             
    //    9   19:iconst_0        
    //   10   20:ldc1            #56  <String "event_id">
    //   11   22:aastore         
    //   12   23:invokestatic    #187 <Method String String.format(String, Object[])>
    //   13   26:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //   14   29:ldc1            #189 <String " '%s' INTEGER NOT NULL,">
    //   15   31:iconst_1        
    //   16   32:anewarray       Object[]
    //   17   35:dup             
    //   18   36:iconst_0        
    //   19   37:ldc1            #143 <String "user_id">
    //   20   39:aastore         
    //   21   40:invokestatic    #187 <Method String String.format(String, Object[])>
    //   22   43:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //   23   46:ldc1            #191 <String " '%s' CHAR(256) NOT NULL,">
    //   24   48:iconst_1        
    //   25   49:anewarray       Object[]
    //   26   52:dup             
    //   27   53:iconst_0        
    //   28   54:ldc1            #10  <String "account_id">
    //   29   56:aastore         
    //   30   57:invokestatic    #187 <Method String String.format(String, Object[])>
    //   31   60:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //   32   63:ldc1            #189 <String " '%s' INTEGER NOT NULL,">
    //   33   65:iconst_1        
    //   34   66:anewarray       Object[]
    //   35   69:dup             
    //   36   70:iconst_0        
    //   37   71:ldc1            #94  <String "random_val">
    //   38   73:aastore         
    //   39   74:invokestatic    #187 <Method String String.format(String, Object[])>
    //   40   77:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //   41   80:ldc1            #189 <String " '%s' INTEGER NOT NULL,">
    //   42   82:iconst_1        
    //   43   83:anewarray       Object[]
    //   44   86:dup             
    //   45   87:iconst_0        
    //   46   88:ldc1            #125 <String "timestamp_first">
    //   47   90:aastore         
    //   48   91:invokestatic    #187 <Method String String.format(String, Object[])>
    //   49   94:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //   50   97:ldc1            #189 <String " '%s' INTEGER NOT NULL,">
    //   51   99:iconst_1        
    //   52  100:anewarray       Object[]
    //   53  103:dup             
    //   54  104:iconst_0        
    //   55  105:ldc1            #128 <String "timestamp_previous">
    //   56  107:aastore         
    //   57  108:invokestatic    #187 <Method String String.format(String, Object[])>
    //   58  111:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //   59  114:ldc1            #189 <String " '%s' INTEGER NOT NULL,">
    //   60  116:iconst_1        
    //   61  117:anewarray       Object[]
    //   62  120:dup             
    //   63  121:iconst_0        
    //   64  122:ldc1            #122 <String "timestamp_current">
    //   65  124:aastore         
    //   66  125:invokestatic    #187 <Method String String.format(String, Object[])>
    //   67  128:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //   68  131:ldc1            #189 <String " '%s' INTEGER NOT NULL,">
    //   69  133:iconst_1        
    //   70  134:anewarray       Object[]
    //   71  137:dup             
    //   72  138:iconst_0        
    //   73  139:ldc1            #149 <String "visits">
    //   74  141:aastore         
    //   75  142:invokestatic    #187 <Method String String.format(String, Object[])>
    //   76  145:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //   77  148:ldc1            #191 <String " '%s' CHAR(256) NOT NULL,">
    //   78  150:iconst_1        
    //   79  151:anewarray       Object[]
    //   80  154:dup             
    //   81  155:iconst_0        
    //   82  156:ldc1            #16  <String "category">
    //   83  158:aastore         
    //   84  159:invokestatic    #187 <Method String String.format(String, Object[])>
    //   85  162:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //   86  165:ldc1            #191 <String " '%s' CHAR(256) NOT NULL,">
    //   87  167:iconst_1        
    //   88  168:anewarray       Object[]
    //   89  171:dup             
    //   90  172:iconst_0        
    //   91  173:ldc1            #13  <String "action">
    //   92  175:aastore         
    //   93  176:invokestatic    #187 <Method String String.format(String, Object[])>
    //   94  179:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //   95  182:ldc1            #193 <String " '%s' CHAR(256), ">
    //   96  184:iconst_1        
    //   97  185:anewarray       Object[]
    //   98  188:dup             
    //   99  189:iconst_0        
    //  100  190:ldc1            #86  <String "label">
    //  101  192:aastore         
    //  102  193:invokestatic    #187 <Method String String.format(String, Object[])>
    //  103  196:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  104  199:ldc1            #195 <String " '%s' INTEGER,">
    //  105  201:iconst_1        
    //  106  202:anewarray       Object[]
    //  107  205:dup             
    //  108  206:iconst_0        
    //  109  207:ldc1            #146 <String "value">
    //  110  209:aastore         
    //  111  210:invokestatic    #187 <Method String String.format(String, Object[])>
    //  112  213:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  113  216:ldc1            #195 <String " '%s' INTEGER,">
    //  114  218:iconst_1        
    //  115  219:anewarray       Object[]
    //  116  222:dup             
    //  117  223:iconst_0        
    //  118  224:ldc1            #110 <String "screen_width">
    //  119  226:aastore         
    //  120  227:invokestatic    #187 <Method String String.format(String, Object[])>
    //  121  230:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  122  233:ldc1            #197 <String " '%s' INTEGER);">
    //  123  235:iconst_1        
    //  124  236:anewarray       Object[]
    //  125  239:dup             
    //  126  240:iconst_0        
    //  127  241:ldc1            #107 <String "screen_height">
    //  128  243:aastore         
    //  129  244:invokestatic    #187 <Method String String.format(String, Object[])>
    //  130  247:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  131  250:invokevirtual   #201 <Method String StringBuilder.toString()>
    //  132  253:putstatic       #203 <Field String CREATE_EVENTS_TABLE>
    //  133  256:new             #170 <Class StringBuilder>
    //  134  259:dup             
    //  135  260:invokespecial   #173 <Method void StringBuilder()>
    //  136  263:ldc1            #205 <String "CREATE TABLE IF NOT EXISTS session (">
    //  137  265:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  138  268:ldc1            #207 <String " '%s' INTEGER PRIMARY KEY,">
    //  139  270:iconst_1        
    //  140  271:anewarray       Object[]
    //  141  274:dup             
    //  142  275:iconst_0        
    //  143  276:ldc1            #125 <String "timestamp_first">
    //  144  278:aastore         
    //  145  279:invokestatic    #187 <Method String String.format(String, Object[])>
    //  146  282:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  147  285:ldc1            #189 <String " '%s' INTEGER NOT NULL,">
    //  148  287:iconst_1        
    //  149  288:anewarray       Object[]
    //  150  291:dup             
    //  151  292:iconst_0        
    //  152  293:ldc1            #128 <String "timestamp_previous">
    //  153  295:aastore         
    //  154  296:invokestatic    #187 <Method String String.format(String, Object[])>
    //  155  299:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  156  302:ldc1            #189 <String " '%s' INTEGER NOT NULL,">
    //  157  304:iconst_1        
    //  158  305:anewarray       Object[]
    //  159  308:dup             
    //  160  309:iconst_0        
    //  161  310:ldc1            #122 <String "timestamp_current">
    //  162  312:aastore         
    //  163  313:invokestatic    #187 <Method String String.format(String, Object[])>
    //  164  316:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  165  319:ldc1            #189 <String " '%s' INTEGER NOT NULL,">
    //  166  321:iconst_1        
    //  167  322:anewarray       Object[]
    //  168  325:dup             
    //  169  326:iconst_0        
    //  170  327:ldc1            #149 <String "visits">
    //  171  329:aastore         
    //  172  330:invokestatic    #187 <Method String String.format(String, Object[])>
    //  173  333:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  174  336:ldc1            #209 <String " '%s' INTEGER NOT NULL);">
    //  175  338:iconst_1        
    //  176  339:anewarray       Object[]
    //  177  342:dup             
    //  178  343:iconst_0        
    //  179  344:ldc1            #116 <String "store_id">
    //  180  346:aastore         
    //  181  347:invokestatic    #187 <Method String String.format(String, Object[])>
    //  182  350:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  183  353:invokevirtual   #201 <Method String StringBuilder.toString()>
    //  184  356:putstatic       #211 <Field String CREATE_SESSION_TABLE>
    //  185  359:new             #170 <Class StringBuilder>
    //  186  362:dup             
    //  187  363:invokespecial   #173 <Method void StringBuilder()>
    //  188  366:ldc1            #213 <String "CREATE TABLE custom_variables (">
    //  189  368:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  190  371:ldc1            #181 <String " '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,">
    //  191  373:iconst_1        
    //  192  374:anewarray       Object[]
    //  193  377:dup             
    //  194  378:iconst_0        
    //  195  379:ldc1            #32  <String "cv_id">
    //  196  381:aastore         
    //  197  382:invokestatic    #187 <Method String String.format(String, Object[])>
    //  198  385:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  199  388:ldc1            #189 <String " '%s' INTEGER NOT NULL,">
    //  200  390:iconst_1        
    //  201  391:anewarray       Object[]
    //  202  394:dup             
    //  203  395:iconst_0        
    //  204  396:ldc1            #56  <String "event_id">
    //  205  398:aastore         
    //  206  399:invokestatic    #187 <Method String String.format(String, Object[])>
    //  207  402:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  208  405:ldc1            #189 <String " '%s' INTEGER NOT NULL,">
    //  209  407:iconst_1        
    //  210  408:anewarray       Object[]
    //  211  411:dup             
    //  212  412:iconst_0        
    //  213  413:ldc1            #35  <String "cv_index">
    //  214  415:aastore         
    //  215  416:invokestatic    #187 <Method String String.format(String, Object[])>
    //  216  419:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  217  422:ldc1            #215 <String " '%s' CHAR(64) NOT NULL,">
    //  218  424:iconst_1        
    //  219  425:anewarray       Object[]
    //  220  428:dup             
    //  221  429:iconst_0        
    //  222  430:ldc1            #38  <String "cv_name">
    //  223  432:aastore         
    //  224  433:invokestatic    #187 <Method String String.format(String, Object[])>
    //  225  436:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  226  439:ldc1            #215 <String " '%s' CHAR(64) NOT NULL,">
    //  227  441:iconst_1        
    //  228  442:anewarray       Object[]
    //  229  445:dup             
    //  230  446:iconst_0        
    //  231  447:ldc1            #44  <String "cv_value">
    //  232  449:aastore         
    //  233  450:invokestatic    #187 <Method String String.format(String, Object[])>
    //  234  453:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  235  456:ldc1            #209 <String " '%s' INTEGER NOT NULL);">
    //  236  458:iconst_1        
    //  237  459:anewarray       Object[]
    //  238  462:dup             
    //  239  463:iconst_0        
    //  240  464:ldc1            #41  <String "cv_scope">
    //  241  466:aastore         
    //  242  467:invokestatic    #187 <Method String String.format(String, Object[])>
    //  243  470:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  244  473:invokevirtual   #201 <Method String StringBuilder.toString()>
    //  245  476:putstatic       #217 <Field String CREATE_CUSTOM_VARIABLES_TABLE>
    //  246  479:new             #170 <Class StringBuilder>
    //  247  482:dup             
    //  248  483:invokespecial   #173 <Method void StringBuilder()>
    //  249  486:ldc1            #219 <String "CREATE TABLE IF NOT EXISTS custom_var_cache (">
    //  250  488:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  251  491:ldc1            #181 <String " '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,">
    //  252  493:iconst_1        
    //  253  494:anewarray       Object[]
    //  254  497:dup             
    //  255  498:iconst_0        
    //  256  499:ldc1            #32  <String "cv_id">
    //  257  501:aastore         
    //  258  502:invokestatic    #187 <Method String String.format(String, Object[])>
    //  259  505:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  260  508:ldc1            #189 <String " '%s' INTEGER NOT NULL,">
    //  261  510:iconst_1        
    //  262  511:anewarray       Object[]
    //  263  514:dup             
    //  264  515:iconst_0        
    //  265  516:ldc1            #56  <String "event_id">
    //  266  518:aastore         
    //  267  519:invokestatic    #187 <Method String String.format(String, Object[])>
    //  268  522:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  269  525:ldc1            #189 <String " '%s' INTEGER NOT NULL,">
    //  270  527:iconst_1        
    //  271  528:anewarray       Object[]
    //  272  531:dup             
    //  273  532:iconst_0        
    //  274  533:ldc1            #35  <String "cv_index">
    //  275  535:aastore         
    //  276  536:invokestatic    #187 <Method String String.format(String, Object[])>
    //  277  539:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  278  542:ldc1            #215 <String " '%s' CHAR(64) NOT NULL,">
    //  279  544:iconst_1        
    //  280  545:anewarray       Object[]
    //  281  548:dup             
    //  282  549:iconst_0        
    //  283  550:ldc1            #38  <String "cv_name">
    //  284  552:aastore         
    //  285  553:invokestatic    #187 <Method String String.format(String, Object[])>
    //  286  556:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  287  559:ldc1            #215 <String " '%s' CHAR(64) NOT NULL,">
    //  288  561:iconst_1        
    //  289  562:anewarray       Object[]
    //  290  565:dup             
    //  291  566:iconst_0        
    //  292  567:ldc1            #44  <String "cv_value">
    //  293  569:aastore         
    //  294  570:invokestatic    #187 <Method String String.format(String, Object[])>
    //  295  573:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  296  576:ldc1            #209 <String " '%s' INTEGER NOT NULL);">
    //  297  578:iconst_1        
    //  298  579:anewarray       Object[]
    //  299  582:dup             
    //  300  583:iconst_0        
    //  301  584:ldc1            #41  <String "cv_scope">
    //  302  586:aastore         
    //  303  587:invokestatic    #187 <Method String String.format(String, Object[])>
    //  304  590:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  305  593:invokevirtual   #201 <Method String StringBuilder.toString()>
    //  306  596:putstatic       #221 <Field String CREATE_CUSTOM_VAR_CACHE_TABLE>
    //  307  599:new             #170 <Class StringBuilder>
    //  308  602:dup             
    //  309  603:invokespecial   #173 <Method void StringBuilder()>
    //  310  606:ldc1            #223 <String "CREATE TABLE transaction_events (">
    //  311  608:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  312  611:ldc1            #181 <String " '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,">
    //  313  613:iconst_1        
    //  314  614:anewarray       Object[]
    //  315  617:dup             
    //  316  618:iconst_0        
    //  317  619:ldc1            #140 <String "tran_id">
    //  318  621:aastore         
    //  319  622:invokestatic    #187 <Method String String.format(String, Object[])>
    //  320  625:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  321  628:ldc1            #189 <String " '%s' INTEGER NOT NULL,">
    //  322  630:iconst_1        
    //  323  631:anewarray       Object[]
    //  324  634:dup             
    //  325  635:iconst_0        
    //  326  636:ldc1            #56  <String "event_id">
    //  327  638:aastore         
    //  328  639:invokestatic    #187 <Method String String.format(String, Object[])>
    //  329  642:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  330  645:ldc1            #225 <String " '%s' TEXT NOT NULL,">
    //  331  647:iconst_1        
    //  332  648:anewarray       Object[]
    //  333  651:dup             
    //  334  652:iconst_0        
    //  335  653:ldc1            #91  <String "order_id">
    //  336  655:aastore         
    //  337  656:invokestatic    #187 <Method String String.format(String, Object[])>
    //  338  659:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  339  662:ldc1            #227 <String " '%s' TEXT,">
    //  340  664:iconst_1        
    //  341  665:anewarray       Object[]
    //  342  668:dup             
    //  343  669:iconst_0        
    //  344  670:ldc1            #119 <String "tran_storename">
    //  345  672:aastore         
    //  346  673:invokestatic    #187 <Method String String.format(String, Object[])>
    //  347  676:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  348  679:ldc1            #225 <String " '%s' TEXT NOT NULL,">
    //  349  681:iconst_1        
    //  350  682:anewarray       Object[]
    //  351  685:dup             
    //  352  686:iconst_0        
    //  353  687:ldc1            #134 <String "tran_totalcost">
    //  354  689:aastore         
    //  355  690:invokestatic    #187 <Method String String.format(String, Object[])>
    //  356  693:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  357  696:ldc1            #227 <String " '%s' TEXT,">
    //  358  698:iconst_1        
    //  359  699:anewarray       Object[]
    //  360  702:dup             
    //  361  703:iconst_0        
    //  362  704:ldc1            #137 <String "tran_totaltax">
    //  363  706:aastore         
    //  364  707:invokestatic    #187 <Method String String.format(String, Object[])>
    //  365  710:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  366  713:ldc1            #229 <String " '%s' TEXT);">
    //  367  715:iconst_1        
    //  368  716:anewarray       Object[]
    //  369  719:dup             
    //  370  720:iconst_0        
    //  371  721:ldc1            #113 <String "tran_shippingcost">
    //  372  723:aastore         
    //  373  724:invokestatic    #187 <Method String String.format(String, Object[])>
    //  374  727:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  375  730:invokevirtual   #201 <Method String StringBuilder.toString()>
    //  376  733:putstatic       #231 <Field String CREATE_TRANSACTION_EVENTS_TABLE>
    //  377  736:new             #170 <Class StringBuilder>
    //  378  739:dup             
    //  379  740:invokespecial   #173 <Method void StringBuilder()>
    //  380  743:ldc1            #233 <String "CREATE TABLE item_events (">
    //  381  745:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  382  748:ldc1            #181 <String " '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,">
    //  383  750:iconst_1        
    //  384  751:anewarray       Object[]
    //  385  754:dup             
    //  386  755:iconst_0        
    //  387  756:ldc1            #74  <String "item_id">
    //  388  758:aastore         
    //  389  759:invokestatic    #187 <Method String String.format(String, Object[])>
    //  390  762:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  391  765:ldc1            #189 <String " '%s' INTEGER NOT NULL,">
    //  392  767:iconst_1        
    //  393  768:anewarray       Object[]
    //  394  771:dup             
    //  395  772:iconst_0        
    //  396  773:ldc1            #56  <String "event_id">
    //  397  775:aastore         
    //  398  776:invokestatic    #187 <Method String String.format(String, Object[])>
    //  399  779:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  400  782:ldc1            #225 <String " '%s' TEXT NOT NULL,">
    //  401  784:iconst_1        
    //  402  785:anewarray       Object[]
    //  403  788:dup             
    //  404  789:iconst_0        
    //  405  790:ldc1            #91  <String "order_id">
    //  406  792:aastore         
    //  407  793:invokestatic    #187 <Method String String.format(String, Object[])>
    //  408  796:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  409  799:ldc1            #225 <String " '%s' TEXT NOT NULL,">
    //  410  801:iconst_1        
    //  411  802:anewarray       Object[]
    //  412  805:dup             
    //  413  806:iconst_0        
    //  414  807:ldc1            #83  <String "item_sku">
    //  415  809:aastore         
    //  416  810:invokestatic    #187 <Method String String.format(String, Object[])>
    //  417  813:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  418  816:ldc1            #227 <String " '%s' TEXT,">
    //  419  818:iconst_1        
    //  420  819:anewarray       Object[]
    //  421  822:dup             
    //  422  823:iconst_0        
    //  423  824:ldc1            #77  <String "item_name">
    //  424  826:aastore         
    //  425  827:invokestatic    #187 <Method String String.format(String, Object[])>
    //  426  830:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  427  833:ldc1            #227 <String " '%s' TEXT,">
    //  428  835:iconst_1        
    //  429  836:anewarray       Object[]
    //  430  839:dup             
    //  431  840:iconst_0        
    //  432  841:ldc1            #68  <String "item_category">
    //  433  843:aastore         
    //  434  844:invokestatic    #187 <Method String String.format(String, Object[])>
    //  435  847:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  436  850:ldc1            #225 <String " '%s' TEXT NOT NULL,">
    //  437  852:iconst_1        
    //  438  853:anewarray       Object[]
    //  439  856:dup             
    //  440  857:iconst_0        
    //  441  858:ldc1            #80  <String "item_price">
    //  442  860:aastore         
    //  443  861:invokestatic    #187 <Method String String.format(String, Object[])>
    //  444  864:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  445  867:ldc1            #235 <String " '%s' TEXT NOT NULL);">
    //  446  869:iconst_1        
    //  447  870:anewarray       Object[]
    //  448  873:dup             
    //  449  874:iconst_0        
    //  450  875:ldc1            #71  <String "item_count">
    //  451  877:aastore         
    //  452  878:invokestatic    #187 <Method String String.format(String, Object[])>
    //  453  881:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  454  884:invokevirtual   #201 <Method String StringBuilder.toString()>
    //  455  887:putstatic       #237 <Field String CREATE_ITEM_EVENTS_TABLE>
    //  456  890:new             #170 <Class StringBuilder>
    //  457  893:dup             
    //  458  894:invokespecial   #173 <Method void StringBuilder()>
    //  459  897:ldc1            #239 <String "CREATE TABLE IF NOT EXISTS hits (">
    //  460  899:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  461  902:ldc1            #181 <String " '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,">
    //  462  904:iconst_1        
    //  463  905:anewarray       Object[]
    //  464  908:dup             
    //  465  909:iconst_0        
    //  466  910:ldc1            #59  <String "hit_id">
    //  467  912:aastore         
    //  468  913:invokestatic    #187 <Method String String.format(String, Object[])>
    //  469  916:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  470  919:ldc1            #225 <String " '%s' TEXT NOT NULL,">
    //  471  921:iconst_1        
    //  472  922:anewarray       Object[]
    //  473  925:dup             
    //  474  926:iconst_0        
    //  475  927:ldc1            #62  <String "hit_string">
    //  476  929:aastore         
    //  477  930:invokestatic    #187 <Method String String.format(String, Object[])>
    //  478  933:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  479  936:ldc1            #209 <String " '%s' INTEGER NOT NULL);">
    //  480  938:iconst_1        
    //  481  939:anewarray       Object[]
    //  482  942:dup             
    //  483  943:iconst_0        
    //  484  944:ldc1            #65  <String "hit_time">
    //  485  946:aastore         
    //  486  947:invokestatic    #187 <Method String String.format(String, Object[])>
    //  487  950:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  488  953:invokevirtual   #201 <Method String StringBuilder.toString()>
    //  489  956:putstatic       #241 <Field String CREATE_HITS_TABLE>
    //  490  959:return          
    }

    PersistentHitStore(Context context)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:ldc1            #50  <String "google_analytics.db">
    //    3    4:iconst_5        
    //    4    5:invokespecial   #245 <Method void PersistentHitStore(Context, String, int)>
    //    5    8:return          
    }

    PersistentHitStore(Context context, String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iconst_5        
    //    4    4:invokespecial   #245 <Method void PersistentHitStore(Context, String, int)>
    //    5    7:return          
    }

    PersistentHitStore(Context context, String s, int i)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #247 <Method void Object()>
    //    2    4:aload_0         
    //    3    5:bipush          100
    //    4    7:putfield        #249 <Field int sampleRate>
    //    5   10:aload_0         
    //    6   11:new             #251 <Class Random>
    //    7   14:dup             
    //    8   15:invokespecial   #252 <Method void Random()>
    //    9   18:putfield        #254 <Field Random random>
    //   10   21:aload_0         
    //   11   22:new             #256 <Class PersistentHitStore$DataBaseHelper>
    //   12   25:dup             
    //   13   26:aload_1         
    //   14   27:aload_2         
    //   15   28:iload_3         
    //   16   29:aload_0         
    //   17   30:invokespecial   #259 <Method void PersistentHitStore$DataBaseHelper(Context, String, int, PersistentHitStore)>
    //   18   33:putfield        #261 <Field PersistentHitStore$DataBaseHelper databaseHelper>
    //   19   36:aload_0         
    //   20   37:invokevirtual   #264 <Method void loadExistingSession()>
    //   21   40:aload_0         
    //   22   41:aload_0         
    //   23   42:invokevirtual   #268 <Method CustomVariableBuffer getVisitorVarBuffer()>
    //   24   45:putfield        #270 <Field CustomVariableBuffer visitorCVCache>
    //   25   48:return          
    }

    PersistentHitStore(DataBaseHelper databasehelper)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #247 <Method void Object()>
    //    2    4:aload_0         
    //    3    5:bipush          100
    //    4    7:putfield        #249 <Field int sampleRate>
    //    5   10:aload_0         
    //    6   11:new             #251 <Class Random>
    //    7   14:dup             
    //    8   15:invokespecial   #252 <Method void Random()>
    //    9   18:putfield        #254 <Field Random random>
    //   10   21:aload_0         
    //   11   22:aload_1         
    //   12   23:putfield        #261 <Field PersistentHitStore$DataBaseHelper databaseHelper>
    //   13   26:aload_0         
    //   14   27:invokevirtual   #264 <Method void loadExistingSession()>
    //   15   30:aload_0         
    //   16   31:aload_0         
    //   17   32:invokevirtual   #268 <Method CustomVariableBuffer getVisitorVarBuffer()>
    //   18   35:putfield        #270 <Field CustomVariableBuffer visitorCVCache>
    //   19   38:return          
    }

    static String access$000()
    {
    //    0    0:getstatic       #203 <Field String CREATE_EVENTS_TABLE>
    //    1    3:areturn         
// Previous instruction length mismatch
    //    2    0:getstatic       #203 <Field String CREATE_EVENTS_TABLE>
    //    3    3:areturn         
    }

    static String access$100()
    {
    //    0    0:getstatic       #211 <Field String CREATE_SESSION_TABLE>
    //    1    3:areturn         
// Previous instruction length mismatch
    //    2    0:getstatic       #211 <Field String CREATE_SESSION_TABLE>
    //    3    3:areturn         
    }

    static String access$200()
    {
    //    0    0:getstatic       #217 <Field String CREATE_CUSTOM_VARIABLES_TABLE>
    //    1    3:areturn         
// Previous instruction length mismatch
    //    2    0:getstatic       #217 <Field String CREATE_CUSTOM_VARIABLES_TABLE>
    //    3    3:areturn         
    }

    static String access$300()
    {
    //    0    0:getstatic       #221 <Field String CREATE_CUSTOM_VAR_CACHE_TABLE>
    //    1    3:areturn         
// Previous instruction length mismatch
    //    2    0:getstatic       #221 <Field String CREATE_CUSTOM_VAR_CACHE_TABLE>
    //    3    3:areturn         
    }

    static String access$400()
    {
    //    0    0:getstatic       #231 <Field String CREATE_TRANSACTION_EVENTS_TABLE>
    //    1    3:areturn         
// Previous instruction length mismatch
    //    2    0:getstatic       #231 <Field String CREATE_TRANSACTION_EVENTS_TABLE>
    //    3    3:areturn         
    }

    static String access$500()
    {
    //    0    0:getstatic       #237 <Field String CREATE_ITEM_EVENTS_TABLE>
    //    1    3:areturn         
// Previous instruction length mismatch
    //    2    0:getstatic       #237 <Field String CREATE_ITEM_EVENTS_TABLE>
    //    3    3:areturn         
    }

    static String access$600()
    {
    //    0    0:getstatic       #241 <Field String CREATE_HITS_TABLE>
    //    1    3:areturn         
// Previous instruction length mismatch
    //    2    0:getstatic       #241 <Field String CREATE_HITS_TABLE>
    //    3    3:areturn         
    }

    static CustomVariableBuffer access$702(PersistentHitStore persistenthitstore, CustomVariableBuffer customvariablebuffer)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #270 <Field CustomVariableBuffer visitorCVCache>
    //    3    5:aload_1         
    //    4    6:areturn         
// Previous instruction length mismatch
    //    5    0:aload_0         
    //    6    1:aload_1         
    //    7    2:putfield        #270 <Field CustomVariableBuffer visitorCVCache>
    //    8    5:aload_1         
    //    9    6:areturn         
    }

    static void access$800(PersistentHitStore persistenthitstore, Event event, SQLiteDatabase sqlitedatabase, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iload_3         
    //    4    4:invokespecial   #286 <Method void putEvent(Event, SQLiteDatabase, boolean)>
    //    5    7:return          
// Previous instruction length mismatch
    //    6    0:aload_0         
    //    7    1:aload_1         
    //    8    2:aload_2         
    //    9    3:iload_3         
    //   10    4:invokespecial   #286 <Method void putEvent(Event, SQLiteDatabase, boolean)>
    //   11    7:return          
    }

    static boolean access$900(SQLiteDatabase sqlitedatabase)
    {
    //    0    0:aload_0         
    //    1    1:invokestatic    #291 <Method boolean endTransaction(SQLiteDatabase)>
    //    2    4:ireturn         
// Previous instruction length mismatch
    //    3    0:aload_0         
    //    4    1:invokestatic    #291 <Method boolean endTransaction(SQLiteDatabase)>
    //    5    4:ireturn         
    }

    private static boolean endTransaction(SQLiteDatabase sqlitedatabase)
    {
    // try 0 4 handler(s) 6
    //    0    0:aload_0         
    //    1    1:invokevirtual   #297 <Method void SQLiteDatabase.endTransaction()>
    //    2    4:iconst_1        
    //    3    5:ireturn         
    // catch SQLiteException
    //    4    6:astore_1        
    //    5    7:ldc2            #299 <String "GoogleAnalyticsTracker">
    //    6   10:new             #170 <Class StringBuilder>
    //    7   13:dup             
    //    8   14:invokespecial   #173 <Method void StringBuilder()>
    //    9   17:ldc2            #301 <String "exception ending transaction:">
    //   10   20:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //   11   23:aload_1         
    //   12   24:invokevirtual   #302 <Method String SQLiteException.toString()>
    //   13   27:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //   14   30:invokevirtual   #201 <Method String StringBuilder.toString()>
    //   15   33:invokestatic    #308 <Method int Log.e(String, String)>
    //   16   36:pop             
    //   17   37:iconst_0        
    //   18   38:ireturn         
    }

    static String formatReferrer(String s)
    {
    //    0    0:aload_0         
    //    1    1:ifnonnull       6
    //    2    4:aconst_null     
    //    3    5:areturn         
    //    4    6:aload_0         
    //    5    7:ldc2            #314 <String "=">
    //    6   10:invokevirtual   #318 <Method boolean String.contains(CharSequence)>
    //    7   13:ifeq            113
    //    8   16:aload_0         
    //    9   17:invokestatic    #324 <Method Map Utils.parseURLParameters(String)>
    //   10   20:astore_3        
    //   11   21:aload_3         
    //   12   22:ldc2            #326 <String "utm_campaign">
    //   13   25:invokeinterface #332 <Method Object Map.get(Object)>
    //   14   30:ifnull          141
    //   15   33:iconst_1        
    //   16   34:istore          4
    //   17   36:aload_3         
    //   18   37:ldc2            #334 <String "utm_medium">
    //   19   40:invokeinterface #332 <Method Object Map.get(Object)>
    //   20   45:ifnull          147
    //   21   48:iconst_1        
    //   22   49:istore          5
    //   23   51:aload_3         
    //   24   52:ldc2            #336 <String "utm_source">
    //   25   55:invokeinterface #332 <Method Object Map.get(Object)>
    //   26   60:ifnull          153
    //   27   63:iconst_1        
    //   28   64:istore          6
    //   29   66:aload_3         
    //   30   67:ldc2            #338 <String "gclid">
    //   31   70:invokeinterface #332 <Method Object Map.get(Object)>
    //   32   75:ifnull          159
    //   33   78:iconst_1        
    //   34   79:istore          7
    //   35   81:iload           7
    //   36   83:ifne            165
    //   37   86:iload           4
    //   38   88:ifeq            101
    //   39   91:iload           5
    //   40   93:ifeq            101
    //   41   96:iload           6
    //   42   98:ifne            165
    //   43  101:ldc2            #299 <String "GoogleAnalyticsTracker">
    //   44  104:ldc2            #340 <String "Badly formatted referrer missing campaign, medium and source or click ID">
    //   45  107:invokestatic    #343 <Method int Log.w(String, String)>
    //   46  110:pop             
    //   47  111:aconst_null     
    //   48  112:areturn         
    //   49  113:aload_0         
    //   50  114:ldc2            #345 <String "%3D">
    //   51  117:invokevirtual   #318 <Method boolean String.contains(CharSequence)>
    //   52  120:ifeq            139
    // try 123 131 handler(s) 136
    //   53  123:aload_0         
    //   54  124:ldc2            #347 <String "UTF-8">
    //   55  127:invokestatic    #353 <Method String URLDecoder.decode(String, String)>
    //   56  130:astore_2        
    //   57  131:aload_2         
    //   58  132:astore_0        
    //   59  133:goto            16
    // catch UnsupportedEncodingException
    //   60  136:astore_1        
    //   61  137:aconst_null     
    //   62  138:areturn         
    //   63  139:aconst_null     
    //   64  140:areturn         
    //   65  141:iconst_0        
    //   66  142:istore          4
    //   67  144:goto            36
    //   68  147:iconst_0        
    //   69  148:istore          5
    //   70  150:goto            51
    //   71  153:iconst_0        
    //   72  154:istore          6
    //   73  156:goto            66
    //   74  159:iconst_0        
    //   75  160:istore          7
    //   76  162:goto            81
    //   77  165:bipush          7
    //   78  167:anewarray       String[][]
    //   79  170:astore          8
    //   80  172:iconst_2        
    //   81  173:anewarray       String[]
    //   82  176:astore          9
    //   83  178:aload           9
    //   84  180:iconst_0        
    //   85  181:ldc2            #357 <String "utmcid">
    //   86  184:aastore         
    //   87  185:aload           9
    //   88  187:iconst_1        
    //   89  188:aload_3         
    //   90  189:ldc2            #359 <String "utm_id">
    //   91  192:invokeinterface #332 <Method Object Map.get(Object)>
    //   92  197:checkcast       #183 <Class String>
    //   93  200:aastore         
    //   94  201:aload           8
    //   95  203:iconst_0        
    //   96  204:aload           9
    //   97  206:aastore         
    //   98  207:iconst_2        
    //   99  208:anewarray       String[]
    //  100  211:astore          10
    //  101  213:aload           10
    //  102  215:iconst_0        
    //  103  216:ldc2            #361 <String "utmcsr">
    //  104  219:aastore         
    //  105  220:aload           10
    //  106  222:iconst_1        
    //  107  223:aload_3         
    //  108  224:ldc2            #336 <String "utm_source">
    //  109  227:invokeinterface #332 <Method Object Map.get(Object)>
    //  110  232:checkcast       #183 <Class String>
    //  111  235:aastore         
    //  112  236:aload           8
    //  113  238:iconst_1        
    //  114  239:aload           10
    //  115  241:aastore         
    //  116  242:iconst_2        
    //  117  243:anewarray       String[]
    //  118  246:astore          11
    //  119  248:aload           11
    //  120  250:iconst_0        
    //  121  251:ldc2            #363 <String "utmgclid">
    //  122  254:aastore         
    //  123  255:aload           11
    //  124  257:iconst_1        
    //  125  258:aload_3         
    //  126  259:ldc2            #338 <String "gclid">
    //  127  262:invokeinterface #332 <Method Object Map.get(Object)>
    //  128  267:checkcast       #183 <Class String>
    //  129  270:aastore         
    //  130  271:aload           8
    //  131  273:iconst_2        
    //  132  274:aload           11
    //  133  276:aastore         
    //  134  277:iconst_2        
    //  135  278:anewarray       String[]
    //  136  281:astore          12
    //  137  283:aload           12
    //  138  285:iconst_0        
    //  139  286:ldc2            #365 <String "utmccn">
    //  140  289:aastore         
    //  141  290:aload           12
    //  142  292:iconst_1        
    //  143  293:aload_3         
    //  144  294:ldc2            #326 <String "utm_campaign">
    //  145  297:invokeinterface #332 <Method Object Map.get(Object)>
    //  146  302:checkcast       #183 <Class String>
    //  147  305:aastore         
    //  148  306:aload           8
    //  149  308:iconst_3        
    //  150  309:aload           12
    //  151  311:aastore         
    //  152  312:iconst_2        
    //  153  313:anewarray       String[]
    //  154  316:astore          13
    //  155  318:aload           13
    //  156  320:iconst_0        
    //  157  321:ldc2            #367 <String "utmcmd">
    //  158  324:aastore         
    //  159  325:aload           13
    //  160  327:iconst_1        
    //  161  328:aload_3         
    //  162  329:ldc2            #334 <String "utm_medium">
    //  163  332:invokeinterface #332 <Method Object Map.get(Object)>
    //  164  337:checkcast       #183 <Class String>
    //  165  340:aastore         
    //  166  341:aload           8
    //  167  343:iconst_4        
    //  168  344:aload           13
    //  169  346:aastore         
    //  170  347:iconst_2        
    //  171  348:anewarray       String[]
    //  172  351:astore          14
    //  173  353:aload           14
    //  174  355:iconst_0        
    //  175  356:ldc2            #369 <String "utmctr">
    //  176  359:aastore         
    //  177  360:aload           14
    //  178  362:iconst_1        
    //  179  363:aload_3         
    //  180  364:ldc2            #371 <String "utm_term">
    //  181  367:invokeinterface #332 <Method Object Map.get(Object)>
    //  182  372:checkcast       #183 <Class String>
    //  183  375:aastore         
    //  184  376:aload           8
    //  185  378:iconst_5        
    //  186  379:aload           14
    //  187  381:aastore         
    //  188  382:iconst_2        
    //  189  383:anewarray       String[]
    //  190  386:astore          15
    //  191  388:aload           15
    //  192  390:iconst_0        
    //  193  391:ldc2            #373 <String "utmcct">
    //  194  394:aastore         
    //  195  395:aload           15
    //  196  397:iconst_1        
    //  197  398:aload_3         
    //  198  399:ldc2            #375 <String "utm_content">
    //  199  402:invokeinterface #332 <Method Object Map.get(Object)>
    //  200  407:checkcast       #183 <Class String>
    //  201  410:aastore         
    //  202  411:aload           8
    //  203  413:bipush          6
    //  204  415:aload           15
    //  205  417:aastore         
    //  206  418:new             #170 <Class StringBuilder>
    //  207  421:dup             
    //  208  422:invokespecial   #173 <Method void StringBuilder()>
    //  209  425:astore          16
    //  210  427:iconst_0        
    //  211  428:istore          17
    //  212  430:iconst_1        
    //  213  431:istore          18
    //  214  433:iload           17
    //  215  435:aload           8
    //  216  437:arraylength     
    //  217  438:icmpge          528
    //  218  441:aload           8
    //  219  443:iload           17
    //  220  445:aaload          
    //  221  446:iconst_1        
    //  222  447:aaload          
    //  223  448:ifnull          510
    //  224  451:aload           8
    //  225  453:iload           17
    //  226  455:aaload          
    //  227  456:iconst_1        
    //  228  457:aaload          
    //  229  458:ldc2            #377 <String "+">
    //  230  461:ldc2            #379 <String "%20">
    //  231  464:invokevirtual   #383 <Method String String.replace(CharSequence, CharSequence)>
    //  232  467:ldc2            #385 <String " ">
    //  233  470:ldc2            #379 <String "%20">
    //  234  473:invokevirtual   #383 <Method String String.replace(CharSequence, CharSequence)>
    //  235  476:astore          19
    //  236  478:iload           18
    //  237  480:ifeq            516
    //  238  483:iconst_0        
    //  239  484:istore          18
    //  240  486:aload           16
    //  241  488:aload           8
    //  242  490:iload           17
    //  243  492:aaload          
    //  244  493:iconst_0        
    //  245  494:aaload          
    //  246  495:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  247  498:ldc2            #314 <String "=">
    //  248  501:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  249  504:aload           19
    //  250  506:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  251  509:pop             
    //  252  510:iinc            17  1
    //  253  513:goto            433
    //  254  516:aload           16
    //  255  518:ldc2            #387 <String "|">
    //  256  521:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  257  524:pop             
    //  258  525:goto            486
    //  259  528:aload           16
    //  260  530:invokevirtual   #201 <Method String StringBuilder.toString()>
    //  261  533:areturn         
    }

    private Referrer getAndUpdateReferrer(SQLiteDatabase sqlitedatabase)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #392 <Method Referrer readCurrentReferrer(SQLiteDatabase)>
    //    3    5:astore_2        
    //    4    6:aload_2         
    //    5    7:ifnonnull       12
    //    6   10:aconst_null     
    //    7   11:areturn         
    //    8   12:aload_2         
    //    9   13:invokevirtual   #398 <Method long Referrer.getTimeStamp()>
    //   10   16:lconst_0        
    //   11   17:lcmp            
    //   12   18:ifeq            23
    //   13   21:aload_2         
    //   14   22:areturn         
    //   15   23:aload_2         
    //   16   24:invokevirtual   #402 <Method int Referrer.getIndex()>
    //   17   27:istore_3        
    //   18   28:aload_2         
    //   19   29:invokevirtual   #405 <Method String Referrer.getReferrerString()>
    //   20   32:astore          4
    //   21   34:new             #407 <Class ContentValues>
    //   22   37:dup             
    //   23   38:invokespecial   #408 <Method void ContentValues()>
    //   24   41:astore          5
    //   25   43:aload           5
    //   26   45:ldc1            #97  <String "referrer">
    //   27   47:aload           4
    //   28   49:invokevirtual   #412 <Method void ContentValues.put(String, String)>
    //   29   52:aload           5
    //   30   54:ldc1            #131 <String "timestamp_referrer">
    //   31   56:aload_0         
    //   32   57:getfield        #414 <Field long timestampCurrent>
    //   33   60:invokestatic    #420 <Method Long Long.valueOf(long)>
    //   34   63:invokevirtual   #423 <Method void ContentValues.put(String, Long)>
    //   35   66:aload           5
    //   36   68:ldc1            #104 <String "referrer_visit">
    //   37   70:aload_0         
    //   38   71:getfield        #425 <Field int visits>
    //   39   74:invokestatic    #430 <Method Integer Integer.valueOf(int)>
    //   40   77:invokevirtual   #433 <Method void ContentValues.put(String, Integer)>
    //   41   80:aload           5
    //   42   82:ldc1            #101 <String "referrer_index">
    //   43   84:iload_3         
    //   44   85:invokestatic    #430 <Method Integer Integer.valueOf(int)>
    //   45   88:invokevirtual   #433 <Method void ContentValues.put(String, Integer)>
    //   46   91:aload_0         
    //   47   92:aload_1         
    //   48   93:aload           5
    //   49   95:invokespecial   #437 <Method boolean setReferrerDatabase(SQLiteDatabase, ContentValues)>
    //   50   98:ifeq            10
    //   51  101:new             #394 <Class Referrer>
    //   52  104:dup             
    //   53  105:aload           4
    //   54  107:aload_0         
    //   55  108:getfield        #414 <Field long timestampCurrent>
    //   56  111:aload_0         
    //   57  112:getfield        #425 <Field int visits>
    //   58  115:iload_3         
    //   59  116:invokespecial   #440 <Method void Referrer(String, long, int, int)>
    //   60  119:areturn         
    }

    private void putEvent(Event event, SQLiteDatabase sqlitedatabase, boolean flag)
    {
    //    0    0:aload_1         
    //    1    1:invokevirtual   #446 <Method boolean Event.isSessionInitialized()>
    //    2    4:ifne            56
    //    3    7:aload_1         
    //    4    8:aload_0         
    //    5    9:getfield        #254 <Field Random random>
    //    6   12:ldc2            #447 <Int 0x7fffffff>
    //    7   15:invokevirtual   #451 <Method int Random.nextInt(int)>
    //    8   18:invokevirtual   #455 <Method void Event.setRandomVal(int)>
    //    9   21:aload_1         
    //   10   22:aload_0         
    //   11   23:getfield        #457 <Field long timestampFirst>
    //   12   26:l2i             
    //   13   27:invokevirtual   #460 <Method void Event.setTimestampFirst(int)>
    //   14   30:aload_1         
    //   15   31:aload_0         
    //   16   32:getfield        #462 <Field long timestampPrevious>
    //   17   35:l2i             
    //   18   36:invokevirtual   #465 <Method void Event.setTimestampPrevious(int)>
    //   19   39:aload_1         
    //   20   40:aload_0         
    //   21   41:getfield        #414 <Field long timestampCurrent>
    //   22   44:l2i             
    //   23   45:invokevirtual   #468 <Method void Event.setTimestampCurrent(int)>
    //   24   48:aload_1         
    //   25   49:aload_0         
    //   26   50:getfield        #425 <Field int visits>
    //   27   53:invokevirtual   #471 <Method void Event.setVisits(int)>
    //   28   56:aload_1         
    //   29   57:aload_0         
    //   30   58:getfield        #473 <Field boolean anonymizeIp>
    //   31   61:invokevirtual   #477 <Method void Event.setAnonymizeIp(boolean)>
    //   32   64:aload_1         
    //   33   65:invokevirtual   #480 <Method int Event.getUserId()>
    //   34   68:iconst_m1       
    //   35   69:icmpne          80
    //   36   72:aload_1         
    //   37   73:aload_0         
    //   38   74:getfield        #482 <Field int storeId>
    //   39   77:invokevirtual   #485 <Method void Event.setUserId(int)>
    //   40   80:aload_0         
    //   41   81:aload_1         
    //   42   82:aload_2         
    //   43   83:invokevirtual   #489 <Method void putCustomVariables(Event, SQLiteDatabase)>
    //   44   86:aload_0         
    //   45   87:aload_2         
    //   46   88:invokespecial   #491 <Method Referrer getAndUpdateReferrer(SQLiteDatabase)>
    //   47   91:astore          4
    //   48   93:aload_1         
    //   49   94:getfield        #494 <Field String Event.accountId>
    //   50   97:ldc2            #496 <String ",">
    //   51  100:invokevirtual   #500 <Method String[] String.split(String)>
    //   52  103:astore          5
    //   53  105:aload           5
    //   54  107:arraylength     
    //   55  108:iconst_1        
    //   56  109:icmpne          122
    //   57  112:aload_0         
    //   58  113:aload_1         
    //   59  114:aload           4
    //   60  116:aload_2         
    //   61  117:iload_3         
    //   62  118:invokevirtual   #504 <Method void writeEventToDatabase(Event, Referrer, SQLiteDatabase, boolean)>
    //   63  121:return          
    //   64  122:aload           5
    //   65  124:arraylength     
    //   66  125:istore          6
    //   67  127:iconst_0        
    //   68  128:istore          7
    //   69  130:iload           7
    //   70  132:iload           6
    //   71  134:icmpge          121
    //   72  137:aload_0         
    //   73  138:new             #442 <Class Event>
    //   74  141:dup             
    //   75  142:aload_1         
    //   76  143:aload           5
    //   77  145:iload           7
    //   78  147:aaload          
    //   79  148:invokespecial   #507 <Method void Event(Event, String)>
    //   80  151:aload           4
    //   81  153:aload_2         
    //   82  154:iload_3         
    //   83  155:invokevirtual   #504 <Method void writeEventToDatabase(Event, Referrer, SQLiteDatabase, boolean)>
    //   84  158:iinc            7  1
    //   85  161:goto            130
    }

    private boolean setReferrerDatabase(SQLiteDatabase sqlitedatabase, ContentValues contentvalues)
    {
    // try 0 26 handler(s) 42 72
    //    0    0:aload_1         
    //    1    1:invokevirtual   #510 <Method void SQLiteDatabase.beginTransaction()>
    //    2    4:aload_1         
    //    3    5:ldc1            #97  <String "referrer">
    //    4    7:aconst_null     
    //    5    8:aconst_null     
    //    6    9:invokevirtual   #514 <Method int SQLiteDatabase.delete(String, String, String[])>
    //    7   12:pop             
    //    8   13:aload_1         
    //    9   14:ldc1            #97  <String "referrer">
    //   10   16:aconst_null     
    //   11   17:aload_2         
    //   12   18:invokevirtual   #518 <Method long SQLiteDatabase.insert(String, String, ContentValues)>
    //   13   21:pop2            
    //   14   22:aload_1         
    //   15   23:invokevirtual   #521 <Method void SQLiteDatabase.setTransactionSuccessful()>
    //   16   26:aload_1         
    //   17   27:invokevirtual   #524 <Method boolean SQLiteDatabase.inTransaction()>
    //   18   30:ifeq            89
    //   19   33:aload_1         
    //   20   34:invokestatic    #291 <Method boolean endTransaction(SQLiteDatabase)>
    //   21   37:ifne            89
    //   22   40:iconst_0        
    //   23   41:ireturn         
    // catch SQLiteException
    //   24   42:astore          4
    // try 44 56 handler(s) 72
    //   25   44:ldc2            #299 <String "GoogleAnalyticsTracker">
    //   26   47:aload           4
    //   27   49:invokevirtual   #302 <Method String SQLiteException.toString()>
    //   28   52:invokestatic    #308 <Method int Log.e(String, String)>
    //   29   55:pop             
    //   30   56:aload_1         
    //   31   57:invokevirtual   #524 <Method boolean SQLiteDatabase.inTransaction()>
    //   32   60:ifeq            40
    //   33   63:aload_1         
    //   34   64:invokestatic    #291 <Method boolean endTransaction(SQLiteDatabase)>
    //   35   67:ifne            40
    //   36   70:iconst_0        
    //   37   71:ireturn         
    // finally
    //   38   72:astore_3        
    //   39   73:aload_1         
    //   40   74:invokevirtual   #524 <Method boolean SQLiteDatabase.inTransaction()>
    //   41   77:ifeq            87
    //   42   80:aload_1         
    //   43   81:invokestatic    #291 <Method boolean endTransaction(SQLiteDatabase)>
    //   44   84:ifeq            40
    //   45   87:aload_3         
    //   46   88:athrow          
    //   47   89:iconst_1        
    //   48   90:ireturn         
    }

    public void clearReferrer()
    {
    // try 0 15 handler(s) 16
    //    0    0:aload_0         
    //    1    1:getfield        #261 <Field PersistentHitStore$DataBaseHelper databaseHelper>
    //    2    4:invokevirtual   #529 <Method SQLiteDatabase PersistentHitStore$DataBaseHelper.getWritableDatabase()>
    //    3    7:ldc1            #97  <String "referrer">
    //    4    9:aconst_null     
    //    5   10:aconst_null     
    //    6   11:invokevirtual   #514 <Method int SQLiteDatabase.delete(String, String, String[])>
    //    7   14:pop             
    //    8   15:return          
    // catch SQLiteException
    //    9   16:astore_1        
    //   10   17:ldc2            #299 <String "GoogleAnalyticsTracker">
    //   11   20:aload_1         
    //   12   21:invokevirtual   #302 <Method String SQLiteException.toString()>
    //   13   24:invokestatic    #308 <Method int Log.e(String, String)>
    //   14   27:pop             
    //   15   28:return          
    }

    public void deleteHit(long l)
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 51 handler(s) 54 71
    //    2    2:aload_0         
    //    3    3:getfield        #533 <Field int numStoredHits>
    //    4    6:istore          6
    //    5    8:aload_0         
    //    6    9:getfield        #261 <Field PersistentHitStore$DataBaseHelper databaseHelper>
    //    7   12:invokevirtual   #529 <Method SQLiteDatabase PersistentHitStore$DataBaseHelper.getWritableDatabase()>
    //    8   15:astore          7
    //    9   17:iconst_1        
    //   10   18:anewarray       String[]
    //   11   21:astore          8
    //   12   23:aload           8
    //   13   25:iconst_0        
    //   14   26:lload_1         
    //   15   27:invokestatic    #536 <Method String Long.toString(long)>
    //   16   30:aastore         
    //   17   31:aload_0         
    //   18   32:iload           6
    //   19   34:aload           7
    //   20   36:ldc2            #538 <String "hits">
    //   21   39:ldc2            #540 <String "hit_id = ?">
    //   22   42:aload           8
    //   23   44:invokevirtual   #514 <Method int SQLiteDatabase.delete(String, String, String[])>
    //   24   47:isub            
    //   25   48:putfield        #533 <Field int numStoredHits>
    //   26   51:aload_0         
    //   27   52:monitorexit     
    //   28   53:return          
    // catch SQLiteException
    //   29   54:astore          4
    // try 56 68 handler(s) 71
    //   30   56:ldc2            #299 <String "GoogleAnalyticsTracker">
    //   31   59:aload           4
    //   32   61:invokevirtual   #302 <Method String SQLiteException.toString()>
    //   33   64:invokestatic    #308 <Method int Log.e(String, String)>
    //   34   67:pop             
    //   35   68:goto            51
    // finally
    //   36   71:astore_3        
    //   37   72:aload_0         
    //   38   73:monitorexit     
    //   39   74:aload_3         
    //   40   75:athrow          
    }

    CustomVariableBuffer getCustomVariables(long l, SQLiteDatabase sqlitedatabase)
    {
    //    0    0:new             #544 <Class CustomVariableBuffer>
    //    1    3:dup             
    //    2    4:invokespecial   #545 <Method void CustomVariableBuffer()>
    //    3    7:astore          4
    // try 9 41 handler(s) 203 178
    //    4    9:iconst_1        
    //    5   10:anewarray       String[]
    //    6   13:astore          9
    //    7   15:aload           9
    //    8   17:iconst_0        
    //    9   18:lload_1         
    //   10   19:invokestatic    #536 <Method String Long.toString(long)>
    //   11   22:aastore         
    //   12   23:aload_3         
    //   13   24:ldc2            #547 <String "custom_variables">
    //   14   27:aconst_null     
    //   15   28:ldc2            #549 <String "event_id= ?">
    //   16   31:aload           9
    //   17   33:aconst_null     
    //   18   34:aconst_null     
    //   19   35:aconst_null     
    //   20   36:invokevirtual   #553 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
    //   21   39:astore          10
    //   22   41:aload           10
    //   23   43:astore          6
    // try 45 131 handler(s) 134 198
    //   24   45:aload           6
    //   25   47:invokeinterface #558 <Method boolean Cursor.moveToNext()>
    //   26   52:ifeq            163
    //   27   55:aload           4
    //   28   57:new             #560 <Class CustomVariable>
    //   29   60:dup             
    //   30   61:aload           6
    //   31   63:aload           6
    //   32   65:ldc1            #35  <String "cv_index">
    //   33   67:invokeinterface #564 <Method int Cursor.getColumnIndex(String)>
    //   34   72:invokeinterface #567 <Method int Cursor.getInt(int)>
    //   35   77:aload           6
    //   36   79:aload           6
    //   37   81:ldc1            #38  <String "cv_name">
    //   38   83:invokeinterface #564 <Method int Cursor.getColumnIndex(String)>
    //   39   88:invokeinterface #571 <Method String Cursor.getString(int)>
    //   40   93:aload           6
    //   41   95:aload           6
    //   42   97:ldc1            #44  <String "cv_value">
    //   43   99:invokeinterface #564 <Method int Cursor.getColumnIndex(String)>
    //   44  104:invokeinterface #571 <Method String Cursor.getString(int)>
    //   45  109:aload           6
    //   46  111:aload           6
    //   47  113:ldc1            #41  <String "cv_scope">
    //   48  115:invokeinterface #564 <Method int Cursor.getColumnIndex(String)>
    //   49  120:invokeinterface #567 <Method int Cursor.getInt(int)>
    //   50  125:invokespecial   #574 <Method void CustomVariable(int, String, String, int)>
    //   51  128:invokevirtual   #578 <Method void CustomVariableBuffer.setCustomVariable(CustomVariable)>
    //   52  131:goto            45
    // catch SQLiteException
    //   53  134:astore          5
    // try 136 148 handler(s) 198
    //   54  136:ldc2            #299 <String "GoogleAnalyticsTracker">
    //   55  139:aload           5
    //   56  141:invokevirtual   #302 <Method String SQLiteException.toString()>
    //   57  144:invokestatic    #308 <Method int Log.e(String, String)>
    //   58  147:pop             
    //   59  148:aload           6
    //   60  150:ifnull          160
    //   61  153:aload           6
    //   62  155:invokeinterface #581 <Method void Cursor.close()>
    //   63  160:aload           4
    //   64  162:areturn         
    //   65  163:aload           6
    //   66  165:ifnull          160
    //   67  168:aload           6
    //   68  170:invokeinterface #581 <Method void Cursor.close()>
    //   69  175:aload           4
    //   70  177:areturn         
    // finally
    //   71  178:astore          7
    //   72  180:aconst_null     
    //   73  181:astore          6
    //   74  183:aload           6
    //   75  185:ifnull          195
    //   76  188:aload           6
    //   77  190:invokeinterface #581 <Method void Cursor.close()>
    //   78  195:aload           7
    //   79  197:athrow          
    // finally
    //   80  198:astore          7
    //   81  200:goto            183
    // catch SQLiteException
    //   82  203:astore          5
    //   83  205:aconst_null     
    //   84  206:astore          6
    //   85  208:goto            136
    }

    DataBaseHelper getDatabaseHelper()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #261 <Field PersistentHitStore$DataBaseHelper databaseHelper>
    //    2    4:areturn         
    }

    Item getItem(long l, SQLiteDatabase sqlitedatabase)
    {
    // try 0 32 handler(s) 189 221
    //    0    0:iconst_1        
    //    1    1:anewarray       String[]
    //    2    4:astore          9
    //    3    6:aload           9
    //    4    8:iconst_0        
    //    5    9:lload_1         
    //    6   10:invokestatic    #536 <Method String Long.toString(long)>
    //    7   13:aastore         
    //    8   14:aload_3         
    //    9   15:ldc2            #587 <String "item_events">
    //   10   18:aconst_null     
    //   11   19:ldc2            #549 <String "event_id= ?">
    //   12   22:aload           9
    //   13   24:aconst_null     
    //   14   25:aconst_null     
    //   15   26:aconst_null     
    //   16   27:invokevirtual   #553 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
    //   17   30:astore          10
    //   18   32:aload           10
    //   19   34:astore          5
    // try 36 160 handler(s) 255 241
    //   20   36:aload           5
    //   21   38:invokeinterface #590 <Method boolean Cursor.moveToFirst()>
    //   22   43:ifeq            175
    //   23   46:new             #592 <Class Item$Builder>
    //   24   49:dup             
    //   25   50:aload           5
    //   26   52:aload           5
    //   27   54:ldc1            #91  <String "order_id">
    //   28   56:invokeinterface #564 <Method int Cursor.getColumnIndex(String)>
    //   29   61:invokeinterface #571 <Method String Cursor.getString(int)>
    //   30   66:aload           5
    //   31   68:aload           5
    //   32   70:ldc1            #83  <String "item_sku">
    //   33   72:invokeinterface #564 <Method int Cursor.getColumnIndex(String)>
    //   34   77:invokeinterface #571 <Method String Cursor.getString(int)>
    //   35   82:aload           5
    //   36   84:aload           5
    //   37   86:ldc1            #80  <String "item_price">
    //   38   88:invokeinterface #564 <Method int Cursor.getColumnIndex(String)>
    //   39   93:invokeinterface #596 <Method double Cursor.getDouble(int)>
    //   40   98:aload           5
    //   41  100:aload           5
    //   42  102:ldc1            #71  <String "item_count">
    //   43  104:invokeinterface #564 <Method int Cursor.getColumnIndex(String)>
    //   44  109:invokeinterface #600 <Method long Cursor.getLong(int)>
    //   45  114:invokespecial   #603 <Method void Item$Builder(String, String, double, long)>
    //   46  117:aload           5
    //   47  119:aload           5
    //   48  121:ldc1            #77  <String "item_name">
    //   49  123:invokeinterface #564 <Method int Cursor.getColumnIndex(String)>
    //   50  128:invokeinterface #571 <Method String Cursor.getString(int)>
    //   51  133:invokevirtual   #607 <Method Item$Builder Item$Builder.setItemName(String)>
    //   52  136:aload           5
    //   53  138:aload           5
    //   54  140:ldc1            #68  <String "item_category">
    //   55  142:invokeinterface #564 <Method int Cursor.getColumnIndex(String)>
    //   56  147:invokeinterface #571 <Method String Cursor.getString(int)>
    //   57  152:invokevirtual   #610 <Method Item$Builder Item$Builder.setItemCategory(String)>
    //   58  155:invokevirtual   #614 <Method Item Item$Builder.build()>
    //   59  158:astore          11
    //   60  160:aload           5
    //   61  162:ifnull          172
    //   62  165:aload           5
    //   63  167:invokeinterface #581 <Method void Cursor.close()>
    //   64  172:aload           11
    //   65  174:areturn         
    //   66  175:aload           5
    //   67  177:ifnull          187
    //   68  180:aload           5
    //   69  182:invokeinterface #581 <Method void Cursor.close()>
    //   70  187:aconst_null     
    //   71  188:areturn         
    // catch SQLiteException
    //   72  189:astore          6
    //   73  191:aconst_null     
    //   74  192:astore          7
    // try 194 206 handler(s) 246
    //   75  194:ldc2            #299 <String "GoogleAnalyticsTracker">
    //   76  197:aload           6
    //   77  199:invokevirtual   #302 <Method String SQLiteException.toString()>
    //   78  202:invokestatic    #308 <Method int Log.e(String, String)>
    //   79  205:pop             
    //   80  206:aload           7
    //   81  208:ifnull          187
    //   82  211:aload           7
    //   83  213:invokeinterface #581 <Method void Cursor.close()>
    //   84  218:goto            187
    // finally
    //   85  221:astore          4
    //   86  223:aconst_null     
    //   87  224:astore          5
    //   88  226:aload           5
    //   89  228:ifnull          238
    //   90  231:aload           5
    //   91  233:invokeinterface #581 <Method void Cursor.close()>
    //   92  238:aload           4
    //   93  240:athrow          
    // finally
    //   94  241:astore          4
    //   95  243:goto            226
    // finally
    //   96  246:astore          4
    //   97  248:aload           7
    //   98  250:astore          5
    //   99  252:goto            226
    // catch SQLiteException
    //  100  255:astore          6
    //  101  257:aload           5
    //  102  259:astore          7
    //  103  261:goto            194
    }

    public int getNumStoredHits()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #533 <Field int numStoredHits>
    //    2    4:ireturn         
    }

    public int getNumStoredHitsFromDb()
    {
    //    0    0:aconst_null     
    //    1    1:astore_1        
    // try 2 25 handler(s) 60 87
    //    2    2:aload_0         
    //    3    3:getfield        #261 <Field PersistentHitStore$DataBaseHelper databaseHelper>
    //    4    6:invokevirtual   #619 <Method SQLiteDatabase PersistentHitStore$DataBaseHelper.getReadableDatabase()>
    //    5    9:ldc2            #621 <String "SELECT COUNT(*) from hits">
    //    6   12:aconst_null     
    //    7   13:invokevirtual   #625 <Method Cursor SQLiteDatabase.rawQuery(String, String[])>
    //    8   16:astore_1        
    //    9   17:aload_1         
    //   10   18:invokeinterface #590 <Method boolean Cursor.moveToFirst()>
    //   11   23:istore          6
    //   12   25:iconst_0        
    //   13   26:istore          5
    //   14   28:iload           6
    //   15   30:ifeq            47
    // try 33 42 handler(s) 60 87
    //   16   33:aload_1         
    //   17   34:iconst_0        
    //   18   35:invokeinterface #600 <Method long Cursor.getLong(int)>
    //   19   40:lstore          7
    //   20   42:lload           7
    //   21   44:l2i             
    //   22   45:istore          5
    //   23   47:aload_1         
    //   24   48:ifnull          57
    //   25   51:aload_1         
    //   26   52:invokeinterface #581 <Method void Cursor.close()>
    //   27   57:iload           5
    //   28   59:ireturn         
    // catch SQLiteException SQLiteException
    //   29   60:astore_3        
    // try 61 72 handler(s) 87
    //   30   61:ldc2            #299 <String "GoogleAnalyticsTracker">
    //   31   64:aload_3         
    //   32   65:invokevirtual   #302 <Method String SQLiteException.toString()>
    //   33   68:invokestatic    #308 <Method int Log.e(String, String)>
    //   34   71:pop             
    //   35   72:iconst_0        
    //   36   73:istore          5
    //   37   75:aload_1         
    //   38   76:ifnull          57
    //   39   79:aload_1         
    //   40   80:invokeinterface #581 <Method void Cursor.close()>
    //   41   85:iconst_0        
    //   42   86:ireturn         
    // finally
    //   43   87:astore_2        
    //   44   88:aload_1         
    //   45   89:ifnull          98
    //   46   92:aload_1         
    //   47   93:invokeinterface #581 <Method void Cursor.close()>
    //   48   98:aload_2         
    //   49   99:athrow          
    }

    public Referrer getReferrer()
    {
    // try 0 12 handler(s) 14
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #261 <Field PersistentHitStore$DataBaseHelper databaseHelper>
    //    3    5:invokevirtual   #619 <Method SQLiteDatabase PersistentHitStore$DataBaseHelper.getReadableDatabase()>
    //    4    8:invokevirtual   #392 <Method Referrer readCurrentReferrer(SQLiteDatabase)>
    //    5   11:astore_3        
    //    6   12:aload_3         
    //    7   13:areturn         
    // catch SQLiteException
    //    8   14:astore_1        
    //    9   15:ldc2            #299 <String "GoogleAnalyticsTracker">
    //   10   18:aload_1         
    //   11   19:invokevirtual   #302 <Method String SQLiteException.toString()>
    //   12   22:invokestatic    #308 <Method int Log.e(String, String)>
    //   13   25:pop             
    //   14   26:aconst_null     
    //   15   27:areturn         
    }

    public String getSessionId()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #630 <Field boolean sessionStarted>
    //    2    4:ifne            9
    //    3    7:aconst_null     
    //    4    8:areturn         
    //    5    9:aload_0         
    //    6   10:getfield        #414 <Field long timestampCurrent>
    //    7   13:l2i             
    //    8   14:invokestatic    #632 <Method String Integer.toString(int)>
    //    9   17:areturn         
    }

    public int getStoreId()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #482 <Field int storeId>
    //    2    4:ireturn         
    }

    long getTimestampCurrent()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #414 <Field long timestampCurrent>
    //    2    4:lreturn         
    }

    long getTimestampFirst()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #457 <Field long timestampFirst>
    //    2    4:lreturn         
    }

    long getTimestampPrevious()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #462 <Field long timestampPrevious>
    //    2    4:lreturn         
    }

    Transaction getTransaction(long l, SQLiteDatabase sqlitedatabase)
    {
    // try 0 32 handler(s) 176 208
    //    0    0:iconst_1        
    //    1    1:anewarray       String[]
    //    2    4:astore          8
    //    3    6:aload           8
    //    4    8:iconst_0        
    //    5    9:lload_1         
    //    6   10:invokestatic    #536 <Method String Long.toString(long)>
    //    7   13:aastore         
    //    8   14:aload_3         
    //    9   15:ldc2            #640 <String "transaction_events">
    //   10   18:aconst_null     
    //   11   19:ldc2            #549 <String "event_id= ?">
    //   12   22:aload           8
    //   13   24:aconst_null     
    //   14   25:aconst_null     
    //   15   26:aconst_null     
    //   16   27:invokevirtual   #553 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
    //   17   30:astore          9
    //   18   32:aload           9
    //   19   34:astore          5
    // try 36 147 handler(s) 233 228
    //   20   36:aload           5
    //   21   38:invokeinterface #590 <Method boolean Cursor.moveToFirst()>
    //   22   43:ifeq            162
    //   23   46:new             #642 <Class Transaction$Builder>
    //   24   49:dup             
    //   25   50:aload           5
    //   26   52:aload           5
    //   27   54:ldc1            #91  <String "order_id">
    //   28   56:invokeinterface #564 <Method int Cursor.getColumnIndex(String)>
    //   29   61:invokeinterface #571 <Method String Cursor.getString(int)>
    //   30   66:aload           5
    //   31   68:aload           5
    //   32   70:ldc1            #134 <String "tran_totalcost">
    //   33   72:invokeinterface #564 <Method int Cursor.getColumnIndex(String)>
    //   34   77:invokeinterface #596 <Method double Cursor.getDouble(int)>
    //   35   82:invokespecial   #645 <Method void Transaction$Builder(String, double)>
    //   36   85:aload           5
    //   37   87:aload           5
    //   38   89:ldc1            #119 <String "tran_storename">
    //   39   91:invokeinterface #564 <Method int Cursor.getColumnIndex(String)>
    //   40   96:invokeinterface #571 <Method String Cursor.getString(int)>
    //   41  101:invokevirtual   #649 <Method Transaction$Builder Transaction$Builder.setStoreName(String)>
    //   42  104:aload           5
    //   43  106:aload           5
    //   44  108:ldc1            #137 <String "tran_totaltax">
    //   45  110:invokeinterface #564 <Method int Cursor.getColumnIndex(String)>
    //   46  115:invokeinterface #596 <Method double Cursor.getDouble(int)>
    //   47  120:invokevirtual   #653 <Method Transaction$Builder Transaction$Builder.setTotalTax(double)>
    //   48  123:aload           5
    //   49  125:aload           5
    //   50  127:ldc1            #113 <String "tran_shippingcost">
    //   51  129:invokeinterface #564 <Method int Cursor.getColumnIndex(String)>
    //   52  134:invokeinterface #596 <Method double Cursor.getDouble(int)>
    //   53  139:invokevirtual   #656 <Method Transaction$Builder Transaction$Builder.setShippingCost(double)>
    //   54  142:invokevirtual   #659 <Method Transaction Transaction$Builder.build()>
    //   55  145:astore          10
    //   56  147:aload           5
    //   57  149:ifnull          159
    //   58  152:aload           5
    //   59  154:invokeinterface #581 <Method void Cursor.close()>
    //   60  159:aload           10
    //   61  161:areturn         
    //   62  162:aload           5
    //   63  164:ifnull          174
    //   64  167:aload           5
    //   65  169:invokeinterface #581 <Method void Cursor.close()>
    //   66  174:aconst_null     
    //   67  175:areturn         
    // catch SQLiteException
    //   68  176:astore          6
    //   69  178:aconst_null     
    //   70  179:astore          5
    // try 181 193 handler(s) 228
    //   71  181:ldc2            #299 <String "GoogleAnalyticsTracker">
    //   72  184:aload           6
    //   73  186:invokevirtual   #302 <Method String SQLiteException.toString()>
    //   74  189:invokestatic    #308 <Method int Log.e(String, String)>
    //   75  192:pop             
    //   76  193:aload           5
    //   77  195:ifnull          174
    //   78  198:aload           5
    //   79  200:invokeinterface #581 <Method void Cursor.close()>
    //   80  205:goto            174
    // finally
    //   81  208:astore          4
    //   82  210:aconst_null     
    //   83  211:astore          5
    //   84  213:aload           5
    //   85  215:ifnull          225
    //   86  218:aload           5
    //   87  220:invokeinterface #581 <Method void Cursor.close()>
    //   88  225:aload           4
    //   89  227:athrow          
    // finally
    //   90  228:astore          4
    //   91  230:goto            213
    // catch SQLiteException
    //   92  233:astore          6
    //   93  235:goto            181
    }

    public String getVisitorCustomVar(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #270 <Field CustomVariableBuffer visitorCVCache>
    //    2    4:iload_1         
    //    3    5:invokevirtual   #664 <Method CustomVariable CustomVariableBuffer.getCustomVariableAt(int)>
    //    4    8:astore_2        
    //    5    9:aload_2         
    //    6   10:ifnull          21
    //    7   13:aload_2         
    //    8   14:invokevirtual   #667 <Method int CustomVariable.getScope()>
    //    9   17:iconst_1        
    //   10   18:icmpeq          23
    //   11   21:aconst_null     
    //   12   22:areturn         
    //   13   23:aload_2         
    //   14   24:invokevirtual   #670 <Method String CustomVariable.getValue()>
    //   15   27:areturn         
    }

    public String getVisitorId()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #630 <Field boolean sessionStarted>
    //    2    4:ifne            9
    //    3    7:aconst_null     
    //    4    8:areturn         
    //    5    9:iconst_2        
    //    6   10:anewarray       Object[]
    //    7   13:astore_1        
    //    8   14:aload_1         
    //    9   15:iconst_0        
    //   10   16:aload_0         
    //   11   17:getfield        #482 <Field int storeId>
    //   12   20:invokestatic    #430 <Method Integer Integer.valueOf(int)>
    //   13   23:aastore         
    //   14   24:aload_1         
    //   15   25:iconst_1        
    //   16   26:aload_0         
    //   17   27:getfield        #457 <Field long timestampFirst>
    //   18   30:invokestatic    #420 <Method Long Long.valueOf(long)>
    //   19   33:aastore         
    //   20   34:ldc2            #673 <String "%d.%d">
    //   21   37:aload_1         
    //   22   38:invokestatic    #187 <Method String String.format(String, Object[])>
    //   23   41:areturn         
    }

    CustomVariableBuffer getVisitorVarBuffer()
    {
    // try 0 12 handler(s) 14
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #261 <Field PersistentHitStore$DataBaseHelper databaseHelper>
    //    3    5:invokevirtual   #619 <Method SQLiteDatabase PersistentHitStore$DataBaseHelper.getReadableDatabase()>
    //    4    8:invokevirtual   #676 <Method CustomVariableBuffer getVisitorVarBuffer(SQLiteDatabase)>
    //    5   11:astore_3        
    //    6   12:aload_3         
    //    7   13:areturn         
    // catch SQLiteException
    //    8   14:astore_1        
    //    9   15:ldc2            #299 <String "GoogleAnalyticsTracker">
    //   10   18:aload_1         
    //   11   19:invokevirtual   #302 <Method String SQLiteException.toString()>
    //   12   22:invokestatic    #308 <Method int Log.e(String, String)>
    //   13   25:pop             
    //   14   26:new             #544 <Class CustomVariableBuffer>
    //   15   29:dup             
    //   16   30:invokespecial   #545 <Method void CustomVariableBuffer()>
    //   17   33:areturn         
    }

    CustomVariableBuffer getVisitorVarBuffer(SQLiteDatabase sqlitedatabase)
    {
    //    0    0:new             #544 <Class CustomVariableBuffer>
    //    1    3:dup             
    //    2    4:invokespecial   #545 <Method void CustomVariableBuffer()>
    //    3    7:astore_2        
    // try 8 40 handler(s) 197 172
    //    4    8:iconst_1        
    //    5    9:anewarray       String[]
    //    6   12:astore          7
    //    7   14:aload           7
    //    8   16:iconst_0        
    //    9   17:iconst_1        
    //   10   18:invokestatic    #632 <Method String Integer.toString(int)>
    //   11   21:aastore         
    //   12   22:aload_1         
    //   13   23:ldc2            #678 <String "custom_var_cache">
    //   14   26:aconst_null     
    //   15   27:ldc2            #680 <String "cv_scope= ?">
    //   16   30:aload           7
    //   17   32:aconst_null     
    //   18   33:aconst_null     
    //   19   34:aconst_null     
    //   20   35:invokevirtual   #553 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
    //   21   38:astore          8
    //   22   40:aload           8
    //   23   42:astore          4
    // try 44 129 handler(s) 132 192
    //   24   44:aload           4
    //   25   46:invokeinterface #558 <Method boolean Cursor.moveToNext()>
    //   26   51:ifeq            158
    //   27   54:aload_2         
    //   28   55:new             #560 <Class CustomVariable>
    //   29   58:dup             
    //   30   59:aload           4
    //   31   61:aload           4
    //   32   63:ldc1            #35  <String "cv_index">
    //   33   65:invokeinterface #564 <Method int Cursor.getColumnIndex(String)>
    //   34   70:invokeinterface #567 <Method int Cursor.getInt(int)>
    //   35   75:aload           4
    //   36   77:aload           4
    //   37   79:ldc1            #38  <String "cv_name">
    //   38   81:invokeinterface #564 <Method int Cursor.getColumnIndex(String)>
    //   39   86:invokeinterface #571 <Method String Cursor.getString(int)>
    //   40   91:aload           4
    //   41   93:aload           4
    //   42   95:ldc1            #44  <String "cv_value">
    //   43   97:invokeinterface #564 <Method int Cursor.getColumnIndex(String)>
    //   44  102:invokeinterface #571 <Method String Cursor.getString(int)>
    //   45  107:aload           4
    //   46  109:aload           4
    //   47  111:ldc1            #41  <String "cv_scope">
    //   48  113:invokeinterface #564 <Method int Cursor.getColumnIndex(String)>
    //   49  118:invokeinterface #567 <Method int Cursor.getInt(int)>
    //   50  123:invokespecial   #574 <Method void CustomVariable(int, String, String, int)>
    //   51  126:invokevirtual   #578 <Method void CustomVariableBuffer.setCustomVariable(CustomVariable)>
    //   52  129:goto            44
    // catch SQLiteException
    //   53  132:astore_3        
    // try 133 144 handler(s) 192
    //   54  133:ldc2            #299 <String "GoogleAnalyticsTracker">
    //   55  136:aload_3         
    //   56  137:invokevirtual   #302 <Method String SQLiteException.toString()>
    //   57  140:invokestatic    #308 <Method int Log.e(String, String)>
    //   58  143:pop             
    //   59  144:aload           4
    //   60  146:ifnull          156
    //   61  149:aload           4
    //   62  151:invokeinterface #581 <Method void Cursor.close()>
    //   63  156:aload_2         
    //   64  157:areturn         
    //   65  158:aload           4
    //   66  160:ifnull          156
    //   67  163:aload           4
    //   68  165:invokeinterface #581 <Method void Cursor.close()>
    //   69  170:aload_2         
    //   70  171:areturn         
    // finally
    //   71  172:astore          5
    //   72  174:aconst_null     
    //   73  175:astore          4
    //   74  177:aload           4
    //   75  179:ifnull          189
    //   76  182:aload           4
    //   77  184:invokeinterface #581 <Method void Cursor.close()>
    //   78  189:aload           5
    //   79  191:athrow          
    // finally
    //   80  192:astore          5
    //   81  194:goto            177
    // catch SQLiteException
    //   82  197:astore_3        
    //   83  198:aconst_null     
    //   84  199:astore          4
    //   85  201:goto            133
    }

    int getVisits()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #425 <Field int visits>
    //    2    4:ireturn         
    }

    public void loadExistingSession()
    {
    // try 0 11 handler(s) 12
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #261 <Field PersistentHitStore$DataBaseHelper databaseHelper>
    //    3    5:invokevirtual   #529 <Method SQLiteDatabase PersistentHitStore$DataBaseHelper.getWritableDatabase()>
    //    4    8:invokevirtual   #684 <Method void loadExistingSession(SQLiteDatabase)>
    //    5   11:return          
    // catch SQLiteException
    //    6   12:astore_1        
    //    7   13:ldc2            #299 <String "GoogleAnalyticsTracker">
    //    8   16:aload_1         
    //    9   17:invokevirtual   #302 <Method String SQLiteException.toString()>
    //   10   20:invokestatic    #308 <Method int Log.e(String, String)>
    //   11   23:pop             
    //   12   24:return          
    }

    public void loadExistingSession(SQLiteDatabase sqlitedatabase)
    {
    // try 0 15 handler(s) 256 283
    //    0    0:aload_1         
    //    1    1:ldc2            #686 <String "session">
    //    2    4:aconst_null     
    //    3    5:aconst_null     
    //    4    6:aconst_null     
    //    5    7:aconst_null     
    //    6    8:aconst_null     
    //    7    9:aconst_null     
    //    8   10:invokevirtual   #553 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
    //    9   13:astore          6
    //   10   15:aload           6
    //   11   17:astore_3        
    // try 18 98 handler(s) 302 298
    //   12   18:aload_3         
    //   13   19:invokeinterface #590 <Method boolean Cursor.moveToFirst()>
    //   14   24:ifeq            139
    //   15   27:aload_0         
    //   16   28:aload_3         
    //   17   29:iconst_0        
    //   18   30:invokeinterface #600 <Method long Cursor.getLong(int)>
    //   19   35:putfield        #457 <Field long timestampFirst>
    //   20   38:aload_0         
    //   21   39:aload_3         
    //   22   40:iconst_1        
    //   23   41:invokeinterface #600 <Method long Cursor.getLong(int)>
    //   24   46:putfield        #462 <Field long timestampPrevious>
    //   25   49:aload_0         
    //   26   50:aload_3         
    //   27   51:iconst_2        
    //   28   52:invokeinterface #600 <Method long Cursor.getLong(int)>
    //   29   57:putfield        #414 <Field long timestampCurrent>
    //   30   60:aload_0         
    //   31   61:aload_3         
    //   32   62:iconst_3        
    //   33   63:invokeinterface #567 <Method int Cursor.getInt(int)>
    //   34   68:putfield        #425 <Field int visits>
    //   35   71:aload_0         
    //   36   72:aload_3         
    //   37   73:iconst_4        
    //   38   74:invokeinterface #567 <Method int Cursor.getInt(int)>
    //   39   79:putfield        #482 <Field int storeId>
    //   40   82:aload_0         
    //   41   83:aload_1         
    //   42   84:invokevirtual   #392 <Method Referrer readCurrentReferrer(SQLiteDatabase)>
    //   43   87:astore          10
    //   44   89:aload_0         
    //   45   90:getfield        #457 <Field long timestampFirst>
    //   46   93:lconst_0        
    //   47   94:lcmp            
    //   48   95:ifeq            133
    //   49   98:aload           10
    //   50  100:ifnull          307
    // try 103 113 handler(s) 302 298
    //   51  103:aload           10
    //   52  105:invokevirtual   #398 <Method long Referrer.getTimeStamp()>
    //   53  108:lconst_0        
    //   54  109:lcmp            
    //   55  110:ifeq            133
    //   56  113:goto            307
    // try 116 122 handler(s) 302 298
    //   57  116:aload_0         
    //   58  117:iload           11
    //   59  119:putfield        #630 <Field boolean sessionStarted>
    //   60  122:aload_3         
    //   61  123:ifnull          132
    //   62  126:aload_3         
    //   63  127:invokeinterface #581 <Method void Cursor.close()>
    //   64  132:return          
    //   65  133:iconst_0        
    //   66  134:istore          11
    //   67  136:goto            116
    // try 139 173 handler(s) 302 298
    //   68  139:aload_0         
    //   69  140:iconst_0        
    //   70  141:putfield        #630 <Field boolean sessionStarted>
    //   71  144:aload_0         
    //   72  145:iconst_1        
    //   73  146:putfield        #688 <Field boolean useStoredVisitorVars>
    //   74  149:aload_0         
    //   75  150:ldc2            #447 <Int 0x7fffffff>
    //   76  153:new             #690 <Class SecureRandom>
    //   77  156:dup             
    //   78  157:invokespecial   #691 <Method void SecureRandom()>
    //   79  160:invokevirtual   #693 <Method int SecureRandom.nextInt()>
    //   80  163:iand            
    //   81  164:putfield        #482 <Field int storeId>
    //   82  167:aload_3         
    //   83  168:invokeinterface #581 <Method void Cursor.close()>
    // try 173 251 handler(s) 256 283
    //   84  173:new             #407 <Class ContentValues>
    //   85  176:dup             
    //   86  177:invokespecial   #408 <Method void ContentValues()>
    //   87  180:astore          7
    //   88  182:aload           7
    //   89  184:ldc1            #125 <String "timestamp_first">
    //   90  186:lconst_0        
    //   91  187:invokestatic    #420 <Method Long Long.valueOf(long)>
    //   92  190:invokevirtual   #423 <Method void ContentValues.put(String, Long)>
    //   93  193:aload           7
    //   94  195:ldc1            #128 <String "timestamp_previous">
    //   95  197:lconst_0        
    //   96  198:invokestatic    #420 <Method Long Long.valueOf(long)>
    //   97  201:invokevirtual   #423 <Method void ContentValues.put(String, Long)>
    //   98  204:aload           7
    //   99  206:ldc1            #122 <String "timestamp_current">
    //  100  208:lconst_0        
    //  101  209:invokestatic    #420 <Method Long Long.valueOf(long)>
    //  102  212:invokevirtual   #423 <Method void ContentValues.put(String, Long)>
    //  103  215:aload           7
    //  104  217:ldc1            #149 <String "visits">
    //  105  219:iconst_0        
    //  106  220:invokestatic    #430 <Method Integer Integer.valueOf(int)>
    //  107  223:invokevirtual   #433 <Method void ContentValues.put(String, Integer)>
    //  108  226:aload           7
    //  109  228:ldc1            #116 <String "store_id">
    //  110  230:aload_0         
    //  111  231:getfield        #482 <Field int storeId>
    //  112  234:invokestatic    #430 <Method Integer Integer.valueOf(int)>
    //  113  237:invokevirtual   #433 <Method void ContentValues.put(String, Integer)>
    //  114  240:aload_1         
    //  115  241:ldc2            #686 <String "session">
    //  116  244:aconst_null     
    //  117  245:aload           7
    //  118  247:invokevirtual   #518 <Method long SQLiteDatabase.insert(String, String, ContentValues)>
    //  119  250:pop2            
    //  120  251:aconst_null     
    //  121  252:astore_3        
    //  122  253:goto            122
    // catch SQLiteException SQLiteException
    //  123  256:astore          4
    //  124  258:aconst_null     
    //  125  259:astore_3        
    // try 260 272 handler(s) 298
    //  126  260:ldc2            #299 <String "GoogleAnalyticsTracker">
    //  127  263:aload           4
    //  128  265:invokevirtual   #302 <Method String SQLiteException.toString()>
    //  129  268:invokestatic    #308 <Method int Log.e(String, String)>
    //  130  271:pop             
    //  131  272:aload_3         
    //  132  273:ifnull          132
    //  133  276:aload_3         
    //  134  277:invokeinterface #581 <Method void Cursor.close()>
    //  135  282:return          
    // finally
    //  136  283:astore_2        
    //  137  284:aconst_null     
    //  138  285:astore_3        
    //  139  286:aload_3         
    //  140  287:ifnull          296
    //  141  290:aload_3         
    //  142  291:invokeinterface #581 <Method void Cursor.close()>
    //  143  296:aload_2         
    //  144  297:athrow          
    // finally
    //  145  298:astore_2        
    //  146  299:goto            286
    // catch SQLiteException SQLiteException SQLiteException SQLiteException
    //  147  302:astore          4
    //  148  304:goto            260
    //  149  307:iconst_1        
    //  150  308:istore          11
    //  151  310:goto            116
    }

    public Event[] peekEvents(int i, SQLiteDatabase sqlitedatabase, int j)
    {
    //    0    0:new             #697 <Class ArrayList>
    //    1    3:dup             
    //    2    4:invokespecial   #698 <Method void ArrayList()>
    //    3    7:astore          4
    // try 9 29 handler(s) 483 466
    //    4    9:aload_2         
    //    5   10:ldc2            #700 <String "events">
    //    6   13:aconst_null     
    //    7   14:aconst_null     
    //    8   15:aconst_null     
    //    9   16:aconst_null     
    //   10   17:aconst_null     
    //   11   18:ldc1            #56  <String "event_id">
    //   12   20:iload_1         
    //   13   21:invokestatic    #632 <Method String Integer.toString(int)>
    //   14   24:invokevirtual   #703 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String, String)>
    //   15   27:astore          11
    //   16   29:aload           11
    //   17   31:astore          8
    // try 33 222 handler(s) 275 380
    //   18   33:aload           8
    //   19   35:invokeinterface #558 <Method boolean Cursor.moveToNext()>
    //   20   40:ifeq            433
    //   21   43:new             #442 <Class Event>
    //   22   46:dup             
    //   23   47:aload           8
    //   24   49:iconst_0        
    //   25   50:invokeinterface #600 <Method long Cursor.getLong(int)>
    //   26   55:aload           8
    //   27   57:iconst_2        
    //   28   58:invokeinterface #571 <Method String Cursor.getString(int)>
    //   29   63:aload           8
    //   30   65:iconst_3        
    //   31   66:invokeinterface #567 <Method int Cursor.getInt(int)>
    //   32   71:aload           8
    //   33   73:iconst_4        
    //   34   74:invokeinterface #567 <Method int Cursor.getInt(int)>
    //   35   79:aload           8
    //   36   81:iconst_5        
    //   37   82:invokeinterface #567 <Method int Cursor.getInt(int)>
    //   38   87:aload           8
    //   39   89:bipush          6
    //   40   91:invokeinterface #567 <Method int Cursor.getInt(int)>
    //   41   96:aload           8
    //   42   98:bipush          7
    //   43  100:invokeinterface #567 <Method int Cursor.getInt(int)>
    //   44  105:aload           8
    //   45  107:bipush          8
    //   46  109:invokeinterface #571 <Method String Cursor.getString(int)>
    //   47  114:aload           8
    //   48  116:bipush          9
    //   49  118:invokeinterface #571 <Method String Cursor.getString(int)>
    //   50  123:aload           8
    //   51  125:bipush          10
    //   52  127:invokeinterface #571 <Method String Cursor.getString(int)>
    //   53  132:aload           8
    //   54  134:bipush          11
    //   55  136:invokeinterface #567 <Method int Cursor.getInt(int)>
    //   56  141:aload           8
    //   57  143:bipush          12
    //   58  145:invokeinterface #567 <Method int Cursor.getInt(int)>
    //   59  150:aload           8
    //   60  152:bipush          13
    //   61  154:invokeinterface #567 <Method int Cursor.getInt(int)>
    //   62  159:invokespecial   #706 <Method void Event(long, String, int, int, int, int, int, String, String, String, int, int, int)>
    //   63  162:astore          12
    //   64  164:aload           12
    //   65  166:aload           8
    //   66  168:iconst_1        
    //   67  169:invokeinterface #567 <Method int Cursor.getInt(int)>
    //   68  174:invokevirtual   #485 <Method void Event.setUserId(int)>
    //   69  177:aload           8
    //   70  179:ldc1            #56  <String "event_id">
    //   71  181:invokeinterface #564 <Method int Cursor.getColumnIndex(String)>
    //   72  186:istore          13
    //   73  188:aload           8
    //   74  190:iload           13
    //   75  192:invokeinterface #600 <Method long Cursor.getLong(int)>
    //   76  197:lstore          14
    //   77  199:ldc2            #708 <String "__##GOOGLETRANSACTION##__">
    //   78  202:aload           12
    //   79  204:getfield        #710 <Field String Event.category>
    //   80  207:invokevirtual   #714 <Method boolean String.equals(Object)>
    //   81  210:ifeq            314
    //   82  213:aload_0         
    //   83  214:lload           14
    //   84  216:aload_2         
    //   85  217:invokevirtual   #716 <Method Transaction getTransaction(long, SQLiteDatabase)>
    //   86  220:astore          20
    //   87  222:aload           20
    //   88  224:ifnonnull       255
    // try 227 255 handler(s) 275 380
    //   89  227:ldc2            #299 <String "GoogleAnalyticsTracker">
    //   90  230:new             #170 <Class StringBuilder>
    //   91  233:dup             
    //   92  234:invokespecial   #173 <Method void StringBuilder()>
    //   93  237:ldc2            #718 <String "missing expected transaction for event ">
    //   94  240:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //   95  243:lload           14
    //   96  245:invokevirtual   #721 <Method StringBuilder StringBuilder.append(long)>
    //   97  248:invokevirtual   #201 <Method String StringBuilder.toString()>
    //   98  251:invokestatic    #343 <Method int Log.w(String, String)>
    //   99  254:pop             
    // try 255 262 handler(s) 275 380
    //  100  255:aload           12
    //  101  257:aload           20
    //  102  259:invokevirtual   #725 <Method void Event.setTransaction(Transaction)>
    // try 262 272 handler(s) 275 380
    //  103  262:aload           4
    //  104  264:aload           12
    //  105  266:invokeinterface #730 <Method boolean List.add(Object)>
    //  106  271:pop             
    //  107  272:goto            33
    // catch SQLiteException SQLiteException SQLiteException SQLiteException SQLiteException SQLiteException SQLiteException SQLiteException SQLiteException SQLiteException
    //  108  275:astore          5
    //  109  277:aload           8
    //  110  279:astore          6
    // try 281 299 handler(s) 474
    //  111  281:ldc2            #299 <String "GoogleAnalyticsTracker">
    //  112  284:aload           5
    //  113  286:invokevirtual   #302 <Method String SQLiteException.toString()>
    //  114  289:invokestatic    #308 <Method int Log.e(String, String)>
    //  115  292:pop             
    //  116  293:iconst_0        
    //  117  294:anewarray       Event[]
    //  118  297:astore          10
    //  119  299:aload           6
    //  120  301:ifnull          311
    //  121  304:aload           6
    //  122  306:invokeinterface #581 <Method void Cursor.close()>
    //  123  311:aload           10
    //  124  313:areturn         
    // try 314 337 handler(s) 275 380
    //  125  314:ldc2            #732 <String "__##GOOGLEITEM##__">
    //  126  317:aload           12
    //  127  319:getfield        #710 <Field String Event.category>
    //  128  322:invokevirtual   #714 <Method boolean String.equals(Object)>
    //  129  325:ifeq            397
    //  130  328:aload_0         
    //  131  329:lload           14
    //  132  331:aload_2         
    //  133  332:invokevirtual   #734 <Method Item getItem(long, SQLiteDatabase)>
    //  134  335:astore          18
    //  135  337:aload           18
    //  136  339:ifnonnull       370
    // try 342 370 handler(s) 275 380
    //  137  342:ldc2            #299 <String "GoogleAnalyticsTracker">
    //  138  345:new             #170 <Class StringBuilder>
    //  139  348:dup             
    //  140  349:invokespecial   #173 <Method void StringBuilder()>
    //  141  352:ldc2            #736 <String "missing expected item for event ">
    //  142  355:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  143  358:lload           14
    //  144  360:invokevirtual   #721 <Method StringBuilder StringBuilder.append(long)>
    //  145  363:invokevirtual   #201 <Method String StringBuilder.toString()>
    //  146  366:invokestatic    #343 <Method int Log.w(String, String)>
    //  147  369:pop             
    // try 370 377 handler(s) 275 380
    //  148  370:aload           12
    //  149  372:aload           18
    //  150  374:invokevirtual   #740 <Method void Event.setItem(Item)>
    //  151  377:goto            262
    // finally
    //  152  380:astore          7
    //  153  382:aload           8
    //  154  384:ifnull          394
    //  155  387:aload           8
    //  156  389:invokeinterface #581 <Method void Cursor.close()>
    //  157  394:aload           7
    //  158  396:athrow          
    //  159  397:iload_3         
    //  160  398:iconst_1        
    //  161  399:icmple          421
    // try 402 411 handler(s) 275 380
    //  162  402:aload_0         
    //  163  403:lload           14
    //  164  405:aload_2         
    //  165  406:invokevirtual   #742 <Method CustomVariableBuffer getCustomVariables(long, SQLiteDatabase)>
    //  166  409:astore          16
    // try 411 418 handler(s) 275 380
    //  167  411:aload           12
    //  168  413:aload           16
    //  169  415:invokevirtual   #746 <Method void Event.setCustomVariableBuffer(CustomVariableBuffer)>
    //  170  418:goto            262
    // try 421 430 handler(s) 275 380
    //  171  421:new             #544 <Class CustomVariableBuffer>
    //  172  424:dup             
    //  173  425:invokespecial   #545 <Method void CustomVariableBuffer()>
    //  174  428:astore          16
    //  175  430:goto            411
    //  176  433:aload           8
    //  177  435:ifnull          445
    //  178  438:aload           8
    //  179  440:invokeinterface #581 <Method void Cursor.close()>
    //  180  445:aload           4
    //  181  447:aload           4
    //  182  449:invokeinterface #749 <Method int List.size()>
    //  183  454:anewarray       Event[]
    //  184  457:invokeinterface #753 <Method Object[] List.toArray(Object[])>
    //  185  462:checkcast       #755 <Class Event[]>
    //  186  465:areturn         
    // finally
    //  187  466:astore          7
    //  188  468:aconst_null     
    //  189  469:astore          8
    //  190  471:goto            382
    // finally
    //  191  474:astore          7
    //  192  476:aload           6
    //  193  478:astore          8
    //  194  480:goto            382
    // catch SQLiteException
    //  195  483:astore          5
    //  196  485:aconst_null     
    //  197  486:astore          6
    //  198  488:goto            281
    }

    public Hit[] peekHits()
    {
    //    0    0:aload_0         
    //    1    1:sipush          1000
    //    2    4:invokevirtual   #760 <Method Hit[] peekHits(int)>
    //    3    7:areturn         
    }

    public Hit[] peekHits(int i)
    {
    //    0    0:new             #697 <Class ArrayList>
    //    1    3:dup             
    //    2    4:invokespecial   #698 <Method void ArrayList()>
    //    3    7:astore_2        
    // try 8 34 handler(s) 170 145
    //    4    8:aload_0         
    //    5    9:getfield        #261 <Field PersistentHitStore$DataBaseHelper databaseHelper>
    //    6   12:invokevirtual   #619 <Method SQLiteDatabase PersistentHitStore$DataBaseHelper.getReadableDatabase()>
    //    7   15:ldc2            #538 <String "hits">
    //    8   18:aconst_null     
    //    9   19:aconst_null     
    //   10   20:aconst_null     
    //   11   21:aconst_null     
    //   12   22:aconst_null     
    //   13   23:ldc1            #59  <String "hit_id">
    //   14   25:iload_1         
    //   15   26:invokestatic    #632 <Method String Integer.toString(int)>
    //   16   29:invokevirtual   #703 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String, String)>
    //   17   32:astore          8
    //   18   34:aload           8
    //   19   36:astore          4
    // try 38 78 handler(s) 81 165
    //   20   38:aload           4
    //   21   40:invokeinterface #558 <Method boolean Cursor.moveToNext()>
    //   22   45:ifeq            114
    //   23   48:aload_2         
    //   24   49:new             #762 <Class Hit>
    //   25   52:dup             
    //   26   53:aload           4
    //   27   55:iconst_1        
    //   28   56:invokeinterface #571 <Method String Cursor.getString(int)>
    //   29   61:aload           4
    //   30   63:iconst_0        
    //   31   64:invokeinterface #600 <Method long Cursor.getLong(int)>
    //   32   69:invokespecial   #765 <Method void Hit(String, long)>
    //   33   72:invokeinterface #730 <Method boolean List.add(Object)>
    //   34   77:pop             
    //   35   78:goto            38
    // catch SQLiteException
    //   36   81:astore_3        
    // try 82 99 handler(s) 165
    //   37   82:ldc2            #299 <String "GoogleAnalyticsTracker">
    //   38   85:aload_3         
    //   39   86:invokevirtual   #302 <Method String SQLiteException.toString()>
    //   40   89:invokestatic    #308 <Method int Log.e(String, String)>
    //   41   92:pop             
    //   42   93:iconst_0        
    //   43   94:anewarray       Hit[]
    //   44   97:astore          7
    //   45   99:aload           4
    //   46  101:ifnull          111
    //   47  104:aload           4
    //   48  106:invokeinterface #581 <Method void Cursor.close()>
    //   49  111:aload           7
    //   50  113:areturn         
    //   51  114:aload           4
    //   52  116:ifnull          126
    //   53  119:aload           4
    //   54  121:invokeinterface #581 <Method void Cursor.close()>
    //   55  126:aload_2         
    //   56  127:aload_2         
    //   57  128:invokeinterface #749 <Method int List.size()>
    //   58  133:anewarray       Hit[]
    //   59  136:invokeinterface #753 <Method Object[] List.toArray(Object[])>
    //   60  141:checkcast       #767 <Class Hit[]>
    //   61  144:areturn         
    // finally
    //   62  145:astore          5
    //   63  147:aconst_null     
    //   64  148:astore          4
    //   65  150:aload           4
    //   66  152:ifnull          162
    //   67  155:aload           4
    //   68  157:invokeinterface #581 <Method void Cursor.close()>
    //   69  162:aload           5
    //   70  164:athrow          
    // finally
    //   71  165:astore          5
    //   72  167:goto            150
    // catch SQLiteException
    //   73  170:astore_3        
    //   74  171:aconst_null     
    //   75  172:astore          4
    //   76  174:goto            82
    }

    void putCustomVariables(Event event, SQLiteDatabase sqlitedatabase)
    {
    //    0    0:ldc2            #732 <String "__##GOOGLEITEM##__">
    //    1    3:aload_1         
    //    2    4:getfield        #710 <Field String Event.category>
    //    3    7:invokevirtual   #714 <Method boolean String.equals(Object)>
    //    4   10:ifne            26
    //    5   13:ldc2            #708 <String "__##GOOGLETRANSACTION##__">
    //    6   16:aload_1         
    //    7   17:getfield        #710 <Field String Event.category>
    //    8   20:invokevirtual   #714 <Method boolean String.equals(Object)>
    //    9   23:ifeq            27
    //   10   26:return          
    // try 27 40 handler(s) 289
    //   11   27:aload_1         
    //   12   28:invokevirtual   #770 <Method CustomVariableBuffer Event.getCustomVariableBuffer()>
    //   13   31:astore          5
    //   14   33:aload_0         
    //   15   34:getfield        #688 <Field boolean useStoredVisitorVars>
    //   16   37:ifeq            302
    //   17   40:aload           5
    //   18   42:ifnonnull       309
    // try 45 60 handler(s) 289
    //   19   45:new             #544 <Class CustomVariableBuffer>
    //   20   48:dup             
    //   21   49:invokespecial   #545 <Method void CustomVariableBuffer()>
    //   22   52:astore          5
    //   23   54:aload_1         
    //   24   55:aload           5
    //   25   57:invokevirtual   #746 <Method void Event.setCustomVariableBuffer(CustomVariableBuffer)>
    //   26   60:goto            309
    //   27   63:iload           6
    //   28   65:iconst_5        
    //   29   66:icmpgt          109
    // try 69 89 handler(s) 289
    //   30   69:aload_0         
    //   31   70:getfield        #270 <Field CustomVariableBuffer visitorCVCache>
    //   32   73:iload           6
    //   33   75:invokevirtual   #664 <Method CustomVariable CustomVariableBuffer.getCustomVariableAt(int)>
    //   34   78:astore          7
    //   35   80:aload           5
    //   36   82:iload           6
    //   37   84:invokevirtual   #664 <Method CustomVariable CustomVariableBuffer.getCustomVariableAt(int)>
    //   38   87:astore          8
    //   39   89:aload           7
    //   40   91:ifnull          315
    //   41   94:aload           8
    //   42   96:ifnonnull       315
    // try 99 106 handler(s) 289
    //   43   99:aload           5
    //   44  101:aload           7
    //   45  103:invokevirtual   #578 <Method void CustomVariableBuffer.setCustomVariable(CustomVariable)>
    //   46  106:goto            315
    // try 109 114 handler(s) 289
    //   47  109:aload_0         
    //   48  110:iconst_0        
    //   49  111:putfield        #688 <Field boolean useStoredVisitorVars>
    //   50  114:aload           5
    //   51  116:astore          9
    //   52  118:goto            321
    //   53  121:iload           10
    //   54  123:iconst_5        
    //   55  124:icmpgt          26
    // try 127 271 handler(s) 289
    //   56  127:aload           9
    //   57  129:iload           10
    //   58  131:invokevirtual   #774 <Method boolean CustomVariableBuffer.isIndexAvailable(int)>
    //   59  134:ifne            332
    //   60  137:aload           9
    //   61  139:iload           10
    //   62  141:invokevirtual   #664 <Method CustomVariable CustomVariableBuffer.getCustomVariableAt(int)>
    //   63  144:astore          11
    //   64  146:new             #407 <Class ContentValues>
    //   65  149:dup             
    //   66  150:invokespecial   #408 <Method void ContentValues()>
    //   67  153:astore          12
    //   68  155:aload           12
    //   69  157:ldc1            #56  <String "event_id">
    //   70  159:iconst_0        
    //   71  160:invokestatic    #430 <Method Integer Integer.valueOf(int)>
    //   72  163:invokevirtual   #433 <Method void ContentValues.put(String, Integer)>
    //   73  166:aload           12
    //   74  168:ldc1            #35  <String "cv_index">
    //   75  170:aload           11
    //   76  172:invokevirtual   #775 <Method int CustomVariable.getIndex()>
    //   77  175:invokestatic    #430 <Method Integer Integer.valueOf(int)>
    //   78  178:invokevirtual   #433 <Method void ContentValues.put(String, Integer)>
    //   79  181:aload           12
    //   80  183:ldc1            #38  <String "cv_name">
    //   81  185:aload           11
    //   82  187:invokevirtual   #778 <Method String CustomVariable.getName()>
    //   83  190:invokevirtual   #412 <Method void ContentValues.put(String, String)>
    //   84  193:aload           12
    //   85  195:ldc1            #41  <String "cv_scope">
    //   86  197:aload           11
    //   87  199:invokevirtual   #667 <Method int CustomVariable.getScope()>
    //   88  202:invokestatic    #430 <Method Integer Integer.valueOf(int)>
    //   89  205:invokevirtual   #433 <Method void ContentValues.put(String, Integer)>
    //   90  208:aload           12
    //   91  210:ldc1            #44  <String "cv_value">
    //   92  212:aload           11
    //   93  214:invokevirtual   #670 <Method String CustomVariable.getValue()>
    //   94  217:invokevirtual   #412 <Method void ContentValues.put(String, String)>
    //   95  220:iconst_1        
    //   96  221:anewarray       String[]
    //   97  224:astore          13
    //   98  226:aload           13
    //   99  228:iconst_0        
    //  100  229:aload           11
    //  101  231:invokevirtual   #775 <Method int CustomVariable.getIndex()>
    //  102  234:invokestatic    #632 <Method String Integer.toString(int)>
    //  103  237:aastore         
    //  104  238:aload_2         
    //  105  239:ldc2            #678 <String "custom_var_cache">
    //  106  242:aload           12
    //  107  244:ldc2            #780 <String "cv_index = ?">
    //  108  247:aload           13
    //  109  249:invokevirtual   #784 <Method int SQLiteDatabase.update(String, ContentValues, String, String[])>
    //  110  252:pop             
    //  111  253:aload           11
    //  112  255:invokevirtual   #667 <Method int CustomVariable.getScope()>
    //  113  258:iconst_1        
    //  114  259:icmpne          274
    //  115  262:aload_0         
    //  116  263:getfield        #270 <Field CustomVariableBuffer visitorCVCache>
    //  117  266:aload           11
    //  118  268:invokevirtual   #578 <Method void CustomVariableBuffer.setCustomVariable(CustomVariable)>
    //  119  271:goto            332
    // try 274 286 handler(s) 289
    //  120  274:aload_0         
    //  121  275:getfield        #270 <Field CustomVariableBuffer visitorCVCache>
    //  122  278:aload           11
    //  123  280:invokevirtual   #775 <Method int CustomVariable.getIndex()>
    //  124  283:invokevirtual   #787 <Method void CustomVariableBuffer.clearCustomVariableAt(int)>
    //  125  286:goto            332
    // catch SQLiteException SQLiteException SQLiteException SQLiteException SQLiteException SQLiteException SQLiteException
    //  126  289:astore_3        
    //  127  290:ldc2            #299 <String "GoogleAnalyticsTracker">
    //  128  293:aload_3         
    //  129  294:invokevirtual   #302 <Method String SQLiteException.toString()>
    //  130  297:invokestatic    #308 <Method int Log.e(String, String)>
    //  131  300:pop             
    //  132  301:return          
    //  133  302:aload           5
    //  134  304:astore          9
    //  135  306:goto            321
    //  136  309:iconst_1        
    //  137  310:istore          6
    //  138  312:goto            63
    //  139  315:iinc            6  1
    //  140  318:goto            63
    //  141  321:aload           9
    //  142  323:ifnull          26
    //  143  326:iconst_1        
    //  144  327:istore          10
    //  145  329:goto            121
    //  146  332:iinc            10  1
    //  147  335:goto            121
    }

    public void putEvent(Event event)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #533 <Field int numStoredHits>
    //    2    4:sipush          1000
    //    3    7:icmplt          21
    //    4   10:ldc2            #299 <String "GoogleAnalyticsTracker">
    //    5   13:ldc2            #790 <String "Store full. Not storing last event.">
    //    6   16:invokestatic    #343 <Method int Log.w(String, String)>
    //    7   19:pop             
    //    8   20:return          
    //    9   21:aload_0         
    //   10   22:getfield        #249 <Field int sampleRate>
    //   11   25:bipush          100
    //   12   27:icmpeq          89
    //   13   30:aload_1         
    //   14   31:invokevirtual   #480 <Method int Event.getUserId()>
    //   15   34:iconst_m1       
    //   16   35:icmpne          80
    //   17   38:aload_0         
    //   18   39:getfield        #482 <Field int storeId>
    //   19   42:istore          12
    //   20   44:iload           12
    //   21   46:sipush          10000
    //   22   49:irem            
    //   23   50:bipush          100
    //   24   52:aload_0         
    //   25   53:getfield        #249 <Field int sampleRate>
    //   26   56:imul            
    //   27   57:icmplt          89
    //   28   60:invokestatic    #796 <Method GoogleAnalyticsTracker GoogleAnalyticsTracker.getInstance()>
    //   29   63:invokevirtual   #799 <Method boolean GoogleAnalyticsTracker.getDebug()>
    //   30   66:ifeq            20
    //   31   69:ldc2            #299 <String "GoogleAnalyticsTracker">
    //   32   72:ldc2            #801 <String "User has been sampled out. Aborting hit.">
    //   33   75:invokestatic    #804 <Method int Log.v(String, String)>
    //   34   78:pop             
    //   35   79:return          
    //   36   80:aload_1         
    //   37   81:invokevirtual   #480 <Method int Event.getUserId()>
    //   38   84:istore          12
    //   39   86:goto            44
    //   40   89:aload_0         
    //   41   90:monitorenter    
    // try 91 100 handler(s) 155 148
    //   42   91:aload_0         
    //   43   92:getfield        #261 <Field PersistentHitStore$DataBaseHelper databaseHelper>
    //   44   95:invokevirtual   #529 <Method SQLiteDatabase PersistentHitStore$DataBaseHelper.getWritableDatabase()>
    //   45   98:astore          5
    // try 100 118 handler(s) 189 239
    //   46  100:aload           5
    //   47  102:invokevirtual   #510 <Method void SQLiteDatabase.beginTransaction()>
    //   48  105:aload_0         
    //   49  106:getfield        #630 <Field boolean sessionStarted>
    //   50  109:ifne            118
    //   51  112:aload_0         
    //   52  113:aload           5
    //   53  115:invokevirtual   #807 <Method void storeUpdatedSession(SQLiteDatabase)>
    // try 118 131 handler(s) 189 239
    //   54  118:aload_0         
    //   55  119:aload_1         
    //   56  120:aload           5
    //   57  122:iconst_1        
    //   58  123:invokespecial   #286 <Method void putEvent(Event, SQLiteDatabase, boolean)>
    //   59  126:aload           5
    //   60  128:invokevirtual   #521 <Method void SQLiteDatabase.setTransactionSuccessful()>
    // try 131 145 handler(s) 148
    //   61  131:aload           5
    //   62  133:invokevirtual   #524 <Method boolean SQLiteDatabase.inTransaction()>
    //   63  136:ifeq            145
    //   64  139:aload           5
    //   65  141:invokestatic    #291 <Method boolean endTransaction(SQLiteDatabase)>
    //   66  144:pop             
    // try 145 147 handler(s) 148
    //   67  145:aload_0         
    //   68  146:monitorexit     
    //   69  147:return          
    // finally
    //   70  148:astore          4
    // try 150 152 handler(s) 148
    //   71  150:aload_0         
    //   72  151:monitorexit     
    //   73  152:aload           4
    //   74  154:athrow          
    // catch SQLiteException
    //   75  155:astore_2        
    // try 156 188 handler(s) 148
    //   76  156:ldc2            #299 <String "GoogleAnalyticsTracker">
    //   77  159:new             #170 <Class StringBuilder>
    //   78  162:dup             
    //   79  163:invokespecial   #173 <Method void StringBuilder()>
    //   80  166:ldc2            #809 <String "Can't get db: ">
    //   81  169:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //   82  172:aload_2         
    //   83  173:invokevirtual   #302 <Method String SQLiteException.toString()>
    //   84  176:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //   85  179:invokevirtual   #201 <Method String StringBuilder.toString()>
    //   86  182:invokestatic    #308 <Method int Log.e(String, String)>
    //   87  185:pop             
    //   88  186:aload_0         
    //   89  187:monitorexit     
    //   90  188:return          
    // catch SQLiteException SQLiteException
    //   91  189:astore          8
    // try 191 222 handler(s) 239
    //   92  191:ldc2            #299 <String "GoogleAnalyticsTracker">
    //   93  194:new             #170 <Class StringBuilder>
    //   94  197:dup             
    //   95  198:invokespecial   #173 <Method void StringBuilder()>
    //   96  201:ldc2            #811 <String "putEventOuter:">
    //   97  204:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //   98  207:aload           8
    //   99  209:invokevirtual   #302 <Method String SQLiteException.toString()>
    //  100  212:invokevirtual   #179 <Method StringBuilder StringBuilder.append(String)>
    //  101  215:invokevirtual   #201 <Method String StringBuilder.toString()>
    //  102  218:invokestatic    #308 <Method int Log.e(String, String)>
    //  103  221:pop             
    // try 222 236 handler(s) 148
    //  104  222:aload           5
    //  105  224:invokevirtual   #524 <Method boolean SQLiteDatabase.inTransaction()>
    //  106  227:ifeq            145
    //  107  230:aload           5
    //  108  232:invokestatic    #291 <Method boolean endTransaction(SQLiteDatabase)>
    //  109  235:pop             
    //  110  236:goto            145
    // finally
    //  111  239:astore          6
    // try 241 255 handler(s) 148
    //  112  241:aload           5
    //  113  243:invokevirtual   #524 <Method boolean SQLiteDatabase.inTransaction()>
    //  114  246:ifeq            255
    //  115  249:aload           5
    //  116  251:invokestatic    #291 <Method boolean endTransaction(SQLiteDatabase)>
    //  117  254:pop             
    // try 255 258 handler(s) 148
    //  118  255:aload           6
    //  119  257:athrow          
    }

    Referrer readCurrentReferrer(SQLiteDatabase sqlitedatabase)
    {
    // try 0 37 handler(s) 139 170
    //    0    0:aload_1         
    //    1    1:ldc1            #97  <String "referrer">
    //    2    3:iconst_4        
    //    3    4:anewarray       String[]
    //    4    7:dup             
    //    5    8:iconst_0        
    //    6    9:ldc1            #97  <String "referrer">
    //    7   11:aastore         
    //    8   12:dup             
    //    9   13:iconst_1        
    //   10   14:ldc1            #131 <String "timestamp_referrer">
    //   11   16:aastore         
    //   12   17:dup             
    //   13   18:iconst_2        
    //   14   19:ldc1            #104 <String "referrer_visit">
    //   15   21:aastore         
    //   16   22:dup             
    //   17   23:iconst_3        
    //   18   24:ldc1            #101 <String "referrer_index">
    //   19   26:aastore         
    //   20   27:aconst_null     
    //   21   28:aconst_null     
    //   22   29:aconst_null     
    //   23   30:aconst_null     
    //   24   31:aconst_null     
    //   25   32:invokevirtual   #553 <Method Cursor SQLiteDatabase.query(String, String[], String, String[], String, String, String)>
    //   26   35:astore          7
    //   27   37:aload           7
    //   28   39:astore_3        
    // try 40 126 handler(s) 196 185
    //   29   40:aload_3         
    //   30   41:invokeinterface #590 <Method boolean Cursor.moveToFirst()>
    //   31   46:ifeq            204
    //   32   49:aload_3         
    //   33   50:aload_3         
    //   34   51:ldc1            #131 <String "timestamp_referrer">
    //   35   53:invokeinterface #564 <Method int Cursor.getColumnIndex(String)>
    //   36   58:invokeinterface #600 <Method long Cursor.getLong(int)>
    //   37   63:lstore          9
    //   38   65:aload_3         
    //   39   66:aload_3         
    //   40   67:ldc1            #104 <String "referrer_visit">
    //   41   69:invokeinterface #564 <Method int Cursor.getColumnIndex(String)>
    //   42   74:invokeinterface #567 <Method int Cursor.getInt(int)>
    //   43   79:istore          11
    //   44   81:aload_3         
    //   45   82:aload_3         
    //   46   83:ldc1            #101 <String "referrer_index">
    //   47   85:invokeinterface #564 <Method int Cursor.getColumnIndex(String)>
    //   48   90:invokeinterface #567 <Method int Cursor.getInt(int)>
    //   49   95:istore          12
    //   50   97:new             #394 <Class Referrer>
    //   51  100:dup             
    //   52  101:aload_3         
    //   53  102:aload_3         
    //   54  103:ldc1            #97  <String "referrer">
    //   55  105:invokeinterface #564 <Method int Cursor.getColumnIndex(String)>
    //   56  110:invokeinterface #571 <Method String Cursor.getString(int)>
    //   57  115:lload           9
    //   58  117:iload           11
    //   59  119:iload           12
    //   60  121:invokespecial   #440 <Method void Referrer(String, long, int, int)>
    //   61  124:astore          8
    //   62  126:aload_3         
    //   63  127:ifnull          136
    //   64  130:aload_3         
    //   65  131:invokeinterface #581 <Method void Cursor.close()>
    //   66  136:aload           8
    //   67  138:areturn         
    // catch SQLiteException
    //   68  139:astore          4
    //   69  141:aconst_null     
    //   70  142:astore          5
    // try 144 156 handler(s) 189
    //   71  144:ldc2            #299 <String "GoogleAnalyticsTracker">
    //   72  147:aload           4
    //   73  149:invokevirtual   #302 <Method String SQLiteException.toString()>
    //   74  152:invokestatic    #308 <Method int Log.e(String, String)>
    //   75  155:pop             
    //   76  156:aload           5
    //   77  158:ifnull          168
    //   78  161:aload           5
    //   79  163:invokeinterface #581 <Method void Cursor.close()>
    //   80  168:aconst_null     
    //   81  169:areturn         
    // finally
    //   82  170:astore_2        
    //   83  171:aconst_null     
    //   84  172:astore_3        
    //   85  173:aload_3         
    //   86  174:ifnull          183
    //   87  177:aload_3         
    //   88  178:invokeinterface #581 <Method void Cursor.close()>
    //   89  183:aload_2         
    //   90  184:athrow          
    // finally
    //   91  185:astore_2        
    //   92  186:goto            173
    // finally
    //   93  189:astore_2        
    //   94  190:aload           5
    //   95  192:astore_3        
    //   96  193:goto            173
    // catch SQLiteException
    //   97  196:astore          4
    //   98  198:aload_3         
    //   99  199:astore          5
    //  100  201:goto            144
    //  101  204:aconst_null     
    //  102  205:astore          8
    //  103  207:goto            126
    }

    public void setAnonymizeIp(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #473 <Field boolean anonymizeIp>
    //    3    5:return          
    }

    public boolean setReferrer(String s)
    {
    //    0    0:aload_1         
    //    1    1:invokestatic    #815 <Method String formatReferrer(String)>
    //    2    4:astore_2        
    //    3    5:aload_2         
    //    4    6:ifnonnull       11
    //    5    9:iconst_0        
    //    6   10:ireturn         
    // try 11 20 handler(s) 125
    //    7   11:aload_0         
    //    8   12:getfield        #261 <Field PersistentHitStore$DataBaseHelper databaseHelper>
    //    9   15:invokevirtual   #529 <Method SQLiteDatabase PersistentHitStore$DataBaseHelper.getWritableDatabase()>
    //   10   18:astore          5
    //   11   20:aload_0         
    //   12   21:aload           5
    //   13   23:invokevirtual   #392 <Method Referrer readCurrentReferrer(SQLiteDatabase)>
    //   14   26:astore          6
    //   15   28:new             #407 <Class ContentValues>
    //   16   31:dup             
    //   17   32:invokespecial   #408 <Method void ContentValues()>
    //   18   35:astore          7
    //   19   37:aload           7
    //   20   39:ldc1            #97  <String "referrer">
    //   21   41:aload_2         
    //   22   42:invokevirtual   #412 <Method void ContentValues.put(String, String)>
    //   23   45:aload           7
    //   24   47:ldc1            #131 <String "timestamp_referrer">
    //   25   49:lconst_0        
    //   26   50:invokestatic    #420 <Method Long Long.valueOf(long)>
    //   27   53:invokevirtual   #423 <Method void ContentValues.put(String, Long)>
    //   28   56:aload           7
    //   29   58:ldc1            #104 <String "referrer_visit">
    //   30   60:iconst_0        
    //   31   61:invokestatic    #430 <Method Integer Integer.valueOf(int)>
    //   32   64:invokevirtual   #433 <Method void ContentValues.put(String, Integer)>
    //   33   67:aload           6
    //   34   69:ifnull          141
    //   35   72:aload           6
    //   36   74:invokevirtual   #402 <Method int Referrer.getIndex()>
    //   37   77:i2l             
    //   38   78:lstore          8
    //   39   80:aload           6
    //   40   82:invokevirtual   #398 <Method long Referrer.getTimeStamp()>
    //   41   85:lconst_0        
    //   42   86:lcmp            
    //   43   87:ifle            96
    //   44   90:lload           8
    //   45   92:lconst_1        
    //   46   93:ladd            
    //   47   94:lstore          8
    //   48   96:aload           7
    //   49   98:ldc1            #101 <String "referrer_index">
    //   50  100:lload           8
    //   51  102:invokestatic    #420 <Method Long Long.valueOf(long)>
    //   52  105:invokevirtual   #423 <Method void ContentValues.put(String, Long)>
    //   53  108:aload_0         
    //   54  109:aload           5
    //   55  111:aload           7
    //   56  113:invokespecial   #437 <Method boolean setReferrerDatabase(SQLiteDatabase, ContentValues)>
    //   57  116:ifeq            139
    //   58  119:aload_0         
    //   59  120:invokevirtual   #818 <Method void startNewVisit()>
    //   60  123:iconst_1        
    //   61  124:ireturn         
    // catch SQLiteException
    //   62  125:astore_3        
    //   63  126:ldc2            #299 <String "GoogleAnalyticsTracker">
    //   64  129:aload_3         
    //   65  130:invokevirtual   #302 <Method String SQLiteException.toString()>
    //   66  133:invokestatic    #308 <Method int Log.e(String, String)>
    //   67  136:pop             
    //   68  137:iconst_0        
    //   69  138:ireturn         
    //   70  139:iconst_0        
    //   71  140:ireturn         
    //   72  141:lconst_1        
    //   73  142:lstore          8
    //   74  144:goto            96
    }

    public void setSampleRate(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #249 <Field int sampleRate>
    //    3    5:return          
    }

    public void startNewVisit()
    {
    //    0    0:aload_0         
    //    1    1:monitorenter    
    // try 2 20 handler(s) 23
    //    2    2:aload_0         
    //    3    3:iconst_0        
    //    4    4:putfield        #630 <Field boolean sessionStarted>
    //    5    7:aload_0         
    //    6    8:iconst_1        
    //    7    9:putfield        #688 <Field boolean useStoredVisitorVars>
    //    8   12:aload_0         
    //    9   13:aload_0         
    //   10   14:invokevirtual   #821 <Method int getNumStoredHitsFromDb()>
    //   11   17:putfield        #533 <Field int numStoredHits>
    //   12   20:aload_0         
    //   13   21:monitorexit     
    //   14   22:return          
    // finally
    //   15   23:astore_1        
    //   16   24:aload_0         
    //   17   25:monitorexit     
    //   18   26:aload_1         
    //   19   27:athrow          
    }

    void storeUpdatedSession(SQLiteDatabase sqlitedatabase)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #261 <Field PersistentHitStore$DataBaseHelper databaseHelper>
    //    2    4:invokevirtual   #529 <Method SQLiteDatabase PersistentHitStore$DataBaseHelper.getWritableDatabase()>
    //    3    7:astore_2        
    //    4    8:aload_2         
    //    5    9:ldc2            #686 <String "session">
    //    6   12:aconst_null     
    //    7   13:aconst_null     
    //    8   14:invokevirtual   #514 <Method int SQLiteDatabase.delete(String, String, String[])>
    //    9   17:pop             
    //   10   18:aload_0         
    //   11   19:getfield        #457 <Field long timestampFirst>
    //   12   22:lconst_0        
    //   13   23:lcmp            
    //   14   24:ifne            155
    //   15   27:invokestatic    #826 <Method long System.currentTimeMillis()>
    //   16   30:ldc2w           #827 <Long 1000L>
    //   17   33:ldiv            
    //   18   34:lstore          7
    //   19   36:aload_0         
    //   20   37:lload           7
    //   21   39:putfield        #457 <Field long timestampFirst>
    //   22   42:aload_0         
    //   23   43:lload           7
    //   24   45:putfield        #462 <Field long timestampPrevious>
    //   25   48:aload_0         
    //   26   49:lload           7
    //   27   51:putfield        #414 <Field long timestampCurrent>
    //   28   54:aload_0         
    //   29   55:iconst_1        
    //   30   56:putfield        #425 <Field int visits>
    //   31   59:new             #407 <Class ContentValues>
    //   32   62:dup             
    //   33   63:invokespecial   #408 <Method void ContentValues()>
    //   34   66:astore          4
    //   35   68:aload           4
    //   36   70:ldc1            #125 <String "timestamp_first">
    //   37   72:aload_0         
    //   38   73:getfield        #457 <Field long timestampFirst>
    //   39   76:invokestatic    #420 <Method Long Long.valueOf(long)>
    //   40   79:invokevirtual   #423 <Method void ContentValues.put(String, Long)>
    //   41   82:aload           4
    //   42   84:ldc1            #128 <String "timestamp_previous">
    //   43   86:aload_0         
    //   44   87:getfield        #462 <Field long timestampPrevious>
    //   45   90:invokestatic    #420 <Method Long Long.valueOf(long)>
    //   46   93:invokevirtual   #423 <Method void ContentValues.put(String, Long)>
    //   47   96:aload           4
    //   48   98:ldc1            #122 <String "timestamp_current">
    //   49  100:aload_0         
    //   50  101:getfield        #414 <Field long timestampCurrent>
    //   51  104:invokestatic    #420 <Method Long Long.valueOf(long)>
    //   52  107:invokevirtual   #423 <Method void ContentValues.put(String, Long)>
    //   53  110:aload           4
    //   54  112:ldc1            #149 <String "visits">
    //   55  114:aload_0         
    //   56  115:getfield        #425 <Field int visits>
    //   57  118:invokestatic    #430 <Method Integer Integer.valueOf(int)>
    //   58  121:invokevirtual   #433 <Method void ContentValues.put(String, Integer)>
    //   59  124:aload           4
    //   60  126:ldc1            #116 <String "store_id">
    //   61  128:aload_0         
    //   62  129:getfield        #482 <Field int storeId>
    //   63  132:invokestatic    #430 <Method Integer Integer.valueOf(int)>
    //   64  135:invokevirtual   #433 <Method void ContentValues.put(String, Integer)>
    //   65  138:aload_2         
    //   66  139:ldc2            #686 <String "session">
    //   67  142:aconst_null     
    //   68  143:aload           4
    //   69  145:invokevirtual   #518 <Method long SQLiteDatabase.insert(String, String, ContentValues)>
    //   70  148:pop2            
    //   71  149:aload_0         
    //   72  150:iconst_1        
    //   73  151:putfield        #630 <Field boolean sessionStarted>
    //   74  154:return          
    //   75  155:aload_0         
    //   76  156:aload_0         
    //   77  157:getfield        #414 <Field long timestampCurrent>
    //   78  160:putfield        #462 <Field long timestampPrevious>
    //   79  163:aload_0         
    //   80  164:invokestatic    #826 <Method long System.currentTimeMillis()>
    //   81  167:ldc2w           #827 <Long 1000L>
    //   82  170:ldiv            
    //   83  171:putfield        #414 <Field long timestampCurrent>
    //   84  174:aload_0         
    //   85  175:getfield        #414 <Field long timestampCurrent>
    //   86  178:aload_0         
    //   87  179:getfield        #462 <Field long timestampPrevious>
    //   88  182:lcmp            
    //   89  183:ifne            196
    //   90  186:aload_0         
    //   91  187:lconst_1        
    //   92  188:aload_0         
    //   93  189:getfield        #414 <Field long timestampCurrent>
    //   94  192:ladd            
    //   95  193:putfield        #414 <Field long timestampCurrent>
    //   96  196:aload_0         
    //   97  197:iconst_1        
    //   98  198:aload_0         
    //   99  199:getfield        #425 <Field int visits>
    //  100  202:iadd            
    //  101  203:putfield        #425 <Field int visits>
    //  102  206:goto            59
    }

    void writeEventToDatabase(Event event, Referrer referrer, SQLiteDatabase sqlitedatabase, boolean flag)
        throws SQLiteException
    {
    //    0    0:new             #407 <Class ContentValues>
    //    1    3:dup             
    //    2    4:invokespecial   #408 <Method void ContentValues()>
    //    3    7:astore          5
    //    4    9:aload           5
    //    5   11:ldc1            #62  <String "hit_string">
    //    6   13:aload_1         
    //    7   14:aload_2         
    //    8   15:invokestatic    #834 <Method String HitBuilder.constructHitRequestPath(Event, Referrer)>
    //    9   18:invokevirtual   #412 <Method void ContentValues.put(String, String)>
    //   10   21:iload           4
    //   11   23:ifeq            65
    //   12   26:invokestatic    #826 <Method long System.currentTimeMillis()>
    //   13   29:lstore          6
    //   14   31:aload           5
    //   15   33:ldc1            #65  <String "hit_time">
    //   16   35:lload           6
    //   17   37:invokestatic    #420 <Method Long Long.valueOf(long)>
    //   18   40:invokevirtual   #423 <Method void ContentValues.put(String, Long)>
    //   19   43:aload_3         
    //   20   44:ldc2            #538 <String "hits">
    //   21   47:aconst_null     
    //   22   48:aload           5
    //   23   50:invokevirtual   #518 <Method long SQLiteDatabase.insert(String, String, ContentValues)>
    //   24   53:pop2            
    //   25   54:aload_0         
    //   26   55:iconst_1        
    //   27   56:aload_0         
    //   28   57:getfield        #533 <Field int numStoredHits>
    //   29   60:iadd            
    //   30   61:putfield        #533 <Field int numStoredHits>
    //   31   64:return          
    //   32   65:lconst_0        
    //   33   66:lstore          6
    //   34   68:goto            31
    }

    private static final String ACCOUNT_ID = "account_id";
    private static final String ACTION = "action";
    private static final String CATEGORY = "category";
    private static final String CREATE_CUSTOM_VARIABLES_TABLE;
    private static final String CREATE_CUSTOM_VAR_CACHE_TABLE;
    private static final String CREATE_EVENTS_TABLE;
    private static final String CREATE_HITS_TABLE;
    private static final String CREATE_INSTALL_REFERRER_TABLE = "CREATE TABLE install_referrer (referrer TEXT PRIMARY KEY NOT NULL);";
    private static final String CREATE_ITEM_EVENTS_TABLE;
    private static final String CREATE_REFERRER_TABLE = "CREATE TABLE IF NOT EXISTS referrer (referrer TEXT PRIMARY KEY NOT NULL,timestamp_referrer INTEGER NOT NULL,referrer_visit INTEGER NOT NULL DEFAULT 1,referrer_index INTEGER NOT NULL DEFAULT 1);";
    private static final String CREATE_SESSION_TABLE;
    private static final String CREATE_TRANSACTION_EVENTS_TABLE;
    private static final String CUSTOMVAR_ID = "cv_id";
    private static final String CUSTOMVAR_INDEX = "cv_index";
    private static final String CUSTOMVAR_NAME = "cv_name";
    private static final String CUSTOMVAR_SCOPE = "cv_scope";
    private static final String CUSTOMVAR_VALUE = "cv_value";
    private static final String CUSTOM_VARIABLE_COLUMN_TYPE = "CHAR(64) NOT NULL";
    private static final String DATABASE_NAME = "google_analytics.db";
    private static final int DATABASE_VERSION = 5;
    private static final String EVENT_ID = "event_id";
    private static final String HIT_ID = "hit_id";
    private static final String HIT_STRING = "hit_string";
    private static final String HIT_TIMESTAMP = "hit_time";
    private static final String ITEM_CATEGORY = "item_category";
    private static final String ITEM_COUNT = "item_count";
    private static final String ITEM_ID = "item_id";
    private static final String ITEM_NAME = "item_name";
    private static final String ITEM_PRICE = "item_price";
    private static final String ITEM_SKU = "item_sku";
    private static final String LABEL = "label";
    private static final int MAX_HITS = 1000;
    private static final String ORDER_ID = "order_id";
    private static final String RANDOM_VAL = "random_val";
    static final String REFERRER = "referrer";
    static final String REFERRER_COLUMN = "referrer";
    static final String REFERRER_INDEX = "referrer_index";
    static final String REFERRER_VISIT = "referrer_visit";
    private static final String SCREEN_HEIGHT = "screen_height";
    private static final String SCREEN_WIDTH = "screen_width";
    private static final String SHIPPING_COST = "tran_shippingcost";
    private static final String STORE_ID = "store_id";
    private static final String STORE_NAME = "tran_storename";
    private static final String TIMESTAMP_CURRENT = "timestamp_current";
    private static final String TIMESTAMP_FIRST = "timestamp_first";
    private static final String TIMESTAMP_PREVIOUS = "timestamp_previous";
    static final String TIMESTAMP_REFERRER = "timestamp_referrer";
    private static final String TOTAL_COST = "tran_totalcost";
    private static final String TOTAL_TAX = "tran_totaltax";
    private static final String TRANSACTION_ID = "tran_id";
    private static final String USER_ID = "user_id";
    private static final String VALUE = "value";
    private static final String VISITS = "visits";
    private boolean anonymizeIp;
    private DataBaseHelper databaseHelper;
    private volatile int numStoredHits;
    private Random random;
    private int sampleRate;
    private boolean sessionStarted;
    private int storeId;
    private long timestampCurrent;
    private long timestampFirst;
    private long timestampPrevious;
    private boolean useStoredVisitorVars;
    private CustomVariableBuffer visitorCVCache;
    private int visits;

    static String access$000()
    {
    //    0    0:getstatic       #203 <Field String CREATE_EVENTS_TABLE>
    //    1    3:areturn         
    }

    static String access$100()
    {
    //    0    0:getstatic       #211 <Field String CREATE_SESSION_TABLE>
    //    1    3:areturn         
    }

    static String access$200()
    {
    //    0    0:getstatic       #217 <Field String CREATE_CUSTOM_VARIABLES_TABLE>
    //    1    3:areturn         
    }

    static String access$300()
    {
    //    0    0:getstatic       #221 <Field String CREATE_CUSTOM_VAR_CACHE_TABLE>
    //    1    3:areturn         
    }

    static String access$400()
    {
    //    0    0:getstatic       #231 <Field String CREATE_TRANSACTION_EVENTS_TABLE>
    //    1    3:areturn         
    }

    static String access$500()
    {
    //    0    0:getstatic       #237 <Field String CREATE_ITEM_EVENTS_TABLE>
    //    1    3:areturn         
    }

    static String access$600()
    {
    //    0    0:getstatic       #241 <Field String CREATE_HITS_TABLE>
    //    1    3:areturn         
    }

    static CustomVariableBuffer access$702(PersistentHitStore persistenthitstore, CustomVariableBuffer customvariablebuffer)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #270 <Field CustomVariableBuffer visitorCVCache>
    //    3    5:aload_1         
    //    4    6:areturn         
    }

    static void access$800(PersistentHitStore persistenthitstore, Event event, SQLiteDatabase sqlitedatabase, boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:aload_2         
    //    3    3:iload_3         
    //    4    4:invokespecial   #286 <Method void putEvent(Event, SQLiteDatabase, boolean)>
    //    5    7:return          
    }

    static boolean access$900(SQLiteDatabase sqlitedatabase)
    {
    //    0    0:aload_0         
    //    1    1:invokestatic    #291 <Method boolean endTransaction(SQLiteDatabase)>
    //    2    4:ireturn         
    }
}
