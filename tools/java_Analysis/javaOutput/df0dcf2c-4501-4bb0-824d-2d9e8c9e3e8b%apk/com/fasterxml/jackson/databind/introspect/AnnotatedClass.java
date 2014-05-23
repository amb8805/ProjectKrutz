package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map;;

public final class AnnotatedClass extends Annotated
{
  private static final AnnotationMap[] NO_ANNOTATION_MAPS = new AnnotationMap[0];
  protected final AnnotationIntrospector _annotationIntrospector;
  protected final Class<?> _class;
  protected AnnotationMap _classAnnotations;
  protected List<AnnotatedConstructor> _constructors;
  protected List<AnnotatedMethod> _creatorMethods;
  protected boolean _creatorsResolved = false;
  protected AnnotatedConstructor _defaultConstructor;
  protected List<AnnotatedField> _fields;
  protected AnnotatedMethodMap _memberMethods;
  protected final ClassIntrospector.MixInResolver _mixInResolver;
  protected final Class<?> _primaryMixIn;
  protected final List<Class<?>> _superTypes;

  private AnnotatedClass(Class<?> paramClass, List<Class<?>> paramList, AnnotationIntrospector paramAnnotationIntrospector, ClassIntrospector.MixInResolver paramMixInResolver, AnnotationMap paramAnnotationMap)
  {
    this._class = paramClass;
    this._superTypes = paramList;
    this._annotationIntrospector = paramAnnotationIntrospector;
    this._mixInResolver = paramMixInResolver;
    if (this._mixInResolver == null);
    for (Class localClass = null; ; localClass = this._mixInResolver.findMixInClassFor(this._class))
    {
      this._primaryMixIn = localClass;
      this._classAnnotations = paramAnnotationMap;
      return;
    }
  }

  private void _addAnnotationsIfNotPresent(AnnotatedMember paramAnnotatedMember, Annotation[] paramArrayOfAnnotation)
  {
    if (paramArrayOfAnnotation != null)
    {
      int i = paramArrayOfAnnotation.length;
      LinkedList localLinkedList = null;
      int j = 0;
      if (j < i)
      {
        Annotation localAnnotation = paramArrayOfAnnotation[j];
        if (_isAnnotationBundle(localAnnotation))
        {
          if (localLinkedList == null)
            localLinkedList = new LinkedList();
          localLinkedList.add(localAnnotation.annotationType().getDeclaredAnnotations());
        }
        while (true)
        {
          j++;
          break;
          paramAnnotatedMember.addIfNotPresent(localAnnotation);
        }
      }
      if (localLinkedList != null)
      {
        Iterator localIterator = localLinkedList.iterator();
        while (localIterator.hasNext())
          _addAnnotationsIfNotPresent(paramAnnotatedMember, (Annotation[])localIterator.next());
      }
    }
  }

  private void _addAnnotationsIfNotPresent(AnnotationMap paramAnnotationMap, Annotation[] paramArrayOfAnnotation)
  {
    if (paramArrayOfAnnotation != null)
    {
      int i = paramArrayOfAnnotation.length;
      LinkedList localLinkedList = null;
      int j = 0;
      if (j < i)
      {
        Annotation localAnnotation = paramArrayOfAnnotation[j];
        if (_isAnnotationBundle(localAnnotation))
        {
          if (localLinkedList == null)
            localLinkedList = new LinkedList();
          localLinkedList.add(localAnnotation.annotationType().getDeclaredAnnotations());
        }
        while (true)
        {
          j++;
          break;
          paramAnnotationMap.addIfNotPresent(localAnnotation);
        }
      }
      if (localLinkedList != null)
      {
        Iterator localIterator = localLinkedList.iterator();
        while (localIterator.hasNext())
          _addAnnotationsIfNotPresent(paramAnnotationMap, (Annotation[])localIterator.next());
      }
    }
  }

