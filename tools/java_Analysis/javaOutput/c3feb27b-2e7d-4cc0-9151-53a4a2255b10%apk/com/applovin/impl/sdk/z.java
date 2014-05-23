package com.applovin.impl.sdk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class z
{
  public static final ab A = a("local_server_enabled", Boolean.valueOf(true));
  public static final ab B = a("ad_session_minutes", Integer.valueOf(60));
  public static final ab C = a("ad_request_parameters", "");
  public static final ab D = a("ad_refresh_enabled", Boolean.valueOf(true));
  public static final ab E = a("ad_refresh_seconds", Long.valueOf(120L));
  public static final ab F = a("mrec_ad_refresh_enabled", Boolean.valueOf(true));
  public static final ab G = a("mrec_ad_refresh_seconds", Long.valueOf(120L));
  public static final ab H = a("leader_ad_refresh_enabled", Boolean.valueOf(true));
  public static final ab I = a("leader_ad_refresh_seconds", Long.valueOf(120L));
  public static final ab J = a("plugin_version", "");
  public static final ab K = a("ad_preload_enabled", Boolean.valueOf(true));
  public static final ab L = a("ad_resource_caching_enabled", Boolean.valueOf(true));
  public static final ab M = a("resource_cache_prefix", "http://vid.applovin.com/,http://pdn.applovin.com/,http://img.applovin.com/,http://d.applovin.com/,http://cdnjs.cloudflare.com/");
  public static final ab N = a("ad_auto_preload_sizes", "BANNER,INTER");
  public static final ab O = a("auto_upload_events", Boolean.valueOf(true));
  public static final ab P = a("auto_upload_aggregate_time", Long.valueOf(10L));
  public static final ab Q = a("session_expiration_time", Long.valueOf(300L));
  public static final ab R = a("event_cache_size", Integer.valueOf(500));
  public static final ab S = a("event_max_message_size", Integer.valueOf(1024));
  public static final ab T = a("track_installed_apps", Boolean.valueOf(true));
  public static final ab U = a("is_tracking_enabled", Boolean.valueOf(true));
  public static final ab V = a("force_back_button_enabled", Boolean.valueOf(false));
  public static final ab W = a("is_first_install", "unknown");
  private static final List X = Arrays.asList(new Class[] { Boolean.class, Float.class, Integer.class, Long.class, String.class });
  private static final List Y = new ArrayList();
  public static final ab a = a("is_disabled", Boolean.valueOf(false));
  public static final ab b = a("should_load_user_settings", Boolean.valueOf(true));
  public static final ab c = a("device_id", "");
  public static final ab d = a("publisher_id", "");
  public static final ab e = a("app_id", "");
  public static final ab f = a("device_token", "");
  public static final ab g = a("init_retry_count", Integer.valueOf(1));
  public static final ab h = a("submit_data_retry_count", Integer.valueOf(1));
  public static final ab i = a("fetch_ad_retry_count", Integer.valueOf(1));
  public static final ab j = a("conversion_retry_count", Integer.valueOf(1));
  public static final ab k = a("track_click_retry_count", Integer.valueOf(1));
  public static final ab l = a("is_verbose_logging", Boolean.valueOf(false));
  public static final ab m = a("api_endpoint", "http://d.applovin.com/");
  public static final ab n = a("adserver_endpoint", "http://a.applovin.com/2.0/");
  public static final ab o = a("next_device_init", Long.valueOf(0L));
  public static final ab p = a("get_retry_dealy", Long.valueOf(10000L));
  public static final ab q = a("max_apps_to_send", Integer.valueOf(100));
  public static final ab r = a("is_app_list_shared", Boolean.valueOf(true));
  public static final ab s = a("next_app_list_update", Long.valueOf(0L));
  public static final ab t = a("hash_algorithm", "SHA-1");
  public static final ab u = a("short_hash_size", Integer.valueOf(16));
  public static final ab v = a("http_connection_timeout", Integer.valueOf(20000));
  public static final ab w = a("http_socket_timeout", Integer.valueOf(20000));
  public static final ab x = a("error_save_count", Integer.valueOf(15));
  public static final ab y = a("is_app_icon_requested", Boolean.valueOf(false));
  public static final ab z = a("local_server_port", Integer.valueOf(7145));

  private static ab a(String paramString, Object paramObject)
  {
    if (paramObject == null)
      throw new IllegalArgumentException("No default value specified");
    if (!X.contains(paramObject.getClass()))
      throw new IllegalArgumentException("Unsupported value type: " + paramObject.getClass());
    ab localab = new ab(paramString, paramObject, null);
    Y.add(localab);
    return localab;
  }

  public static Collection a()
  {
    return Collections.unmodifiableList(Y);
  }

  public static int b()
  {
    return Y.size();
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
