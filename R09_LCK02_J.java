class Base {
  static DateFormat format =
      DateFormat.getDateInstance(DateFormat.MEDIUM);
 
  public Date parse(String str) throws ParseException {
    synchronized (Base.class) {
      return format.parse(str);
    }
  }
}
 
// ...