  private void _addOrOverrideAnnotations(AnnotatedMember paramAnnotatedMember, Annotation[] paramArrayOfAnnotation)
  {
    if (paramArrayOfAnnotation != null)
    {
      int i = paramArrayOfAnnotation.length;
      LinkedList localLinkedList = null;
      int j = 0;
      if (j < i)
      {
        Annotation localAnnotation = paramArrayOfAnnotation[j];
        if (_isAnnotationBundle(localAnnotation))
        {
          if (localLinkedList == null)
            localLinkedList = new LinkedList();
          localLinkedList.add(localAnnotation.annotationType().getDeclaredAnnotations());
        }
        while (true)
        {
          j++;
          break;
          paramAnnotatedMember.addOrOverride(localAnnotation);
        }
      }
      if (localLinkedList != null)
      {
        Iterator localIterator = localLinkedList.iterator();
        while (localIterator.hasNext())
          _addOrOverrideAnnotations(paramAnnotatedMember, (Annotation[])localIterator.next());
      }
    }
  }

  private AnnotationMap _emptyAnnotationMap()
  {
    return new AnnotationMap();
  }

  private AnnotationMap[] _emptyAnnotationMaps(int paramInt)
  {
    AnnotationMap[] arrayOfAnnotationMap;
    if (paramInt == 0)
      arrayOfAnnotationMap = NO_ANNOTATION_MAPS;
    while (true)
    {
      return arrayOfAnnotationMap;
      arrayOfAnnotationMap = new AnnotationMap[paramInt];
      for (int i = 0; i < paramInt; i++)
        arrayOfAnnotationMap[i] = _emptyAnnotationMap();
    }
  }

  private final boolean _isAnnotationBundle(Annotation paramAnnotation)
  {
    return (this._annotationIntrospector != null) && (this._annotationIntrospector.isAnnotationBundle(paramAnnotation));
  }

  private boolean _isIncludableField(Field paramField)
  {
    if (paramField.isSynthetic());
    int i;
    do
    {
      return false;
      i = paramField.getModifiers();
    }
    while ((Modifier.isStatic(i)) || (Modifier.isTransient(i)));
    return true;
  }

  public static AnnotatedClass construct(Class<?> paramClass, AnnotationIntrospector paramAnnotationIntrospector, ClassIntrospector.MixInResolver paramMixInResolver)
  {
    return new AnnotatedClass(paramClass, ClassUtil.findSuperTypes(paramClass, null), paramAnnotationIntrospector, paramMixInResolver, null);
  }

  public static AnnotatedClass constructWithoutSuperTypes(Class<?> paramClass, AnnotationIntrospector paramAnnotationIntrospector, ClassIntrospector.MixInResolver paramMixInResolver)
  {
    return new AnnotatedClass(paramClass, Collections.emptyList(), paramAnnotationIntrospector, paramMixInResolver, null);
  }

  private void resolveClassAnnotations()
  {
    this._classAnnotations = new AnnotationMap();
    if (this._annotationIntrospector != null)
    {
      if (this._primaryMixIn != null)
        _addClassMixIns(this._classAnnotations, this._class, this._primaryMixIn);
      _addAnnotationsIfNotPresent(this._classAnnotations, this._class.getDeclaredAnnotations());
      Iterator localIterator = this._superTypes.iterator();
      while (localIterator.hasNext())
      {
        Class localClass = (Class)localIterator.next();
        _addClassMixIns(this._classAnnotations, localClass);
        _addAnnotationsIfNotPresent(this._classAnnotations, localClass.getDeclaredAnnotations());
      }
      _addClassMixIns(this._classAnnotations, Object.class);
    }
  }

