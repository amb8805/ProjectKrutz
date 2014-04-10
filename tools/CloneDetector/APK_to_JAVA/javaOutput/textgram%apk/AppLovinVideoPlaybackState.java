// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.impl.adview;


public final class AppLovinVideoPlaybackState extends Enum
{

    static 
    {
    //    0    0:new             #2   <Class AppLovinVideoPlaybackState>
    //    1    3:dup             
    //    2    4:ldc1            #14  <String "PLAYING">
    //    3    6:iconst_0        
    //    4    7:invokespecial   #18  <Method void AppLovinVideoPlaybackState(String, int)>
    //    5   10:putstatic       #20  <Field AppLovinVideoPlaybackState PLAYING>
    //    6   13:new             #2   <Class AppLovinVideoPlaybackState>
    //    7   16:dup             
    //    8   17:ldc1            #21  <String "PAUSED">
    //    9   19:iconst_1        
    //   10   20:invokespecial   #18  <Method void AppLovinVideoPlaybackState(String, int)>
    //   11   23:putstatic       #23  <Field AppLovinVideoPlaybackState PAUSED>
    //   12   26:new             #2   <Class AppLovinVideoPlaybackState>
    //   13   29:dup             
    //   14   30:ldc1            #24  <String "STOPPED">
    //   15   32:iconst_2        
    //   16   33:invokespecial   #18  <Method void AppLovinVideoPlaybackState(String, int)>
    //   17   36:putstatic       #26  <Field AppLovinVideoPlaybackState STOPPED>
    //   18   39:new             #2   <Class AppLovinVideoPlaybackState>
    //   19   42:dup             
    //   20   43:ldc1            #27  <String "FAILED">
    //   21   45:iconst_3        
    //   22   46:invokespecial   #18  <Method void AppLovinVideoPlaybackState(String, int)>
    //   23   49:putstatic       #29  <Field AppLovinVideoPlaybackState FAILED>
    //   24   52:iconst_4        
    //   25   53:anewarray       AppLovinVideoPlaybackState[]
    //   26   56:astore_0        
    //   27   57:aload_0         
    //   28   58:iconst_0        
    //   29   59:getstatic       #20  <Field AppLovinVideoPlaybackState PLAYING>
    //   30   62:aastore         
    //   31   63:aload_0         
    //   32   64:iconst_1        
    //   33   65:getstatic       #23  <Field AppLovinVideoPlaybackState PAUSED>
    //   34   68:aastore         
    //   35   69:aload_0         
    //   36   70:iconst_2        
    //   37   71:getstatic       #26  <Field AppLovinVideoPlaybackState STOPPED>
    //   38   74:aastore         
    //   39   75:aload_0         
    //   40   76:iconst_3        
    //   41   77:getstatic       #29  <Field AppLovinVideoPlaybackState FAILED>
    //   42   80:aastore         
    //   43   81:aload_0         
    //   44   82:putstatic       #31  <Field AppLovinVideoPlaybackState[] a>
    //   45   85:return          
    }

    private AppLovinVideoPlaybackState(String s, int i)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:iload_2         
    //    3    3:invokespecial   #32  <Method void Enum(String, int)>
    //    4    6:return          
    }

    public static AppLovinVideoPlaybackState valueOf(String s)
    {
    //    0    0:ldc1            #2   <Class AppLovinVideoPlaybackState>
    //    1    2:aload_0         
    //    2    3:invokestatic    #37  <Method Enum Enum.valueOf(Class, String)>
    //    3    6:checkcast       #2   <Class AppLovinVideoPlaybackState>
    //    4    9:areturn         
    }

    public static AppLovinVideoPlaybackState[] values()
    {
    //    0    0:getstatic       #31  <Field AppLovinVideoPlaybackState[] a>
    //    1    3:invokevirtual   #44  <Method Object _5B_Lcom.applovin.impl.adview.AppLovinVideoPlaybackState_3B_.clone()>
    //    2    6:checkcast       #40  <Class AppLovinVideoPlaybackState[]>
    //    3    9:areturn         
    }

    public static final AppLovinVideoPlaybackState FAILED;
    public static final AppLovinVideoPlaybackState PAUSED;
    public static final AppLovinVideoPlaybackState PLAYING;
    public static final AppLovinVideoPlaybackState STOPPED;
    private static final AppLovinVideoPlaybackState a[];
}
