package com.atguigu.java;

/**
 * @description: 商品类
 * @author: Youcheng_Zong
 * @email: 917940234@qq.com
 * @date: 2021-10-03 11:08
 * @version: v1.0
 */
public class Goods implements Comparable{

    private String name;
    private double price;

    public Goods() {
    }

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    //指明商品比较大小的方式：按照价格从低到高排序,同价格再按照产品名称从低到高排序
    @Override
    public int compareTo(Object o) {
        if(o instanceof Goods){
            Goods goods = (Goods)o;
            //方式一
            if(this.price > goods.price){
                return 1;
            }else if(this.price < goods.price){
                return -1;
            }else{
//                return 0;
                return this.name.compareTo(goods.name);//this前加个负号表示从高到低，默认从低到高
            }
            //方式二（其实就是包装好的方式一）
//            return Double.compare(this.price,goods.price);
        }
        throw new RuntimeException("传入的数据类型不一致");
    }
}
