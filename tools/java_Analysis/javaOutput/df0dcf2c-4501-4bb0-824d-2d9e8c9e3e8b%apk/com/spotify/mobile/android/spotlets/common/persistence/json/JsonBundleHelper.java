package com.spotify.mobile.android.spotlets.common.persistence.json;

import android.os.Bundle;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public final class JsonBundleHelper
{
  private static final ObjectMapper a;

  static
  {
    ObjectMapper localObjectMapper = new ObjectMapper();
    a = localObjectMapper;
    localObjectMapper.addMixInAnnotations(Bundle.class, a.class);
  }

  public static Bundle a(File paramFile)
  {
    return (Bundle)a.readValue(paramFile, Bundle.class);
  }

  public static void a(File paramFile, Bundle paramBundle)
  {
    a.writeValue(paramFile, paramBundle);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.common.persistence.json.JsonBundleHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
