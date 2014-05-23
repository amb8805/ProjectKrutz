package com.spotify.mobile.android.spotlets.common.persistence.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import java.io.Serializable;

final class b<T extends Serializable>
{

  @JsonInclude(JsonInclude.Include.ALWAYS)
  @JsonProperty("value")
  @JsonTypeInfo(include=JsonTypeInfo.As.EXTERNAL_PROPERTY, property="type", use=JsonTypeInfo.Id.CLASS)
  final T a;

  @JsonCreator
  private b(@JsonProperty("value") T paramT)
  {
    this.a = paramT;
  }

  static <T extends Serializable> b<T> a(T paramT)
  {
    return new b(paramT);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.common.persistence.json.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
