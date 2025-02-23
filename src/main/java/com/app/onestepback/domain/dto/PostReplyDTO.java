package com.app.onestepback.domain.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class PostReplyDTO {
    //    리플라이 id
    private Long id;
    //    게시글 번호
    private Long postId;
    //    회원 번호
    private Long memberId;
    //    댓글 내용
    private String replyContent;
    //    댓글 작성 시간
    private String replyWriteTime;
    //    댓글 수정 시간
    private String replyUpdateTime;


    //    회원 이메일
    private String memberEmail;
    //    비밀번호
    private String memberPassword;
    //    회원 닉네임
    private String memberNickname;
    //    카카오 프로필 사진
    private String memberKakaoProfileUrl;
    //    프로필 사진 이름
    private String memberProfileName;
    //    프로필 사진 경로
    private String memberProfilePath;
    //    회원소개
    private String memberIntroduction;
    //    총 결제 금액, 디폴트 = 0
    private Long memberPaymentTotal;
    //    가입 일자
    private String memberCreateTime;
    //    회원 정보 수정 일자
    private String memberUpdateTime;
    //    회원 상태, (디폴트) 활동 중 - ACTIVE / 회원 탈퇴를 했을 시 - DISABLE / 정지 되었을 시 - BLOCKED
    private String memberStatus;

    private boolean isItEnd;
}
