// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.android.apps.analytics;


public class Transaction
{
    public static class Builder
    {

        public Builder(String s, double d)
        {
        //    0    0:aload_0         
        //    1    1:invokespecial   #16  <Method void Object()>
        //    2    4:aload_0         
        //    3    5:aconst_null     
        //    4    6:putfield        #18  <Field String storeName>
        //    5    9:aload_0         
        //    6   10:dconst_0        
        //    7   11:putfield        #20  <Field double totalTax>
        //    8   14:aload_0         
        //    9   15:dconst_0        
        //   10   16:putfield        #22  <Field double shippingCost>
        //   11   19:aload_1         
        //   12   20:ifnull          33
        //   13   23:aload_1         
        //   14   24:invokevirtual   #28  <Method String String.trim()>
        //   15   27:invokevirtual   #32  <Method int String.length()>
        //   16   30:ifne            43
        //   17   33:new             #34  <Class IllegalArgumentException>
        //   18   36:dup             
        //   19   37:ldc1            #36  <String "orderId must not be empty or null">
        //   20   39:invokespecial   #39  <Method void IllegalArgumentException(String)>
        //   21   42:athrow          
        //   22   43:aload_0         
        //   23   44:aload_1         
        //   24   45:putfield        #41  <Field String orderId>
        //   25   48:aload_0         
        //   26   49:dload_2         
        //   27   50:putfield        #43  <Field double totalCost>
        //   28   53:return          
        }

        static String access$000(Builder builder)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #41  <Field String orderId>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #41  <Field String orderId>
        //    5    4:areturn         
        }

        static double access$100(Builder builder)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #43  <Field double totalCost>
        //    2    4:dreturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #43  <Field double totalCost>
        //    5    4:dreturn         
        }

        static String access$200(Builder builder)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #18  <Field String storeName>
        //    2    4:areturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #18  <Field String storeName>
        //    5    4:areturn         
        }

        static double access$300(Builder builder)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #20  <Field double totalTax>
        //    2    4:dreturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #20  <Field double totalTax>
        //    5    4:dreturn         
        }

        static double access$400(Builder builder)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #22  <Field double shippingCost>
        //    2    4:dreturn         
// Previous instruction length mismatch
        //    3    0:aload_0         
        //    4    1:getfield        #22  <Field double shippingCost>
        //    5    4:dreturn         
        }

        public Transaction build()
        {
        //    0    0:new             #54  <Class Transaction>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:aconst_null     
        //    4    6:invokespecial   #57  <Method void Transaction(Transaction$Builder, Transaction$1)>
        //    5    9:areturn         
        }

        public Builder setShippingCost(double d)
        {
        //    0    0:aload_0         
        //    1    1:dload_1         
        //    2    2:putfield        #22  <Field double shippingCost>
        //    3    5:aload_0         
        //    4    6:areturn         
        }

        public Builder setStoreName(String s)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #18  <Field String storeName>
        //    3    5:aload_0         
        //    4    6:areturn         
        }

        public Builder setTotalTax(double d)
        {
        //    0    0:aload_0         
        //    1    1:dload_1         
        //    2    2:putfield        #20  <Field double totalTax>
        //    3    5:aload_0         
        //    4    6:areturn         
        }

        private final String orderId;
        private double shippingCost;
        private String storeName;
        private final double totalCost;
        private double totalTax;

        static String access$000(Builder builder)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #41  <Field String orderId>
        //    2    4:areturn         
        }

        static double access$100(Builder builder)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #43  <Field double totalCost>
        //    2    4:dreturn         
        }

        static String access$200(Builder builder)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #18  <Field String storeName>
        //    2    4:areturn         
        }

        static double access$300(Builder builder)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #20  <Field double totalTax>
        //    2    4:dreturn         
        }

        static double access$400(Builder builder)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #22  <Field double shippingCost>
        //    2    4:dreturn         
        }
    }


    private Transaction(Builder builder)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #16  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aload_1         
    //    4    6:invokestatic    #22  <Method String Transaction$Builder.access$000(Transaction$Builder)>
    //    5    9:putfield        #24  <Field String orderId>
    //    6   12:aload_0         
    //    7   13:aload_1         
    //    8   14:invokestatic    #28  <Method double Transaction$Builder.access$100(Transaction$Builder)>
    //    9   17:putfield        #30  <Field double totalCost>
    //   10   20:aload_0         
    //   11   21:aload_1         
    //   12   22:invokestatic    #33  <Method String Transaction$Builder.access$200(Transaction$Builder)>
    //   13   25:putfield        #35  <Field String storeName>
    //   14   28:aload_0         
    //   15   29:aload_1         
    //   16   30:invokestatic    #38  <Method double Transaction$Builder.access$300(Transaction$Builder)>
    //   17   33:putfield        #40  <Field double totalTax>
    //   18   36:aload_0         
    //   19   37:aload_1         
    //   20   38:invokestatic    #43  <Method double Transaction$Builder.access$400(Transaction$Builder)>
    //   21   41:putfield        #45  <Field double shippingCost>
    //   22   44:return          
    }

    Transaction(Builder builder, _cls1 _pcls1)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #48  <Method void Transaction(Transaction$Builder)>
    //    3    5:return          
    }

    String getOrderId()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #24  <Field String orderId>
    //    2    4:areturn         
    }

    double getShippingCost()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #45  <Field double shippingCost>
    //    2    4:dreturn         
    }

    String getStoreName()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #35  <Field String storeName>
    //    2    4:areturn         
    }

    double getTotalCost()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #30  <Field double totalCost>
    //    2    4:dreturn         
    }

    double getTotalTax()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #40  <Field double totalTax>
    //    2    4:dreturn         
    }

    private final String orderId;
    private final double shippingCost;
    private final String storeName;
    private final double totalCost;
    private final double totalTax;

    // Unreferenced inner class com/google/android/apps/analytics/Transaction$1

/* anonymous class */
    static class _cls1
    {
    }

}
