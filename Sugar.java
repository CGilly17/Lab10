class Sugar extends Cookie{

String cookieShape;
boolean isDecorated;

Sugar(){
  cookieShape = "";
  isDecorated = false;
}
Sugar(String theCookieShape, boolean isDecorated){
  cookieShape = theCookieShape;
  isDecorated = false;
}
String getShape(){
  return cookieShape;
}
void setShape(String theCookieShape){
  cookieShape = theCookieShape;
}
void cutCookie(String theCookieShape, int theCookieNum){
cookieShape = theCookieShape;
setNum(theCookieNum);
System.out.println(theCookieNum + " cookies were cut into " + cookieShape + ".");
}
void decorated(){
  boolean cookieBaked = baked();
  if (cookieBaked == true){
    System.out.println("The cookies were decorated.");

  }
  else{
    System.out.println("Make sure to bake the cookies first!");
  }
}

}