package com.facebook;

public class FacebookServiceException extends FacebookException
{
  private static final long serialVersionUID = 1L;
  private final FacebookRequestError error;

  public FacebookServiceException(FacebookRequestError paramFacebookRequestError, String paramString)
  {
    super(paramString);
    this.error = paramFacebookRequestError;
  }

  public final FacebookRequestError a()
  {
    return this.error;
  }

  public final String toString()
  {
    return "{FacebookServiceException: httpResponseCode: " + this.error.a() + ", facebookErrorCode: " + this.error.b() + ", facebookErrorType: " + this.error.c() + ", message: " + this.error.d() + "}";
  }
}

/* Location:
 * Qualified Name:     com.facebook.FacebookServiceException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
