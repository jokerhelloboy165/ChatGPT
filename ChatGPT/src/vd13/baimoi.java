package vd13;
import java.util.Scanner;

class baimoi {

	String masv;
	String hoten;
	int namsinh;
	
	baimoi(){
		
	}
	baimoi(String masv, String hoten, int ns){
		this.masv = masv;
		this.hoten = hoten;
		this.namsinh = ns;
	}
	public void NhapTT() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma sv: ");
		masv = sc.nextLine();
		System.out.print("Nhap ho ten: ");
		hoten = sc.nextLine();
		System.out.print("Nhap nam sinh: ");
		namsinh = sc.nextInt();
	}
	public void NhapTT(baimoi bm) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma sv: ");
		bm.masv = sc.nextLine();
		System.out.print("Nhap dia chi: ");
		bm.hoten = sc.nextLine();
		System.out.print("Nhap nam sinh: ");
		bm.namsinh = sc.nextInt();
	}
	public void hienthiTT() {
		System.out.println("Ma sv: " + masv);
		System.out.println("Ho ten: " + hoten);
		System.out.println("Nam sinh: " + namsinh);
	}

	public static void main(String[] args) {
		

	}
}
