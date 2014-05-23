package com.google.android.gms.common;

import [[B;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Base64;

public final class e
{
  public static boolean a = false;
  public static boolean b = false;
  static boolean c = false;
  private static final byte[][] d;
  private static final byte[][] e;
  private static final byte[][] f;
  private static final byte[][] g;
  private static final byte[][] h;

  static
  {
    byte[][] arrayOfByte1 = new byte[2][];
    arrayOfByte1[0] = Base64.decode("MIIEQzCCAyugAwIBAgIJAMLgh0ZkSjCNMA0GCSqGSIb3DQEBBAUAMHQxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpDYWxpZm9ybmlhMRYwFAYDVQQHEw1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKEwtHb29nbGUgSW5jLjEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDAeFw0wODA4MjEyMzEzMzRaFw0zNjAxMDcyMzEzMzRaMHQxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpDYWxpZm9ybmlhMRYwFAYDVQQHEw1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKEwtHb29nbGUgSW5jLjEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDCCASAwDQYJKoZIhvcNAQEBBQADggENADCCAQgCggEBAKtWLgDYO6IIrgqWbxJOKdoR8qtW0I9Y4sypEwPpt1TTcvZApxsdyxMJZ2JORland2qSGT2y5b+3JKkedxiLDmpHpDsz2WCbdxgxRczfey5YZnTJ4VZbH0xqWVW/8lGmPav5xVwnIiJS6HXk+BVKZF+JcWjAsb/GEuq/eFdpuzSqeYTcfi6idkyugwfYwXFU1+5fZKUaRKYCwkkFQVfcAs1fXA5V+++FGfvjJ/CxURaSxaBvGdGDhfXE28LWuT9ozCl5xw4Yq5OGazvV24mZVSoOO0yZ31j7kYvtwYK6NeADwbSxDdJEqO4k//0zOHKrUiGYXtqw/A0LFFtqoZKFjnkCAQOjgdkwgdYwHQYDVR0OBBYEFMd9jMIhF1Ylmn/Tgt9r45jk14alMIGmBgNVHSMEgZ4wgZuAFMd9jMIhF1Ylmn/Tgt9r45jk14aloXikdjB0MQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEUMBIGA1UEChMLR29vZ2xlIEluYy4xEDAOBgNVBAsTB0FuZHJvaWQxEDAOBgNVBAMTB0FuZHJvaWSCCQDC4IdGZEowjTAMBgNVHRMEBTADAQH/MA0GCSqGSIb3DQEBBAUAA4IBAQBt0lLO74UwLDYKqs6Tm8/yzKkEu116FmH4rkaymUIE0P9KaMftGlMexFlaYjzmB2OxZyl6euNXEsQH8gjwyxCUKRJNexBiGcCEyj6z+a1fuHHvkiaai+KL8W1EyNmgjmyy8AW7P+LLlkR+ho5zEHatRbM/YAnqGcFh5iZBqpknHf1SKMXFh4dd239FJ1jWYfbMDMy3NS5CTMQ2XFI1MvcyUTdZPErjQfTbQe3aDQsQcafEQPD+nqActifKZ0Np0IS9L9kR/wbNvyz6ENwPiTrjV2KRkEjH78ZMcUQXg0L3BYHJ3lc69Vs5Ddf9uUGGMYldX3WfMBEmh/9iFBDAaTCK", 0);
    arrayOfByte1[1] = Base64.decode("MIIEqDCCA5CgAwIBAgIJANWFuGx90071MA0GCSqGSIb3DQEBBAUAMIGUMQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEQMA4GA1UEChMHQW5kcm9pZDEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDEiMCAGCSqGSIb3DQEJARYTYW5kcm9pZEBhbmRyb2lkLmNvbTAeFw0wODA0MTUyMzM2NTZaFw0zNTA5MDEyMzM2NTZaMIGUMQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEQMA4GA1UEChMHQW5kcm9pZDEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDEiMCAGCSqGSIb3DQEJARYTYW5kcm9pZEBhbmRyb2lkLmNvbTCCASAwDQYJKoZIhvcNAQEBBQADggENADCCAQgCggEBANbOLggKv+IxTdGNs8/TGFy0PTP6DHThvbbR24kT9ixcOd9W+EaBPWW+wPPKQmsHxajtWjmQwWfna8mZuSeJS48LIgAZlKkpFeVyxW0qMBujb8X8ETrWy550NaFtI6t9+u7hZeTfHwqNvacKhp1RbE6dBRGWynwMVX8XW8N1+UjFaq6GCJukT4qmpN2afb8sCjUigq0GuMwYXrFVee74bQgLHWGJwPmvmLHC69EH6kWr22ijx4OKXlSIx2xT1AsSHee70w5iDBiK4aph27yH3TxkXy9V89TDdexAcKk/cVHYNnDBapcavl7y0RiQ4biu8ymM8Ga/nmzhRKya6G0cGw8CAQOjgfwwgfkwHQYDVR0OBBYEFI0cxb6VTEM8YYY6FbBMvAPyT+CyMIHJBgNVHSMEgcEwgb6AFI0cxb6VTEM8YYY6FbBMvAPyT+CyoYGapIGXMIGUMQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEQMA4GA1UEChMHQW5kcm9pZDEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDEiMCAGCSqGSIb3DQEJARYTYW5kcm9pZEBhbmRyb2lkLmNvbYIJANWFuGx90071MAwGA1UdEwQFMAMBAf8wDQYJKoZIhvcNAQEEBQADggEBABnTDPEF+3iSP0wNfdIjIz1AlnrPzgAIHVvXxunW7SBrDhEglQZBbKJEk5kT0mtKoOD1JMrSu1xuTKEBahWRbqHsXclaXjoBADb0kkjVEJu/Lh5hgYZnOjvlba8Ld7HCKePCVePoTJBdI4fvugnL8TsgK05aIskyY0hKI9L8KfqfGTl1lzOv2KoWD0KWwtAWPoGChZxmQ+nBli+gwYMzM1vAkP+aayLe0a1EQimlOalO762r0GXO0ks+UeXde2Z4e+8S/pf7pITEI/tP+MxJTALw9QUWEv9lKTk+jkbqxbsh8nfBUapfKqYn0eidpwq2AzVp3juYl7//fKnaPhJD9gs=", 0);
    d = arrayOfByte1;
    byte[][] arrayOfByte2 = new byte[2][];
    arrayOfByte2[0] = Base64.decode("MIICUjCCAbsCBEk0mH4wDQYJKoZIhvcNAQEEBQAwcDELMAkGA1UEBhMCVVMxCzAJBgNVBAgTAkNBMRYwFAYDVQQHEw1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKEwtHb29nbGUsIEluYzEUMBIGA1UECxMLR29vZ2xlLCBJbmMxEDAOBgNVBAMTB1Vua25vd24wHhcNMDgxMjAyMDIwNzU4WhcNMzYwNDE5MDIwNzU4WjBwMQswCQYDVQQGEwJVUzELMAkGA1UECBMCQ0ExFjAUBgNVBAcTDU1vdW50YWluIFZpZXcxFDASBgNVBAoTC0dvb2dsZSwgSW5jMRQwEgYDVQQLEwtHb29nbGUsIEluYzEQMA4GA1UEAxMHVW5rbm93bjCBnzANBgkqhkiG9w0BAQEFAAOBjQAwgYkCgYEAn0gDGZD5sUcmOE4EU9GPjAu/jcd7JQSksSB8TGxEurwArcZhD6a2qy2oDjPy7vFrJqP2uFua+sqQn/u+s/TJT36BIqeY4OunXO090in6c2X0FRZBWqnBYX3Vg84Zuuigu9iF/BeptL0mQIBRIarbk3fetAATOBQYiC7FIoL8WA0CAwEAATANBgkqhkiG9w0BAQQFAAOBgQBAhmae1jHaQ4Td0GHSJuBzuYzEuZ34teS+njy+l1Aeg98cb6lZwM5gXE/SrG0chM7eIEdsurGb6PIgOv93F61lLY/MiQcI0SFtqERXWSZJ4OnTxLtM9Y2hnbHU/EG8uVhPZOZfQQ0FKf1baIOMFB0Km9HbEZHLKg33kOoMsS2zpA==", 0);
    arrayOfByte2[1] = Base64.decode("MIIEqDCCA5CgAwIBAgIJAIR+T/LWtd6OMA0GCSqGSIb3DQEBBQUAMIGUMQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEQMA4GA1UEChMHQW5kcm9pZDEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDEiMCAGCSqGSIb3DQEJARYTYW5kcm9pZEBhbmRyb2lkLmNvbTAeFw0xMDAxMjAwMTAxMzVaFw0zNzA2MDcwMTAxMzVaMIGUMQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEQMA4GA1UEChMHQW5kcm9pZDEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDEiMCAGCSqGSIb3DQEJARYTYW5kcm9pZEBhbmRyb2lkLmNvbTCCASAwDQYJKoZIhvcNAQEBBQADggENADCCAQgCggEBANgocXw20RcP1E0Kew8HESboW7/fM7A0YABalMz7ZaXboLJD32Cxkb+dBt8dilwKM+LRY/UT3x0iU0HqPDN5IuhcAuw0ztlMuAcjpiP/S6/7tOXv5nc7PqK+uLyyAmfP54VRH4Mu+YerdZT+HinPvE0IOh8SUgB3c5byFltpewCjoME6zDCKk/IhY8FunD1KshSfNkxFwEMUMnA58doJYJPxs/wYtlYQlcYiX8cQK5h8bxOkXSTj4MVOhZ1n41tnCCcT0tbwV900V9GfxP6N3eyMOk8/lyMFGacKKDY0rDWBo0q9oX2EWgoJhfv4BgsDaid4YIFj+gw3uefyoQ52vHcCAQOjgfwwgfkwHQYDVR0OBBYEFLXH+RJveA06+8plc3M/9SJrmxc3MIHJBgNVHSMEgcEwgb6AFLXH+RJveA06+8plc3M/9SJrmxc3oYGapIGXMIGUMQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEQMA4GA1UEChMHQW5kcm9pZDEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDEiMCAGCSqGSIb3DQEJARYTYW5kcm9pZEBhbmRyb2lkLmNvbYIJAIR+T/LWtd6OMAwGA1UdEwQFMAMBAf8wDQYJKoZIhvcNAQEFBQADggEBAEw+p2V9Jua71xEMjxnfH42hCX0zhg9p3r/K20ajfoflsw+7NHscdVW8uzyZVBSARpZfnHkqAtDb5aZHYbN5R6tr/7C6xqLBoM34Yvh3qWcN/W8GLkBuzhgGDGBJjfw2nycRcZjlb8uhUuYFjc6UzlkfxPSpmCszutgZbXdvVbfQGs8x3dcM7LeJeHYGZRD5SaVSSjExs8tlQc+LNUIOvMRSJVmWP0JmaQVyZmJPs5jP21IXiB0RHG4DRhb4USEY0KKmnRPXkvDNEdvVjiODWlSlSsJR59IsRGo/7hQSEOlER0tAYwe7JoQrT2vTVYIcc5ZR/6JgWwXiJJXXFdh6kfY=", 0);
    e = arrayOfByte2;
    byte[][] arrayOfByte3 = new byte[1][];
    arrayOfByte3[0] = Base64.decode("MIICpzCCAmWgAwIBAgIEUAV8QjALBgcqhkjOOAQDBQAwNzELMAkGA1UEBhMCVVMxEDAOBgNVBAoTB0FuZHJvaWQxFjAUBgNVBAMTDUFuZHJvaWQgRGVidWcwHhcNMTIwNzE3MTQ1MjUwWhcNMjIwNzE1MTQ1MjUwWjA3MQswCQYDVQQGEwJVUzEQMA4GA1UEChMHQW5kcm9pZDEWMBQGA1UEAxMNQW5kcm9pZCBEZWJ1ZzCCAbcwggEsBgcqhkjOOAQBMIIBHwKBgQD9f1OBHXUSKVLfSpwu7OTn9hG3UjzvRADDHj+AtlEmaUVdQCJR+1k9jVj6v8X1ujD2y5tVbNeBO4AdNG/yZmC3a5lQpaSfn+gEexAiwk+7qdf+t8Yb+DtX58aophUPBPuD9tPFHsMCNVQTWhaRMvZ1864rYdcq7/IiAxmd0UgBxwIVAJdgUI8VIwvMspK5gqLrhAvwWBz1AoGBAPfhoIXWmz3ey7yrXDa4V7l5lK+7+jrqgvlXTAs9B4JnUVlXjrrUWU/mcQcQgYC0SRZxI+hMKBYTt88JMozIpuE8FnqLVHyNKOCjrh4rs6Z1kW6jfwv6ITVi8ftiegEkO8yk8b6oUZCJqIPf4VrlnwaSi2ZegHtVJWQBTDv+z0kqA4GEAAKBgGrRG9fVZtJ69DnALkForP1FtL6FvJmMe5uOHHdUaT+MDUKKpPzhEISBOEJPpozRMFJO7/bxNzhjgi+mNymL/k1GoLhmZe7wQRc5AQNbHIBqoxgYDTA6qMyeWSPgam+r+nVoPEU7sgd3fPL958+xmxQwOBSqHfe0PVsiK1cGtIuUMAsGByqGSM44BAMFAAMvADAsAhQJ0tGwRwIptb7SkCZh0RLycMXmHQIUZ1ACBqeAULp4rscXTxYEf4Tqovc=", 0);
    f = arrayOfByte3;
    byte[][][] arrayOfByte = new byte[3][][];
    arrayOfByte[0] = d;
    arrayOfByte[1] = e;
    arrayOfByte[2] = f;
    int i = 0;
    int j = 0;
    while (i < 3)
    {
      j += arrayOfByte[i].length;
      i++;
    }
    byte[][] arrayOfByte4 = new byte[j][];
    int k = 0;
    int n;
    for (int m = 0; k < 3; m = n)
    {
      [[B local[[B = arrayOfByte[k];
      n = m;
      int i1 = 0;
      while (i1 < local[[B.length)
      {
        int i2 = n + 1;
        arrayOfByte4[n] = local[[B[i1];
        i1++;
        n = i2;
      }
      k++;
    }
    g = arrayOfByte4;
    byte[][] arrayOfByte5 = new byte[1][];
    arrayOfByte5[0] = Base64.decode("MIICXzCCAcigAwIBAgIESxmxnTANBgkqhkiG9w0BAQUFADB0MQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEVMBMGA1UEChMMR29vZ2xlLCBJbmMuMRAwDgYDVQQLEwdVbmtub3duMQ8wDQYDVQQDEwZCYXphYXIwHhcNMDkxMjA1MDEwNDI5WhcNMzcwNDIyMDEwNDI5WjB0MQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEVMBMGA1UEChMMR29vZ2xlLCBJbmMuMRAwDgYDVQQLEwdVbmtub3duMQ8wDQYDVQQDEwZCYXphYXIwgZ8wDQYJKoZIhvcNAQEBBQADgY0AMIGJAoGBAKkIiN6W4zU0dwndSyUeeimoRzdrLly6W1vVBD6DiAECmBkUlBP6M6rlRDsDU0rOSq1vUJcSSdmOdqOafkzM4dcbp74+dWdNtfEHWphzcAFGSKfOcDwtx4g0iQWSEq+cbFsoq9VPg2QRyDGin1APKALRbObRhW+GcKr8omVBg3s5AgMBAAEwDQYJKoZIhvcNAQEFBQADgYEASYTG80FHASNiOidP6eE3PXUxzA386adq5n/7cFtATL0bwRaMqxi7EcN4lb+082zBTOwdLMVRag7O1AdOtWiCiVBkAK/43MjvVAQSAv3v8f2C4PMjEHL9zN5KNovgxsP5uLOqDWg8Or/amre7iDLpvl42GbqS3TrMA2qttaYZr1A=", 0);
    h = arrayOfByte5;
  }

  // ERROR //
  public static int a(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 64	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   4: astore_1
    //   5: aload_0
    //   6: invokevirtual 68	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   9: getstatic 73	com/google/android/gms/d:a	I
    //   12: invokevirtual 79	android/content/res/Resources:getString	(I)Ljava/lang/String;
    //   15: pop
    //   16: aload_1
    //   17: ldc 81
    //   19: bipush 64
    //   21: invokevirtual 87	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   24: astore 6
    //   26: aload 6
    //   28: getstatic 30	com/google/android/gms/common/e:d	[[B
    //   31: invokestatic 90	com/google/android/gms/common/e:a	(Landroid/content/pm/PackageInfo;[[B)[B
    //   34: astore 7
    //   36: aload 7
    //   38: ifnonnull +39 -> 77
    //   41: ldc 92
    //   43: ldc 94
    //   45: invokestatic 100	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   48: pop
    //   49: bipush 9
    //   51: ireturn
    //   52: astore_2
    //   53: ldc 92
    //   55: ldc 102
    //   57: invokestatic 104	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   60: pop
    //   61: goto -45 -> 16
    //   64: astore 4
    //   66: ldc 92
    //   68: ldc 106
    //   70: invokestatic 100	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   73: pop
    //   74: bipush 9
    //   76: ireturn
    //   77: aload_1
    //   78: ldc 108
    //   80: bipush 64
    //   82: invokevirtual 87	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   85: astore 10
    //   87: aload 10
    //   89: iconst_1
    //   90: anewarray 18	[B
    //   93: dup
    //   94: iconst_0
    //   95: aload 7
    //   97: aastore
    //   98: invokestatic 90	com/google/android/gms/common/e:a	(Landroid/content/pm/PackageInfo;[[B)[B
    //   101: ifnonnull +26 -> 127
    //   104: ldc 92
    //   106: ldc 110
    //   108: invokestatic 100	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   111: pop
    //   112: bipush 9
    //   114: ireturn
    //   115: astore 8
    //   117: ldc 92
    //   119: ldc 112
    //   121: invokestatic 100	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   124: pop
    //   125: iconst_1
    //   126: ireturn
    //   127: aload 10
    //   129: getfield 117	android/content/pm/PackageInfo:versionCode	I
    //   132: ldc 118
    //   134: if_icmpge +31 -> 165
    //   137: ldc 92
    //   139: new 120	java/lang/StringBuilder
    //   142: dup
    //   143: ldc 122
    //   145: invokespecial 126	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   148: aload 10
    //   150: getfield 117	android/content/pm/PackageInfo:versionCode	I
    //   153: invokevirtual 130	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   156: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   159: invokestatic 100	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   162: pop
    //   163: iconst_2
    //   164: ireturn
    //   165: aload_1
    //   166: ldc 108
    //   168: iconst_0
    //   169: invokevirtual 138	android/content/pm/PackageManager:getApplicationInfo	(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   172: astore 13
    //   174: aload 13
    //   176: getfield 143	android/content/pm/ApplicationInfo:enabled	Z
    //   179: ifne +22 -> 201
    //   182: iconst_3
    //   183: ireturn
    //   184: astore 11
    //   186: ldc 92
    //   188: ldc 145
    //   190: invokestatic 148	android/util/Log:wtf	(Ljava/lang/String;Ljava/lang/String;)I
    //   193: pop
    //   194: aload 11
    //   196: invokevirtual 151	android/content/pm/PackageManager$NameNotFoundException:printStackTrace	()V
    //   199: iconst_1
    //   200: ireturn
    //   201: iconst_0
    //   202: ireturn
    //
    // Exception table:
    //   from	to	target	type
    //   5	16	52	java/lang/Throwable
    //   16	26	64	android/content/pm/PackageManager$NameNotFoundException
    //   77	87	115	android/content/pm/PackageManager$NameNotFoundException
    //   165	174	184	android/content/pm/PackageManager$NameNotFoundException
  }

  // ERROR //
  private static byte[] a(android.content.pm.PackageInfo paramPackageInfo, byte[][] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc 159
    //   2: invokestatic 165	java/security/cert/CertificateFactory:getInstance	(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;
    //   5: astore 4
    //   7: aload_0
    //   8: getfield 169	android/content/pm/PackageInfo:signatures	[Landroid/content/pm/Signature;
    //   11: arraylength
    //   12: iconst_1
    //   13: if_icmpeq +24 -> 37
    //   16: ldc 92
    //   18: ldc 171
    //   20: invokestatic 100	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   23: pop
    //   24: aconst_null
    //   25: areturn
    //   26: astore_2
    //   27: ldc 92
    //   29: ldc 173
    //   31: invokestatic 100	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   34: pop
    //   35: aconst_null
    //   36: areturn
    //   37: new 175	java/io/ByteArrayInputStream
    //   40: dup
    //   41: aload_0
    //   42: getfield 169	android/content/pm/PackageInfo:signatures	[Landroid/content/pm/Signature;
    //   45: iconst_0
    //   46: aaload
    //   47: invokevirtual 181	android/content/pm/Signature:toByteArray	()[B
    //   50: invokespecial 184	java/io/ByteArrayInputStream:<init>	([B)V
    //   53: astore 5
    //   55: aload 4
    //   57: aload 5
    //   59: invokevirtual 188	java/security/cert/CertificateFactory:generateCertificate	(Ljava/io/InputStream;)Ljava/security/cert/Certificate;
    //   62: checkcast 190	java/security/cert/X509Certificate
    //   65: astore 8
    //   67: aload 8
    //   69: invokevirtual 193	java/security/cert/X509Certificate:checkValidity	()V
    //   72: aload_0
    //   73: getfield 169	android/content/pm/PackageInfo:signatures	[Landroid/content/pm/Signature;
    //   76: iconst_0
    //   77: aaload
    //   78: invokevirtual 181	android/content/pm/Signature:toByteArray	()[B
    //   81: astore 13
    //   83: iconst_0
    //   84: istore 14
    //   86: iload 14
    //   88: aload_1
    //   89: arraylength
    //   90: if_icmpge +64 -> 154
    //   93: aload_1
    //   94: iload 14
    //   96: aaload
    //   97: astore 16
    //   99: aload 16
    //   101: aload 13
    //   103: invokestatic 199	java/util/Arrays:equals	([B[B)Z
    //   106: ifeq +42 -> 148
    //   109: aload 16
    //   111: areturn
    //   112: astore 6
    //   114: ldc 92
    //   116: ldc 201
    //   118: invokestatic 100	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   121: pop
    //   122: aconst_null
    //   123: areturn
    //   124: astore 11
    //   126: ldc 92
    //   128: ldc 203
    //   130: invokestatic 100	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   133: pop
    //   134: aconst_null
    //   135: areturn
    //   136: astore 9
    //   138: ldc 92
    //   140: ldc 205
    //   142: invokestatic 100	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   145: pop
    //   146: aconst_null
    //   147: areturn
    //   148: iinc 14 1
    //   151: goto -65 -> 86
    //   154: ldc 92
    //   156: iconst_2
    //   157: invokestatic 209	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   160: ifeq +30 -> 190
    //   163: ldc 92
    //   165: new 120	java/lang/StringBuilder
    //   168: dup
    //   169: ldc 211
    //   171: invokespecial 126	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   174: aload 13
    //   176: iconst_0
    //   177: invokestatic 215	android/util/Base64:encodeToString	([BI)Ljava/lang/String;
    //   180: invokevirtual 218	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   186: invokestatic 221	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   189: pop
    //   190: aconst_null
    //   191: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   0	7	26	java/security/cert/CertificateException
    //   55	67	112	java/security/cert/CertificateException
    //   67	72	124	java/security/cert/CertificateExpiredException
    //   67	72	136	java/security/cert/CertificateNotYetValidException
  }

  public static Context b(Context paramContext)
  {
    try
    {
      Context localContext = paramContext.createPackageContext("com.google.android.gms", 3);
      return localContext;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
