/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Product {
private String maHH, tenHH;
    private float soLuong, gia1SP;

    Product() {
    }

    Product(String maHH, String tenHH, float soLuong, float gia1SP) {
        this.maHH = maHH;
        this.tenHH = tenHH;
        this.soLuong = soLuong;
        this.gia1SP = gia1SP;
    }

    public String getMaHH() {
        return maHH;
    }

    public String getTenHH() {
        return tenHH;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public float getGia1SP() {
        return gia1SP;
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public void setGia1SP(float gia1SP) {
        this.gia1SP = gia1SP;
    }

    public void input(String maHH, String tenHH, float soLuong, float gia1SP) {
        this.maHH = maHH;
        this.tenHH = tenHH;
        this.soLuong = soLuong;
        this.gia1SP = gia1SP;
    }

    public void display() {
        System.out.println("Ma hang hoa : " + maHH);
        System.out.println("Ten hang hoa : " + tenHH);
        System.out.println("So luong : " + soLuong);
        System.out.println("Gia 1 san pham : " + gia1SP);
    }
    public static void main(String[] args) {
       ArrayList<Product> arr = new ArrayList();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1.Nhap thong tin hang hoa ");
            System.out.println("2.Xem thong tin hang hoa");
            System.out.println("3.Xem thong tin hang hoa co gia ban cao nhat ");
            System.out.println("4.Thoat ");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhap ma hang hoa");
                    String ma = input.nextLine();
                    System.out.println("Nhap ten hang hoa");
                    String ten = input.nextLine();
                    System.out.println("Nhap so luong hang hoa");
                    float soluong = Float.parseFloat(input.nextLine());
                    System.out.println("Nhap gia 1 san pham");
                    float gia = Float.parseFloat(input.nextLine());
                    Product product = new Product(ma, ten, soluong, gia);
                    arr.add(product);
                    break;
                case 2:

                    for (int i = 0; i < arr.size(); i++) {
                        arr.get(i).display();
                        System.out.println("..........");
                    }
                    break;
                case 3:
                     System.out.println("San pham co gia cao nhat : ");
                    Product productmax = new Product();
                    for (int i = 0; i < arr.size(); i++) {
                        for (int j = 0; j < arr.size(); j++) {
                            if (arr.get(i).gia1SP < arr.get(j).gia1SP) {
                                productmax = arr.get(j);
                            }
                        }
                    }
                   productmax.display();
                    break;
                case 4:
                   return;
            }
        }

    }
}