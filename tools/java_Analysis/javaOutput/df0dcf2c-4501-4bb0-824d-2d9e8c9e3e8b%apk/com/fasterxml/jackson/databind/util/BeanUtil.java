package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;

public class BeanUtil
{
  protected static boolean isCglibGetCallbacks(AnnotatedMethod paramAnnotatedMethod)
  {
    Class localClass = paramAnnotatedMethod.getRawType();
    if ((localClass == null) || (!localClass.isArray()));
    String str;
    do
    {
      Package localPackage;
      do
      {
        return false;
        localPackage = localClass.getComponentType().getPackage();
      }
      while (localPackage == null);
      str = localPackage.getName();
    }
    while ((!str.startsWith("net.sf.cglib")) && (!str.startsWith("org.hibernate.repackage.cglib")));
    return true;
  }

  protected static boolean isGroovyMetaClassGetter(AnnotatedMethod paramAnnotatedMethod)
  {
    Class localClass = paramAnnotatedMethod.getRawType();
    if ((localClass == null) || (localClass.isArray()));
    Package localPackage;
    do
    {
      return false;
      localPackage = localClass.getPackage();
    }
    while ((localPackage == null) || (!localPackage.getName().startsWith("groovy.lang")));
    return true;
  }

  protected static String manglePropertyName(String paramString)
  {
    StringBuilder localStringBuilder = null;
    int i = paramString.length();
    if (i == 0)
      paramString = null;
    do
    {
      return paramString;
      for (int j = 0; j < i; j++)
      {
        char c1 = paramString.charAt(j);
        char c2 = Character.toLowerCase(c1);
        if (c1 == c2)
          break;
        if (localStringBuilder == null)
          localStringBuilder = new StringBuilder(paramString);
        localStringBuilder.setCharAt(j, c2);
      }
    }
    while (localStringBuilder == null);
    return localStringBuilder.toString();
  }

  public static String okNameForGetter(AnnotatedMethod paramAnnotatedMethod)
  {
    String str1 = paramAnnotatedMethod.getName();
    String str2 = okNameForIsGetter(paramAnnotatedMethod, str1);
    if (str2 == null)
      str2 = okNameForRegularGetter(paramAnnotatedMethod, str1);
    return str2;
  }

  public static String okNameForIsGetter(AnnotatedMethod paramAnnotatedMethod, String paramString)
  {
    if (paramString.startsWith("is"))
    {
      Class localClass = paramAnnotatedMethod.getRawType();
      if ((localClass == Boolean.class) || (localClass == Boolean.TYPE));
    }
    else
    {
      return null;
    }
    return manglePropertyName(paramString.substring(2));
  }

  public static String okNameForMutator(AnnotatedMethod paramAnnotatedMethod, String paramString)
  {
    String str = paramAnnotatedMethod.getName();
    if (str.startsWith(paramString))
      return manglePropertyName(str.substring(paramString.length()));
    return null;
  }

  public static String okNameForRegularGetter(AnnotatedMethod paramAnnotatedMethod, String paramString)
  {
    if (paramString.startsWith("get"))
    {
      if (!"getCallbacks".equals(paramString))
        break label27;
      if (!isCglibGetCallbacks(paramAnnotatedMethod))
        break label43;
    }
    label27: 
    while (("getMetaClass".equals(paramString)) && (isGroovyMetaClassGetter(paramAnnotatedMethod)))
      return null;
    label43: return manglePropertyName(paramString.substring(3));
  }
}

/* Location:
 * Qualified Name:     com.fasterxml.jackson.databind.util.BeanUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
