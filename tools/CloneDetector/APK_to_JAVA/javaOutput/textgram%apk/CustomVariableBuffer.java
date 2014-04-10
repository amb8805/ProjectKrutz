// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.android.apps.analytics;


// Referenced classes of package com.google.android.apps.analytics:
//            CustomVariable

class CustomVariableBuffer
{

    public CustomVariableBuffer()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #10  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:iconst_5        
    //    4    6:anewarray       CustomVariable[]
    //    5    9:putfield        #14  <Field CustomVariable[] customVariables>
    //    6   12:return          
    }

    private void throwOnInvalidIndex(int i)
    {
    //    0    0:iload_1         
    //    1    1:iconst_1        
    //    2    2:icmplt          10
    //    3    5:iload_1         
    //    4    6:iconst_5        
    //    5    7:icmple          20
    //    6   10:new             #18  <Class IllegalArgumentException>
    //    7   13:dup             
    //    8   14:ldc1            #20  <String "Index must be between 1 and 5 inclusive.">
    //    9   16:invokespecial   #23  <Method void IllegalArgumentException(String)>
    //   10   19:athrow          
    //   11   20:return          
    }

    public void clearCustomVariableAt(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #26  <Method void throwOnInvalidIndex(int)>
    //    3    5:aload_0         
    //    4    6:getfield        #14  <Field CustomVariable[] customVariables>
    //    5    9:iload_1         
    //    6   10:iconst_1        
    //    7   11:isub            
    //    8   12:aconst_null     
    //    9   13:aastore         
    //   10   14:return          
    }

    public CustomVariable[] getCustomVariableArray()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #14  <Field CustomVariable[] customVariables>
    //    2    4:invokevirtual   #33  <Method Object _5B_Lcom.google.android.apps.analytics.CustomVariable_3B_.clone()>
    //    3    7:checkcast       #29  <Class CustomVariable[]>
    //    4   10:areturn         
    }

    public CustomVariable getCustomVariableAt(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #26  <Method void throwOnInvalidIndex(int)>
    //    3    5:aload_0         
    //    4    6:getfield        #14  <Field CustomVariable[] customVariables>
    //    5    9:iload_1         
    //    6   10:iconst_1        
    //    7   11:isub            
    //    8   12:aaload          
    //    9   13:areturn         
    }

    public boolean hasCustomVariables()
    {
    //    0    0:iconst_0        
    //    1    1:istore_1        
    //    2    2:aload_0         
    //    3    3:getfield        #14  <Field CustomVariable[] customVariables>
    //    4    6:arraylength     
    //    5    7:istore_2        
    //    6    8:iconst_0        
    //    7    9:istore_3        
    //    8   10:iload_1         
    //    9   11:iload_2         
    //   10   12:icmpge          26
    //   11   15:aload_0         
    //   12   16:getfield        #14  <Field CustomVariable[] customVariables>
    //   13   19:iload_1         
    //   14   20:aaload          
    //   15   21:ifnull          28
    //   16   24:iconst_1        
    //   17   25:istore_3        
    //   18   26:iload_3         
    //   19   27:ireturn         
    //   20   28:iinc            1  1
    //   21   31:goto            2
    }

    public boolean isIndexAvailable(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #26  <Method void throwOnInvalidIndex(int)>
    //    3    5:aload_0         
    //    4    6:getfield        #14  <Field CustomVariable[] customVariables>
    //    5    9:iload_1         
    //    6   10:iconst_1        
    //    7   11:isub            
    //    8   12:aaload          
    //    9   13:ifnonnull       18
    //   10   16:iconst_1        
    //   11   17:ireturn         
    //   12   18:iconst_0        
    //   13   19:ireturn         
    }

    public void setCustomVariable(CustomVariable customvariable)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokevirtual   #45  <Method int CustomVariable.getIndex()>
    //    3    5:invokespecial   #26  <Method void throwOnInvalidIndex(int)>
    //    4    8:aload_0         
    //    5    9:getfield        #14  <Field CustomVariable[] customVariables>
    //    6   12:iconst_m1       
    //    7   13:aload_1         
    //    8   14:invokevirtual   #45  <Method int CustomVariable.getIndex()>
    //    9   17:iadd            
    //   10   18:aload_1         
    //   11   19:aastore         
    //   12   20:return          
    }

    private CustomVariable customVariables[];
}
