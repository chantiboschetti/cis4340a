//Rule 09. Locking (LCK)
//LCK02-J. Do not synchronize on the class object returned by getClass()
//compliant solution below:
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
