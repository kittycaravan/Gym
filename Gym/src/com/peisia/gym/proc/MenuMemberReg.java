package com.peisia.gym.proc;

import java.util.ArrayList;
import java.util.Scanner;

import com.peisia.gym.data.Member;

public class MenuMemberReg {
	
	public void proc(ArrayList<Member> members) {
		System.out.println("-------- 회원정보 입력 ---------");
		String name;
		String tel;
		String sex;
		//todo
		//이름 입력
		System.out.print("이름 입력:");
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		//이름 입력
		System.out.print("전번 입력:");
		tel = sc.next();
		//이름 입력
		System.out.print("성 입력:");
		sex = sc.next();
		System.out.println("회원 정보가 추가 등록 되었습니다.");
		members.add(new Member(name,tel,sex));		
	}

}
