// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package android.support.v4.util;

import java.lang.reflect.Array;
import java.util.*;

// Referenced classes of package android.support.v4.util:
//            ContainerHelpers

abstract class MapCollections
{
    final class ArrayIterator
        implements Iterator
    {

        ArrayIterator(int i)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #19  <Field MapCollections this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #22  <Method void Object()>
        //    5    9:aload_0         
        //    6   10:iconst_0        
        //    7   11:putfield        #24  <Field boolean mCanRemove>
        //    8   14:aload_0         
        //    9   15:iload_2         
        //   10   16:putfield        #26  <Field int mOffset>
        //   11   19:aload_0         
        //   12   20:aload_1         
        //   13   21:invokevirtual   #32  <Method int MapCollections.colGetSize()>
        //   14   24:putfield        #34  <Field int mSize>
        //   15   27:return          
        }

        public boolean hasNext()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #38  <Field int mIndex>
        //    2    4:aload_0         
        //    3    5:getfield        #34  <Field int mSize>
        //    4    8:icmpge          13
        //    5   11:iconst_1        
        //    6   12:ireturn         
        //    7   13:iconst_0        
        //    8   14:ireturn         
        }

        public Object next()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #19  <Field MapCollections this$0>
        //    2    4:aload_0         
        //    3    5:getfield        #38  <Field int mIndex>
        //    4    8:aload_0         
        //    5    9:getfield        #26  <Field int mOffset>
        //    6   12:invokevirtual   #44  <Method Object MapCollections.colGetEntry(int, int)>
        //    7   15:astore_1        
        //    8   16:aload_0         
        //    9   17:iconst_1        
        //   10   18:aload_0         
        //   11   19:getfield        #38  <Field int mIndex>
        //   12   22:iadd            
        //   13   23:putfield        #38  <Field int mIndex>
        //   14   26:aload_0         
        //   15   27:iconst_1        
        //   16   28:putfield        #24  <Field boolean mCanRemove>
        //   17   31:aload_1         
        //   18   32:areturn         
        }

        public void remove()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #24  <Field boolean mCanRemove>
        //    2    4:ifne            15
        //    3    7:new             #47  <Class IllegalStateException>
        //    4   10:dup             
        //    5   11:invokespecial   #48  <Method void IllegalStateException()>
        //    6   14:athrow          
        //    7   15:aload_0         
        //    8   16:iconst_m1       
        //    9   17:aload_0         
        //   10   18:getfield        #38  <Field int mIndex>
        //   11   21:iadd            
        //   12   22:putfield        #38  <Field int mIndex>
        //   13   25:aload_0         
        //   14   26:iconst_m1       
        //   15   27:aload_0         
        //   16   28:getfield        #34  <Field int mSize>
        //   17   31:iadd            
        //   18   32:putfield        #34  <Field int mSize>
        //   19   35:aload_0         
        //   20   36:iconst_0        
        //   21   37:putfield        #24  <Field boolean mCanRemove>
        //   22   40:aload_0         
        //   23   41:getfield        #19  <Field MapCollections this$0>
        //   24   44:aload_0         
        //   25   45:getfield        #38  <Field int mIndex>
        //   26   48:invokevirtual   #52  <Method void MapCollections.colRemoveAt(int)>
        //   27   51:return          
        }

        boolean mCanRemove;
        int mIndex;
        final int mOffset;
        int mSize;
        final MapCollections this$0;
    }

    final class EntrySet
        implements Set
    {

        EntrySet()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #13  <Field MapCollections this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #16  <Method void Object()>
        //    5    9:return          
        }

        public volatile boolean add(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:checkcast       #20  <Class java.util.Map$Entry>
        //    3    5:invokevirtual   #23  <Method boolean add(java.util.Map$Entry)>
        //    4    8:ireturn         
        }

        public boolean add(java.util.Map.Entry entry)
        {
        //    0    0:new             #25  <Class UnsupportedOperationException>
        //    1    3:dup             
        //    2    4:invokespecial   #26  <Method void UnsupportedOperationException()>
        //    3    7:athrow          
        }

        public boolean addAll(Collection collection)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #13  <Field MapCollections this$0>
        //    2    4:invokevirtual   #34  <Method int MapCollections.colGetSize()>
        //    3    7:istore_2        
        //    4    8:aload_1         
        //    5    9:invokeinterface #40  <Method Iterator Collection.iterator()>
        //    6   14:astore_3        
        //    7   15:aload_3         
        //    8   16:invokeinterface #46  <Method boolean Iterator.hasNext()>
        //    9   21:ifeq            59
        //   10   24:aload_3         
        //   11   25:invokeinterface #50  <Method Object Iterator.next()>
        //   12   30:checkcast       #20  <Class java.util.Map$Entry>
        //   13   33:astore          4
        //   14   35:aload_0         
        //   15   36:getfield        #13  <Field MapCollections this$0>
        //   16   39:aload           4
        //   17   41:invokeinterface #53  <Method Object java.util.Map$Entry.getKey()>
        //   18   46:aload           4
        //   19   48:invokeinterface #56  <Method Object java.util.Map$Entry.getValue()>
        //   20   53:invokevirtual   #60  <Method void MapCollections.colPut(Object, Object)>
        //   21   56:goto            15
        //   22   59:iload_2         
        //   23   60:aload_0         
        //   24   61:getfield        #13  <Field MapCollections this$0>
        //   25   64:invokevirtual   #34  <Method int MapCollections.colGetSize()>
        //   26   67:icmpeq          72
        //   27   70:iconst_1        
        //   28   71:ireturn         
        //   29   72:iconst_0        
        //   30   73:ireturn         
        }

        public void clear()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #13  <Field MapCollections this$0>
        //    2    4:invokevirtual   #64  <Method void MapCollections.colClear()>
        //    3    7:return          
        }

        public boolean contains(Object obj)
        {
        //    0    0:aload_1         
        //    1    1:instanceof      #20  <Class java.util.Map$Entry>
        //    2    4:ifne            9
        //    3    7:iconst_0        
        //    4    8:ireturn         
        //    5    9:aload_1         
        //    6   10:checkcast       #20  <Class java.util.Map$Entry>
        //    7   13:astore_2        
        //    8   14:aload_0         
        //    9   15:getfield        #13  <Field MapCollections this$0>
        //   10   18:aload_2         
        //   11   19:invokeinterface #53  <Method Object java.util.Map$Entry.getKey()>
        //   12   24:invokevirtual   #69  <Method int MapCollections.colIndexOfKey(Object)>
        //   13   27:istore_3        
        //   14   28:iload_3         
        //   15   29:iflt            7
        //   16   32:aload_0         
        //   17   33:getfield        #13  <Field MapCollections this$0>
        //   18   36:iload_3         
        //   19   37:iconst_1        
        //   20   38:invokevirtual   #73  <Method Object MapCollections.colGetEntry(int, int)>
        //   21   41:aload_2         
        //   22   42:invokeinterface #56  <Method Object java.util.Map$Entry.getValue()>
        //   23   47:invokestatic    #79  <Method boolean ContainerHelpers.equal(Object, Object)>
        //   24   50:ireturn         
        }

        public boolean containsAll(Collection collection)
        {
        //    0    0:aload_1         
        //    1    1:invokeinterface #40  <Method Iterator Collection.iterator()>
        //    2    6:astore_2        
        //    3    7:aload_2         
        //    4    8:invokeinterface #46  <Method boolean Iterator.hasNext()>
        //    5   13:ifeq            31
        //    6   16:aload_0         
        //    7   17:aload_2         
        //    8   18:invokeinterface #50  <Method Object Iterator.next()>
        //    9   23:invokevirtual   #82  <Method boolean contains(Object)>
        //   10   26:ifne            7
        //   11   29:iconst_0        
        //   12   30:ireturn         
        //   13   31:iconst_1        
        //   14   32:ireturn         
        }

        public boolean equals(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokestatic    #87  <Method boolean MapCollections.equalsSetHelper(Set, Object)>
        //    3    5:ireturn         
        }

        public int hashCode()
        {
        //    0    0:iconst_0        
        //    1    1:istore_1        
        //    2    2:iconst_m1       
        //    3    3:aload_0         
        //    4    4:getfield        #13  <Field MapCollections this$0>
        //    5    7:invokevirtual   #34  <Method int MapCollections.colGetSize()>
        //    6   10:iadd            
        //    7   11:istore_2        
        //    8   12:iload_2         
        //    9   13:iflt            85
        //   10   16:aload_0         
        //   11   17:getfield        #13  <Field MapCollections this$0>
        //   12   20:iload_2         
        //   13   21:iconst_0        
        //   14   22:invokevirtual   #73  <Method Object MapCollections.colGetEntry(int, int)>
        //   15   25:astore_3        
        //   16   26:aload_0         
        //   17   27:getfield        #13  <Field MapCollections this$0>
        //   18   30:iload_2         
        //   19   31:iconst_1        
        //   20   32:invokevirtual   #73  <Method Object MapCollections.colGetEntry(int, int)>
        //   21   35:astore          4
        //   22   37:aload_3         
        //   23   38:ifnonnull       66
        //   24   41:iconst_0        
        //   25   42:istore          5
        //   26   44:aload           4
        //   27   46:ifnonnull       75
        //   28   49:iconst_0        
        //   29   50:istore          6
        //   30   52:iload_1         
        //   31   53:iload           6
        //   32   55:iload           5
        //   33   57:ixor            
        //   34   58:iadd            
        //   35   59:istore_1        
        //   36   60:iinc            2  -1
        //   37   63:goto            12
        //   38   66:aload_3         
        //   39   67:invokevirtual   #90  <Method int Object.hashCode()>
        //   40   70:istore          5
        //   41   72:goto            44
        //   42   75:aload           4
        //   43   77:invokevirtual   #90  <Method int Object.hashCode()>
        //   44   80:istore          6
        //   45   82:goto            52
        //   46   85:iload_1         
        //   47   86:ireturn         
        }

        public boolean isEmpty()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #13  <Field MapCollections this$0>
        //    2    4:invokevirtual   #34  <Method int MapCollections.colGetSize()>
        //    3    7:ifne            12
        //    4   10:iconst_1        
        //    5   11:ireturn         
        //    6   12:iconst_0        
        //    7   13:ireturn         
        }

        public Iterator iterator()
        {
        //    0    0:new             #93  <Class MapCollections$MapIterator>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:getfield        #13  <Field MapCollections this$0>
        //    4    8:invokespecial   #95  <Method void MapCollections$MapIterator(MapCollections)>
        //    5   11:areturn         
        }

        public boolean remove(Object obj)
        {
        //    0    0:new             #25  <Class UnsupportedOperationException>
        //    1    3:dup             
        //    2    4:invokespecial   #26  <Method void UnsupportedOperationException()>
        //    3    7:athrow          
        }

        public boolean removeAll(Collection collection)
        {
        //    0    0:new             #25  <Class UnsupportedOperationException>
        //    1    3:dup             
        //    2    4:invokespecial   #26  <Method void UnsupportedOperationException()>
        //    3    7:athrow          
        }

        public boolean retainAll(Collection collection)
        {
        //    0    0:new             #25  <Class UnsupportedOperationException>
        //    1    3:dup             
        //    2    4:invokespecial   #26  <Method void UnsupportedOperationException()>
        //    3    7:athrow          
        }

        public int size()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #13  <Field MapCollections this$0>
        //    2    4:invokevirtual   #34  <Method int MapCollections.colGetSize()>
        //    3    7:ireturn         
        }

        public Object[] toArray()
        {
        //    0    0:new             #25  <Class UnsupportedOperationException>
        //    1    3:dup             
        //    2    4:invokespecial   #26  <Method void UnsupportedOperationException()>
        //    3    7:athrow          
        }

        public Object[] toArray(Object aobj[])
        {
        //    0    0:new             #25  <Class UnsupportedOperationException>
        //    1    3:dup             
        //    2    4:invokespecial   #26  <Method void UnsupportedOperationException()>
        //    3    7:athrow          
        }

        final MapCollections this$0;
    }

    final class KeySet
        implements Set
    {

        KeySet()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #13  <Field MapCollections this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #16  <Method void Object()>
        //    5    9:return          
        }

        public boolean add(Object obj)
        {
        //    0    0:new             #20  <Class UnsupportedOperationException>
        //    1    3:dup             
        //    2    4:invokespecial   #21  <Method void UnsupportedOperationException()>
        //    3    7:athrow          
        }

        public boolean addAll(Collection collection)
        {
        //    0    0:new             #20  <Class UnsupportedOperationException>
        //    1    3:dup             
        //    2    4:invokespecial   #21  <Method void UnsupportedOperationException()>
        //    3    7:athrow          
        }

        public void clear()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #13  <Field MapCollections this$0>
        //    2    4:invokevirtual   #29  <Method void MapCollections.colClear()>
        //    3    7:return          
        }

        public boolean contains(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #13  <Field MapCollections this$0>
        //    2    4:aload_1         
        //    3    5:invokevirtual   #34  <Method int MapCollections.colIndexOfKey(Object)>
        //    4    8:iflt            13
        //    5   11:iconst_1        
        //    6   12:ireturn         
        //    7   13:iconst_0        
        //    8   14:ireturn         
        }

        public boolean containsAll(Collection collection)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #13  <Field MapCollections this$0>
        //    2    4:invokevirtual   #39  <Method Map MapCollections.colGetMap()>
        //    3    7:aload_1         
        //    4    8:invokestatic    #43  <Method boolean MapCollections.containsAllHelper(Map, Collection)>
        //    5   11:ireturn         
        }

        public boolean equals(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:invokestatic    #48  <Method boolean MapCollections.equalsSetHelper(Set, Object)>
        //    3    5:ireturn         
        }

        public int hashCode()
        {
        //    0    0:iconst_0        
        //    1    1:istore_1        
        //    2    2:iconst_m1       
        //    3    3:aload_0         
        //    4    4:getfield        #13  <Field MapCollections this$0>
        //    5    7:invokevirtual   #53  <Method int MapCollections.colGetSize()>
        //    6   10:iadd            
        //    7   11:istore_2        
        //    8   12:iload_2         
        //    9   13:iflt            53
        //   10   16:aload_0         
        //   11   17:getfield        #13  <Field MapCollections this$0>
        //   12   20:iload_2         
        //   13   21:iconst_0        
        //   14   22:invokevirtual   #57  <Method Object MapCollections.colGetEntry(int, int)>
        //   15   25:astore_3        
        //   16   26:aload_3         
        //   17   27:ifnonnull       44
        //   18   30:iconst_0        
        //   19   31:istore          4
        //   20   33:iload_1         
        //   21   34:iload           4
        //   22   36:iadd            
        //   23   37:istore_1        
        //   24   38:iinc            2  -1
        //   25   41:goto            12
        //   26   44:aload_3         
        //   27   45:invokevirtual   #59  <Method int Object.hashCode()>
        //   28   48:istore          4
        //   29   50:goto            33
        //   30   53:iload_1         
        //   31   54:ireturn         
        }

        public boolean isEmpty()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #13  <Field MapCollections this$0>
        //    2    4:invokevirtual   #53  <Method int MapCollections.colGetSize()>
        //    3    7:ifne            12
        //    4   10:iconst_1        
        //    5   11:ireturn         
        //    6   12:iconst_0        
        //    7   13:ireturn         
        }

        public Iterator iterator()
        {
        //    0    0:new             #65  <Class MapCollections$ArrayIterator>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:getfield        #13  <Field MapCollections this$0>
        //    4    8:iconst_0        
        //    5    9:invokespecial   #68  <Method void MapCollections$ArrayIterator(MapCollections, int)>
        //    6   12:areturn         
        }

        public boolean remove(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #13  <Field MapCollections this$0>
        //    2    4:aload_1         
        //    3    5:invokevirtual   #34  <Method int MapCollections.colIndexOfKey(Object)>
        //    4    8:istore_2        
        //    5    9:iload_2         
        //    6   10:iflt            23
        //    7   13:aload_0         
        //    8   14:getfield        #13  <Field MapCollections this$0>
        //    9   17:iload_2         
        //   10   18:invokevirtual   #73  <Method void MapCollections.colRemoveAt(int)>
        //   11   21:iconst_1        
        //   12   22:ireturn         
        //   13   23:iconst_0        
        //   14   24:ireturn         
        }

        public boolean removeAll(Collection collection)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #13  <Field MapCollections this$0>
        //    2    4:invokevirtual   #39  <Method Map MapCollections.colGetMap()>
        //    3    7:aload_1         
        //    4    8:invokestatic    #77  <Method boolean MapCollections.removeAllHelper(Map, Collection)>
        //    5   11:ireturn         
        }

        public boolean retainAll(Collection collection)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #13  <Field MapCollections this$0>
        //    2    4:invokevirtual   #39  <Method Map MapCollections.colGetMap()>
        //    3    7:aload_1         
        //    4    8:invokestatic    #81  <Method boolean MapCollections.retainAllHelper(Map, Collection)>
        //    5   11:ireturn         
        }

        public int size()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #13  <Field MapCollections this$0>
        //    2    4:invokevirtual   #53  <Method int MapCollections.colGetSize()>
        //    3    7:ireturn         
        }

        public Object[] toArray()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #13  <Field MapCollections this$0>
        //    2    4:iconst_0        
        //    3    5:invokevirtual   #88  <Method Object[] MapCollections.toArrayHelper(int)>
        //    4    8:areturn         
        }

        public Object[] toArray(Object aobj[])
        {
        //    0    0:aload_0         
        //    1    1:getfield        #13  <Field MapCollections this$0>
        //    2    4:aload_1         
        //    3    5:iconst_0        
        //    4    6:invokevirtual   #92  <Method Object[] MapCollections.toArrayHelper(Object[], int)>
        //    5    9:areturn         
        }

        final MapCollections this$0;
    }

    final class MapIterator
        implements Iterator, java.util.Map.Entry
    {

        MapIterator()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #20  <Field MapCollections this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #23  <Method void Object()>
        //    5    9:aload_0         
        //    6   10:iconst_0        
        //    7   11:putfield        #25  <Field boolean mEntryValid>
        //    8   14:aload_0         
        //    9   15:iconst_m1       
        //   10   16:aload_1         
        //   11   17:invokevirtual   #31  <Method int MapCollections.colGetSize()>
        //   12   20:iadd            
        //   13   21:putfield        #33  <Field int mEnd>
        //   14   24:aload_0         
        //   15   25:iconst_m1       
        //   16   26:putfield        #35  <Field int mIndex>
        //   17   29:return          
        }

        public final boolean equals(Object obj)
        {
        //    0    0:iconst_1        
        //    1    1:istore_2        
        //    2    2:aload_0         
        //    3    3:getfield        #25  <Field boolean mEntryValid>
        //    4    6:ifne            19
        //    5    9:new             #39  <Class IllegalStateException>
        //    6   12:dup             
        //    7   13:ldc1            #41  <String "This container does not support retaining Map.Entry objects">
        //    8   15:invokespecial   #44  <Method void IllegalStateException(String)>
        //    9   18:athrow          
        //   10   19:aload_1         
        //   11   20:instanceof      #9   <Class java.util.Map$Entry>
        //   12   23:ifne            28
        //   13   26:iconst_0        
        //   14   27:ireturn         
        //   15   28:aload_1         
        //   16   29:checkcast       #9   <Class java.util.Map$Entry>
        //   17   32:astore_3        
        //   18   33:aload_3         
        //   19   34:invokeinterface #48  <Method Object java.util.Map$Entry.getKey()>
        //   20   39:aload_0         
        //   21   40:getfield        #20  <Field MapCollections this$0>
        //   22   43:aload_0         
        //   23   44:getfield        #35  <Field int mIndex>
        //   24   47:iconst_0        
        //   25   48:invokevirtual   #52  <Method Object MapCollections.colGetEntry(int, int)>
        //   26   51:invokestatic    #58  <Method boolean ContainerHelpers.equal(Object, Object)>
        //   27   54:ifeq            83
        //   28   57:aload_3         
        //   29   58:invokeinterface #61  <Method Object java.util.Map$Entry.getValue()>
        //   30   63:aload_0         
        //   31   64:getfield        #20  <Field MapCollections this$0>
        //   32   67:aload_0         
        //   33   68:getfield        #35  <Field int mIndex>
        //   34   71:iload_2         
        //   35   72:invokevirtual   #52  <Method Object MapCollections.colGetEntry(int, int)>
        //   36   75:invokestatic    #58  <Method boolean ContainerHelpers.equal(Object, Object)>
        //   37   78:ifeq            83
        //   38   81:iload_2         
        //   39   82:ireturn         
        //   40   83:iconst_0        
        //   41   84:istore_2        
        //   42   85:goto            81
        }

        public Object getKey()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #25  <Field boolean mEntryValid>
        //    2    4:ifne            17
        //    3    7:new             #39  <Class IllegalStateException>
        //    4   10:dup             
        //    5   11:ldc1            #41  <String "This container does not support retaining Map.Entry objects">
        //    6   13:invokespecial   #44  <Method void IllegalStateException(String)>
        //    7   16:athrow          
        //    8   17:aload_0         
        //    9   18:getfield        #20  <Field MapCollections this$0>
        //   10   21:aload_0         
        //   11   22:getfield        #35  <Field int mIndex>
        //   12   25:iconst_0        
        //   13   26:invokevirtual   #52  <Method Object MapCollections.colGetEntry(int, int)>
        //   14   29:areturn         
        }

        public Object getValue()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #25  <Field boolean mEntryValid>
        //    2    4:ifne            17
        //    3    7:new             #39  <Class IllegalStateException>
        //    4   10:dup             
        //    5   11:ldc1            #41  <String "This container does not support retaining Map.Entry objects">
        //    6   13:invokespecial   #44  <Method void IllegalStateException(String)>
        //    7   16:athrow          
        //    8   17:aload_0         
        //    9   18:getfield        #20  <Field MapCollections this$0>
        //   10   21:aload_0         
        //   11   22:getfield        #35  <Field int mIndex>
        //   12   25:iconst_1        
        //   13   26:invokevirtual   #52  <Method Object MapCollections.colGetEntry(int, int)>
        //   14   29:areturn         
        }

        public boolean hasNext()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #35  <Field int mIndex>
        //    2    4:aload_0         
        //    3    5:getfield        #33  <Field int mEnd>
        //    4    8:icmpge          13
        //    5   11:iconst_1        
        //    6   12:ireturn         
        //    7   13:iconst_0        
        //    8   14:ireturn         
        }

        public final int hashCode()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #25  <Field boolean mEntryValid>
        //    2    4:ifne            17
        //    3    7:new             #39  <Class IllegalStateException>
        //    4   10:dup             
        //    5   11:ldc1            #41  <String "This container does not support retaining Map.Entry objects">
        //    6   13:invokespecial   #44  <Method void IllegalStateException(String)>
        //    7   16:athrow          
        //    8   17:aload_0         
        //    9   18:getfield        #20  <Field MapCollections this$0>
        //   10   21:aload_0         
        //   11   22:getfield        #35  <Field int mIndex>
        //   12   25:iconst_0        
        //   13   26:invokevirtual   #52  <Method Object MapCollections.colGetEntry(int, int)>
        //   14   29:astore_1        
        //   15   30:aload_0         
        //   16   31:getfield        #20  <Field MapCollections this$0>
        //   17   34:aload_0         
        //   18   35:getfield        #35  <Field int mIndex>
        //   19   38:iconst_1        
        //   20   39:invokevirtual   #52  <Method Object MapCollections.colGetEntry(int, int)>
        //   21   42:astore_2        
        //   22   43:aload_1         
        //   23   44:ifnonnull       61
        //   24   47:iconst_0        
        //   25   48:istore_3        
        //   26   49:iconst_0        
        //   27   50:istore          4
        //   28   52:aload_2         
        //   29   53:ifnonnull       69
        //   30   56:iload           4
        //   31   58:iload_3         
        //   32   59:ixor            
        //   33   60:ireturn         
        //   34   61:aload_1         
        //   35   62:invokevirtual   #66  <Method int Object.hashCode()>
        //   36   65:istore_3        
        //   37   66:goto            49
        //   38   69:aload_2         
        //   39   70:invokevirtual   #66  <Method int Object.hashCode()>
        //   40   73:istore          4
        //   41   75:goto            56
        }

        public volatile Object next()
        {
        //    0    0:aload_0         
        //    1    1:invokevirtual   #70  <Method java.util.Map$Entry next()>
        //    2    4:areturn         
        }

        public java.util.Map.Entry next()
        {
        //    0    0:aload_0         
        //    1    1:iconst_1        
        //    2    2:aload_0         
        //    3    3:getfield        #35  <Field int mIndex>
        //    4    6:iadd            
        //    5    7:putfield        #35  <Field int mIndex>
        //    6   10:aload_0         
        //    7   11:iconst_1        
        //    8   12:putfield        #25  <Field boolean mEntryValid>
        //    9   15:aload_0         
        //   10   16:areturn         
        }

        public void remove()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #25  <Field boolean mEntryValid>
        //    2    4:ifne            15
        //    3    7:new             #39  <Class IllegalStateException>
        //    4   10:dup             
        //    5   11:invokespecial   #72  <Method void IllegalStateException()>
        //    6   14:athrow          
        //    7   15:aload_0         
        //    8   16:iconst_m1       
        //    9   17:aload_0         
        //   10   18:getfield        #35  <Field int mIndex>
        //   11   21:iadd            
        //   12   22:putfield        #35  <Field int mIndex>
        //   13   25:aload_0         
        //   14   26:iconst_m1       
        //   15   27:aload_0         
        //   16   28:getfield        #33  <Field int mEnd>
        //   17   31:iadd            
        //   18   32:putfield        #33  <Field int mEnd>
        //   19   35:aload_0         
        //   20   36:iconst_0        
        //   21   37:putfield        #25  <Field boolean mEntryValid>
        //   22   40:aload_0         
        //   23   41:getfield        #20  <Field MapCollections this$0>
        //   24   44:aload_0         
        //   25   45:getfield        #35  <Field int mIndex>
        //   26   48:invokevirtual   #76  <Method void MapCollections.colRemoveAt(int)>
        //   27   51:return          
        }

        public Object setValue(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #25  <Field boolean mEntryValid>
        //    2    4:ifne            17
        //    3    7:new             #39  <Class IllegalStateException>
        //    4   10:dup             
        //    5   11:ldc1            #41  <String "This container does not support retaining Map.Entry objects">
        //    6   13:invokespecial   #44  <Method void IllegalStateException(String)>
        //    7   16:athrow          
        //    8   17:aload_0         
        //    9   18:getfield        #20  <Field MapCollections this$0>
        //   10   21:aload_0         
        //   11   22:getfield        #35  <Field int mIndex>
        //   12   25:aload_1         
        //   13   26:invokevirtual   #82  <Method Object MapCollections.colSetValue(int, Object)>
        //   14   29:areturn         
        }

        public final String toString()
        {
        //    0    0:new             #86  <Class StringBuilder>
        //    1    3:dup             
        //    2    4:invokespecial   #87  <Method void StringBuilder()>
        //    3    7:aload_0         
        //    4    8:invokevirtual   #88  <Method Object getKey()>
        //    5   11:invokevirtual   #92  <Method StringBuilder StringBuilder.append(Object)>
        //    6   14:ldc1            #94  <String "=">
        //    7   16:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
        //    8   19:aload_0         
        //    9   20:invokevirtual   #98  <Method Object getValue()>
        //   10   23:invokevirtual   #92  <Method StringBuilder StringBuilder.append(Object)>
        //   11   26:invokevirtual   #100 <Method String StringBuilder.toString()>
        //   12   29:areturn         
        }

        int mEnd;
        boolean mEntryValid;
        int mIndex;
        final MapCollections this$0;
    }

    final class ValuesCollection
        implements Collection
    {

        ValuesCollection()
        {
        //    0    0:aload_0         
        //    1    1:aload_1         
        //    2    2:putfield        #13  <Field MapCollections this$0>
        //    3    5:aload_0         
        //    4    6:invokespecial   #16  <Method void Object()>
        //    5    9:return          
        }

        public boolean add(Object obj)
        {
        //    0    0:new             #20  <Class UnsupportedOperationException>
        //    1    3:dup             
        //    2    4:invokespecial   #21  <Method void UnsupportedOperationException()>
        //    3    7:athrow          
        }

        public boolean addAll(Collection collection)
        {
        //    0    0:new             #20  <Class UnsupportedOperationException>
        //    1    3:dup             
        //    2    4:invokespecial   #21  <Method void UnsupportedOperationException()>
        //    3    7:athrow          
        }

        public void clear()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #13  <Field MapCollections this$0>
        //    2    4:invokevirtual   #29  <Method void MapCollections.colClear()>
        //    3    7:return          
        }

        public boolean contains(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #13  <Field MapCollections this$0>
        //    2    4:aload_1         
        //    3    5:invokevirtual   #34  <Method int MapCollections.colIndexOfValue(Object)>
        //    4    8:iflt            13
        //    5   11:iconst_1        
        //    6   12:ireturn         
        //    7   13:iconst_0        
        //    8   14:ireturn         
        }

        public boolean containsAll(Collection collection)
        {
        //    0    0:aload_1         
        //    1    1:invokeinterface #39  <Method Iterator Collection.iterator()>
        //    2    6:astore_2        
        //    3    7:aload_2         
        //    4    8:invokeinterface #45  <Method boolean Iterator.hasNext()>
        //    5   13:ifeq            31
        //    6   16:aload_0         
        //    7   17:aload_2         
        //    8   18:invokeinterface #49  <Method Object Iterator.next()>
        //    9   23:invokevirtual   #51  <Method boolean contains(Object)>
        //   10   26:ifne            7
        //   11   29:iconst_0        
        //   12   30:ireturn         
        //   13   31:iconst_1        
        //   14   32:ireturn         
        }

        public boolean isEmpty()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #13  <Field MapCollections this$0>
        //    2    4:invokevirtual   #56  <Method int MapCollections.colGetSize()>
        //    3    7:ifne            12
        //    4   10:iconst_1        
        //    5   11:ireturn         
        //    6   12:iconst_0        
        //    7   13:ireturn         
        }

        public Iterator iterator()
        {
        //    0    0:new             #58  <Class MapCollections$ArrayIterator>
        //    1    3:dup             
        //    2    4:aload_0         
        //    3    5:getfield        #13  <Field MapCollections this$0>
        //    4    8:iconst_1        
        //    5    9:invokespecial   #61  <Method void MapCollections$ArrayIterator(MapCollections, int)>
        //    6   12:areturn         
        }

        public boolean remove(Object obj)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #13  <Field MapCollections this$0>
        //    2    4:aload_1         
        //    3    5:invokevirtual   #34  <Method int MapCollections.colIndexOfValue(Object)>
        //    4    8:istore_2        
        //    5    9:iload_2         
        //    6   10:iflt            23
        //    7   13:aload_0         
        //    8   14:getfield        #13  <Field MapCollections this$0>
        //    9   17:iload_2         
        //   10   18:invokevirtual   #66  <Method void MapCollections.colRemoveAt(int)>
        //   11   21:iconst_1        
        //   12   22:ireturn         
        //   13   23:iconst_0        
        //   14   24:ireturn         
        }

        public boolean removeAll(Collection collection)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #13  <Field MapCollections this$0>
        //    2    4:invokevirtual   #56  <Method int MapCollections.colGetSize()>
        //    3    7:istore_2        
        //    4    8:iconst_0        
        //    5    9:istore_3        
        //    6   10:iconst_0        
        //    7   11:istore          4
        //    8   13:iload           4
        //    9   15:iload_2         
        //   10   16:icmpge          61
        //   11   19:aload_1         
        //   12   20:aload_0         
        //   13   21:getfield        #13  <Field MapCollections this$0>
        //   14   24:iload           4
        //   15   26:iconst_1        
        //   16   27:invokevirtual   #71  <Method Object MapCollections.colGetEntry(int, int)>
        //   17   30:invokeinterface #72  <Method boolean Collection.contains(Object)>
        //   18   35:ifeq            55
        //   19   38:aload_0         
        //   20   39:getfield        #13  <Field MapCollections this$0>
        //   21   42:iload           4
        //   22   44:invokevirtual   #66  <Method void MapCollections.colRemoveAt(int)>
        //   23   47:iinc            4  -1
        //   24   50:iinc            2  -1
        //   25   53:iconst_1        
        //   26   54:istore_3        
        //   27   55:iinc            4  1
        //   28   58:goto            13
        //   29   61:iload_3         
        //   30   62:ireturn         
        }

        public boolean retainAll(Collection collection)
        {
        //    0    0:aload_0         
        //    1    1:getfield        #13  <Field MapCollections this$0>
        //    2    4:invokevirtual   #56  <Method int MapCollections.colGetSize()>
        //    3    7:istore_2        
        //    4    8:iconst_0        
        //    5    9:istore_3        
        //    6   10:iconst_0        
        //    7   11:istore          4
        //    8   13:iload           4
        //    9   15:iload_2         
        //   10   16:icmpge          61
        //   11   19:aload_1         
        //   12   20:aload_0         
        //   13   21:getfield        #13  <Field MapCollections this$0>
        //   14   24:iload           4
        //   15   26:iconst_1        
        //   16   27:invokevirtual   #71  <Method Object MapCollections.colGetEntry(int, int)>
        //   17   30:invokeinterface #72  <Method boolean Collection.contains(Object)>
        //   18   35:ifne            55
        //   19   38:aload_0         
        //   20   39:getfield        #13  <Field MapCollections this$0>
        //   21   42:iload           4
        //   22   44:invokevirtual   #66  <Method void MapCollections.colRemoveAt(int)>
        //   23   47:iinc            4  -1
        //   24   50:iinc            2  -1
        //   25   53:iconst_1        
        //   26   54:istore_3        
        //   27   55:iinc            4  1
        //   28   58:goto            13
        //   29   61:iload_3         
        //   30   62:ireturn         
        }

        public int size()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #13  <Field MapCollections this$0>
        //    2    4:invokevirtual   #56  <Method int MapCollections.colGetSize()>
        //    3    7:ireturn         
        }

        public Object[] toArray()
        {
        //    0    0:aload_0         
        //    1    1:getfield        #13  <Field MapCollections this$0>
        //    2    4:iconst_1        
        //    3    5:invokevirtual   #80  <Method Object[] MapCollections.toArrayHelper(int)>
        //    4    8:areturn         
        }

        public Object[] toArray(Object aobj[])
        {
        //    0    0:aload_0         
        //    1    1:getfield        #13  <Field MapCollections this$0>
        //    2    4:aload_1         
        //    3    5:iconst_1        
        //    4    6:invokevirtual   #84  <Method Object[] MapCollections.toArrayHelper(Object[], int)>
        //    5    9:areturn         
        }

        final MapCollections this$0;
    }


    MapCollections()
    {
    //    0    0:aload_0         
    //    1    1:invokespecial   #18  <Method void Object()>
    //    2    4:return          
    }

    public static boolean containsAllHelper(Map map, Collection collection)
    {
    //    0    0:aload_1         
    //    1    1:invokeinterface #26  <Method Iterator Collection.iterator()>
    //    2    6:astore_2        
    //    3    7:aload_2         
    //    4    8:invokeinterface #32  <Method boolean Iterator.hasNext()>
    //    5   13:ifeq            33
    //    6   16:aload_0         
    //    7   17:aload_2         
    //    8   18:invokeinterface #36  <Method Object Iterator.next()>
    //    9   23:invokeinterface #42  <Method boolean Map.containsKey(Object)>
    //   10   28:ifne            7
    //   11   31:iconst_0        
    //   12   32:ireturn         
    //   13   33:iconst_1        
    //   14   34:ireturn         
    }

    public static boolean equalsSetHelper(Set set, Object obj)
    {
    //    0    0:iconst_1        
    //    1    1:istore_2        
    //    2    2:aload_0         
    //    3    3:aload_1         
    //    4    4:if_acmpne       13
    //    5    7:iload_2         
    //    6    8:istore          4
    //    7   10:iload           4
    //    8   12:ireturn         
    //    9   13:aload_1         
    //   10   14:instanceof      #50  <Class Set>
    //   11   17:istore_3        
    //   12   18:iconst_0        
    //   13   19:istore          4
    //   14   21:iload_3         
    //   15   22:ifeq            10
    //   16   25:aload_1         
    //   17   26:checkcast       #50  <Class Set>
    //   18   29:astore          5
    // try 31 57 handler(s) 69 73
    //   19   31:aload_0         
    //   20   32:invokeinterface #54  <Method int Set.size()>
    //   21   37:aload           5
    //   22   39:invokeinterface #54  <Method int Set.size()>
    //   23   44:icmpne          64
    //   24   47:aload_0         
    //   25   48:aload           5
    //   26   50:invokeinterface #58  <Method boolean Set.containsAll(Collection)>
    //   27   55:istore          8
    //   28   57:iload           8
    //   29   59:ifeq            64
    //   30   62:iload_2         
    //   31   63:ireturn         
    //   32   64:iconst_0        
    //   33   65:istore_2        
    //   34   66:goto            62
    // catch NullPointerException
    //   35   69:astore          7
    //   36   71:iconst_0        
    //   37   72:ireturn         
    // catch ClassCastException
    //   38   73:astore          6
    //   39   75:iconst_0        
    //   40   76:ireturn         
    }

    public static boolean removeAllHelper(Map map, Collection collection)
    {
    //    0    0:aload_0         
    //    1    1:invokeinterface #60  <Method int Map.size()>
    //    2    6:istore_2        
    //    3    7:aload_1         
    //    4    8:invokeinterface #26  <Method Iterator Collection.iterator()>
    //    5   13:astore_3        
    //    6   14:aload_3         
    //    7   15:invokeinterface #32  <Method boolean Iterator.hasNext()>
    //    8   20:ifeq            39
    //    9   23:aload_0         
    //   10   24:aload_3         
    //   11   25:invokeinterface #36  <Method Object Iterator.next()>
    //   12   30:invokeinterface #64  <Method Object Map.remove(Object)>
    //   13   35:pop             
    //   14   36:goto            14
    //   15   39:iload_2         
    //   16   40:aload_0         
    //   17   41:invokeinterface #60  <Method int Map.size()>
    //   18   46:icmpeq          51
    //   19   49:iconst_1        
    //   20   50:ireturn         
    //   21   51:iconst_0        
    //   22   52:ireturn         
    }

    public static boolean retainAllHelper(Map map, Collection collection)
    {
    //    0    0:aload_0         
    //    1    1:invokeinterface #60  <Method int Map.size()>
    //    2    6:istore_2        
    //    3    7:aload_0         
    //    4    8:invokeinterface #69  <Method Set Map.keySet()>
    //    5   13:invokeinterface #70  <Method Iterator Set.iterator()>
    //    6   18:astore_3        
    //    7   19:aload_3         
    //    8   20:invokeinterface #32  <Method boolean Iterator.hasNext()>
    //    9   25:ifeq            52
    //   10   28:aload_1         
    //   11   29:aload_3         
    //   12   30:invokeinterface #36  <Method Object Iterator.next()>
    //   13   35:invokeinterface #73  <Method boolean Collection.contains(Object)>
    //   14   40:ifne            19
    //   15   43:aload_3         
    //   16   44:invokeinterface #75  <Method void Iterator.remove()>
    //   17   49:goto            19
    //   18   52:iload_2         
    //   19   53:aload_0         
    //   20   54:invokeinterface #60  <Method int Map.size()>
    //   21   59:icmpeq          64
    //   22   62:iconst_1        
    //   23   63:ireturn         
    //   24   64:iconst_0        
    //   25   65:ireturn         
    }

    protected abstract void colClear();

    protected abstract Object colGetEntry(int i, int j);

    protected abstract Map colGetMap();

    protected abstract int colGetSize();

    protected abstract int colIndexOfKey(Object obj);

    protected abstract int colIndexOfValue(Object obj);

    protected abstract void colPut(Object obj, Object obj1);

    protected abstract void colRemoveAt(int i);

    protected abstract Object colSetValue(int i, Object obj);

    public Set getEntrySet()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #93  <Field MapCollections$EntrySet mEntrySet>
    //    2    4:ifnonnull       19
    //    3    7:aload_0         
    //    4    8:new             #95  <Class MapCollections$EntrySet>
    //    5   11:dup             
    //    6   12:aload_0         
    //    7   13:invokespecial   #98  <Method void MapCollections$EntrySet(MapCollections)>
    //    8   16:putfield        #93  <Field MapCollections$EntrySet mEntrySet>
    //    9   19:aload_0         
    //   10   20:getfield        #93  <Field MapCollections$EntrySet mEntrySet>
    //   11   23:areturn         
    }

    public Set getKeySet()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #101 <Field MapCollections$KeySet mKeySet>
    //    2    4:ifnonnull       19
    //    3    7:aload_0         
    //    4    8:new             #103 <Class MapCollections$KeySet>
    //    5   11:dup             
    //    6   12:aload_0         
    //    7   13:invokespecial   #104 <Method void MapCollections$KeySet(MapCollections)>
    //    8   16:putfield        #101 <Field MapCollections$KeySet mKeySet>
    //    9   19:aload_0         
    //   10   20:getfield        #101 <Field MapCollections$KeySet mKeySet>
    //   11   23:areturn         
    }

    public Collection getValues()
    {
    //    0    0:aload_0         
    //    1    1:getfield        #108 <Field MapCollections$ValuesCollection mValues>
    //    2    4:ifnonnull       19
    //    3    7:aload_0         
    //    4    8:new             #110 <Class MapCollections$ValuesCollection>
    //    5   11:dup             
    //    6   12:aload_0         
    //    7   13:invokespecial   #111 <Method void MapCollections$ValuesCollection(MapCollections)>
    //    8   16:putfield        #108 <Field MapCollections$ValuesCollection mValues>
    //    9   19:aload_0         
    //   10   20:getfield        #108 <Field MapCollections$ValuesCollection mValues>
    //   11   23:areturn         
    }

    public Object[] toArrayHelper(int i)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #115 <Method int colGetSize()>
    //    2    4:istore_2        
    //    3    5:iload_2         
    //    4    6:anewarray       Object[]
    //    5    9:astore_3        
    //    6   10:iconst_0        
    //    7   11:istore          4
    //    8   13:iload           4
    //    9   15:iload_2         
    //   10   16:icmpge          36
    //   11   19:aload_3         
    //   12   20:iload           4
    //   13   22:aload_0         
    //   14   23:iload           4
    //   15   25:iload_1         
    //   16   26:invokevirtual   #117 <Method Object colGetEntry(int, int)>
    //   17   29:aastore         
    //   18   30:iinc            4  1
    //   19   33:goto            13
    //   20   36:aload_3         
    //   21   37:areturn         
    }

    public Object[] toArrayHelper(Object aobj[], int i)
    {
    //    0    0:aload_0         
    //    1    1:invokevirtual   #115 <Method int colGetSize()>
    //    2    4:istore_3        
    //    3    5:aload_1         
    //    4    6:arraylength     
    //    5    7:iload_3         
    //    6    8:icmpge          29
    //    7   11:aload_1         
    //    8   12:invokevirtual   #122 <Method Class Object.getClass()>
    //    9   15:invokevirtual   #127 <Method Class Class.getComponentType()>
    //   10   18:iload_3         
    //   11   19:invokestatic    #133 <Method Object Array.newInstance(Class, int)>
    //   12   22:checkcast       #135 <Class Object[]>
    //   13   25:checkcast       #135 <Class Object[]>
    //   14   28:astore_1        
    //   15   29:iconst_0        
    //   16   30:istore          4
    //   17   32:iload           4
    //   18   34:iload_3         
    //   19   35:icmpge          55
    //   20   38:aload_1         
    //   21   39:iload           4
    //   22   41:aload_0         
    //   23   42:iload           4
    //   24   44:iload_2         
    //   25   45:invokevirtual   #117 <Method Object colGetEntry(int, int)>
    //   26   48:aastore         
    //   27   49:iinc            4  1
    //   28   52:goto            32
    //   29   55:aload_1         
    //   30   56:arraylength     
    //   31   57:iload_3         
    //   32   58:icmple          65
    //   33   61:aload_1         
    //   34   62:iload_3         
    //   35   63:aconst_null     
    //   36   64:aastore         
    //   37   65:aload_1         
    //   38   66:areturn         
    }

    EntrySet mEntrySet;
    KeySet mKeySet;
    ValuesCollection mValues;
}
