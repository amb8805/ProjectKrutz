// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//            NotificationCompatHoneycomb, NotificationCompatIceCreamSandwich, NotificationCompatJellybean

public class NotificationCompat
{
    public static class Action
    {

        public Action(int i, CharSequence charsequence, PendingIntent pendingintent)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #15  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:iload_1         
        //    4    6:putfield        #17  <Field int icon>
        //    5    9:aload_0         
        //    6   10:aload_2         
        //    7   11:putfield        #19  <Field CharSequence title>
        //    8   14:aload_0         
        //    9   15:aload_3         
        //   10   16:putfield        #21  <Field PendingIntent actionIntent>
        //   11   19:return          
        }

        public PendingIntent actionIntent;
        public int icon;
        public CharSequence title;
    }

    public static class BigPictureStyle extends Style
    {

        public BigPictureStyle()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #13  <Method void NotificationCompat$Style()>
        //    2    4:return          
        }

        public BigPictureStyle(Builder builder)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #13  <Method void NotificationCompat$Style()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:invokevirtual   #17  <Method void setBuilder(NotificationCompat$Builder)>
        //    5    9:return          
        }

        public BigPictureStyle bigLargeIcon(Bitmap bitmap)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #21  <Field Bitmap mBigLargeIcon>
        //    3    5:aload_0         
        //    4    6:iconst_1        
        //    5    7:putfield        #23  <Field boolean mBigLargeIconSet>
        //    6   10:aload_0         
        //    7   11:areturn         
        }

        public BigPictureStyle bigPicture(Bitmap bitmap)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #26  <Field Bitmap mPicture>
        //    3    5:aload_0         
        //    4    6:areturn         
        }

        public BigPictureStyle setBigContentTitle(CharSequence charsequence)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #32  <Field CharSequence mBigContentTitle>
        //    3    5:aload_0         
        //    4    6:areturn         
        }

        public BigPictureStyle setSummaryText(CharSequence charsequence)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #36  <Field CharSequence mSummaryText>
        //    3    5:aload_0         
        //    4    6:iconst_1        
        //    5    7:putfield        #39  <Field boolean mSummaryTextSet>
        //    6   10:aload_0         
        //    7   11:areturn         
        }

        Bitmap mBigLargeIcon;
        boolean mBigLargeIconSet;
        Bitmap mPicture;
    }

    public static class BigTextStyle extends Style
    {

        public BigTextStyle()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void NotificationCompat$Style()>
        //    2    4:return          
        }

        public BigTextStyle(Builder builder)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void NotificationCompat$Style()>
        //    2    4:aload_0         
        //    3    5:aload_1         
        //    4    6:invokevirtual   #14  <Method void setBuilder(NotificationCompat$Builder)>
        //    5    9:return          
        }

        public BigTextStyle bigText(CharSequence charsequence)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #18  <Field CharSequence mBigText>
        //    3    5:aload_0         
        //    4    6:areturn         
        }

        public BigTextStyle setBigContentTitle(CharSequence charsequence)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #22  <Field CharSequence mBigContentTitle>
        //    3    5:aload_0         
        //    4    6:areturn         
        }

        public BigTextStyle setSummaryText(CharSequence charsequence)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #26  <Field CharSequence mSummaryText>
        //    3    5:aload_0         
        //    4    6:iconst_1        
        //    5    7:putfield        #30  <Field boolean mSummaryTextSet>
        //    6   10:aload_0         
        //    7   11:areturn         
        }

        CharSequence mBigText;
    }

    public static class Builder
    {

        public Builder(Context context)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #38  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:new             #40  <Class ArrayList>
        //    4    8:dup             
        //    5    9:invokespecial   #41  <Method void ArrayList()>
        //    6   12:putfield        #43  <Field ArrayList mActions>
        //    7   15:aload_0         
        //    8   16:new             #45  <Class Notification>
        //    9   19:dup             
        //   10   20:invokespecial   #46  <Method void Notification()>
        //   11   23:putfield        #48  <Field Notification mNotification>
        //   12   26:aload_0         
        //   13   27:aload_1         
        //   14   28:putfield        #50  <Field Context mContext>
        //   15   31:aload_0         
        //   16   32:getfield        #48  <Field Notification mNotification>
        //   17   35:invokestatic    #56  <Method long System.currentTimeMillis()>
        //   18   38:putfield        #60  <Field long Notification.when>
        //   19   41:aload_0         
        //   20   42:getfield        #48  <Field Notification mNotification>
        //   21   45:iconst_m1       
        //   22   46:putfield        #63  <Field int Notification.audioStreamType>
        //   23   49:aload_0         
        //   24   50:iconst_0        
        //   25   51:putfield        #65  <Field int mPriority>
        //   26   54:return          
        }

        private void setFlag(int i, boolean flag)
        {
        //    0    0:iload_2         
        //    1    1:ifeq            23
        //    2    4:aload_0         
        //    3    5:getfield        #48  <Field Notification mNotification>
        //    4    8:astore          4
        //    5   10:aload           4
        //    6   12:iload_1         
        //    7   13:aload           4
        //    8   15:getfield        #70  <Field int Notification.flags>
        //    9   18:ior             
        //   10   19:putfield        #70  <Field int Notification.flags>
        //   11   22:return          
        //   12   23:aload_0         
        //   13   24:getfield        #48  <Field Notification mNotification>
        //   14   27:astore_3        
        //   15   28:aload_3         
        //   16   29:aload_3         
        //   17   30:getfield        #70  <Field int Notification.flags>
        //   18   33:iload_1         
        //   19   34:iconst_m1       
        //   20   35:ixor            
        //   21   36:iand            
        //   22   37:putfield        #70  <Field int Notification.flags>
        //   23   40:return          
        }

        public Builder addAction(int i, CharSequence charsequence, PendingIntent pendingintent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #43  <Field ArrayList mActions>
        //    2    4:new             #74  <Class NotificationCompat$Action>
        //    3    7:dup             
        //    4    8:iload_1         
        //    5    9:aload_2         
        //    6   10:aload_3         
        //    7   11:invokespecial   #77  <Method void NotificationCompat$Action(int, CharSequence, PendingIntent)>
        //    8   14:invokevirtual   #81  <Method boolean ArrayList.add(Object)>
        //    9   17:pop             
        //   10   18:aload_0         
        //   11   19:areturn         
        }

        public Notification build()
        {
        //    0    0:invokestatic    #89  <Method NotificationCompat$NotificationCompatImpl NotificationCompat.access$000()>
        //    1    3:aload_0         
        //    2    4:invokeinterface #94  <Method Notification NotificationCompat$NotificationCompatImpl.build(NotificationCompat$Builder)>
        //    3    9:areturn         
        }

        public Notification getNotification()
        {
        //    0    0:invokestatic    #89  <Method NotificationCompat$NotificationCompatImpl NotificationCompat.access$000()>
        //    1    3:aload_0         
        //    2    4:invokeinterface #94  <Method Notification NotificationCompat$NotificationCompatImpl.build(NotificationCompat$Builder)>
        //    3    9:areturn         
        }

        public Builder setAutoCancel(boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:bipush          16
        //    2    3:iload_1         
        //    3    4:invokespecial   #100 <Method void setFlag(int, boolean)>
        //    4    7:aload_0         
        //    5    8:areturn         
        }

        public Builder setContent(RemoteViews remoteviews)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #48  <Field Notification mNotification>
        //    2    4:aload_1         
        //    3    5:putfield        #105 <Field RemoteViews Notification.contentView>
        //    4    8:aload_0         
        //    5    9:areturn         
        }

        public Builder setContentInfo(CharSequence charsequence)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #109 <Field CharSequence mContentInfo>
        //    3    5:aload_0         
        //    4    6:areturn         
        }

        public Builder setContentIntent(PendingIntent pendingintent)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #113 <Field PendingIntent mContentIntent>
        //    3    5:aload_0         
        //    4    6:areturn         
        }

        public Builder setContentText(CharSequence charsequence)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #116 <Field CharSequence mContentText>
        //    3    5:aload_0         
        //    4    6:areturn         
        }

        public Builder setContentTitle(CharSequence charsequence)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #119 <Field CharSequence mContentTitle>
        //    3    5:aload_0         
        //    4    6:areturn         
        }

        public Builder setDefaults(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #48  <Field Notification mNotification>
        //    2    4:iload_1         
        //    3    5:putfield        #124 <Field int Notification.defaults>
        //    4    8:iload_1         
        //    5    9:iconst_4        
        //    6   10:iand            
        //    7   11:ifeq            29
        //    8   14:aload_0         
        //    9   15:getfield        #48  <Field Notification mNotification>
        //   10   18:astore_2        
        //   11   19:aload_2         
        //   12   20:iconst_1        
        //   13   21:aload_2         
        //   14   22:getfield        #70  <Field int Notification.flags>
        //   15   25:ior             
        //   16   26:putfield        #70  <Field int Notification.flags>
        //   17   29:aload_0         
        //   18   30:areturn         
        }

        public Builder setDeleteIntent(PendingIntent pendingintent)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #48  <Field Notification mNotification>
        //    2    4:aload_1         
        //    3    5:putfield        #128 <Field PendingIntent Notification.deleteIntent>
        //    4    8:aload_0         
        //    5    9:areturn         
        }

        public Builder setFullScreenIntent(PendingIntent pendingintent, boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #132 <Field PendingIntent mFullScreenIntent>
        //    3    5:aload_0         
        //    4    6:sipush          128
        //    5    9:iload_2         
        //    6   10:invokespecial   #100 <Method void setFlag(int, boolean)>
        //    7   13:aload_0         
        //    8   14:areturn         
        }

        public Builder setLargeIcon(Bitmap bitmap)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #136 <Field Bitmap mLargeIcon>
        //    3    5:aload_0         
        //    4    6:areturn         
        }

        public Builder setLights(int i, int j, int k)
        {
        //    0    0:iconst_1        
        //    1    1:istore          4
        //    2    3:aload_0         
        //    3    4:getfield        #48  <Field Notification mNotification>
        //    4    7:iload_1         
        //    5    8:putfield        #141 <Field int Notification.ledARGB>
        //    6   11:aload_0         
        //    7   12:getfield        #48  <Field Notification mNotification>
        //    8   15:iload_2         
        //    9   16:putfield        #144 <Field int Notification.ledOnMS>
        //   10   19:aload_0         
        //   11   20:getfield        #48  <Field Notification mNotification>
        //   12   23:iload_3         
        //   13   24:putfield        #147 <Field int Notification.ledOffMS>
        //   14   27:aload_0         
        //   15   28:getfield        #48  <Field Notification mNotification>
        //   16   31:getfield        #144 <Field int Notification.ledOnMS>
        //   17   34:ifeq            86
        //   18   37:aload_0         
        //   19   38:getfield        #48  <Field Notification mNotification>
        //   20   41:getfield        #147 <Field int Notification.ledOffMS>
        //   21   44:ifeq            86
        //   22   47:iload           4
        //   23   49:istore          5
        //   24   51:aload_0         
        //   25   52:getfield        #48  <Field Notification mNotification>
        //   26   55:astore          6
        //   27   57:bipush          -2
        //   28   59:aload_0         
        //   29   60:getfield        #48  <Field Notification mNotification>
        //   30   63:getfield        #70  <Field int Notification.flags>
        //   31   66:iand            
        //   32   67:istore          7
        //   33   69:iload           5
        //   34   71:ifeq            92
        //   35   74:aload           6
        //   36   76:iload           4
        //   37   78:iload           7
        //   38   80:ior             
        //   39   81:putfield        #70  <Field int Notification.flags>
        //   40   84:aload_0         
        //   41   85:areturn         
        //   42   86:iconst_0        
        //   43   87:istore          5
        //   44   89:goto            51
        //   45   92:iconst_0        
        //   46   93:istore          4
        //   47   95:goto            74
        }

        public Builder setNumber(int i)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:putfield        #150 <Field int mNumber>
        //    3    5:aload_0         
        //    4    6:areturn         
        }

        public Builder setOngoing(boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:iconst_2        
        //    2    2:iload_1         
        //    3    3:invokespecial   #100 <Method void setFlag(int, boolean)>
        //    4    6:aload_0         
        //    5    7:areturn         
        }

        public Builder setOnlyAlertOnce(boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:bipush          8
        //    2    3:iload_1         
        //    3    4:invokespecial   #100 <Method void setFlag(int, boolean)>
        //    4    7:aload_0         
        //    5    8:areturn         
        }

        public Builder setPriority(int i)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:putfield        #65  <Field int mPriority>
        //    3    5:aload_0         
        //    4    6:areturn         
        }

        public Builder setProgress(int i, int j, boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:putfield        #157 <Field int mProgressMax>
        //    3    5:aload_0         
        //    4    6:iload_2         
        //    5    7:putfield        #159 <Field int mProgress>
        //    6   10:aload_0         
        //    7   11:iload_3         
        //    8   12:putfield        #161 <Field boolean mProgressIndeterminate>
        //    9   15:aload_0         
        //   10   16:areturn         
        }

        public Builder setSmallIcon(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #48  <Field Notification mNotification>
        //    2    4:iload_1         
        //    3    5:putfield        #165 <Field int Notification.icon>
        //    4    8:aload_0         
        //    5    9:areturn         
        }

        public Builder setSmallIcon(int i, int j)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #48  <Field Notification mNotification>
        //    2    4:iload_1         
        //    3    5:putfield        #165 <Field int Notification.icon>
        //    4    8:aload_0         
        //    5    9:getfield        #48  <Field Notification mNotification>
        //    6   12:iload_2         
        //    7   13:putfield        #169 <Field int Notification.iconLevel>
        //    8   16:aload_0         
        //    9   17:areturn         
        }

        public Builder setSound(Uri uri)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #48  <Field Notification mNotification>
        //    2    4:aload_1         
        //    3    5:putfield        #175 <Field Uri Notification.sound>
        //    4    8:aload_0         
        //    5    9:getfield        #48  <Field Notification mNotification>
        //    6   12:iconst_m1       
        //    7   13:putfield        #63  <Field int Notification.audioStreamType>
        //    8   16:aload_0         
        //    9   17:areturn         
        }

        public Builder setSound(Uri uri, int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #48  <Field Notification mNotification>
        //    2    4:aload_1         
        //    3    5:putfield        #175 <Field Uri Notification.sound>
        //    4    8:aload_0         
        //    5    9:getfield        #48  <Field Notification mNotification>
        //    6   12:iload_2         
        //    7   13:putfield        #63  <Field int Notification.audioStreamType>
        //    8   16:aload_0         
        //    9   17:areturn         
        }

        public Builder setStyle(Style style)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #180 <Field NotificationCompat$Style mStyle>
        //    2    4:aload_1         
        //    3    5:if_acmpeq       28
        //    4    8:aload_0         
        //    5    9:aload_1         
        //    6   10:putfield        #180 <Field NotificationCompat$Style mStyle>
        //    7   13:aload_0         
        //    8   14:getfield        #180 <Field NotificationCompat$Style mStyle>
        //    9   17:ifnull          28
        //   10   20:aload_0         
        //   11   21:getfield        #180 <Field NotificationCompat$Style mStyle>
        //   12   24:aload_0         
        //   13   25:invokevirtual   #186 <Method void NotificationCompat$Style.setBuilder(NotificationCompat$Builder)>
        //   14   28:aload_0         
        //   15   29:areturn         
        }

        public Builder setSubText(CharSequence charsequence)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #189 <Field CharSequence mSubText>
        //    3    5:aload_0         
        //    4    6:areturn         
        }

        public Builder setTicker(CharSequence charsequence)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #48  <Field Notification mNotification>
        //    2    4:aload_1         
        //    3    5:putfield        #193 <Field CharSequence Notification.tickerText>
        //    4    8:aload_0         
        //    5    9:areturn         
        }

        public Builder setTicker(CharSequence charsequence, RemoteViews remoteviews)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #48  <Field Notification mNotification>
        //    2    4:aload_1         
        //    3    5:putfield        #193 <Field CharSequence Notification.tickerText>
        //    4    8:aload_0         
        //    5    9:aload_2         
        //    6   10:putfield        #196 <Field RemoteViews mTickerView>
        //    7   13:aload_0         
        //    8   14:areturn         
        }

        public Builder setUsesChronometer(boolean flag)
        {
        //    0    0:aload_0         
        //    1    1:iload_1         
        //    2    2:putfield        #199 <Field boolean mUseChronometer>
        //    3    5:aload_0         
        //    4    6:areturn         
        }

        public Builder setVibrate(long al[])
        {
        //    0    0:aload_0         
        //    1    1:getfield        #48  <Field Notification mNotification>
        //    2    4:aload_1         
        //    3    5:putfield        #205 <Field long[] Notification.vibrate>
        //    4    8:aload_0         
        //    5    9:areturn         
        }

        public Builder setWhen(long l)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #48  <Field Notification mNotification>
        //    2    4:lload_1         
        //    3    5:putfield        #60  <Field long Notification.when>
        //    4    8:aload_0         
        //    5    9:areturn         
        }

        ArrayList mActions;
        CharSequence mContentInfo;
        PendingIntent mContentIntent;
        CharSequence mContentText;
        CharSequence mContentTitle;
        Context mContext;
        PendingIntent mFullScreenIntent;
        Bitmap mLargeIcon;
        Notification mNotification;
        int mNumber;
        int mPriority;
        int mProgress;
        boolean mProgressIndeterminate;
        int mProgressMax;
        Style mStyle;
        CharSequence mSubText;
        RemoteViews mTickerView;
        boolean mUseChronometer;
    }

    public static class InboxStyle extends Style
    {

        public InboxStyle()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #11  <Method void NotificationCompat$Style()>
        //    2    4:aload_0         
        //    3    5:new             #13  <Class ArrayList>
        //    4    8:dup             
        //    5    9:invokespecial   #14  <Method void ArrayList()>
        //    6   12:putfield        #16  <Field ArrayList mTexts>
        //    7   15:return          
        }

        public InboxStyle(Builder builder)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #11  <Method void NotificationCompat$Style()>
        //    2    4:aload_0         
        //    3    5:new             #13  <Class ArrayList>
        //    4    8:dup             
        //    5    9:invokespecial   #14  <Method void ArrayList()>
        //    6   12:putfield        #16  <Field ArrayList mTexts>
        //    7   15:aload_0         
        //    8   16:aload_1         
        //    9   17:invokevirtual   #20  <Method void setBuilder(NotificationCompat$Builder)>
        //   10   20:return          
        }

        public InboxStyle addLine(CharSequence charsequence)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field ArrayList mTexts>
        //    2    4:aload_1         
        //    3    5:invokevirtual   #26  <Method boolean ArrayList.add(Object)>
        //    4    8:pop             
        //    5    9:aload_0         
        //    6   10:areturn         
        }

        public InboxStyle setBigContentTitle(CharSequence charsequence)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #31  <Field CharSequence mBigContentTitle>
        //    3    5:aload_0         
        //    4    6:areturn         
        }

        public InboxStyle setSummaryText(CharSequence charsequence)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #35  <Field CharSequence mSummaryText>
        //    3    5:aload_0         
        //    4    6:iconst_1        
        //    5    7:putfield        #39  <Field boolean mSummaryTextSet>
        //    6   10:aload_0         
        //    7   11:areturn         
        }

        ArrayList mTexts;
    }

    static interface NotificationCompatImpl
    {

        public abstract Notification build(Builder builder);
    }

    static class NotificationCompatImplBase
        implements NotificationCompatImpl
    {

        NotificationCompatImplBase()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public Notification build(Builder builder)
        {
        //    0    0:aload_1         
        //    1    1:getfield        #18  <Field Notification NotificationCompat$Builder.mNotification>
        //    2    4:astore_2        
        //    3    5:aload_2         
        //    4    6:aload_1         
        //    5    7:getfield        #22  <Field Context NotificationCompat$Builder.mContext>
        //    6   10:aload_1         
        //    7   11:getfield        #26  <Field CharSequence NotificationCompat$Builder.mContentTitle>
        //    8   14:aload_1         
        //    9   15:getfield        #29  <Field CharSequence NotificationCompat$Builder.mContentText>
        //   10   18:aload_1         
        //   11   19:getfield        #33  <Field PendingIntent NotificationCompat$Builder.mContentIntent>
        //   12   22:invokevirtual   #39  <Method void Notification.setLatestEventInfo(Context, CharSequence, CharSequence, PendingIntent)>
        //   13   25:aload_1         
        //   14   26:getfield        #43  <Field int NotificationCompat$Builder.mPriority>
        //   15   29:ifle            44
        //   16   32:aload_2         
        //   17   33:sipush          128
        //   18   36:aload_2         
        //   19   37:getfield        #46  <Field int Notification.flags>
        //   20   40:ior             
        //   21   41:putfield        #46  <Field int Notification.flags>
        //   22   44:aload_2         
        //   23   45:areturn         
        }
    }

    static class NotificationCompatImplHoneycomb
        implements NotificationCompatImpl
    {

        NotificationCompatImplHoneycomb()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public Notification build(Builder builder)
        {
        //    0    0:aload_1         
        //    1    1:getfield        #18  <Field Context NotificationCompat$Builder.mContext>
        //    2    4:aload_1         
        //    3    5:getfield        #22  <Field Notification NotificationCompat$Builder.mNotification>
        //    4    8:aload_1         
        //    5    9:getfield        #26  <Field CharSequence NotificationCompat$Builder.mContentTitle>
        //    6   12:aload_1         
        //    7   13:getfield        #29  <Field CharSequence NotificationCompat$Builder.mContentText>
        //    8   16:aload_1         
        //    9   17:getfield        #32  <Field CharSequence NotificationCompat$Builder.mContentInfo>
        //   10   20:aload_1         
        //   11   21:getfield        #36  <Field RemoteViews NotificationCompat$Builder.mTickerView>
        //   12   24:aload_1         
        //   13   25:getfield        #40  <Field int NotificationCompat$Builder.mNumber>
        //   14   28:aload_1         
        //   15   29:getfield        #44  <Field PendingIntent NotificationCompat$Builder.mContentIntent>
        //   16   32:aload_1         
        //   17   33:getfield        #47  <Field PendingIntent NotificationCompat$Builder.mFullScreenIntent>
        //   18   36:aload_1         
        //   19   37:getfield        #51  <Field Bitmap NotificationCompat$Builder.mLargeIcon>
        //   20   40:invokestatic    #57  <Method Notification NotificationCompatHoneycomb.add(Context, Notification, CharSequence, CharSequence, CharSequence, RemoteViews, int, PendingIntent, PendingIntent, Bitmap)>
        //   21   43:areturn         
        }
    }

    static class NotificationCompatImplIceCreamSandwich
        implements NotificationCompatImpl
    {

        NotificationCompatImplIceCreamSandwich()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public Notification build(Builder builder)
        {
        //    0    0:aload_1         
        //    1    1:getfield        #18  <Field Context NotificationCompat$Builder.mContext>
        //    2    4:aload_1         
        //    3    5:getfield        #22  <Field Notification NotificationCompat$Builder.mNotification>
        //    4    8:aload_1         
        //    5    9:getfield        #26  <Field CharSequence NotificationCompat$Builder.mContentTitle>
        //    6   12:aload_1         
        //    7   13:getfield        #29  <Field CharSequence NotificationCompat$Builder.mContentText>
        //    8   16:aload_1         
        //    9   17:getfield        #32  <Field CharSequence NotificationCompat$Builder.mContentInfo>
        //   10   20:aload_1         
        //   11   21:getfield        #36  <Field RemoteViews NotificationCompat$Builder.mTickerView>
        //   12   24:aload_1         
        //   13   25:getfield        #40  <Field int NotificationCompat$Builder.mNumber>
        //   14   28:aload_1         
        //   15   29:getfield        #44  <Field PendingIntent NotificationCompat$Builder.mContentIntent>
        //   16   32:aload_1         
        //   17   33:getfield        #47  <Field PendingIntent NotificationCompat$Builder.mFullScreenIntent>
        //   18   36:aload_1         
        //   19   37:getfield        #51  <Field Bitmap NotificationCompat$Builder.mLargeIcon>
        //   20   40:aload_1         
        //   21   41:getfield        #54  <Field int NotificationCompat$Builder.mProgressMax>
        //   22   44:aload_1         
        //   23   45:getfield        #57  <Field int NotificationCompat$Builder.mProgress>
        //   24   48:aload_1         
        //   25   49:getfield        #61  <Field boolean NotificationCompat$Builder.mProgressIndeterminate>
        //   26   52:invokestatic    #67  <Method Notification NotificationCompatIceCreamSandwich.add(Context, Notification, CharSequence, CharSequence, CharSequence, RemoteViews, int, PendingIntent, PendingIntent, Bitmap, int, int, boolean)>
        //   27   55:areturn         
        }
    }

    static class NotificationCompatImplJellybean
        implements NotificationCompatImpl
    {

        NotificationCompatImplJellybean()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public Notification build(Builder builder)
        {
        //    0    0:new             #14  <Class NotificationCompatJellybean>
        //    1    3:dup             
        //    2    4:aload_1         
        //    3    5:getfield        #20  <Field Context NotificationCompat$Builder.mContext>
        //    4    8:aload_1         
        //    5    9:getfield        #24  <Field Notification NotificationCompat$Builder.mNotification>
        //    6   12:aload_1         
        //    7   13:getfield        #28  <Field CharSequence NotificationCompat$Builder.mContentTitle>
        //    8   16:aload_1         
        //    9   17:getfield        #31  <Field CharSequence NotificationCompat$Builder.mContentText>
        //   10   20:aload_1         
        //   11   21:getfield        #34  <Field CharSequence NotificationCompat$Builder.mContentInfo>
        //   12   24:aload_1         
        //   13   25:getfield        #38  <Field RemoteViews NotificationCompat$Builder.mTickerView>
        //   14   28:aload_1         
        //   15   29:getfield        #42  <Field int NotificationCompat$Builder.mNumber>
        //   16   32:aload_1         
        //   17   33:getfield        #46  <Field PendingIntent NotificationCompat$Builder.mContentIntent>
        //   18   36:aload_1         
        //   19   37:getfield        #49  <Field PendingIntent NotificationCompat$Builder.mFullScreenIntent>
        //   20   40:aload_1         
        //   21   41:getfield        #53  <Field Bitmap NotificationCompat$Builder.mLargeIcon>
        //   22   44:aload_1         
        //   23   45:getfield        #56  <Field int NotificationCompat$Builder.mProgressMax>
        //   24   48:aload_1         
        //   25   49:getfield        #59  <Field int NotificationCompat$Builder.mProgress>
        //   26   52:aload_1         
        //   27   53:getfield        #63  <Field boolean NotificationCompat$Builder.mProgressIndeterminate>
        //   28   56:aload_1         
        //   29   57:getfield        #66  <Field boolean NotificationCompat$Builder.mUseChronometer>
        //   30   60:aload_1         
        //   31   61:getfield        #69  <Field int NotificationCompat$Builder.mPriority>
        //   32   64:aload_1         
        //   33   65:getfield        #72  <Field CharSequence NotificationCompat$Builder.mSubText>
        //   34   68:invokespecial   #75  <Method void NotificationCompatJellybean(Context, Notification, CharSequence, CharSequence, CharSequence, RemoteViews, int, PendingIntent, PendingIntent, Bitmap, int, int, boolean, boolean, int, CharSequence)>
        //   35   71:astore_2        
        //   36   72:aload_1         
        //   37   73:getfield        #79  <Field ArrayList NotificationCompat$Builder.mActions>
        //   38   76:invokevirtual   #85  <Method Iterator ArrayList.iterator()>
        //   39   79:astore_3        
        //   40   80:aload_3         
        //   41   81:invokeinterface #91  <Method boolean Iterator.hasNext()>
        //   42   86:ifeq            122
        //   43   89:aload_3         
        //   44   90:invokeinterface #95  <Method Object Iterator.next()>
        //   45   95:checkcast       #97  <Class NotificationCompat$Action>
        //   46   98:astore          7
        //   47  100:aload_2         
        //   48  101:aload           7
        //   49  103:getfield        #100 <Field int NotificationCompat$Action.icon>
        //   50  106:aload           7
        //   51  108:getfield        #103 <Field CharSequence NotificationCompat$Action.title>
        //   52  111:aload           7
        //   53  113:getfield        #106 <Field PendingIntent NotificationCompat$Action.actionIntent>
        //   54  116:invokevirtual   #110 <Method void NotificationCompatJellybean.addAction(int, CharSequence, PendingIntent)>
        //   55  119:goto            80
        //   56  122:aload_1         
        //   57  123:getfield        #114 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
        //   58  126:ifnull          172
        //   59  129:aload_1         
        //   60  130:getfield        #114 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
        //   61  133:instanceof      #116 <Class NotificationCompat$BigTextStyle>
        //   62  136:ifeq            177
        //   63  139:aload_1         
        //   64  140:getfield        #114 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
        //   65  143:checkcast       #116 <Class NotificationCompat$BigTextStyle>
        //   66  146:astore          6
        //   67  148:aload_2         
        //   68  149:aload           6
        //   69  151:getfield        #119 <Field CharSequence NotificationCompat$BigTextStyle.mBigContentTitle>
        //   70  154:aload           6
        //   71  156:getfield        #122 <Field boolean NotificationCompat$BigTextStyle.mSummaryTextSet>
        //   72  159:aload           6
        //   73  161:getfield        #125 <Field CharSequence NotificationCompat$BigTextStyle.mSummaryText>
        //   74  164:aload           6
        //   75  166:getfield        #128 <Field CharSequence NotificationCompat$BigTextStyle.mBigText>
        //   76  169:invokevirtual   #132 <Method void NotificationCompatJellybean.addBigTextStyle(CharSequence, boolean, CharSequence, CharSequence)>
        //   77  172:aload_2         
        //   78  173:invokevirtual   #135 <Method Notification NotificationCompatJellybean.build()>
        //   79  176:areturn         
        //   80  177:aload_1         
        //   81  178:getfield        #114 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
        //   82  181:instanceof      #137 <Class NotificationCompat$InboxStyle>
        //   83  184:ifeq            223
        //   84  187:aload_1         
        //   85  188:getfield        #114 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
        //   86  191:checkcast       #137 <Class NotificationCompat$InboxStyle>
        //   87  194:astore          5
        //   88  196:aload_2         
        //   89  197:aload           5
        //   90  199:getfield        #138 <Field CharSequence NotificationCompat$InboxStyle.mBigContentTitle>
        //   91  202:aload           5
        //   92  204:getfield        #139 <Field boolean NotificationCompat$InboxStyle.mSummaryTextSet>
        //   93  207:aload           5
        //   94  209:getfield        #140 <Field CharSequence NotificationCompat$InboxStyle.mSummaryText>
        //   95  212:aload           5
        //   96  214:getfield        #143 <Field ArrayList NotificationCompat$InboxStyle.mTexts>
        //   97  217:invokevirtual   #147 <Method void NotificationCompatJellybean.addInboxStyle(CharSequence, boolean, CharSequence, ArrayList)>
        //   98  220:goto            172
        //   99  223:aload_1         
        //  100  224:getfield        #114 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
        //  101  227:instanceof      #149 <Class NotificationCompat$BigPictureStyle>
        //  102  230:ifeq            172
        //  103  233:aload_1         
        //  104  234:getfield        #114 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
        //  105  237:checkcast       #149 <Class NotificationCompat$BigPictureStyle>
        //  106  240:astore          4
        //  107  242:aload_2         
        //  108  243:aload           4
        //  109  245:getfield        #150 <Field CharSequence NotificationCompat$BigPictureStyle.mBigContentTitle>
        //  110  248:aload           4
        //  111  250:getfield        #151 <Field boolean NotificationCompat$BigPictureStyle.mSummaryTextSet>
        //  112  253:aload           4
        //  113  255:getfield        #152 <Field CharSequence NotificationCompat$BigPictureStyle.mSummaryText>
        //  114  258:aload           4
        //  115  260:getfield        #155 <Field Bitmap NotificationCompat$BigPictureStyle.mPicture>
        //  116  263:aload           4
        //  117  265:getfield        #158 <Field Bitmap NotificationCompat$BigPictureStyle.mBigLargeIcon>
        //  118  268:aload           4
        //  119  270:getfield        #161 <Field boolean NotificationCompat$BigPictureStyle.mBigLargeIconSet>
        //  120  273:invokevirtual   #165 <Method void NotificationCompatJellybean.addBigPictureStyle(CharSequence, boolean, CharSequence, Bitmap, Bitmap, boolean)>
        //  121  276:goto            172
        }
    }

    public static abstract class Style
    {

        public Style()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #15  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:iconst_0        
        //    4    6:putfield        #17  <Field boolean mSummaryTextSet>
        //    5    9:return          
        }

        public Notification build()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field NotificationCompat$Builder mBuilder>
        //    2    4:astore_1        
        //    3    5:aconst_null     
        //    4    6:astore_2        
        //    5    7:aload_1         
        //    6    8:ifnull          19
        //    7   11:aload_0         
        //    8   12:getfield        #21  <Field NotificationCompat$Builder mBuilder>
        //    9   15:invokevirtual   #25  <Method Notification NotificationCompat$Builder.build()>
        //   10   18:astore_2        
        //   11   19:aload_2         
        //   12   20:areturn         
        }

        public void setBuilder(Builder builder)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #21  <Field NotificationCompat$Builder mBuilder>
        //    2    4:aload_1         
        //    3    5:if_acmpeq       29
        //    4    8:aload_0         
        //    5    9:aload_1         
        //    6   10:putfield        #21  <Field NotificationCompat$Builder mBuilder>
        //    7   13:aload_0         
        //    8   14:getfield        #21  <Field NotificationCompat$Builder mBuilder>
        //    9   17:ifnull          29
        //   10   20:aload_0         
        //   11   21:getfield        #21  <Field NotificationCompat$Builder mBuilder>
        //   12   24:aload_0         
        //   13   25:invokevirtual   #31  <Method NotificationCompat$Builder NotificationCompat$Builder.setStyle(NotificationCompat$Style)>
        //   14   28:pop             
        //   15   29:return          
        }

        CharSequence mBigContentTitle;
        Builder mBuilder;
        CharSequence mSummaryText;
        boolean mSummaryTextSet;
    }


    static 
    {
    //    0    0:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          16
    //    2    5:icmplt          19
    //    3    8:new             #28  <Class NotificationCompat$NotificationCompatImplJellybean>
    //    4   11:dup             
    //    5   12:invokespecial   #31  <Method void NotificationCompat$NotificationCompatImplJellybean()>
    //    6   15:putstatic       #33  <Field NotificationCompat$NotificationCompatImpl IMPL>
    //    7   18:return          
    //    8   19:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
    //    9   22:bipush          14
    //   10   24:icmplt          38
    //   11   27:new             #35  <Class NotificationCompat$NotificationCompatImplIceCreamSandwich>
    //   12   30:dup             
    //   13   31:invokespecial   #36  <Method void NotificationCompat$NotificationCompatImplIceCreamSandwich()>
    //   14   34:putstatic       #33  <Field NotificationCompat$NotificationCompatImpl IMPL>
    //   15   37:return          
    //   16   38:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
    //   17   41:bipush          11
    //   18   43:icmplt          57
    //   19   46:new             #38  <Class NotificationCompat$NotificationCompatImplHoneycomb>
    //   20   49:dup             
    //   21   50:invokespecial   #39  <Method void NotificationCompat$NotificationCompatImplHoneycomb()>
    //   22   53:putstatic       #33  <Field NotificationCompat$NotificationCompatImpl IMPL>
    //   23   56:return          
    //   24   57:new             #41  <Class NotificationCompat$NotificationCompatImplBase>
    //   25   60:dup             
    //   26   61:invokespecial   #42  <Method void NotificationCompat$NotificationCompatImplBase()>
    //   27   64:putstatic       #33  <Field NotificationCompat$NotificationCompatImpl IMPL>
    //   28   67:return          
    }

    public NotificationCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #43  <Method void Object()>
    //    2    4:return          
    }

    static NotificationCompatImpl access$000()
    {
    //    0    0:getstatic       #33  <Field NotificationCompat$NotificationCompatImpl IMPL>
    //    1    3:areturn         
// Previous instruction length mismatch
    //    2    0:getstatic       #33  <Field NotificationCompat$NotificationCompatImpl IMPL>
    //    3    3:areturn         
    }

    public static final int FLAG_HIGH_PRIORITY = 128;
    private static final NotificationCompatImpl IMPL;
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;

    static NotificationCompatImpl access$000()
    {
    //    0    0:getstatic       #33  <Field NotificationCompat$NotificationCompatImpl IMPL>
    //    1    3:areturn         
    }
}
