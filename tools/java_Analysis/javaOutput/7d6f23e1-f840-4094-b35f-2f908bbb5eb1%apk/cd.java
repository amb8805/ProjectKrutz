public final class cd
{
  private byte[][] a = new byte[at.values().length][];
  private char[][] b = new char[dq.values().length][];

  public cd()
  {
  }

  public final void a(at paramat, byte[] paramArrayOfByte)
  {
    this.a[paramat.ordinal()] = paramArrayOfByte;
  }

  public final void a(dq paramdq, char[] paramArrayOfChar)
  {
    this.b[paramdq.ordinal()] = paramArrayOfChar;
  }

  public final char[] a(dq paramdq)
  {
    return a(paramdq, 0);
  }

  public final char[] a(dq paramdq, int paramInt)
  {
    if (dq.a(paramdq) > paramInt);
    for (int i = dq.a(paramdq); ; i = paramInt)
    {
      int j = paramdq.ordinal();
      char[] arrayOfChar = this.b[j];
      if ((arrayOfChar == null) || (arrayOfChar.length < i))
        return new char[i];
      this.b[j] = null;
      return arrayOfChar;
    }
  }
}

/* Location:
 * Qualified Name:     cd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
