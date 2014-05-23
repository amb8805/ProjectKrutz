package com.google.android.gms.common.images;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.internal.ci;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class ImageManager
{
  private static final Object a = new Object();
  private static HashSet<Uri> b = new HashSet();
  private final Context c;
  private final Handler d;
  private final ExecutorService e;
  private final b f;
  private final Map<ci, ImageManager.c> g;
  private final Map<Uri, ImageManager.c> h;
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.images.ImageManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
