public class GetSet_Car {
  private String model;
  private String color;
  private int price;

  public GetSet_Car(String model, String color, int price) {
    this.model = model;
    this.color = color;
    setPrice(price); // validate price in constructor too
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    if (price < 0) {
      System.out.println("Price cannot be negative. Setting price to 0.");
      this.price = 0;
    } else {
      this.price = price;
    }
  }
}