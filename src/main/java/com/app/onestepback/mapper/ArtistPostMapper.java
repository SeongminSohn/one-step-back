package com.app.onestepback.mapper;

import com.app.onestepback.domain.ArtistPostDTO;
import com.app.onestepback.domain.Pagination;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArtistPostMapper {
//    멤버아이디로 조회된 포스트의 갯수
    public int selectCountOfPost(Long memberId);

//    아티스트 홈페이지에서 사용될 작성시간 기준 3개의 포스트
    public List<ArtistPostDTO> select3Posts(Long memberId);

//    포스트 리스트 출력 (페이지네이션)
    public List<ArtistPostDTO> selectAll(Long memberId, Pagination pagination);
}
