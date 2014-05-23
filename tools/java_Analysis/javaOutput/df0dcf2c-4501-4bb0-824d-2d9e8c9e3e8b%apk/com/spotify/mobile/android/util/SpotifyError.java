package com.spotify.mobile.android.util;

import android.content.Context;

public enum SpotifyError
{
  private int mCode;
  private int mResourceId;

  static
  {
    A = new SpotifyError("AP_BAD_SUBSTREAMSIZE", 26, 120, 2131689931);
    B = new SpotifyError("AP_GOT_TOO_LITTLE_DATA", 27, 121, 2131689931);
    C = new SpotifyError("AP_GOT_TOO_MUCH_DATA", 28, 122, 2131689931);
    D = new SpotifyError("AP_BLOCK_IDX_MISMATCH", 29, 123, 2131689931);
    E = new SpotifyError("AP_BLOCK_IDX_TOOLARGE", 30, 124, 2131689931);
    F = new SpotifyError("AP_BAD_MASK", 31, 125, 2131689931);
    G = new SpotifyError("AP_NETWORK_DISABLED", 32, 126, 2131689931);
    H = new SpotifyError("AP_PASSWORD_CHANGED", 33, 127, 2131689931);
    I = new SpotifyError("LOGIN_USERPASS", 34, 401, 2131689935);
    J = new SpotifyError("LOGIN_TOO_OLD", 35, 402, 2131689941);
    K = new SpotifyError("LOGIN_USER_DISABLED", 36, 403, 2131689943);
    L = new SpotifyError("LOGIN_TEMP_APERROR", 37, 404, 2131689931);
    M = new SpotifyError("LOGIN_PROTOCOL", 38, 405, 2131689939);
    N = new SpotifyError("LOGIN_FORBIDDEN_SERVICE", 39, 406, 2131689936);
    O = new SpotifyError("LOGIN_MISSING_USER_INFO", 40, 407, 2131689937);
    P = new SpotifyError("LOGIN_REGION_MISMATCH", 41, 408, 2131689940);
    Q = new SpotifyError("LOGIN_NEEDS_PREMIUM", 42, 409, 2131689938);
    R = new SpotifyError("LOGIN_BAD_CREDENTIALS", 43, 410, 2131689935);
    S = new SpotifyError("LOGIN_BAD_CONNECTION_ID", 44, 411, 2131689931);
    T = new SpotifyError("LOGIN_INVALID_CREDENTIALS", 45, 412, 2131689931);
    U = new SpotifyError("LOGIN_UNKNOWN_ERROR", 46, 417, 2131689942);
    V = new SpotifyError("UNKNOWN", 47, -1, 2131689951);
    SpotifyError[] arrayOfSpotifyError = new SpotifyError[48];
    arrayOfSpotifyError[0] = a;
    arrayOfSpotifyError[1] = b;
    arrayOfSpotifyError[2] = c;
    arrayOfSpotifyError[3] = d;
    arrayOfSpotifyError[4] = e;
    arrayOfSpotifyError[5] = f;
    arrayOfSpotifyError[6] = g;
    arrayOfSpotifyError[7] = h;
    arrayOfSpotifyError[8] = i;
    arrayOfSpotifyError[9] = j;
    arrayOfSpotifyError[10] = k;
    arrayOfSpotifyError[11] = l;
    arrayOfSpotifyError[12] = m;
    arrayOfSpotifyError[13] = n;
    arrayOfSpotifyError[14] = o;
    arrayOfSpotifyError[15] = p;
    arrayOfSpotifyError[16] = q;
    arrayOfSpotifyError[17] = r;
    arrayOfSpotifyError[18] = s;
    arrayOfSpotifyError[19] = t;
    arrayOfSpotifyError[20] = u;
    arrayOfSpotifyError[21] = v;
    arrayOfSpotifyError[22] = w;
    arrayOfSpotifyError[23] = x;
    arrayOfSpotifyError[24] = y;
    arrayOfSpotifyError[25] = z;
    arrayOfSpotifyError[26] = A;
    arrayOfSpotifyError[27] = B;
    arrayOfSpotifyError[28] = C;
    arrayOfSpotifyError[29] = D;
    arrayOfSpotifyError[30] = E;
    arrayOfSpotifyError[31] = F;
    arrayOfSpotifyError[32] = G;
    arrayOfSpotifyError[33] = H;
    arrayOfSpotifyError[34] = I;
    arrayOfSpotifyError[35] = J;
    arrayOfSpotifyError[36] = K;
    arrayOfSpotifyError[37] = L;
    arrayOfSpotifyError[38] = M;
    arrayOfSpotifyError[39] = N;
    arrayOfSpotifyError[40] = O;
    arrayOfSpotifyError[41] = P;
    arrayOfSpotifyError[42] = Q;
    arrayOfSpotifyError[43] = R;
    arrayOfSpotifyError[44] = S;
    arrayOfSpotifyError[45] = T;
    arrayOfSpotifyError[46] = U;
    arrayOfSpotifyError[47] = V;
  }

  private SpotifyError(int paramInt1, int paramInt2)
  {
    this.mCode = paramInt1;
    this.mResourceId = paramInt2;
  }

  public static SpotifyError a(int paramInt)
  {
    for (SpotifyError localSpotifyError : values())
      if (localSpotifyError.mCode == paramInt)
        return localSpotifyError;
    Assertion.a("Have no definition for errorcode " + paramInt);
    return V;
  }

  public final int a()
  {
    return this.mCode;
  }

  public final String a(Context paramContext)
  {
    return paramContext.getString(this.mResourceId);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.SpotifyError
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
