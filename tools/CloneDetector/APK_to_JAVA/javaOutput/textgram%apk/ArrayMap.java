// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.util;

import java.util.*;

// Referenced classes of package android.support.v4.util:
//            SimpleArrayMap, MapCollections

public class ArrayMap extends SimpleArrayMap
    implements Map
{

    public ArrayMap()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #14  <Method void SimpleArrayMap()>
    //    2    4:return          
    }

    public ArrayMap(int i)
    {
    //    0    0:aload_0         
    //    1    1:iload_1         
    //    2    2:invokespecial   #17  <Method void SimpleArrayMap(int)>
    //    3    5:return          
    }

    public ArrayMap(SimpleArrayMap simplearraymap)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokespecial   #20  <Method void SimpleArrayMap(SimpleArrayMap)>
    //    3    5:return          
    }

    private MapCollections getCollection()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #24  <Field MapCollections mCollections>
    //    2    4:ifnonnull       19
    //    3    7:aload_0         
    //    4    8:new             #26  <Class ArrayMap$1>
    //    5   11:dup             
    //    6   12:aload_0         
    //    7   13:invokespecial   #29  <Method void ArrayMap$1(ArrayMap)>
    //    8   16:putfield        #24  <Field MapCollections mCollections>
    //    9   19:aload_0         
    //   10   20:getfield        #24  <Field MapCollections mCollections>
    //   11   23:areturn         
    }

    public boolean containsAll(Collection collection)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokestatic    #37  <Method boolean MapCollections.containsAllHelper(Map, Collection)>
    //    3    5:ireturn         
    }

    public Set entrySet()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #41  <Method MapCollections getCollection()>
    //    2    4:invokevirtual   #44  <Method Set MapCollections.getEntrySet()>
    //    3    7:areturn         
    }

    public Set keySet()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #41  <Method MapCollections getCollection()>
    //    2    4:invokevirtual   #48  <Method Set MapCollections.getKeySet()>
    //    3    7:areturn         
    }

    public void putAll(Map map)
    {
    //    0    0:aload_0         
    //    1    1:aload_0         
    //    2    2:getfield        #54  <Field int mSize>
    //    3    5:aload_1         
    //    4    6:invokeinterface #58  <Method int Map.size()>
    //    5   11:iadd            
    //    6   12:invokevirtual   #61  <Method void ensureCapacity(int)>
    //    7   15:aload_1         
    //    8   16:invokeinterface #63  <Method Set Map.entrySet()>
    //    9   21:invokeinterface #69  <Method Iterator Set.iterator()>
    //   10   26:astore_2        
    //   11   27:aload_2         
    //   12   28:invokeinterface #75  <Method boolean Iterator.hasNext()>
    //   13   33:ifeq            66
    //   14   36:aload_2         
    //   15   37:invokeinterface #79  <Method Object Iterator.next()>
    //   16   42:checkcast       #81  <Class java.util.Map$Entry>
    //   17   45:astore_3        
    //   18   46:aload_0         
    //   19   47:aload_3         
    //   20   48:invokeinterface #84  <Method Object java.util.Map$Entry.getKey()>
    //   21   53:aload_3         
    //   22   54:invokeinterface #87  <Method Object java.util.Map$Entry.getValue()>
    //   23   59:invokevirtual   #91  <Method Object put(Object, Object)>
    //   24   62:pop             
    //   25   63:goto            27
    //   26   66:return          
    }

    public boolean removeAll(Collection collection)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokestatic    #95  <Method boolean MapCollections.removeAllHelper(Map, Collection)>
    //    3    5:ireturn         
    }

    public boolean retainAll(Collection collection)
    {
    //    0    0:aload_0         
    //    1    1:aload_1         
    //    2    2:invokestatic    #99  <Method boolean MapCollections.retainAllHelper(Map, Collection)>
    //    3    5:ireturn         
    }

    public Collection values()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #41  <Method MapCollections getCollection()>
    //    2    4:invokevirtual   #104 <Method Collection MapCollections.getValues()>
    //    3    7:areturn         
    }

    MapCollections mCollections;

    // Unreferenced inner class android/support/v4/util/ArrayMap$1

/* anonymous class */
    class _cls1 extends MapCollections
    {

        _cls1()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #16  <Field ArrayMap this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #19  <Method void MapCollections()>
        //    5    9:return          
        }

        protected void colClear()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field ArrayMap this$0>
        //    2    4:invokevirtual   #23  <Method void ArrayMap.clear()>
        //    3    7:return          
        }

        protected Object colGetEntry(int i, int j)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field ArrayMap this$0>
        //    2    4:getfield        #29  <Field Object[] ArrayMap.mArray>
        //    3    7:iload_2         
        //    4    8:iload_1         
        //    5    9:iconst_1        
        //    6   10:ishl            
        //    7   11:iadd            
        //    8   12:aaload          
        //    9   13:areturn         
        }

        protected Map colGetMap()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field ArrayMap this$0>
        //    2    4:areturn         
        }

        protected int colGetSize()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field ArrayMap this$0>
        //    2    4:getfield        #37  <Field int ArrayMap.mSize>
        //    3    7:ireturn         
        }

        protected int colIndexOfKey(Object obj)
        {
        //    0    0:aload_1         
        //    1    1:ifnonnull       12
        //    2    4:aload_0         
        //    3    5:getfield        #16  <Field ArrayMap this$0>
        //    4    8:invokevirtual   #42  <Method int ArrayMap.indexOfNull()>
        //    5   11:ireturn         
        //    6   12:aload_0         
        //    7   13:getfield        #16  <Field ArrayMap this$0>
        //    8   16:aload_1         
        //    9   17:aload_1         
        //   10   18:invokevirtual   #47  <Method int Object.hashCode()>
        //   11   21:invokevirtual   #51  <Method int ArrayMap.indexOf(Object, int)>
        //   12   24:ireturn         
        }

        protected int colIndexOfValue(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field ArrayMap this$0>
        //    2    4:aload_1         
        //    3    5:invokevirtual   #55  <Method int ArrayMap.indexOfValue(Object)>
        //    4    8:ireturn         
        }

        protected void colPut(Object obj, Object obj1)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field ArrayMap this$0>
        //    2    4:aload_1         
        //    3    5:aload_2         
        //    4    6:invokevirtual   #61  <Method Object ArrayMap.put(Object, Object)>
        //    5    9:pop             
        //    6   10:return          
        }

        protected void colRemoveAt(int i)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field ArrayMap this$0>
        //    2    4:iload_1         
        //    3    5:invokevirtual   #67  <Method Object ArrayMap.removeAt(int)>
        //    4    8:pop             
        //    5    9:return          
        }

        protected Object colSetValue(int i, Object obj)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #16  <Field ArrayMap this$0>
        //    2    4:iload_1         
        //    3    5:aload_2         
        //    4    6:invokevirtual   #72  <Method Object ArrayMap.setValueAt(int, Object)>
        //    5    9:areturn         
        }

        final ArrayMap this$0;
    }

}
