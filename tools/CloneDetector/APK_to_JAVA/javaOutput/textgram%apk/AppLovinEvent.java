// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.impl.sdk;

import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

public class AppLovinEvent
{

    public AppLovinEvent(String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:new             #22  <Class HashMap>
    //    3    5:dup             
    //    4    6:invokespecial   #25  <Method void HashMap()>
    //    5    9:invokespecial   #28  <Method void AppLovinEvent(String, Map)>
    //    6   12:return          
    }

    private AppLovinEvent(String s, long l)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:lload_2         
    //    3    3:invokestatic    #35  <Method UUID UUID.randomUUID()>
    //    4    6:invokevirtual   #39  <Method String UUID.toString()>
    //    5    9:new             #22  <Class HashMap>
    //    6   12:dup             
    //    7   13:invokespecial   #25  <Method void HashMap()>
    //    8   16:invokespecial   #42  <Method void AppLovinEvent(String, long, String, Map)>
    //    9   19:return          
    }

    private AppLovinEvent(String s, long l, String s1, String s2, Map map)
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #44  <Method void Object()>
    //    2    4:aload_0         
    //    3    5:aload           4
    //    4    7:putfield        #46  <Field String a>
    //    5   10:aload_0         
    //    6   11:aload           5
    //    7   13:putfield        #48  <Field String b>
    //    8   16:aload_0         
    //    9   17:lload_2         
    //   10   18:putfield        #50  <Field long c>
    //   11   21:aload_0         
    //   12   22:aload_1         
    //   13   23:putfield        #52  <Field String d>
    //   14   26:aload_0         
    //   15   27:aload           6
    //   16   29:putfield        #54  <Field Map e>
    //   17   32:return          
    }

    private AppLovinEvent(String s, long l, String s1, Map map)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:lload_2         
    //    3    3:aload           4
    //    4    5:ldc1            #56  <String "NO_LINK_ID_SET">
    //    5    7:aload           5
    //    6    9:invokespecial   #58  <Method void AppLovinEvent(String, long, String, String, Map)>
    //    7   12:return          
    }

    public AppLovinEvent(String s, Map map)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokestatic    #64  <Method long System.currentTimeMillis()>
    //    3    5:invokestatic    #35  <Method UUID UUID.randomUUID()>
    //    4    8:invokevirtual   #39  <Method String UUID.toString()>
    //    5   11:aload_2         
    //    6   12:invokespecial   #42  <Method void AppLovinEvent(String, long, String, Map)>
    //    7   15:return          
    }

    static AppLovinEvent a(String s, double d1, String s1)
    {
    //    0    0:new             #2   <Class AppLovinEvent>
    //    1    3:dup             
    //    2    4:ldc1            #67  <String "revenue">
    //    3    6:invokespecial   #69  <Method void AppLovinEvent(String)>
    //    4    9:astore          4
    //    5   11:aload           4
    //    6   13:ldc1            #71  <String "name">
    //    7   15:aload_0         
    //    8   16:invokevirtual   #75  <Method void setField(String, String)>
    //    9   19:aload           4
    //   10   21:ldc1            #67  <String "revenue">
    //   11   23:dload_1         
    //   12   24:invokestatic    #80  <Method String Double.toString(double)>
    //   13   27:invokevirtual   #75  <Method void setField(String, String)>
    //   14   30:aload           4
    //   15   32:ldc1            #82  <String "currency">
    //   16   34:aload_3         
    //   17   35:invokevirtual   #75  <Method void setField(String, String)>
    //   18   38:aload           4
    //   19   40:areturn         
    }

    static AppLovinEvent a(String s, long l)
    {
    //    0    0:new             #2   <Class AppLovinEvent>
    //    1    3:dup             
    //    2    4:ldc1            #85  <String "session_tracking">
    //    3    6:lload_1         
    //    4    7:invokespecial   #87  <Method void AppLovinEvent(String, long)>
    //    5   10:astore_3        
    //    6   11:aload_3         
    //    7   12:ldc1            #89  <String "action">
    //    8   14:aload_0         
    //    9   15:invokevirtual   #75  <Method void setField(String, String)>
    //   10   18:aload_3         
    //   11   19:areturn         
    }

    static AppLovinEvent a(String s, String s1, String s2, Throwable throwable)
    {
    //    0    0:new             #2   <Class AppLovinEvent>
    //    1    3:dup             
    //    2    4:ldc1            #92  <String "error">
    //    3    6:invokespecial   #69  <Method void AppLovinEvent(String)>
    //    4    9:astore          4
    //    5   11:aload_3         
    //    6   12:ifnull          42
    //    7   15:new             #94  <Class StringBuilder>
    //    8   18:dup             
    //    9   19:invokespecial   #95  <Method void StringBuilder()>
    //   10   22:aload_0         
    //   11   23:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
    //   12   26:ldc1            #101 <String ": ">
    //   13   28:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
    //   14   31:aload_3         
    //   15   32:invokevirtual   #106 <Method String Throwable.getMessage()>
    //   16   35:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
    //   17   38:invokevirtual   #107 <Method String StringBuilder.toString()>
    //   18   41:astore_0        
    //   19   42:aload           4
    //   20   44:ldc1            #109 <String "code">
    //   21   46:aload_2         
    //   22   47:invokevirtual   #75  <Method void setField(String, String)>
    //   23   50:aload           4
    //   24   52:ldc1            #111 <String "message">
    //   25   54:aload_1         
    //   26   55:invokevirtual   #75  <Method void setField(String, String)>
    //   27   58:aload           4
    //   28   60:ldc1            #113 <String "exception">
    //   29   62:aload_0         
    //   30   63:invokevirtual   #75  <Method void setField(String, String)>
    //   31   66:aload           4
    //   32   68:areturn         
    }

    static AppLovinEvent a(String s, String s1, Throwable throwable)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:ldc1            #116 <String "ReportedError">
    //    3    4:aload_2         
    //    4    5:invokestatic    #118 <Method AppLovinEvent a(String, String, String, Throwable)>
    //    5    8:areturn         
    }

    static AppLovinEvent a(JSONObject jsonobject)
    {
    //    0    0:new             #22  <Class HashMap>
    //    1    3:dup             
    //    2    4:invokespecial   #25  <Method void HashMap()>
    //    3    7:astore_1        
    //    4    8:aload_0         
    //    5    9:ldc1            #121 <String "values">
    //    6   11:invokevirtual   #127 <Method JSONObject JSONObject.optJSONObject(String)>
    //    7   14:astore_2        
    //    8   15:aload_2         
    //    9   16:ifnull          60
    //   10   19:aload_2         
    //   11   20:invokevirtual   #131 <Method Iterator JSONObject.keys()>
    //   12   23:astore_3        
    //   13   24:aload_3         
    //   14   25:invokeinterface #137 <Method boolean Iterator.hasNext()>
    //   15   30:ifeq            60
    //   16   33:aload_3         
    //   17   34:invokeinterface #141 <Method Object Iterator.next()>
    //   18   39:invokevirtual   #142 <Method String Object.toString()>
    //   19   42:astore          4
    //   20   44:aload_1         
    //   21   45:aload           4
    //   22   47:aload_2         
    //   23   48:aload           4
    //   24   50:invokevirtual   #146 <Method String JSONObject.getString(String)>
    //   25   53:invokevirtual   #150 <Method Object HashMap.put(Object, Object)>
    //   26   56:pop             
    //   27   57:goto            24
    //   28   60:new             #2   <Class AppLovinEvent>
    //   29   63:dup             
    //   30   64:aload_0         
    //   31   65:ldc1            #152 <String "type">
    //   32   67:invokevirtual   #146 <Method String JSONObject.getString(String)>
    //   33   70:aload_0         
    //   34   71:ldc1            #154 <String "ts">
    //   35   73:invokevirtual   #158 <Method long JSONObject.getLong(String)>
    //   36   76:aload_0         
    //   37   77:ldc1            #160 <String "id">
    //   38   79:invokevirtual   #146 <Method String JSONObject.getString(String)>
    //   39   82:aload_0         
    //   40   83:ldc1            #162 <String "sid">
    //   41   85:invokevirtual   #146 <Method String JSONObject.getString(String)>
    //   42   88:aload_1         
    //   43   89:invokespecial   #58  <Method void AppLovinEvent(String, long, String, String, Map)>
    //   44   92:areturn         
    }

    static AppLovinEvent b(String s, String s1, Throwable throwable)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:ldc1            #164 <String "UserError">
    //    3    4:aload_2         
    //    4    5:invokestatic    #118 <Method AppLovinEvent a(String, String, String, Throwable)>
    //    5    8:areturn         
    }

    public boolean equals(Object obj)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:if_acmpne       7
    //    3    5:iconst_1        
    //    4    6:ireturn         
    //    5    7:aload_1         
    //    6    8:instanceof      #2   <Class AppLovinEvent>
    //    7   11:ifne            16
    //    8   14:iconst_0        
    //    9   15:ireturn         
    //   10   16:aload_1         
    //   11   17:checkcast       #2   <Class AppLovinEvent>
    //   12   20:astore_2        
    //   13   21:aload_0         
    //   14   22:getfield        #46  <Field String a>
    //   15   25:aload_2         
    //   16   26:getfield        #46  <Field String a>
    //   17   29:invokevirtual   #170 <Method boolean String.equals(Object)>
    //   18   32:ifne            5
    //   19   35:iconst_0        
    //   20   36:ireturn         
    }

    public String getEventID()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #46  <Field String a>
    //    2    4:areturn         
    }

    public int hashCode()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #46  <Field String a>
    //    2    4:invokevirtual   #175 <Method int String.hashCode()>
    //    3    7:ireturn         
    }

    public void setField(String s, String s1)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #54  <Field Map e>
    //    2    4:aload_1         
    //    3    5:aload_2         
    //    4    6:invokeinterface #178 <Method Object Map.put(Object, Object)>
    //    5   11:pop             
    //    6   12:return          
    }

    protected void setSessionLinkIdentifier(String s)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:putfield        #48  <Field String b>
    //    3    5:return          
    }

    public JSONObject toJson()
    {
    //    0    0:new             #123 <Class JSONObject>
    //    1    3:dup             
    //    2    4:invokespecial   #182 <Method void JSONObject()>
    //    3    7:astore_1        
    //    4    8:aload_1         
    //    5    9:ldc1            #160 <String "id">
    //    6   11:aload_0         
    //    7   12:getfield        #46  <Field String a>
    //    8   15:invokevirtual   #185 <Method JSONObject JSONObject.put(String, Object)>
    //    9   18:pop             
    //   10   19:aload_1         
    //   11   20:ldc1            #162 <String "sid">
    //   12   22:aload_0         
    //   13   23:getfield        #48  <Field String b>
    //   14   26:invokevirtual   #185 <Method JSONObject JSONObject.put(String, Object)>
    //   15   29:pop             
    //   16   30:aload_1         
    //   17   31:ldc1            #154 <String "ts">
    //   18   33:aload_0         
    //   19   34:getfield        #50  <Field long c>
    //   20   37:invokevirtual   #188 <Method JSONObject JSONObject.put(String, long)>
    //   21   40:pop             
    //   22   41:aload_1         
    //   23   42:ldc1            #152 <String "type">
    //   24   44:aload_0         
    //   25   45:getfield        #52  <Field String d>
    //   26   48:invokevirtual   #185 <Method JSONObject JSONObject.put(String, Object)>
    //   27   51:pop             
    //   28   52:new             #123 <Class JSONObject>
    //   29   55:dup             
    //   30   56:invokespecial   #182 <Method void JSONObject()>
    //   31   59:astore          6
    //   32   61:aload_0         
    //   33   62:getfield        #54  <Field Map e>
    //   34   65:invokeinterface #192 <Method Set Map.keySet()>
    //   35   70:invokeinterface #197 <Method Iterator Set.iterator()>
    //   36   75:astore          7
    //   37   77:aload           7
    //   38   79:invokeinterface #137 <Method boolean Iterator.hasNext()>
    //   39   84:ifeq            121
    //   40   87:aload           7
    //   41   89:invokeinterface #141 <Method Object Iterator.next()>
    //   42   94:checkcast       #168 <Class String>
    //   43   97:astore          9
    //   44   99:aload           6
    //   45  101:aload           9
    //   46  103:aload_0         
    //   47  104:getfield        #54  <Field Map e>
    //   48  107:aload           9
    //   49  109:invokeinterface #201 <Method Object Map.get(Object)>
    //   50  114:invokevirtual   #185 <Method JSONObject JSONObject.put(String, Object)>
    //   51  117:pop             
    //   52  118:goto            77
    //   53  121:aload_1         
    //   54  122:ldc1            #121 <String "values">
    //   55  124:aload           6
    //   56  126:invokevirtual   #185 <Method JSONObject JSONObject.put(String, Object)>
    //   57  129:pop             
    //   58  130:aload_1         
    //   59  131:areturn         
    }

    public String toString()
    {
    // try 0 23 handler(s) 25
    //    0    0:new             #94  <Class StringBuilder>
    //    1    3:dup             
    //    2    4:invokespecial   #95  <Method void StringBuilder()>
    //    3    7:ldc1            #205 <String "ALEvent: ">
    //    4    9:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
    //    5   12:aload_0         
    //    6   13:invokevirtual   #207 <Method JSONObject toJson()>
    //    7   16:invokevirtual   #210 <Method StringBuilder StringBuilder.append(Object)>
    //    8   19:invokevirtual   #107 <Method String StringBuilder.toString()>
    //    9   22:astore_2        
    //   10   23:aload_2         
    //   11   24:areturn         
    // catch JSONException
    //   12   25:astore_1        
    //   13   26:ldc1            #212 <String "ALEvent: Corrupted JSON">
    //   14   28:areturn         
    }

    public void truncateValues(int i)
    {
    //    0    0:aload_0         
    //    1    1:getfield        #54  <Field Map e>
    //    2    4:invokeinterface #192 <Method Set Map.keySet()>
    //    3    9:invokeinterface #197 <Method Iterator Set.iterator()>
    //    4   14:astore_2        
    //    5   15:aload_2         
    //    6   16:invokeinterface #137 <Method boolean Iterator.hasNext()>
    //    7   21:ifeq            79
    //    8   24:aload_2         
    //    9   25:invokeinterface #141 <Method Object Iterator.next()>
    //   10   30:checkcast       #168 <Class String>
    //   11   33:astore_3        
    //   12   34:aload_0         
    //   13   35:getfield        #54  <Field Map e>
    //   14   38:aload_3         
    //   15   39:invokeinterface #201 <Method Object Map.get(Object)>
    //   16   44:checkcast       #168 <Class String>
    //   17   47:astore          4
    //   18   49:aload           4
    //   19   51:invokevirtual   #217 <Method int String.length()>
    //   20   54:iload_1         
    //   21   55:icmple          15
    //   22   58:aload_0         
    //   23   59:getfield        #54  <Field Map e>
    //   24   62:aload_3         
    //   25   63:aload           4
    //   26   65:iconst_0        
    //   27   66:iload_1         
    //   28   67:invokevirtual   #221 <Method String String.substring(int, int)>
    //   29   70:invokeinterface #178 <Method Object Map.put(Object, Object)>
    //   30   75:pop             
    //   31   76:goto            15
    //   32   79:return          
    }

    public static final String SESSION_END = "session_end";
    public static final String SESSION_START = "session_start";
    private String a;
    private String b;
    private long c;
    private String d;
    private Map e;
}
