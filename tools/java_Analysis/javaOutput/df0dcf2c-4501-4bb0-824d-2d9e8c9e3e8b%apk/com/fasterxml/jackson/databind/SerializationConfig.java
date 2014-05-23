package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;
import java.util.Map;

public final class SerializationConfig extends MapperConfigBase<SerializationFeature, SerializationConfig>
  implements Serializable
{
  private static final long serialVersionUID = 8849092838541724233L;
  protected final FilterProvider _filterProvider = null;
  protected final int _serFeatures = collectFeatureDefaults(SerializationFeature.class);
  protected JsonInclude.Include _serializationInclusion = null;

  public SerializationConfig(BaseSettings paramBaseSettings, SubtypeResolver paramSubtypeResolver, Map<ClassKey, Class<?>> paramMap)
  {
    super(paramBaseSettings, paramSubtypeResolver, paramMap);
  }

  public final AnnotationIntrospector getAnnotationIntrospector()
  {
    if (isEnabled(MapperFeature.USE_ANNOTATIONS))
      return super.getAnnotationIntrospector();
    return AnnotationIntrospector.nopInstance();
  }

  public final VisibilityChecker<?> getDefaultVisibilityChecker()
  {
    VisibilityChecker localVisibilityChecker = super.getDefaultVisibilityChecker();
    if (!isEnabled(MapperFeature.AUTO_DETECT_GETTERS))
      localVisibilityChecker = localVisibilityChecker.withGetterVisibility(JsonAutoDetect.Visibility.NONE);
    if (!isEnabled(MapperFeature.AUTO_DETECT_IS_GETTERS))
      localVisibilityChecker = localVisibilityChecker.withIsGetterVisibility(JsonAutoDetect.Visibility.NONE);
    if (!isEnabled(MapperFeature.AUTO_DETECT_FIELDS))
      localVisibilityChecker = localVisibilityChecker.withFieldVisibility(JsonAutoDetect.Visibility.NONE);
    return localVisibilityChecker;
  }

  public final FilterProvider getFilterProvider()
  {
    return this._filterProvider;
  }

  public final JsonInclude.Include getSerializationInclusion()
  {
    if (this._serializationInclusion != null)
      return this._serializationInclusion;
    return JsonInclude.Include.ALWAYS;
  }

  public final <T extends BeanDescription> T introspect(JavaType paramJavaType)
  {
    return getClassIntrospector().forSerialization(this, paramJavaType, this);
  }

  public final BeanDescription introspectClassAnnotations(JavaType paramJavaType)
  {
    return getClassIntrospector().forClassAnnotations(this, paramJavaType, this);
  }

  public final boolean isEnabled(SerializationFeature paramSerializationFeature)
  {
    return (this._serFeatures & paramSerializationFeature.getMask()) != 0;
  }

  public final String toString()
  {
    return "[SerializationConfig: flags=0x" + Integer.toHexString(this._serFeatures) + "]";
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.SerializationConfig
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
