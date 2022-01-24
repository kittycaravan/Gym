package com.peisia.gym.proc;

import java.util.ArrayList;
import java.util.Scanner;

import com.peisia.gym.data.Member;

public class MenuMemberReg {
	public void proc(ArrayList<Member> members) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------- 회원정보 입력 ---------");
		String name;
		String tel;
		String sex;
		System.out.print("이름 입력 (x:취소) :");
		name = sc.next();
		if(name.equals("x")) {
			System.out.println("취소되었습니다.");
			return;
		}		
		
		System.out.print("전번 입력 (x:취소) :");
		tel = sc.next();
		if(tel.equals("x")) {
			System.out.println("취소되었습니다.");
			return;
		}		
		System.out.print("성 입력 (x:취소) :");
		sex = sc.next();
		if(sex.equals("x")) {
			System.out.println("취소되었습니다.");
			return;
		}				
		System.out.println("회원 정보가 추가 등록 되었습니다.");
		int newNum = getLastNum(members);	//기존 회원 중 마지막 번호 찾기
		newNum++;	//회원번호 생성
		System.out.println("새 회원 번호를 생성하였습니다:"+newNum);
		members.add(new Member(newNum, name,tel,sex));		
	}
	private int getLastNum(ArrayList<Member> members) {
		int lastNum = -1;
		int tempNum = -1;
		for(int i=0;i<members.size();i++) {
			tempNum = members.get(i).getNum();
			if(lastNum < tempNum) {
				lastNum = tempNum;
			}
		}
		return lastNum;
	}
}