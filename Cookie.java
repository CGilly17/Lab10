class Cookie {
  private int cookieNum;
  private double bakeTime;
  private int bakeTemp;
  private boolean isBaked;

Cookie(){
  cookieNum = 0;
  bakeTime = 0;
  bakeTemp = 0;
  isBaked = false;

}
Cookie(int aCookieNum, double aBakeTime, int aBakeTemp, boolean aIsBaked) {
  cookieNum = aCookieNum;
  bakeTime = aBakeTime;
  bakeTemp = aBakeTemp;
  isBaked = false;

}
boolean baked(){
return isBaked;

}
void setNum(int theNum){
cookieNum = theNum;
}

void bake(int theBakeTemp, double theBakeTime){
  bakeTemp = theBakeTemp;
  bakeTime = theBakeTime;
  System.out.println(cookieNum + " cookies were baked at " + bakeTemp + " degrees F for "+ bakeTime + " minutes.");
  isBaked = true;
}

}