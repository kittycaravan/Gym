package com.peisia.gym;

import java.util.ArrayList;
import java.util.Scanner;

import com.peisia.gym.data.Member;
import com.peisia.gym.display.Title;
import com.peisia.gym.proc.MenuExit;
import com.peisia.gym.proc.MenuMemberDel;
import com.peisia.gym.proc.MenuMemberEdit;
import com.peisia.gym.proc.MenuMemberList;
import com.peisia.gym.proc.MenuMemberReg;

public class Gym {
	public static final String VERSION = "v0.2.0";
	
	void proc() {
		// 회원정보 입력
		ArrayList<Member> members = new ArrayList<Member>();
		members.add(new Member(1,"홍길동", "010-1234-5678", "남자"));
		members.add(new Member(2,"이순신", "010-1234-5678", "남자"));
		members.add(new Member(7,"이성계", "010-1234-5678", "남자"));

		System.out.println(Title.TITLE);

		Scanner sc = new Scanner(System.in);
		boolean isNotEnd = true;
		while (isNotEnd) {
			System.out.print("명령을 입력: (1.회원 추가 / 2.회원목록 보기 / 3.회원삭제 / 4.회원수정 / e.프로그램 종료)");
			String cmd = sc.next();
			switch (cmd) {
			case "1": // 회원등록
				MenuMemberReg menuMemberReg = new MenuMemberReg();
				menuMemberReg.proc(members);
				break;
			case "2": // 회원목록
				MenuMemberList menuMemberList = new MenuMemberList();
				menuMemberList.proc(members);				
				break;
			case "3": // 회원삭제
				MenuMemberDel menuMemberDel = new MenuMemberDel();
				menuMemberDel.proc(members);	
				break;
			case "4": // 회원수정
				MenuMemberEdit menuMemberEdit = new MenuMemberEdit();
				menuMemberEdit.proc(members);	
				break;
			case "e": // 프로그램 종료
				MenuExit menuExit = new MenuExit();
				menuExit.proc();	
				
				isNotEnd = false;	// 종료를 위한 변수 전달
				break;
			default:
				System.out.println("잘못된 명령입니다.");
				break;
			}
		}		
	}
}
