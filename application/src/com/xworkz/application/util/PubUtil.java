package com.xworkz.application.util;
import com.xworkz.application.dto.PubDto;

public class PubUtil {
	public static boolean checkDuplicate(PubDto[] pubDto, PubDto dto) {
			for (PubDto pub : pubDto) {
				if (pub != null && pub.equals(dto)) {
					return true;
				}
			}
			return false;

		}
	}

