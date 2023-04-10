package vd13;
import java.util.Scanner;

public class Nguoi {

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
	
	public static void main(String[] args) {
		Nguoi ng = new Nguoi();
		ng.NhapTT();
		ng.hienthiTT();

	}

}