  private void resolveCreators()
  {
    int i = 0;
    Constructor[] arrayOfConstructor = this._class.getDeclaredConstructors();
    int j = arrayOfConstructor.length;
    int k = 0;
    ArrayList localArrayList1 = null;
    if (k < j)
    {
      Constructor localConstructor = arrayOfConstructor[k];
      if (localConstructor.getParameterTypes().length == 0)
        this._defaultConstructor = _constructConstructor(localConstructor, true);
      while (true)
      {
        k++;
        break;
        if (localArrayList1 == null)
          localArrayList1 = new ArrayList(Math.max(10, arrayOfConstructor.length));
        localArrayList1.add(_constructConstructor(localConstructor, false));
      }
    }
    int i2;
    if (localArrayList1 == null)
    {
      this._constructors = Collections.emptyList();
      if ((this._primaryMixIn != null) && ((this._defaultConstructor != null) || (!this._constructors.isEmpty())))
        _addConstructorMixIns(this._primaryMixIn);
      if (this._annotationIntrospector == null)
        break label256;
      if ((this._defaultConstructor != null) && (this._annotationIntrospector.hasIgnoreMarker(this._defaultConstructor)))
        this._defaultConstructor = null;
      if (this._constructors == null)
        break label256;
      i2 = this._constructors.size();
    }
    while (true)
    {
      int i3 = i2 - 1;
      if (i3 >= 0)
      {
        if (!this._annotationIntrospector.hasIgnoreMarker((AnnotatedMember)this._constructors.get(i3)))
          break label450;
        this._constructors.remove(i3);
        i2 = i3;
        continue;
        this._constructors = localArrayList1;
        break;
      }
      label256: Method[] arrayOfMethod = this._class.getDeclaredMethods();
      int m = arrayOfMethod.length;
      ArrayList localArrayList2 = null;
      while (i < m)
      {
        Method localMethod = arrayOfMethod[i];
        if (Modifier.isStatic(localMethod.getModifiers()))
        {
          if (localArrayList2 == null)
            localArrayList2 = new ArrayList(8);
          localArrayList2.add(_constructCreatorMethod(localMethod));
        }
        i++;
      }
      if (localArrayList2 == null)
        this._creatorMethods = Collections.emptyList();
      do
      {
        this._creatorsResolved = true;
        return;
        this._creatorMethods = localArrayList2;
        if (this._primaryMixIn != null)
          _addFactoryMixIns(this._primaryMixIn);
      }
      while (this._annotationIntrospector == null);
      int n = this._creatorMethods.size();
      while (true)
      {
        int i1 = n - 1;
        if (i1 < 0)
          break;
        if (this._annotationIntrospector.hasIgnoreMarker((AnnotatedMember)this._creatorMethods.get(i1)))
        {
          this._creatorMethods.remove(i1);
          n = i1;
        }
        else
        {
          n = i1;
        }
      }
      label450: i2 = i3;
    }
  }

  private void resolveFields()
  {
    Map localMap = _findFields(this._class, null);
    if ((localMap == null) || (localMap.size() == 0))
    {
      this._fields = Collections.emptyList();
      return;
    }
    this._fields = new ArrayList(localMap.size());
    this._fields.addAll(localMap.values());
  }

  private void resolveMemberMethods()
  {
    this._memberMethods = new AnnotatedMethodMap();
    AnnotatedMethodMap localAnnotatedMethodMap = new AnnotatedMethodMap();
    _addMemberMethods(this._class, this._memberMethods, this._primaryMixIn, localAnnotatedMethodMap);
    Iterator localIterator1 = this._superTypes.iterator();
    if (localIterator1.hasNext())
    {
      Class localClass2 = (Class)localIterator1.next();
      if (this._mixInResolver == null);
      for (Class localClass3 = null; ; localClass3 = this._mixInResolver.findMixInClassFor(localClass2))
      {
        _addMemberMethods(localClass2, this._memberMethods, localClass3, localAnnotatedMethodMap);
        break;
      }
    }
    if (this._mixInResolver != null)
    {
      Class localClass1 = this._mixInResolver.findMixInClassFor(Object.class);
      if (localClass1 != null)
        _addMethodMixIns(this._class, this._memberMethods, localClass1, localAnnotatedMethodMap);
    }
    if ((this._annotationIntrospector != null) && (!localAnnotatedMethodMap.isEmpty()))
    {
      Iterator localIterator2 = localAnnotatedMethodMap.iterator();
      AnnotatedMethod localAnnotatedMethod1;
      while (localIterator2.hasNext())
      {
        localAnnotatedMethod1 = (AnnotatedMethod)localIterator2.next();
        try
        {
          Method localMethod = Object.class.getDeclaredMethod(localAnnotatedMethod1.getName(), localAnnotatedMethod1.getRawParameterTypes());
          if (localMethod != null)
          {
            AnnotatedMethod localAnnotatedMethod2 = _constructMethod(localMethod);
            _addMixOvers(localAnnotatedMethod1.getAnnotated(), localAnnotatedMethod2, false);
            this._memberMethods.add(localAnnotatedMethod2);
          }
        }
        catch (Exception localException)
        {
        }
      }
    }
  }

