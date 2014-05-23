package com.spotify.mobile.android.util;

public final class cq
{
  // ERROR //
  public static java.lang.String a(java.lang.String paramString)
  {
    // Byte code:
    //   0: ldc 12
    //   2: invokestatic 18	java/security/MessageDigest:getInstance	(Ljava/lang/String;)Ljava/security/MessageDigest;
    //   5: astore_2
    //   6: aload_0
    //   7: ldc 20
    //   9: invokevirtual 26	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   12: astore 4
    //   14: aload_2
    //   15: aload 4
    //   17: invokevirtual 30	java/security/MessageDigest:update	([B)V
    //   20: aload_2
    //   21: invokevirtual 34	java/security/MessageDigest:digest	()[B
    //   24: astore 5
    //   26: new 36	java/lang/StringBuilder
    //   29: dup
    //   30: invokespecial 40	java/lang/StringBuilder:<init>	()V
    //   33: astore 6
    //   35: aload 5
    //   37: arraylength
    //   38: istore 7
    //   40: iconst_0
    //   41: istore 8
    //   43: iload 8
    //   45: iload 7
    //   47: if_icmpge +68 -> 115
    //   50: sipush 255
    //   53: aload 5
    //   55: iload 8
    //   57: baload
    //   58: iand
    //   59: istore 9
    //   61: iload 9
    //   63: bipush 16
    //   65: if_icmpge +11 -> 76
    //   68: aload 6
    //   70: bipush 48
    //   72: invokevirtual 44	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   75: pop
    //   76: aload 6
    //   78: iload 9
    //   80: invokestatic 50	java/lang/Integer:toHexString	(I)Ljava/lang/String;
    //   83: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: pop
    //   87: iinc 8 1
    //   90: goto -47 -> 43
    //   93: astore_1
    //   94: new 55	java/lang/AssertionError
    //   97: dup
    //   98: ldc 57
    //   100: invokespecial 60	java/lang/AssertionError:<init>	(Ljava/lang/Object;)V
    //   103: athrow
    //   104: astore_3
    //   105: new 55	java/lang/AssertionError
    //   108: dup
    //   109: ldc 62
    //   111: invokespecial 60	java/lang/AssertionError:<init>	(Ljava/lang/Object;)V
    //   114: athrow
    //   115: aload 6
    //   117: invokevirtual 66	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   120: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   0	6	93	java/security/NoSuchAlgorithmException
    //   6	14	104	java/io/UnsupportedEncodingException
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.cq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
