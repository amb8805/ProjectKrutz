// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.android.apps.analytics;


public class Item
{
    public static class Builder
    {

        public Builder(String s, String s1, double d, long l)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #18  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:aconst_null     
        //    4    6:putfield        #20  <Field String itemName>
        //    5    9:aload_0         
        //    6   10:aconst_null     
        //    7   11:putfield        #22  <Field String itemCategory>
        //    8   14:aload_1         
        //    9   15:ifnull          28
        //   10   18:aload_1         
        //   11   19:invokevirtual   #28  <Method String String.trim()>
        //   12   22:invokevirtual   #32  <Method int String.length()>
        //   13   25:ifne            38
        //   14   28:new             #34  <Class IllegalArgumentException>
        //   15   31:dup             
        //   16   32:ldc1            #36  <String "orderId must not be empty or null">
        //   17   34:invokespecial   #39  <Method void IllegalArgumentException(String)>
        //   18   37:athrow          
        //   19   38:aload_2         
        //   20   39:ifnull          52
        //   21   42:aload_2         
        //   22   43:invokevirtual   #28  <Method String String.trim()>
        //   23   46:invokevirtual   #32  <Method int String.length()>
        //   24   49:ifne            62
        //   25   52:new             #34  <Class IllegalArgumentException>
        //   26   55:dup             
        //   27   56:ldc1            #41  <String "itemSKU must not be empty or null">
        //   28   58:invokespecial   #39  <Method void IllegalArgumentException(String)>
        //   29   61:athrow          
        //   30   62:aload_0         
        //   31   63:aload_1         
        //   32   64:putfield        #43  <Field String orderId>
        //   33   67:aload_0         
        //   34   68:aload_2         
        //   35   69:putfield        #45  <Field String itemSKU>
        //   36   72:aload_0         
        //   37   73:dload_3         
        //   38   74:putfield        #47  <Field double itemPrice>
        //   39   77:aload_0         
        //   40   78:lload           5
        //   41   80:putfield        #49  <Field long itemCount>
        //   42   83:return          
        }

        static String access$000(Builder builder)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #43  <Field String orderId>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #43  <Field String orderId>
        //    5    4:areturn         
        }

        static String access$100(Builder builder)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #45  <Field String itemSKU>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #45  <Field String itemSKU>
        //    5    4:areturn         
        }

        static double access$200(Builder builder)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #47  <Field double itemPrice>
        //    2    4:dreturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #47  <Field double itemPrice>
        //    5    4:dreturn         
        }

        static long access$300(Builder builder)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #49  <Field long itemCount>
        //    2    4:lreturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #49  <Field long itemCount>
        //    5    4:lreturn         
        }

        static String access$400(Builder builder)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #20  <Field String itemName>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #20  <Field String itemName>
        //    5    4:areturn         
        }

        static String access$500(Builder builder)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #22  <Field String itemCategory>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #22  <Field String itemCategory>
        //    5    4:areturn         
        }

        public Item build()
        {
        //    0    0:new             #62  <Class Item>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:aconst_null     
        //    4    6:invokespecial   #65  <Method void Item(Item$Builder, Item$1)>
        //    5    9:areturn         
        }

        public Builder setItemCategory(String s)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #22  <Field String itemCategory>
        //    3    5:aload_0         
        //    4    6:areturn         
        }

        public Builder setItemName(String s)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #20  <Field String itemName>
        //    3    5:aload_0         
        //    4    6:areturn         
        }

        private String itemCategory;
        private final long itemCount;
        private String itemName;
        private final double itemPrice;
        private final String itemSKU;
        private final String orderId;

        static String access$000(Builder builder)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #43  <Field String orderId>
        //    2    4:areturn         
        }

        static String access$100(Builder builder)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #45  <Field String itemSKU>
        //    2    4:areturn         
        }

        static double access$200(Builder builder)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #47  <Field double itemPrice>
        //    2    4:dreturn         
        }

        static long access$300(Builder builder)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #49  <Field long itemCount>
        //    2    4:lreturn         
        }

        static String access$400(Builder builder)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #20  <Field String itemName>
        //    2    4:areturn         
        }

        static String access$500(Builder builder)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #22  <Field String itemCategory>
        //    2    4:areturn         
        }
    }


    private Item(Builder builder)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #18  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:invokestatic    #24  <Method String Item$Builder.access$000(Item$Builder)>
    //    5    9:putfield        #26  <Field String orderId>
    //    6   12:aload_0         
    //    7   13:aload_1         
    //    8   14:invokestatic    #29  <Method String Item$Builder.access$100(Item$Builder)>
    //    9   17:putfield        #31  <Field String itemSKU>
    //   10   20:aload_0         
    //   11   21:aload_1         
    //   12   22:invokestatic    #35  <Method double Item$Builder.access$200(Item$Builder)>
    //   13   25:putfield        #37  <Field double itemPrice>
    //   14   28:aload_0         
    //   15   29:aload_1         
    //   16   30:invokestatic    #41  <Method long Item$Builder.access$300(Item$Builder)>
    //   17   33:putfield        #43  <Field long itemCount>
    //   18   36:aload_0         
    //   19   37:aload_1         
    //   20   38:invokestatic    #46  <Method String Item$Builder.access$400(Item$Builder)>
    //   21   41:putfield        #48  <Field String itemName>
    //   22   44:aload_0         
    //   23   45:aload_1         
    //   24   46:invokestatic    #51  <Method String Item$Builder.access$500(Item$Builder)>
    //   25   49:putfield        #53  <Field String itemCategory>
    //   26   52:return          
    }

    Item(Builder builder, _cls1 _pcls1)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #56  <Method void Item(Item$Builder)>
    //    3    5:return          
    }

    String getItemCategory()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #53  <Field String itemCategory>
    //    2    4:areturn         
    }

    long getItemCount()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #43  <Field long itemCount>
    //    2    4:lreturn         
    }

    String getItemName()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #48  <Field String itemName>
    //    2    4:areturn         
    }

    double getItemPrice()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #37  <Field double itemPrice>
    //    2    4:dreturn         
    }

    String getItemSKU()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #31  <Field String itemSKU>
    //    2    4:areturn         
    }

    String getOrderId()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #26  <Field String orderId>
    //    2    4:areturn         
    }

    private final String itemCategory;
    private final long itemCount;
    private final String itemName;
    private final double itemPrice;
    private final String itemSKU;
    private final String orderId;

    // Unreferenced inner class com/google/android/apps/analytics/Item$1

/* anonymous class */
    static class _cls1
    {
    }

}
