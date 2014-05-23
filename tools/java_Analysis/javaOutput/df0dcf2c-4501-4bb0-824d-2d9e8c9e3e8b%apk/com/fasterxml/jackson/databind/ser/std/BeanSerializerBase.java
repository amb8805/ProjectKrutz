package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonMappingException.Reference;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.JsonSerializer;;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.Annotated;;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.AnyGetterWriter;
import com.fasterxml.jackson.databind.ser.BeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.BeanSerializerBuilder;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.ArrayList;
import java.util.HashSet;

public abstract class BeanSerializerBase extends StdSerializer
  implements ContextualSerializer, ResolvableSerializer
{
  protected static final BeanPropertyWriter[] NO_PROPS = new BeanPropertyWriter[0];
  protected final AnyGetterWriter _anyGetterWriter;
  protected final BeanPropertyWriter[] _filteredProps;
  protected final ObjectIdWriter _objectIdWriter;
  protected final Object _propertyFilterId;
  protected final BeanPropertyWriter[] _props;
  protected final JsonFormat.Shape _serializationShape;
  protected final AnnotatedMember _typeId;

  protected BeanSerializerBase(JavaType paramJavaType, BeanSerializerBuilder paramBeanSerializerBuilder, BeanPropertyWriter[] paramArrayOfBeanPropertyWriter1, BeanPropertyWriter[] paramArrayOfBeanPropertyWriter2)
  {
    super(paramJavaType);
    this._props = paramArrayOfBeanPropertyWriter1;
    this._filteredProps = paramArrayOfBeanPropertyWriter2;
    if (paramBeanSerializerBuilder == null)
    {
      this._typeId = null;
      this._anyGetterWriter = null;
      this._propertyFilterId = null;
      this._objectIdWriter = null;
    }
    while (true)
    {
      this._serializationShape = localShape;
      return;
      this._typeId = paramBeanSerializerBuilder.getTypeId();
      this._anyGetterWriter = paramBeanSerializerBuilder.getAnyGetter();
      this._propertyFilterId = paramBeanSerializerBuilder.getFilterId();
      this._objectIdWriter = paramBeanSerializerBuilder.getObjectIdWriter();
      JsonFormat.Value localValue = paramBeanSerializerBuilder.getBeanDescription().findExpectedFormat(null);
      localShape = null;
      if (localValue != null)
        localShape = localValue.getShape();
    }
  }

  protected BeanSerializerBase(BeanSerializerBase paramBeanSerializerBase, ObjectIdWriter paramObjectIdWriter)
  {
    super(paramBeanSerializerBase._handledType);
    this._props = paramBeanSerializerBase._props;
    this._filteredProps = paramBeanSerializerBase._filteredProps;
    this._typeId = paramBeanSerializerBase._typeId;
    this._anyGetterWriter = paramBeanSerializerBase._anyGetterWriter;
    this._objectIdWriter = paramObjectIdWriter;
    this._propertyFilterId = paramBeanSerializerBase._propertyFilterId;
    this._serializationShape = paramBeanSerializerBase._serializationShape;
  }

  protected BeanSerializerBase(BeanSerializerBase paramBeanSerializerBase, NameTransformer paramNameTransformer)
  {
    this(paramBeanSerializerBase, rename(paramBeanSerializerBase._props, paramNameTransformer), rename(paramBeanSerializerBase._filteredProps, paramNameTransformer));
  }

  public BeanSerializerBase(BeanSerializerBase paramBeanSerializerBase, BeanPropertyWriter[] paramArrayOfBeanPropertyWriter1, BeanPropertyWriter[] paramArrayOfBeanPropertyWriter2)
  {
    super(paramBeanSerializerBase._handledType);
    this._props = paramArrayOfBeanPropertyWriter1;
    this._filteredProps = paramArrayOfBeanPropertyWriter2;
    this._typeId = paramBeanSerializerBase._typeId;
    this._anyGetterWriter = paramBeanSerializerBase._anyGetterWriter;
    this._objectIdWriter = paramBeanSerializerBase._objectIdWriter;
    this._propertyFilterId = paramBeanSerializerBase._propertyFilterId;
    this._serializationShape = paramBeanSerializerBase._serializationShape;
  }

  protected BeanSerializerBase(BeanSerializerBase paramBeanSerializerBase, String[] paramArrayOfString)
  {
    super(paramBeanSerializerBase._handledType);
    HashSet localHashSet = ArrayBuilders.arrayToSet(paramArrayOfString);
    BeanPropertyWriter[] arrayOfBeanPropertyWriter1 = paramBeanSerializerBase._props;
    BeanPropertyWriter[] arrayOfBeanPropertyWriter2 = paramBeanSerializerBase._filteredProps;
    int i = arrayOfBeanPropertyWriter1.length;
    ArrayList localArrayList1 = new ArrayList(i);
    if (arrayOfBeanPropertyWriter2 == null);
    for (ArrayList localArrayList2 = null; ; localArrayList2 = new ArrayList(i))
      for (int j = 0; j < i; j++)
      {
        BeanPropertyWriter localBeanPropertyWriter = arrayOfBeanPropertyWriter1[j];
        if (!localHashSet.contains(localBeanPropertyWriter.getName()))
        {
          localArrayList1.add(localBeanPropertyWriter);
          if (arrayOfBeanPropertyWriter2 != null)
            localArrayList2.add(arrayOfBeanPropertyWriter2[j]);
        }
      }
    this._props = ((BeanPropertyWriter[])localArrayList1.toArray(new BeanPropertyWriter[localArrayList1.size()]));
    BeanPropertyWriter[] arrayOfBeanPropertyWriter3 = null;
    if (localArrayList2 == null);
    while (true)
    {
      this._filteredProps = arrayOfBeanPropertyWriter3;
      this._typeId = paramBeanSerializerBase._typeId;
      this._anyGetterWriter = paramBeanSerializerBase._anyGetterWriter;
      this._objectIdWriter = paramBeanSerializerBase._objectIdWriter;
      this._propertyFilterId = paramBeanSerializerBase._propertyFilterId;
      this._serializationShape = paramBeanSerializerBase._serializationShape;
      return;
      arrayOfBeanPropertyWriter3 = (BeanPropertyWriter[])localArrayList2.toArray(new BeanPropertyWriter[localArrayList2.size()]);
    }
  }

  private final String _customTypeId(Object paramObject)
  {
    Object localObject = this._typeId.getValue(paramObject);
    if (localObject == null)
      return "";
    if ((localObject instanceof String))
      return (String)localObject;
    return localObject.toString();
  }

  private final void _serializeWithObjectId(Object paramObject, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider, TypeSerializer paramTypeSerializer)
  {
    ObjectIdWriter localObjectIdWriter = this._objectIdWriter;
    WritableObjectId localWritableObjectId = paramSerializerProvider.findObjectId(paramObject, localObjectIdWriter.generator);
    Object localObject1 = localWritableObjectId.id;
    if (localObject1 != null)
    {
      localWritableObjectId.serializer.serialize(localObject1, paramJsonGenerator, paramSerializerProvider);
      return;
    }
    localWritableObjectId.serializer = localObjectIdWriter.serializer;
    Object localObject2 = localWritableObjectId.generator.generateId(paramObject);
    localWritableObjectId.id = localObject2;
    String str;
    if (this._typeId == null)
    {
      str = null;
      if (str != null)
        break label160;
      paramTypeSerializer.writeTypePrefixForObject(paramObject, paramJsonGenerator);
      label93: SerializedString localSerializedString = localObjectIdWriter.propertyName;
      if (localSerializedString != null)
      {
        paramJsonGenerator.writeFieldName(localSerializedString);
        localObjectIdWriter.serializer.serialize(localObject2, paramJsonGenerator, paramSerializerProvider);
      }
      if (this._propertyFilterId == null)
        break label172;
      serializeFieldsFiltered(paramObject, paramJsonGenerator, paramSerializerProvider);
    }
    while (true)
    {
      if (str != null)
        break label182;
      paramTypeSerializer.writeTypeSuffixForObject(paramObject, paramJsonGenerator);
      return;
      str = _customTypeId(paramObject);
      break;
      label160: paramTypeSerializer.writeCustomTypePrefixForObject(paramObject, paramJsonGenerator, str);
      break label93;
      label172: serializeFields(paramObject, paramJsonGenerator, paramSerializerProvider);
    }
    label182: paramTypeSerializer.writeCustomTypeSuffixForObject(paramObject, paramJsonGenerator, str);
  }

  private static final BeanPropertyWriter[] rename(BeanPropertyWriter[] paramArrayOfBeanPropertyWriter, NameTransformer paramNameTransformer)
  {
    if ((paramArrayOfBeanPropertyWriter == null) || (paramArrayOfBeanPropertyWriter.length == 0) || (paramNameTransformer == null) || (paramNameTransformer == NameTransformer.NOP))
      return paramArrayOfBeanPropertyWriter;
    int i = paramArrayOfBeanPropertyWriter.length;
    BeanPropertyWriter[] arrayOfBeanPropertyWriter = new BeanPropertyWriter[i];
    for (int j = 0; j < i; j++)
    {
      BeanPropertyWriter localBeanPropertyWriter = paramArrayOfBeanPropertyWriter[j];
      if (localBeanPropertyWriter != null)
        arrayOfBeanPropertyWriter[j] = localBeanPropertyWriter.rename(paramNameTransformer);
    }
    return arrayOfBeanPropertyWriter;
  }

  protected abstract BeanSerializerBase asArraySerializer();

  public JsonSerializer<?> createContextual(SerializerProvider paramSerializerProvider, BeanProperty paramBeanProperty)
  {
    ObjectIdWriter localObjectIdWriter1 = this._objectIdWriter;
    AnnotationIntrospector localAnnotationIntrospector = paramSerializerProvider.getAnnotationIntrospector();
    Object localObject;
    String[] arrayOfString2;
    ObjectIdInfo localObjectIdInfo1;
    ObjectIdWriter localObjectIdWriter2;
    String[] arrayOfString1;
    if ((paramBeanProperty == null) || (localAnnotationIntrospector == null))
    {
      localObject = null;
      if (localObject == null)
        break label525;
      arrayOfString2 = localAnnotationIntrospector.findPropertiesToIgnore((com.fasterxml.jackson.databind.introspect.Annotated)localObject);
      localObjectIdInfo1 = localAnnotationIntrospector.findObjectIdInfo((com.fasterxml.jackson.databind.introspect.Annotated)localObject);
      if (localObjectIdInfo1 != null)
        break label220;
      if (localObjectIdWriter1 == null)
        break label515;
      ObjectIdInfo localObjectIdInfo3 = localAnnotationIntrospector.findObjectReferenceInfo((com.fasterxml.jackson.databind.introspect.Annotated)localObject, new ObjectIdInfo("", null, null));
      localObjectIdWriter2 = this._objectIdWriter.withAlwaysAsId(localObjectIdInfo3.getAlwaysAsId());
      arrayOfString1 = arrayOfString2;
    }
    while (true)
    {
      label93: ObjectIdWriter localObjectIdWriter3;
      if (localObjectIdWriter2 != null)
      {
        localObjectIdWriter3 = localObjectIdWriter2.withSerializer(paramSerializerProvider.findValueSerializer(localObjectIdWriter2.idType, paramBeanProperty));
        if (localObjectIdWriter3 == this._objectIdWriter);
      }
      for (BeanSerializerBase localBeanSerializerBase = withObjectIdWriter(localObjectIdWriter3); ; localBeanSerializerBase = this)
      {
        if ((arrayOfString1 != null) && (arrayOfString1.length != 0))
          localBeanSerializerBase = localBeanSerializerBase.withIgnorals(arrayOfString1);
        JsonFormat.Shape localShape = null;
        if (localObject != null)
        {
          JsonFormat.Value localValue = localAnnotationIntrospector.findFormat((com.fasterxml.jackson.databind.introspect.Annotated)localObject);
          localShape = null;
          if (localValue != null)
            localShape = localValue.getShape();
        }
        if (localShape == null)
          localShape = this._serializationShape;
        if (localShape == JsonFormat.Shape.ARRAY)
        {
          return localBeanSerializerBase.asArraySerializer();
          localObject = paramBeanProperty.getMember();
          break;
          label220: ObjectIdInfo localObjectIdInfo2 = localAnnotationIntrospector.findObjectReferenceInfo((com.fasterxml.jackson.databind.introspect.Annotated)localObject, localObjectIdInfo1);
          Class localClass = localObjectIdInfo2.getGeneratorType();
          JavaType localJavaType1 = paramSerializerProvider.constructType(localClass);
          JavaType localJavaType2 = paramSerializerProvider.getTypeFactory().findTypeParameters(localJavaType1, ObjectIdGenerator.class)[0];
          if (localClass == ObjectIdGenerators.PropertyGenerator.class)
          {
            String str = localObjectIdInfo2.getPropertyName();
            int i = this._props.length;
            for (int j = 0; ; j++)
            {
              if (j == i)
                throw new IllegalArgumentException("Invalid Object Id definition for " + this._handledType.getName() + ": can not find property with name '" + str + "'");
              BeanPropertyWriter localBeanPropertyWriter1 = this._props[j];
              if (str.equals(localBeanPropertyWriter1.getName()))
              {
                if (j > 0)
                {
                  System.arraycopy(this._props, 0, this._props, 1, j);
                  this._props[0] = localBeanPropertyWriter1;
                  if (this._filteredProps != null)
                  {
                    BeanPropertyWriter localBeanPropertyWriter2 = this._filteredProps[j];
                    System.arraycopy(this._filteredProps, 0, this._filteredProps, 1, j);
                    this._filteredProps[0] = localBeanPropertyWriter2;
                  }
                }
                localObjectIdWriter2 = ObjectIdWriter.construct(localBeanPropertyWriter1.getType(), null, new PropertyBasedObjectIdGenerator(localObjectIdInfo2, localBeanPropertyWriter1), localObjectIdInfo2.getAlwaysAsId());
                arrayOfString1 = arrayOfString2;
                break;
              }
            }
          }
          ObjectIdGenerator localObjectIdGenerator = paramSerializerProvider.objectIdGeneratorInstance((com.fasterxml.jackson.databind.introspect.Annotated)localObject, localObjectIdInfo2);
          localObjectIdWriter2 = ObjectIdWriter.construct(localJavaType2, localObjectIdInfo2.getPropertyName(), localObjectIdGenerator, localObjectIdInfo2.getAlwaysAsId());
          arrayOfString1 = arrayOfString2;
          break label93;
        }
        return localBeanSerializerBase;
      }
      label515: localObjectIdWriter2 = localObjectIdWriter1;
      arrayOfString1 = arrayOfString2;
      continue;
      label525: localObjectIdWriter2 = localObjectIdWriter1;
      arrayOfString1 = null;
    }
  }

  protected BeanPropertyFilter findFilter(SerializerProvider paramSerializerProvider)
  {
    Object localObject = this._propertyFilterId;
    FilterProvider localFilterProvider = paramSerializerProvider.getFilterProvider();
    if (localFilterProvider == null)
      throw new JsonMappingException("Can not resolve BeanPropertyFilter with id '" + localObject + "'; no FilterProvider configured");
    return localFilterProvider.findFilter(localObject);
  }

  public void resolve(SerializerProvider paramSerializerProvider)
  {
    int i;
    int k;
    label18: BeanPropertyWriter localBeanPropertyWriter1;
    JavaType localJavaType;
    if (this._filteredProps == null)
    {
      i = 0;
      int j = this._props.length;
      k = 0;
      if (k >= j)
        break label266;
      localBeanPropertyWriter1 = this._props[k];
      if ((!localBeanPropertyWriter1.willSuppressNulls()) && (!localBeanPropertyWriter1.hasNullSerializer()))
      {
        JsonSerializer localJsonSerializer = paramSerializerProvider.findNullValueSerializer(localBeanPropertyWriter1);
        if (localJsonSerializer != null)
        {
          localBeanPropertyWriter1.assignNullSerializer(localJsonSerializer);
          if (k < i)
          {
            BeanPropertyWriter localBeanPropertyWriter3 = this._filteredProps[k];
            if (localBeanPropertyWriter3 != null)
              localBeanPropertyWriter3.assignNullSerializer(localJsonSerializer);
          }
        }
      }
      if (!localBeanPropertyWriter1.hasSerializer())
      {
        localJavaType = localBeanPropertyWriter1.getSerializationType();
        if (localJavaType != null)
          break label173;
        localJavaType = paramSerializerProvider.constructType(localBeanPropertyWriter1.getGenericPropertyType());
        if (localJavaType.isFinal())
          break label173;
        if ((localJavaType.isContainerType()) || (localJavaType.containedTypeCount() > 0))
          localBeanPropertyWriter1.setNonTrivialBaseType(localJavaType);
      }
    }
    while (true)
    {
      k++;
      break label18;
      i = this._filteredProps.length;
      break;
      label173: Object localObject = paramSerializerProvider.findValueSerializer(localJavaType, localBeanPropertyWriter1);
      if (localJavaType.isContainerType())
      {
        TypeSerializer localTypeSerializer = (TypeSerializer)localJavaType.getContentType().getTypeHandler();
        if ((localTypeSerializer != null) && ((localObject instanceof ContainerSerializer)))
          localObject = ((ContainerSerializer)localObject).withValueTypeSerializer(localTypeSerializer);
      }
      localBeanPropertyWriter1.assignSerializer((JsonSerializer)localObject);
      if (k < i)
      {
        BeanPropertyWriter localBeanPropertyWriter2 = this._filteredProps[k];
        if (localBeanPropertyWriter2 != null)
          localBeanPropertyWriter2.assignSerializer((JsonSerializer)localObject);
      }
    }
    label266: if (this._anyGetterWriter != null)
      this._anyGetterWriter.resolve(paramSerializerProvider);
  }

  protected void serializeFields(Object paramObject, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    BeanPropertyWriter[] arrayOfBeanPropertyWriter;
    int i;
    if ((this._filteredProps != null) && (paramSerializerProvider.getSerializationView() != null))
    {
      arrayOfBeanPropertyWriter = this._filteredProps;
      while (true)
      {
        i = 0;
        try
        {
          int j = arrayOfBeanPropertyWriter.length;
          while (true)
            if (i < j)
            {
              BeanPropertyWriter localBeanPropertyWriter = arrayOfBeanPropertyWriter[i];
              if (localBeanPropertyWriter != null)
                localBeanPropertyWriter.serializeAsField(paramObject, paramJsonGenerator, paramSerializerProvider);
              i++;
              continue;
              arrayOfBeanPropertyWriter = this._props;
              break;
            }
          if (this._anyGetterWriter != null)
            this._anyGetterWriter.getAndSerialize(paramObject, paramJsonGenerator, paramSerializerProvider);
          return;
        }
        catch (Exception localException)
        {
          if (i == arrayOfBeanPropertyWriter.length);
          for (String str2 = "[anySetter]"; ; str2 = arrayOfBeanPropertyWriter[i].getName())
          {
            wrapAndThrow(paramSerializerProvider, localException, paramObject, str2);
            return;
          }
        }
        catch (StackOverflowError localStackOverflowError)
        {
          localJsonMappingException = new JsonMappingException("Infinite recursion (StackOverflowError)", localStackOverflowError);
          if (i != arrayOfBeanPropertyWriter.length);
        }
      }
    }
    JsonMappingException localJsonMappingException;
    for (String str1 = "[anySetter]"; ; str1 = arrayOfBeanPropertyWriter[i].getName())
    {
      localJsonMappingException.prependPath(new JsonMappingException.Reference(paramObject, str1));
      throw localJsonMappingException;
    }
  }

  protected void serializeFieldsFiltered(Object paramObject, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider)
  {
    if ((this._filteredProps != null) && (paramSerializerProvider.getSerializationView() != null))
    {
      arrayOfBeanPropertyWriter = this._filteredProps;
      localBeanPropertyFilter = findFilter(paramSerializerProvider);
      if (localBeanPropertyFilter != null)
        break label49;
      serializeFields(paramObject, paramJsonGenerator, paramSerializerProvider);
    }
    while (true)
    {
      return;
      arrayOfBeanPropertyWriter = this._props;
      break;
      label49: i = 0;
      try
      {
        int j = arrayOfBeanPropertyWriter.length;
        if (i < j)
        {
          BeanPropertyWriter localBeanPropertyWriter = arrayOfBeanPropertyWriter[i];
          if (localBeanPropertyWriter != null)
            localBeanPropertyFilter.serializeAsField(paramObject, paramJsonGenerator, paramSerializerProvider, localBeanPropertyWriter);
        }
        else
        {
          if (this._anyGetterWriter == null)
            continue;
          this._anyGetterWriter.getAndSerialize(paramObject, paramJsonGenerator, paramSerializerProvider);
          return;
        }
      }
      catch (Exception localException)
      {
        if (i == arrayOfBeanPropertyWriter.length);
        for (String str2 = "[anySetter]"; ; str2 = arrayOfBeanPropertyWriter[i].getName())
        {
          wrapAndThrow(paramSerializerProvider, localException, paramObject, str2);
          return;
        }
      }
      catch (StackOverflowError localStackOverflowError)
      {
        while (true)
        {
          JsonMappingException localJsonMappingException = new JsonMappingException("Infinite recursion (StackOverflowError)", localStackOverflowError);
          if (i == arrayOfBeanPropertyWriter.length);
          for (String str1 = "[anySetter]"; ; str1 = arrayOfBeanPropertyWriter[i].getName())
          {
            localJsonMappingException.prependPath(new JsonMappingException.Reference(paramObject, str1));
            throw localJsonMappingException;
          }
          i++;
        }
      }
    }
  }

  public void serializeWithType(Object paramObject, JsonGenerator paramJsonGenerator, SerializerProvider paramSerializerProvider, TypeSerializer paramTypeSerializer)
  {
    if (this._objectIdWriter != null)
    {
      _serializeWithObjectId(paramObject, paramJsonGenerator, paramSerializerProvider, paramTypeSerializer);
      return;
    }
    String str;
    if (this._typeId == null)
    {
      str = null;
      if (str != null)
        break label76;
      paramTypeSerializer.writeTypePrefixForObject(paramObject, paramJsonGenerator);
      label39: if (this._propertyFilterId == null)
        break label88;
      serializeFieldsFiltered(paramObject, paramJsonGenerator, paramSerializerProvider);
    }
    while (true)
    {
      if (str != null)
        break label98;
      paramTypeSerializer.writeTypeSuffixForObject(paramObject, paramJsonGenerator);
      return;
      str = _customTypeId(paramObject);
      break;
      label76: paramTypeSerializer.writeCustomTypePrefixForObject(paramObject, paramJsonGenerator, str);
      break label39;
      label88: serializeFields(paramObject, paramJsonGenerator, paramSerializerProvider);
    }
    label98: paramTypeSerializer.writeCustomTypeSuffixForObject(paramObject, paramJsonGenerator, str);
  }

  public boolean usesObjectId()
  {
    return this._objectIdWriter != null;
  }

  protected abstract BeanSerializerBase withIgnorals(String[] paramArrayOfString);

  public abstract BeanSerializerBase withObjectIdWriter(ObjectIdWriter paramObjectIdWriter);
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
