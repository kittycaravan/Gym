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
		//todo
		//기존 회원 중 마지막 번호 찾기
		int newNum = getLastNum(members);
		//회원번호 생성
		newNum++;
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
