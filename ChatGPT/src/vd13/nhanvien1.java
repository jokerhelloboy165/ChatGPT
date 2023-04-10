package vd13;

import java.util.Scanner;

class Nguoi {

	String hoten;
	String diachi;
	int namsinh;
	
	Nguoi(){
		
	}
	Nguoi(String hoten, String diachi, int ns){
		this.hoten = hoten;
		this.diachi = diachi;
		this.namsinh = ns;
	}
	public void NhapTT() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		hoten = sc.nextLine();
		System.out.print("Nhap dia chi: ");
		diachi = sc.nextLine();
		System.out.print("Nhap nam sinh: ");
		namsinh = sc.nextInt();
	}
	public void NhapTT(Nguoi ng) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		ng.hoten = sc.nextLine();
		System.out.print("Nhap dia chi: ");
		ng.diachi = sc.nextLine();
		System.out.print("Nhap nam sinh: ");
		ng.namsinh = sc.nextInt();
	}
	public void hienthiTT() {
		System.out.println("Ho ten: " + hoten);
		System.out.println("Dia chi: " + diachi);
		System.out.println("Nam sinh: " + namsinh);
	}
}
public class nhanvien1 extends Nguoi{
	String chuyenmon;
	int luong;
	public nhanvien1(String chuyenmon, int luong) {
		super();
		this.chuyenmon = chuyenmon;
		this.luong = luong;
	}
	nhanvien1(){
		
	}
	public nhanvien1(String hoten, String diachi, int namsinh) {
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
		nv.nhapTT();
		nv.hienthi();
	}

}

