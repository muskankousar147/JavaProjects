package com.xworkz.application.service;
import com.xworkz.application.dto.PubDto;
import com.xworkz.application.util.PubUtil;


public class Pubs {

	private PubDto pubDto[]=new PubDto[3];
	private int index;
	public String onSave(PubDto dto) {
		if(dto==null) {
			return "notsaved";
		}else {
			boolean duplicateres=PubUtil.checkDuplicate(pubDto, dto);
			System.out.println(duplicateres);
			if(duplicateres==false) {
				if(this.index<pubDto.length) {
					pubDto[index]=dto;
					 index++;
					 return"Saved";
				}
			}
		}
		
		return "not saved";

	}
}



