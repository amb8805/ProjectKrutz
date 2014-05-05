import java.util.regex.Pattern;

public final class ag
{
  public static final Pattern a = Pattern.compile("\\b(([\\w-]+://?|www[.])[^\\s()<>]+(?:\\([\\w\\d]+\\)|([^[:punct:]\\s]|/)))");
  public static final Pattern b = Pattern.compile("\\b(([hH][tT][tT][pP][sS]?://?)[^\\s()<>]+(?:\\([\\w\\d]+\\)|([^[:punct:]\\s]|/)))");
  public static final Pattern c = Pattern.compile("[@#]\\w+");
  public static final Pattern d = Pattern.compile("((\\s\\s+)|\\n|\\r)");
  public static final Pattern e = Pattern.compile("^https?://twitter\\.com(/#!)?/\\w+/status/\\d+$");
  public static final Pattern f = Pattern.compile("\\b([a-zA-Z])+([a-zA-Z0-9_-])*");
  public static final Pattern g = Pattern.compile("\\A@?\\w+\\z");
  public static final Pattern h = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{1,25})+");
  public static final Pattern i = Pattern.compile("\\w{1,15}");

  private ag()
  {
  }
}

/* Location:
 * Qualified Name:     ag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
