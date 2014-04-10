// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.google.android.apps.analytics;


// Referenced classes of package com.google.android.apps.analytics:
//            CustomVariableBuffer, Item, Transaction

class Event
{

    Event(long l, String s, int i, int j, int k, int i1, 
            int j1, String s1, String s2, String s3, int k1, int l1, int i2)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #48  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:lload_1         
    //    4    6:putfield        #50  <Field long eventId>
    //    5    9:aload_0         
    //    6   10:aload_3         
    //    7   11:putfield        #52  <Field String accountId>
    //    8   14:aload_0         
    //    9   15:iload           4
    //   10   17:putfield        #54  <Field int randomVal>
    //   11   20:aload_0         
    //   12   21:iload           5
    //   13   23:putfield        #56  <Field int timestampFirst>
    //   14   26:aload_0         
    //   15   27:iload           6
    //   16   29:putfield        #58  <Field int timestampPrevious>
    //   17   32:aload_0         
    //   18   33:iload           7
    //   19   35:putfield        #60  <Field int timestampCurrent>
    //   20   38:aload_0         
    //   21   39:iload           8
    //   22   41:putfield        #62  <Field int visits>
    //   23   44:aload_0         
    //   24   45:aload           9
    //   25   47:putfield        #64  <Field String category>
    //   26   50:aload_0         
    //   27   51:aload           10
    //   28   53:putfield        #66  <Field String action>
    //   29   56:aload_0         
    //   30   57:aload           11
    //   31   59:putfield        #68  <Field String label>
    //   32   62:aload_0         
    //   33   63:iload           12
    //   34   65:putfield        #70  <Field int value>
    //   35   68:aload_0         
    //   36   69:iload           14
    //   37   71:putfield        #72  <Field int screenHeight>
    //   38   74:aload_0         
    //   39   75:iload           13
    //   40   77:putfield        #74  <Field int screenWidth>
    //   41   80:aload_0         
    //   42   81:iconst_m1       
    //   43   82:putfield        #76  <Field int userId>
    //   44   85:aload_0         
    //   45   86:iconst_0        
    //   46   87:putfield        #78  <Field boolean useServerTime>
    //   47   90:return          
    }

    Event(Event event, String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:getfield        #50  <Field long eventId>
    //    3    5:aload_2         
    //    4    6:aload_1         
    //    5    7:getfield        #54  <Field int randomVal>
    //    6   10:aload_1         
    //    7   11:getfield        #56  <Field int timestampFirst>
    //    8   14:aload_1         
    //    9   15:getfield        #58  <Field int timestampPrevious>
    //   10   18:aload_1         
    //   11   19:getfield        #60  <Field int timestampCurrent>
    //   12   22:aload_1         
    //   13   23:getfield        #62  <Field int visits>
    //   14   26:aload_1         
    //   15   27:getfield        #64  <Field String category>
    //   16   30:aload_1         
    //   17   31:getfield        #66  <Field String action>
    //   18   34:aload_1         
    //   19   35:getfield        #68  <Field String label>
    //   20   38:aload_1         
    //   21   39:getfield        #70  <Field int value>
    //   22   42:aload_1         
    //   23   43:getfield        #74  <Field int screenWidth>
    //   24   46:aload_1         
    //   25   47:getfield        #72  <Field int screenHeight>
    //   26   50:invokespecial   #81  <Method void Event(long, String, int, int, int, int, int, String, String, String, int, int, int)>
    //   27   53:aload_0         
    //   28   54:aload_1         
    //   29   55:getfield        #83  <Field int adHitId>
    //   30   58:putfield        #83  <Field int adHitId>
    //   31   61:aload_0         
    //   32   62:aload_1         
    //   33   63:getfield        #76  <Field int userId>
    //   34   66:putfield        #76  <Field int userId>
    //   35   69:aload_0         
    //   36   70:aload_1         
    //   37   71:getfield        #85  <Field boolean anonymizeIp>
    //   38   74:putfield        #85  <Field boolean anonymizeIp>
    //   39   77:aload_0         
    //   40   78:aload_1         
    //   41   79:getfield        #78  <Field boolean useServerTime>
    //   42   82:putfield        #78  <Field boolean useServerTime>
    //   43   85:aload_0         
    //   44   86:aload_1         
    //   45   87:getfield        #87  <Field CustomVariableBuffer customVariableBuffer>
    //   46   90:putfield        #87  <Field CustomVariableBuffer customVariableBuffer>
    //   47   93:aload_0         
    //   48   94:aload_1         
    //   49   95:getfield        #89  <Field Transaction transaction>
    //   50   98:putfield        #89  <Field Transaction transaction>
    //   51  101:aload_0         
    //   52  102:aload_1         
    //   53  103:getfield        #91  <Field Item item>
    //   54  106:putfield        #91  <Field Item item>
    //   55  109:return          
    }

    Event(String s, String s1, String s2, String s3, int i, int j, int k)
    {
    //    0    0:aload_0         
    //    1    1:ldc2w           #93  <Long -1L>
    //    2    4:aload_1         
    //    3    5:iconst_m1       
    //    4    6:iconst_m1       
    //    5    7:iconst_m1       
    //    6    8:iconst_m1       
    //    7    9:iconst_m1       
    //    8   10:aload_2         
    //    9   11:aload_3         
    //   10   12:aload           4
    //   11   14:iload           5
    //   12   16:iload           6
    //   13   18:iload           7
    //   14   20:invokespecial   #81  <Method void Event(long, String, int, int, int, int, int, String, String, String, int, int, int)>
    //   15   23:return          
    }

    int getAdHitId()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #83  <Field int adHitId>
    //    2    4:ireturn         
    }

    boolean getAnonymizeIp()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #85  <Field boolean anonymizeIp>
    //    2    4:ireturn         
    }

    public CustomVariableBuffer getCustomVariableBuffer()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #87  <Field CustomVariableBuffer customVariableBuffer>
    //    2    4:areturn         
    }

    public Item getItem()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #91  <Field Item item>
    //    2    4:areturn         
    }

    int getRandomVal()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #54  <Field int randomVal>
    //    2    4:ireturn         
    }

    int getTimestampCurrent()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #60  <Field int timestampCurrent>
    //    2    4:ireturn         
    }

    int getTimestampFirst()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #56  <Field int timestampFirst>
    //    2    4:ireturn         
    }

    int getTimestampPrevious()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #58  <Field int timestampPrevious>
    //    2    4:ireturn         
    }

    public Transaction getTransaction()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #89  <Field Transaction transaction>
    //    2    4:areturn         
    }

    boolean getUseServerTime()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #78  <Field boolean useServerTime>
    //    2    4:ireturn         
    }

    int getUserId()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #76  <Field int userId>
    //    2    4:ireturn         
    }

    int getVisits()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #62  <Field int visits>
    //    2    4:ireturn         
    }

    public boolean isSessionInitialized()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #56  <Field int timestampFirst>
    //    2    4:iconst_m1       
    //    3    5:icmpeq          10
    //    4    8:iconst_1        
    //    5    9:ireturn         
    //    6   10:iconst_0        
    //    7   11:ireturn         
    }

    void setAdHitId(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #83  <Field int adHitId>
    //    3    5:return          
    }

    void setAnonymizeIp(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #85  <Field boolean anonymizeIp>
    //    3    5:return          
    }

    public void setCustomVariableBuffer(CustomVariableBuffer customvariablebuffer)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #87  <Field CustomVariableBuffer customVariableBuffer>
    //    3    5:return          
    }

    public void setItem(Item item1)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #64  <Field String category>
    //    2    4:ldc1            #11  <String "__##GOOGLEITEM##__">
    //    3    6:invokevirtual   #126 <Method boolean String.equals(Object)>
    //    4    9:ifne            42
    //    5   12:new             #128 <Class IllegalStateException>
    //    6   15:dup             
    //    7   16:new             #130 <Class StringBuilder>
    //    8   19:dup             
    //    9   20:invokespecial   #131 <Method void StringBuilder()>
    //   10   23:ldc1            #133 <String "Attempted to add an item to an event of type ">
    //   11   25:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
    //   12   28:aload_0         
    //   13   29:getfield        #64  <Field String category>
    //   14   32:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
    //   15   35:invokevirtual   #141 <Method String StringBuilder.toString()>
    //   16   38:invokespecial   #144 <Method void IllegalStateException(String)>
    //   17   41:athrow          
    //   18   42:aload_0         
    //   19   43:aload_1         
    //   20   44:putfield        #91  <Field Item item>
    //   21   47:return          
    }

    void setRandomVal(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #54  <Field int randomVal>
    //    3    5:return          
    }

    void setTimestampCurrent(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #60  <Field int timestampCurrent>
    //    3    5:return          
    }

    void setTimestampFirst(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #56  <Field int timestampFirst>
    //    3    5:return          
    }

    void setTimestampPrevious(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #58  <Field int timestampPrevious>
    //    3    5:return          
    }

    public void setTransaction(Transaction transaction1)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #64  <Field String category>
    //    2    4:ldc1            #17  <String "__##GOOGLETRANSACTION##__">
    //    3    6:invokevirtual   #126 <Method boolean String.equals(Object)>
    //    4    9:ifne            42
    //    5   12:new             #128 <Class IllegalStateException>
    //    6   15:dup             
    //    7   16:new             #130 <Class StringBuilder>
    //    8   19:dup             
    //    9   20:invokespecial   #131 <Method void StringBuilder()>
    //   10   23:ldc1            #152 <String "Attempted to add a transction to an event of type ">
    //   11   25:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
    //   12   28:aload_0         
    //   13   29:getfield        #64  <Field String category>
    //   14   32:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
    //   15   35:invokevirtual   #141 <Method String StringBuilder.toString()>
    //   16   38:invokespecial   #144 <Method void IllegalStateException(String)>
    //   17   41:athrow          
    //   18   42:aload_0         
    //   19   43:aload_1         
    //   20   44:putfield        #89  <Field Transaction transaction>
    //   21   47:return          
    }

    void setUseServerTime(boolean flag)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #78  <Field boolean useServerTime>
    //    3    5:return          
    }

    void setUserId(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #76  <Field int userId>
    //    3    5:return          
    }

    void setVisits(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:putfield        #62  <Field int visits>
    //    3    5:return          
    }

    public String toString()
    {
    //    0    0:new             #130 <Class StringBuilder>
    //    1    3:dup             
    //    2    4:invokespecial   #131 <Method void StringBuilder()>
    //    3    7:ldc1            #157 <String "id:">
    //    4    9:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
    //    5   12:aload_0         
    //    6   13:getfield        #50  <Field long eventId>
    //    7   16:invokevirtual   #160 <Method StringBuilder StringBuilder.append(long)>
    //    8   19:ldc1            #162 <String " ">
    //    9   21:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
    //   10   24:ldc1            #164 <String "random:">
    //   11   26:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
    //   12   29:aload_0         
    //   13   30:getfield        #54  <Field int randomVal>
    //   14   33:invokevirtual   #167 <Method StringBuilder StringBuilder.append(int)>
    //   15   36:ldc1            #162 <String " ">
    //   16   38:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
    //   17   41:ldc1            #169 <String "timestampCurrent:">
    //   18   43:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
    //   19   46:aload_0         
    //   20   47:getfield        #60  <Field int timestampCurrent>
    //   21   50:invokevirtual   #167 <Method StringBuilder StringBuilder.append(int)>
    //   22   53:ldc1            #162 <String " ">
    //   23   55:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
    //   24   58:ldc1            #171 <String "timestampPrevious:">
    //   25   60:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
    //   26   63:aload_0         
    //   27   64:getfield        #58  <Field int timestampPrevious>
    //   28   67:invokevirtual   #167 <Method StringBuilder StringBuilder.append(int)>
    //   29   70:ldc1            #162 <String " ">
    //   30   72:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
    //   31   75:ldc1            #173 <String "timestampFirst:">
    //   32   77:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
    //   33   80:aload_0         
    //   34   81:getfield        #56  <Field int timestampFirst>
    //   35   84:invokevirtual   #167 <Method StringBuilder StringBuilder.append(int)>
    //   36   87:ldc1            #162 <String " ">
    //   37   89:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
    //   38   92:ldc1            #175 <String "visits:">
    //   39   94:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
    //   40   97:aload_0         
    //   41   98:getfield        #62  <Field int visits>
    //   42  101:invokevirtual   #167 <Method StringBuilder StringBuilder.append(int)>
    //   43  104:ldc1            #162 <String " ">
    //   44  106:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
    //   45  109:ldc1            #177 <String "value:">
    //   46  111:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
    //   47  114:aload_0         
    //   48  115:getfield        #70  <Field int value>
    //   49  118:invokevirtual   #167 <Method StringBuilder StringBuilder.append(int)>
    //   50  121:ldc1            #162 <String " ">
    //   51  123:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
    //   52  126:ldc1            #179 <String "category:">
    //   53  128:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
    //   54  131:aload_0         
    //   55  132:getfield        #64  <Field String category>
    //   56  135:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
    //   57  138:ldc1            #162 <String " ">
    //   58  140:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
    //   59  143:ldc1            #181 <String "action:">
    //   60  145:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
    //   61  148:aload_0         
    //   62  149:getfield        #66  <Field String action>
    //   63  152:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
    //   64  155:ldc1            #162 <String " ">
    //   65  157:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
    //   66  160:ldc1            #183 <String "label:">
    //   67  162:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
    //   68  165:aload_0         
    //   69  166:getfield        #68  <Field String label>
    //   70  169:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
    //   71  172:ldc1            #162 <String " ">
    //   72  174:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
    //   73  177:ldc1            #185 <String "width:">
    //   74  179:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
    //   75  182:aload_0         
    //   76  183:getfield        #74  <Field int screenWidth>
    //   77  186:invokevirtual   #167 <Method StringBuilder StringBuilder.append(int)>
    //   78  189:ldc1            #162 <String " ">
    //   79  191:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
    //   80  194:ldc1            #187 <String "height:">
    //   81  196:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
    //   82  199:aload_0         
    //   83  200:getfield        #72  <Field int screenHeight>
    //   84  203:invokevirtual   #167 <Method StringBuilder StringBuilder.append(int)>
    //   85  206:invokevirtual   #141 <Method String StringBuilder.toString()>
    //   86  209:areturn         
    }

    static final String INSTALL_EVENT_CATEGORY = "__##GOOGLEINSTALL##__";
    static final String ITEM_CATEGORY = "__##GOOGLEITEM##__";
    static final String PAGEVIEW_EVENT_CATEGORY = "__##GOOGLEPAGEVIEW##__";
    static final String TRANSACTION_CATEGORY = "__##GOOGLETRANSACTION##__";
    final String accountId;
    final String action;
    private int adHitId;
    private boolean anonymizeIp;
    final String category;
    CustomVariableBuffer customVariableBuffer;
    final long eventId;
    private Item item;
    final String label;
    private int randomVal;
    final int screenHeight;
    final int screenWidth;
    private int timestampCurrent;
    private int timestampFirst;
    private int timestampPrevious;
    private Transaction transaction;
    private boolean useServerTime;
    private int userId;
    final int value;
    private int visits;
}
