package vd13;

import java.util.Scanner;

public class nhanvien extends Nguoi{
	String chuyenmon;
	int luong;
	public nhanvien(String chuyenmon, int luong) {
		super();
		this.chuyenmon = chuyenmon;
		this.luong = luong;
	}
	nhanvien(){
		
	}
	public nhanvien(String hoten, String diachi, int namsinh) {
		super(hoten, diachi, namsinh);
	}
	public void nhapTT() {
		super.NhapTT();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chuyen mon: ");
		chuyenmon = sc.nextLine();
		System.out.print("Nhap tong luong: ");
		luong = sc.nextInt();
	}
	public void hienthi() {
		super.hienthiTT();
		System.out.print("Nhap chuyen mon: " + chuyenmon);
		System.out.print("Nhap tong luon: " + luong);
	}

	public static void main(String[] args) {
		nhanvien nv = new nhanvien();
		nv.NhapTT();
		nv.hienthiTT();
	}

}
