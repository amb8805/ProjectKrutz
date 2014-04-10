// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) disassembler 

package com.applovin.sdk;

import android.location.Location;

public interface AppLovinTargetingData
{

    public abstract void clearData();

    public abstract void putExtra(String s, String s1);

    public abstract void setBirthYear(int i);

    public abstract void setCarrier(String s);

    public abstract void setCountry(String s);

    public abstract void setEducation(String s);

    public abstract void setEthnicity(String s);

    public abstract void setGender(char c);

    public abstract void setIncome(String s);

    public transient abstract void setInterests(String as[]);

    public transient abstract void setKeywords(String as[]);

    public abstract void setLanguage(String s);

    public abstract void setLocation(Location location);

    public abstract void setMaritalStatus(String s);

    public static final String EDUCATION_BACHELORS = "bachelors";
    public static final String EDUCATION_COLLEGE = "college";
    public static final String EDUCATION_DOCTORAL = "doctoral";
    public static final String EDUCATION_HIGH_SCHOOL = "high_school";
    public static final String EDUCATION_IN_COLLEGE = "in_college";
    public static final String EDUCATION_MASTERS = "masters";
    public static final String EDUCATION_NONE = "none";
    public static final String EDUCATION_OTHER = "other";
    public static final String ETHNICITY_ASIAN = "asian";
    public static final String ETHNICITY_BLACK = "black";
    public static final String ETHNICITY_HISPANIC = "hispanic";
    public static final String ETHNICITY_MIXED = "mixed";
    public static final String ETHNICITY_NATIVE_AMERICAN = "native_american";
    public static final String ETHNICITY_NONE = "none";
    public static final String ETHNICITY_OTHER = "other";
    public static final String ETHNICITY_WHITE = "white";
    public static final char GENDER_FEMALE = 102;
    public static final char GENDER_MALE = 109;
    public static final String MARITAL_STATUS_DIVORCED = "divorced";
    public static final String MARITAL_STATUS_MARRIED = "married";
    public static final String MARITAL_STATUS_NONE = "none";
    public static final String MARITAL_STATUS_SINGLE = "single";
    public static final String MARITAL_STATUS_WIDOWED = "widowed";
}
