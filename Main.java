//Partner: Ayaan Ajmal

class Main {
  public static void main(String[] args) {
    Sugar tree = new Sugar();
    tree.setShape("tree");
  String cookieShape = tree.getShape();
  tree.cutCookie(cookieShape,10);
  tree.bake(350,12);
  tree.decorated();
  
  Sugar aCookie = new Sugar();
  aCookie.decorated();
  
  }
}