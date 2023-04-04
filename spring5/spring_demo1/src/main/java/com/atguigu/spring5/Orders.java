package com.atguigu.spring5;

public class Orders {
    // 属性
    private String oname;
    private String address;

    //有参构造器
    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }
    public void testPrint(){
        System.out.println("oname = " + oname);
        System.out.println("address = " + address);
    }
}
