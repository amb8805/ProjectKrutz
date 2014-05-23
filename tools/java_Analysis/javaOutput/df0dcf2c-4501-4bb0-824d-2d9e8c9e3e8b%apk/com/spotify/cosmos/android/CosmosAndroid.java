package com.spotify.cosmos.android;

public final class CosmosAndroid
{
  private CosmosAndroid()
  {
  }

  public static void loadNativeLibrary()
  {
    System.loadLibrary("CosmosRouterJni");
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.CosmosAndroid
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
