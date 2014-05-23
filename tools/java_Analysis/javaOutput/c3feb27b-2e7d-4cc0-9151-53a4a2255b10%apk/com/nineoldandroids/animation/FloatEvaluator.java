package com.nineoldandroids.animation;

public class FloatEvaluator
  implements TypeEvaluator<Number>
{
  public FloatEvaluator()
  {
  }

  public Float evaluate(float paramFloat, Number paramNumber1, Number paramNumber2)
  {
    float f = paramNumber1.floatValue();
    return Float.valueOf(f + paramFloat * (paramNumber2.floatValue() - f));
  }
}

/* Location:
 * Qualified Name:     com.nineoldandroids.animation.FloatEvaluator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
