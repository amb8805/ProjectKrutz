// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;

class NotificationCompatHoneycomb
{

    NotificationCompatHoneycomb()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #8   <Method void Object()>
    //    2    4:return          
    }

    static Notification add(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, PendingIntent pendingintent, 
            PendingIntent pendingintent1, Bitmap bitmap)
    {
    //    0    0:new             #12  <Class android.app.Notification$Builder>
    //    1    3:dup             
    //    2    4:aload_0         
    //    3    5:invokespecial   #15  <Method void android.app.Notification$Builder(Context)>
    //    4    8:aload_1         
    //    5    9:getfield        #21  <Field long Notification.when>
    //    6   12:invokevirtual   #25  <Method android.app.Notification$Builder android.app.Notification$Builder.setWhen(long)>
    //    7   15:aload_1         
    //    8   16:getfield        #29  <Field int Notification.icon>
    //    9   19:aload_1         
    //   10   20:getfield        #32  <Field int Notification.iconLevel>
    //   11   23:invokevirtual   #36  <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int, int)>
    //   12   26:aload_1         
    //   13   27:getfield        #40  <Field RemoteViews Notification.contentView>
    //   14   30:invokevirtual   #44  <Method android.app.Notification$Builder android.app.Notification$Builder.setContent(RemoteViews)>
    //   15   33:aload_1         
    //   16   34:getfield        #48  <Field CharSequence Notification.tickerText>
    //   17   37:aload           5
    //   18   39:invokevirtual   #52  <Method android.app.Notification$Builder android.app.Notification$Builder.setTicker(CharSequence, RemoteViews)>
    //   19   42:aload_1         
    //   20   43:getfield        #56  <Field android.net.Uri Notification.sound>
    //   21   46:aload_1         
    //   22   47:getfield        #59  <Field int Notification.audioStreamType>
    //   23   50:invokevirtual   #63  <Method android.app.Notification$Builder android.app.Notification$Builder.setSound(android.net.Uri, int)>
    //   24   53:aload_1         
    //   25   54:getfield        #67  <Field long[] Notification.vibrate>
    //   26   57:invokevirtual   #71  <Method android.app.Notification$Builder android.app.Notification$Builder.setVibrate(long[])>
    //   27   60:aload_1         
    //   28   61:getfield        #74  <Field int Notification.ledARGB>
    //   29   64:aload_1         
    //   30   65:getfield        #77  <Field int Notification.ledOnMS>
    //   31   68:aload_1         
    //   32   69:getfield        #80  <Field int Notification.ledOffMS>
    //   33   72:invokevirtual   #84  <Method android.app.Notification$Builder android.app.Notification$Builder.setLights(int, int, int)>
    //   34   75:astore          10
    //   35   77:iconst_2        
    //   36   78:aload_1         
    //   37   79:getfield        #87  <Field int Notification.flags>
    //   38   82:iand            
    //   39   83:ifeq            211
    //   40   86:iconst_1        
    //   41   87:istore          11
    //   42   89:aload           10
    //   43   91:iload           11
    //   44   93:invokevirtual   #91  <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
    //   45   96:astore          12
    //   46   98:bipush          8
    //   47  100:aload_1         
    //   48  101:getfield        #87  <Field int Notification.flags>
    //   49  104:iand            
    //   50  105:ifeq            217
    //   51  108:iconst_1        
    //   52  109:istore          13
    //   53  111:aload           12
    //   54  113:iload           13
    //   55  115:invokevirtual   #94  <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
    //   56  118:astore          14
    //   57  120:bipush          16
    //   58  122:aload_1         
    //   59  123:getfield        #87  <Field int Notification.flags>
    //   60  126:iand            
    //   61  127:ifeq            223
    //   62  130:iconst_1        
    //   63  131:istore          15
    //   64  133:aload           14
    //   65  135:iload           15
    //   66  137:invokevirtual   #97  <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
    //   67  140:aload_1         
    //   68  141:getfield        #100 <Field int Notification.defaults>
    //   69  144:invokevirtual   #104 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
    //   70  147:aload_2         
    //   71  148:invokevirtual   #108 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
    //   72  151:aload_3         
    //   73  152:invokevirtual   #111 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
    //   74  155:aload           4
    //   75  157:invokevirtual   #114 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
    //   76  160:aload           7
    //   77  162:invokevirtual   #118 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
    //   78  165:aload_1         
    //   79  166:getfield        #122 <Field PendingIntent Notification.deleteIntent>
    //   80  169:invokevirtual   #125 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(PendingIntent)>
    //   81  172:astore          16
    //   82  174:sipush          128
    //   83  177:aload_1         
    //   84  178:getfield        #87  <Field int Notification.flags>
    //   85  181:iand            
    //   86  182:ifeq            229
    //   87  185:iconst_1        
    //   88  186:istore          17
    //   89  188:aload           16
    //   90  190:aload           8
    //   91  192:iload           17
    //   92  194:invokevirtual   #129 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(PendingIntent, boolean)>
    //   93  197:aload           9
    //   94  199:invokevirtual   #133 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(Bitmap)>
    //   95  202:iload           6
    //   96  204:invokevirtual   #136 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
    //   97  207:invokevirtual   #140 <Method Notification android.app.Notification$Builder.getNotification()>
    //   98  210:areturn         
    //   99  211:iconst_0        
    //  100  212:istore          11
    //  101  214:goto            89
    //  102  217:iconst_0        
    //  103  218:istore          13
    //  104  220:goto            111
    //  105  223:iconst_0        
    //  106  224:istore          15
    //  107  226:goto            133
    //  108  229:iconst_0        
    //  109  230:istore          17
    //  110  232:goto            188
    }
}