  protected final void _addClassMixIns(AnnotationMap paramAnnotationMap, Class<?> paramClass)
  {
    if (this._mixInResolver != null)
      _addClassMixIns(paramAnnotationMap, paramClass, this._mixInResolver.findMixInClassFor(paramClass));
  }

  protected final void _addClassMixIns(AnnotationMap paramAnnotationMap, Class<?> paramClass1, Class<?> paramClass2)
  {
    if (paramClass2 == null);
    while (true)
    {
      return;
      _addAnnotationsIfNotPresent(paramAnnotationMap, paramClass2.getDeclaredAnnotations());
      Iterator localIterator = ClassUtil.findSuperTypes(paramClass2, paramClass1).iterator();
      while (localIterator.hasNext())
        _addAnnotationsIfNotPresent(paramAnnotationMap, ((Class)localIterator.next()).getDeclaredAnnotations());
    }
  }

  protected final void _addConstructorMixIns(Class<?> paramClass)
  {
    int i;
    int k;
    Object localObject1;
    label24: Constructor localConstructor;
    if (this._constructors == null)
    {
      i = 0;
      Constructor[] arrayOfConstructor = paramClass.getDeclaredConstructors();
      int j = arrayOfConstructor.length;
      k = 0;
      localObject1 = null;
      if (k >= j)
        break label209;
      localConstructor = arrayOfConstructor[k];
      if (localConstructor.getParameterTypes().length != 0)
        break label83;
      if (this._defaultConstructor != null)
        _addMixOvers(localConstructor, this._defaultConstructor, false);
    }
    while (true)
    {
      k++;
      break label24;
      i = this._constructors.size();
      break;
      label83: if (localObject1 == null)
      {
        localObject2 = new MemberKey[i];
        for (int n = 0; n < i; n++)
          localObject2[n] = new MemberKey(((AnnotatedConstructor)this._constructors.get(n)).getAnnotated());
      }
      Object localObject2 = localObject1;
      MemberKey localMemberKey = new MemberKey(localConstructor);
      int m = 0;
      while (true)
        if (m < i)
        {
          if (localMemberKey.equals(localObject2[m]))
          {
            _addMixOvers(localConstructor, (AnnotatedConstructor)this._constructors.get(m), true);
            localObject1 = localObject2;
            break;
          }
          m++;
          continue;
          label209: return;
        }
      localObject1 = localObject2;
    }
  }

  protected final void _addFactoryMixIns(Class<?> paramClass)
  {
    Object localObject1 = null;
    int i = this._creatorMethods.size();
    Method[] arrayOfMethod = paramClass.getDeclaredMethods();
    int j = arrayOfMethod.length;
    int k = 0;
    Object localObject2;
    int m;
    if (k < j)
    {
      Method localMethod = arrayOfMethod[k];
      if ((!Modifier.isStatic(localMethod.getModifiers())) || (localMethod.getParameterTypes().length == 0))
        break label187;
      if (localObject1 == null)
      {
        localObject2 = new MemberKey[i];
        for (int n = 0; n < i; n++)
          localObject2[n] = new MemberKey(((AnnotatedMethod)this._creatorMethods.get(n)).getAnnotated());
      }
      localObject2 = localObject1;
      MemberKey localMemberKey = new MemberKey(localMethod);
      m = 0;
      label131: if (m < i)
      {
        if (!localMemberKey.equals(localObject2[m]))
          break label180;
        _addMixOvers(localMethod, (AnnotatedMethod)this._creatorMethods.get(m), true);
      }
    }
    while (true)
    {
      k++;
      localObject1 = localObject2;
      break;
      label180: m++;
      break label131;
      return;
      label187: localObject2 = localObject1;
    }
  }

