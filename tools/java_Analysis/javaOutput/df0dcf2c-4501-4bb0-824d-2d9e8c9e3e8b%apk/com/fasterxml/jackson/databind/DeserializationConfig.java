package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.util.LinkedNode;
import java.io.Serializable;
import java.util.Map;

public final class DeserializationConfig extends MapperConfigBase<DeserializationFeature, DeserializationConfig>
  implements Serializable
{
  private static final long serialVersionUID = -4227480407273773599L;
  protected final int _deserFeatures;
  protected final JsonNodeFactory _nodeFactory;
  protected final LinkedNode<DeserializationProblemHandler> _problemHandlers;

  private DeserializationConfig(DeserializationConfig paramDeserializationConfig, int paramInt1, int paramInt2)
  {
    super(paramDeserializationConfig, paramInt1);
    this._deserFeatures = paramInt2;
    this._nodeFactory = paramDeserializationConfig._nodeFactory;
    this._problemHandlers = paramDeserializationConfig._problemHandlers;
  }

  public DeserializationConfig(BaseSettings paramBaseSettings, SubtypeResolver paramSubtypeResolver, Map<ClassKey, Class<?>> paramMap)
  {
    super(paramBaseSettings, paramSubtypeResolver, paramMap);
    this._deserFeatures = collectFeatureDefaults(DeserializationFeature.class);
    this._nodeFactory = JsonNodeFactory.instance;
    this._problemHandlers = null;
  }

  public final AnnotationIntrospector getAnnotationIntrospector()
  {
    if (isEnabled(MapperFeature.USE_ANNOTATIONS))
      return super.getAnnotationIntrospector();
    return NopAnnotationIntrospector.instance;
  }

  public final VisibilityChecker<?> getDefaultVisibilityChecker()
  {
    VisibilityChecker localVisibilityChecker = super.getDefaultVisibilityChecker();
    if (!isEnabled(MapperFeature.AUTO_DETECT_SETTERS))
      localVisibilityChecker = localVisibilityChecker.withSetterVisibility(JsonAutoDetect.Visibility.NONE);
    if (!isEnabled(MapperFeature.AUTO_DETECT_CREATORS))
      localVisibilityChecker = localVisibilityChecker.withCreatorVisibility(JsonAutoDetect.Visibility.NONE);
    if (!isEnabled(MapperFeature.AUTO_DETECT_FIELDS))
      localVisibilityChecker = localVisibilityChecker.withFieldVisibility(JsonAutoDetect.Visibility.NONE);
    return localVisibilityChecker;
  }

  public final int getDeserializationFeatures()
  {
    return this._deserFeatures;
  }

  public final JsonNodeFactory getNodeFactory()
  {
    return this._nodeFactory;
  }

  public final LinkedNode<DeserializationProblemHandler> getProblemHandlers()
  {
    return this._problemHandlers;
  }

  public final <T extends BeanDescription> T introspect(JavaType paramJavaType)
  {
    return getClassIntrospector().forDeserialization(this, paramJavaType, this);
  }

  public final BeanDescription introspectClassAnnotations(JavaType paramJavaType)
  {
    return getClassIntrospector().forClassAnnotations(this, paramJavaType, this);
  }

  public final <T extends BeanDescription> T introspectForBuilder(JavaType paramJavaType)
  {
    return getClassIntrospector().forDeserializationWithBuilder(this, paramJavaType, this);
  }

  public final <T extends BeanDescription> T introspectForCreation(JavaType paramJavaType)
  {
    return getClassIntrospector().forCreation(this, paramJavaType, this);
  }

  public final boolean isEnabled(DeserializationFeature paramDeserializationFeature)
  {
    return (this._deserFeatures & paramDeserializationFeature.getMask()) != 0;
  }

  public final boolean useRootWrapping()
  {
    if (this._rootName != null)
      return this._rootName.length() > 0;
    return isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE);
  }

  public final DeserializationConfig with(DeserializationFeature paramDeserializationFeature)
  {
    int i = this._deserFeatures | paramDeserializationFeature.getMask();
    if (i == this._deserFeatures)
      return this;
    return new DeserializationConfig(this, this._mapperFeatures, i);
  }

  public final DeserializationConfig without(DeserializationFeature paramDeserializationFeature)
  {
    int i = this._deserFeatures & (0xFFFFFFFF ^ paramDeserializationFeature.getMask());
    if (i == this._deserFeatures)
      return this;
    return new DeserializationConfig(this, this._mapperFeatures, i);
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.DeserializationConfig
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
