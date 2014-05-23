package android.support.v4.content;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

public final class c extends a<Cursor>
{
  final k<Cursor>.l f = new l(this);
  Uri g;
  String[] h;
  String i;
  String[] j;
  String k;
  Cursor l;

  public c(Context paramContext, Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    super(paramContext);
    this.g = paramUri;
    this.h = paramArrayOfString1;
    this.i = paramString1;
    this.j = paramArrayOfString2;
    this.k = paramString2;
  }

  private void a(Cursor paramCursor)
  {
    if (this.r)
      if (paramCursor != null)
        paramCursor.close();
    Cursor localCursor;
    do
    {
      return;
      localCursor = this.l;
      this.l = paramCursor;
      if (this.p)
        super.b(paramCursor);
    }
    while ((localCursor == null) || (localCursor == paramCursor) || (localCursor.isClosed()));
    localCursor.close();
  }

  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mUri=");
    paramPrintWriter.println(this.g);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mProjection=");
    paramPrintWriter.println(Arrays.toString(this.h));
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mSelection=");
    paramPrintWriter.println(this.i);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mSelectionArgs=");
    paramPrintWriter.println(Arrays.toString(this.j));
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mSortOrder=");
    paramPrintWriter.println(this.k);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mCursor=");
    paramPrintWriter.println(this.l);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mContentChanged=");
    paramPrintWriter.println(this.s);
  }

  protected final void e()
  {
    if (this.l != null)
      a(this.l);
    boolean bool = this.s;
    this.s = false;
    this.t = (bool | this.t);
    if ((bool) || (this.l == null))
      j();
  }

  protected final void f()
  {
    b();
  }

  protected final void g()
  {
    super.g();
    b();
    if ((this.l != null) && (!this.l.isClosed()))
      this.l.close();
    this.l = null;
  }
}

/* Location:
 * Qualified Name:     android.support.v4.content.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
