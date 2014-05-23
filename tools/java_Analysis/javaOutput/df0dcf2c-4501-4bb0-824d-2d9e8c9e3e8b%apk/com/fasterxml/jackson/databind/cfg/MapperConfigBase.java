package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;
import java.util.Map;

public abstract class MapperConfigBase<CFG extends ConfigFeature, T extends MapperConfigBase<CFG, T>> extends MapperConfig<T>
  implements Serializable
{
  private static final int DEFAULT_MAPPER_FEATURES = 0;
  private static final long serialVersionUID = -8378230381628000111L;
  protected final Map<ClassKey, Class<?>> _mixInAnnotations;
  protected final String _rootName;
  protected final SubtypeResolver _subtypeResolver;
  protected final Class<?> _view;

  protected MapperConfigBase(BaseSettings paramBaseSettings, SubtypeResolver paramSubtypeResolver, Map<ClassKey, Class<?>> paramMap)
  {
    super(paramBaseSettings, DEFAULT_MAPPER_FEATURES);
    this._mixInAnnotations = paramMap;
    this._subtypeResolver = paramSubtypeResolver;
    this._rootName = null;
    this._view = null;
  }

  protected MapperConfigBase(MapperConfigBase<CFG, T> paramMapperConfigBase, int paramInt)
  {
    super(paramMapperConfigBase._base, paramInt);
    this._mixInAnnotations = paramMapperConfigBase._mixInAnnotations;
    this._subtypeResolver = paramMapperConfigBase._subtypeResolver;
    this._rootName = paramMapperConfigBase._rootName;
    this._view = paramMapperConfigBase._view;
  }

  public final Class<?> findMixInClassFor(Class<?> paramClass)
  {
    if (this._mixInAnnotations == null)
      return null;
    return (Class)this._mixInAnnotations.get(new ClassKey(paramClass));
  }

  public final Class<?> getActiveView()
  {
    return this._view;
  }

  public final String getRootName()
  {
    return this._rootName;
  }

  public final SubtypeResolver getSubtypeResolver()
  {
    return this._subtypeResolver;
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.cfg.MapperConfigBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
