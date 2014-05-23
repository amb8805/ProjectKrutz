package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.a;
import com.google.android.gms.plus.b;

final class bd extends az
{
  private final b b;

  public bd(bc parambc, b paramb)
  {
    this.b = paramb;
  }

  public final void a(int paramInt, Bundle paramBundle, ParcelFileDescriptor paramParcelFileDescriptor)
  {
    PendingIntent localPendingIntent = null;
    if (paramBundle != null)
      localPendingIntent = (PendingIntent)paramBundle.getParcelable("pendingIntent");
    a locala = new a(paramInt, localPendingIntent);
    this.a.a(new be(this.a, this.b, locala, paramParcelFileDescriptor));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.bd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
