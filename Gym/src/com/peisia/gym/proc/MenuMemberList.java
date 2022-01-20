package com.peisia.gym.proc;

import java.util.ArrayList;

import com.peisia.gym.data.Member;

public class MenuMemberList {
	public void proc(ArrayList<Member> members) {
		for (Member m : members) {
			m.info();
		}		
	}
}
