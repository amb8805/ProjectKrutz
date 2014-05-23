package com.fasterxml.jackson.databind.util;

public abstract class NameTransformer
{
  public static final NameTransformer NOP = new NameTransformer.1();

  protected NameTransformer()
  {
  }

  public static NameTransformer chainedTransformer(NameTransformer paramNameTransformer1, NameTransformer paramNameTransformer2)
  {
    return new NameTransformer.Chained(paramNameTransformer1, paramNameTransformer2);
  }

  public static NameTransformer simpleTransformer(String paramString1, String paramString2)
  {
    int i = 1;
    int j;
    if ((paramString1 != null) && (paramString1.length() > 0))
    {
      j = i;
      if ((paramString2 == null) || (paramString2.length() <= 0))
        break label49;
    }
    while (true)
      if (j != 0)
      {
        if (i != 0)
        {
          return new NameTransformer.2(paramString1, paramString2);
          j = 0;
          break;
          label49: i = 0;
          continue;
        }
        return new NameTransformer.3(paramString1);
      }
    if (i != 0)
      return new NameTransformer.4(paramString2);
    return NOP;
  }

  public abstract String transform(String paramString);
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.util.NameTransformer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
