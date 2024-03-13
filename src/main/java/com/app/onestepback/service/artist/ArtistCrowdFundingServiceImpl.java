package com.app.onestepback.service.artist;

import com.app.onestepback.domain.dto.CrowdFundingDTO;
import com.app.onestepback.domain.dto.FundingRequestDTO;
import com.app.onestepback.domain.vo.CrowdFundingVO;
import com.app.onestepback.domain.vo.FundingRequestVO;
import com.app.onestepback.domain.vo.Pagination;
import com.app.onestepback.repository.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class ArtistCrowdFundingServiceImpl implements ArtistCrowdFundingService {
    private final ArtistDAO artistDAO;
    private final ArtistCrowdFundingDAO artistCrowdFundingDAO;

    //    멤버아이디로 조회된 크라우드 펀딩의 갯수
    @Override
    public int getCountOfCF(Long memberId) {
        return artistCrowdFundingDAO.getCountOfCF(memberId);
    }

    //    크라우드 펀딩 리스트 출력 (페이지네이션)
    @Override
    public List<CrowdFundingDTO> getAllCrowdFundings(Long memberId, Pagination pagination) {
        return artistCrowdFundingDAO.getAllCrowdFundings(memberId, pagination);
    }

    //    크라우드 펀딩 객체 조회
    @Override
    public Optional<CrowdFundingDTO> getCrowdFunding(Long memberId) {
        return artistCrowdFundingDAO.getCrowdFunding(memberId);
    }

    //    멤버아이디로 조회된 펀딩 요청의 갯수
    @Override
    public int getCountOfFR(Long memberId) {
        return artistCrowdFundingDAO.getCountOfFR(memberId);
    }

    //    펀딩 요청 리스트 출력 (페이지네이션)
    @Override
    public List<FundingRequestDTO> getAllRequests(Long memberId, Pagination pagination) {
        return artistCrowdFundingDAO.getAllRequests(memberId, pagination);
    }

    //    펀딩 요청 객체 조회
    @Override
    public Optional<FundingRequestDTO> getRequest(Long memberId) {
        return artistCrowdFundingDAO.getRequest(memberId);
    }

    //    크라우드 펀딩 요청 작성
    @Override
    public void requestFunding(FundingRequestVO fundingRequestVO) {
        artistCrowdFundingDAO.requestFunding(fundingRequestVO);
    }

    //    크라우드 펀딩 수락
    @Override
    public void acceptCrowdFundingRequest(CrowdFundingVO crowdFundingVO) {
        //    crowdFundingVO에 FundingRequest의 id 값을 담은채로 넘겨옴
        //    매퍼에서는 SEQ_CROWDFUNDING.NEXTVAL로 새로운 id를 부여하기 때문에 잘못된 id 사용 없음.
        artistCrowdFundingDAO.acceptCrowdFundingRequest(crowdFundingVO);
        //    펀딩 요청 테이블 수정 - 담아온 id 값을 사용
        acceptFundingRequest(crowdFundingVO.getId());
    }

    //    크라우드 펀딩 수락시 펀딩 요청 테이블 수정
    @Override
    public void acceptFundingRequest(Long id) {
        artistCrowdFundingDAO.acceptFundingRequest(id);
    }

    //    크라우드 펀딩 거절
    @Override
    public void rejectFundingRequest(Long id) {
        artistCrowdFundingDAO.rejectFundingRequest(id);
    }

    //    크라우드 펀딩 기간 만료
    @Override
    public void endCrowdFunding(Long id) {
        artistCrowdFundingDAO.endCrowdFunding(id);
    }
}
