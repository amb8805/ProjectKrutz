public enum cp
{
  private String n;
  private char[] o;
  private byte[] p;

  static
  {
    a = new cp("START_OBJECT", 1, "{");
    b = new cp("END_OBJECT", 2, "}");
    c = new cp("START_ARRAY", 3, "[");
    d = new cp("END_ARRAY", 4, "]");
    e = new cp("FIELD_NAME", 5, null);
    f = new cp("VALUE_EMBEDDED_OBJECT", 6, null);
    g = new cp("VALUE_STRING", 7, null);
    h = new cp("VALUE_NUMBER_INT", 8, null);
    i = new cp("VALUE_NUMBER_FLOAT", 9, null);
    j = new cp("VALUE_TRUE", 10, "true");
    k = new cp("VALUE_FALSE", 11, "false");
    l = new cp("VALUE_NULL", 12, "null");
    cp[] arrayOfcp = new cp[13];
    arrayOfcp[0] = m;
    arrayOfcp[1] = a;
    arrayOfcp[2] = b;
    arrayOfcp[3] = c;
    arrayOfcp[4] = d;
    arrayOfcp[5] = e;
    arrayOfcp[6] = f;
    arrayOfcp[7] = g;
    arrayOfcp[8] = h;
    arrayOfcp[9] = i;
    arrayOfcp[10] = j;
    arrayOfcp[11] = k;
    arrayOfcp[12] = l;
  }

  private cp(String arg3)
  {
    Object localObject;
    if (localObject == null)
    {
      this.n = null;
      this.o = null;
      this.p = null;
    }
    while (true)
    {
      return;
      this.n = localObject;
      this.o = localObject.toCharArray();
      int i2 = this.o.length;
      this.p = new byte[i2];
      for (int i3 = 0; i3 < i2; i3++)
        this.p[i3] = (byte)this.o[i3];
    }
  }

  public final String a()
  {
    return this.n;
  }

  public final byte[] b()
  {
    return this.p;
  }
}

/* Location:
 * Qualified Name:     cp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
