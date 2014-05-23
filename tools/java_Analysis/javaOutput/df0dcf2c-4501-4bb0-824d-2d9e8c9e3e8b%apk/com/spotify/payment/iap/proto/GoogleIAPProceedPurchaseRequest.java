package com.spotify.payment.iap.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.m;

public final class GoogleIAPProceedPurchaseRequest extends Message
{
  public static final String DEFAULT_DATA_SIGNATURE = "";
  public static final String DEFAULT_PURCHASE_DATA = "";
  public static final Integer DEFAULT_RESPONSE_CODE = Integer.valueOf(0);

  @m(a=3, b=Message.Datatype.STRING, c=Message.Label.REQUIRED)
  public final String data_signature;

  @m(a=2, b=Message.Datatype.STRING, c=Message.Label.REQUIRED)
  public final String purchase_data;

  @m(a=1, b=Message.Datatype.INT32, c=Message.Label.REQUIRED)
  public final Integer response_code;

  private GoogleIAPProceedPurchaseRequest(GoogleIAPProceedPurchaseRequest.Builder paramBuilder)
  {
    super(paramBuilder);
    this.response_code = paramBuilder.response_code;
    this.purchase_data = paramBuilder.purchase_data;
    this.data_signature = paramBuilder.data_signature;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    GoogleIAPProceedPurchaseRequest localGoogleIAPProceedPurchaseRequest;
    do
    {
      return true;
      if (!(paramObject instanceof GoogleIAPProceedPurchaseRequest))
        return false;
      localGoogleIAPProceedPurchaseRequest = (GoogleIAPProceedPurchaseRequest)paramObject;
    }
    while ((a(this.response_code, localGoogleIAPProceedPurchaseRequest.response_code)) && (a(this.purchase_data, localGoogleIAPProceedPurchaseRequest.purchase_data)) && (a(this.data_signature, localGoogleIAPProceedPurchaseRequest.data_signature)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int k;
    if (i == 0)
    {
      if (this.response_code == null)
        break label90;
      j = this.response_code.hashCode();
      k = j * 37;
      if (this.purchase_data == null)
        break label95;
    }
    label90: label95: for (int m = this.purchase_data.hashCode(); ; m = 0)
    {
      int n = 37 * (m + k);
      String str = this.data_signature;
      int i1 = 0;
      if (str != null)
        i1 = this.data_signature.hashCode();
      i = n + i1;
      this.hashCode = i;
      return i;
      j = 0;
      break;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.payment.iap.proto.GoogleIAPProceedPurchaseRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
