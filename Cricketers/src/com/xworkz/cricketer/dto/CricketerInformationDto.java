package com.xworkz.cricketer.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class CricketerInformationDto {
private String playerName;
private String playGroundLocation;
private String score;
private LocalDateTime matchTiming;
private int noOfPlayers;
}
