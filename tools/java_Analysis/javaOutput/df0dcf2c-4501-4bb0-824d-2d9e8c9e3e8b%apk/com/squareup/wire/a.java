package com.squareup.wire;

import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.List;

final class a<B extends h>
{
  private static final int a = 8;
  private static final Comparator<Field> b = new a.1();
  private final List<Field> c;

  // ERROR //
  public a(java.lang.Class<B> paramClass)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 30	java/lang/Object:<init>	()V
    //   4: aload_0
    //   5: new 32	java/util/ArrayList
    //   8: dup
    //   9: invokespecial 33	java/util/ArrayList:<init>	()V
    //   12: putfield 35	com/squareup/wire/a:c	Ljava/util/List;
    //   15: aload_1
    //   16: invokevirtual 41	java/lang/Class:getName	()Ljava/lang/String;
    //   19: astore_2
    //   20: aload_2
    //   21: iconst_0
    //   22: aload_2
    //   23: invokevirtual 47	java/lang/String:length	()I
    //   26: getstatic 17	com/squareup/wire/a:a	I
    //   29: isub
    //   30: invokevirtual 51	java/lang/String:substring	(II)Ljava/lang/String;
    //   33: astore_3
    //   34: aload_3
    //   35: invokestatic 55	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   38: astore 5
    //   40: aload 5
    //   42: invokevirtual 59	java/lang/Class:getDeclaredFields	()[Ljava/lang/reflect/Field;
    //   45: astore 6
    //   47: aload 6
    //   49: arraylength
    //   50: istore 7
    //   52: iconst_0
    //   53: istore 8
    //   55: iload 8
    //   57: iload 7
    //   59: if_icmpge +121 -> 180
    //   62: aload 6
    //   64: iload 8
    //   66: aaload
    //   67: astore 9
    //   69: aload 9
    //   71: ldc 61
    //   73: invokevirtual 67	java/lang/reflect/Field:getAnnotation	(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    //   76: checkcast 61	com/squareup/wire/m
    //   79: astore 10
    //   81: aload 10
    //   83: ifnull +35 -> 118
    //   86: aload 10
    //   88: invokeinterface 70 1 0
    //   93: getstatic 76	com/squareup/wire/Message$Label:REQUIRED	Lcom/squareup/wire/Message$Label;
    //   96: if_acmpne +22 -> 118
    //   99: aload_0
    //   100: getfield 35	com/squareup/wire/a:c	Ljava/util/List;
    //   103: aload_1
    //   104: aload 9
    //   106: invokevirtual 77	java/lang/reflect/Field:getName	()Ljava/lang/String;
    //   109: invokevirtual 81	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   112: invokeinterface 87 2 0
    //   117: pop
    //   118: iinc 8 1
    //   121: goto -66 -> 55
    //   124: astore 4
    //   126: new 89	java/lang/AssertionError
    //   129: dup
    //   130: new 91	java/lang/StringBuilder
    //   133: dup
    //   134: ldc 93
    //   136: invokespecial 96	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   139: aload_2
    //   140: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: invokevirtual 103	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   146: invokespecial 106	java/lang/AssertionError:<init>	(Ljava/lang/Object;)V
    //   149: athrow
    //   150: astore 11
    //   152: new 89	java/lang/AssertionError
    //   155: dup
    //   156: new 91	java/lang/StringBuilder
    //   159: dup
    //   160: ldc 108
    //   162: invokespecial 96	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   165: aload 9
    //   167: invokevirtual 77	java/lang/reflect/Field:getName	()Ljava/lang/String;
    //   170: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: invokevirtual 103	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   176: invokespecial 106	java/lang/AssertionError:<init>	(Ljava/lang/Object;)V
    //   179: athrow
    //   180: aload_0
    //   181: getfield 35	com/squareup/wire/a:c	Ljava/util/List;
    //   184: getstatic 24	com/squareup/wire/a:b	Ljava/util/Comparator;
    //   187: invokestatic 114	java/util/Collections:sort	(Ljava/util/List;Ljava/util/Comparator;)V
    //   190: return
    //
    // Exception table:
    //   from	to	target	type
    //   34	40	124	java/lang/ClassNotFoundException
    //   99	118	150	java/lang/NoSuchFieldException
  }

  public final <B extends h> void a(B paramB)
  {
    Object localObject1 = null;
    Object localObject2 = "";
    try
    {
      int i = this.c.size();
      j = 0;
      if (j < i)
      {
        localField = (Field)this.c.get(j);
        if (localField.get(paramB) == null)
        {
          if (localObject1 != null)
            break label151;
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append("\n  ");
          ((StringBuilder)localObject1).append(localField.getName());
        }
      }
      else if (localObject1 != null)
      {
        throw new IllegalStateException("Required field" + (java.lang.String)localObject2 + " not set:" + localObject1);
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new AssertionError("Unable to access required fields");
    }
    while (true)
    {
      int j;
      Field localField;
      return;
      Object localObject3 = localObject2;
      Object localObject4 = localObject1;
      j++;
      localObject1 = localObject4;
      localObject2 = localObject3;
      continue;
      label151: localObject2 = "s";
    }
  }
}

/* Location:
 * Qualified Name:     com.squareup.wire.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
