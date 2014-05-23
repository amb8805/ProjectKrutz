package com.spotify.payment.iap.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.m;

public final class GoogleIAPProceedPurchaseResponse extends Message
{
  public static final Boolean DEFAULT_SUCCESS = Boolean.valueOf(false);

  @m(a=1, b=Message.Datatype.BOOL, c=Message.Label.REQUIRED)
  public final Boolean success;

  private GoogleIAPProceedPurchaseResponse(GoogleIAPProceedPurchaseResponse.Builder paramBuilder)
  {
    super(paramBuilder);
    this.success = paramBuilder.success;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if (!(paramObject instanceof GoogleIAPProceedPurchaseResponse))
      return false;
    return a(this.success, ((GoogleIAPProceedPurchaseResponse)paramObject).success);
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    if (i != 0)
      return i;
    if (this.success != null);
    for (int j = this.success.hashCode(); ; j = 0)
    {
      this.hashCode = j;
      return j;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.payment.iap.proto.GoogleIAPProceedPurchaseResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