  protected final void _addFieldMixIns(Class<?> paramClass1, Class<?> paramClass2, Map<String, AnnotatedField> paramMap)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramClass2);
    ClassUtil.findSuperTypes(paramClass2, paramClass1, localArrayList);
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
      for (Field localField : ((Class)localIterator.next()).getDeclaredFields())
        if (_isIncludableField(localField))
        {
          AnnotatedField localAnnotatedField = (AnnotatedField)paramMap.get(localField.getName());
          if (localAnnotatedField != null)
            _addOrOverrideAnnotations(localAnnotatedField, localField.getDeclaredAnnotations());
        }
  }

  protected final void _addMemberMethods(Class<?> paramClass1, AnnotatedMethodMap paramAnnotatedMethodMap1, Class<?> paramClass2, AnnotatedMethodMap paramAnnotatedMethodMap2)
  {
    if (paramClass2 != null)
      _addMethodMixIns(paramClass1, paramAnnotatedMethodMap1, paramClass2, paramAnnotatedMethodMap2);
    if (paramClass1 == null)
      return;
    Method[] arrayOfMethod = paramClass1.getDeclaredMethods();
    int i = arrayOfMethod.length;
    int j = 0;
    label32: Method localMethod;
    AnnotatedMethod localAnnotatedMethod1;
    if (j < i)
    {
      localMethod = arrayOfMethod[j];
      if (_isIncludableMemberMethod(localMethod))
      {
        localAnnotatedMethod1 = paramAnnotatedMethodMap1.find(localMethod);
        if (localAnnotatedMethod1 != null)
          break label114;
        AnnotatedMethod localAnnotatedMethod2 = _constructMethod(localMethod);
        paramAnnotatedMethodMap1.add(localAnnotatedMethod2);
        AnnotatedMethod localAnnotatedMethod3 = paramAnnotatedMethodMap2.remove(localMethod);
        if (localAnnotatedMethod3 != null)
          _addMixOvers(localAnnotatedMethod3.getAnnotated(), localAnnotatedMethod2, false);
      }
    }
    while (true)
    {
      j++;
      break label32;
      break;
      label114: _addMixUnders(localMethod, localAnnotatedMethod1);
      if ((localAnnotatedMethod1.getDeclaringClass().isInterface()) && (!localMethod.getDeclaringClass().isInterface()))
        paramAnnotatedMethodMap1.add(localAnnotatedMethod1.withMethod(localMethod));
    }
  }

  protected final void _addMethodMixIns(Class<?> paramClass1, AnnotatedMethodMap paramAnnotatedMethodMap1, Class<?> paramClass2, AnnotatedMethodMap paramAnnotatedMethodMap2)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramClass2);
    ClassUtil.findSuperTypes(paramClass2, paramClass1, localArrayList);
    Iterator localIterator = localArrayList.iterator();
    if (localIterator.hasNext())
    {
      Method[] arrayOfMethod = ((Class)localIterator.next()).getDeclaredMethods();
      int i = arrayOfMethod.length;
      int j = 0;
      label68: Method localMethod;
      if (j < i)
      {
        localMethod = arrayOfMethod[j];
        if (_isIncludableMemberMethod(localMethod))
        {
          AnnotatedMethod localAnnotatedMethod = paramAnnotatedMethodMap1.find(localMethod);
          if (localAnnotatedMethod == null)
            break label118;
          _addMixUnders(localMethod, localAnnotatedMethod);
        }
      }
      while (true)
      {
        j++;
        break label68;
        break;
        label118: paramAnnotatedMethodMap2.add(_constructMethod(localMethod));
      }
    }
  }

  protected final void _addMixOvers(Constructor<?> paramConstructor, AnnotatedConstructor paramAnnotatedConstructor, boolean paramBoolean)
  {
    _addOrOverrideAnnotations(paramAnnotatedConstructor, paramConstructor.getDeclaredAnnotations());
    if (paramBoolean)
      for (Annotation[] arrayOfAnnotation1 : paramConstructor.getParameterAnnotations())
      {
        int k = arrayOfAnnotation1.length;
        for (int m = 0; m < k; m++)
          paramAnnotatedConstructor.addOrOverrideParam(???, arrayOfAnnotation1[m]);
      }
  }

  protected final void _addMixOvers(Method paramMethod, AnnotatedMethod paramAnnotatedMethod, boolean paramBoolean)
  {
    _addOrOverrideAnnotations(paramAnnotatedMethod, paramMethod.getDeclaredAnnotations());
    if (paramBoolean)
      for (Annotation[] arrayOfAnnotation1 : paramMethod.getParameterAnnotations())
      {
        int k = arrayOfAnnotation1.length;
        for (int m = 0; m < k; m++)
          paramAnnotatedMethod.addOrOverrideParam(???, arrayOfAnnotation1[m]);
      }
  }

  protected final void _addMixUnders(Method paramMethod, AnnotatedMethod paramAnnotatedMethod)
  {
    _addAnnotationsIfNotPresent(paramAnnotatedMethod, paramMethod.getDeclaredAnnotations());
  }

  protected final AnnotationMap _collectRelevantAnnotations(Annotation[] paramArrayOfAnnotation)
  {
    AnnotationMap localAnnotationMap = new AnnotationMap();
    _addAnnotationsIfNotPresent(localAnnotationMap, paramArrayOfAnnotation);
    return localAnnotationMap;
  }

  protected final AnnotationMap[] _collectRelevantAnnotations(Annotation[][] paramArrayOfAnnotation)
  {
    int i = paramArrayOfAnnotation.length;
    AnnotationMap[] arrayOfAnnotationMap = new AnnotationMap[i];
    for (int j = 0; j < i; j++)
      arrayOfAnnotationMap[j] = _collectRelevantAnnotations(paramArrayOfAnnotation[j]);
    return arrayOfAnnotationMap;
  }

  protected final AnnotatedConstructor _constructConstructor(Constructor<?> paramConstructor, boolean paramBoolean)
  {
    if (this._annotationIntrospector == null)
      return new AnnotatedConstructor(paramConstructor, _emptyAnnotationMap(), _emptyAnnotationMaps(paramConstructor.getParameterTypes().length));
    if (paramBoolean)
      return new AnnotatedConstructor(paramConstructor, _collectRelevantAnnotations(paramConstructor.getDeclaredAnnotations()), null);
    Annotation[][] arrayOfAnnotation = paramConstructor.getParameterAnnotations();
    int i = paramConstructor.getParameterTypes().length;
    Class localClass;
    Object localObject;
    AnnotationMap[] arrayOfAnnotationMap;
    if (i != arrayOfAnnotation.length)
    {
      localClass = paramConstructor.getDeclaringClass();
      if ((localClass.isEnum()) && (i == 2 + arrayOfAnnotation.length))
      {
        localObject = new Annotation[2 + arrayOfAnnotation.length][];
        System.arraycopy(arrayOfAnnotation, 0, localObject, 2, arrayOfAnnotation.length);
        arrayOfAnnotationMap = _collectRelevantAnnotations((Annotation[][])localObject);
      }
    }
    while (true)
      if (arrayOfAnnotationMap == null)
      {
        throw new IllegalStateException("Internal error: constructor for " + paramConstructor.getDeclaringClass().getName() + " has mismatch: " + i + " parameters; " + localObject.length + " sets of annotations");
        if ((localClass.isMemberClass()) && (i == 1 + arrayOfAnnotation.length))
        {
          localObject = new Annotation[1 + arrayOfAnnotation.length][];
          System.arraycopy(arrayOfAnnotation, 0, localObject, 1, arrayOfAnnotation.length);
          arrayOfAnnotationMap = _collectRelevantAnnotations((Annotation[][])localObject);
          continue;
          arrayOfAnnotationMap = _collectRelevantAnnotations(arrayOfAnnotation);
        }
      }
      else
      {
        return new AnnotatedConstructor(paramConstructor, _collectRelevantAnnotations(paramConstructor.getDeclaredAnnotations()), arrayOfAnnotationMap);
        localObject = arrayOfAnnotation;
        arrayOfAnnotationMap = null;
      }
  }

  protected final AnnotatedMethod _constructCreatorMethod(Method paramMethod)
  {
    if (this._annotationIntrospector == null)
      return new AnnotatedMethod(paramMethod, _emptyAnnotationMap(), _emptyAnnotationMaps(paramMethod.getParameterTypes().length));
    return new AnnotatedMethod(paramMethod, _collectRelevantAnnotations(paramMethod.getDeclaredAnnotations()), _collectRelevantAnnotations(paramMethod.getParameterAnnotations()));
  }

  protected final AnnotatedField _constructField(Field paramField)
  {
    if (this._annotationIntrospector == null)
      return new AnnotatedField(paramField, _emptyAnnotationMap());
    return new AnnotatedField(paramField, _collectRelevantAnnotations(paramField.getDeclaredAnnotations()));
  }

  protected final AnnotatedMethod _constructMethod(Method paramMethod)
  {
    if (this._annotationIntrospector == null)
      return new AnnotatedMethod(paramMethod, _emptyAnnotationMap(), null);
    return new AnnotatedMethod(paramMethod, _collectRelevantAnnotations(paramMethod.getDeclaredAnnotations()), null);
  }

  protected final Map<String, AnnotatedField> _findFields(Class<?> paramClass, Map<String, AnnotatedField> paramMap)
  {
    Class localClass1 = paramClass.getSuperclass();
    if (localClass1 != null)
    {
      Map localMap = _findFields(localClass1, paramMap);
      Field[] arrayOfField = paramClass.getDeclaredFields();
      int i = arrayOfField.length;
      Object localObject = localMap;
      for (int j = 0; j < i; j++)
      {
        Field localField = arrayOfField[j];
        if (_isIncludableField(localField))
        {
          if (localObject == null)
            localObject = new LinkedHashMap();
          ((Map)localObject).put(localField.getName(), _constructField(localField));
        }
      }
      if (this._mixInResolver != null)
      {
        Class localClass2 = this._mixInResolver.findMixInClassFor(paramClass);
        if (localClass2 != null)
          _addFieldMixIns(localClass1, localClass2, (Map)localObject);
      }
      return localObject;
    }
    return paramMap;
  }

  protected final boolean _isIncludableMemberMethod(Method paramMethod)
  {
    if (Modifier.isStatic(paramMethod.getModifiers()));
    while ((paramMethod.isSynthetic()) || (paramMethod.isBridge()) || (paramMethod.getParameterTypes().length > 2))
      return false;
    return true;
  }

  public final Iterable<AnnotatedField> fields()
  {
    if (this._fields == null)
      resolveFields();
    return this._fields;
  }

  public final AnnotatedMethod findMethod(String paramString, Class<?>[] paramArrayOfClass)
  {
    if (this._memberMethods == null)
      resolveMemberMethods();
    return this._memberMethods.find(paramString, paramArrayOfClass);
  }

  protected final AnnotationMap getAllAnnotations()
  {
    if (this._classAnnotations == null)
      resolveClassAnnotations();
    return this._classAnnotations;
  }

  public final Class<?> getAnnotated()
  {
    return this._class;
  }

  public final <A extends Annotation> A getAnnotation(Class<A> paramClass)
  {
    if (this._classAnnotations == null)
      resolveClassAnnotations();
    return this._classAnnotations.get(paramClass);
  }

  public final Annotations getAnnotations()
  {
    if (this._classAnnotations == null)
      resolveClassAnnotations();
    return this._classAnnotations;
  }

  public final List<AnnotatedConstructor> getConstructors()
  {
    if (!this._creatorsResolved)
      resolveCreators();
    return this._constructors;
  }

  public final AnnotatedConstructor getDefaultConstructor()
  {
    if (!this._creatorsResolved)
      resolveCreators();
    return this._defaultConstructor;
  }

  public final Type getGenericType()
  {
    return this._class;
  }

  public final String getName()
  {
    return this._class.getName();
  }

  public final Class<?> getRawType()
  {
    return this._class;
  }

  public final List<AnnotatedMethod> getStaticMethods()
  {
    if (!this._creatorsResolved)
      resolveCreators();
    return this._creatorMethods;
  }

  public final boolean hasAnnotations()
  {
    if (this._classAnnotations == null)
      resolveClassAnnotations();
    return this._classAnnotations.size() > 0;
  }

  public final Iterable<AnnotatedMethod> memberMethods()
  {
    if (this._memberMethods == null)
      resolveMemberMethods();
    return this._memberMethods;
  }

  public final String toString()
  {
    return "[AnnotedClass " + this._class.getName() + "]";
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.introspect.AnnotatedClass
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
