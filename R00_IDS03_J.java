//Rule 00. Input Validation and Data Sanitization (IDS)
//IDS03-J. Do not log unsanitized user input
//Compliant Solution below:
public String sanitizeUser(String username) {
  return Pattern.matches("[A-Za-z0-9_]+", username))
      ? username : "unauthorized user";
}
