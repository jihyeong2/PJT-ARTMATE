package com.ssafy.artmate.service;

import java.util.List;

import com.ssafy.artmate.dto.SignalDto;

public interface SignalService {
	boolean insertSignal(SignalDto signal);// 알림 전송
	boolean deleteSignal(int id);// 알림 삭제
	boolean modifySignal(int id);// 알림 확인
	List<SignalDto> selectAllSignal(String getUserId);// 알림 목록 가져오기
	int countNewSignal(String userId); //확인 안한 알림 갯수 반환
	List<SignalDto> selectExhibitSignal(String getUserId);// 전시회 알림 목록 가져오기
	List<SignalDto> selectFeedSignal(String getUserId);// 피드 알림 목록 가져오기
}
