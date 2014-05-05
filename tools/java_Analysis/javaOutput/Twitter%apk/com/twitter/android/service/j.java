package com.twitter.android.service;

public enum j
{
  private final String ah;

  static
  {
    ag = new j("SEARCH", 11, "searches:::impression");
    l = new j("COMPOSE_TWEET", 12, ":composition::impression");
    m = new j("HOME_GET_NEW", 13, "home:::get_newer");
    n = new j("HOME_GET_MIDDLE", 14, "home:::get_middle");
    o = new j("HOME_GET_OLDER", 15, "home:::get_older");
    p = new j("API_REQUEST", 16, "api:::request");
    q = new j("TWEET_VIEW", 17, "tweet::tweet:impression");
    r = new j("TWEET_RT", 18, "::tweet:retweet");
    s = new j("TWEET_REPLY", 19, "::tweet:reply");
    t = new j("TWEET_QUOTE", 20, "::tweet:quote");
    u = new j("TWEET_OPEN_URL", 21, "::tweet:open_link");
    v = new j("TWEET_FAVORITE", 22, "::tweet:favorite");
    w = new j("TWEET_SHARE", 23, "::tweet:share");
    x = new j("USER_PROFILE", 24, "profile:profile::impression");
    y = new j("PROFILE_FOLLOW", 25, "profile:profile::follow");
    z = new j("PROFILE_UNFOLLOW", 26, "profile:profile::unfollow");
    A = new j("PROFILE_SIMILAR_TO_FOLLOW", 27, "profile:similar_to::follow");
    B = new j("PROFILE_SIMILAR_TO_UNFOLLOW", 28, "profile:similar_to::unfollow");
    C = new j("DISCOVER", 29, "discover:::impression");
    D = new j("CONNECT", 30, "connect:::impression");
    E = new j("ME", 31, "me:::impression");
    F = new j("SIGNUP", 32, "signup:::impression");
    G = new j("SIGNUP_FORM_FULLNAME_FAILURE", 33, "signup:form:fullname:failure");
    H = new j("SIGNUP_FORM_SCREENNAME_FAILURE", 34, "signup:form:screen_name:failure");
    I = new j("SIGNUP_FORM_EMAIL_FAILURE", 35, "signup:form:email:failure");
    J = new j("SIGNUP_FORM_PASSWORD_FAILURE", 36, "signup:form:password:failure");
    K = new j("SIGNUP_FORM_CAPTCHA", 37, "signup:form:captcha:show");
    L = new j("SIGNUP_FORM_SUCCESS", 38, "signup:form::success");
    M = new j("SIGNUP_FORM_FAILURE", 39, "signup:form::failure");
    N = new j("WELCOME", 40, "welcome:::impression");
    O = new j("WELCOME_WTF", 41, "welcome:who_to_follow::impression");
    P = new j("WELCOME_MATCHES_FOLLOW", 42, "welcome:matches::follow");
    Q = new j("WELCOME_SUGGESTIONS_FOLLOW", 43, "welcome:suggestions::follow");
    R = new j("WELCOME_CATEGORY_FOLLOW", 44, "welcome:category::follow");
    S = new j("SIGNED_OUT_FRONT", 45, "front:::impression");
    T = new j("NOTIFICATION_OPEN", 46, "notification:::open");
    U = new j("PHOTO_VIEW", 47, "tweet::photo:impression");
    V = new j("INSTALL_REFERRAL", 48, "external:::referred");
    W = new j("WIDGET_CLICK", 49, "widget:::click");
    X = new j("DISCOVER_CARD_NEWS_CLICK", 50, "discover:discover:card_news:click");
    Y = new j("DISCOVER_CARD_TOPIC_CLICK", 51, "discover:discover:card_topic:click");
    Z = new j("DISCOVER_CARD_NEWS_OPEN_LINK", 52, "discover:discover:card_news:open_link");
    aa = new j("DISCOVER_CARD_IMAGE_CLICK", 53, "discover:discover:image_card_topic:click");
    ab = new j("DISCOVER_STORIES_CARD_NEWS_CLICK", 54, "discover_stories::card_news:click");
    ac = new j("DISCOVER_STORIES_CARD_TOPIC_CLICK", 55, "discover_stories::card_topic:click");
    ad = new j("DISCOVER_STORIES_CARD_NEWS_OPEN_LINK", 56, "discover_stories::card_news:open_link");
    ae = new j("DISCOVER_STORIES_CARD_IMAGE_CLICK", 57, "discover_stories::image_card_topic:click");
    af = new j("WTF", 58, "who_to_follow:::impression");
    j[] arrayOfj = new j[59];
    arrayOfj[0] = a;
    arrayOfj[1] = b;
    arrayOfj[2] = c;
    arrayOfj[3] = d;
    arrayOfj[4] = e;
    arrayOfj[5] = f;
    arrayOfj[6] = g;
    arrayOfj[7] = h;
    arrayOfj[8] = i;
    arrayOfj[9] = j;
    arrayOfj[10] = k;
    arrayOfj[11] = ag;
    arrayOfj[12] = l;
    arrayOfj[13] = m;
    arrayOfj[14] = n;
    arrayOfj[15] = o;
    arrayOfj[16] = p;
    arrayOfj[17] = q;
    arrayOfj[18] = r;
    arrayOfj[19] = s;
    arrayOfj[20] = t;
    arrayOfj[21] = u;
    arrayOfj[22] = v;
    arrayOfj[23] = w;
    arrayOfj[24] = x;
    arrayOfj[25] = y;
    arrayOfj[26] = z;
    arrayOfj[27] = A;
    arrayOfj[28] = B;
    arrayOfj[29] = C;
    arrayOfj[30] = D;
    arrayOfj[31] = E;
    arrayOfj[32] = F;
    arrayOfj[33] = G;
    arrayOfj[34] = H;
    arrayOfj[35] = I;
    arrayOfj[36] = J;
    arrayOfj[37] = K;
    arrayOfj[38] = L;
    arrayOfj[39] = M;
    arrayOfj[40] = N;
    arrayOfj[41] = O;
    arrayOfj[42] = P;
    arrayOfj[43] = Q;
    arrayOfj[44] = R;
    arrayOfj[45] = S;
    arrayOfj[46] = T;
    arrayOfj[47] = U;
    arrayOfj[48] = V;
    arrayOfj[49] = W;
    arrayOfj[50] = X;
    arrayOfj[51] = Y;
    arrayOfj[52] = Z;
    arrayOfj[53] = aa;
    arrayOfj[54] = ab;
    arrayOfj[55] = ac;
    arrayOfj[56] = ad;
    arrayOfj[57] = ae;
    arrayOfj[58] = af;
  }

  private j(String arg3)
  {
    String str;
    this.ah = ("android:" + str);
  }

  public final String toString()
  {
    return this.ah;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.service.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
