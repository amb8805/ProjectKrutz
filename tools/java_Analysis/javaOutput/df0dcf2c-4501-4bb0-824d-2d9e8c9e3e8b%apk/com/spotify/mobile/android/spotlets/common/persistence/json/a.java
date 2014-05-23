package com.spotify.mobile.android.spotlets.common.persistence.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonDeserialize(as="Ljava/util/Map;", using="Lcom/spotify/mobile/android/spotlets/common/persistence/json/JsonBundleHelper$BundleDeserializer;")
@JsonSerialize(as="Ljava/util/Map;", using="Lcom/spotify/mobile/android/spotlets/common/persistence/json/JsonBundleHelper$BundleSerializer;")
abstract interface a
{
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.common.persistence.json.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
