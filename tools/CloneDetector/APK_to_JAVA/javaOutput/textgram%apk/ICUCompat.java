// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.text;


// Referenced classes of package android.support.v4.text:
//            ICUCompatIcs

public class ICUCompat
{
    static interface ICUCompatImpl
    {

        public abstract String addLikelySubtags(String s);

        public abstract String getScript(String s);
    }

    static class ICUCompatImplBase
        implements ICUCompatImpl
    {

        ICUCompatImplBase()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public String addLikelySubtags(String s)
        {
        //    0    0:aload_1         
        //    1    1:areturn         
        }

        public String getScript(String s)
        {
        //    0    0:aconst_null     
        //    1    1:areturn         
        }
    }

    static class ICUCompatImplIcs
        implements ICUCompatImpl
    {

        ICUCompatImplIcs()
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #10  <Method void Object()>
        //    2    4:return          
        }

        public String addLikelySubtags(String s)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #16  <Method String ICUCompatIcs.addLikelySubtags(String)>
        //    2    4:areturn         
        }

        public String getScript(String s)
        {
        //    0    0:aload_1         
        //    1    1:invokestatic    #19  <Method String ICUCompatIcs.getScript(String)>
        //    2    4:areturn         
        }
    }


    static 
    {
    //    0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
    //    1    3:bipush          14
    //    2    5:icmplt          19
    //    3    8:new             #16  <Class ICUCompat$ICUCompatImplIcs>
    //    4   11:dup             
    //    5   12:invokespecial   #19  <Method void ICUCompat$ICUCompatImplIcs()>
    //    6   15:putstatic       #21  <Field ICUCompat$ICUCompatImpl IMPL>
    //    7   18:return          
    //    8   19:new             #23  <Class ICUCompat$ICUCompatImplBase>
    //    9   22:dup             
    //   10   23:invokespecial   #24  <Method void ICUCompat$ICUCompatImplBase()>
    //   11   26:putstatic       #21  <Field ICUCompat$ICUCompatImpl IMPL>
    //   12   29:return          
    }

    public ICUCompat()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #25  <Method void Object()>
    //    2    4:return          
    }

    public static String addLikelySubtags(String s)
    {
    //    0    0:getstatic       #21  <Field ICUCompat$ICUCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #31  <Method String ICUCompat$ICUCompatImpl.addLikelySubtags(String)>
    //    3    9:areturn         
    }

    public static String getScript(String s)
    {
    //    0    0:getstatic       #21  <Field ICUCompat$ICUCompatImpl IMPL>
    //    1    3:aload_0         
    //    2    4:invokeinterface #34  <Method String ICUCompat$ICUCompatImpl.getScript(String)>
    //    3    9:areturn         
    }

    private static final ICUCompatImpl IMPL;
}
