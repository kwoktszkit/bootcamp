public interface FurnitureFactory {

  @Override
  Chair createChair();

  Sofa CreateSofa();

  public static void main(String[] args) {

    int b = 4;
    Sytle style = null;
    if (b < 10) {
      style = Style.MODERN;
    } else if (b < 10) {
      style = style.VICTORIAN;
    }

    FurnitureFactory factory = FurnitureFactory.createFactory
  }

  static FurnitureFactory createFactory(Style style){
    FurnitureFactory factory = switch (style){
      case MORDERN ->new Modern
    }
  }

}
