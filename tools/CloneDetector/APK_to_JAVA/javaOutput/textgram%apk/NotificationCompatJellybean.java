// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;

class NotificationCompatJellybean
{

    public NotificationCompatJellybean(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
            PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag, boolean flag1, 
            int l, CharSequence charsequence3)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #11  <Method void Object()>
    //    2    4:new             #13  <Class android.app.Notification$Builder>
    //    3    7:dup             
    //    4    8:aload_1         
    //    5    9:invokespecial   #16  <Method void android.app.Notification$Builder(Context)>
    //    6   12:aload_2         
    //    7   13:getfield        #22  <Field long Notification.when>
    //    8   16:invokevirtual   #26  <Method android.app.Notification$Builder android.app.Notification$Builder.setWhen(long)>
    //    9   19:aload_2         
    //   10   20:getfield        #30  <Field int Notification.icon>
    //   11   23:aload_2         
    //   12   24:getfield        #33  <Field int Notification.iconLevel>
    //   13   27:invokevirtual   #37  <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int, int)>
    //   14   30:aload_2         
    //   15   31:getfield        #41  <Field RemoteViews Notification.contentView>
    //   16   34:invokevirtual   #45  <Method android.app.Notification$Builder android.app.Notification$Builder.setContent(RemoteViews)>
    //   17   37:aload_2         
    //   18   38:getfield        #49  <Field CharSequence Notification.tickerText>
    //   19   41:aload           6
    //   20   43:invokevirtual   #53  <Method android.app.Notification$Builder android.app.Notification$Builder.setTicker(CharSequence, RemoteViews)>
    //   21   46:aload_2         
    //   22   47:getfield        #57  <Field android.net.Uri Notification.sound>
    //   23   50:aload_2         
    //   24   51:getfield        #60  <Field int Notification.audioStreamType>
    //   25   54:invokevirtual   #64  <Method android.app.Notification$Builder android.app.Notification$Builder.setSound(android.net.Uri, int)>
    //   26   57:aload_2         
    //   27   58:getfield        #68  <Field long[] Notification.vibrate>
    //   28   61:invokevirtual   #72  <Method android.app.Notification$Builder android.app.Notification$Builder.setVibrate(long[])>
    //   29   64:aload_2         
    //   30   65:getfield        #75  <Field int Notification.ledARGB>
    //   31   68:aload_2         
    //   32   69:getfield        #78  <Field int Notification.ledOnMS>
    //   33   72:aload_2         
    //   34   73:getfield        #81  <Field int Notification.ledOffMS>
    //   35   76:invokevirtual   #85  <Method android.app.Notification$Builder android.app.Notification$Builder.setLights(int, int, int)>
    //   36   79:astore          17
    //   37   81:iconst_2        
    //   38   82:aload_2         
    //   39   83:getfield        #88  <Field int Notification.flags>
    //   40   86:iand            
    //   41   87:ifeq            241
    //   42   90:iconst_1        
    //   43   91:istore          18
    //   44   93:aload           17
    //   45   95:iload           18
    //   46   97:invokevirtual   #92  <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
    //   47  100:astore          19
    //   48  102:bipush          8
    //   49  104:aload_2         
    //   50  105:getfield        #88  <Field int Notification.flags>
    //   51  108:iand            
    //   52  109:ifeq            247
    //   53  112:iconst_1        
    //   54  113:istore          20
    //   55  115:aload           19
    //   56  117:iload           20
    //   57  119:invokevirtual   #95  <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
    //   58  122:astore          21
    //   59  124:bipush          16
    //   60  126:aload_2         
    //   61  127:getfield        #88  <Field int Notification.flags>
    //   62  130:iand            
    //   63  131:ifeq            253
    //   64  134:iconst_1        
    //   65  135:istore          22
    //   66  137:aload           21
    //   67  139:iload           22
    //   68  141:invokevirtual   #98  <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
    //   69  144:aload_2         
    //   70  145:getfield        #101 <Field int Notification.defaults>
    //   71  148:invokevirtual   #105 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
    //   72  151:aload_3         
    //   73  152:invokevirtual   #109 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
    //   74  155:aload           4
    //   75  157:invokevirtual   #112 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
    //   76  160:aload           16
    //   77  162:invokevirtual   #115 <Method android.app.Notification$Builder android.app.Notification$Builder.setSubText(CharSequence)>
    //   78  165:aload           5
    //   79  167:invokevirtual   #118 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
    //   80  170:aload           8
    //   81  172:invokevirtual   #122 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
    //   82  175:aload_2         
    //   83  176:getfield        #126 <Field PendingIntent Notification.deleteIntent>
    //   84  179:invokevirtual   #129 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(PendingIntent)>
    //   85  182:astore          23
    //   86  184:sipush          128
    //   87  187:aload_2         
    //   88  188:getfield        #88  <Field int Notification.flags>
    //   89  191:iand            
    //   90  192:ifeq            259
    //   91  195:iconst_1        
    //   92  196:istore          24
    //   93  198:aload_0         
    //   94  199:aload           23
    //   95  201:aload           9
    //   96  203:iload           24
    //   97  205:invokevirtual   #133 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(PendingIntent, boolean)>
    //   98  208:aload           10
    //   99  210:invokevirtual   #137 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(Bitmap)>
    //  100  213:iload           7
    //  101  215:invokevirtual   #140 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
    //  102  218:iload           14
    //  103  220:invokevirtual   #143 <Method android.app.Notification$Builder android.app.Notification$Builder.setUsesChronometer(boolean)>
    //  104  223:iload           15
    //  105  225:invokevirtual   #146 <Method android.app.Notification$Builder android.app.Notification$Builder.setPriority(int)>
    //  106  228:iload           11
    //  107  230:iload           12
    //  108  232:iload           13
    //  109  234:invokevirtual   #150 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
    //  110  237:putfield        #152 <Field android.app.Notification$Builder b>
    //  111  240:return          
    //  112  241:iconst_0        
    //  113  242:istore          18
    //  114  244:goto            93
    //  115  247:iconst_0        
    //  116  248:istore          20
    //  117  250:goto            115
    //  118  253:iconst_0        
    //  119  254:istore          22
    //  120  256:goto            137
    //  121  259:iconst_0        
    //  122  260:istore          24
    //  123  262:goto            198
    }

    public void addAction(int i, CharSequence charsequence, PendingIntent pendingintent)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #152 <Field android.app.Notification$Builder b>
    //    2    4:iload_1         
    //    3    5:aload_2         
    //    4    6:aload_3         
    //    5    7:invokevirtual   #157 <Method android.app.Notification$Builder android.app.Notification$Builder.addAction(int, CharSequence, PendingIntent)>
    //    6   10:pop             
    //    7   11:return          
    }

    public void addBigPictureStyle(CharSequence charsequence, boolean flag, CharSequence charsequence1, Bitmap bitmap, Bitmap bitmap1, boolean flag1)
    {
    //    0    0:new             #161 <Class android.app.Notification$BigPictureStyle>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:getfield        #152 <Field android.app.Notification$Builder b>
    //    4    8:invokespecial   #164 <Method void android.app.Notification$BigPictureStyle(android.app.Notification$Builder)>
    //    5   11:aload_1         
    //    6   12:invokevirtual   #168 <Method android.app.Notification$BigPictureStyle android.app.Notification$BigPictureStyle.setBigContentTitle(CharSequence)>
    //    7   15:aload           4
    //    8   17:invokevirtual   #172 <Method android.app.Notification$BigPictureStyle android.app.Notification$BigPictureStyle.bigPicture(Bitmap)>
    //    9   20:astore          7
    //   10   22:iload           6
    //   11   24:ifeq            35
    //   12   27:aload           7
    //   13   29:aload           5
    //   14   31:invokevirtual   #175 <Method android.app.Notification$BigPictureStyle android.app.Notification$BigPictureStyle.bigLargeIcon(Bitmap)>
    //   15   34:pop             
    //   16   35:iload_2         
    //   17   36:ifeq            46
    //   18   39:aload           7
    //   19   41:aload_3         
    //   20   42:invokevirtual   #178 <Method android.app.Notification$BigPictureStyle android.app.Notification$BigPictureStyle.setSummaryText(CharSequence)>
    //   21   45:pop             
    //   22   46:return          
    }

    public void addBigTextStyle(CharSequence charsequence, boolean flag, CharSequence charsequence1, CharSequence charsequence2)
    {
    //    0    0:new             #182 <Class android.app.Notification$BigTextStyle>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:getfield        #152 <Field android.app.Notification$Builder b>
    //    4    8:invokespecial   #183 <Method void android.app.Notification$BigTextStyle(android.app.Notification$Builder)>
    //    5   11:aload_1         
    //    6   12:invokevirtual   #186 <Method android.app.Notification$BigTextStyle android.app.Notification$BigTextStyle.setBigContentTitle(CharSequence)>
    //    7   15:aload           4
    //    8   17:invokevirtual   #189 <Method android.app.Notification$BigTextStyle android.app.Notification$BigTextStyle.bigText(CharSequence)>
    //    9   20:astore          5
    //   10   22:iload_2         
    //   11   23:ifeq            33
    //   12   26:aload           5
    //   13   28:aload_3         
    //   14   29:invokevirtual   #191 <Method android.app.Notification$BigTextStyle android.app.Notification$BigTextStyle.setSummaryText(CharSequence)>
    //   15   32:pop             
    //   16   33:return          
    }

    public void addInboxStyle(CharSequence charsequence, boolean flag, CharSequence charsequence1, ArrayList arraylist)
    {
    //    0    0:new             #195 <Class android.app.Notification$InboxStyle>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:getfield        #152 <Field android.app.Notification$Builder b>
    //    4    8:invokespecial   #196 <Method void android.app.Notification$InboxStyle(android.app.Notification$Builder)>
    //    5   11:aload_1         
    //    6   12:invokevirtual   #199 <Method android.app.Notification$InboxStyle android.app.Notification$InboxStyle.setBigContentTitle(CharSequence)>
    //    7   15:astore          5
    //    8   17:iload_2         
    //    9   18:ifeq            28
    //   10   21:aload           5
    //   11   23:aload_3         
    //   12   24:invokevirtual   #201 <Method android.app.Notification$InboxStyle android.app.Notification$InboxStyle.setSummaryText(CharSequence)>
    //   13   27:pop             
    //   14   28:aload           4
    //   15   30:invokevirtual   #207 <Method Iterator ArrayList.iterator()>
    //   16   33:astore          6
    //   17   35:aload           6
    //   18   37:invokeinterface #213 <Method boolean Iterator.hasNext()>
    //   19   42:ifeq            64
    //   20   45:aload           5
    //   21   47:aload           6
    //   22   49:invokeinterface #217 <Method Object Iterator.next()>
    //   23   54:checkcast       #219 <Class CharSequence>
    //   24   57:invokevirtual   #222 <Method android.app.Notification$InboxStyle android.app.Notification$InboxStyle.addLine(CharSequence)>
    //   25   60:pop             
    //   26   61:goto            35
    //   27   64:return          
    }

    public Notification build()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #152 <Field android.app.Notification$Builder b>
    //    2    4:invokevirtual   #226 <Method Notification android.app.Notification$Builder.build()>
    //    3    7:areturn         
    }

    private android.app.Notification.Builder b;
}
