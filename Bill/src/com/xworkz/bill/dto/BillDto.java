package com.xworkz.bill.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.TimeZone;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString

public class BillDto {
	private boolean isBillGenerated;
    private LocalDateTime dateTime;
    private String name;
    private String billType;
    private int amount;
    private String gstType;
    private double gstPercentage;
    private LocalDate payDate;
	
}


