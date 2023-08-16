package linkedlist1;

public class Linkedlist1 {
  String str;
  Linkedlist1 node;

  public Linkedlist1(String str) {
    this.str = str;
  }

  public void setStr(String str) {
    this.str = str;
  }

  public void setNoder(Linkedlist1 node) {
    this.node = node;
  }

  public Linkedlist1 getStr() {
    return this.str;
  }

  public Linkedlist1 getNode() {
    return this.node;
  }

  public static void main(String[] args) {
    Linkedlist1 ll = new Linkedlist1();
    ll.setStr("head");
    ll setNode(new Linkedlist1("body"));

    ll.getNode().setNode(new Linkedlist1("tail"));

    linkedlist1 head = ll;
    String strings = "";
    while (head.getNode() !=null){
      strings += head.getStr();
head = head.geNode();
    }
  }

}
