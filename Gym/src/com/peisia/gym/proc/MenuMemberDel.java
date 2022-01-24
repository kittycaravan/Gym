package com.peisia.gym.proc;

import java.util.ArrayList;
import java.util.Scanner;

import com.peisia.gym.data.Member;

public class MenuMemberDel {
	
	public void proc(ArrayList<Member> members) {
		System.out.println("삭제할 회원 번호를 입력: (x:취소)");
		Scanner sc = new Scanner(System.in);
		String delNum = sc.next();
		if(delNum.equals("x")) {
			System.out.println("취소되었습니다.");
			return;
		}
		int delIndex = -1;
		
		//검색
		for(int i=0;i<members.size();i++) {
			if(members.get(i).getNum() == Integer.parseInt(delNum)) {
				delIndex = i;
				break;
			}
		}				
		
		if(delIndex == -1) {
			System.out.println("없는 회원 번호입니다.");
		} else {
			members.remove(delIndex);	// 삭제
			System.out.println(delNum + " 회원 정보가 삭제되었습니다.");
		}		
	}

}
