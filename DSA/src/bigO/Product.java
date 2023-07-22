package bigO;

import java.time.LocalDate;

public class Product {
    private String name;
    private String desc;
    private int price;
    private String emi;
    private String  delDate;
    private String del;

    public Product(String name, String desc, int price, String emi, String  delDate, String del) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.emi = emi;
        this.delDate = delDate;
        this.del = del;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getEmi() {
        return emi;
    }

    public void setEmi(String emi) {
        this.emi = emi;
    }

    public String getDelDate() {
        return delDate;
    }

    public void setDelDate(String delDate) {
        this.delDate = delDate;
    }

    public String getDel() {
        return del;
    }

    public void setDel(String del) {
        this.del = del;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                ", emi='" + emi + '\'' +
                ", delDate='" + delDate + '\'' +
                ", del='" + del + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Product p=new Product("OnePlus Nord 3 5G","Tempest Gray,8GB RA128 GB Storage",33999,"Save extra with No COst EMI","Get it by tomorrow ,21 July","FREE Selivery by Amazon");
        System.out.println(p);

    }
}
